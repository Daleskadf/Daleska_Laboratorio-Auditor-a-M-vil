package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzf extends zzeh implements zzfn {
    private static final zzf zzb;
    private int zzd;
    private zzjv zzi;
    private zzf zzj;
    private zzx zzk;
    private byte zzl = 2;
    private String zze = StringUtils.EMPTY;
    private zzeo zzf = zzeh.zzP();
    private zzeo zzg = zzeh.zzP();
    private zzeo zzh = zzeh.zzP();

    static {
        zzf zzfVar = new zzf();
        zzb = zzfVar;
        zzeh.zzV(zzf.class, zzfVar);
        zzeh.zzI(zzjv.zzf(), zzfVar, zzfVar, null, 12208774, zzhf.zzk, zzf.class);
    }

    private zzf() {
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
                    return new zze(null);
                }
                return new zzf();
            }
            return zzeh.zzS(zzb, "\u0001\u0007\u0000\u0001\u0002Ǵ\u0007\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002Ǵဉ\u0003", new Object[]{"zzd", "zzf", zzj.class, "zzh", zzj.class, "zzg", zzm.class, "zzi", "zze", "zzj", "zzk"});
        }
        return Byte.valueOf(this.zzl);
    }
}
