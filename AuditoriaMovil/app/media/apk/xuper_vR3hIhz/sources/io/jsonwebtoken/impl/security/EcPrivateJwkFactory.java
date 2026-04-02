package io.jsonwebtoken.impl.security;

import io.jsonwebtoken.impl.lang.CheckedFunction;
import io.jsonwebtoken.impl.lang.RequiredParameterReader;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Strings;
import io.jsonwebtoken.security.EcPrivateJwk;
import io.jsonwebtoken.security.EcPublicJwk;
import io.jsonwebtoken.security.InvalidKeyException;
import io.jsonwebtoken.security.Jwk;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class EcPrivateJwkFactory extends AbstractEcJwkFactory<ECPrivateKey, EcPrivateJwk> {
    private static final String ECPUBKEY_ERR_MSG = "JwkContext publicKey must be an " + ECPublicKey.class.getName() + " instance.";
    private static final EcPublicJwkFactory PUB_FACTORY = EcPublicJwkFactory.INSTANCE;

    public EcPrivateJwkFactory() {
        super(ECPrivateKey.class, DefaultEcPrivateJwk.PARAMS);
    }

    @Override // io.jsonwebtoken.impl.security.AbstractFamilyJwkFactory
    public /* bridge */ /* synthetic */ Jwk createJwkFromKey(JwkContext jwkContext) {
        return createJwkFromKey((JwkContext<ECPrivateKey>) jwkContext);
    }

    @Override // io.jsonwebtoken.impl.security.AbstractFamilyJwkFactory
    public /* bridge */ /* synthetic */ Jwk createJwkFromValues(JwkContext jwkContext) {
        return createJwkFromValues((JwkContext<ECPrivateKey>) jwkContext);
    }

    public ECPublicKey derivePublic(KeyFactory keyFactory, ECPublicKeySpec eCPublicKeySpec) {
        return (ECPublicKey) keyFactory.generatePublic(eCPublicKeySpec);
    }

    @Override // io.jsonwebtoken.impl.security.AbstractFamilyJwkFactory
    public boolean supportsKeyValues(JwkContext<?> jwkContext) {
        if (super.supportsKeyValues(jwkContext) && jwkContext.containsKey(DefaultEcPrivateJwk.D.getId())) {
            return true;
        }
        return false;
    }

    @Override // io.jsonwebtoken.impl.security.AbstractFamilyJwkFactory
    public EcPrivateJwk createJwkFromKey(JwkContext<ECPrivateKey> jwkContext) {
        ECPublicKey derivePublic;
        ECPrivateKey key = jwkContext.getKey();
        PublicKey publicKey = jwkContext.getPublicKey();
        if (publicKey != null) {
            derivePublic = (ECPublicKey) Assert.isInstanceOf(ECPublicKey.class, publicKey, ECPUBKEY_ERR_MSG);
        } else {
            derivePublic = derivePublic(jwkContext);
        }
        boolean z10 = (Strings.hasText(jwkContext.getId()) || jwkContext.getIdThumbprintAlgorithm() == null) ? false : true;
        EcPublicJwkFactory ecPublicJwkFactory = PUB_FACTORY;
        EcPublicJwk ecPublicJwk = (EcPublicJwk) ecPublicJwkFactory.createJwk(ecPublicJwkFactory.newContext(jwkContext, derivePublic));
        jwkContext.putAll(ecPublicJwk);
        if (z10) {
            jwkContext.setId(ecPublicJwk.getId());
        }
        jwkContext.put(DefaultEcPrivateJwk.D.getId(), AbstractEcJwkFactory.toOctetString(key.getParams().getCurve(), key.getS()));
        return new DefaultEcPrivateJwk(jwkContext, ecPublicJwk);
    }

    @Override // io.jsonwebtoken.impl.security.AbstractFamilyJwkFactory
    public EcPrivateJwk createJwkFromValues(JwkContext<ECPrivateKey> jwkContext) {
        RequiredParameterReader requiredParameterReader = new RequiredParameterReader(jwkContext);
        DefaultJwkContext defaultJwkContext = new DefaultJwkContext(DefaultEcPublicJwk.PARAMS, jwkContext);
        final ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec((BigInteger) requiredParameterReader.get(DefaultEcPrivateJwk.D), AbstractEcJwkFactory.getCurveByJwaId((String) requiredParameterReader.get(DefaultEcPublicJwk.CRV)).toParameterSpec());
        jwkContext.setKey((ECPrivateKey) generateKey(jwkContext, new CheckedFunction<KeyFactory, ECPrivateKey>() { // from class: io.jsonwebtoken.impl.security.EcPrivateJwkFactory.2
            @Override // io.jsonwebtoken.impl.lang.CheckedFunction
            public ECPrivateKey apply(KeyFactory keyFactory) {
                return (ECPrivateKey) keyFactory.generatePrivate(eCPrivateKeySpec);
            }
        }));
        return new DefaultEcPrivateJwk(jwkContext, (EcPublicJwk) EcPublicJwkFactory.INSTANCE.createJwk(defaultJwkContext));
    }

    public ECPublicKey derivePublic(JwkContext<ECPrivateKey> jwkContext) {
        final ECPrivateKey key = jwkContext.getKey();
        return (ECPublicKey) generateKey(jwkContext, ECPublicKey.class, new CheckedFunction<KeyFactory, ECPublicKey>() { // from class: io.jsonwebtoken.impl.security.EcPrivateJwkFactory.1
            @Override // io.jsonwebtoken.impl.lang.CheckedFunction
            public ECPublicKey apply(KeyFactory keyFactory) {
                try {
                    return EcPrivateJwkFactory.this.derivePublic(keyFactory, ECCurve.publicKeySpec(key));
                } catch (Exception e10) {
                    throw new InvalidKeyException("Unable to derive ECPublicKey from ECPrivateKey: " + e10.getMessage(), e10);
                }
            }
        });
    }
}
