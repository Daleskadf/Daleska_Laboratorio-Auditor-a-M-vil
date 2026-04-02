package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlz  reason: invalid package */
/* loaded from: classes.dex */
public final class zzlz implements zzbm {
    private zzlz(zzbm zzbmVar, byte[] bArr) {
    }

    public static zzbm zza(zznn zznnVar) {
        byte[] zzb;
        zzpn zza = zznnVar.zza(zzbl.zza());
        zzbm zzbmVar = (zzbm) zzcj.zza((zzwb) ((zzakg) zzwb.zza().zza(zza.zzf()).zza(zza.zzd()).zza(zza.zza()).zze()), zzbm.class);
        zzxd zzc = zza.zzc();
        int i7 = zzly.zza[zzc.ordinal()];
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                if (i7 == 4) {
                    zzb = zzor.zzb(zznnVar.zza().intValue()).zzb();
                } else {
                    throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzc)));
                }
            } else {
                zzb = zzor.zza(zznnVar.zza().intValue()).zzb();
            }
        } else {
            zzb = zzor.zza.zzb();
        }
        return new zzlz(zzbmVar, zzb);
    }
}
