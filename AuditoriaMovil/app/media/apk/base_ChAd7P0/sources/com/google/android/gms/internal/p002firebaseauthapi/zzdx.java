package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzea;
import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdx  reason: invalid package */
/* loaded from: classes.dex */
public final class zzdx {
    private static final zzoy<zzdt, zzbe> zza = zzoy.zza(new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdw
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
        public final Object zza(zzbo zzboVar) {
            return zzih.zza((zzdt) zzboVar);
        }
    }, zzdt.class, zzbe.class);
    private static final zzoe<zzea> zzb = new zzoe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdz
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoe
        public final zzbo zza(zzcg zzcgVar, Integer num) {
            zzdt zza2;
            zza2 = zzdt.zzb().zza(r1).zza(num).zza(zzzo.zza(((zzea) zzcgVar).zzb())).zza();
            return zza2;
        }
    };
    private static final zzog<zzea> zzc = new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdy
    };
    private static final zzbn<zzbe> zzd = zznl.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzbe.class, zzwb.zza.SYMMETRIC, zztn.zze());

    public static void zza(boolean z7) {
        if (zzij.zza.zza.zza()) {
            zzgt.zza();
            if (zza()) {
                zzon.zza().zza(zza);
                zzok zza2 = zzok.zza();
                HashMap hashMap = new HashMap();
                zzea.zza zza3 = zzea.zzc().zza(16);
                zzea.zzb zzbVar = zzea.zzb.zza;
                hashMap.put("AES128_GCM_SIV", zza3.zza(zzbVar).zza());
                zzea.zza zza4 = zzea.zzc().zza(16);
                zzea.zzb zzbVar2 = zzea.zzb.zzc;
                hashMap.put("AES128_GCM_SIV_RAW", zza4.zza(zzbVar2).zza());
                hashMap.put("AES256_GCM_SIV", zzea.zzc().zza(32).zza(zzbVar).zza());
                hashMap.put("AES256_GCM_SIV_RAW", zzea.zzc().zza(32).zza(zzbVar2).zza());
                zza2.zza(DesugarCollections.unmodifiableMap(hashMap));
                zzoh.zza().zza(zzc, zzea.class);
                zzoc.zza().zza(zzb, zzea.class);
                zzna.zza().zza((zzbn) zzd, true);
                return;
            }
            return;
        }
        throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
    }

    private static boolean zza() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}
