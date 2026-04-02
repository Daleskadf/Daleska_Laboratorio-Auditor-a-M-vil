package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzguu extends zzgzv implements zzhbm {
    private static final zzguu zza;
    private static volatile zzhbt zzb;
    private String zzc = "";
    private zzgyj zzd = zzgyj.zzb;
    private int zze;

    static {
        zzguu zzguuVar = new zzguu();
        zza = zzguuVar;
        zzgzv.zzca(zzguu.class, zzguuVar);
    }

    private zzguu() {
    }

    public static zzgut zza() {
        return (zzgut) zza.zzaZ();
    }

    public static zzgut zzc(zzguu zzguuVar) {
        return (zzgut) zza.zzba(zzguuVar);
    }

    public static zzguu zze() {
        return zza;
    }

    public static zzguu zzf(byte[] bArr, zzgzf zzgzfVar) throws zzhak {
        return (zzguu) zzgzv.zzbx(zza, bArr, zzgzfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzguu zzguuVar, String str) {
        str.getClass();
        zzguuVar.zzc = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(zzguu zzguuVar, zzgyj zzgyjVar) {
        zzgyjVar.getClass();
        zzguuVar.zzd = zzgyjVar;
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
                return zzbR(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzguu();
            case 4:
                return new zzgut(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzguu.class) {
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
        zzgvv zzb2 = zzgvv.zzb(this.zze);
        return zzb2 == null ? zzgvv.UNRECOGNIZED : zzb2;
    }

    public final zzgyj zzh() {
        return this.zzd;
    }

    public final String zzi() {
        return this.zzc;
    }
}
