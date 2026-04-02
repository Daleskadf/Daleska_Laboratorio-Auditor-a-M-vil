package com.google.android.gms.internal.location;

import android.location.Location;
import android.support.v4.media.session.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
final class zzdk extends zzy {
    final /* synthetic */ TaskCompletionSource zza;

    public zzdk(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzz
    public final void zzb(Status status, Location location) {
        a.w(status, location, this.zza);
    }
}
