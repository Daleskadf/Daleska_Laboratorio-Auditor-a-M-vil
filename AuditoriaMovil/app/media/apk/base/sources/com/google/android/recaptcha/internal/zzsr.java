package com.google.android.recaptcha.internal;

import java.util.List;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzsr extends zznd implements zzoj {
    private static final zzsr zzb;
    private static volatile zzoq zzd;
    private int zze;
    private long zzg;
    private int zzh;
    private String zzf = StringUtils.EMPTY;
    private zznk zzi = zznd.zzB();
    private zzle zzj = zzle.zzb;
    private String zzk = StringUtils.EMPTY;
    private String zzl = StringUtils.EMPTY;

    static {
        zzsr zzsrVar = new zzsr();
        zzb = zzsrVar;
        zznd.zzI(zzsr.class, zzsrVar);
    }

    private zzsr() {
    }

    public static zzsr zzi() {
        return zzb;
    }

    public final zzle zzf() {
        return this.zzj;
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
                                synchronized (zzsr.class) {
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
                    return new zzsq(null);
                }
                return new zzsr();
            }
            return zznd.zzF(zzb, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0004ဌ\u0002\u0005\u001b\u0006ည\u0003\u0007ለ\u0004\bለ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzst.class, "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }

    public final String zzj() {
        return this.zzf;
    }

    public final List zzk() {
        return this.zzi;
    }
}
