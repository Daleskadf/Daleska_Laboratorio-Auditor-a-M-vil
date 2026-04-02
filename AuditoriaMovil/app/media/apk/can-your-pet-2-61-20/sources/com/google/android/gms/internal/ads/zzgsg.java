package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgsg extends zzgzv implements zzhbm {
    private static final zzgsg zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;
    private zzgsj zze;

    static {
        zzgsg zzgsgVar = new zzgsg();
        zza = zzgsgVar;
        zzgzv.zzca(zzgsg.class, zzgsgVar);
    }

    private zzgsg() {
    }

    public static zzgsf zzc() {
        return (zzgsf) zza.zzaZ();
    }

    public static zzgsg zze(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgsg) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public static /* synthetic */ void zzh(zzgsg zzgsgVar, zzgsj zzgsjVar) {
        zzgsjVar.getClass();
        zzgsgVar.zze = zzgsjVar;
        zzgsgVar.zzc |= 1;
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
                return zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzgsg();
            case 4:
                return new zzgsf(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgsg.class) {
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
        zzgsj zzgsjVar = this.zze;
        return zzgsjVar == null ? zzgsj.zze() : zzgsjVar;
    }
}
