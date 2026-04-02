package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzjo implements Executor {
    private final /* synthetic */ zzjc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjo(zzjc zzjcVar) {
        this.zza = zzjcVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.zzl().zzb(runnable);
    }
}
