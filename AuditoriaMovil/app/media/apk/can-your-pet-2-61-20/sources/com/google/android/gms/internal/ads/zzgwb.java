package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgwb extends zzgzv implements zzhbm {
    private static final zzgwb zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzgyj zzd = zzgyj.zzb;

    static {
        zzgwb zzgwbVar = new zzgwb();
        zza = zzgwbVar;
        zzgzv.zzca(zzgwb.class, zzgwbVar);
    }

    private zzgwb() {
    }

    public static zzgwa zzc() {
        return (zzgwa) zza.zzaZ();
    }

    public static /* synthetic */ zzgwb zzd() {
        return zza;
    }

    public static zzgwb zze(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgwb) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public static zzhbt zzg() {
        return zza.zzbM();
    }

    public static /* synthetic */ void zzh(zzgwb zzgwbVar, zzgyj zzgyjVar) {
        zzgwbVar.zzd = zzgyjVar;
    }

    public final int zza() {
        return this.zzc;
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
                return zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
            case 3:
                return new zzgwb();
            case 4:
                return new zzgwa(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgwb.class) {
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

    public final zzgyj zzf() {
        return this.zzd;
    }
}
