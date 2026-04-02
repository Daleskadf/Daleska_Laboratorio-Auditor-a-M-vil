package com.google.android.gms.internal.mlkit_vision_barcode_bundled;
/* loaded from: classes.dex */
public final class zzj extends zzeh implements zzfn {
    private static final zzj zzb;
    private int zzd;
    private int zzg;
    private zzu zzh;
    private zzp zzi;
    private zzjv zzj;
    private int zzk;
    private byte zzm = 2;
    private int zze = 17;
    private zzeo zzf = zzeh.zzP();
    private zzeo zzl = zzeh.zzP();

    static {
        zzj zzjVar = new zzj();
        zzb = zzjVar;
        zzeh.zzV(zzj.class, zzjVar);
    }

    private zzj() {
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
                            this.zzm = b5;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzh(null);
                }
                return new zzj();
            }
            return zzeh.zzS(zzb, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001᠌\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"zzd", "zze", zzi.zza, "zzf", zzah.class, "zzg", "zzh", "zzi", "zzk", "zzl", zzak.class, "zzj"});
        }
        return Byte.valueOf(this.zzm);
    }
}
