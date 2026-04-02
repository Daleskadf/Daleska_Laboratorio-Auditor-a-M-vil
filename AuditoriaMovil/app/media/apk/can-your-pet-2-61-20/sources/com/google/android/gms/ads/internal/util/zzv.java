package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbdz;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes.dex */
public class zzv extends zzu {
    static final boolean zze(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final boolean zzd(Activity activity, Configuration configuration) {
        boolean isInMultiWindowMode;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeL)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeN)).booleanValue()) {
                isInMultiWindowMode = activity.isInMultiWindowMode();
                return isInMultiWindowMode;
            }
            com.google.android.gms.ads.internal.client.zzay.zzb();
            int zzy = com.google.android.gms.ads.internal.util.client.zzf.zzy(activity, configuration.screenHeightDp);
            int zzy2 = com.google.android.gms.ads.internal.util.client.zzf.zzy(activity, configuration.screenWidthDp);
            com.google.android.gms.ads.internal.zzu.zzp();
            DisplayMetrics zzt = zzt.zzt((WindowManager) activity.getApplicationContext().getSystemService("window"));
            int i = zzt.heightPixels;
            int i2 = zzt.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            int round = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeJ)).intValue();
            return (zze(i, zzy + dimensionPixelSize, round) && zze(i2, zzy2, round)) ? false : true;
        }
        return false;
    }
}
