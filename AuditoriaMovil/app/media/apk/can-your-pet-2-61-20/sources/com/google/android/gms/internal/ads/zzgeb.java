package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgeb implements Runnable {
    final Future zza;
    final zzgea zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgeb(Future future, zzgea zzgeaVar) {
        this.zza = future;
        this.zzb = zzgeaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future future = this.zza;
        if (!(future instanceof zzgfh) || (zza = zzgfi.zza((zzgfh) future)) == null) {
            try {
                this.zzb.zzb(zzgee.zzp(this.zza));
                return;
            } catch (ExecutionException e) {
                this.zzb.zza(e.getCause());
                return;
            } catch (Throwable th) {
                this.zzb.zza(th);
                return;
            }
        }
        this.zzb.zza(zza);
    }

    public final String toString() {
        zzfwj zza = zzfwk.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
