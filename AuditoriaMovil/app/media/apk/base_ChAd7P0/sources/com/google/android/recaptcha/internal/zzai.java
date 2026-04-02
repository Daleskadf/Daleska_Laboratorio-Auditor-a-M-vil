package com.google.android.recaptcha.internal;

import F6.D;
import F6.H;
import java.util.TimerTask;
/* loaded from: classes.dex */
public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        D d7;
        zzan zzanVar = this.zza;
        d7 = zzanVar.zzb;
        H.q(d7, null, new zzaj(zzanVar, null), 3);
    }
}
