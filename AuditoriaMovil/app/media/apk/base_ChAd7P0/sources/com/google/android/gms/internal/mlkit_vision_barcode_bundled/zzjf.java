package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzjf extends zzeh implements zzfn {
    private static final zzjf zzb;
    private int zzd;
    private String zze = StringUtils.EMPTY;
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        zzjf zzjfVar = new zzjf();
        zzb = zzjfVar;
        zzeh.zzV(zzjf.class, zzjfVar);
    }

    private zzjf() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 != 0) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzje(null);
                }
                return new zzjf();
            }
            return zzeh.zzS(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
