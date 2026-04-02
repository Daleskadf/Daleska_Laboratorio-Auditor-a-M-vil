package com.google.android.gms.internal.ads;

import android.os.Handler;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfow implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfoz.zzc;
        if (handler != null) {
            handler2 = zzfoz.zzc;
            runnable = zzfoz.zzd;
            handler2.post(runnable);
            handler3 = zzfoz.zzc;
            runnable2 = zzfoz.zze;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
