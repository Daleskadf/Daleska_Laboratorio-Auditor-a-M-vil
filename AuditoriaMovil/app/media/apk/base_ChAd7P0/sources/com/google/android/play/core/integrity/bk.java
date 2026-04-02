package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
final class bk extends bi {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ bn f9546c;

    /* renamed from: d  reason: collision with root package name */
    private final w3.y f9547d;

    /* renamed from: e  reason: collision with root package name */
    private final long f9548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j) {
        super(bnVar, taskCompletionSource);
        this.f9546c = bnVar;
        this.f9547d = new w3.y("OnRequestIntegrityTokenCallback");
        this.f9548e = j;
    }

    @Override // com.google.android.play.core.integrity.bi, w3.q
    public final void c(Bundle bundle) {
        k kVar;
        String str;
        super.c(bundle);
        this.f9547d.b("onRequestExpressIntegrityToken", new Object[0]);
        kVar = this.f9546c.f;
        com.google.android.gms.common.api.j a7 = kVar.a(bundle);
        if (a7 != null) {
            this.f9543a.trySetException(a7);
            return;
        }
        long j = bundle.getLong("request.token.sid");
        str = this.f9546c.f9553c;
        bj bjVar = new bj(this, str, j);
        TaskCompletionSource taskCompletionSource = this.f9543a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
