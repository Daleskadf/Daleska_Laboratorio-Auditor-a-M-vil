package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcbr {
    public static final zzgep zza;
    public static final zzgep zzb;
    public static final zzgep zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgep zze;
    public static final zzgep zzf;

    static {
        Executor executor;
        ThreadPoolExecutor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        if (ClientLibraryUtils.isPackageSide()) {
            zzftf.zza();
            executor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcbn("Default")));
        } else {
            if (com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbdz.zzkV) != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbdz.zzkV)).booleanValue()) {
                    if (com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbdz.zzkW) != null) {
                        if (com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbdz.zzkX) != null) {
                            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbdz.zzkW)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbdz.zzkW)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcbn("Default"));
                            threadPoolExecutor3.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbdz.zzkX)).booleanValue());
                            executor = threadPoolExecutor3;
                        }
                    }
                }
            }
            executor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcbn("Default"));
        }
        zza = new zzcbq(executor, null);
        if (ClientLibraryUtils.isPackageSide()) {
            threadPoolExecutor = zzftf.zza().zzc(5, new zzcbn("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcbn("Loader"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            threadPoolExecutor = threadPoolExecutor4;
        }
        zzb = new zzcbq(threadPoolExecutor, null);
        if (ClientLibraryUtils.isPackageSide()) {
            threadPoolExecutor2 = zzftf.zza().zzb(new zzcbn("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor5 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcbn("Activeview"));
            threadPoolExecutor5.allowCoreThreadTimeOut(true);
            threadPoolExecutor2 = threadPoolExecutor5;
        }
        zzc = new zzcbq(threadPoolExecutor2, null);
        zzd = new zzcbm(3, new zzcbn("Schedule"));
        zze = new zzcbq(new zzcbo(), null);
        zzf = new zzcbq(zzgev.zzb(), null);
    }
}
