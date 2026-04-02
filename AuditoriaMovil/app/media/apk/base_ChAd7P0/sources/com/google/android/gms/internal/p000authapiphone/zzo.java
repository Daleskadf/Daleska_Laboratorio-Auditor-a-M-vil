package com.google.android.gms.internal.p000authapiphone;

import android.support.v4.media.session.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractBinderC0736j;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: com.google.android.gms.internal.auth-api-phone.zzo  reason: invalid package */
/* loaded from: classes.dex */
final class zzo extends AbstractBinderC0736j {
    final /* synthetic */ TaskCompletionSource zza;

    public zzo(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0737k
    public final void onResult(Status status) {
        if (status.f9153a == 6) {
            this.zza.trySetException(I.n(status));
        } else {
            a.w(status, null, this.zza);
        }
    }
}
