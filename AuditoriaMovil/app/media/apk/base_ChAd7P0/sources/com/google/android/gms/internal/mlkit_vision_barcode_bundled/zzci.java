package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;
/* loaded from: classes.dex */
public final class zzci extends zzeh implements zzfn {
    private static final zzci zzb;
    private int zzd;
    private int zze;
    private zzf zzg;
    private byte zzh = 2;
    private zzeo zzf = zzeh.zzP();

    static {
        zzci zzciVar = new zzci();
        zzb = zzciVar;
        zzeh.zzV(zzci.class, zzciVar);
    }

    private zzci() {
    }

    public final List zzb() {
        return this.zzf;
    }

    public final int zzc() {
        int zza = zzch.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
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
                    return new zzcf(null);
                }
                return new zzci();
            }
            return zzeh.zzS(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001᠌\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zzd", "zze", zzcg.zza, "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
