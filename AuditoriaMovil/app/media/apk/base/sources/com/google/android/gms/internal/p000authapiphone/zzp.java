package com.google.android.gms.internal.p000authapiphone;

import android.support.v4.media.session.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: com.google.android.gms.internal.auth-api-phone.zzp  reason: invalid package */
/* loaded from: classes.dex */
final class zzp extends zzd {
    final /* synthetic */ TaskCompletionSource zza;

    public zzp(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zze
    public final void zzb(Status status, int i7) {
        a.w(status, Integer.valueOf(i7), this.zza);
    }
}
