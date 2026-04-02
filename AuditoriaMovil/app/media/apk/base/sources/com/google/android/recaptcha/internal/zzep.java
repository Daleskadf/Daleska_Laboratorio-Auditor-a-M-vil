package com.google.android.recaptcha.internal;

import F6.D;
import F6.H;
import java.util.TimerTask;
/* loaded from: classes.dex */
public final class zzep extends TimerTask {
    final /* synthetic */ zzes zza;

    public zzep(zzes zzesVar) {
        this.zza = zzesVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        D d7;
        zzes zzesVar = this.zza;
        d7 = zzesVar.zzd;
        H.q(d7, null, new zzeq(zzesVar, null), 3);
    }
}
