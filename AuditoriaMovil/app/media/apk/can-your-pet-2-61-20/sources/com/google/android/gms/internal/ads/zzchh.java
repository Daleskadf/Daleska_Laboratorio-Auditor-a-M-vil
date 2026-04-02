package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzchh implements zzbky {
    final /* synthetic */ zzchj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchh(zzchj zzchjVar) {
        this.zza = zzchjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i;
        zzcgm zzcgmVar = (zzcgm) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.zza) {
                    zzchj zzchjVar = this.zza;
                    i = zzchjVar.zzH;
                    if (i != parseInt) {
                        zzchjVar.zzH = parseInt;
                        this.zza.requestLayout();
                    }
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Exception occurred while getting webview content height", e);
            }
        }
    }
}
