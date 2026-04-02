package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzp extends zzeh implements zzfn {
    private static final zzp zzb;
    private int zzd;
    private zzjv zzj;
    private byte zzk = 2;
    private zzen zze = zzeh.zzO();
    private zzem zzf = zzeh.zzM();
    private boolean zzg = true;
    private String zzh = StringUtils.EMPTY;
    private String zzi = StringUtils.EMPTY;

    static {
        zzp zzpVar = new zzp();
        zzb = zzpVar;
        zzeh.zzV(zzp.class, zzpVar);
    }

    private zzp() {
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
                            this.zzk = b5;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzo(null);
                }
                return new zzp();
            }
            return zzeh.zzS(zzb, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
