package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzauw extends zzgzv implements zzhbm {
    private static final zzauw zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzhah zzd = zzbK();
    private zzgyj zze = zzgyj.zzb;
    private int zzf = 1;
    private int zzg = 1;

    static {
        zzauw zzauwVar = new zzauw();
        zza = zzauwVar;
        zzgzv.zzca(zzauw.class, zzauwVar);
    }

    private zzauw() {
    }

    public static zzauv zza() {
        return (zzauv) zza.zzaZ();
    }

    public static /* synthetic */ void zzd(zzauw zzauwVar, zzgyj zzgyjVar) {
        zzhah zzhahVar = zzauwVar.zzd;
        if (!zzhahVar.zzc()) {
            zzauwVar.zzd = zzgzv.zzbL(zzhahVar);
        }
        zzauwVar.zzd.add(zzgyjVar);
    }

    public static /* synthetic */ void zze(zzauw zzauwVar, zzgyj zzgyjVar) {
        zzauwVar.zzc |= 1;
        zzauwVar.zze = zzgyjVar;
    }

    public static /* synthetic */ void zzf(zzauw zzauwVar, zzauk zzaukVar) {
        zzauwVar.zzg = zzaukVar.zza();
        zzauwVar.zzc |= 4;
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
                return zzbR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", zzaup.zza, "zzg", zzauj.zza});
            case 3:
                return new zzauw();
            case 4:
                return new zzauv(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzauw.class) {
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
