package c6;

import a6.EnumC0486o;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: c6.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644E {

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f8441a;

    /* renamed from: b  reason: collision with root package name */
    public Object f8442b;

    public InterfaceC0720y a(D1 d12) {
        a6.O o7 = ((Z0) this.f8442b).f8674B;
        if (((Z0) this.f8442b).f8682J.get()) {
            return ((Z0) this.f8442b).f8680H;
        }
        if (o7 == null) {
            ((Z0) this.f8442b).f8714p.execute(new G.c(this, 13));
            return ((Z0) this.f8442b).f8680H;
        }
        InterfaceC0720y f = AbstractC0671h0.f(o7.a(d12), Boolean.TRUE.equals(d12.f8438a.f));
        if (f != null) {
            return f;
        }
        return ((Z0) this.f8442b).f8680H;
    }

    public void b(EnumC0486o enumC0486o) {
        G.i.j(enumC0486o, "newState");
        if (((EnumC0486o) this.f8441a) != enumC0486o && ((EnumC0486o) this.f8441a) != EnumC0486o.SHUTDOWN) {
            this.f8441a = enumC0486o;
            if (((ArrayList) this.f8442b).isEmpty()) {
                return;
            }
            this.f8442b = new ArrayList();
            Iterator it = ((ArrayList) this.f8442b).iterator();
            while (it.hasNext()) {
                C0643D c0643d = (C0643D) it.next();
                c0643d.f8435b.execute(c0643d.f8434a);
            }
        }
    }
}
