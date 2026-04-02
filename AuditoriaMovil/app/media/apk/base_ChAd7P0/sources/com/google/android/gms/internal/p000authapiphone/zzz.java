package com.google.android.gms.internal.p000authapiphone;

import android.support.v4.media.session.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: com.google.android.gms.internal.auth-api-phone.zzz  reason: invalid package */
/* loaded from: classes.dex */
final class zzz extends zzi {
    final /* synthetic */ TaskCompletionSource zza;

    public zzz(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zzj
    public final void zzb(Status status) {
        a.w(status, null, this.zza);
    }
}
