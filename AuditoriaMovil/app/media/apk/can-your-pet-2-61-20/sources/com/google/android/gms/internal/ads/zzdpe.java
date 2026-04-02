package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdpe implements zzbgs {
    final /* synthetic */ String zza = NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ zzdpf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpe(zzdpf zzdpfVar, String str) {
        this.zzb = zzdpfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzc() {
        zzdkt zzdktVar;
        zzdkt zzdktVar2;
        zzdpf zzdpfVar = this.zzb;
        zzdktVar = zzdpfVar.zzd;
        if (zzdktVar != null) {
            String str = this.zza;
            zzdktVar2 = zzdpfVar.zzd;
            zzdktVar2.zzE(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzd(MotionEvent motionEvent) {
    }
}
