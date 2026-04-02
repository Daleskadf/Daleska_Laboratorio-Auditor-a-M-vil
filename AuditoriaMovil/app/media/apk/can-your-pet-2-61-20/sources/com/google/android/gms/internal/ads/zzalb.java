package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzalb {
    public static void zza(zzalc zzalcVar, zzalg zzalgVar, zzep zzepVar) {
        for (int i = 0; i < zzalcVar.zza(); i++) {
            long zzb = zzalcVar.zzb(i);
            List zzc = zzalcVar.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i != zzalcVar.zza() - 1) {
                    zzepVar.zza(new zzakz(zzc, zzb, zzalcVar.zzb(i + 1) - zzalcVar.zzb(i)));
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }
}
