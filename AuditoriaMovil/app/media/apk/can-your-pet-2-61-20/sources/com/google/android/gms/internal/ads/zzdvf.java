package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdvf implements AppEventListener, zzdbl, com.google.android.gms.ads.internal.client.zza, zzcyq, zzczk, zzczl, zzdae, zzcyt, zzfko {
    private final List zza;
    private final zzdut zzb;
    private long zzc;

    public zzdvf(zzdut zzdutVar, zzcik zzcikVar) {
        this.zzb = zzdutVar;
        this.zza = Collections.singletonList(zzcikVar);
    }

    private final void zzg(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(String.valueOf(cls.getSimpleName())), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzg(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zzg(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zza() {
        zzg(zzcyq.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzb() {
        zzg(zzcyq.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzc() {
        zzg(zzcyq.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzd(zzfkh zzfkhVar, String str) {
        zzg(zzfkg.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzg(zzcyt.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzdC(zzfkh zzfkhVar, String str) {
        zzg(zzfkg.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzdD(zzfkh zzfkhVar, String str, Throwable th) {
        zzg(zzfkg.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzdE(zzfkh zzfkhVar, String str) {
        zzg(zzfkg.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzdj(Context context) {
        zzg(zzczl.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzdl(Context context) {
        zzg(zzczl.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzdm(Context context) {
        zzg(zzczl.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdn(zzbxd zzbxdVar) {
        this.zzc = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        zzg(zzdbl.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdo(zzffz zzffzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    @ParametersAreNonnullByDefault
    public final void zzds(zzbxq zzbxqVar, String str, String str2) {
        zzg(zzcyq.class, "onRewarded", zzbxqVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zze() {
        zzg(zzcyq.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzf() {
        zzg(zzcyq.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final void zzr() {
        zzg(zzczk.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdae
    public final void zzs() {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzc;
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + elapsedRealtime);
        zzg(zzdae.class, "onAdLoaded", new Object[0]);
    }
}
