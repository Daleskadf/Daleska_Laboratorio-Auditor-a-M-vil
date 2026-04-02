package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzgvy extends zzgzv implements zzhbm {
    private static final zzgvy zza;
    private static volatile zzhbt zzb;
    private String zzc = "";
    private zzhah zzd = zzbK();

    static {
        zzgvy zzgvyVar = new zzgvy();
        zza = zzgvyVar;
        zzgzv.zzca(zzgvy.class, zzgvyVar);
    }

    private zzgvy() {
    }

    public static zzgvy zzc() {
        return zza;
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
                return zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzc", "zzd", zzgux.class});
            case 3:
                return new zzgvy();
            case 4:
                return new zzgvx(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgvy.class) {
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
