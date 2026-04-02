package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgte extends zzgzv implements zzhbm {
    private static final zzgte zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzgth zzd;
    private int zze;

    static {
        zzgte zzgteVar = new zzgte();
        zza = zzgteVar;
        zzgzv.zzca(zzgte.class, zzgteVar);
    }

    private zzgte() {
    }

    public static zzgtd zzc() {
        return (zzgtd) zza.zzaZ();
    }

    public static zzgte zze(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgte) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public static /* synthetic */ void zzg(zzgte zzgteVar, zzgth zzgthVar) {
        zzgthVar.getClass();
        zzgteVar.zzd = zzgthVar;
        zzgteVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
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
                return zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzgte();
            case 4:
                return new zzgtd(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgte.class) {
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

    public final zzgth zzf() {
        zzgth zzgthVar = this.zzd;
        return zzgthVar == null ? zzgth.zze() : zzgthVar;
    }
}
