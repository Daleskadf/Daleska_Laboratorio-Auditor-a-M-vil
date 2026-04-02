package com.google.android.recaptcha.internal;

import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzto extends zznd implements zzoj {
    private static final zzto zzb;
    private static volatile zzoq zzd;
    private int zzh;
    private String zze = StringUtils.EMPTY;
    private String zzf = StringUtils.EMPTY;
    private String zzg = StringUtils.EMPTY;
    private String zzi = StringUtils.EMPTY;
    private String zzj = StringUtils.EMPTY;
    private String zzk = StringUtils.EMPTY;

    static {
        zzto zztoVar = new zzto();
        zzb = zztoVar;
        zznd.zzI(zzto.class, zztoVar);
    }

    private zzto() {
    }

    public static /* synthetic */ void zzM(zzto zztoVar, String str) {
        str.getClass();
        zztoVar.zzi = str;
    }

    public static /* synthetic */ void zzN(zzto zztoVar, String str) {
        str.getClass();
        zztoVar.zze = str;
    }

    public static zztn zzf() {
        return (zztn) zzb.zzq();
    }

    public static /* synthetic */ void zzj(zzto zztoVar, String str) {
        str.getClass();
        zztoVar.zzj = str;
    }

    public static /* synthetic */ void zzk(zzto zztoVar, String str) {
        str.getClass();
        zztoVar.zzf = str;
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
                                synchronized (zzto.class) {
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
                    return new zztn(null);
                }
                return new zzto();
            }
            return zznd.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
