package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhdw extends zzgzv implements zzhbm {
    private static final zzhdw zza;
    private static volatile zzhbt zzb;
    private zzhah zzc = zzbK();

    static {
        zzhdw zzhdwVar = new zzhdw();
        zza = zzhdwVar;
        zzgzv.zzca(zzhdw.class, zzhdwVar);
    }

    private zzhdw() {
    }

    public static zzhdv zzc() {
        return (zzhdv) zza.zzaZ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzhdw zzhdwVar, zzhdu zzhduVar) {
        zzhduVar.getClass();
        zzhah zzhahVar = zzhdwVar.zzc;
        if (!zzhahVar.zzc()) {
            zzhdwVar.zzc = zzgzv.zzbL(zzhahVar);
        }
        zzhdwVar.zzc.add(zzhduVar);
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
                return zzbR(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzhdu.class});
            case 3:
                return new zzhdw();
            case 4:
                return new zzhdv(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzhdw.class) {
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
