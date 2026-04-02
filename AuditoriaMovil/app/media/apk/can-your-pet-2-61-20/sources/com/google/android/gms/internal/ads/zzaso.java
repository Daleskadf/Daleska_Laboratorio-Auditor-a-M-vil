package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaso extends zzgzv implements zzhbm {
    private static final zzaso zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private String zzd = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzk = "";
    private String zzm = "";
    private String zzn = "";
    private zzhah zzo = zzbK();

    static {
        zzaso zzasoVar = new zzaso();
        zza = zzasoVar;
        zzgzv.zzca(zzaso.class, zzasoVar);
    }

    private zzaso() {
    }

    public static zzasi zza() {
        return (zzasi) zza.zzaZ();
    }

    public static /* synthetic */ void zzd(zzaso zzasoVar, long j) {
        zzasoVar.zzc |= 2;
        zzasoVar.zze = j;
    }

    public static /* synthetic */ void zze(zzaso zzasoVar, String str) {
        str.getClass();
        zzasoVar.zzc |= 4;
        zzasoVar.zzf = str;
    }

    public static /* synthetic */ void zzf(zzaso zzasoVar, String str) {
        str.getClass();
        zzasoVar.zzc |= 8;
        zzasoVar.zzg = str;
    }

    public static /* synthetic */ void zzg(zzaso zzasoVar, String str) {
        zzasoVar.zzc |= 16;
        zzasoVar.zzh = str;
    }

    public static /* synthetic */ void zzh(zzaso zzasoVar, String str) {
        zzasoVar.zzc |= 1024;
        zzasoVar.zzn = str;
    }

    public static /* synthetic */ void zzi(zzaso zzasoVar, zzasn zzasnVar) {
        zzasoVar.zzp = zzasnVar.zza();
        zzasoVar.zzc |= 2048;
    }

    public static /* synthetic */ void zzj(zzaso zzasoVar, String str) {
        str.getClass();
        zzasoVar.zzc |= 1;
        zzasoVar.zzd = str;
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
                return zzbR(zza, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzask.class, "zzp", zzasm.zza});
            case 3:
                return new zzaso();
            case 4:
                return new zzasi(null);
            case 5:
                return zza;
            case 6:
                zzhbt zzhbtVar = zzb;
                if (zzhbtVar == null) {
                    synchronized (zzaso.class) {
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
