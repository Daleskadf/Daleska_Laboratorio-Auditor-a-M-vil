package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdk;
import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdg  reason: invalid package */
/* loaded from: classes.dex */
public final class zzdg {
    private static final zzoy<zzdf, zzbe> zza = zzoy.zza(new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdj
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
        public final Object zza(zzbo zzboVar) {
            return zzxw.zza((zzdf) zzboVar);
        }
    }, zzdf.class, zzbe.class);
    private static final zzbn<zzbe> zzb = zznl.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", zzbe.class, zzwb.zza.SYMMETRIC, zzsy.zzf());
    private static final zzoe<zzdk> zzc = new zzoe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdi
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoe
        public final zzbo zza(zzcg zzcgVar, Integer num) {
            return zzdg.zza((zzdk) zzcgVar, num);
        }
    };

    public static /* synthetic */ zzdf zza(zzdk zzdkVar, Integer num) {
        if (zzdkVar.zzc() != 24) {
            return zzdf.zzb().zza(zzdkVar).zza(num).zza(zzzo.zza(zzdkVar.zzc())).zza();
        }
        throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public static void zza(boolean z7) {
        if (zzij.zza.zza.zza()) {
            zzgf.zza();
            zzon.zza().zza(zza);
            zzok zza2 = zzok.zza();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_EAX", zzfg.zzc);
            zzdk.zza zzc2 = zzdk.zze().zza(16).zzb(16).zzc(16);
            zzdk.zzb zzbVar = zzdk.zzb.zzc;
            hashMap.put("AES128_EAX_RAW", zzc2.zza(zzbVar).zza());
            hashMap.put("AES256_EAX", zzfg.zzd);
            hashMap.put("AES256_EAX_RAW", zzdk.zze().zza(16).zzb(32).zzc(16).zza(zzbVar).zza());
            zza2.zza(DesugarCollections.unmodifiableMap(hashMap));
            zzoc.zza().zza(zzc, zzdk.class);
            zzna.zza().zza((zzbn) zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
    }
}
