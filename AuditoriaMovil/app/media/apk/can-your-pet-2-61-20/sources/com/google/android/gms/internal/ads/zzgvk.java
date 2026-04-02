package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgvk extends zzgzv implements zzhbm {
    private static final zzgvk zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;
    private zzgvn zze;

    static {
        zzgvk zzgvkVar = new zzgvk();
        zza = zzgvkVar;
        zzgzv.zzca(zzgvk.class, zzgvkVar);
    }

    private zzgvk() {
    }

    public static zzgvj zzc() {
        return (zzgvj) zza.zzaZ();
    }

    public static zzgvk zze(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgvk) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public static zzhbt zzg() {
        return zza.zzbM();
    }

    public static /* synthetic */ void zzh(zzgvk zzgvkVar, zzgvn zzgvnVar) {
        zzgvnVar.getClass();
        zzgvkVar.zze = zzgvnVar;
        zzgvkVar.zzc |= 1;
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
                return new zzgvk();
            case 4:
                return new zzgvj(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgvk.class) {
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

    public final zzgvn zzf() {
        zzgvn zzgvnVar = this.zze;
        return zzgvnVar == null ? zzgvn.zzd() : zzgvnVar;
    }
}
