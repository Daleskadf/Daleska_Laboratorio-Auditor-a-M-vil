package R0;

import H0.H;
import H0.InterfaceC0131k;
import H0.J;
import H0.r;
import K0.q;
import M0.x;
import android.os.Handler;
import e1.P;
import e1.T;
import m1.F;
import m1.G;
import v1.C1881a;
import x1.C1985a;
/* loaded from: classes.dex */
public final class o implements G {

    /* renamed from: a  reason: collision with root package name */
    public final T f4624a;

    /* renamed from: b  reason: collision with root package name */
    public final x f4625b = new x((char) 0, 5);

    /* renamed from: c  reason: collision with root package name */
    public final C1881a f4626c = new N0.f(1);

    /* renamed from: d  reason: collision with root package name */
    public long f4627d = -9223372036854775807L;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p f4628e;

    /* JADX WARN: Type inference failed for: r2v3, types: [v1.a, N0.f] */
    public o(p pVar, i1.e eVar) {
        this.f4628e = pVar;
        this.f4624a = new T(eVar, null, null);
    }

    @Override // m1.G
    public final void a(q qVar, int i7, int i8) {
        T t7 = this.f4624a;
        t7.getClass();
        t7.a(qVar, i7, 0);
    }

    @Override // m1.G
    public final int b(InterfaceC0131k interfaceC0131k, int i7, boolean z7) {
        return f(interfaceC0131k, i7, z7);
    }

    @Override // m1.G
    public final void c(r rVar) {
        this.f4624a.c(rVar);
    }

    @Override // m1.G
    public final void d(int i7, q qVar) {
        a(qVar, i7, 0);
    }

    @Override // m1.G
    public final void e(long j, int i7, int i8, int i9, F f) {
        long h8;
        long j8;
        this.f4624a.e(j, i7, i8, i9, f);
        while (this.f4624a.w(false)) {
            C1881a c1881a = this.f4626c;
            c1881a.e();
            if (this.f4624a.B(this.f4625b, c1881a, 0, false) == -4) {
                c1881a.i();
            } else {
                c1881a = null;
            }
            if (c1881a != null) {
                long j9 = c1881a.f3345X;
                H l8 = this.f4628e.f4634c.l(c1881a);
                if (l8 != null) {
                    C1985a c1985a = (C1985a) l8.f1692a[0];
                    String str = c1985a.f16492a;
                    String str2 = c1985a.f16493b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j8 = K0.x.P(K0.x.p(c1985a.f16496e));
                        } catch (J unused) {
                            j8 = -9223372036854775807L;
                        }
                        if (j8 != -9223372036854775807L) {
                            n nVar = new n(j9, j8);
                            Handler handler = this.f4628e.f4635d;
                            handler.sendMessage(handler.obtainMessage(1, nVar));
                        }
                    }
                }
            }
        }
        T t7 = this.f4624a;
        P p7 = t7.f10730a;
        synchronized (t7) {
            int i10 = t7.f10746s;
            if (i10 == 0) {
                h8 = -1;
            } else {
                h8 = t7.h(i10);
            }
        }
        p7.b(h8);
    }

    @Override // m1.G
    public final int f(InterfaceC0131k interfaceC0131k, int i7, boolean z7) {
        T t7 = this.f4624a;
        t7.getClass();
        return t7.f(interfaceC0131k, i7, z7);
    }
}
