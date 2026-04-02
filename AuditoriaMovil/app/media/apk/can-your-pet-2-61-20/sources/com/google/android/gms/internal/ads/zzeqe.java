package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeqe {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzeqd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzeqd zza() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzeqd zzeqdVar) {
        this.zzb = zzeqdVar;
    }

    public final void zzc(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
