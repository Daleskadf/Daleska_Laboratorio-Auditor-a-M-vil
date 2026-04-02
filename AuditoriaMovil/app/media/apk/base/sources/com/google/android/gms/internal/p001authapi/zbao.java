package com.google.android.gms.internal.p001authapi;

import android.app.PendingIntent;
import android.support.v4.media.session.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: com.google.android.gms.internal.auth-api.zbao  reason: invalid package */
/* loaded from: classes.dex */
final class zbao extends zbq {
    final /* synthetic */ TaskCompletionSource zba;

    public zbao(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapi.zbr
    public final void zbb(Status status, PendingIntent pendingIntent) {
        a.w(status, pendingIntent, this.zba);
    }
}
