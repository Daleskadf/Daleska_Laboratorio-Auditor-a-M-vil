package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzado {
    public static int zza(zzfo zzfoVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzfoVar.zzm() + 1;
            case 7:
                return zzfoVar.zzq() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzadg zzadgVar, zzads zzadsVar) throws IOException {
        zzadgVar.zzj();
        zzact zzactVar = (zzact) zzadgVar;
        zzactVar.zzl(1, false);
        byte[] bArr = new byte[1];
        zzactVar.zzm(bArr, 0, 1, false);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        zzactVar.zzl(2, false);
        int i2 = 1 != i ? 6 : 7;
        zzfo zzfoVar = new zzfo(i2);
        zzfoVar.zzJ(zzadj.zza(zzadgVar, zzfoVar.zzM(), 0, i2));
        zzadgVar.zzj();
        zzadn zzadnVar = new zzadn();
        if (zzd(zzfoVar, zzadsVar, z, zzadnVar)) {
            return zzadnVar.zza;
        }
        throw zzcc.zza(null, null);
    }

    public static boolean zzc(zzfo zzfoVar, zzads zzadsVar, int i, zzadn zzadnVar) {
        int zza;
        int zzd = zzfoVar.zzd();
        long zzu = zzfoVar.zzu();
        long j = zzu >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        long j2 = zzu >> 12;
        long j3 = zzu >> 8;
        long j4 = zzu >> 4;
        long j5 = zzu >> 1;
        long j6 = zzu & 1;
        int i2 = (int) (j4 & 15);
        if (i2 <= 7) {
            if (i2 != zzadsVar.zzg - 1) {
                return false;
            }
        } else if (i2 > 10 || zzadsVar.zzg != 2) {
            return false;
        }
        int i3 = (int) (j5 & 7);
        if (!(i3 == 0 || i3 == zzadsVar.zzi) || j6 == 1 || !zzd(zzfoVar, zzadsVar, z, zzadnVar) || (zza = zza(zzfoVar, (int) (j2 & 15))) == -1 || zza > zzadsVar.zzb) {
            return false;
        }
        int i4 = zzadsVar.zze;
        int i5 = (int) (j3 & 15);
        if (i5 != 0) {
            if (i5 <= 11) {
                if (i5 != zzadsVar.zzf) {
                    return false;
                }
            } else if (i5 == 12) {
                if (zzfoVar.zzm() * 1000 != i4) {
                    return false;
                }
            } else if (i5 > 14) {
                return false;
            } else {
                int zzq = zzfoVar.zzq();
                if (i5 == 14) {
                    zzq *= 10;
                }
                if (zzq != i4) {
                    return false;
                }
            }
        }
        return zzfoVar.zzm() == zzfx.zzf(zzfoVar.zzM(), zzd, zzfoVar.zzd() + (-1), 0);
    }

    private static boolean zzd(zzfo zzfoVar, zzads zzadsVar, boolean z, zzadn zzadnVar) {
        try {
            long zzw = zzfoVar.zzw();
            if (!z) {
                zzw *= zzadsVar.zzb;
            }
            zzadnVar.zza = zzw;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
