package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgfe extends zzgdu implements RunnableFuture {
    @CheckForNull
    private volatile zzgen zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgfe(zzgdk zzgdkVar) {
        this.zza = new zzgfc(this, zzgdkVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgfe zze(Runnable runnable, Object obj) {
        return new zzgfe(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgen zzgenVar = this.zza;
        if (zzgenVar != null) {
            zzgenVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    @CheckForNull
    protected final String zza() {
        zzgen zzgenVar = this.zza;
        if (zzgenVar != null) {
            String obj = zzgenVar.toString();
            return "task=[" + obj + "]";
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    protected final void zzb() {
        zzgen zzgenVar;
        if (zzt() && (zzgenVar = this.zza) != null) {
            zzgenVar.zzh();
        }
        this.zza = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgfe(Callable callable) {
        this.zza = new zzgfd(this, callable);
    }
}
