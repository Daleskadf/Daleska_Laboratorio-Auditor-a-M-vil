package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhfr extends zzgzv implements zzhbm {
    private static final zzhfr zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzhfq zzd;
    private zzgyj zzg;
    private int zzh;
    private zzgyj zzi;
    private byte zzj = 2;
    private zzhah zze = zzbK();
    private zzgyj zzf = zzgyj.zzb;

    static {
        zzhfr zzhfrVar = new zzhfr();
        zza = zzhfrVar;
        zzgzv.zzca(zzhfr.class, zzhfrVar);
    }

    private zzhfr() {
        zzgyj zzgyjVar = zzgyj.zzb;
        this.zzg = zzgyjVar;
        this.zzi = zzgyjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        switch (zzgzuVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzj);
            case 1:
                this.zzj = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return zzbR(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzc", "zzd", "zze", zzhfj.class, "zzf", "zzg", "zzh", "zzi"});
            case 3:
                return new zzhfr();
            case 4:
                return new zzhfo(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzhfr.class) {
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
