package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdvm {
    private final zzblx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvm(zzblx zzblxVar) {
        this.zza = zzblxVar;
    }

    private final void zzs(zzdvl zzdvlVar) throws RemoteException {
        String zza = zzdvl.zza(zzdvlVar);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Dispatching AFMA event on publisher webview: ".concat(zza));
        this.zza.zzb(zza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdvl("initialize", null));
    }

    public final void zzb(long j) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("interstitial", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onAdClicked";
        this.zza.zzb(zzdvl.zza(zzdvlVar));
    }

    public final void zzc(long j) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("interstitial", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onAdClosed";
        zzs(zzdvlVar);
    }

    public final void zzd(long j, int i) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("interstitial", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onAdFailedToLoad";
        zzdvlVar.zzd = Integer.valueOf(i);
        zzs(zzdvlVar);
    }

    public final void zze(long j) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("interstitial", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onAdLoaded";
        zzs(zzdvlVar);
    }

    public final void zzf(long j) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("interstitial", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdvlVar);
    }

    public final void zzg(long j) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("interstitial", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onAdOpened";
        zzs(zzdvlVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("creation", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "nativeObjectCreated";
        zzs(zzdvlVar);
    }

    public final void zzi(long j) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("creation", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "nativeObjectNotCreated";
        zzs(zzdvlVar);
    }

    public final void zzj(long j) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("rewarded", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onAdClicked";
        zzs(zzdvlVar);
    }

    public final void zzk(long j) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("rewarded", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onRewardedAdClosed";
        zzs(zzdvlVar);
    }

    public final void zzl(long j, zzbyg zzbygVar) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("rewarded", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onUserEarnedReward";
        zzdvlVar.zze = zzbygVar.zzf();
        zzdvlVar.zzf = Integer.valueOf(zzbygVar.zze());
        zzs(zzdvlVar);
    }

    public final void zzm(long j, int i) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("rewarded", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onRewardedAdFailedToLoad";
        zzdvlVar.zzd = Integer.valueOf(i);
        zzs(zzdvlVar);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("rewarded", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onRewardedAdFailedToShow";
        zzdvlVar.zzd = Integer.valueOf(i);
        zzs(zzdvlVar);
    }

    public final void zzo(long j) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("rewarded", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onAdImpression";
        zzs(zzdvlVar);
    }

    public final void zzp(long j) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("rewarded", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onRewardedAdLoaded";
        zzs(zzdvlVar);
    }

    public final void zzq(long j) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("rewarded", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdvlVar);
    }

    public final void zzr(long j) throws RemoteException {
        zzdvl zzdvlVar = new zzdvl("rewarded", null);
        zzdvlVar.zza = Long.valueOf(j);
        zzdvlVar.zzc = "onRewardedAdOpened";
        zzs(zzdvlVar);
    }
}
