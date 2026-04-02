package i6;

import D.AbstractC0055e;
import a6.AbstractC0471A;
import a6.AbstractC0478g;
import java.util.List;
/* renamed from: i6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1115b extends AbstractC0471A {
    @Override // a6.AbstractC0471A
    public final List b() {
        return q().b();
    }

    @Override // a6.AbstractC0471A
    public final AbstractC0478g d() {
        return q().d();
    }

    @Override // a6.AbstractC0471A
    public final Object e() {
        return q().e();
    }

    @Override // a6.AbstractC0471A
    public final void l() {
        q().l();
    }

    @Override // a6.AbstractC0471A
    public void m() {
        q().m();
    }

    @Override // a6.AbstractC0471A
    public void p(List list) {
        q().p(list);
    }

    public abstract AbstractC0471A q();

    public String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(q(), "delegate");
        return C7.toString();
    }
}
