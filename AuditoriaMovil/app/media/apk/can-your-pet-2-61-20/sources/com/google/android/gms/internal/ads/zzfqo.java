package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfqo extends zzgzv implements zzhbm {
    private static final zzhae zza = new zzfqj();
    private static final zzfqo zzb;
    private static volatile zzhbt zzc;
    private int zzd;
    private zzhad zze = zzbG();
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        zzfqo zzfqoVar = new zzfqo();
        zzb = zzfqoVar;
        zzgzv.zzca(zzfqo.class, zzfqoVar);
    }

    private zzfqo() {
    }

    public static zzfqn zza() {
        return (zzfqn) zzb.zzaZ();
    }

    public static /* synthetic */ void zzd(zzfqo zzfqoVar, zzfqm zzfqmVar) {
        zzfqmVar.getClass();
        zzhad zzhadVar = zzfqoVar.zze;
        if (!zzhadVar.zzc()) {
            zzfqoVar.zze = zzgzv.zzbH(zzhadVar);
        }
        zzfqoVar.zze.zzi(zzfqmVar.zza());
    }

    public static /* synthetic */ void zze(zzfqo zzfqoVar, String str) {
        str.getClass();
        zzfqoVar.zzd |= 1;
        zzfqoVar.zzf = str;
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
                return zzbR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzd", "zze", zzfql.zza, "zzf", "zzg", "zzh"});
            case 3:
                return new zzfqo();
            case 4:
                return new zzfqn(null);
            case 5:
                return zzb;
            case 6:
                zzhbt zzhbtVar = zzc;
                if (zzhbtVar == null) {
                    synchronized (zzfqo.class) {
                        zzhbtVar = zzc;
                        if (zzhbtVar == null) {
                            zzhbtVar = new zzgzq(zzb);
                            zzc = zzhbtVar;
                        }
                    }
                }
                return zzhbtVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
