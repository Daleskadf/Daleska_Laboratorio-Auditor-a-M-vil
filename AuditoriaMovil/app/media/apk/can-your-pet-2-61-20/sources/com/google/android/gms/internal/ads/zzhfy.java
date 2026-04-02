package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzhfy extends zzgzv implements zzhbm {
    private static final zzhfy zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;
    private zzhfx zze;
    private zzhfx zzf;

    static {
        zzhfy zzhfyVar = new zzhfy();
        zza = zzhfyVar;
        zzgzv.zzca(zzhfy.class, zzhfyVar);
    }

    private zzhfy() {
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
                return zzbR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzc", "zzd", zzhfu.zza, "zze", "zzf"});
            case 3:
                return new zzhfy();
            case 4:
                return new zzhfs(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzhfy.class) {
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
