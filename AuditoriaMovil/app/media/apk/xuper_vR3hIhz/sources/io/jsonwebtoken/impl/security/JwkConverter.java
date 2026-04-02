package io.jsonwebtoken.impl.security;

import io.jsonwebtoken.impl.lang.Converter;
import io.jsonwebtoken.impl.lang.Nameable;
import io.jsonwebtoken.impl.lang.Parameter;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Collections;
import io.jsonwebtoken.lang.Strings;
import io.jsonwebtoken.lang.Supplier;
import io.jsonwebtoken.security.DynamicJwkBuilder;
import io.jsonwebtoken.security.EcPrivateJwk;
import io.jsonwebtoken.security.EcPublicJwk;
import io.jsonwebtoken.security.Jwk;
import io.jsonwebtoken.security.MalformedKeyException;
import io.jsonwebtoken.security.OctetPrivateJwk;
import io.jsonwebtoken.security.OctetPublicJwk;
import io.jsonwebtoken.security.PrivateJwk;
import io.jsonwebtoken.security.PublicJwk;
import io.jsonwebtoken.security.RsaPrivateJwk;
import io.jsonwebtoken.security.RsaPublicJwk;
import io.jsonwebtoken.security.SecretJwk;
import java.util.Map;
/* loaded from: classes3.dex */
public final class JwkConverter<T extends Jwk<?>> implements Converter<T, Object> {
    private final Class<T> desiredType;
    private final Supplier<DynamicJwkBuilder<?, ?>> supplier;
    public static final Class<Jwk<?>> JWK_CLASS = Jwk.class;
    public static final Class<PublicJwk<?>> PUBLIC_JWK_CLASS = PublicJwk.class;
    public static final JwkConverter<Jwk<?>> ANY = new JwkConverter<>(Jwk.class);
    public static final JwkConverter<PublicJwk<?>> PUBLIC_JWK = new JwkConverter<>(PublicJwk.class);

    public JwkConverter(Class<T> cls) {
        this(cls, JwkBuilderSupplier.DEFAULT);
    }

    private static String articleFor(String str) {
        char charAt = str.charAt(0);
        if (charAt != 'E' && charAt != 'R') {
            return "a";
        }
        return "an";
    }

    private static String typeString(Jwk<?> jwk) {
        Assert.isInstanceOf(Nameable.class, jwk, "All JWK implementations must implement Nameable.");
        return ((Nameable) jwk).getName();
    }

    private IllegalArgumentException unexpectedIAE(Jwk<?> jwk) {
        String typeString = typeString((Class<?>) this.desiredType);
        String typeString2 = typeString(jwk);
        return new IllegalArgumentException("Value must be " + articleFor(typeString) + " " + typeString + ", not " + articleFor(typeString2) + " " + typeString2 + ".");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.jsonwebtoken.impl.lang.Converter
    public /* bridge */ /* synthetic */ Object applyTo(Object obj) {
        return applyTo((JwkConverter<T>) ((Jwk) obj));
    }

    public JwkConverter(Supplier<DynamicJwkBuilder<?, ?>> supplier) {
        this(JWK_CLASS, supplier);
    }

    @Override // io.jsonwebtoken.impl.lang.Converter
    public T applyFrom(Object obj) {
        Assert.notNull(obj, "JWK cannot be null.");
        if (this.desiredType.isInstance(obj)) {
            return this.desiredType.cast(obj);
        }
        if (!(obj instanceof Jwk)) {
            if (obj instanceof Map) {
                Map immutable = Collections.immutable((Map) obj);
                Parameter<String> parameter = AbstractJwk.KTY;
                if (!Collections.isEmpty(immutable) && immutable.containsKey(parameter.getId())) {
                    Object obj2 = immutable.get(parameter.getId());
                    if (obj2 != null) {
                        if (obj2 instanceof String) {
                            if (Strings.hasText((String) obj2)) {
                                DynamicJwkBuilder<?, ?> dynamicJwkBuilder = this.supplier.get();
                                for (Map.Entry entry : immutable.entrySet()) {
                                    Object key = entry.getKey();
                                    Assert.notNull(key, "JWK map key cannot be null.");
                                    if (key instanceof String) {
                                        dynamicJwkBuilder.add((String) key, entry.getValue());
                                    } else {
                                        throw new IllegalArgumentException("JWK map keys must be Strings. Encountered key '" + key + "' of type " + key.getClass().getName() + ".");
                                    }
                                }
                                Jwk<?> jwk = (Jwk) dynamicJwkBuilder.build();
                                if (this.desiredType.isInstance(jwk)) {
                                    return this.desiredType.cast(jwk);
                                }
                                throw unexpectedIAE(jwk);
                            }
                            throw new MalformedKeyException("JWK " + parameter + " value cannot be empty.");
                        }
                        throw new MalformedKeyException("JWK " + parameter + " value must be a String. Type found: " + obj2.getClass().getName());
                    }
                    throw new MalformedKeyException("JWK " + parameter + " value cannot be null.");
                }
                throw new MalformedKeyException("JWK is missing required " + parameter + " parameter.");
            }
            throw new IllegalArgumentException("JWK must be a Map<String,?> (JSON Object). Type found: " + obj.getClass().getName() + ".");
        }
        throw unexpectedIAE((Jwk) obj);
    }

    public Object applyTo(T t10) {
        return this.desiredType.cast(t10);
    }

    public JwkConverter(Class<T> cls, Supplier<DynamicJwkBuilder<?, ?>> supplier) {
        this.desiredType = (Class) Assert.notNull(cls, "desiredType cannot be null.");
        this.supplier = (Supplier) Assert.notNull(supplier, "supplier cannot be null.");
    }

    private static String typeString(Class<?> cls) {
        StringBuilder sb = new StringBuilder();
        if (SecretJwk.class.isAssignableFrom(cls)) {
            sb.append("Secret");
        } else if (!RsaPublicJwk.class.isAssignableFrom(cls) && !RsaPrivateJwk.class.isAssignableFrom(cls)) {
            if (!EcPublicJwk.class.isAssignableFrom(cls) && !EcPrivateJwk.class.isAssignableFrom(cls)) {
                if (OctetPublicJwk.class.isAssignableFrom(cls) || OctetPrivateJwk.class.isAssignableFrom(cls)) {
                    sb.append("Edwards Curve");
                }
            } else {
                sb.append("EC");
            }
        } else {
            sb.append("RSA");
        }
        return typeString(sb, cls);
    }

    private static String typeString(StringBuilder sb, Class<?> cls) {
        if (PublicJwk.class.isAssignableFrom(cls)) {
            Strings.nespace(sb).append("Public");
        } else if (PrivateJwk.class.isAssignableFrom(cls)) {
            Strings.nespace(sb).append("Private");
        }
        Strings.nespace(sb).append("JWK");
        return sb.toString();
    }
}
