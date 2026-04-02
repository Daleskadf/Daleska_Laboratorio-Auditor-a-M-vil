package i6;

import D.AbstractC0055e;
import a6.AbstractC0471A;
import a6.AbstractC0478g;
import a6.EnumC0486o;
import a6.L;
import a6.O;
import a6.u0;
import java.util.concurrent.ScheduledExecutorService;
/* renamed from: i6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1114a extends AbstractC0478g {
    @Override // a6.AbstractC0478g
    public AbstractC0471A g(L l8) {
        return s().g(l8);
    }

    @Override // a6.AbstractC0478g
    public final AbstractC0478g h() {
        return s().h();
    }

    @Override // a6.AbstractC0478g
    public final ScheduledExecutorService i() {
        return s().i();
    }

    @Override // a6.AbstractC0478g
    public final u0 j() {
        return s().j();
    }

    @Override // a6.AbstractC0478g
    public final void q() {
        s().q();
    }

    @Override // a6.AbstractC0478g
    public void r(EnumC0486o enumC0486o, O o7) {
        s().r(enumC0486o, o7);
    }

    public abstract AbstractC0478g s();

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(s(), "delegate");
        return C7.toString();
    }
}
