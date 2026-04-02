package com.google.android.recaptcha.internal;

import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzst extends zznd implements zzoj {
    private static final zzst zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = StringUtils.EMPTY;
    private String zzg = StringUtils.EMPTY;

    static {
        zzst zzstVar = new zzst();
        zzb = zzstVar;
        zznd.zzI(zzst.class, zzstVar);
    }

    private zzst() {
    }

    public final String zzg() {
        return this.zzf;
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
                                synchronized (zzst.class) {
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
                    return new zzss(null);
                }
                return new zzst();
            }
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final String zzi() {
        return this.zzg;
    }
}
