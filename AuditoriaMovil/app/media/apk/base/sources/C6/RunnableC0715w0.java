package c6;

import D.C0054d;
import a6.EnumC0486o;
/* renamed from: c6.w0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0715w0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9022a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0054d f9023b;

    public /* synthetic */ RunnableC0715w0(C0054d c0054d, int i7) {
        this.f9022a = i7;
        this.f9023b = c0054d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        switch (this.f9022a) {
            case 0:
                C0054d c0054d = this.f9023b;
                C0721y0 c0721y0 = (C0721y0) c0054d.f690c;
                c0721y0.f9046n = null;
                if (c0721y0.f9056x != null) {
                    if (c0721y0.f9054v == null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    G.i.o("Unexpected non-null activeTransport", z7);
                    C0054d c0054d2 = this.f9023b;
                    ((C0709u0) c0054d2.f689b).a(((C0721y0) c0054d2.f690c).f9056x);
                    return;
                }
                C0709u0 c0709u0 = c0721y0.f9053u;
                C0709u0 c0709u02 = (C0709u0) c0054d.f689b;
                if (c0709u0 == c0709u02) {
                    c0721y0.f9054v = c0709u02;
                    C0721y0 c0721y02 = (C0721y0) this.f9023b.f690c;
                    c0721y02.f9053u = null;
                    C0721y0.g(c0721y02, EnumC0486o.READY);
                    return;
                }
                return;
            default:
                C0054d c0054d3 = this.f9023b;
                ((C0721y0) c0054d3.f690c).f9051s.remove((C0709u0) c0054d3.f689b);
                if (((C0721y0) this.f9023b.f690c).f9055w.f7186a == EnumC0486o.SHUTDOWN && ((C0721y0) this.f9023b.f690c).f9051s.isEmpty()) {
                    C0721y0 c0721y03 = (C0721y0) this.f9023b.f690c;
                    c0721y03.getClass();
                    c0721y03.f9043k.execute(new RunnableC0698q0(c0721y03, 2));
                    return;
                }
                return;
        }
    }
}
