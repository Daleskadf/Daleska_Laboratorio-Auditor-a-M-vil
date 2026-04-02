package p;

import h0.AbstractC1066z;
import java.lang.reflect.Field;
/* renamed from: p.d0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1578d0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14786a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC1584g0 f14787b;

    public /* synthetic */ RunnableC1578d0(AbstractC1584g0 abstractC1584g0, int i7) {
        this.f14786a = i7;
        this.f14787b = abstractC1584g0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1584g0 abstractC1584g0 = this.f14787b;
        switch (this.f14786a) {
            case 0:
                C1594l0 c1594l0 = abstractC1584g0.f14801c;
                if (c1594l0 != null) {
                    c1594l0.setListSelectionHidden(true);
                    c1594l0.requestLayout();
                    return;
                }
                return;
            default:
                C1594l0 c1594l02 = abstractC1584g0.f14801c;
                if (c1594l02 != null) {
                    Field field = AbstractC1066z.f11214a;
                    if (c1594l02.isAttachedToWindow() && abstractC1584g0.f14801c.getCount() > abstractC1584g0.f14801c.getChildCount() && abstractC1584g0.f14801c.getChildCount() <= Integer.MAX_VALUE) {
                        abstractC1584g0.q0.setInputMethodMode(2);
                        abstractC1584g0.b();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
