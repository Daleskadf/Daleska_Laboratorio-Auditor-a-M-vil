package c6;

import a6.EnumC0486o;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: c6.r0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0700r0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8967a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a6.o0 f8968b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0721y0 f8969c;

    public /* synthetic */ RunnableC0700r0(C0721y0 c0721y0, a6.o0 o0Var, int i7) {
        this.f8967a = i7;
        this.f8969c = c0721y0;
        this.f8968b = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8967a) {
            case 0:
                EnumC0486o enumC0486o = this.f8969c.f9055w.f7186a;
                EnumC0486o enumC0486o2 = EnumC0486o.SHUTDOWN;
                if (enumC0486o != enumC0486o2) {
                    C0721y0 c0721y0 = this.f8969c;
                    c0721y0.f9056x = this.f8968b;
                    C0709u0 c0709u0 = c0721y0.f9054v;
                    C0721y0 c0721y02 = this.f8969c;
                    C0709u0 c0709u02 = c0721y02.f9053u;
                    c0721y02.f9054v = null;
                    C0721y0 c0721y03 = this.f8969c;
                    c0721y03.f9053u = null;
                    C0721y0.g(c0721y03, enumC0486o2);
                    this.f8969c.f9044l.d();
                    if (this.f8969c.f9051s.isEmpty()) {
                        C0721y0 c0721y04 = this.f8969c;
                        c0721y04.getClass();
                        c0721y04.f9043k.execute(new RunnableC0698q0(c0721y04, 2));
                    }
                    C0721y0 c0721y05 = this.f8969c;
                    c0721y05.f9043k.e();
                    a6.t0 t0Var = c0721y05.f9048p;
                    if (t0Var != null) {
                        t0Var.o();
                        c0721y05.f9048p = null;
                        c0721y05.f9046n = null;
                    }
                    a6.t0 t0Var2 = this.f8969c.f9049q;
                    if (t0Var2 != null) {
                        t0Var2.o();
                        this.f8969c.f9050r.a(this.f8968b);
                        C0721y0 c0721y06 = this.f8969c;
                        c0721y06.f9049q = null;
                        c0721y06.f9050r = null;
                    }
                    if (c0709u0 != null) {
                        c0709u0.a(this.f8968b);
                    }
                    if (c0709u02 != null) {
                        c0709u02.a(this.f8968b);
                        return;
                    }
                    return;
                }
                return;
            default:
                Iterator it = new ArrayList(this.f8969c.f9051s).iterator();
                while (it.hasNext()) {
                    ((InterfaceC0672h1) it.next()).d(this.f8968b);
                }
                return;
        }
    }
}
