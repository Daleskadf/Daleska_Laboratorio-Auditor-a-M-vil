package com.google.android.gms.internal.cast;
/* loaded from: classes.dex */
public final class zzmh extends zzoy<zzmh, zzmg> implements zzqf {
    private static final zzmh zzb;
    private int zze;
    private long zzf;
    private zzpf zzg = zzoy.zzv();
    private zzpf zzh = zzoy.zzv();

    static {
        zzmh zzmhVar = new zzmh();
        zzb = zzmhVar;
        zzoy.zzA(zzmh.class, zzmhVar);
    }

    private zzmh() {
    }

    @Override // com.google.android.gms.internal.cast.zzoy
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzmg(null);
                }
                return new zzmh();
            }
            return zzoy.zzz(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
