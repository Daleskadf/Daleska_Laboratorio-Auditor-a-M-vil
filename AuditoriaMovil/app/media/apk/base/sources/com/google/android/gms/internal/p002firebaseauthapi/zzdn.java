package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdr;
import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdn  reason: invalid package */
/* loaded from: classes.dex */
public final class zzdn {
    private static final zzoy<zzdm, zzbe> zza = zzoy.zza(new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdq
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
        public final Object zza(zzbo zzboVar) {
            return zzyb.zza((zzdm) zzboVar);
        }
    }, zzdm.class, zzbe.class);
    private static final zzbn<zzbe> zzb = zznl.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", zzbe.class, zzwb.zza.SYMMETRIC, zzth.zze());
    private static final zzog<zzdr> zzc = new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdp
    };
    private static final zzoe<zzdr> zzd = new zzoe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzds
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoe
        public final zzbo zza(zzcg zzcgVar, Integer num) {
            return zzdn.zza((zzdr) zzcgVar, num);
        }
    };
    private static final zzij.zza zze = zzij.zza.zzb;

    public static /* synthetic */ zzdm zza(zzdr zzdrVar, Integer num) {
        if (zzdrVar.zzc() != 24) {
            return zzdm.zzb().zza(zzdrVar).zza(num).zza(zzzo.zza(zzdrVar.zzc())).zza();
        }
        throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public static void zza(boolean z7) {
        zzij.zza zzaVar = zze;
        if (zzaVar.zza()) {
            zzgn.zza();
            zzon.zza().zza(zza);
            zzok zza2 = zzok.zza();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_GCM", zzfg.zza);
            zzdr.zzb zzc2 = zzdr.zze().zza(12).zzb(16).zzc(16);
            zzdr.zza zzaVar2 = zzdr.zza.zzc;
            hashMap.put("AES128_GCM_RAW", zzc2.zza(zzaVar2).zza());
            hashMap.put("AES256_GCM", zzfg.zzb);
            hashMap.put("AES256_GCM_RAW", zzdr.zze().zza(12).zzb(32).zzc(16).zza(zzaVar2).zza());
            zza2.zza(DesugarCollections.unmodifiableMap(hashMap));
            zzoh.zza().zza(zzc, zzdr.class);
            zzoc.zza().zza(zzd, zzdr.class);
            zzna.zza().zza((zzbn) zzb, zzaVar, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
