package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgtz extends zzgzv implements zzhbm {
    private static final zzgtz zza;
    private static volatile zzhbt zzb;

    static {
        zzgtz zzgtzVar = new zzgtz();
        zza = zzgtzVar;
        zzgzv.zzca(zzgtz.class, zzgtzVar);
    }

    private zzgtz() {
    }

    public static zzgtz zzc() {
        return zza;
    }

    public static zzgtz zzd(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgtz) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
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
                return zzbR(zza, "\u0000\u0000", null);
            case 3:
                return new zzgtz();
            case 4:
                return new zzgty(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgtz.class) {
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
