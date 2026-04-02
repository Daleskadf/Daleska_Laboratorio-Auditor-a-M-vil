package com.google.android.gms.internal.p001authapi;

import R2.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: com.google.android.gms.internal.auth-api.zbz  reason: invalid package */
/* loaded from: classes.dex */
final class zbz extends zbi {
    final /* synthetic */ TaskCompletionSource zba;

    public zbz(zbaa zbaaVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapi.zbj
    public final void zbb(Status status, a aVar) {
        if (status.k()) {
            this.zba.setResult(aVar);
        } else {
            this.zba.setException(I.n(status));
        }
    }
}
