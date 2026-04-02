package com.google.android.gms.internal.mlkit_vision_barcode_bundled;
/* loaded from: classes.dex */
public final class zzhw extends zzeh implements zzfn {
    private static final zzhw zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh = 2;

    static {
        zzhw zzhwVar = new zzhw();
        zzb = zzhwVar;
        zzeh.zzV(zzhw.class, zzhwVar);
    }

    private zzhw() {
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
                    return new zzhu(null);
                }
                return new zzhw();
            }
            return zzeh.zzS(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", zzhv.zza, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
