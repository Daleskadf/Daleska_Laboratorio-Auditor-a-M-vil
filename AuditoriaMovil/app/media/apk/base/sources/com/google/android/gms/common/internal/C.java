package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class C implements com.google.android.gms.common.api.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.r f9295a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9296b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0771u f9297c;

    public C(com.google.android.gms.common.api.r rVar, TaskCompletionSource taskCompletionSource, InterfaceC0771u interfaceC0771u) {
        this.f9295a = rVar;
        this.f9296b = taskCompletionSource;
        this.f9297c = interfaceC0771u;
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(Status status) {
        boolean k2 = status.k();
        TaskCompletionSource taskCompletionSource = this.f9296b;
        if (k2) {
            taskCompletionSource.setResult(this.f9297c.b(this.f9295a.await(0L, TimeUnit.MILLISECONDS)));
            return;
        }
        taskCompletionSource.setException(I.n(status));
    }
}
