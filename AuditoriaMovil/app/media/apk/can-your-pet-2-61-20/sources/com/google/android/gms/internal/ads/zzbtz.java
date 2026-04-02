package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbtz extends zzbih {
    final /* synthetic */ zzbuc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbtz(zzbuc zzbucVar, zzbty zzbtyVar) {
        this.zza = zzbucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void zze(zzbhy zzbhyVar, String str) {
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener;
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener2;
        NativeCustomFormatAd zzf;
        zzbuc zzbucVar = this.zza;
        onCustomClickListener = zzbucVar.zzb;
        if (onCustomClickListener == null) {
            return;
        }
        onCustomClickListener2 = zzbucVar.zzb;
        zzf = zzbucVar.zzf(zzbhyVar);
        onCustomClickListener2.onCustomClick(zzf, str);
    }
}
