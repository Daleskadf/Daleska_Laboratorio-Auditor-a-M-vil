package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgvn extends zzgzv implements zzhbm {
    private static final zzgvn zza;
    private static volatile zzhbt zzb;
    private String zzc = "";

    static {
        zzgvn zzgvnVar = new zzgvn();
        zza = zzgvnVar;
        zzgzv.zzca(zzgvn.class, zzgvnVar);
    }

    private zzgvn() {
    }

    public static zzgvm zza() {
        return (zzgvm) zza.zzaZ();
    }

    public static zzgvn zzd() {
        return zza;
    }

    public static zzgvn zze(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzgvn) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    public static /* synthetic */ void zzg(zzgvn zzgvnVar, String str) {
        str.getClass();
        zzgvnVar.zzc = str;
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
                return zzbR(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
            case 3:
                return new zzgvn();
            case 4:
                return new zzgvm(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzgvn.class) {
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

    public final String zzf() {
        return this.zzc;
    }
}
