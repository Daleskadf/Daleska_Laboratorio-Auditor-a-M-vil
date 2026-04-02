package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdxz extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdyc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxz(zzdyc zzdycVar, String str) {
        this.zza = str;
        this.zzb = zzdycVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzl;
        zzdyc zzdycVar = this.zzb;
        zzl = zzdyc.zzl(loadAdError);
        zzdycVar.zzm(zzl, this.zza);
    }
}
