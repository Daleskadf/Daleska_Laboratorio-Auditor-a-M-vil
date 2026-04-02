package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ai extends w3.u {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ aj f9487a;

    /* renamed from: b  reason: collision with root package name */
    private final w3.y f9488b;

    /* renamed from: c  reason: collision with root package name */
    private final TaskCompletionSource f9489c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f9487a = ajVar;
        this.f9488b = new w3.y("OnRequestIntegrityTokenCallback");
        this.f9489c = taskCompletionSource;
    }

    @Override // w3.v
    public final void b(Bundle bundle) {
        k kVar;
        String str;
        this.f9487a.f9490a.d(this.f9489c);
        this.f9488b.b("onRequestIntegrityToken", new Object[0]);
        kVar = this.f9487a.f9494e;
        com.google.android.gms.common.api.j a7 = kVar.a(bundle);
        if (a7 != null) {
            this.f9489c.trySetException(a7);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f9489c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        long j = bundle.getLong("request.token.sid");
        str = this.f9487a.f9492c;
        ah ahVar = new ah(this, str, j);
        TaskCompletionSource taskCompletionSource = this.f9489c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
