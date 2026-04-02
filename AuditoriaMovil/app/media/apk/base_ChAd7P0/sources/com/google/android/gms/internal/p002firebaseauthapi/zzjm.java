package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdc;
import com.google.android.gms.internal.p002firebaseauthapi.zzdr;
import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import com.google.android.gms.internal.p002firebaseauthapi.zzjq;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjm  reason: invalid package */
/* loaded from: classes.dex */
public final class zzjm {
    private static final zzoy<zzjt, zzbj> zza = zzoy.zza(new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjl
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
        public final Object zza(zzbo zzboVar) {
            return zzye.zza((zzjt) zzboVar);
        }
    }, zzjt.class, zzbj.class);
    private static final zzoy<zzjs, zzbm> zzb = zzoy.zza(new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjo
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
        public final Object zza(zzbo zzboVar) {
            return zzyh.zza((zzjs) zzboVar);
        }
    }, zzjs.class, zzbm.class);
    private static final zzci<zzbj> zzc = zznl.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", zzbj.class, zzun.zzf());
    private static final zzbn<zzbm> zzd = zznl.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzbm.class, zzwb.zza.ASYMMETRIC_PUBLIC, zzuq.zzh());
    private static final zzoe<zzjq> zze = new zzoe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjn
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoe
        public final zzbo zza(zzcg zzcgVar, Integer num) {
            return zzjm.zza((zzjq) zzcgVar, num);
        }
    };

    public static /* synthetic */ zzjt zza(zzjq zzjqVar, Integer num) {
        ECParameterSpec eCParameterSpec;
        zzjq.zza zzd2 = zzjqVar.zzd();
        if (zzd2 == zzjq.zza.zza) {
            eCParameterSpec = zzmt.zza;
        } else if (zzd2 == zzjq.zza.zzb) {
            eCParameterSpec = zzmt.zzb;
        } else if (zzd2 == zzjq.zza.zzc) {
            eCParameterSpec = zzmt.zzc;
        } else {
            throw new GeneralSecurityException("Unsupported curve type: ".concat(String.valueOf(zzd2)));
        }
        KeyPair zza2 = zzyi.zza(eCParameterSpec);
        return zzjt.zza(zzjs.zza(zzjqVar, ((ECPublicKey) zza2.getPublic()).getW(), num), zzzm.zza(((ECPrivateKey) zza2.getPrivate()).getS(), zzbl.zza()));
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public static void zza(boolean z7) {
        if (zzij.zza.zza.zza()) {
            zzld.zza();
            zzok zza2 = zzok.zza();
            HashMap hashMap = new HashMap();
            zzjq.zzb zzc2 = zzjq.zzc();
            zzjq.zza zzaVar = zzjq.zza.zza;
            zzjq.zzb zza3 = zzc2.zza(zzaVar);
            zzjq.zzd zzdVar = zzjq.zzd.zzc;
            zzjq.zzb zza4 = zza3.zza(zzdVar);
            zzjq.zzc zzcVar = zzjq.zzc.zzb;
            zzjq.zzb zza5 = zza4.zza(zzcVar);
            zzjq.zze zzeVar = zzjq.zze.zza;
            zzjq.zzb zza6 = zza5.zza(zzeVar);
            zzdr.zzb zzc3 = zzdr.zze().zza(12).zzb(16).zzc(16);
            zzdr.zza zzaVar2 = zzdr.zza.zzc;
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zza6.zza(zzc3.zza(zzaVar2).zza()).zza());
            zzjq.zzb zza7 = zzjq.zzc().zza(zzaVar).zza(zzdVar).zza(zzcVar);
            zzjq.zze zzeVar2 = zzjq.zze.zzc;
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zza7.zza(zzeVar2).zza(zzdr.zze().zza(12).zzb(16).zzc(16).zza(zzaVar2).zza()).zza());
            zzjq.zzb zza8 = zzjq.zzc().zza(zzaVar).zza(zzdVar);
            zzjq.zzc zzcVar2 = zzjq.zzc.zza;
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zza8.zza(zzcVar2).zza(zzeVar).zza(zzdr.zze().zza(12).zzb(16).zzc(16).zza(zzaVar2).zza()).zza());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzjq.zzc().zza(zzaVar).zza(zzdVar).zza(zzcVar2).zza(zzeVar2).zza(zzdr.zze().zza(12).zzb(16).zzc(16).zza(zzaVar2).zza()).zza());
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzjq.zzc().zza(zzaVar).zza(zzdVar).zza(zzcVar2).zza(zzeVar2).zza(zzdr.zze().zza(12).zzb(16).zzc(16).zza(zzaVar2).zza()).zza());
            zzjq.zzb zza9 = zzjq.zzc().zza(zzaVar).zza(zzdVar).zza(zzcVar).zza(zzeVar);
            zzdc.zzb zzc4 = zzdc.zzf().zza(16).zzb(32).zzd(16).zzc(16);
            zzdc.zza zzaVar3 = zzdc.zza.zzc;
            zzdc.zzb zza10 = zzc4.zza(zzaVar3);
            zzdc.zzc zzcVar3 = zzdc.zzc.zzc;
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zza9.zza(zza10.zza(zzcVar3).zza()).zza());
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzjq.zzc().zza(zzaVar).zza(zzdVar).zza(zzcVar).zza(zzeVar2).zza(zzdc.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzaVar3).zza(zzcVar3).zza()).zza());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzjq.zzc().zza(zzaVar).zza(zzdVar).zza(zzcVar2).zza(zzeVar).zza(zzdc.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzaVar3).zza(zzcVar3).zza()).zza());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzjq.zzc().zza(zzaVar).zza(zzdVar).zza(zzcVar2).zza(zzeVar2).zza(zzdc.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzaVar3).zza(zzcVar3).zza()).zza());
            zza2.zza(DesugarCollections.unmodifiableMap(hashMap));
            zzon.zza().zza(zza);
            zzon.zza().zza(zzb);
            zzoc.zza().zza(zze, zzjq.class);
            zzna.zza().zza((zzbn) zzc, true);
            zzna.zza().zza((zzbn) zzd, false);
            return;
        }
        throw new GeneralSecurityException("Registering ECIES Hybrid Encryption is not supported in FIPS mode");
    }
}
