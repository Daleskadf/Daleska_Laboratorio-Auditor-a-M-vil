package c6;

import a1.C0415A;
import a6.AbstractC0471A;
import j6.AbstractC1371b;
import j6.C1370a;
import j6.C1372c;
import java.io.InputStream;
import java.util.logging.Logger;
/* renamed from: c6.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0697q extends AbstractRunnableC0645F {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8955c = 1;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ R1.j f8956d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f8957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0697q(R1.j jVar, a6.e0 e0Var) {
        super(((C0708u) jVar.f4684d).f, 0);
        this.f8956d = jVar;
        this.f8957e = e0Var;
    }

    @Override // c6.AbstractRunnableC0645F
    public final void b() {
        switch (this.f8955c) {
            case 0:
                R1.j jVar = this.f8956d;
                AbstractC1371b.c();
                try {
                    C1372c c1372c = ((C0708u) jVar.f4684d).f8996b;
                    AbstractC1371b.a();
                    AbstractC1371b.f13458a.getClass();
                    if (((a6.o0) jVar.f4683c) == null) {
                        ((AbstractC0471A) jVar.f4682b).h((a6.e0) this.f8957e);
                    }
                    AbstractC1371b.f13458a.getClass();
                    return;
                } finally {
                    try {
                        AbstractC1371b.f13458a.getClass();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            default:
                AbstractC1371b.c();
                try {
                    C1372c c1372c2 = ((C0708u) this.f8956d.f4684d).f8996b;
                    AbstractC1371b.a();
                    C1370a c1370a = AbstractC1371b.f13458a;
                    c1370a.getClass();
                    c();
                    c1370a.getClass();
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
        }
    }

    public void c() {
        R1.j jVar = this.f8956d;
        a6.o0 o0Var = (a6.o0) jVar.f4683c;
        C0708u c0708u = (C0708u) jVar.f4684d;
        C0415A c0415a = (C0415A) this.f8957e;
        if (o0Var != null) {
            Logger logger = AbstractC0671h0.f8829a;
            while (true) {
                InputStream k2 = c0415a.k();
                if (k2 != null) {
                    AbstractC0671h0.b(k2);
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                try {
                    InputStream k8 = c0415a.k();
                    if (k8 != null) {
                        ((AbstractC0471A) jVar.f4682b).i(c0708u.f8995a.f(k8));
                        k8.close();
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    Logger logger2 = AbstractC0671h0.f8829a;
                    while (true) {
                        InputStream k9 = c0415a.k();
                        if (k9 != null) {
                            AbstractC0671h0.b(k9);
                        } else {
                            a6.o0 g3 = a6.o0.f.f(th).g("Failed to read message.");
                            jVar.f4683c = g3;
                            c0708u.j.i(g3);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0697q(R1.j jVar, C0415A c0415a) {
        super(((C0708u) jVar.f4684d).f, 0);
        this.f8956d = jVar;
        this.f8957e = c0415a;
    }
}
