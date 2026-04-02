package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzfb implements Handler.Callback {
    final /* synthetic */ zzfd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfb(zzfd zzfdVar) {
        this.zza = zzfdVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        boolean zzm;
        if (message.what == 1) {
            obj = zzfe.zza;
            if (obj.equals(message.obj)) {
                this.zza.zza.zza();
                zzfd zzfdVar = this.zza;
                zzm = zzfdVar.zza.zzm();
                if (!zzm) {
                    zzfdVar.zzc(1800000L);
                }
            }
        }
        return true;
    }
}
