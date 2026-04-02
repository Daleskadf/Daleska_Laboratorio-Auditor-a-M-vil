package com.google.android.recaptcha.internal;

import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzqq extends zznd implements zzoj {
    private static final zzqq zzb;
    private static volatile zzoq zzd;
    private int zzg;
    private int zzj;
    private int zzk;
    private String zze = StringUtils.EMPTY;
    private String zzf = StringUtils.EMPTY;
    private String zzh = StringUtils.EMPTY;
    private String zzi = StringUtils.EMPTY;

    static {
        zzqq zzqqVar = new zzqq();
        zzb = zzqqVar;
        zznd.zzI(zzqq.class, zzqqVar);
    }

    private zzqq() {
    }

    public static /* synthetic */ void zzO(zzqq zzqqVar, String str) {
        str.getClass();
        zzqqVar.zze = str;
    }

    public static zzqo zzg() {
        return (zzqo) zzb.zzq();
    }

    public static zzqq zzj() {
        return zzb;
    }

    public final int zzf() {
        return this.zzg;
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
                                synchronized (zzqq.class) {
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
                    return new zzqo(null);
                }
                return new zzqq();
            }
            return zznd.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007\u0004", new Object[]{"zze", "zzg", "zzi", "zzj", "zzf", "zzh", "zzk"});
        }
        return (byte) 1;
    }

    public final String zzk() {
        return this.zze;
    }
}
