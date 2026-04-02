package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class zzgt extends zzkf implements zzln {
    private static final zzgt zza;
    private int zzd;
    private zzkm zze = zzkf.zzbE();
    private zzgp zzf;

    static {
        zzgt zzgtVar = new zzgt();
        zza = zzgtVar;
        zzkf.zzbL(zzgt.class, zzgtVar);
    }

    private zzgt() {
    }

    public final zzgp zza() {
        zzgp zzgpVar = this.zzf;
        if (zzgpVar == null) {
            return zzgp.zzc();
        }
        return zzgpVar;
    }

    public final List zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzgs(null);
                }
                return new zzgt();
            }
            return zzkf.zzbI(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", zzgy.class, "zzf"});
        }
        return (byte) 1;
    }
}
