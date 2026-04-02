package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
public final class zzts extends zznd implements zzoj {
    private static final zzts zzb;
    private static volatile zzoq zzd;
    private int zze;

    static {
        zzts zztsVar = new zzts();
        zzb = zztsVar;
        zznd.zzI(zzts.class, zztsVar);
    }

    private zzts() {
    }

    public static zzts zzg(byte[] bArr) {
        return (zzts) zznd.zzx(zzb, bArr);
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
                                synchronized (zzts.class) {
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
                    return new zztr(null);
                }
                return new zzts();
            }
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    public final zztv zzi() {
        zztv zzb2 = zztv.zzb(this.zze);
        return zzb2 == null ? zztv.UNRECOGNIZED : zzb2;
    }
}
