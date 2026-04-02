package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgvh extends zzgzv implements zzhbm {
    private static final zzgvh zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzhah zzd = zzbK();

    static {
        zzgvh zzgvhVar = new zzgvh();
        zza = zzgvhVar;
        zzgzv.zzca(zzgvh.class, zzgvhVar);
    }

    private zzgvh() {
    }

    public static zzgve zza() {
        return (zzgve) zza.zzaZ();
    }

    public static /* synthetic */ zzgvh zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzgvh zzgvhVar, int i) {
        zzgvhVar.zzc = i;
    }

    public static /* synthetic */ void zze(zzgvh zzgvhVar, zzgvg zzgvgVar) {
        zzgvgVar.getClass();
        zzhah zzhahVar = zzgvhVar.zzd;
        if (!zzhahVar.zzc()) {
            zzgvhVar.zzd = zzgzv.zzbL(zzhahVar);
        }
        zzgvhVar.zzd.add(zzgvgVar);
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
                return zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgvg.class});
            case 3:
                return new zzgvh();
            case 4:
                return new zzgve(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgvh.class) {
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
