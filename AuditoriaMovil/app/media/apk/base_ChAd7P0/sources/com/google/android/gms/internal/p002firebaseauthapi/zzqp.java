package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import com.google.android.gms.internal.p002firebaseauthapi.zzqs;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqp  reason: invalid package */
/* loaded from: classes.dex */
public final class zzqp {
    private static final zzoy<zzql, zzqh> zza = zzoy.zza(new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqo
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
        public final Object zza(zzbo zzboVar) {
            return new zzrp((zzql) zzboVar);
        }
    }, zzql.class, zzqh.class);
    private static final zzoy<zzql, zzcd> zzb = zzoy.zza(new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqr
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
        public final Object zza(zzbo zzboVar) {
            return zzzg.zza((zzql) zzboVar);
        }
    }, zzql.class, zzcd.class);
    private static final zzbn<zzcd> zzc = zznl.zza("type.googleapis.com/google.crypto.tink.HmacKey", zzcd.class, zzwb.zza.SYMMETRIC, zzvb.zzg());
    private static final zzog<zzqs> zzd = new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqq
    };
    private static final zzoe<zzqs> zze = new zzoe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqt
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoe
        public final zzbo zza(zzcg zzcgVar, Integer num) {
            return zzqp.zza((zzqs) zzcgVar, num);
        }
    };
    private static final zzij.zza zzf = zzij.zza.zzb;

    public static zzql zza(zzqs zzqsVar, Integer num) {
        return zzql.zzb().zza(zzqsVar).zza(zzzo.zza(zzqsVar.zzc())).zza(num).zza();
    }

    public static void zza(boolean z7) {
        zzij.zza zzaVar = zzf;
        if (zzaVar.zza()) {
            zzrs.zza();
            zzon.zza().zza(zza);
            zzon.zza().zza(zzb);
            zzok zza2 = zzok.zza();
            HashMap hashMap = new HashMap();
            hashMap.put("HMAC_SHA256_128BITTAG", zzrb.zza);
            zzqs.zzb zzb2 = zzqs.zzd().zza(32).zzb(16);
            zzqs.zzc zzcVar = zzqs.zzc.zzd;
            zzqs.zzb zza3 = zzb2.zza(zzcVar);
            zzqs.zza zzaVar2 = zzqs.zza.zzc;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", zza3.zza(zzaVar2).zza());
            zzqs.zzb zzb3 = zzqs.zzd().zza(32).zzb(32);
            zzqs.zzc zzcVar2 = zzqs.zzc.zza;
            hashMap.put("HMAC_SHA256_256BITTAG", zzb3.zza(zzcVar2).zza(zzaVar2).zza());
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzqs.zzd().zza(32).zzb(32).zza(zzcVar).zza(zzaVar2).zza());
            zzqs.zzb zza4 = zzqs.zzd().zza(64).zzb(16).zza(zzcVar2);
            zzqs.zza zzaVar3 = zzqs.zza.zze;
            hashMap.put("HMAC_SHA512_128BITTAG", zza4.zza(zzaVar3).zza());
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzqs.zzd().zza(64).zzb(16).zza(zzcVar).zza(zzaVar3).zza());
            hashMap.put("HMAC_SHA512_256BITTAG", zzqs.zzd().zza(64).zzb(32).zza(zzcVar2).zza(zzaVar3).zza());
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzqs.zzd().zza(64).zzb(32).zza(zzcVar).zza(zzaVar3).zza());
            hashMap.put("HMAC_SHA512_512BITTAG", zzrb.zzb);
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzqs.zzd().zza(64).zzb(64).zza(zzcVar).zza(zzaVar3).zza());
            zza2.zza(DesugarCollections.unmodifiableMap(hashMap));
            zzoc.zza().zza(zze, zzqs.class);
            zzoh.zza().zza(zzd, zzqs.class);
            zzna.zza().zza((zzbn) zzc, zzaVar, true);
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
