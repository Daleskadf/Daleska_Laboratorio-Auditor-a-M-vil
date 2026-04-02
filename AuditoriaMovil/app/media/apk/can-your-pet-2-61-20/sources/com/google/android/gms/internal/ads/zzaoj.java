package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaoj {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfv zza = new zzfv(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfo zzb = new zzfo();

    public static long zzc(zzfo zzfoVar) {
        int zzd = zzfoVar.zzd();
        if (zzfoVar.zzb() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzfoVar.zzG(bArr, 0, 9);
        zzfoVar.zzK(zzd);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    long j3 = (j2 & 3) << 13;
                    return j3 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (((248 & j2) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
                return -9223372036854775807L;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private final int zzf(zzadg zzadgVar) {
        byte[] bArr = zzfx.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
        this.zzc = true;
        zzadgVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int zza(zzadg zzadgVar, zzaec zzaecVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzadgVar.zzd();
            int min = (int) Math.min(20000L, zzd);
            long j2 = zzd - min;
            if (zzadgVar.zzf() != j2) {
                zzaecVar.zza = j2;
                return 1;
            }
            this.zzb.zzH(min);
            zzadgVar.zzj();
            ((zzact) zzadgVar).zzm(this.zzb.zzM(), 0, min, false);
            zzfo zzfoVar = this.zzb;
            int zzd2 = zzfoVar.zzd();
            int zze = zzfoVar.zze() - 4;
            while (true) {
                if (zze < zzd2) {
                    break;
                }
                if (zzg(zzfoVar.zzM(), zze) == 442) {
                    zzfoVar.zzK(zze + 4);
                    long zzc = zzc(zzfoVar);
                    if (zzc != -9223372036854775807L) {
                        j = zzc;
                        break;
                    }
                }
                zze--;
            }
            this.zzg = j;
            this.zze = true;
        } else if (this.zzg == -9223372036854775807L) {
            zzf(zzadgVar);
            return 0;
        } else if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zzf(zzadgVar);
                return 0;
            }
            zzfv zzfvVar = this.zza;
            this.zzh = zzfvVar.zzc(this.zzg) - zzfvVar.zzb(j3);
            zzf(zzadgVar);
            return 0;
        } else {
            int min2 = (int) Math.min(20000L, zzadgVar.zzd());
            if (zzadgVar.zzf() != 0) {
                zzaecVar.zza = 0L;
                return 1;
            }
            this.zzb.zzH(min2);
            zzadgVar.zzj();
            ((zzact) zzadgVar).zzm(this.zzb.zzM(), 0, min2, false);
            zzfo zzfoVar2 = this.zzb;
            int zzd3 = zzfoVar2.zzd();
            int zze2 = zzfoVar2.zze();
            while (true) {
                if (zzd3 >= zze2 - 3) {
                    break;
                }
                if (zzg(zzfoVar2.zzM(), zzd3) == 442) {
                    zzfoVar2.zzK(zzd3 + 4);
                    long zzc2 = zzc(zzfoVar2);
                    if (zzc2 != -9223372036854775807L) {
                        j = zzc2;
                        break;
                    }
                }
                zzd3++;
            }
            this.zzf = j;
            this.zzd = true;
        }
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfv zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
