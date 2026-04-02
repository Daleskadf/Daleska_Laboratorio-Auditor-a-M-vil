package a1;

import android.os.Handler;
/* renamed from: a1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0429f implements i1.k {

    /* renamed from: X  reason: collision with root package name */
    public InterfaceC0428e f6805X;

    /* renamed from: Y  reason: collision with root package name */
    public C0430g f6806Y;

    /* renamed from: Z  reason: collision with root package name */
    public m1.l f6807Z;

    /* renamed from: a  reason: collision with root package name */
    public final int f6808a;

    /* renamed from: b  reason: collision with root package name */
    public final v f6809b;

    /* renamed from: c  reason: collision with root package name */
    public final X5.E f6810c;

    /* renamed from: d  reason: collision with root package name */
    public final M0.x f6811d;

    /* renamed from: e0  reason: collision with root package name */
    public volatile boolean f6813e0;
    public final InterfaceC0427d f;

    /* renamed from: g0  reason: collision with root package name */
    public volatile long f6815g0;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f6812e = K0.x.n(null);

    /* renamed from: f0  reason: collision with root package name */
    public volatile long f6814f0 = -9223372036854775807L;

    public C0429f(int i7, v vVar, X5.E e7, M0.x xVar, InterfaceC0427d interfaceC0427d) {
        this.f6808a = i7;
        this.f6809b = vVar;
        this.f6810c = e7;
        this.f6811d = xVar;
        this.f = interfaceC0427d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, H0.u] */
    @Override // i1.k
    public final void b() {
        if (this.f6813e0) {
            this.f6813e0 = false;
        }
        try {
            if (this.f6805X == null) {
                InterfaceC0428e j = this.f.j(this.f6808a);
                this.f6805X = j;
                this.f6812e.post(new A.h(this, j.d(), this.f6805X, 11));
                InterfaceC0428e interfaceC0428e = this.f6805X;
                interfaceC0428e.getClass();
                this.f6807Z = new m1.l(interfaceC0428e, 0L, -1L);
                C0430g c0430g = new C0430g(this.f6809b.f6909a, this.f6808a);
                this.f6806Y = c0430g;
                c0430g.g(this.f6811d);
            }
            while (!this.f6813e0) {
                if (this.f6814f0 != -9223372036854775807L) {
                    C0430g c0430g2 = this.f6806Y;
                    c0430g2.getClass();
                    c0430g2.a(this.f6815g0, this.f6814f0);
                    this.f6814f0 = -9223372036854775807L;
                }
                C0430g c0430g3 = this.f6806Y;
                c0430g3.getClass();
                m1.l lVar = this.f6807Z;
                lVar.getClass();
                if (c0430g3.i(lVar, new Object()) == -1) {
                    break;
                }
            }
            this.f6813e0 = false;
            InterfaceC0428e interfaceC0428e2 = this.f6805X;
            interfaceC0428e2.getClass();
            if (interfaceC0428e2.o()) {
                m5.d.a(this.f6805X);
                this.f6805X = null;
            }
        } catch (Throwable th) {
            InterfaceC0428e interfaceC0428e3 = this.f6805X;
            interfaceC0428e3.getClass();
            if (interfaceC0428e3.o()) {
                m5.d.a(this.f6805X);
                this.f6805X = null;
            }
            throw th;
        }
    }

    @Override // i1.k
    public final void k() {
        this.f6813e0 = true;
    }
}
