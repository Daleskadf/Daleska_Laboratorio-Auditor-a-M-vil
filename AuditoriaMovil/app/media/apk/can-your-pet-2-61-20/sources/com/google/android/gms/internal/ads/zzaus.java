package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaus extends zzgzv implements zzhbm {
    private static final zzaus zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private long zzd;
    private String zze = "";
    private zzgyj zzf = zzgyj.zzb;

    static {
        zzaus zzausVar = new zzaus();
        zza = zzausVar;
        zzgzv.zzca(zzaus.class, zzausVar);
    }

    private zzaus() {
    }

    public static zzaus zzd() {
        return zza;
    }

    public final long zza() {
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
                return zzbR(zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new zzaus();
            case 4:
                return new zzaur(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzaus.class) {
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

    public final boolean zze() {
        return (this.zzc & 1) != 0;
    }
}
