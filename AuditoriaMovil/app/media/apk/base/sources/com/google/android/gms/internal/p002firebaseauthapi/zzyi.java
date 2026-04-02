package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyi  reason: invalid package */
/* loaded from: classes.dex */
public final class zzyi {
    public static int zza(EllipticCurve ellipticCurve) {
        return (zzmt.zza(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    private static BigInteger zza(BigInteger bigInteger, boolean z7, EllipticCurve ellipticCurve) {
        BigInteger zza = zzmt.zza(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(zza);
        if (zza.signum() == 1) {
            BigInteger mod2 = mod.mod(zza);
            BigInteger bigInteger2 = BigInteger.ZERO;
            if (!mod2.equals(bigInteger2)) {
                if (zza.testBit(0) && zza.testBit(1)) {
                    bigInteger2 = mod2.modPow(zza.add(BigInteger.ONE).shiftRight(2), zza);
                } else if (!zza.testBit(0) || zza.testBit(1)) {
                    bigInteger2 = null;
                } else {
                    bigInteger2 = BigInteger.ONE;
                    BigInteger shiftRight = zza.subtract(bigInteger2).shiftRight(1);
                    int i7 = 0;
                    while (true) {
                        BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(zza);
                        if (mod3.equals(BigInteger.ZERO)) {
                            break;
                        }
                        BigInteger modPow = mod3.modPow(shiftRight, zza);
                        BigInteger bigInteger3 = BigInteger.ONE;
                        if (!modPow.add(bigInteger3).equals(zza)) {
                            if (modPow.equals(bigInteger3)) {
                                bigInteger2 = bigInteger2.add(bigInteger3);
                                i7++;
                                if (i7 == 128 && !zza.isProbablePrime(80)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            } else {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        } else {
                            BigInteger shiftRight2 = zza.add(bigInteger3).shiftRight(1);
                            BigInteger bigInteger4 = bigInteger2;
                            for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                BigInteger multiply = bigInteger4.multiply(bigInteger3);
                                bigInteger4 = bigInteger4.multiply(bigInteger4).add(bigInteger3.multiply(bigInteger3).mod(zza).multiply(mod3)).mod(zza);
                                BigInteger mod4 = multiply.add(multiply).mod(zza);
                                if (shiftRight2.testBit(bitLength)) {
                                    BigInteger mod5 = bigInteger4.multiply(bigInteger2).add(mod4.multiply(mod3)).mod(zza);
                                    bigInteger3 = bigInteger2.multiply(mod4).add(bigInteger4).mod(zza);
                                    bigInteger4 = mod5;
                                } else {
                                    bigInteger3 = mod4;
                                }
                            }
                            bigInteger2 = bigInteger4;
                        }
                    }
                }
                if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(zza).compareTo(mod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
            }
            return z7 != bigInteger2.testBit(0) ? zza.subtract(bigInteger2).mod(zza) : bigInteger2;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    public static KeyPair zza(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator zza = zzym.zzd.zza("EC");
        zza.initialize(eCParameterSpec);
        return zza.generateKeyPair();
    }

    public static ECPrivateKey zza(zzyl zzylVar, byte[] bArr) {
        return (ECPrivateKey) zzym.zze.zza("EC").generatePrivate(new ECPrivateKeySpec(zzmo.zza(bArr), zza(zzylVar)));
    }

    public static ECPublicKey zza(ECParameterSpec eCParameterSpec, zzyk zzykVar, byte[] bArr) {
        return (ECPublicKey) zzym.zze.zza("EC").generatePublic(new ECPublicKeySpec(zza(eCParameterSpec.getCurve(), zzykVar, bArr), eCParameterSpec));
    }

    public static ECParameterSpec zza(zzyl zzylVar) {
        int ordinal = zzylVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return zzmt.zzc;
                }
                throw new NoSuchAlgorithmException("curve not implemented:".concat(String.valueOf(zzylVar)));
            }
            return zzmt.zzb;
        }
        return zzmt.zza;
    }

    public static ECPoint zza(EllipticCurve ellipticCurve, zzyk zzykVar, byte[] bArr) {
        int zza = zza(ellipticCurve);
        int ordinal = zzykVar.ordinal();
        boolean z7 = false;
        if (ordinal == 0) {
            if (bArr.length == (zza * 2) + 1) {
                if (bArr[0] == 4) {
                    int i7 = zza + 1;
                    ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i7)), new BigInteger(1, Arrays.copyOfRange(bArr, i7, bArr.length)));
                    zzmt.zza(eCPoint, ellipticCurve);
                    return eCPoint;
                }
                throw new GeneralSecurityException("invalid point format");
            }
            throw new GeneralSecurityException("invalid point size");
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                if (bArr.length == zza * 2) {
                    ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOf(bArr, zza)), new BigInteger(1, Arrays.copyOfRange(bArr, zza, bArr.length)));
                    zzmt.zza(eCPoint2, ellipticCurve);
                    return eCPoint2;
                }
                throw new GeneralSecurityException("invalid point size");
            }
            throw new GeneralSecurityException("invalid format:".concat(String.valueOf(zzykVar)));
        } else {
            BigInteger zza2 = zzmt.zza(ellipticCurve);
            if (bArr.length == zza + 1) {
                byte b5 = bArr[0];
                if (b5 != 2) {
                    if (b5 != 3) {
                        throw new GeneralSecurityException("invalid format");
                    }
                    z7 = true;
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
                if (bigInteger.signum() != -1 && bigInteger.compareTo(zza2) < 0) {
                    return new ECPoint(bigInteger, zza(bigInteger, z7, ellipticCurve));
                }
                throw new GeneralSecurityException("x is out of range");
            }
            throw new GeneralSecurityException("compressed point has wrong length");
        }
    }

    public static byte[] zza(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        try {
            if (zzmt.zza(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                return zza(eCPrivateKey, eCPublicKey.getW());
            }
            throw new GeneralSecurityException("invalid public key spec");
        } catch (IllegalArgumentException | NullPointerException e7) {
            throw new GeneralSecurityException(e7);
        }
    }

    private static byte[] zza(ECPrivateKey eCPrivateKey, ECPoint eCPoint) {
        zzmt.zza(eCPoint, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = zzym.zze.zza("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCPrivateKey.getParams()));
        KeyAgreement zza = zzym.zzc.zza("ECDH");
        zza.init(eCPrivateKey);
        try {
            zza.doPhase(generatePublic, true);
            byte[] generateSecret = zza.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() != -1 && bigInteger.compareTo(zzmt.zza(curve)) < 0) {
                zza(bigInteger, true, curve);
                return generateSecret;
            }
            throw new GeneralSecurityException("shared secret is out of range");
        } catch (IllegalStateException e7) {
            throw new GeneralSecurityException(e7);
        }
    }
}
