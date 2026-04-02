package com.google.android.recaptcha.internal;

import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzqz extends zznd implements zzoj {
    private static final zzqz zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzk;
    private String zzf = StringUtils.EMPTY;
    private String zzh = StringUtils.EMPTY;
    private String zzj = StringUtils.EMPTY;

    static {
        zzqz zzqzVar = new zzqz();
        zzb = zzqzVar;
        zznd.zzI(zzqz.class, zzqzVar);
    }

    private zzqz() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 != 0) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 != 5) {
                            if (i8 != 6) {
                                return null;
                            }
                            zzoq zzoqVar = zzd;
                            if (zzoqVar == null) {
                                synchronized (zzqz.class) {
                                    try {
                                        zzoqVar = zzd;
                                        if (zzoqVar == null) {
                                            zzoqVar = new zzmy(zzb);
                                            zzd = zzoqVar;
                                        }
                                    } finally {
                                    }
                                }
                            }
                            return zzoqVar;
                        }
                        return zzb;
                    }
                    return new zzqx(null);
                }
                return new zzqz();
            }
            return zznd.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0004\u0006Ȉ\u0007\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
