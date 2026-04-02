package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhfm extends zzgzv implements zzhbm {
    private static final zzhfm zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzgyj zzd = zzgyj.zzb;
    private zzgyj zze;
    private zzgyj zzf;

    static {
        zzhfm zzhfmVar = new zzhfm();
        zza = zzhfmVar;
        zzgzv.zzca(zzhfm.class, zzhfmVar);
    }

    private zzhfm() {
        zzgyj zzgyjVar = zzgyj.zzb;
        this.zze = zzgyjVar;
        this.zzf = zzgyjVar;
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
                return zzbR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new zzhfm();
            case 4:
                return new zzhfl(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzhfm.class) {
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
