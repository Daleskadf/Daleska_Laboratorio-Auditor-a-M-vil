package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbte implements com.google.android.gms.ads.internal.overlay.zzp {
    final /* synthetic */ zzbtg zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbte(zzbtg zzbtgVar) {
        this.zza = zzbtgVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
        com.google.android.gms.ads.internal.util.client.zzm.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
        com.google.android.gms.ads.internal.util.client.zzm.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        MediationInterstitialListener mediationInterstitialListener;
        com.google.android.gms.ads.internal.util.client.zzm.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbtg zzbtgVar = this.zza;
        mediationInterstitialListener = zzbtgVar.zzb;
        mediationInterstitialListener.onAdOpened(zzbtgVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i) {
        MediationInterstitialListener mediationInterstitialListener;
        com.google.android.gms.ads.internal.util.client.zzm.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbtg zzbtgVar = this.zza;
        mediationInterstitialListener = zzbtgVar.zzb;
        mediationInterstitialListener.onAdClosed(zzbtgVar);
    }
}
