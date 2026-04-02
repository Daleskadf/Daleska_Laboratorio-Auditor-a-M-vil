package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhfn extends zzgzv implements zzhbm {
    private static final zzhfn zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzhfm zzd;
    private int zzh;
    private byte zzi = 2;
    private zzhah zze = zzbK();
    private zzgyj zzf = zzgyj.zzb;
    private zzgyj zzg = zzgyj.zzb;

    static {
        zzhfn zzhfnVar = new zzhfn();
        zza = zzhfnVar;
        zzgzv.zzca(zzhfn.class, zzhfnVar);
    }

    private zzhfn() {
    }

    public static zzhfk zzc() {
        return (zzhfk) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhfn zzhfnVar, zzhfj zzhfjVar) {
        zzhfjVar.getClass();
        zzhah zzhahVar = zzhfnVar.zze;
        if (!zzhahVar.zzc()) {
            zzhfnVar.zze = zzgzv.zzbL(zzhahVar);
        }
        zzhfnVar.zze.add(zzhfjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        switch (zzgzuVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzi);
            case 1:
                this.zzi = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return zzbR(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", zzhfj.class, "zzf", "zzg", "zzh"});
            case 3:
                return new zzhfn();
            case 4:
                return new zzhfk(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzhfn.class) {
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
