package com.google.android.gms.internal.location;

import android.support.v4.media.session.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
final class zzdl extends zzw {
    final /* synthetic */ TaskCompletionSource zza;

    public zzdl(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzx
    public final void zzb(Status status, LocationAvailability locationAvailability) {
        a.w(status, locationAvailability, this.zza);
    }
}
