package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfs implements zzeu {
    private Message zza;
    private zzft zzb;

    private zzfs() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfs(zzfr zzfrVar) {
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzft.zzl(this);
    }

    public final zzfs zzb(Message message, zzft zzftVar) {
        this.zza = message;
        this.zzb = zzftVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeu
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        zzd();
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        zzd();
        return sendMessageAtFrontOfQueue;
    }
}
