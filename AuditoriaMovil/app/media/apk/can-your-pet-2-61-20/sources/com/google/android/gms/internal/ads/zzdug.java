package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdug {
    final /* synthetic */ zzduh zza;
    private final Map zzb = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdug(zzduh zzduhVar) {
        this.zza = zzduhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzdug zza(zzdug zzdugVar) {
        zzdugVar.zzb.putAll(zzduh.zzc(zzdugVar.zza));
        return zzdugVar;
    }

    public final zzdug zzb(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdug zzc(zzffn zzffnVar) {
        zzb("aai", zzffnVar.zzx);
        zzb("request_id", zzffnVar.zzao);
        zzb(FirebaseAnalytics.Param.AD_FORMAT, zzffn.zza(zzffnVar.zzb));
        return this;
    }

    public final zzdug zzd(zzffq zzffqVar) {
        zzb("gqi", zzffqVar.zzb);
        return this;
    }

    public final String zze() {
        return zzduh.zzb(this.zza).zzb(this.zzb);
    }

    public final void zzf() {
        zzduh.zzd(this.zza).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdue
            @Override // java.lang.Runnable
            public final void run() {
                zzdug.this.zzh();
            }
        });
    }

    public final void zzg() {
        zzduh.zzd(this.zza).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduf
            @Override // java.lang.Runnable
            public final void run() {
                zzdug.this.zzi();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh() {
        zzduh.zzb(this.zza).zzf(this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi() {
        zzduh.zzb(this.zza).zze(this.zzb);
    }
}
