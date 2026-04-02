package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgnh {
    public static final zzgrt zza = new zzgng(null);

    public static zzgrz zza(zzgos zzgosVar) {
        zzgfv zzgfvVar;
        zzgrv zzgrvVar = new zzgrv();
        zzgrvVar.zzb(zzgosVar.zzc());
        for (List<zzgoq> list : zzgosVar.zze()) {
            for (zzgoq zzgoqVar : list) {
                zzgur zzb = zzgoqVar.zzb();
                zzgur zzgurVar = zzgur.UNKNOWN_STATUS;
                int ordinal = zzb.ordinal();
                if (ordinal == 1) {
                    zzgfvVar = zzgfv.zza;
                } else if (ordinal == 2) {
                    zzgfvVar = zzgfv.zzb;
                } else if (ordinal == 3) {
                    zzgfvVar = zzgfv.zzc;
                } else {
                    throw new IllegalStateException("Unknown key status");
                }
                int zza2 = zzgoqVar.zza();
                String zzf = zzgoqVar.zzf();
                if (zzf.startsWith("type.googleapis.com/google.crypto.")) {
                    zzf = zzf.substring(34);
                }
                zzgrvVar.zza(zzgfvVar, zza2, zzf, zzgoqVar.zzc().name());
            }
        }
        if (zzgosVar.zzb() != null) {
            zzgrvVar.zzc(zzgosVar.zzb().zza());
        }
        try {
            return zzgrvVar.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
