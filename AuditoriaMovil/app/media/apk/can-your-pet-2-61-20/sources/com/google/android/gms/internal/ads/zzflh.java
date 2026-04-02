package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzflh implements Runnable {
    private final zzflk zzb;
    private String zzd;
    private String zze;
    private zzffy zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private Future zzh;
    private final List zza = new ArrayList();
    private zzflq zzc = zzflq.FORMAT_UNKNOWN;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzflh(zzflk zzflkVar) {
        this.zzb = zzflkVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzflh zza(zzfkw zzfkwVar) {
        if (((Boolean) zzbfm.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfkwVar.zzj();
            list.add(zzfkwVar);
            Future future = this.zzh;
            if (future != null) {
                future.cancel(false);
            }
            this.zzh = zzcbr.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziH)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzflh zzb(String str) {
        if (((Boolean) zzbfm.zzc.zze()).booleanValue() && zzflg.zzf(str)) {
            this.zzd = str;
        }
        return this;
    }

    public final synchronized zzflh zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbfm.zzc.zze()).booleanValue()) {
            this.zzg = zzeVar;
        }
        return this;
    }

    public final synchronized zzflh zzd(zzflq zzflqVar) {
        if (((Boolean) zzbfm.zzc.zze()).booleanValue()) {
            this.zzc = zzflqVar;
        }
        return this;
    }

    public final synchronized zzflh zze(ArrayList arrayList) {
        if (((Boolean) zzbfm.zzc.zze()).booleanValue()) {
            if (!arrayList.contains("banner") && !arrayList.contains(AdFormat.BANNER.name())) {
                if (!arrayList.contains("interstitial") && !arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    if (!arrayList.contains("native") && !arrayList.contains(AdFormat.NATIVE.name())) {
                        if (!arrayList.contains("rewarded") && !arrayList.contains(AdFormat.REWARDED.name())) {
                            if (arrayList.contains("app_open_ad")) {
                                this.zzc = zzflq.FORMAT_APP_OPEN;
                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                this.zzc = zzflq.FORMAT_REWARDED_INTERSTITIAL;
                            }
                        }
                        this.zzc = zzflq.FORMAT_REWARDED;
                    }
                    this.zzc = zzflq.FORMAT_NATIVE;
                }
                this.zzc = zzflq.FORMAT_INTERSTITIAL;
            }
            this.zzc = zzflq.FORMAT_BANNER;
        }
        return this;
    }

    public final synchronized zzflh zzf(String str) {
        if (((Boolean) zzbfm.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized zzflh zzg(zzffy zzffyVar) {
        if (((Boolean) zzbfm.zzc.zze()).booleanValue()) {
            this.zzf = zzffyVar;
        }
        return this;
    }

    public final synchronized void zzh() {
        if (((Boolean) zzbfm.zzc.zze()).booleanValue()) {
            Future future = this.zzh;
            if (future != null) {
                future.cancel(false);
            }
            for (zzfkw zzfkwVar : this.zza) {
                if (this.zzc != zzflq.FORMAT_UNKNOWN) {
                    zzfkwVar.zzd(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zzd)) {
                    zzfkwVar.zzf(this.zzd);
                }
                if (!TextUtils.isEmpty(this.zze) && !zzfkwVar.zzl()) {
                    zzfkwVar.zze(this.zze);
                }
                zzffy zzffyVar = this.zzf;
                if (zzffyVar != null) {
                    zzfkwVar.zzb(zzffyVar);
                } else {
                    com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
                    if (zzeVar != null) {
                        zzfkwVar.zza(zzeVar);
                    }
                }
                this.zzb.zzb(zzfkwVar.zzm());
            }
            this.zza.clear();
        }
    }
}
