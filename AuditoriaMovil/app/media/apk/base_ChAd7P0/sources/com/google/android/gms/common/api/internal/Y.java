package com.google.android.gms.common.api.internal;

import D.AbstractC0059i;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;
/* loaded from: classes.dex */
public final class Y extends b0 {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0731e f9218b;

    public Y(int i7, AbstractC0731e abstractC0731e) {
        super(i7);
        com.google.android.gms.common.internal.I.j(abstractC0731e, "Null methods are not runnable.");
        this.f9218b = abstractC0731e;
    }

    @Override // com.google.android.gms.common.api.internal.b0
    public final void a(Status status) {
        try {
            this.f9218b.setFailedResult(status);
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.b0
    public final void b(RuntimeException runtimeException) {
        try {
            this.f9218b.setFailedResult(new Status(10, AbstractC0059i.A(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.b0
    public final void c(G g3) {
        try {
            this.f9218b.run(g3.f9176b);
        } catch (RuntimeException e7) {
            b(e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.b0
    public final void d(D d7, boolean z7) {
        Boolean valueOf = Boolean.valueOf(z7);
        AbstractC0731e abstractC0731e = this.f9218b;
        ((Map) d7.f9166a).put(abstractC0731e, valueOf);
        abstractC0731e.addStatusListener(new B(d7, abstractC0731e));
    }
}
