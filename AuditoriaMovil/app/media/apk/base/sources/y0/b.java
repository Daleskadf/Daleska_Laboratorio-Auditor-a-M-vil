package Y0;

import A.j;
import D.AbstractC0059i;
import H0.F;
import H0.G;
import H0.H;
import H0.r;
import K0.k;
import M0.x;
import N0.f;
import O0.AbstractC0243e;
import O0.E;
import a.AbstractC0412a;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import v1.C1881a;
/* loaded from: classes.dex */
public final class b extends AbstractC0243e implements Handler.Callback {

    /* renamed from: m0  reason: collision with root package name */
    public final a f6586m0;

    /* renamed from: n0  reason: collision with root package name */
    public final E f6587n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Handler f6588o0;

    /* renamed from: p0  reason: collision with root package name */
    public final C1881a f6589p0;
    public AbstractC0412a q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f6590r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f6591s0;

    /* renamed from: t0  reason: collision with root package name */
    public long f6592t0;

    /* renamed from: u0  reason: collision with root package name */
    public H f6593u0;

    /* renamed from: v0  reason: collision with root package name */
    public long f6594v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v3, types: [v1.a, N0.f] */
    public b(E e7, Looper looper) {
        super(5);
        Handler handler;
        a aVar = a.f6585a;
        this.f6587n0 = e7;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.f6588o0 = handler;
        this.f6586m0 = aVar;
        this.f6589p0 = new f(1);
        this.f6594v0 = -9223372036854775807L;
    }

    public final void B(H h8, ArrayList arrayList) {
        int i7 = 0;
        while (true) {
            G[] gArr = h8.f1692a;
            if (i7 < gArr.length) {
                r b5 = gArr[i7].b();
                if (b5 != null) {
                    a aVar = this.f6586m0;
                    if (aVar.b(b5)) {
                        AbstractC0412a a7 = aVar.a(b5);
                        byte[] h9 = gArr[i7].h();
                        h9.getClass();
                        C1881a c1881a = this.f6589p0;
                        c1881a.e();
                        c1881a.h(h9.length);
                        c1881a.f3350e.put(h9);
                        c1881a.i();
                        H l8 = a7.l(c1881a);
                        if (l8 != null) {
                            B(l8, arrayList);
                        }
                        i7++;
                    }
                }
                arrayList.add(gArr[i7]);
                i7++;
            } else {
                return;
            }
        }
    }

    public final long C(long j) {
        boolean z7;
        boolean z8 = false;
        if (j != -9223372036854775807L) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        if (this.f6594v0 != -9223372036854775807L) {
            z8 = true;
        }
        K0.a.j(z8);
        return j - this.f6594v0;
    }

    public final void D(H h8) {
        E e7 = this.f6587n0;
        O0.H h9 = e7.f3482a;
        H0.E a7 = h9.f3511X0.a();
        int i7 = 0;
        while (true) {
            G[] gArr = h8.f1692a;
            if (i7 >= gArr.length) {
                break;
            }
            gArr[i7].c(a7);
            i7++;
        }
        h9.f3511X0 = new F(a7);
        F x7 = h9.x();
        boolean equals = x7.equals(h9.f3492F0);
        k kVar = h9.f3523g0;
        if (!equals) {
            h9.f3492F0 = x7;
            kVar.c(14, new j(e7, 17));
        }
        kVar.c(28, new j(h8, 18));
        kVar.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            D((H) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // O0.AbstractC0243e
    public final String i() {
        return "MetadataRenderer";
    }

    @Override // O0.AbstractC0243e
    public final boolean k() {
        return this.f6591s0;
    }

    @Override // O0.AbstractC0243e
    public final boolean l() {
        return true;
    }

    @Override // O0.AbstractC0243e
    public final void m() {
        this.f6593u0 = null;
        this.q0 = null;
        this.f6594v0 = -9223372036854775807L;
    }

    @Override // O0.AbstractC0243e
    public final void o(long j, boolean z7) {
        this.f6593u0 = null;
        this.f6590r0 = false;
        this.f6591s0 = false;
    }

    @Override // O0.AbstractC0243e
    public final void t(r[] rVarArr, long j, long j8) {
        this.q0 = this.f6586m0.a(rVarArr[0]);
        H h8 = this.f6593u0;
        if (h8 != null) {
            long j9 = this.f6594v0;
            long j10 = h8.f1693b;
            long j11 = (j9 + j10) - j8;
            if (j10 != j11) {
                h8 = new H(j11, h8.f1692a);
            }
            this.f6593u0 = h8;
        }
        this.f6594v0 = j8;
    }

    @Override // O0.AbstractC0243e
    public final void v(long j, long j8) {
        boolean z7 = true;
        while (z7) {
            if (!this.f6590r0 && this.f6593u0 == null) {
                C1881a c1881a = this.f6589p0;
                c1881a.e();
                x xVar = this.f3701c;
                xVar.t();
                int u7 = u(xVar, c1881a, 0);
                if (u7 == -4) {
                    if (c1881a.c(4)) {
                        this.f6590r0 = true;
                    } else if (c1881a.f3345X >= this.f3706g0) {
                        c1881a.f16031e0 = this.f6592t0;
                        c1881a.i();
                        AbstractC0412a abstractC0412a = this.q0;
                        int i7 = K0.x.f2529a;
                        H l8 = abstractC0412a.l(c1881a);
                        if (l8 != null) {
                            ArrayList arrayList = new ArrayList(l8.f1692a.length);
                            B(l8, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f6593u0 = new H(C(c1881a.f3345X), (G[]) arrayList.toArray(new G[0]));
                            }
                        }
                    }
                } else if (u7 == -5) {
                    r rVar = (r) xVar.f3211c;
                    rVar.getClass();
                    this.f6592t0 = rVar.f1891r;
                }
            }
            H h8 = this.f6593u0;
            if (h8 != null && h8.f1693b <= C(j)) {
                H h9 = this.f6593u0;
                Handler handler = this.f6588o0;
                if (handler != null) {
                    handler.obtainMessage(1, h9).sendToTarget();
                } else {
                    D(h9);
                }
                this.f6593u0 = null;
                z7 = true;
            } else {
                z7 = false;
            }
            if (this.f6590r0 && this.f6593u0 == null) {
                this.f6591s0 = true;
            }
        }
    }

    @Override // O0.AbstractC0243e
    public final int z(r rVar) {
        int i7;
        if (this.f6586m0.b(rVar)) {
            if (rVar.f1874J == 0) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            return AbstractC0059i.s(i7, 0, 0, 0);
        }
        return AbstractC0059i.s(0, 0, 0, 0);
    }
}
