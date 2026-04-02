package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhgp extends zzgzv implements zzhbm {
    private static final zzhgp zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzgyj zzf = zzgyj.zzb;
    private zzgyj zzg = zzgyj.zzb;

    static {
        zzhgp zzhgpVar = new zzhgp();
        zza = zzhgpVar;
        zzgzv.zzca(zzhgp.class, zzhgpVar);
    }

    private zzhgp() {
    }

    public static zzhgl zzc() {
        return (zzhgl) zza.zzaZ();
    }

    public static /* synthetic */ zzhgp zze() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhgp zzhgpVar, zzhgo zzhgoVar) {
        zzhgpVar.zzd = zzhgoVar.zza();
        zzhgpVar.zzc |= 1;
    }

    public static /* synthetic */ void zzg(zzhgp zzhgpVar, String str) {
        zzhgpVar.zzc |= 2;
        zzhgpVar.zze = "image/png";
    }

    public static /* synthetic */ void zzh(zzhgp zzhgpVar, zzgyj zzgyjVar) {
        zzgyjVar.getClass();
        zzhgpVar.zzc |= 4;
        zzhgpVar.zzf = zzgyjVar;
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
                return zzbR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", zzhgn.zza, "zze", "zzf", "zzg"});
            case 3:
                return new zzhgp();
            case 4:
                return new zzhgl(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzhgp.class) {
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
