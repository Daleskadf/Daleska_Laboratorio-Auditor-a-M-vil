package com.google.android.gms.internal.cast;
/* loaded from: classes.dex */
public final class zzlz extends zzoy<zzlz, zzly> implements zzqf {
    private static final zzlz zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private byte zzi = 2;

    static {
        zzlz zzlzVar = new zzlz();
        zzb = zzlzVar;
        zzoy.zzA(zzlz.class, zzlzVar);
    }

    private zzlz() {
    }

    @Override // com.google.android.gms.internal.cast.zzoy
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            byte b10 = 1;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (obj == null) {
                                b10 = 0;
                            }
                            this.zzi = b10;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzly(null);
                }
                return new zzlz();
            }
            return zzoy.zzz(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔌ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"zze", "zzf", zzhj.zza(), "zzg", "zzh", zzjx.zza()});
        }
        return Byte.valueOf(this.zzi);
    }
}
