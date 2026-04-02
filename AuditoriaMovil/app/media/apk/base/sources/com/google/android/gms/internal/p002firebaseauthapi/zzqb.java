package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import com.google.android.gms.internal.p002firebaseauthapi.zzqf;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqb  reason: invalid package */
/* loaded from: classes.dex */
public final class zzqb {
    private static final zzoe<zzqf> zza = new zzoe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqe
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoe
        public final zzbo zza(zzcg zzcgVar, Integer num) {
            return zzqb.zza((zzqf) zzcgVar, num);
        }
    };
    private static final zzoy<zzqa, zzqh> zzb = zzoy.zza(new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqd
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
        public final Object zza(zzbo zzboVar) {
            return zzqb.zzb((zzqa) zzboVar);
        }
    }, zzqa.class, zzqh.class);
    private static final zzoy<zzqa, zzcd> zzc = zzoy.zza(new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqg
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
        public final Object zza(zzbo zzboVar) {
            return zzqb.zza((zzqa) zzboVar);
        }
    }, zzqa.class, zzcd.class);
    private static final zzbn<zzcd> zzd = zznl.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", zzcd.class, zzwb.zza.SYMMETRIC, zzsa.zzf());

    public static /* synthetic */ zzcd zza(zzqa zzqaVar) {
        zza(zzqaVar.zzc());
        return zzzg.zza(zzqaVar);
    }

    public static /* synthetic */ zzqh zzb(zzqa zzqaVar) {
        zza(zzqaVar.zzc());
        return new zzrq(zzqaVar);
    }

    public static /* synthetic */ zzqa zza(zzqf zzqfVar, Integer num) {
        zza(zzqfVar);
        return zzqa.zzb().zza(zzqfVar).zza(zzzo.zza(zzqfVar.zzc())).zza(num).zza();
    }

    public static void zza(boolean z7) {
        if (zzij.zza.zza.zza()) {
            zzrh.zza();
            zzoc.zza().zza(zza, zzqf.class);
            zzon.zza().zza(zzb);
            zzon.zza().zza(zzc);
            zzok zza2 = zzok.zza();
            HashMap hashMap = new HashMap();
            zzqf zzqfVar = zzrb.zzc;
            hashMap.put("AES_CMAC", zzqfVar);
            hashMap.put("AES256_CMAC", zzqfVar);
            hashMap.put("AES256_CMAC_RAW", zzqf.zzd().zza(32).zzb(16).zza(zzqf.zza.zzd).zza());
            zza2.zza(DesugarCollections.unmodifiableMap(hashMap));
            zzna.zza().zza((zzbn) zzd, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
    }

    private static void zza(zzqf zzqfVar) {
        if (zzqfVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
