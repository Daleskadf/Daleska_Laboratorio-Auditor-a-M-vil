package z0;

import android.app.Dialog;
import android.view.View;
/* renamed from: z0.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2057q extends org.slf4j.helpers.i {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C2059t f16784d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ r f16785e;

    public C2057q(r rVar, C2059t c2059t) {
        this.f16785e = rVar;
        this.f16784d = c2059t;
    }

    @Override // org.slf4j.helpers.i
    public final View H(int i7) {
        this.f16784d.I();
        Dialog dialog = this.f16785e.f16795W0;
        if (dialog != null) {
            return dialog.findViewById(i7);
        }
        return null;
    }

    @Override // org.slf4j.helpers.i
    public final boolean I() {
        this.f16784d.I();
        return this.f16785e.f16799a1;
    }
}
