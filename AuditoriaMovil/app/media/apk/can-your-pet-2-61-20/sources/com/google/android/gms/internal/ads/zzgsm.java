package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgsm extends zzgzv implements zzhbm {
    private static final zzgsm zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;
    private zzgss zze;
    private zzgue zzf;

    static {
        zzgsm zzgsmVar = new zzgsm();
        zza = zzgsmVar;
        zzgzv.zzca(zzgsm.class, zzgsmVar);
    }

    private zzgsm() {
    }

    public static zzgsl zzc() {
        return (zzgsl) zza.zzaZ();
    }

    public static zzgsm zze(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgsm) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public static zzhbt zzh() {
        return zza.zzbM();
    }

    public static /* synthetic */ void zzi(zzgsm zzgsmVar, zzgss zzgssVar) {
        zzgssVar.getClass();
        zzgsmVar.zze = zzgssVar;
        zzgsmVar.zzc |= 1;
    }

    public static /* synthetic */ void zzj(zzgsm zzgsmVar, zzgue zzgueVar) {
        zzgueVar.getClass();
        zzgsmVar.zzf = zzgueVar;
        zzgsmVar.zzc |= 2;
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
                return zzbR(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new zzgsm();
            case 4:
                return new zzgsl(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgsm.class) {
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

    public final zzgss zzf() {
        zzgss zzgssVar = this.zze;
        return zzgssVar == null ? zzgss.zze() : zzgssVar;
    }

    public final zzgue zzg() {
        zzgue zzgueVar = this.zzf;
        return zzgueVar == null ? zzgue.zze() : zzgueVar;
    }
}
