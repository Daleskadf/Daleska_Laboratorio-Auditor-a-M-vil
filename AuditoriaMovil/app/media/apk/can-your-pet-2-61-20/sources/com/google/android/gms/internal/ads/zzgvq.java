package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgvq extends zzgzv implements zzhbm {
    private static final zzgvq zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;
    private zzgvt zze;

    static {
        zzgvq zzgvqVar = new zzgvq();
        zza = zzgvqVar;
        zzgzv.zzca(zzgvq.class, zzgvqVar);
    }

    private zzgvq() {
    }

    public static zzgvp zzc() {
        return (zzgvp) zza.zzaZ();
    }

    public static zzgvq zze(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgvq) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public static zzhbt zzg() {
        return zza.zzbM();
    }

    public static /* synthetic */ void zzh(zzgvq zzgvqVar, zzgvt zzgvtVar) {
        zzgvtVar.getClass();
        zzgvqVar.zze = zzgvtVar;
        zzgvqVar.zzc |= 1;
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
                return new zzgvq();
            case 4:
                return new zzgvp(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgvq.class) {
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

    public final zzgvt zzf() {
        zzgvt zzgvtVar = this.zze;
        return zzgvtVar == null ? zzgvt.zze() : zzgvtVar;
    }
}
