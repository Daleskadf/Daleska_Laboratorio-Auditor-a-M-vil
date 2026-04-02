package com.google.android.gms.internal.p001authapi;

import android.support.v4.media.session.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractBinderC0736j;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.auth-api.zban  reason: invalid package */
/* loaded from: classes.dex */
public final class zban extends AbstractBinderC0736j {
    final /* synthetic */ TaskCompletionSource zba;

    public zban(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0737k
    public final void onResult(Status status) {
        a.w(status, null, this.zba);
    }
}
