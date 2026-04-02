package c6;

import D.AbstractC0055e;
import a6.C0473b;
/* renamed from: c6.b0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0653b0 implements InterfaceC0642C {
    @Override // c6.InterfaceC0672h1
    public void a(a6.o0 o0Var) {
        g().a(o0Var);
    }

    @Override // a6.G
    public final a6.H c() {
        return g().c();
    }

    @Override // c6.InterfaceC0672h1
    public void d(a6.o0 o0Var) {
        g().d(o0Var);
    }

    @Override // c6.InterfaceC0672h1
    public final Runnable e(InterfaceC0669g1 interfaceC0669g1) {
        return g().e(interfaceC0669g1);
    }

    @Override // c6.InterfaceC0642C
    public final C0473b f() {
        return g().f();
    }

    public abstract InterfaceC0642C g();

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(g(), "delegate");
        return C7.toString();
    }
}
