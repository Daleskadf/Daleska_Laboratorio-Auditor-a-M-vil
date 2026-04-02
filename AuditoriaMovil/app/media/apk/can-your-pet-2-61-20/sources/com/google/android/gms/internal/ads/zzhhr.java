package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhhr extends zzgzv implements zzhbm {
    private static final zzhhr zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;
    private int zzg;
    private String zze = "";
    private zzhad zzf = zzbG();
    private zzhah zzh = zzbK();
    private zzgyj zzi = zzgyj.zzb;

    static {
        zzhhr zzhhrVar = new zzhhr();
        zza = zzhhrVar;
        zzgzv.zzca(zzhhr.class, zzhhrVar);
    }

    private zzhhr() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        switch (zzgzuVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzbR(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzhhp.class, "zzi"});
            case 3:
                return new zzhhr();
            case 4:
                return new zzhhq(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzhhr.class) {
                        zzhbtVar = zzb;
                        if (zzhbtVar == null) {
                            zzhbtVar = new zzgzq(zza);
                            zzb = zzhbtVar;
                        }
                    }
                }
                return zzhbtVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
