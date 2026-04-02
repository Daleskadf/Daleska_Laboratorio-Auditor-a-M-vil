package com.google.android.gms.internal.mlkit_vision_barcode_bundled;
/* loaded from: classes.dex */
public final class zzu extends zzeh implements zzfn {
    private static final zzu zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private zzjv zzg;
    private byte zzh = 2;

    static {
        zzu zzuVar = new zzu();
        zzb = zzuVar;
        zzeh.zzV(zzu.class, zzuVar);
        zzeh.zzI(zzjv.zzf(), zzuVar, zzuVar, null, 13258261, zzhf.zzk, zzu.class);
    }

    private zzu() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i7, Object obj, Object obj2) {
        byte b5 = 1;
        int i8 = i7 - 1;
        if (i8 != 0) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 != 5) {
                            if (obj == null) {
                                b5 = 0;
                            }
                            this.zzh = b5;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzt(null);
                }
                return new zzu();
            }
            return zzeh.zzS(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
