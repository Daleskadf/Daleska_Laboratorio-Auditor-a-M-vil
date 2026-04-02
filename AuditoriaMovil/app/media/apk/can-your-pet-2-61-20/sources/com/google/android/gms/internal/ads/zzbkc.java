package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbkc implements zzbky {
    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgm zzcgmVar = (zzcgm) obj;
        com.google.android.gms.ads.internal.zzu.zzp();
        DisplayMetrics zzt = com.google.android.gms.ads.internal.util.zzt.zzt((WindowManager) zzcgmVar.getContext().getSystemService("window"));
        int i = zzt.widthPixels;
        int i2 = zzt.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzcgmVar).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        zzcgmVar.zzd("locationReady", hashMap);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("GET LOCATION COMPILED");
    }
}
