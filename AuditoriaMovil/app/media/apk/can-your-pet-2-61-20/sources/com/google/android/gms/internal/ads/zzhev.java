package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhev extends zzgzv implements zzhbm {
    private static final zzhev zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private String zzd = "";

    static {
        zzhev zzhevVar = new zzhev();
        zza = zzhevVar;
        zzgzv.zzca(zzhev.class, zzhevVar);
    }

    private zzhev() {
    }

    public static zzheu zzc() {
        return (zzheu) zza.zzaZ();
    }

    public static /* synthetic */ zzhev zze() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhev zzhevVar, String str) {
        zzhevVar.zzc |= 1;
        zzhevVar.zzd = str;
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
                return zzbR(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
            case 3:
                return new zzhev();
            case 4:
                return new zzheu(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzhev.class) {
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
