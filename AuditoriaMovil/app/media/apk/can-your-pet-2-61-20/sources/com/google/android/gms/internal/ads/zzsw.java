package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzsw extends Handler {
    final /* synthetic */ zzsy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzsw(zzsy zzsyVar, Looper looper) {
        super(looper);
        this.zza = zzsyVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzsy.zza(this.zza, message);
    }
}
