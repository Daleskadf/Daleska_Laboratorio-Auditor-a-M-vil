package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaxv extends BroadcastReceiver {
    final /* synthetic */ zzaxw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxv(zzaxw zzaxwVar) {
        this.zza = zzaxwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzf();
    }
}
