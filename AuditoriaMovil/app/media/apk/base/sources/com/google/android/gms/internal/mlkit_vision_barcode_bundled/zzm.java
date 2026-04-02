package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzm extends zzeh implements zzfn {
    private static final zzm zzb;
    private int zzd;
    private zzeo zze = zzeh.zzP();
    private String zzf = StringUtils.EMPTY;

    static {
        zzm zzmVar = new zzm();
        zzb = zzmVar;
        zzeh.zzV(zzm.class, zzmVar);
    }

    private zzm() {
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
                    return new zzl(null);
                }
                return new zzm();
            }
            return zzeh.zzS(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
