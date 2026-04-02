package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzii extends zzeh implements zzfn {
    private static final zzii zzb;
    private int zzd;
    private int zze;
    private zzia zzh;
    private int zzj;
    private int zzk;
    private int zzn;
    private zzeo zzf = zzeh.zzP();
    private int zzg = -1;
    private String zzi = StringUtils.EMPTY;
    private zzen zzl = zzeh.zzO();
    private String zzm = StringUtils.EMPTY;

    static {
        zzii zziiVar = new zzii();
        zzb = zziiVar;
        zzeh.zzV(zzii.class, zziiVar);
    }

    private zzii() {
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
                    return new zzie(null);
                }
                return new zzii();
            }
            return zzeh.zzS(zzb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003င\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006᠌\u0004\u0007᠌\u0005\b'\tဈ\u0006\n᠌\u0007", new Object[]{"zzd", "zze", zzid.zza, "zzf", zzic.class, "zzg", "zzh", "zzi", "zzj", zzif.zza, "zzk", zzig.zza, "zzl", "zzm", "zzn", zzih.zza});
        }
        return (byte) 1;
    }
}
