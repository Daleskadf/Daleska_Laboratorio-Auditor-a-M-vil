package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzpn extends BroadcastReceiver {
    final /* synthetic */ zzpo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzpn(zzpo zzpoVar, zzpm zzpmVar) {
        this.zza = zzpoVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzk zzkVar;
        zzpp zzppVar;
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzpo zzpoVar = this.zza;
        zzkVar = zzpoVar.zzh;
        zzppVar = zzpoVar.zzg;
        zzpoVar.zzj(zzph.zzd(context, intent, zzkVar, zzppVar));
    }
}
