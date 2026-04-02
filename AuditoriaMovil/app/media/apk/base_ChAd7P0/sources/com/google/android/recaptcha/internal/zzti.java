package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
public final class zzti extends zznd implements zzoj {
    private static final zzti zzb;
    private static volatile zzoq zzd;
    private zznk zze = zznd.zzB();
    private int zzf;

    static {
        zzti zztiVar = new zzti();
        zzb = zztiVar;
        zznd.zzI(zzti.class, zztiVar);
    }

    private zzti() {
    }

    public static zztf zzf() {
        return (zztf) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzti zztiVar, Iterable iterable) {
        zztiVar.zzl();
        zzko.zzc(iterable, zztiVar.zze);
    }

    public static /* synthetic */ void zzj(zzti zztiVar, zzth zzthVar) {
        zzthVar.getClass();
        zztiVar.zzl();
        zztiVar.zze.add(zzthVar);
    }

    private final void zzl() {
        zznk zznkVar = this.zze;
        if (!zznkVar.zzc()) {
            this.zze = zznd.zzC(zznkVar);
        }
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
                                synchronized (zzti.class) {
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
                    return new zztf(null);
                }
                return new zzti();
            }
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zze", zzth.class, "zzf"});
        }
        return (byte) 1;
    }
}
