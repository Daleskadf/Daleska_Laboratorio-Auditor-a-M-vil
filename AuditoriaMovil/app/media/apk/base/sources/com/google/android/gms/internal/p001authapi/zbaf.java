package com.google.android.gms.internal.p001authapi;

import R2.m;
import android.support.v4.media.session.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: com.google.android.gms.internal.auth-api.zbaf  reason: invalid package */
/* loaded from: classes.dex */
final class zbaf extends zbu {
    final /* synthetic */ TaskCompletionSource zba;

    public zbaf(zbag zbagVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapi.zbv
    public final void zbb(Status status, m mVar) {
        a.w(status, mVar, this.zba);
    }
}
