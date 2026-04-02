package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgtk extends zzgzv implements zzhbm {
    private static final zzgtk zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzgyj zzd = zzgyj.zzb;

    static {
        zzgtk zzgtkVar = new zzgtk();
        zza = zzgtkVar;
        zzgzv.zzca(zzgtk.class, zzgtkVar);
    }

    private zzgtk() {
    }

    public static zzgtj zzc() {
        return (zzgtj) zza.zzaZ();
    }

    public static zzgtk zze(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgtk) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public static zzhbt zzg() {
        return zza.zzbM();
    }

    public final int zza() {
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
                return zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
            case 3:
                return new zzgtk();
            case 4:
                return new zzgtj(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgtk.class) {
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
}
