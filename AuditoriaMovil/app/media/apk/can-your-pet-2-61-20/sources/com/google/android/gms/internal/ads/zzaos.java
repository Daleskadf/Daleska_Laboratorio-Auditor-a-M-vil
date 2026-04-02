package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaos {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfv zza = new zzfv(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfo zzb = new zzfo();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaos(int i) {
    }

    private final int zze(zzadg zzadgVar) {
        byte[] bArr = zzfx.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
        this.zzc = true;
        zzadgVar.zzj();
        return 0;
    }

    public final int zza(zzadg zzadgVar, zzaec zzaecVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzadgVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzadgVar.zzd();
            int min = (int) Math.min(112800L, zzd);
            long j2 = zzd - min;
            if (zzadgVar.zzf() == j2) {
                this.zzb.zzH(min);
                zzadgVar.zzj();
                ((zzact) zzadgVar).zzm(this.zzb.zzM(), 0, min, false);
                zzfo zzfoVar = this.zzb;
                int zzd2 = zzfoVar.zzd();
                int zze = zzfoVar.zze();
                int i2 = zze - 188;
                while (true) {
                    if (i2 < zzd2) {
                        break;
                    }
                    byte[] zzM = zzfoVar.zzM();
                    int i3 = -4;
                    int i4 = 0;
                    while (true) {
                        if (i3 > 4) {
                            break;
                        }
                        int i5 = (i3 * 188) + i2;
                        if (i5 < zzd2 || i5 >= zze || zzM[i5] != 71) {
                            i4 = 0;
                        } else {
                            i4++;
                            if (i4 == 5) {
                                long zzb = zzapc.zzb(zzfoVar, i2, i);
                                if (zzb != -9223372036854775807L) {
                                    j = zzb;
                                    break;
                                }
                            }
                        }
                        i3++;
                    }
                    i2--;
                }
                this.zzg = j;
                this.zze = true;
                return 0;
            }
            zzaecVar.zza = j2;
        } else if (this.zzg == -9223372036854775807L) {
            zze(zzadgVar);
            return 0;
        } else if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zze(zzadgVar);
                return 0;
            }
            zzfv zzfvVar = this.zza;
            this.zzh = zzfvVar.zzc(this.zzg) - zzfvVar.zzb(j3);
            zze(zzadgVar);
            return 0;
        } else {
            int min2 = (int) Math.min(112800L, zzadgVar.zzd());
            if (zzadgVar.zzf() == 0) {
                this.zzb.zzH(min2);
                zzadgVar.zzj();
                ((zzact) zzadgVar).zzm(this.zzb.zzM(), 0, min2, false);
                zzfo zzfoVar2 = this.zzb;
                int zzd3 = zzfoVar2.zzd();
                int zze2 = zzfoVar2.zze();
                while (true) {
                    if (zzd3 >= zze2) {
                        break;
                    }
                    if (zzfoVar2.zzM()[zzd3] == 71) {
                        long zzb2 = zzapc.zzb(zzfoVar2, zzd3, i);
                        if (zzb2 != -9223372036854775807L) {
                            j = zzb2;
                            break;
                        }
                    }
                    zzd3++;
                }
                this.zzf = j;
                this.zzd = true;
                return 0;
            }
            zzaecVar.zza = 0L;
        }
        return 1;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfv zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
