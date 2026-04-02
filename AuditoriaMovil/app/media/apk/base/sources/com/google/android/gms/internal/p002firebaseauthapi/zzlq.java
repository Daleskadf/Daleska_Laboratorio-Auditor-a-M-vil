package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import com.google.android.gms.internal.p002firebaseauthapi.zzju;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlq  reason: invalid package */
/* loaded from: classes.dex */
public final class zzlq {
    private static final zzoy<zzjx, zzbj> zza = zzoy.zza(new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlt
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
        public final Object zza(zzbo zzboVar) {
            return zzln.zza((zzjx) zzboVar);
        }
    }, zzjx.class, zzbj.class);
    private static final zzoy<zzkf, zzbm> zzb = zzoy.zza(new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzls
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
        public final Object zza(zzbo zzboVar) {
            return zzlm.zza((zzkf) zzboVar);
        }
    }, zzkf.class, zzbm.class);
    private static final zzci<zzbj> zzc = zznl.zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey", zzbj.class, zzvv.zzf());
    private static final zzbn<zzbm> zzd = zznl.zza("type.googleapis.com/google.crypto.tink.HpkePublicKey", zzbm.class, zzwb.zza.ASYMMETRIC_PUBLIC, zzvy.zzg());
    private static final zzoe<zzju> zze = new zzoe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlv
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoe
        public final zzbo zza(zzcg zzcgVar, Integer num) {
            return zzlq.zza((zzju) zzcgVar, num);
        }
    };

    public static /* synthetic */ zzjx zza(zzju zzjuVar, Integer num) {
        byte[] bArr;
        zzzn zza2;
        zzzo zza3;
        if (zzjuVar.zze().equals(zzju.zzd.zzd)) {
            byte[] zza4 = zzzl.zza();
            zza3 = zzzo.zza(zza4, zzbl.zza());
            zza2 = zzzn.zza(zzzl.zza(zza4));
        } else if (!zzjuVar.zze().equals(zzju.zzd.zza) && !zzjuVar.zze().equals(zzju.zzd.zzb) && !zzjuVar.zze().equals(zzju.zzd.zzc)) {
            throw new GeneralSecurityException("Unknown KEM ID");
        } else {
            zzyl zzc2 = zzlu.zzc(zzjuVar.zze());
            KeyPair zza5 = zzyi.zza(zzyi.zza(zzc2));
            zzyk zzykVar = zzyk.UNCOMPRESSED;
            ECPoint w2 = ((ECPublicKey) zza5.getPublic()).getW();
            EllipticCurve curve = zzyi.zza(zzc2).getCurve();
            zzmt.zza(w2, curve);
            int zza6 = zzyi.zza(curve);
            int ordinal = zzykVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    int i7 = zza6 + 1;
                    bArr = new byte[i7];
                    byte[] zza7 = zzmo.zza(w2.getAffineX());
                    System.arraycopy(zza7, 0, bArr, i7 - zza7.length, zza7.length);
                    bArr[0] = (byte) (w2.getAffineY().testBit(0) ? 3 : 2);
                } else if (ordinal == 2) {
                    int i8 = zza6 * 2;
                    bArr = new byte[i8];
                    byte[] zza8 = zzmo.zza(w2.getAffineX());
                    if (zza8.length > zza6) {
                        zza8 = Arrays.copyOfRange(zza8, zza8.length - zza6, zza8.length);
                    }
                    byte[] zza9 = zzmo.zza(w2.getAffineY());
                    if (zza9.length > zza6) {
                        zza9 = Arrays.copyOfRange(zza9, zza9.length - zza6, zza9.length);
                    }
                    System.arraycopy(zza9, 0, bArr, i8 - zza9.length, zza9.length);
                    System.arraycopy(zza8, 0, bArr, zza6 - zza8.length, zza8.length);
                } else {
                    throw new GeneralSecurityException("invalid format:".concat(String.valueOf(zzykVar)));
                }
            } else {
                int i9 = (zza6 * 2) + 1;
                bArr = new byte[i9];
                byte[] zza10 = zzmo.zza(w2.getAffineX());
                byte[] zza11 = zzmo.zza(w2.getAffineY());
                System.arraycopy(zza11, 0, bArr, i9 - zza11.length, zza11.length);
                System.arraycopy(zza10, 0, bArr, (zza6 + 1) - zza10.length, zza10.length);
                bArr[0] = 4;
            }
            zza2 = zzzn.zza(bArr);
            zza3 = zzzo.zza(zzmo.zza(((ECPrivateKey) zza5.getPrivate()).getS(), zzlu.zza(zzjuVar.zze())), zzbl.zza());
        }
        return zzjx.zza(zzkf.zza(zzjuVar, zza2, num), zza3);
    }

    public static void zza(boolean z7) {
        if (zzij.zza.zza.zza()) {
            zzjw.zza();
            zzok zza2 = zzok.zza();
            HashMap hashMap = new HashMap();
            zzju.zzb zzc2 = zzju.zzc();
            zzju.zzf zzfVar = zzju.zzf.zza;
            zzju.zzb zza3 = zzc2.zza(zzfVar);
            zzju.zzd zzdVar = zzju.zzd.zzd;
            zzju.zzb zza4 = zza3.zza(zzdVar);
            zzju.zze zzeVar = zzju.zze.zza;
            zzju.zzb zza5 = zza4.zza(zzeVar);
            zzju.zza zzaVar = zzju.zza.zza;
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zza5.zza(zzaVar).zza());
            zzju.zzb zzc3 = zzju.zzc();
            zzju.zzf zzfVar2 = zzju.zzf.zzc;
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzc3.zza(zzfVar2).zza(zzdVar).zza(zzeVar).zza(zzaVar).zza());
            zzju.zzb zza6 = zzju.zzc().zza(zzfVar).zza(zzdVar).zza(zzeVar);
            zzju.zza zzaVar2 = zzju.zza.zzb;
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zza6.zza(zzaVar2).zza());
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzju.zzc().zza(zzfVar2).zza(zzdVar).zza(zzeVar).zza(zzaVar2).zza());
            zzju.zzb zza7 = zzju.zzc().zza(zzfVar).zza(zzdVar).zza(zzeVar);
            zzju.zza zzaVar3 = zzju.zza.zzc;
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zza7.zza(zzaVar3).zza());
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzju.zzc().zza(zzfVar2).zza(zzdVar).zza(zzeVar).zza(zzaVar3).zza());
            zzju.zzb zza8 = zzju.zzc().zza(zzfVar);
            zzju.zzd zzdVar2 = zzju.zzd.zza;
            hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zza8.zza(zzdVar2).zza(zzeVar).zza(zzaVar).zza());
            hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzju.zzc().zza(zzfVar2).zza(zzdVar2).zza(zzeVar).zza(zzaVar).zza());
            hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzju.zzc().zza(zzfVar).zza(zzdVar2).zza(zzeVar).zza(zzaVar2).zza());
            hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzju.zzc().zza(zzfVar2).zza(zzdVar2).zza(zzeVar).zza(zzaVar2).zza());
            zzju.zzb zza9 = zzju.zzc().zza(zzfVar);
            zzju.zzd zzdVar3 = zzju.zzd.zzb;
            zzju.zzb zza10 = zza9.zza(zzdVar3);
            zzju.zze zzeVar2 = zzju.zze.zzb;
            hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zza10.zza(zzeVar2).zza(zzaVar).zza());
            hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzju.zzc().zza(zzfVar2).zza(zzdVar3).zza(zzeVar2).zza(zzaVar).zza());
            hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzju.zzc().zza(zzfVar).zza(zzdVar3).zza(zzeVar2).zza(zzaVar2).zza());
            hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzju.zzc().zza(zzfVar2).zza(zzdVar3).zza(zzeVar2).zza(zzaVar2).zza());
            zzju.zzb zza11 = zzju.zzc().zza(zzfVar);
            zzju.zzd zzdVar4 = zzju.zzd.zzc;
            zzju.zzb zza12 = zza11.zza(zzdVar4);
            zzju.zze zzeVar3 = zzju.zze.zzc;
            hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zza12.zza(zzeVar3).zza(zzaVar).zza());
            hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzju.zzc().zza(zzfVar2).zza(zzdVar4).zza(zzeVar3).zza(zzaVar).zza());
            hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzju.zzc().zza(zzfVar).zza(zzdVar4).zza(zzeVar3).zza(zzaVar2).zza());
            hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzju.zzc().zza(zzfVar2).zza(zzdVar4).zza(zzeVar3).zza(zzaVar2).zza());
            zza2.zza(DesugarCollections.unmodifiableMap(hashMap));
            zzon.zza().zza(zza);
            zzon.zza().zza(zzb);
            zzoc.zza().zza(zze, zzju.class);
            zzna.zza().zza((zzbn) zzc, true);
            zzna.zza().zza((zzbn) zzd, false);
            return;
        }
        throw new GeneralSecurityException("Registering HPKE Hybrid Encryption is not supported in FIPS mode");
    }
}
