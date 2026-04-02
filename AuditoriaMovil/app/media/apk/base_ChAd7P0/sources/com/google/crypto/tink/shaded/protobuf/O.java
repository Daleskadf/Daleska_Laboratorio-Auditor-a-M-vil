package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class O {

    /* renamed from: b  reason: collision with root package name */
    public static final C0793u f9606b = new C0793u(1);

    /* renamed from: a  reason: collision with root package name */
    public final Object f9607a;

    public O(C0784k c0784k) {
        D.a(c0784k, "output");
        this.f9607a = c0784k;
        c0784k.f9674d = this;
    }

    public void a(int i7, boolean z7) {
        C0784k c0784k = (C0784k) this.f9607a;
        c0784k.e0(i7, 0);
        c0784k.X(z7 ? (byte) 1 : (byte) 0);
    }

    public void b(int i7, AbstractC0781h abstractC0781h) {
        C0784k c0784k = (C0784k) this.f9607a;
        c0784k.e0(i7, 2);
        c0784k.f0(abstractC0781h.size());
        C0780g c0780g = (C0780g) abstractC0781h;
        c0784k.Y(c0780g.f9647d, c0780g.l(), c0780g.size());
    }

    public void c(int i7, double d7) {
        C0784k c0784k = (C0784k) this.f9607a;
        c0784k.getClass();
        c0784k.b0(i7, Double.doubleToRawLongBits(d7));
    }

    public void d(int i7, int i8) {
        C0784k c0784k = (C0784k) this.f9607a;
        c0784k.e0(i7, 0);
        c0784k.d0(i8);
    }

    public void e(int i7, int i8) {
        ((C0784k) this.f9607a).Z(i7, i8);
    }

    public void f(int i7, long j) {
        ((C0784k) this.f9607a).b0(i7, j);
    }

    public void g(float f, int i7) {
        C0784k c0784k = (C0784k) this.f9607a;
        c0784k.getClass();
        c0784k.Z(i7, Float.floatToRawIntBits(f));
    }

    public void h(int i7, Object obj, g0 g0Var) {
        C0784k c0784k = (C0784k) this.f9607a;
        c0784k.e0(i7, 3);
        g0Var.h((AbstractC0774a) obj, c0784k.f9674d);
        c0784k.e0(i7, 4);
    }

    public void i(int i7, int i8) {
        C0784k c0784k = (C0784k) this.f9607a;
        c0784k.e0(i7, 0);
        c0784k.d0(i8);
    }

    public void j(int i7, long j) {
        ((C0784k) this.f9607a).g0(i7, j);
    }

    public void k(int i7, Object obj, g0 g0Var) {
        AbstractC0774a abstractC0774a = (AbstractC0774a) obj;
        C0784k c0784k = (C0784k) this.f9607a;
        c0784k.e0(i7, 2);
        c0784k.f0(abstractC0774a.b(g0Var));
        g0Var.h(abstractC0774a, c0784k.f9674d);
    }

    public void l(int i7, int i8) {
        ((C0784k) this.f9607a).Z(i7, i8);
    }

    public void m(int i7, long j) {
        ((C0784k) this.f9607a).b0(i7, j);
    }

    public void n(int i7, int i8) {
        C0784k c0784k = (C0784k) this.f9607a;
        c0784k.e0(i7, 0);
        c0784k.f0((i8 >> 31) ^ (i8 << 1));
    }

    public void o(int i7, long j) {
        ((C0784k) this.f9607a).g0(i7, (j >> 63) ^ (j << 1));
    }

    public void p(int i7, int i8) {
        C0784k c0784k = (C0784k) this.f9607a;
        c0784k.e0(i7, 0);
        c0784k.f0(i8);
    }

    public void q(int i7, long j) {
        ((C0784k) this.f9607a).g0(i7, j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.N, java.lang.Object] */
    public O() {
        T t7;
        try {
            t7 = (T) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            t7 = f9606b;
        }
        T[] tArr = {C0793u.f9696b, t7};
        ?? obj = new Object();
        obj.f9605a = tArr;
        Charset charset = D.f9598a;
        this.f9607a = obj;
    }
}
