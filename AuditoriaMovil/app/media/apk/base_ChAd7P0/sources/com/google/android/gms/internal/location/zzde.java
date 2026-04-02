package com.google.android.gms.internal.location;

import android.support.v4.media.session.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p3.r;
/* loaded from: classes.dex */
final class zzde extends zzaa {
    final /* synthetic */ TaskCompletionSource zza;

    public zzde(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p3.q, java.lang.Object] */
    @Override // com.google.android.gms.internal.location.zzab
    public final void zzb(r rVar) {
        Status status = rVar.f15128a;
        ?? obj = new Object();
        obj.f15127a = rVar;
        a.w(status, obj, this.zza);
    }
}
