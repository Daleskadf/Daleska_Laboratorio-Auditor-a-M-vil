package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C0742p;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
final class zzdi implements zzdr {
    final /* synthetic */ C0742p zza;
    final /* synthetic */ TaskCompletionSource zzb;

    public zzdi(zzdz zzdzVar, C0742p c0742p, TaskCompletionSource taskCompletionSource) {
        this.zza = c0742p;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzdr
    public final C0742p zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzdr
    public final void zzb(C0742p c0742p) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.location.zzdr
    public final void zzc() {
        this.zzb.trySetResult(null);
    }
}
