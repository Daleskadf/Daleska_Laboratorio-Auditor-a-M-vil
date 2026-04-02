package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzacq {
    public static void zza(long j, zzfo zzfoVar, zzaem[] zzaemVarArr) {
        int i;
        while (true) {
            if (zzfoVar.zzb() <= 1) {
                return;
            }
            int zzc = zzc(zzfoVar);
            int zzc2 = zzc(zzfoVar);
            int zzd = zzfoVar.zzd() + zzc2;
            if (zzc2 == -1 || zzc2 > zzfoVar.zzb()) {
                zzfe.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzd = zzfoVar.zze();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzm = zzfoVar.zzm();
                int zzq = zzfoVar.zzq();
                if (zzq == 49) {
                    i = zzfoVar.zzg();
                    zzq = 49;
                } else {
                    i = 0;
                }
                int zzm2 = zzfoVar.zzm();
                if (zzq == 47) {
                    zzfoVar.zzL(1);
                    zzq = 47;
                }
                boolean z = zzm == 181 && (zzq == 49 || zzq == 47) && zzm2 == 3;
                if (zzq == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    zzb(j, zzfoVar, zzaemVarArr);
                }
            }
            zzfoVar.zzK(zzd);
        }
    }

    public static void zzb(long j, zzfo zzfoVar, zzaem[] zzaemVarArr) {
        int zzm = zzfoVar.zzm();
        if ((zzm & 64) != 0) {
            int i = zzm & 31;
            zzfoVar.zzL(1);
            int zzd = zzfoVar.zzd();
            for (zzaem zzaemVar : zzaemVarArr) {
                int i2 = i * 3;
                zzfoVar.zzK(zzd);
                zzaemVar.zzq(zzfoVar, i2);
                zzek.zzf(j != -9223372036854775807L);
                zzaemVar.zzs(j, 1, i2, 0, null);
            }
        }
    }

    private static int zzc(zzfo zzfoVar) {
        int i = 0;
        while (zzfoVar.zzb() != 0) {
            int zzm = zzfoVar.zzm();
            i += zzm;
            if (zzm != 255) {
                return i;
            }
        }
        return -1;
    }
}
