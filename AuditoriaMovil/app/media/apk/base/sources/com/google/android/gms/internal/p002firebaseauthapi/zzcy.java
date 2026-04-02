package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdc;
import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcy  reason: invalid package */
/* loaded from: classes.dex */
public final class zzcy {
    private static final zzoy<zzcx, zzbe> zza = zzoy.zza(new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdb
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
        public final Object zza(zzbo zzboVar) {
            return zzyn.zza((zzcx) zzboVar);
        }
    }, zzcx.class, zzbe.class);
    private static final zzbn<zzbe> zzb = zznl.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzbe.class, zzwb.zza.SYMMETRIC, zzsj.zzf());
    private static final zzog<zzdc> zzc = new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzda
    };
    private static final zzoe<zzdc> zzd = new zzoe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdd
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoe
        public final zzbo zza(zzcg zzcgVar, Integer num) {
            return zzcy.zza((zzdc) zzcgVar, num);
        }
    };
    private static final zzij.zza zze = zzij.zza.zzb;

    public static zzcx zza(zzdc zzdcVar, Integer num) {
        if (zzdcVar.zzb() != 16 && zzdcVar.zzb() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
        return zzcx.zzb().zza(zzdcVar).zza(num).zza(zzzo.zza(zzdcVar.zzb())).zzb(zzzo.zza(zzdcVar.zzc())).zza();
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public static void zza(boolean z7) {
        zzij.zza zzaVar = zze;
        if (zzaVar.zza()) {
            zzga.zza();
            zzon.zza().zza(zza);
            zzok zza2 = zzok.zza();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_CTR_HMAC_SHA256", zzfg.zze);
            zzdc.zzb zzc2 = zzdc.zzf().zza(16).zzb(32).zzd(16).zzc(16);
            zzdc.zza zzaVar2 = zzdc.zza.zzc;
            zzdc.zzb zza3 = zzc2.zza(zzaVar2);
            zzdc.zzc zzcVar = zzdc.zzc.zzc;
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zza3.zza(zzcVar).zza());
            hashMap.put("AES256_CTR_HMAC_SHA256", zzfg.zzf);
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzdc.zzf().zza(32).zzb(32).zzd(32).zzc(16).zza(zzaVar2).zza(zzcVar).zza());
            zza2.zza(DesugarCollections.unmodifiableMap(hashMap));
            zzoh.zza().zza(zzc, zzdc.class);
            zzoc.zza().zza(zzd, zzdc.class);
            zzna.zza().zza((zzbn) zzb, zzaVar, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
