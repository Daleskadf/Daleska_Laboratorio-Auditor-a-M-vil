package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractBinderC0736j;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
final class zzx extends AbstractBinderC0736j {
    final /* synthetic */ TaskCompletionSource zza;

    public zzx(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0737k
    public final void onResult(Status status) {
        zzab.zzf(status, null, this.zza);
    }
}
