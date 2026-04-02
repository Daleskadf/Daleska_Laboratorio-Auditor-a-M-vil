package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfmb extends zzgzv implements zzhbm {
    private static final zzfmb zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzflx zzd;

    static {
        zzfmb zzfmbVar = new zzfmb();
        zza = zzfmbVar;
        zzgzv.zzca(zzfmb.class, zzfmbVar);
    }

    private zzfmb() {
    }

    public static zzfma zza() {
        return (zzfma) zza.zzaZ();
    }

    public static /* synthetic */ zzfmb zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzfmb zzfmbVar, zzflx zzflxVar) {
        zzflxVar.getClass();
        zzfmbVar.zzd = zzflxVar;
        zzfmbVar.zzc |= 1;
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
                return zzbR(zza, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
            case 3:
                return new zzfmb();
            case 4:
                return new zzfma(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzfmb.class) {
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
