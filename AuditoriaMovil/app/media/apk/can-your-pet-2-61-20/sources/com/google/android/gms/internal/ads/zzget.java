package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgcs;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzget extends zzgcs.zzi implements Runnable {
    private final Runnable zza;

    public zzget(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgcs
    public final String zza() {
        String obj = this.zza.toString();
        return "task=[" + obj + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzd(th);
            throw th;
        }
    }
}
