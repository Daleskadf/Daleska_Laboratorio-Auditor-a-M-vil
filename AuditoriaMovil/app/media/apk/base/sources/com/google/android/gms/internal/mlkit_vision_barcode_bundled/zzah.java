package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzah extends zzeh implements zzfn {
    private static final zzah zzb;
    private int zzd;
    private zzx zzj;
    private zzjv zzk;
    private byte zzl = 2;
    private String zze = StringUtils.EMPTY;
    private String zzf = StringUtils.EMPTY;
    private zzen zzg = zzeh.zzO();
    private String zzh = StringUtils.EMPTY;
    private String zzi = StringUtils.EMPTY;

    static {
        zzah zzahVar = new zzah();
        zzb = zzahVar;
        zzeh.zzV(zzah.class, zzahVar);
        zzeh.zzI(zzjv.zzf(), zzahVar, zzahVar, null, 308676116, zzhf.zzk, zzah.class);
    }

    private zzah() {
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
                            this.zzl = b5;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaf(null);
                }
                return new zzah();
            }
            return zzeh.zzS(zzb, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ࠞ\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", zzag.zza, "zzh", "zzi", "zzk", "zzj"});
        }
        return Byte.valueOf(this.zzl);
    }
}
