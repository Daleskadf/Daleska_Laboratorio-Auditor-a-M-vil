package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
public final class zzth extends zznd implements zzoj {
    private static final zzth zzb;
    private static volatile zzoq zzd;
    private int zze = 0;
    private Object zzf;

    static {
        zzth zzthVar = new zzth();
        zzb = zzthVar;
        zznd.zzI(zzth.class, zzthVar);
    }

    private zzth() {
    }

    public static /* synthetic */ void zzM(zzth zzthVar, float f) {
        zzthVar.zze = 9;
        zzthVar.zzf = Float.valueOf(f);
    }

    public static /* synthetic */ void zzN(zzth zzthVar, int i7) {
        zzthVar.zze = 4;
        zzthVar.zzf = Integer.valueOf(i7);
    }

    public static /* synthetic */ void zzO(zzth zzthVar, int i7) {
        zzthVar.zze = 5;
        zzthVar.zzf = Integer.valueOf(i7);
    }

    public static /* synthetic */ void zzP(zzth zzthVar, long j) {
        zzthVar.zze = 7;
        zzthVar.zzf = Long.valueOf(j);
    }

    public static /* synthetic */ void zzQ(zzth zzthVar, String str) {
        str.getClass();
        zzthVar.zze = 11;
        zzthVar.zzf = str;
    }

    public static zztg zzf() {
        return (zztg) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzth zzthVar, boolean z7) {
        zzthVar.zze = 1;
        zzthVar.zzf = Boolean.valueOf(z7);
    }

    public static /* synthetic */ void zzj(zzth zzthVar, zzle zzleVar) {
        zzthVar.zze = 2;
        zzthVar.zzf = zzleVar;
    }

    public static /* synthetic */ void zzk(zzth zzthVar, String str) {
        str.getClass();
        zzthVar.zze = 3;
        zzthVar.zzf = str;
    }

    public static /* synthetic */ void zzl(zzth zzthVar, double d7) {
        zzthVar.zze = 10;
        zzthVar.zzf = Double.valueOf(d7);
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
                                synchronized (zzth.class) {
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
                    return new zztg(null);
                }
                return new zzth();
            }
            return zznd.zzF(zzb, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000", new Object[]{"zzf", "zze"});
        }
        return (byte) 1;
    }
}
