package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcoy implements zzcoa {
    private final zzdxf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcoy(zzdxf zzdxfVar) {
        this.zza = zzdxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzo(str.equals("true"));
    }
}
