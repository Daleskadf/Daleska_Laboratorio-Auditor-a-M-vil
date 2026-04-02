package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzny  reason: invalid package */
/* loaded from: classes.dex */
public final class zzny {
    public static final zznv zza = new zzoa();

    public static <P> zznu zza(zzpg<P> zzpgVar) {
        zzbq zzbqVar;
        zznx zznxVar = new zznx();
        zznxVar.zza(zzpgVar.zza());
        for (List<zzpi<P>> list : zzpgVar.zzd()) {
            for (zzpi<P> zzpiVar : list) {
                int i7 = zzob.zza[zzpiVar.zzb().ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            zzbqVar = zzbq.zzc;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                    } else {
                        zzbqVar = zzbq.zzb;
                    }
                } else {
                    zzbqVar = zzbq.zza;
                }
                int zza2 = zzpiVar.zza();
                String zze = zzpiVar.zze();
                if (zze.startsWith("type.googleapis.com/google.crypto.")) {
                    zze = zze.substring(34);
                }
                zznxVar.zza(zzbqVar, zza2, zze, zzpiVar.zzc().name());
            }
        }
        if (zzpgVar.zzb() != null) {
            zznxVar.zza(zzpgVar.zzb().zza());
        }
        try {
            return zznxVar.zza();
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }
}
