package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfoj {
    private static UiModeManager zza;

    public static zzfne zza() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType != 1) {
                if (currentModeType == 4) {
                    return zzfne.CTV;
                }
                return zzfne.OTHER;
            }
            return zzfne.MOBILE;
        }
        return zzfne.OTHER;
    }

    public static void zzb(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
