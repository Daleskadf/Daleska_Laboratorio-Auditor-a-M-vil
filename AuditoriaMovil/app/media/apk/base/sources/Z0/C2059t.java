package z0;

import android.view.View;
/* renamed from: z0.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2059t extends org.slf4j.helpers.i {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC2061v f16801d;

    public C2059t(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        this.f16801d = abstractComponentCallbacksC2061v;
    }

    @Override // org.slf4j.helpers.i
    public final View H(int i7) {
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16801d;
        abstractComponentCallbacksC2061v.getClass();
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC2061v + " does not have a view");
    }

    @Override // org.slf4j.helpers.i
    public final boolean I() {
        this.f16801d.getClass();
        return false;
    }
}
