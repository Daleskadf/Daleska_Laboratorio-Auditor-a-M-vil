package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzcw {
    static final Map zza = new HashMap();
    private static String zzb;

    public static String zza(String str, String str2) {
        if (str2 == null) {
            if (str.length() > 0) {
                return str;
            }
            return null;
        }
        return Uri.parse("http://hostname/?".concat(String.valueOf(str))).getQueryParameter(str2);
    }

    public static String zzb(Context context, String str) {
        if (zzb == null) {
            synchronized (zzcw.class) {
                if (zzb == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_install_referrer", 0);
                    if (sharedPreferences != null) {
                        zzb = sharedPreferences.getString("referrer", "");
                    } else {
                        zzb = "";
                    }
                }
            }
        }
        return zza(zzb, str);
    }

    public static void zzc(Context context, String str) {
        String zza2 = zza(str, "conv");
        if (zza2 == null || zza2.length() <= 0) {
            return;
        }
        zza.put(zza2, str);
        zzff.zza(context, "gtm_click_referrers", zza2, str);
    }

    public static void zzd(String str) {
        synchronized (zzcw.class) {
            zzb = str;
        }
    }
}
