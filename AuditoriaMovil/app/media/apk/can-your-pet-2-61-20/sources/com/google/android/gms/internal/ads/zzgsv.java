package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgsv extends zzgzv implements zzhbm {
    private static final zzgsv zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzgsy zzd;
    private int zze;

    static {
        zzgsv zzgsvVar = new zzgsv();
        zza = zzgsvVar;
        zzgzv.zzca(zzgsv.class, zzgsvVar);
    }

    private zzgsv() {
    }

    public static zzgsu zzc() {
        return (zzgsu) zza.zzaZ();
    }

    public static zzgsv zze() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzgsv zzgsvVar, zzgsy zzgsyVar) {
        zzgsyVar.getClass();
        zzgsvVar.zzd = zzgsyVar;
        zzgsvVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
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
                return zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzgsv();
            case 4:
                return new zzgsu(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgsv.class) {
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
        zzgsy zzgsyVar = this.zzd;
        return zzgsyVar == null ? zzgsy.zze() : zzgsyVar;
    }
}
