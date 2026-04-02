package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzauh extends zzgzv implements zzhbm {
    private static final zzauh zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzgyj zzd = zzgyj.zzb;
    private zzgyj zze;
    private zzgyj zzf;
    private zzgyj zzg;

    static {
        zzauh zzauhVar = new zzauh();
        zza = zzauhVar;
        zzgzv.zzca(zzauh.class, zzauhVar);
    }

    private zzauh() {
        zzgyj zzgyjVar = zzgyj.zzb;
        this.zze = zzgyjVar;
        this.zzf = zzgyjVar;
        this.zzg = zzgyjVar;
    }

    public static zzaug zza() {
        return (zzaug) zza.zzaZ();
    }

    public static zzauh zzd(byte[] bArr, zzgzf zzgzfVar) throws zzhak {
        return (zzauh) zzgzv.zzbx(zza, bArr, zzgzfVar);
    }

    public static /* synthetic */ void zzi(zzauh zzauhVar, zzgyj zzgyjVar) {
        zzauhVar.zzc |= 1;
        zzauhVar.zzd = zzgyjVar;
    }

    public static /* synthetic */ void zzj(zzauh zzauhVar, zzgyj zzgyjVar) {
        zzauhVar.zzc |= 2;
        zzauhVar.zze = zzgyjVar;
    }

    public static /* synthetic */ void zzk(zzauh zzauhVar, zzgyj zzgyjVar) {
        zzauhVar.zzc |= 4;
        zzauhVar.zzf = zzgyjVar;
    }

    public static /* synthetic */ void zzl(zzauh zzauhVar, zzgyj zzgyjVar) {
        zzauhVar.zzc |= 8;
        zzauhVar.zzg = zzgyjVar;
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
                return zzbR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new zzauh();
            case 4:
                return new zzaug(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzauh.class) {
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

    public final zzgyj zze() {
        return this.zzd;
    }

    public final zzgyj zzf() {
        return this.zze;
    }

    public final zzgyj zzg() {
        return this.zzg;
    }

    public final zzgyj zzh() {
        return this.zzf;
    }
}
