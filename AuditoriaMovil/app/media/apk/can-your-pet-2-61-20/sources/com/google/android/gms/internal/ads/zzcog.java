package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcog implements zzcoa {
    private final zzdxf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcog(zzdxf zzdxfVar) {
        this.zza = zzdxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zza(Map map) {
        char c;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("flick")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            this.zza.zzm(zzdxb.SHAKE);
        } else if (c == 1) {
            this.zza.zzm(zzdxb.FLICK);
        } else {
            this.zza.zzm(zzdxb.NONE);
        }
    }
}
