package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzguk extends zzgzv implements zzhbm {
    private static final zzguk zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;

    static {
        zzguk zzgukVar = new zzguk();
        zza = zzgukVar;
        zzgzv.zzca(zzguk.class, zzgukVar);
    }

    private zzguk() {
    }

    public static zzguj zzd() {
        return (zzguj) zza.zzaZ();
    }

    public static zzguk zzf() {
        return zza;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzgub zzc() {
        zzgub zzb2 = zzgub.zzb(this.zzc);
        return zzb2 == null ? zzgub.UNRECOGNIZED : zzb2;
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
                return zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
            case 3:
                return new zzguk();
            case 4:
                return new zzguj(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzguk.class) {
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
