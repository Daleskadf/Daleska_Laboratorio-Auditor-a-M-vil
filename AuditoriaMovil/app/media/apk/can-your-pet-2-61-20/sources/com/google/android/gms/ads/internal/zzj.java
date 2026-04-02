package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzawh;
import com.google.android.gms.internal.ads.zzawk;
import com.google.android.gms.internal.ads.zzawn;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfqv;
import com.google.android.gms.internal.ads.zzfrp;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes.dex */
public final class zzj implements Runnable, zzawk {
    protected boolean zza;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzfpp zzi;
    private Context zzj;
    private final Context zzk;
    private VersionInfoParcel zzl;
    private final VersionInfoParcel zzm;
    private final boolean zzn;
    private int zzo;
    private final List zzc = new Vector();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzj(Context context, VersionInfoParcel versionInfoParcel) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = versionInfoParcel;
        this.zzm = versionInfoParcel;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzba.zzc().zza(zzbdz.zzcm)).booleanValue();
        this.zzn = booleanValue;
        this.zzi = zzfpp.zza(context, newCachedThreadPool, booleanValue);
        this.zzf = ((Boolean) zzba.zzc().zza(zzbdz.zzci)).booleanValue();
        this.zzg = ((Boolean) zzba.zzc().zza(zzbdz.zzcn)).booleanValue();
        if (((Boolean) zzba.zzc().zza(zzbdz.zzcl)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzba.zzc().zza(zzbdz.zzdp)).booleanValue()) {
            this.zza = zzc();
        }
        if (((Boolean) zzba.zzc().zza(zzbdz.zzdi)).booleanValue()) {
            zzcbr.zza.execute(this);
            return;
        }
        zzay.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzv()) {
            zzcbr.zza.execute(this);
        } else {
            run();
        }
    }

    private final zzawk zzm() {
        return zzi() == 2 ? (zzawk) this.zze.get() : (zzawk) this.zzd.get();
    }

    private final void zzp() {
        List list = this.zzc;
        zzawk zzm = zzm();
        if (list.isEmpty() || zzm == null) {
            return;
        }
        for (Object[] objArr : this.zzc) {
            int length = objArr.length;
            if (length == 1) {
                zzm.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzm.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzc.clear();
    }

    private final void zzq(boolean z) {
        this.zzd.set(zzawn.zzu(this.zzl.afmaVersion, zzr(this.zzj), z, this.zzo));
    }

    private static final Context zzr(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.ads.internal.util.client.VersionInfoParcel, android.content.Context] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzba.zzc().zza(zzbdz.zzdp)).booleanValue()) {
                this.zza = zzc();
            }
            boolean z = this.zzl.isClientJar;
            final boolean z2 = false;
            if (!((Boolean) zzba.zzc().zza(zzbdz.zzaW)).booleanValue() && z) {
                z2 = true;
            }
            if (zzi() == 1) {
                zzq(z2);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzh
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzj.this.zzb(z2);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zzawh zza = zzawh.zza(this.zzl.afmaVersion, zzr(this.zzj), z2, this.zzn);
                    this.zze.set(zza);
                    if (this.zzg && !zza.zzr()) {
                        this.zzo = 1;
                        zzq(z2);
                    }
                } catch (NullPointerException e) {
                    this.zzo = 1;
                    zzq(z2);
                    this.zzi.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e);
                }
            }
        } finally {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzawh.zza(this.zzm.afmaVersion, zzr(this.zzk), z, this.zzn).zzp();
        } catch (NullPointerException e) {
            this.zzi.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    protected final boolean zzc() {
        Context context = this.zzj;
        zzi zziVar = new zzi(this);
        zzfpp zzfppVar = this.zzi;
        return new zzfrp(this.zzj, zzfqv.zzb(context, zzfppVar), zziVar, ((Boolean) zzba.zzc().zza(zzbdz.zzcj)).booleanValue()).zzd(1);
    }

    public final boolean zzd() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (zzd()) {
            zzawk zzm = zzm();
            if (((Boolean) zzba.zzc().zza(zzbdz.zzkq)).booleanValue()) {
                zzu.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzJ(view, 4, null);
            }
            if (zzm != null) {
                zzp();
                return zzm.zzf(zzr(context), str, view, activity);
            }
            return "";
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final String zzg(Context context) {
        zzawk zzm;
        if (!zzd() || (zzm = zzm()) == null) {
            return "";
        }
        zzp();
        return zzm.zzg(zzr(context));
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final String zzh(Context context, View view, Activity activity) {
        if (((Boolean) zzba.zzc().zza(zzbdz.zzkp)).booleanValue()) {
            if (zzd()) {
                zzawk zzm = zzm();
                if (((Boolean) zzba.zzc().zza(zzbdz.zzkq)).booleanValue()) {
                    zzu.zzp();
                    com.google.android.gms.ads.internal.util.zzt.zzJ(view, 2, null);
                }
                return zzm != null ? zzm.zzh(context, view, activity) : "";
            }
            return "";
        }
        zzawk zzm2 = zzm();
        if (((Boolean) zzba.zzc().zza(zzbdz.zzkq)).booleanValue()) {
            zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzJ(view, 2, null);
        }
        return zzm2 != null ? zzm2.zzh(context, view, activity) : "";
    }

    protected final int zzi() {
        if (!this.zzf || this.zza) {
            return this.zzo;
        }
        return 1;
    }

    public final int zzj() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final void zzk(MotionEvent motionEvent) {
        zzawk zzm = zzm();
        if (zzm != null) {
            zzp();
            zzm.zzk(motionEvent);
            return;
        }
        this.zzc.add(new Object[]{motionEvent});
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final void zzl(int i, int i2, int i3) {
        zzawk zzm = zzm();
        if (zzm == null) {
            this.zzc.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        zzp();
        zzm.zzl(i, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzawk zzm;
        if (!zzd() || (zzm = zzm()) == null) {
            return;
        }
        zzm.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzawk
    public final void zzo(View view) {
        zzawk zzm = zzm();
        if (zzm != null) {
            zzm.zzo(view);
        }
    }
}
