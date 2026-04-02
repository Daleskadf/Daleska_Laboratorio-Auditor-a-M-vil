package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhfj extends zzgzv implements zzhbm {
    private static final zzhfj zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private byte zzf = 2;
    private zzgyj zzd = zzgyj.zzb;
    private zzgyj zze = zzgyj.zzb;

    static {
        zzhfj zzhfjVar = new zzhfj();
        zza = zzhfjVar;
        zzgzv.zzca(zzhfj.class, zzhfjVar);
    }

    private zzhfj() {
    }

    public static zzhfi zzc() {
        return (zzhfi) zza.zzaZ();
    }

    public static /* synthetic */ zzhfj zze() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhfj zzhfjVar, zzgyj zzgyjVar) {
        zzhfjVar.zzc |= 1;
        zzhfjVar.zzd = zzgyjVar;
    }

    public static /* synthetic */ void zzg(zzhfj zzhfjVar, zzgyj zzgyjVar) {
        zzhfjVar.zzc |= 2;
        zzhfjVar.zze = zzgyjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        switch (zzgzuVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzf);
            case 1:
                this.zzf = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return zzbR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzhfj();
            case 4:
                return new zzhfi(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzhfj.class) {
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
