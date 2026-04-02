package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzht extends zzeh implements zzfn {
    private static final zzht zzb;
    private int zzd;
    private String zze = StringUtils.EMPTY;
    private int zzf = 1;
    private boolean zzg;
    private int zzh;

    static {
        zzht zzhtVar = new zzht();
        zzb = zzhtVar;
        zzeh.zzV(zzht.class, zzhtVar);
    }

    private zzht() {
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
                    return new zzhr(null);
                }
                return new zzht();
            }
            return zzeh.zzS(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", zzhs.zza, "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
