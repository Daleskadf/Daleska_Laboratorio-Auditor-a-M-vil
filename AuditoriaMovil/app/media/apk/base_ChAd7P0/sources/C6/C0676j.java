package c6;

import a1.C0415A;
import a6.AbstractC0482k;
import a6.C0476e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: c6.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0676j extends AbstractC0653b0 {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0642C f8858a;

    /* renamed from: c  reason: collision with root package name */
    public volatile a6.o0 f8860c;

    /* renamed from: d  reason: collision with root package name */
    public a6.o0 f8861d;

    /* renamed from: e  reason: collision with root package name */
    public a6.o0 f8862e;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0679k f8863g;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f8859b = new AtomicInteger(-2147483647);
    public final C0415A f = new C0415A(this);

    public C0676j(C0679k c0679k, InterfaceC0642C interfaceC0642C, String str) {
        this.f8863g = c0679k;
        G.i.j(interfaceC0642C, "delegate");
        this.f8858a = interfaceC0642C;
    }

    public static void h(C0676j c0676j) {
        synchronized (c0676j) {
            try {
                if (c0676j.f8859b.get() == 0) {
                    a6.o0 o0Var = c0676j.f8861d;
                    a6.o0 o0Var2 = c0676j.f8862e;
                    c0676j.f8861d = null;
                    c0676j.f8862e = null;
                    if (o0Var != null) {
                        super.a(o0Var);
                    }
                    if (o0Var2 != null) {
                        super.d(o0Var2);
                    }
                }
            } finally {
            }
        }
    }

    @Override // c6.AbstractC0653b0, c6.InterfaceC0672h1
    public final void a(a6.o0 o0Var) {
        G.i.j(o0Var, "status");
        synchronized (this) {
            try {
                if (this.f8859b.get() < 0) {
                    this.f8860c = o0Var;
                    this.f8859b.addAndGet(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                    if (this.f8859b.get() != 0) {
                        this.f8861d = o0Var;
                    } else {
                        super.a(o0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c6.InterfaceC0720y
    public final InterfaceC0711v b(Q0.A a7, a6.e0 e0Var, C0476e c0476e, AbstractC0482k[] abstractC0482kArr) {
        S s7;
        t4.k kVar = c0476e.f7134c;
        if (kVar == null) {
            this.f8863g.getClass();
            kVar = null;
        } else {
            this.f8863g.getClass();
        }
        if (kVar != null) {
            C0693o1 c0693o1 = new C0693o1(this.f8858a, a7, e0Var, c0476e, this.f, abstractC0482kArr);
            if (this.f8859b.incrementAndGet() > 0) {
                C0676j c0676j = (C0676j) this.f.f6744a;
                if (c0676j.f8859b.decrementAndGet() == 0) {
                    h(c0676j);
                }
                return new Z(this.f8860c, abstractC0482kArr);
            }
            try {
                P0 p02 = this.f8863g.f8875b;
                Task A7 = kVar.f15814a.A();
                Task A8 = kVar.f15815b.A();
                Tasks.whenAll(A7, A8).addOnCompleteListener(u4.k.f16005b, new com.google.firebase.storage.r(A7, c0693o1, A8, 1));
            } catch (Throwable th) {
                c0693o1.a(a6.o0.j.g("Credentials should use fail() instead of throwing exceptions").f(th));
            }
            synchronized (c0693o1.f8944h) {
                try {
                    InterfaceC0711v interfaceC0711v = c0693o1.f8945i;
                    s7 = interfaceC0711v;
                    if (interfaceC0711v == null) {
                        S s8 = new S();
                        c0693o1.f8946k = s8;
                        c0693o1.f8945i = s8;
                    }
                } finally {
                }
            }
            return s7;
        } else if (this.f8859b.get() >= 0) {
            return new Z(this.f8860c, abstractC0482kArr);
        } else {
            return this.f8858a.b(a7, e0Var, c0476e, abstractC0482kArr);
        }
    }

    @Override // c6.AbstractC0653b0, c6.InterfaceC0672h1
    public final void d(a6.o0 o0Var) {
        G.i.j(o0Var, "status");
        synchronized (this) {
            try {
                if (this.f8859b.get() < 0) {
                    this.f8860c = o0Var;
                    this.f8859b.addAndGet(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                } else if (this.f8862e != null) {
                    return;
                }
                if (this.f8859b.get() != 0) {
                    this.f8862e = o0Var;
                } else {
                    super.d(o0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c6.AbstractC0653b0
    public final InterfaceC0642C g() {
        return this.f8858a;
    }
}
