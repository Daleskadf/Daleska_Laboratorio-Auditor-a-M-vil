package com.google.android.play.core.splitinstall.internal;

import android.os.Build;
/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes3.dex */
public final class zzao {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzan zza() {
        int i;
        switch (Build.VERSION.SDK_INT) {
            case 21:
                return new zzat();
            case 22:
                return new zzau();
            case 23:
                return new zzay();
            case 24:
                return new zzaz();
            case 25:
                return new zzba();
            case 26:
                return new zzbd();
            case 27:
                i = Build.VERSION.PREVIEW_SDK_INT;
                if (i == 0) {
                    return new zzbe();
                }
                break;
        }
        return new zzbg();
    }
}
