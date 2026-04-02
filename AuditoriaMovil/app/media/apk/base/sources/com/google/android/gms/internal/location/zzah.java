package com.google.android.gms.internal.location;

import android.support.v4.media.session.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractBinderC0736j;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
final class zzah extends AbstractBinderC0736j {
    final /* synthetic */ TaskCompletionSource zza;

    public zzah(zzaj zzajVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0737k
    public final void onResult(Status status) {
        a.w(status, null, this.zza);
    }
}
