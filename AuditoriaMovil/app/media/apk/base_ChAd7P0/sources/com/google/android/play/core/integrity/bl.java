package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
final class bl extends bi {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ bn f9549c;

    /* renamed from: d  reason: collision with root package name */
    private final w3.y f9550d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f9549c = bnVar;
        this.f9550d = new w3.y("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, w3.q
    public final void e(Bundle bundle) {
        k kVar;
        super.e(bundle);
        this.f9550d.b("onWarmUpExpressIntegrityToken", new Object[0]);
        kVar = this.f9549c.f;
        com.google.android.gms.common.api.j a7 = kVar.a(bundle);
        if (a7 != null) {
            this.f9543a.trySetException(a7);
        } else {
            this.f9543a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
