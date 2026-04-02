package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
class bi extends w3.p {

    /* renamed from: a  reason: collision with root package name */
    final TaskCompletionSource f9543a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ bn f9544b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.f9544b = bnVar;
        this.f9543a = taskCompletionSource;
    }

    @Override // w3.q
    public final void b(Bundle bundle) {
        this.f9544b.f9551a.d(this.f9543a);
    }

    @Override // w3.q
    public void c(Bundle bundle) {
        this.f9544b.f9551a.d(this.f9543a);
    }

    @Override // w3.q
    public final void d(Bundle bundle) {
        this.f9544b.f9551a.d(this.f9543a);
    }

    @Override // w3.q
    public void e(Bundle bundle) {
        this.f9544b.f9551a.d(this.f9543a);
    }
}
