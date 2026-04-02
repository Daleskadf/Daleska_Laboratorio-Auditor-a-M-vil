package com.google.android.gms.internal.p001authapi;

import R2.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: com.google.android.gms.internal.auth-api.zbae  reason: invalid package */
/* loaded from: classes.dex */
final class zbae extends zbs {
    final /* synthetic */ TaskCompletionSource zba;

    public zbae(zbag zbagVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapi.zbt
    public final void zbb(Status status, k kVar) {
        if (status.k()) {
            this.zba.setResult(kVar);
        } else {
            this.zba.setException(I.n(status));
        }
    }
}
