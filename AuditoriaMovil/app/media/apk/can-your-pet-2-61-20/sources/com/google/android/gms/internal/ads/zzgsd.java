package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgsd extends zzgzv implements zzhbm {
    private static final zzgsd zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;
    private zzgyj zze = zzgyj.zzb;
    private zzgsj zzf;

    static {
        zzgsd zzgsdVar = new zzgsd();
        zza = zzgsdVar;
        zzgzv.zzca(zzgsd.class, zzgsdVar);
    }

    private zzgsd() {
    }

    public static zzgsc zzc() {
        return (zzgsc) zza.zzaZ();
    }

    public static zzgsd zze(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgsd) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public static zzhbt zzh() {
        return zza.zzbM();
    }

    public static /* synthetic */ void zzj(zzgsd zzgsdVar, zzgsj zzgsjVar) {
        zzgsjVar.getClass();
        zzgsdVar.zzf = zzgsjVar;
        zzgsdVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
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
                return zzbR(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new zzgsd();
            case 4:
                return new zzgsc(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgsd.class) {
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

    public final zzgsj zzf() {
        zzgsj zzgsjVar = this.zzf;
        return zzgsjVar == null ? zzgsj.zze() : zzgsjVar;
    }

    public final zzgyj zzg() {
        return this.zze;
    }
}
