package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfuy {
    private static final zzfvg zzb = new zzfvg("OverlayDisplayService");
    private static final Intent zzc = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzfvr zza;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfuy(Context context) {
        if (zzfvu.zza(context)) {
            this.zza = new zzfvr(context.getApplicationContext(), zzb, "OverlayDisplayService", zzc, zzfut.zza, null);
        } else {
            this.zza = null;
        }
        this.zzd = context.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        if (this.zza == null) {
            return;
        }
        zzb.zzc("unbind LMD display overlay service", new Object[0]);
        this.zza.zzu();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(zzfup zzfupVar, zzfvd zzfvdVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzfuv(this, taskCompletionSource, zzfupVar, zzfvdVar, taskCompletionSource), taskCompletionSource);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(zzfva zzfvaVar, zzfvd zzfvdVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else if (zzfvaVar.zzh() != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfuu(this, taskCompletionSource, zzfvaVar, zzfvdVar, taskCompletionSource), taskCompletionSource);
        } else {
            zzb.zza("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            zzfvb zzc2 = zzfvc.zzc();
            zzc2.zzb(8160);
            zzfvdVar.zza(zzc2.zzc());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(zzfvf zzfvfVar, zzfvd zzfvdVar, int i) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzfuw(this, taskCompletionSource, zzfvfVar, i, zzfvdVar, taskCompletionSource), taskCompletionSource);
    }
}
