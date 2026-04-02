package f1;

import M0.x;
import e1.T;
import e1.U;
/* renamed from: f1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0985g implements U {

    /* renamed from: a  reason: collision with root package name */
    public final C0986h f11008a;

    /* renamed from: b  reason: collision with root package name */
    public final T f11009b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11010c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11011d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0986h f11012e;

    public C0985g(C0986h c0986h, C0986h c0986h2, T t7, int i7) {
        this.f11012e = c0986h;
        this.f11008a = c0986h2;
        this.f11009b = t7;
        this.f11010c = i7;
    }

    @Override // e1.U
    public final boolean b() {
        C0986h c0986h = this.f11012e;
        if (!c0986h.w() && this.f11009b.w(c0986h.f11033r0)) {
            return true;
        }
        return false;
    }

    public final void c() {
        if (!this.f11011d) {
            C0986h c0986h = this.f11012e;
            T0.d dVar = c0986h.f11013X;
            int[] iArr = c0986h.f11017b;
            int i7 = this.f11010c;
            dVar.a(iArr[i7], c0986h.f11018c[i7], 0, null, c0986h.f11031o0);
            this.f11011d = true;
        }
    }

    public final void d() {
        C0986h c0986h = this.f11012e;
        boolean[] zArr = c0986h.f11019d;
        int i7 = this.f11010c;
        K0.a.j(zArr[i7]);
        c0986h.f11019d[i7] = false;
    }

    @Override // e1.U
    public final int g(x xVar, N0.f fVar, int i7) {
        C0986h c0986h = this.f11012e;
        if (c0986h.w()) {
            return -3;
        }
        AbstractC0979a abstractC0979a = c0986h.q0;
        T t7 = this.f11009b;
        if (abstractC0979a != null && abstractC0979a.d(this.f11010c + 1) <= t7.r()) {
            return -3;
        }
        c();
        return t7.B(xVar, fVar, i7, c0986h.f11033r0);
    }

    @Override // e1.U
    public final int h(long j) {
        C0986h c0986h = this.f11012e;
        if (c0986h.w()) {
            return 0;
        }
        boolean z7 = c0986h.f11033r0;
        T t7 = this.f11009b;
        int t8 = t7.t(j, z7);
        AbstractC0979a abstractC0979a = c0986h.q0;
        if (abstractC0979a != null) {
            t8 = Math.min(t8, abstractC0979a.d(this.f11010c + 1) - t7.r());
        }
        t7.H(t8);
        if (t8 > 0) {
            c();
        }
        return t8;
    }

    @Override // e1.U
    public final void a() {
    }
}
