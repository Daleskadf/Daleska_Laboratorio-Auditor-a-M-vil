package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
final class zzei implements Runnable {
    final Future zza;
    final zzeh zzb;

    public zzei(Future future, zzeh zzehVar) {
        this.zza = future;
        this.zzb = zzehVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z7 = true;
        boolean z8 = false;
        Throwable zza = zzey.zza((zzex) this.zza);
        if (zza == null) {
            try {
                Future future = this.zza;
                if (future.isDone()) {
                    while (true) {
                        try {
                            obj = future.get();
                            break;
                        } catch (InterruptedException unused) {
                            z8 = z7;
                        } catch (Throwable th) {
                            if (z8) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                    if (z8) {
                        Thread.currentThread().interrupt();
                    }
                    this.zzb.zzb(obj);
                    return;
                }
                throw new IllegalStateException(zzba.zzb("Future was expected to be done: %s", future));
            } catch (ExecutionException e7) {
                this.zzb.zza(e7.getCause());
                return;
            } catch (Throwable th2) {
                this.zzb.zza(th2);
                return;
            }
        }
        this.zzb.zza(zza);
    }

    public final String toString() {
        zzav zza = zzaw.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
