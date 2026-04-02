package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzguh extends zzgzv implements zzhbm {
    private static final zzguh zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzguk zzd;
    private int zze;
    private int zzf;

    static {
        zzguh zzguhVar = new zzguh();
        zza = zzguhVar;
        zzgzv.zzca(zzguh.class, zzguhVar);
    }

    private zzguh() {
    }

    public static zzgug zzd() {
        return (zzgug) zza.zzaZ();
    }

    public static zzguh zzf() {
        return zza;
    }

    public static zzguh zzg(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzguh) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public static /* synthetic */ void zzi(zzguh zzguhVar, zzguk zzgukVar) {
        zzgukVar.getClass();
        zzguhVar.zzd = zzgukVar;
        zzguhVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzc() {
        return this.zzf;
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
                return zzbR(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new zzguh();
            case 4:
                return new zzgug(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzguh.class) {
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

    public final zzguk zzh() {
        zzguk zzgukVar = this.zzd;
        return zzgukVar == null ? zzguk.zzf() : zzgukVar;
    }
}
