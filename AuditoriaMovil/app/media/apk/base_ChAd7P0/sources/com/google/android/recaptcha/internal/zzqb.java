package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
/* loaded from: classes.dex */
public final class zzqb {
    private static final ThreadLocal zza;

    static {
        zzph zzi = zzpj.zzi();
        zzi.zzf(-62135596800L);
        zzi.zze(0);
        zzpj zzpjVar = (zzpj) zzi.zzk();
        zzph zzi2 = zzpj.zzi();
        zzi2.zzf(253402300799L);
        zzi2.zze(999999999);
        zzpj zzpjVar2 = (zzpj) zzi2.zzk();
        zzph zzi3 = zzpj.zzi();
        zzi3.zzf(0L);
        zzi3.zze(0);
        zzpj zzpjVar3 = (zzpj) zzi3.zzk();
        zza = new zzqa();
        zzd("now");
        zzd("getEpochSecond");
        zzd("getNano");
    }

    public static zzpj zza(zzpj zzpjVar) {
        long zzg = zzpjVar.zzg();
        boolean zze = zze(zzg);
        int zzf = zzpjVar.zzf();
        if (zze && zzf >= 0 && zzf < 1000000000) {
            return zzpjVar;
        }
        throw new IllegalArgumentException("Timestamp is not valid. See proto definition for valid values. Seconds (" + zzg + ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (" + zzf + ") must be in range [0, +999,999,999].");
    }

    public static zzpj zzb(long j) {
        long j8 = j / 1000;
        if (zze(j8)) {
            int i7 = (int) ((j % 1000) * 1000000);
            if (i7 <= -1000000000 || i7 >= 1000000000) {
                j8 = zzkk.zza(j8, i7 / 1000000000);
                i7 %= 1000000000;
            }
            if (i7 < 0) {
                i7 += 1000000000;
                j8 = zzkk.zzb(j8, 1L);
            }
            zzph zzi = zzpj.zzi();
            zzi.zzf(j8);
            zzi.zze(i7);
            zzpj zzpjVar = (zzpj) zzi.zzk();
            zza(zzpjVar);
            return zzpjVar;
        }
        throw new IllegalArgumentException("Timestamp is not valid. Input seconds is too large. Seconds (" + j8 + ") must be in range [-62,135,596,800, +253,402,300,799]. ");
    }

    public static String zzc(zzpj zzpjVar) {
        String format;
        zza(zzpjVar);
        long zzg = zzpjVar.zzg();
        int zzf = zzpjVar.zzf();
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) zza.get()).format(new Date(zzg * 1000)));
        if (zzf != 0) {
            sb.append(".");
            if (zzf % 1000000 == 0) {
                format = String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(zzf / 1000000));
            } else if (zzf % PipesIterator.DEFAULT_QUEUE_SIZE == 0) {
                format = String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(zzf / PipesIterator.DEFAULT_QUEUE_SIZE));
            } else {
                format = String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(zzf));
            }
            sb.append(format);
        }
        sb.append("Z");
        return sb.toString();
    }

    private static Method zzd(String str) {
        try {
            return Class.forName("j$.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean zze(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }
}
