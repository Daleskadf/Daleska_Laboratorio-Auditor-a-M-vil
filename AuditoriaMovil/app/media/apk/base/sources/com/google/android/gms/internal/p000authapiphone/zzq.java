package com.google.android.gms.internal.p000authapiphone;

import android.support.v4.media.session.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: com.google.android.gms.internal.auth-api-phone.zzq  reason: invalid package */
/* loaded from: classes.dex */
final class zzq extends zzf {
    final /* synthetic */ TaskCompletionSource zza;

    public zzq(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zzg
    public final void zzb(Status status, boolean z7) {
        a.w(status, Boolean.valueOf(z7), this.zza);
    }
}
