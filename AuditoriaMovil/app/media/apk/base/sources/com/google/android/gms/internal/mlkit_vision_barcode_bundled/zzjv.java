package com.google.android.gms.internal.mlkit_vision_barcode_bundled;
/* loaded from: classes.dex */
public final class zzjv extends zzed implements zzfn {
    private static final zzjv zzd;
    private byte zze = 2;

    static {
        zzjv zzjvVar = new zzjv();
        zzd = zzjvVar;
        zzeh.zzV(zzjv.class, zzjvVar);
    }

    private zzjv() {
    }

    public static zzjv zzf() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i7, Object obj, Object obj2) {
        byte b5;
        int i8 = i7 - 1;
        if (i8 != 0) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 != 5) {
                            if (obj == null) {
                                b5 = 0;
                            } else {
                                b5 = 1;
                            }
                            this.zze = b5;
                            return null;
                        }
                        return zzd;
                    }
                    return new zzju(null);
                }
                return new zzjv();
            }
            return zzeh.zzS(zzd, "\u0003\u0000", null);
        }
        return Byte.valueOf(this.zze);
    }
}
