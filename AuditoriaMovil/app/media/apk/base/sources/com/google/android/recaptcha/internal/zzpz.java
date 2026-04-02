package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
public final class zzpz {
    static {
        zzmj zzi = zzml.zzi();
        zzi.zzf(-315576000000L);
        zzi.zze(-999999999);
        zzml zzmlVar = (zzml) zzi.zzk();
        zzmj zzi2 = zzml.zzi();
        zzi2.zzf(315576000000L);
        zzi2.zze(999999999);
        zzml zzmlVar2 = (zzml) zzi2.zzk();
        zzmj zzi3 = zzml.zzi();
        zzi3.zzf(0L);
        zzi3.zze(0);
        zzml zzmlVar3 = (zzml) zzi3.zzk();
    }

    public static zzml zza(long j) {
        int i7;
        int i8 = (int) (j % 1000000000);
        long j8 = j / 1000000000;
        if (i8 <= -1000000000 || i8 >= 1000000000) {
            j8 = zzkk.zza(j8, i8 / 1000000000);
            i8 %= 1000000000;
        }
        if (j8 > 0 && i8 < 0) {
            i8 += 1000000000;
            j8--;
        }
        if (j8 < 0 && i8 > 0) {
            i8 -= 1000000000;
            j8++;
        }
        zzmj zzi = zzml.zzi();
        zzi.zzf(j8);
        zzi.zze(i8);
        zzml zzmlVar = (zzml) zzi.zzk();
        long zzg = zzmlVar.zzg();
        int zzf = zzmlVar.zzf();
        if (zzg >= -315576000000L && zzg <= 315576000000L && zzf >= -999999999 && zzf < 1000000000 && ((zzg >= 0 && zzf >= 0) || (i7 <= 0 && zzf <= 0))) {
            return zzmlVar;
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + zzg + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + zzf + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }
}
