package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzflx extends zzgzv implements zzhbm {
    private static final zzhae zza = new zzfll();
    private static final zzflx zzb;
    private static volatile zzhbt zzc;
    private int zzA;
    private int zzE;
    private int zzF;
    private long zzG;
    private int zzH;
    private int zzM;
    private long zzU;
    private int zzV;
    private int zzW;
    private zzfmm zzX;
    private zzfmf zzY;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzh;
    private long zzi;
    private long zzj;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzu;
    private String zzg = "";
    private zzhad zzk = zzbG();
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzz = "";
    private String zzB = "";
    private String zzC = "";
    private zzhag zzD = zzbI();
    private String zzI = "";
    private String zzJ = "";
    private String zzK = "";
    private String zzL = "";
    private String zzN = "";
    private String zzO = "";
    private String zzP = "";
    private String zzQ = "";
    private String zzR = "";
    private String zzS = "";
    private String zzT = "";

    static {
        zzflx zzflxVar = new zzflx();
        zzb = zzflxVar;
        zzgzv.zzca(zzflx.class, zzflxVar);
    }

    private zzflx() {
    }

    public static zzflm zza() {
        return (zzflm) zzb.zzaZ();
    }

    public static /* synthetic */ void zzd(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzS = str;
    }

    public static /* synthetic */ void zze(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzT = str;
    }

    public static /* synthetic */ void zzk(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzv = str;
    }

    public static /* synthetic */ void zzl(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzy = str;
    }

    public static /* synthetic */ void zzm(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzz = str;
    }

    public static /* synthetic */ void zzo(zzflx zzflxVar, Iterable iterable) {
        zzhag zzhagVar = zzflxVar.zzD;
        if (!zzhagVar.zzc()) {
            zzflxVar.zzD = zzgzv.zzbJ(zzhagVar);
        }
        zzgxq.zzaQ(iterable, zzflxVar.zzD);
    }

    public static /* synthetic */ void zzt(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzI = str;
    }

    public static /* synthetic */ void zzu(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzJ = str;
    }

    public static /* synthetic */ void zzv(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzO = str;
    }

    public static /* synthetic */ void zzx(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzQ = str;
    }

    public static /* synthetic */ void zzy(zzflx zzflxVar, String str) {
        str.getClass();
        zzflxVar.zzR = str;
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
                return zzbR(zzb, "\u0000+\u0000\u0001\u0001++\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0000*ဉ\u0001+\u0004", new Object[]{"zzd", "zze", "zzl", "zzm", "zzu", "zzv", "zzy", "zzz", "zzA", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzw", "zzx", "zzB", "zzC", "zzD", "zzK", "zzL", "zzN", "zzU", "zzg", "zzh", "zzi", "zzj", "zzn", "zzo", "zzp", "zzk", "zzV", "zzW", "zzf", "zzX", "zzY", "zzM"});
            case 3:
                return new zzflx();
            case 4:
                return new zzflm(null);
            case 5:
                return zzb;
            case 6:
                zzhbt zzhbtVar = zzc;
                if (zzhbtVar == null) {
                    synchronized (zzflx.class) {
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
