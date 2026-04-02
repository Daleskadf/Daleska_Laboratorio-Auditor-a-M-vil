package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class I {

    /* renamed from: b  reason: collision with root package name */
    public static final C0543u f7754b = new C0543u(1);

    /* renamed from: a  reason: collision with root package name */
    public final Object f7755a;

    public I(C0534k c0534k) {
        A.a(c0534k, "output");
        this.f7755a = c0534k;
        c0534k.f7842b = this;
    }

    public void a(int i7, boolean z7) {
        ((C0534k) this.f7755a).p0(i7, z7);
    }

    public void b(int i7, C0530g c0530g) {
        ((C0534k) this.f7755a).q0(i7, c0530g);
    }

    public void c(int i7, double d7) {
        C0534k c0534k = (C0534k) this.f7755a;
        c0534k.getClass();
        c0534k.u0(i7, Double.doubleToRawLongBits(d7));
    }

    public void d(int i7, int i8) {
        ((C0534k) this.f7755a).w0(i7, i8);
    }

    public void e(int i7, int i8) {
        ((C0534k) this.f7755a).s0(i7, i8);
    }

    public void f(int i7, long j) {
        ((C0534k) this.f7755a).u0(i7, j);
    }

    public void g(float f, int i7) {
        C0534k c0534k = (C0534k) this.f7755a;
        c0534k.getClass();
        c0534k.s0(i7, Float.floatToRawIntBits(f));
    }

    public void h(int i7, Object obj, b0 b0Var) {
        C0534k c0534k = (C0534k) this.f7755a;
        c0534k.A0(i7, 3);
        b0Var.d((AbstractC0524a) obj, c0534k.f7842b);
        c0534k.A0(i7, 4);
    }

    public void i(int i7, int i8) {
        ((C0534k) this.f7755a).w0(i7, i8);
    }

    public void j(int i7, long j) {
        ((C0534k) this.f7755a).D0(i7, j);
    }

    public void k(int i7, Object obj, b0 b0Var) {
        C0534k c0534k = (C0534k) this.f7755a;
        AbstractC0524a abstractC0524a = (AbstractC0524a) obj;
        c0534k.A0(i7, 2);
        c0534k.C0(abstractC0524a.a(b0Var));
        b0Var.d(abstractC0524a, c0534k.f7842b);
    }

    public void l(int i7, int i8) {
        ((C0534k) this.f7755a).s0(i7, i8);
    }

    public void m(int i7, long j) {
        ((C0534k) this.f7755a).u0(i7, j);
    }

    public void n(int i7, int i8) {
        ((C0534k) this.f7755a).B0(i7, (i8 >> 31) ^ (i8 << 1));
    }

    public void o(int i7, long j) {
        ((C0534k) this.f7755a).D0(i7, (j >> 63) ^ (j << 1));
    }

    public void p(int i7, int i8) {
        ((C0534k) this.f7755a).B0(i7, i8);
    }

    public void q(int i7, long j) {
        ((C0534k) this.f7755a).D0(i7, j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.datastore.preferences.protobuf.H] */
    public I() {
        X x7 = X.f7783c;
        Object obj = f7754b;
        try {
            obj = (O) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        O[] oArr = {C0543u.f7868b, obj};
        ?? obj2 = new Object();
        obj2.f7753a = oArr;
        Charset charset = A.f7747a;
        this.f7755a = obj2;
    }
}
