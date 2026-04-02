package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgvb extends zzgzv implements zzhbm {
    private static final zzgvb zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzgup zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgvb zzgvbVar = new zzgvb();
        zza = zzgvbVar;
        zzgzv.zzca(zzgvb.class, zzgvbVar);
    }

    private zzgvb() {
    }

    public static zzgva zze() {
        return (zzgva) zza.zzaZ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzgvb zzgvbVar, zzgup zzgupVar) {
        zzgupVar.getClass();
        zzgvbVar.zzd = zzgupVar;
        zzgvbVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgup zzc() {
        zzgup zzgupVar = this.zzd;
        return zzgupVar == null ? zzgup.zze() : zzgupVar;
    }

    public final zzgur zzd() {
        zzgur zzb2 = zzgur.zzb(this.zze);
        return zzb2 == null ? zzgur.UNRECOGNIZED : zzb2;
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
                return zzbR(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new zzgvb();
            case 4:
                return new zzgva(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgvb.class) {
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

    public final zzgvv zzg() {
        zzgvv zzb2 = zzgvv.zzb(this.zzg);
        return zzb2 == null ? zzgvv.UNRECOGNIZED : zzb2;
    }

    public final boolean zzl() {
        return (this.zzc & 1) != 0;
    }
}
