package com.google.android.gms.tagmanager;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzrn;
import com.google.android.gms.internal.gtm.zzro;
import com.google.android.gms.internal.gtm.zzrp;
import com.google.android.gms.internal.gtm.zzrv;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzak extends BasePendingResult {
    private final Clock zza;
    private final zzah zzb;
    private final Looper zzc;
    private final zzeb zzd;
    private final int zze;
    private final Context zzf;
    private final TagManager zzg;
    private final String zzh;
    private final zzal zzi;
    private zzaj zzj;
    private final zzrp zzk;
    private volatile zzz zzl;
    private volatile boolean zzm;
    private com.google.android.gms.internal.gtm.zzak zzn;
    private long zzo;
    private String zzp;
    private zzai zzq;
    private zzab zzr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(Context context, TagManager tagManager, Looper looper, String str, int i, zzao zzaoVar) {
        super(looper == null ? Looper.getMainLooper() : looper);
        zzel zzelVar = new zzel(context, str);
        zzei zzeiVar = new zzei(context, str, zzaoVar, null, null);
        zzrp zzrpVar = new zzrp(context);
        Clock defaultClock = DefaultClock.getInstance();
        zzde zzdeVar = new zzde(1, 5, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS, 5000L, "refreshing", DefaultClock.getInstance());
        zzal zzalVar = new zzal(context, str);
        this.zzf = context;
        this.zzg = tagManager;
        this.zzc = looper == null ? Looper.getMainLooper() : looper;
        this.zzh = str;
        this.zze = i;
        this.zzj = zzelVar;
        this.zzq = zzeiVar;
        this.zzk = zzrpVar;
        this.zzb = new zzah(this, null);
        this.zzn = com.google.android.gms.internal.gtm.zzak.zzf();
        this.zza = defaultClock;
        this.zzd = zzdeVar;
        this.zzi = zzalVar;
        if (zzv()) {
            zzo(zzdz.zza().zzb());
        }
        zzaoVar.zza();
    }

    public static /* bridge */ /* synthetic */ boolean zzp(zzak zzakVar) {
        boolean z = zzakVar.zzm;
        return false;
    }

    public final synchronized void zzr(long j) {
        zzai zzaiVar = this.zzq;
        if (zzaiVar == null) {
            Log.w("GoogleTagManager", "Refresh requested, but no network load scheduler.");
        } else {
            zzaiVar.zza(j, this.zzn.zzh());
        }
    }

    private final void zzs(boolean z) {
        this.zzj.zzd(new zzad(this, null));
        this.zzq.zzc(new zzaf(this, null));
        zzrv zza = this.zzj.zza(this.zze);
        if (zza != null) {
            TagManager tagManager = this.zzg;
            this.zzl = new zzz(tagManager, this.zzc, new Container(this.zzf, tagManager.getDataLayer(), this.zzh, 0L, zza), this.zzb);
        }
        this.zzr = new zzab(this, z);
        if (zzv()) {
            this.zzq.zza(0L, "");
        } else {
            this.zzj.zzb();
        }
    }

    public final synchronized void zzt(com.google.android.gms.internal.gtm.zzak zzakVar) {
        if (this.zzj != null) {
            zzrn zze = zzro.zze();
            zze.zzc(0L);
            zze.zza(com.google.android.gms.internal.gtm.zzac.zzk());
            zze.zzc(this.zzo);
            zze.zza(com.google.android.gms.internal.gtm.zzac.zzk());
            zze.zzb(zzakVar);
            this.zzj.zzc((zzro) zze.zzB());
        }
    }

    public final synchronized void zzu(com.google.android.gms.internal.gtm.zzak zzakVar, long j, boolean z) {
        if (isReady() && this.zzl == null) {
            return;
        }
        this.zzn = zzakVar;
        this.zzo = j;
        long zza = this.zzi.zza();
        zzr(Math.max(0L, Math.min(zza, (this.zzo + zza) - this.zza.currentTimeMillis())));
        Context context = this.zzf;
        TagManager tagManager = this.zzg;
        Container container = new Container(context, tagManager.getDataLayer(), this.zzh, j, zzakVar);
        if (this.zzl == null) {
            this.zzl = new zzz(this.zzg, this.zzc, container, this.zzb);
        } else {
            this.zzl.zzc(container);
        }
        if (isReady() || !this.zzr.zza(container)) {
            return;
        }
        setResult(this.zzl);
    }

    public final boolean zzv() {
        zzdz zza = zzdz.zza();
        return (zza.zze() == 2 || zza.zze() == 3) && this.zzh.equals(zza.zzc());
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: zzd */
    public final ContainerHolder createFailedResult(Status status) {
        if (this.zzl != null) {
            return this.zzl;
        }
        if (status == Status.RESULT_TIMEOUT) {
            Log.e("GoogleTagManager", "timer expired: setting result to failure");
        }
        return new zzz(status);
    }

    public final synchronized String zzh() {
        return this.zzp;
    }

    public final void zzl() {
        zzrv zza = this.zzj.zza(this.zze);
        if (zza != null) {
            Context context = this.zzf;
            TagManager tagManager = this.zzg;
            setResult(new zzz(this.zzg, this.zzc, new Container(context, tagManager.getDataLayer(), this.zzh, 0L, zza), new zzaa(this)));
        } else {
            Log.e("GoogleTagManager", "Default was requested, but no default container was found");
            setResult(createFailedResult(new Status(10, "Default was requested, but no default container was found", (PendingIntent) null)));
        }
        this.zzq = null;
        this.zzj = null;
    }

    public final void zzm() {
        zzs(true);
    }

    public final void zzn() {
        zzs(false);
    }

    public final synchronized void zzo(String str) {
        this.zzp = str;
        zzai zzaiVar = this.zzq;
        if (zzaiVar != null) {
            zzaiVar.zzb(str);
        }
    }
}
