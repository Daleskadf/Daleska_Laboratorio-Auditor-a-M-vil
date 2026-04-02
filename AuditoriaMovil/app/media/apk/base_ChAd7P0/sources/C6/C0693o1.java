package c6;

import a1.C0415A;
import a6.AbstractC0482k;
import a6.C0476e;
import a6.C0489s;
/* renamed from: c6.o1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693o1 {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0720y f8938a;

    /* renamed from: b  reason: collision with root package name */
    public final Q0.A f8939b;

    /* renamed from: c  reason: collision with root package name */
    public final a6.e0 f8940c;

    /* renamed from: d  reason: collision with root package name */
    public final C0476e f8941d;
    public final C0415A f;

    /* renamed from: g  reason: collision with root package name */
    public final AbstractC0482k[] f8943g;

    /* renamed from: i  reason: collision with root package name */
    public InterfaceC0711v f8945i;
    public boolean j;

    /* renamed from: k  reason: collision with root package name */
    public S f8946k;

    /* renamed from: h  reason: collision with root package name */
    public final Object f8944h = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final C0489s f8942e = C0489s.b();

    public C0693o1(InterfaceC0720y interfaceC0720y, Q0.A a7, a6.e0 e0Var, C0476e c0476e, C0415A c0415a, AbstractC0482k[] abstractC0482kArr) {
        this.f8938a = interfaceC0720y;
        this.f8939b = a7;
        this.f8940c = e0Var;
        this.f8941d = c0476e;
        this.f = c0415a;
        this.f8943g = abstractC0482kArr;
    }

    public final void a(a6.o0 o0Var) {
        G.i.f("Cannot fail with OK status", !o0Var.e());
        G.i.o("apply() or fail() already called", !this.j);
        b(new Z(AbstractC0671h0.h(o0Var), EnumC0714w.PROCESSED, this.f8943g));
    }

    public final void b(InterfaceC0711v interfaceC0711v) {
        boolean z7;
        boolean z8 = true;
        G.i.o("already finalized", !this.j);
        this.j = true;
        synchronized (this.f8944h) {
            try {
                if (this.f8945i == null) {
                    this.f8945i = interfaceC0711v;
                    z7 = true;
                } else {
                    z7 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            C0676j c0676j = (C0676j) this.f.f6744a;
            if (c0676j.f8859b.decrementAndGet() == 0) {
                C0676j.h(c0676j);
                return;
            }
            return;
        }
        if (this.f8946k == null) {
            z8 = false;
        }
        G.i.o("delayedStream is null", z8);
        P r7 = this.f8946k.r(interfaceC0711v);
        if (r7 != null) {
            r7.run();
        }
        C0676j c0676j2 = (C0676j) this.f.f6744a;
        if (c0676j2.f8859b.decrementAndGet() == 0) {
            C0676j.h(c0676j2);
        }
    }
}
