package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzjn extends zzeh implements zzfn {
    private static final zzjn zzb;
    private int zzd;
    private String zze = StringUtils.EMPTY;
    private String zzf = StringUtils.EMPTY;

    static {
        zzjn zzjnVar = new zzjn();
        zzb = zzjnVar;
        zzeh.zzV(zzjn.class, zzjnVar);
    }

    private zzjn() {
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
                    return new zzjm(null);
                }
                return new zzjn();
            }
            return zzeh.zzS(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
