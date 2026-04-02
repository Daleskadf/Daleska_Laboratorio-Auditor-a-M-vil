package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgvg extends zzgzv implements zzhbm {
    private static final zzgvg zza;
    private static volatile zzhbt zzb;
    private String zzc = "";
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzgvg zzgvgVar = new zzgvg();
        zza = zzgvgVar;
        zzgzv.zzca(zzgvg.class, zzgvgVar);
    }

    private zzgvg() {
    }

    public static zzgvf zza() {
        return (zzgvf) zza.zzaZ();
    }

    public static /* synthetic */ zzgvg zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzgvg zzgvgVar, String str) {
        str.getClass();
        zzgvgVar.zzc = str;
    }

    public static /* synthetic */ void zze(zzgvg zzgvgVar, zzgvv zzgvvVar) {
        zzgvgVar.zzf = zzgvvVar.zza();
    }

    public static /* synthetic */ void zzf(zzgvg zzgvgVar, zzgur zzgurVar) {
        zzgvgVar.zzd = zzgurVar.zza();
    }

    public static /* synthetic */ void zzg(zzgvg zzgvgVar, int i) {
        zzgvgVar.zze = i;
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
                return zzbR(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 3:
                return new zzgvg();
            case 4:
                return new zzgvf(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgvg.class) {
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
