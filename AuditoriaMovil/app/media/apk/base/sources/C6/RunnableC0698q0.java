package c6;

import a6.EnumC0477f;
import a6.EnumC0486o;
/* renamed from: c6.q0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0698q0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8958a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0721y0 f8959b;

    public /* synthetic */ RunnableC0698q0(C0721y0 c0721y0, int i7) {
        this.f8958a = i7;
        this.f8959b = c0721y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8958a) {
            case 0:
                C0721y0 c0721y0 = this.f8959b;
                c0721y0.f9048p = null;
                c0721y0.f9042i.l(EnumC0477f.INFO, "CONNECTING after backoff");
                C0721y0.g(c0721y0, EnumC0486o.CONNECTING);
                C0721y0.h(c0721y0);
                return;
            case 1:
                if (this.f8959b.f9055w.f7186a == EnumC0486o.IDLE) {
                    this.f8959b.f9042i.l(EnumC0477f.INFO, "CONNECTING as requested");
                    C0721y0.g(this.f8959b, EnumC0486o.CONNECTING);
                    C0721y0.h(this.f8959b);
                    return;
                }
                return;
            default:
                C0721y0 c0721y02 = this.f8959b;
                c0721y02.f9042i.l(EnumC0477f.INFO, "Terminated");
                Y0 y02 = (Y0) c0721y02.f9038d.f8985c;
                y02.j.f8676D.remove(c0721y02);
                Z0 z02 = y02.j;
                a6.G g3 = (a6.G) z02.f8691S.f7076b.remove(Long.valueOf(c0721y02.c().f7082c));
                Z0.A(z02);
                return;
        }
    }
}
