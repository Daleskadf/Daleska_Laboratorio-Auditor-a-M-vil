package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcow implements zzcoa {
    private final CookieManager zza;

    public zzcow(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzu.zzq().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zza(Map map) {
        if (this.zza == null) {
            return;
        }
        if (((String) map.get("clear")) != null) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaN);
            String cookie = this.zza.getCookie(str);
            if (cookie != null) {
                List zzf = zzfxe.zzc(zzfwc.zzc(';')).zzf(cookie);
                for (int i = 0; i < zzf.size(); i++) {
                    CookieManager cookieManager = this.zza;
                    Iterator it = zzfxe.zzc(zzfwc.zzc('=')).zzd((String) zzf.get(i)).iterator();
                    it.getClass();
                    if (it.hasNext()) {
                        cookieManager.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzax))));
                    } else {
                        throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
                    }
                }
                return;
            }
            return;
        }
        String str2 = (String) map.get("cookie");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.setCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaN), str2);
    }
}
