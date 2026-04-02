package z0;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class J implements I {

    /* renamed from: a  reason: collision with root package name */
    public final int f16640a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ L f16641b;

    public J(L l8, int i7) {
        this.f16641b = l8;
        this.f16640a = i7;
    }

    @Override // z0.I
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        L l8 = this.f16641b;
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = l8.f16680y;
        int i7 = this.f16640a;
        if (abstractComponentCallbacksC2061v != null && i7 < 0 && abstractComponentCallbacksC2061v.l().Q()) {
            return false;
        }
        return l8.R(arrayList, arrayList2, i7, 1);
    }
}
