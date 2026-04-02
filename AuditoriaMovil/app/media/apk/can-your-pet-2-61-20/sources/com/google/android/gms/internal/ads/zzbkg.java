package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbkg implements zzbky {
    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgm zzcgmVar = (zzcgm) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzfuz zzm = zzfva.zzm();
        zzm.zzb((String) map.get("appId"));
        zzm.zzi(zzcgmVar.getWidth());
        zzm.zzh(zzcgmVar.zzF().getWindowToken());
        if (!map.containsKey("gravityX") || !map.containsKey("gravityY")) {
            zzm.zzd(81);
        } else {
            zzm.zzd(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        }
        if (map.containsKey("verticalMargin")) {
            zzm.zze(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzm.zze(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzm.zza((String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzu.zzj().zzj(zzcgmVar, zzm.zzj());
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
