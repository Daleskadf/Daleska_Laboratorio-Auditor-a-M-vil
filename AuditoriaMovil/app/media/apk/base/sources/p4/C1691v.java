package p4;

import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.C0850l;
import e0.C0927b;
import java.util.HashMap;
import l4.C1422f;
import p.C1608t;
/* renamed from: p4.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1691v extends H4.W {

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f15298g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f15299h;

    /* renamed from: i  reason: collision with root package name */
    public final C0927b f15300i;
    public final C1692w j;

    /* renamed from: k  reason: collision with root package name */
    public final M3.n f15301k;

    /* renamed from: l  reason: collision with root package name */
    public final C1608t f15302l;

    /* renamed from: m  reason: collision with root package name */
    public B f15303m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f15304n;

    public C1691v() {
        C0850l c0850l = AbstractC0852m.f10085b;
        this.f15298g = new HashMap();
        this.f15300i = new C0927b(14);
        this.j = new C1692w(this);
        this.f15301k = new M3.n(2);
        C1608t c1608t = new C1608t(2, false);
        c1608t.f14880b = q4.g.f15354a;
        this.f15302l = c1608t;
        this.f15299h = new HashMap();
    }

    @Override // H4.W
    public final Object F(String str, u4.r rVar) {
        this.f15303m.y();
        try {
            return rVar.get();
        } finally {
            this.f15303m.w();
        }
    }

    @Override // H4.W
    public final void G(String str, Runnable runnable) {
        this.f15303m.y();
        try {
            runnable.run();
        } finally {
            this.f15303m.w();
        }
    }

    @Override // H4.W
    public final void J() {
        m5.d.i("MemoryPersistence shutdown without start", this.f15304n, new Object[0]);
        this.f15304n = false;
    }

    @Override // H4.W
    public final void K() {
        m5.d.i("MemoryPersistence double-started!", !this.f15304n, new Object[0]);
        this.f15304n = true;
    }

    @Override // H4.W
    public final InterfaceC1671a l() {
        return this.f15301k;
    }

    @Override // H4.W
    public final InterfaceC1672b p(C1422f c1422f) {
        HashMap hashMap = this.f15299h;
        C1689t c1689t = (C1689t) hashMap.get(c1422f);
        if (c1689t == null) {
            C1689t c1689t2 = new C1689t();
            hashMap.put(c1422f, c1689t2);
            return c1689t2;
        }
        return c1689t;
    }

    @Override // H4.W
    public final InterfaceC1677g q(C1422f c1422f) {
        return this.f15300i;
    }

    @Override // H4.W
    public final InterfaceC1693x r(C1422f c1422f, InterfaceC1677g interfaceC1677g) {
        HashMap hashMap = this.f15298g;
        C1690u c1690u = (C1690u) hashMap.get(c1422f);
        if (c1690u == null) {
            C1690u c1690u2 = new C1690u(this);
            hashMap.put(c1422f, c1690u2);
            return c1690u2;
        }
        return c1690u;
    }

    @Override // H4.W
    public final InterfaceC1694y s() {
        return new t2.i(21);
    }

    @Override // H4.W
    public final B t() {
        return this.f15303m;
    }

    @Override // H4.W
    public final C u() {
        return this.f15302l;
    }

    @Override // H4.W
    public final X w() {
        return this.j;
    }

    @Override // H4.W
    public final boolean y() {
        return this.f15304n;
    }
}
