package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcfh extends zzcey implements zzcdd {
    public static final /* synthetic */ int zzd = 0;
    private zzcde zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzceq zzi;
    private long zzj;
    private long zzk;

    public zzcfh(zzcdn zzcdnVar, zzcdm zzcdmVar) {
        super(zzcdnVar);
        zzcfz zzcfzVar = new zzcfz(zzcdnVar.getContext(), zzcdmVar, (zzcdn) this.zzc.get(), null);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcfzVar;
        zzcfzVar.zzL(this);
    }

    protected static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private static String zzd(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + ":" + message;
    }

    private final void zzx(long j) {
        com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfg
            @Override // java.lang.Runnable
            public final void run() {
                zzcfh.this.zzb();
            }
        }, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcey, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcde zzcdeVar = this.zze;
        if (zzcdeVar != null) {
            zzcdeVar.zzL(null);
            this.zze.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzD(int i, int i2) {
    }

    public final zzcde zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcde zzcdeVar = this.zze;
        this.zze = null;
        return zzcdeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [long] */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.google.android.gms.internal.ads.zzcfh, com.google.android.gms.internal.ads.zzcey] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [com.google.android.gms.internal.ads.zzcfh] */
    /* JADX WARN: Type inference failed for: r3v31 */
    public final /* synthetic */ void zzb() {
        String str;
        zzcfh zzcfhVar;
        zzcfh zzcfhVar2;
        ?? longValue;
        long intValue;
        zzcfh zzcfhVar3;
        long j;
        long j2;
        String str2;
        long j3;
        String zzc = zzc(this.zzf);
        String str3 = "error";
        try {
            longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzx)).longValue() * 1000;
            intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzw)).intValue();
            zzcfhVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbQ)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            str = zzc;
            zzcfhVar = this;
        }
        synchronized (this) {
            try {
                int i = ((com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - this.zzj) > longValue ? 1 : ((com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - this.zzj) == longValue ? 0 : -1));
                if (i <= 0) {
                    try {
                        if (!this.zzg) {
                            if (!this.zzh) {
                                if (!this.zze.zzV()) {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                                long zzz = this.zze.zzz();
                                if (zzz > 0) {
                                    long zzv = this.zze.zzv();
                                    if (zzv != this.zzk) {
                                        try {
                                            j2 = intValue;
                                            str2 = zzc;
                                            try {
                                                zzo(this.zzf, zzc, zzv, zzz, zzv > 0, zzcfhVar != 0 ? this.zze.zzA() : -1L, zzcfhVar != 0 ? this.zze.zzx() : -1L, zzcfhVar != 0 ? this.zze.zzB() : -1L, zzcde.zzs(), zzcde.zzu());
                                                zzcfhVar = this;
                                                j = zzv;
                                                try {
                                                    zzcfhVar.zzk = j;
                                                    j3 = zzz;
                                                    zzcfhVar = zzcfhVar;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    str = str2;
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                zzcfhVar = this;
                                                str = str2;
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            str2 = zzc;
                                            zzcfhVar = this;
                                        }
                                    } else {
                                        j = zzv;
                                        j2 = intValue;
                                        str2 = zzc;
                                        zzcfhVar = this;
                                        j3 = zzz;
                                    }
                                    if (j >= j3) {
                                        zzcfhVar.zzj(zzcfhVar.zzf, str2, j3);
                                        zzcfhVar2 = zzcfhVar;
                                    } else {
                                        int i2 = (zzcfhVar.zze.zzw() > j2 ? 1 : (zzcfhVar.zze.zzw() == j2 ? 0 : -1));
                                        zzcfhVar3 = zzcfhVar;
                                        if (i2 >= 0) {
                                            zzcfhVar3 = zzcfhVar;
                                            if (j > 0) {
                                                zzcfhVar2 = zzcfhVar;
                                            }
                                        }
                                    }
                                } else {
                                    zzcfhVar3 = this;
                                }
                                zzcfhVar3.zzx(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzy)).longValue());
                                return;
                            }
                            zzcfhVar2 = this;
                            com.google.android.gms.ads.internal.zzu.zzy().zzc(zzcfhVar2.zzi);
                        }
                        throw new IOException("Abort requested before buffering finished. ");
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = longValue;
                        str = i;
                    }
                } else {
                    str = zzc;
                    zzcfhVar = this;
                    try {
                        throw new IOException("Timeout reached. Limit: " + ((long) longValue) + " ms");
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = zzc;
                zzcfhVar = this;
            }
            try {
                throw th;
            } catch (Exception e2) {
                e = e2;
                String str4 = str3;
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + zzcfhVar.zzf + " Exception: " + e.getMessage());
                com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
                release();
                zzcfhVar.zzg(zzcfhVar.zzf, str, str4, zzd(str4, e));
                zzcfhVar2 = zzcfhVar;
                com.google.android.gms.ads.internal.zzu.zzy().zzc(zzcfhVar2.zzi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzi(final boolean z, final long j) {
        final zzcdn zzcdnVar = (zzcdn) this.zzc.get();
        if (zzcdnVar != null) {
            zzcbr.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcff
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzcfh.zzd;
                    zzcdn.this.zzv(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzk(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzl(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzm(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final void zzp(int i) {
        this.zze.zzJ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final void zzq(int i) {
        this.zze.zzK(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final void zzr(int i) {
        this.zze.zzM(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final void zzs(int i) {
        this.zze.zzN(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcey] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r6v18 */
    @Override // com.google.android.gms.internal.ads.zzcey
    public final boolean zzu(String str, String[] strArr) {
        String str2;
        String str3;
        zzcfh zzcfhVar;
        long j;
        long j2;
        long j3;
        ?? r1;
        long j4;
        String str4;
        long j5;
        long j6;
        zzcfh zzcfhVar2 = this;
        String str5 = str;
        zzcfhVar2.zzf = str5;
        String str6 = "error";
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            zzcfhVar2.zze.zzF(uriArr, zzcfhVar2.zzb);
            zzcdn zzcdnVar = (zzcdn) zzcfhVar2.zzc.get();
            if (zzcdnVar != null) {
                zzcdnVar.zzt(zzc, zzcfhVar2);
            }
            Clock zzB = com.google.android.gms.ads.internal.zzu.zzB();
            long currentTimeMillis = zzB.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzy)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzx)).longValue() * 1000;
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzw)).intValue();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbQ)).booleanValue();
            long j7 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzB.currentTimeMillis() - currentTimeMillis > longValue2) {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        } else if (!zzcfhVar2.zzg) {
                            if (zzcfhVar2.zzh) {
                                break;
                            } else if (zzcfhVar2.zze.zzV()) {
                                long zzz = zzcfhVar2.zze.zzz();
                                if (zzz > 0) {
                                    long zzv = zzcfhVar2.zze.zzv();
                                    if (zzv != j7) {
                                        try {
                                            j = intValue;
                                            long j8 = zzz;
                                            j2 = longValue2;
                                            j4 = longValue;
                                            str4 = zzc;
                                            try {
                                                zzo(str, zzc, zzv, j8, zzv > 0, booleanValue ? zzcfhVar2.zze.zzA() : -1L, booleanValue ? zzcfhVar2.zze.zzx() : -1L, booleanValue ? zzcfhVar2.zze.zzB() : -1L, zzcde.zzs(), zzcde.zzu());
                                                j6 = zzv;
                                                j5 = zzz;
                                                str2 = j8;
                                            } catch (Throwable th) {
                                                th = th;
                                                zzcfhVar = this;
                                                str2 = str;
                                                str3 = str4;
                                                try {
                                                    throw th;
                                                } catch (Exception e) {
                                                    e = e;
                                                    String str7 = str6;
                                                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + str2 + " Exception: " + e.getMessage());
                                                    com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
                                                    release();
                                                    zzcfhVar.zzg(str2, str3, str7, zzd(str7, e));
                                                    return false;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            str4 = zzc;
                                        }
                                    } else {
                                        j = intValue;
                                        j2 = longValue2;
                                        j4 = longValue;
                                        str4 = zzc;
                                        j5 = zzz;
                                        j6 = j7;
                                        str2 = intValue;
                                    }
                                    zzcfhVar = (zzv > j5 ? 1 : (zzv == j5 ? 0 : -1));
                                    if (zzcfhVar < 0) {
                                        try {
                                            zzcfh zzcfhVar3 = this;
                                            str2 = str;
                                            str3 = str4;
                                            if (zzcfhVar3.zze.zzw() < j || zzv <= 0) {
                                                j3 = j4;
                                                r1 = j6;
                                                zzcfhVar = zzcfhVar3;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            throw th;
                                        }
                                    } else {
                                        zzj(str, str4, j5);
                                    }
                                } else {
                                    j = intValue;
                                    j2 = longValue2;
                                    str2 = str5;
                                    str3 = zzc;
                                    zzcfhVar = zzcfhVar2;
                                    j3 = longValue;
                                    r1 = j7;
                                }
                                try {
                                    try {
                                        zzcfhVar.wait(j3);
                                    } catch (InterruptedException unused) {
                                        throw new IOException("Wait interrupted.");
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    str6 = r1;
                                    throw th;
                                }
                            } else {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                        } else {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str2 = str5;
                        str3 = zzc;
                        zzcfhVar = zzcfhVar2;
                    }
                }
                longValue = j3;
                zzcfhVar2 = zzcfhVar;
                str5 = str2;
                zzc = str3;
                intValue = j;
                longValue2 = j2;
                j7 = r1;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            str2 = str5;
            str3 = zzc;
            zzcfhVar = zzcfhVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzv() {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final boolean zzw(String str, String[] strArr, zzceq zzceqVar) {
        this.zzf = str;
        this.zzi = zzceqVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcdn zzcdnVar = (zzcdn) this.zzc.get();
            if (zzcdnVar != null) {
                zzcdnVar.zzt(zzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + str + " Exception: " + message);
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, zzc, "error", zzd("error", e));
            return false;
        }
    }
}
