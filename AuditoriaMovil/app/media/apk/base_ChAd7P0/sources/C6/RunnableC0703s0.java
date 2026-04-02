package c6;

import c1.RunnableC0626c;
import w.C1935t;
/* renamed from: c6.s0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0703s0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8975a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8976b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8977c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f8978d;

    public RunnableC0703s0(C0721y0 c0721y0, C0709u0 c0709u0, boolean z7) {
        this.f8975a = 0;
        this.f8978d = c0721y0;
        this.f8977c = c0709u0;
        this.f8976b = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8975a) {
            case 0:
                ((C0721y0) this.f8978d).f9052t.u((C0709u0) this.f8977c, this.f8976b);
                return;
            default:
                ((G.k) this.f8977c).execute(new RunnableC0626c(this, 25));
                return;
        }
    }

    public RunnableC0703s0(C1935t c1935t, G.k kVar) {
        this.f8975a = 1;
        this.f8978d = c1935t;
        this.f8976b = false;
        this.f8977c = kVar;
    }
}
