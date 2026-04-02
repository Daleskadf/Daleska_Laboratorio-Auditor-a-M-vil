package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzawh implements zzawk {
    private static zzawh zzb;
    private final Context zzc;
    private final zzfri zzd;
    private final zzfrp zze;
    private final zzfrr zzf;
    private final zzaxj zzg;
    private final zzfpp zzh;
    private final Executor zzi;
    private final zzazh zzj;
    private final zzfro zzk;
    private final zzaxy zzm;
    private final zzaxq zzn;
    private final zzaxh zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;
    volatile long zza = 0;
    private final Object zzp = new Object();
    private final CountDownLatch zzl = new CountDownLatch(1);

    zzawh(Context context, zzfpp zzfppVar, zzfri zzfriVar, zzfrp zzfrpVar, zzfrr zzfrrVar, zzaxj zzaxjVar, Executor executor, zzfpi zzfpiVar, zzazh zzazhVar, zzaxy zzaxyVar, zzaxq zzaxqVar, zzaxh zzaxhVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfppVar;
        this.zzd = zzfriVar;
        this.zze = zzfrpVar;
        this.zzf = zzfrrVar;
        this.zzg = zzaxjVar;
        this.zzi = executor;
        this.zzj = zzazhVar;
        this.zzm = zzaxyVar;
        this.zzn = zzaxqVar;
        this.zzo = zzaxhVar;
        this.zzr = false;
        this.zzk = new zzawf(this, zzfpiVar);
    }

    public static synchronized zzawh zza(String str, Context context, boolean z, boolean z2) {
        zzawh zzb2;
        synchronized (zzawh.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzawh zzb(String str, Context context, Executor executor, boolean z, boolean z2) {
        zzawh zzawhVar;
        synchronized (zzawh.class) {
            if (zzb == null) {
                zzfpq zza = zzfpr.zza();
                zza.zza(str);
                zza.zzc(z);
                zzfpr zzd = zza.zzd();
                zzfpp zza2 = zzfpp.zza(context, executor, z2);
                zzaws zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdl)).booleanValue() ? zzaws.zzc(context) : null;
                zzaxy zzd2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdm)).booleanValue() ? zzaxy.zzd(context, executor) : null;
                zzaxq zzaxqVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcA)).booleanValue() ? new zzaxq() : null;
                zzaxh zzaxhVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcC)).booleanValue() ? new zzaxh() : null;
                zzfqi zze = zzfqi.zze(context, executor, zza2, zzd);
                zzaxi zzaxiVar = new zzaxi(context);
                zzaxj zzaxjVar = new zzaxj(zzd, zze, new zzaxw(context, zzaxiVar), zzaxiVar, zzc, zzd2, zzaxqVar, zzaxhVar);
                zzazh zzb2 = zzfqv.zzb(context, zza2);
                zzfpi zzfpiVar = new zzfpi();
                zzawh zzawhVar2 = new zzawh(context, zza2, new zzfri(context, zzb2), new zzfrp(context, zzb2, new zzawe(zza2), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcj)).booleanValue()), new zzfrr(context, zzaxjVar, zza2, zzfpiVar), zzaxjVar, executor, zzfpiVar, zzb2, zzd2, zzaxqVar, zzaxhVar);
                zzb = zzawhVar2;
                zzawhVar2.zzm();
                zzb.zzp();
            }
            zzawhVar = zzb;
        }
        return zzawhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
        if (r4.zzd().zzj().equals(r5.zzj()) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzawh r12) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawh.zzj(com.google.android.gms.internal.ads.zzawh):void");
    }

    private final void zzs() {
        zzaxy zzaxyVar = this.zzm;
        if (zzaxyVar != null) {
            zzaxyVar.zzh();
        }
    }

    private final zzfrh zzt(int i) {
        if (zzfqv.zza(this.zzj)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzch)).booleanValue()) {
                return this.zze.zzc(1);
            }
            return this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcA)).booleanValue()) {
            this.zzn.zzi();
        }
        zzp();
        zzfps zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zza2 = zza.zza(context, null, str, view, activity);
            this.zzh.zzf(5000, System.currentTimeMillis() - currentTimeMillis, zza2, null);
            return zza2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final String zzg(Context context) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcA)).booleanValue()) {
            this.zzn.zzj();
        }
        zzp();
        zzfps zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzc = zza.zzc(context, null);
            this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc, null);
            return zzc;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final String zzh(Context context, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcA)).booleanValue()) {
            this.zzn.zzk(context, view);
        }
        zzp();
        zzfps zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzb2 = zza.zzb(context, null, view, activity);
            this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
            return zzb2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final void zzk(MotionEvent motionEvent) {
        zzfps zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
            } catch (zzfrq e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final void zzl(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlD)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = i2;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, displayMetrics.density * f, displayMetrics.density * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(obtain);
        obtain.recycle();
        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(obtain2);
        obtain2.recycle();
        MotionEvent obtain3 = MotionEvent.obtain(0L, i3, 1, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(obtain3);
        obtain3.recycle();
    }

    final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfrh zzt = zzt(1);
        if (zzt != null) {
            if (this.zzf.zzc(zzt)) {
                this.zzr = true;
                this.zzl.countDown();
                return;
            }
            return;
        }
        this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaxh zzaxhVar = this.zzo;
        if (zzaxhVar != null) {
            zzaxhVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (this.zzq) {
            return;
        }
        synchronized (this.zzp) {
            if (!this.zzq) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfrh zzb2 = this.zzf.zzb();
                if ((zzb2 == null || zzb2.zzd(3600L)) && zzfqv.zza(this.zzj)) {
                    this.zzi.execute(new zzawg(this));
                }
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzr;
    }
}
