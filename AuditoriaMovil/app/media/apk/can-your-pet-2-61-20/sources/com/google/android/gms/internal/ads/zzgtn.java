package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgtn extends zzgzv implements zzhbm {
    private static final zzgtn zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;

    static {
        zzgtn zzgtnVar = new zzgtn();
        zza = zzgtnVar;
        zzgzv.zzca(zzgtn.class, zzgtnVar);
    }

    private zzgtn() {
    }

    public static zzgtm zzd() {
        return (zzgtm) zza.zzaZ();
    }

    public static zzgtn zzf(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgtn) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzc() {
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
                return zzbR(zza, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd"});
            case 3:
                return new zzgtn();
            case 4:
                return new zzgtm(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgtn.class) {
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
