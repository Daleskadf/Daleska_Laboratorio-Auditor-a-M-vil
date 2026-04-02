package a6;

import D.AbstractC0055e;
/* renamed from: a6.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0496z extends AbstractC0479h {
    @Override // a6.AbstractC0479h
    public void a(String str, Throwable th) {
        f().a(str, th);
    }

    @Override // a6.AbstractC0479h
    public void b() {
        f().b();
    }

    @Override // a6.AbstractC0479h
    public final void c(int i7) {
        f().c(i7);
    }

    @Override // a6.AbstractC0479h
    public final void d(com.google.protobuf.J j) {
        f().d(j);
    }

    @Override // a6.AbstractC0479h
    public void e(AbstractC0471A abstractC0471A, e0 e0Var) {
        f().e(abstractC0471A, e0Var);
    }

    public abstract AbstractC0479h f();

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(f(), "delegate");
        return C7.toString();
    }
}
