package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgss extends zzgzv implements zzhbm {
    private static final zzgss zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;
    private zzgsy zze;
    private zzgyj zzf = zzgyj.zzb;

    static {
        zzgss zzgssVar = new zzgss();
        zza = zzgssVar;
        zzgzv.zzca(zzgss.class, zzgssVar);
    }

    private zzgss() {
    }

    public static zzgsr zzc() {
        return (zzgsr) zza.zzaZ();
    }

    public static zzgss zze() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzgss zzgssVar, zzgsy zzgsyVar) {
        zzgsyVar.getClass();
        zzgssVar.zze = zzgsyVar;
        zzgssVar.zzc |= 1;
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
                return zzbR(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new zzgss();
            case 4:
                return new zzgsr(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgss.class) {
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

    public final zzgsy zzf() {
        zzgsy zzgsyVar = this.zze;
        return zzgsyVar == null ? zzgsy.zze() : zzgsyVar;
    }

    public final zzgyj zzg() {
        return this.zzf;
    }
}
