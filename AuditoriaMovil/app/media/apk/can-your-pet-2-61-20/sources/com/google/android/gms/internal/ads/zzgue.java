package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgue extends zzgzv implements zzhbm {
    private static final zzgue zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;
    private zzguk zze;
    private zzgyj zzf = zzgyj.zzb;

    static {
        zzgue zzgueVar = new zzgue();
        zza = zzgueVar;
        zzgzv.zzca(zzgue.class, zzgueVar);
    }

    private zzgue() {
    }

    public static zzgud zzc() {
        return (zzgud) zza.zzaZ();
    }

    public static zzgue zze() {
        return zza;
    }

    public static zzgue zzf(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgue) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public static zzhbt zzi() {
        return zza.zzbM();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzgue zzgueVar, zzguk zzgukVar) {
        zzgukVar.getClass();
        zzgueVar.zze = zzgukVar;
        zzgueVar.zzc |= 1;
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
                return zzbR(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new zzgue();
            case 4:
                return new zzgud(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgue.class) {
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

    public final zzguk zzg() {
        zzguk zzgukVar = this.zze;
        return zzgukVar == null ? zzguk.zzf() : zzgukVar;
    }

    public final zzgyj zzh() {
        return this.zzf;
    }
}
