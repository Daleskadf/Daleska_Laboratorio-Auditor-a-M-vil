package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfmc extends zzgzv implements zzhbm {
    private static final zzfmc zza;
    private static volatile zzhbt zzb;
    private zzhah zzc = zzbK();

    static {
        zzfmc zzfmcVar = new zzfmc();
        zza = zzfmcVar;
        zzgzv.zzca(zzfmc.class, zzfmcVar);
    }

    private zzfmc() {
    }

    public static zzflz zzc() {
        return (zzflz) zza.zzaZ();
    }

    public static /* synthetic */ zzfmc zzd() {
        return zza;
    }

    public static /* synthetic */ void zze(zzfmc zzfmcVar) {
        zzfmcVar.zzc = zzbK();
    }

    public static /* synthetic */ void zzf(zzfmc zzfmcVar, zzfmb zzfmbVar) {
        zzfmbVar.getClass();
        zzhah zzhahVar = zzfmcVar.zzc;
        if (!zzhahVar.zzc()) {
            zzfmcVar.zzc = zzgzv.zzbL(zzhahVar);
        }
        zzfmcVar.zzc.add(zzfmbVar);
    }

    public final int zza() {
        return this.zzc.size();
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
                return zzbR(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzfmb.class});
            case 3:
                return new zzfmc();
            case 4:
                return new zzflz(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzfmc.class) {
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
