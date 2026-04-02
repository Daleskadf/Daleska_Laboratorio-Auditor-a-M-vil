package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzazn extends zzgzv implements zzhbm {
    private static final zzazn zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        zzazn zzaznVar = new zzazn();
        zza = zzaznVar;
        zzgzv.zzca(zzazn.class, zzaznVar);
    }

    private zzazn() {
    }

    public static zzazm zze() {
        return (zzazm) zza.zzaZ();
    }

    public static zzazn zzg() {
        return zza;
    }

    public static zzazn zzh(zzgyj zzgyjVar) throws zzhak {
        return (zzazn) zzgzv.zzbm(zza, zzgyjVar);
    }

    public static zzazn zzi(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        return (zzazn) zzgzv.zzbr(zza, zzgyjVar, zzgzfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(zzazn zzaznVar, String str) {
        str.getClass();
        zzaznVar.zzc |= 1;
        zzaznVar.zzd = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzazn zzaznVar, long j) {
        zzaznVar.zzc |= 16;
        zzaznVar.zzh = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzn(zzazn zzaznVar, String str) {
        str.getClass();
        zzaznVar.zzc |= 2;
        zzaznVar.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzo(zzazn zzaznVar, long j) {
        zzaznVar.zzc |= 4;
        zzaznVar.zzf = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzp(zzazn zzaznVar, long j) {
        zzaznVar.zzc |= 8;
        zzaznVar.zzg = j;
    }

    public final long zza() {
        return this.zzg;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final long zzd() {
        return this.zzh;
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
                return zzbR(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 3:
                return new zzazn();
            case 4:
                return new zzazm(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzazn.class) {
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

    public final String zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
