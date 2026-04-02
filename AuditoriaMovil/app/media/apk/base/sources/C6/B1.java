package c6;

import a6.AbstractC0471A;
import a6.AbstractC0478g;
import a6.EnumC0486o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/* loaded from: classes.dex */
public final class B1 extends a6.Q {
    public final AbstractC0478g f;

    /* renamed from: g  reason: collision with root package name */
    public AbstractC0471A f8430g;

    /* renamed from: h  reason: collision with root package name */
    public EnumC0486o f8431h = EnumC0486o.IDLE;

    public B1(AbstractC0478g abstractC0478g) {
        this.f = abstractC0478g;
    }

    @Override // a6.Q
    public final a6.o0 a(a6.N n7) {
        Boolean bool;
        List list = n7.f7096a;
        if (list.isEmpty()) {
            a6.o0 o0Var = a6.o0.f7180n;
            a6.o0 g3 = o0Var.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + n7.f7097b);
            c(g3);
            return g3;
        }
        Object obj = n7.f7098c;
        if ((obj instanceof C0725z1) && (bool = ((C0725z1) obj).f9061a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        AbstractC0471A abstractC0471A = this.f8430g;
        if (abstractC0471A == null) {
            a6.L d7 = a6.L.d();
            d7.e(list);
            a6.L b5 = d7.b();
            AbstractC0478g abstractC0478g = this.f;
            AbstractC0471A g4 = abstractC0478g.g(b5);
            g4.o(new C0719x1(this, g4));
            this.f8430g = g4;
            EnumC0486o enumC0486o = EnumC0486o.CONNECTING;
            A1 a12 = new A1(a6.M.b(g4, null));
            this.f8431h = enumC0486o;
            abstractC0478g.r(enumC0486o, a12);
            g4.l();
        } else {
            abstractC0471A.p(list);
        }
        return a6.o0.f7173e;
    }

    @Override // a6.Q
    public final void c(a6.o0 o0Var) {
        AbstractC0471A abstractC0471A = this.f8430g;
        if (abstractC0471A != null) {
            abstractC0471A.m();
            this.f8430g = null;
        }
        EnumC0486o enumC0486o = EnumC0486o.TRANSIENT_FAILURE;
        A1 a12 = new A1(a6.M.a(o0Var));
        this.f8431h = enumC0486o;
        this.f.r(enumC0486o, a12);
    }

    @Override // a6.Q
    public final void e() {
        AbstractC0471A abstractC0471A = this.f8430g;
        if (abstractC0471A != null) {
            abstractC0471A.l();
        }
    }

    @Override // a6.Q
    public final void f() {
        AbstractC0471A abstractC0471A = this.f8430g;
        if (abstractC0471A != null) {
            abstractC0471A.m();
        }
    }
}
