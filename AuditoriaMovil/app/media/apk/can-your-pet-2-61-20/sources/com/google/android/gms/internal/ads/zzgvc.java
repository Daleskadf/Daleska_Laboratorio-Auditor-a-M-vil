package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgvc extends zzgzv implements zzhbm {
    private static final zzgvc zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzhah zzd = zzbK();

    static {
        zzgvc zzgvcVar = new zzgvc();
        zza = zzgvcVar;
        zzgzv.zzca(zzgvc.class, zzgvcVar);
    }

    private zzgvc() {
    }

    public static zzguz zzd() {
        return (zzguz) zza.zzaZ();
    }

    public static zzgvc zzg(InputStream inputStream, zzgzf zzgzfVar) throws IOException {
        return (zzgvc) zzgzv.zzbu(zza, inputStream, zzgzfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzgvc zzgvcVar, zzgvb zzgvbVar) {
        zzgvbVar.getClass();
        zzhah zzhahVar = zzgvcVar.zzd;
        if (!zzhahVar.zzc()) {
            zzgvcVar.zzd = zzgzv.zzbL(zzhahVar);
        }
        zzgvcVar.zzd.add(zzgvbVar);
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final int zzc() {
        return this.zzc;
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
                return zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgvb.class});
            case 3:
                return new zzgvc();
            case 4:
                return new zzguz(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgvc.class) {
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

    public final zzgvb zze(int i) {
        return (zzgvb) this.zzd.get(i);
    }

    public final List zzh() {
        return this.zzd;
    }
}
