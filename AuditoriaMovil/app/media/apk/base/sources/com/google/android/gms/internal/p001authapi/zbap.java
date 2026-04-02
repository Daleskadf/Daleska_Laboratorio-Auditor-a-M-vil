package com.google.android.gms.internal.p001authapi;

import android.app.PendingIntent;
import android.support.v4.media.session.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.auth-api.zbap  reason: invalid package */
/* loaded from: classes.dex */
public final class zbap extends zbo {
    final /* synthetic */ TaskCompletionSource zba;

    public zbap(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapi.zbp
    public final void zbb(Status status, PendingIntent pendingIntent) {
        a.w(status, pendingIntent, this.zba);
    }
}
