package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaua extends zzgzv implements zzhbm {
    private static final zzaua zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private long zzw;
    private long zzx;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private int zzj = 1000;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;
    private int zzn = 1000;
    private long zzo = -1;
    private long zzp = -1;
    private long zzu = -1;
    private long zzv = -1;
    private long zzy = -1;
    private long zzz = -1;
    private long zzA = -1;
    private long zzB = -1;

    static {
        zzaua zzauaVar = new zzaua();
        zza = zzauaVar;
        zzgzv.zzca(zzaua.class, zzauaVar);
    }

    private zzaua() {
    }

    public static zzatz zza() {
        return (zzatz) zza.zzaZ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzaua zzauaVar, long j) {
        zzauaVar.zzc |= 1;
        zzauaVar.zzd = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzaua zzauaVar, long j) {
        zzauaVar.zzc |= 2;
        zzauaVar.zze = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzaua zzauaVar, long j) {
        zzauaVar.zzc |= 4;
        zzauaVar.zzf = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzaua zzauaVar, long j) {
        zzauaVar.zzc |= 8;
        zzauaVar.zzg = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzaua zzauaVar) {
        zzauaVar.zzc &= -9;
        zzauaVar.zzg = -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzaua zzauaVar, long j) {
        zzauaVar.zzc |= 16;
        zzauaVar.zzh = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzaua zzauaVar, long j) {
        zzauaVar.zzc |= 32;
        zzauaVar.zzi = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(zzaua zzauaVar, zzaun zzaunVar) {
        zzauaVar.zzj = zzaunVar.zza();
        zzauaVar.zzc |= 64;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(zzaua zzauaVar, long j) {
        zzauaVar.zzc |= 128;
        zzauaVar.zzk = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzaua zzauaVar, long j) {
        zzauaVar.zzc |= 256;
        zzauaVar.zzl = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzn(zzaua zzauaVar, long j) {
        zzauaVar.zzc |= 512;
        zzauaVar.zzm = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzo(zzaua zzauaVar, zzaun zzaunVar) {
        zzauaVar.zzn = zzaunVar.zza();
        zzauaVar.zzc |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzp(zzaua zzauaVar, long j) {
        zzauaVar.zzc |= 2048;
        zzauaVar.zzo = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzq(zzaua zzauaVar, long j) {
        zzauaVar.zzc |= 4096;
        zzauaVar.zzp = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzr(zzaua zzauaVar, long j) {
        zzauaVar.zzc |= 8192;
        zzauaVar.zzu = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzs(zzaua zzauaVar, long j) {
        zzauaVar.zzc |= 16384;
        zzauaVar.zzv = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzt(zzaua zzauaVar, long j) {
        zzauaVar.zzc |= 32768;
        zzauaVar.zzw = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzu(zzaua zzauaVar, long j) {
        zzauaVar.zzc |= 65536;
        zzauaVar.zzx = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzv(zzaua zzauaVar, long j) {
        zzauaVar.zzc |= 131072;
        zzauaVar.zzy = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzw(zzaua zzauaVar, long j) {
        zzauaVar.zzc |= 262144;
        zzauaVar.zzz = j;
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
                return zzbR(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzaum.zza, "zzk", "zzl", "zzm", "zzn", zzaum.zza, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
            case 3:
                return new zzaua();
            case 4:
                return new zzatz(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzaua.class) {
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
