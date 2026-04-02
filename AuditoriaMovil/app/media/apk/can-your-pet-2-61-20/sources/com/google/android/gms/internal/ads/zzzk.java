package com.google.android.gms.internal.ads;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzzk {
    private final Handler zza;
    private final zzzm zzb;
    private boolean zzc;

    public zzzk(Handler handler, zzzm zzzmVar) {
        this.zza = handler;
        this.zzb = zzzmVar;
    }

    public final void zzc() {
        this.zzc = true;
    }
}
