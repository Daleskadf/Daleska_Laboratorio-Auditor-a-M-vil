package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgup extends zzgzv implements zzhbm {
    private static final zzgup zza;
    private static volatile zzhbt zzb;
    private String zzc = "";
    private zzgyj zzd = zzgyj.zzb;
    private int zze;

    static {
        zzgup zzgupVar = new zzgup();
        zza = zzgupVar;
        zzgzv.zzca(zzgup.class, zzgupVar);
    }

    private zzgup() {
    }

    public static zzgum zza() {
        return (zzgum) zza.zzaZ();
    }

    public static zzgup zze() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzgup zzgupVar, String str) {
        str.getClass();
        zzgupVar.zzc = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzgup zzgupVar, zzgyj zzgyjVar) {
        zzgyjVar.getClass();
        zzgupVar.zzd = zzgyjVar;
    }

    public final zzguo zzc() {
        zzguo zzb2 = zzguo.zzb(this.zze);
        return zzb2 == null ? zzguo.UNRECOGNIZED : zzb2;
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
                return new zzgup();
            case 4:
                return new zzgum(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgup.class) {
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

    public final zzgyj zzf() {
        return this.zzd;
    }

    public final String zzg() {
        return this.zzc;
    }
}
