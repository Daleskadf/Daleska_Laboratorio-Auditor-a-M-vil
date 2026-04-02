package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import j$.util.DesugarTimeZone;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzanp  reason: invalid package */
/* loaded from: classes.dex */
public final class zzanp {
    private static final ThreadLocal<SimpleDateFormat> zza;

    static {
        zzamt zzamtVar = (zzamt) ((zzakg) zzamt.zzc().zza(-62135596800L).zza(0).zze());
        zzamt zzamtVar2 = (zzamt) ((zzakg) zzamt.zzc().zza(253402300799L).zza(999999999).zze());
        zzamt zzamtVar3 = (zzamt) ((zzakg) zzamt.zzc().zza(0L).zza(0).zze());
        zza = new zzano();
        zzc("now");
        zzc("getEpochSecond");
        zzc("getNano");
    }

    private static boolean zza(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }

    private static long zzb(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            try {
                return ((Long.parseLong(str.substring(0, indexOf)) * 60) + Long.parseLong(str.substring(indexOf + 1))) * 60;
            } catch (NumberFormatException e7) {
                ParseException parseException = new ParseException("Invalid offset value: ".concat(str), 0);
                parseException.initCause(e7);
                throw parseException;
            }
        }
        throw new ParseException("Invalid offset value: ".concat(str), 0);
    }

    private static Method zzc(String str) {
        try {
            return Class.forName("j$.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static long zza(zzamt zzamtVar) {
        return zzb(zzamtVar).zzb();
    }

    public static zzamt zza(String str) {
        String str2;
        int i7;
        int indexOf = str.indexOf(84);
        if (indexOf != -1) {
            int indexOf2 = str.indexOf(90, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(43, indexOf);
            }
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(45, indexOf);
            }
            if (indexOf2 != -1) {
                String substring = str.substring(0, indexOf2);
                int indexOf3 = substring.indexOf(46);
                if (indexOf3 != -1) {
                    String substring2 = substring.substring(0, indexOf3);
                    str2 = substring.substring(indexOf3 + 1);
                    substring = substring2;
                } else {
                    str2 = StringUtils.EMPTY;
                }
                long time = zza.get().parse(substring).getTime() / 1000;
                if (str2.isEmpty()) {
                    i7 = 0;
                } else {
                    i7 = 0;
                    for (int i8 = 0; i8 < 9; i8++) {
                        i7 *= 10;
                        if (i8 < str2.length()) {
                            if (str2.charAt(i8) >= '0' && str2.charAt(i8) <= '9') {
                                i7 = (str2.charAt(i8) - '0') + i7;
                            } else {
                                throw new ParseException("Invalid nanoseconds.", 0);
                            }
                        }
                    }
                }
                if (str.charAt(indexOf2) == 'Z') {
                    if (str.length() != indexOf2 + 1) {
                        throw new ParseException(AbstractC0059i.M("Failed to parse timestamp: invalid trailing data \"", str.substring(indexOf2), "\""), 0);
                    }
                } else {
                    long zzb = zzb(str.substring(indexOf2 + 1));
                    time = str.charAt(indexOf2) == '+' ? time - zzb : time + zzb;
                }
                try {
                    if (zza(time)) {
                        if (i7 <= -1000000000 || i7 >= 1000000000) {
                            time = zzbc.zza(time, i7 / 1000000000);
                            i7 %= 1000000000;
                        }
                        if (i7 < 0) {
                            i7 += 1000000000;
                            time = zzbc.zzb(time, 1L);
                        }
                        return zzb((zzamt) ((zzakg) zzamt.zzc().zza(time).zza(i7).zze()));
                    }
                    throw new IllegalArgumentException(zzae.zza("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(time)));
                } catch (IllegalArgumentException e7) {
                    ParseException parseException = new ParseException(AbstractC0059i.M("Failed to parse timestamp ", str, " Timestamp is out of range."), 0);
                    parseException.initCause(e7);
                    throw parseException;
                }
            }
            throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
        }
        throw new ParseException(AbstractC0059i.M("Failed to parse timestamp: invalid timestamp \"", str, "\""), 0);
    }

    private static zzamt zzb(zzamt zzamtVar) {
        long zzb = zzamtVar.zzb();
        int zza2 = zzamtVar.zza();
        if (!zza(zzb) || zza2 < 0 || zza2 >= 1000000000) {
            throw new IllegalArgumentException(zzae.zza("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(zzb), Integer.valueOf(zza2)));
        }
        return zzamtVar;
    }

    public static /* synthetic */ SimpleDateFormat zza() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }
}
