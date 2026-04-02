package c6;

import a6.AbstractC0482k;
import a6.C0483l;
import a6.InterfaceC0484m;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
/* renamed from: c6.l1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0684l1 implements Closeable {

    /* renamed from: X  reason: collision with root package name */
    public int f8887X;

    /* renamed from: Y  reason: collision with root package name */
    public EnumC0681k1 f8888Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f8889Z;

    /* renamed from: a  reason: collision with root package name */
    public AbstractC0652b f8890a;

    /* renamed from: b  reason: collision with root package name */
    public int f8891b;

    /* renamed from: c  reason: collision with root package name */
    public final o2 f8892c;

    /* renamed from: d  reason: collision with root package name */
    public final s2 f8893d;

    /* renamed from: e  reason: collision with root package name */
    public InterfaceC0484m f8894e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f8895e0;
    public byte[] f;

    /* renamed from: f0  reason: collision with root package name */
    public C0641B f8896f0;

    /* renamed from: g0  reason: collision with root package name */
    public C0641B f8897g0;

    /* renamed from: h0  reason: collision with root package name */
    public long f8898h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f8899i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f8900j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f8901k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f8902l0;

    /* renamed from: m0  reason: collision with root package name */
    public volatile boolean f8903m0;

    public C0684l1(AbstractC0652b abstractC0652b, int i7, o2 o2Var, s2 s2Var) {
        C0483l c0483l = C0483l.f7167b;
        this.f8888Y = EnumC0681k1.HEADER;
        this.f8889Z = 5;
        this.f8897g0 = new C0641B();
        this.f8899i0 = false;
        this.f8900j0 = -1;
        this.f8902l0 = false;
        this.f8903m0 = false;
        this.f8890a = abstractC0652b;
        this.f8894e = c0483l;
        this.f8891b = i7;
        this.f8892c = o2Var;
        G.i.j(s2Var, "transportTracer");
        this.f8893d = s2Var;
    }

    public final void a() {
        if (this.f8899i0) {
            return;
        }
        boolean z7 = true;
        this.f8899i0 = true;
        while (!this.f8903m0 && this.f8898h0 > 0 && g()) {
            try {
                int i7 = AbstractC0675i1.f8855a[this.f8888Y.ordinal()];
                if (i7 != 1) {
                    if (i7 == 2) {
                        c();
                        this.f8898h0--;
                    } else {
                        throw new AssertionError("Invalid state: " + this.f8888Y);
                    }
                } else {
                    d();
                }
            } catch (Throwable th) {
                this.f8899i0 = false;
                throw th;
            }
        }
        if (this.f8903m0) {
            close();
            this.f8899i0 = false;
            return;
        }
        if (this.f8902l0) {
            if (this.f8897g0.f8427c != 0) {
                z7 = false;
            }
            if (z7) {
                close();
            }
        }
        this.f8899i0 = false;
    }

    public final boolean b() {
        if (this.f8897g0 == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [c6.F1, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, a1.A] */
    /* JADX WARN: Type inference failed for: r4v3, types: [c6.F1, java.io.InputStream] */
    public final void c() {
        C0678j1 c0678j1;
        int i7 = this.f8900j0;
        long j = this.f8901k0;
        o2 o2Var = this.f8892c;
        for (AbstractC0482k abstractC0482k : o2Var.f8947a) {
            abstractC0482k.d(i7, j);
        }
        this.f8901k0 = 0;
        if (this.f8895e0) {
            InterfaceC0484m interfaceC0484m = this.f8894e;
            if (interfaceC0484m != C0483l.f7167b) {
                try {
                    C0641B c0641b = this.f8896f0;
                    G1 g12 = H1.f8472a;
                    ?? inputStream = new InputStream();
                    G.i.j(c0641b, "buffer");
                    inputStream.f8451a = c0641b;
                    c0678j1 = new C0678j1(interfaceC0484m.b(inputStream), this.f8891b, o2Var);
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            } else {
                throw new a6.q0(a6.o0.f7179m.g("Can't decode compressed gRPC message as compression not configured"));
            }
        } else {
            long j8 = this.f8896f0.f8427c;
            for (AbstractC0482k abstractC0482k2 : o2Var.f8947a) {
                abstractC0482k2.f(j8);
            }
            C0641B c0641b2 = this.f8896f0;
            G1 g13 = H1.f8472a;
            ?? inputStream2 = new InputStream();
            G.i.j(c0641b2, "buffer");
            inputStream2.f8451a = c0641b2;
            c0678j1 = inputStream2;
        }
        this.f8896f0.getClass();
        this.f8896f0 = null;
        AbstractC0652b abstractC0652b = this.f8890a;
        ?? obj = new Object();
        obj.f6744a = c0678j1;
        abstractC0652b.j.X(obj);
        this.f8888Y = EnumC0681k1.HEADER;
        this.f8889Z = 5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (b()) {
            return;
        }
        C0641B c0641b = this.f8896f0;
        boolean z7 = false;
        if (c0641b != null && c0641b.f8427c > 0) {
            z7 = true;
        }
        try {
            C0641B c0641b2 = this.f8897g0;
            if (c0641b2 != null) {
                c0641b2.close();
            }
            C0641B c0641b3 = this.f8896f0;
            if (c0641b3 != null) {
                c0641b3.close();
            }
            this.f8897g0 = null;
            this.f8896f0 = null;
            this.f8890a.c(z7);
        } catch (Throwable th) {
            this.f8897g0 = null;
            this.f8896f0 = null;
            throw th;
        }
    }

    public final void d() {
        boolean z7;
        int n7 = this.f8896f0.n();
        if ((n7 & 254) == 0) {
            if ((n7 & 1) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.f8895e0 = z7;
            C0641B c0641b = this.f8896f0;
            c0641b.a(4);
            int n8 = c0641b.n() | (c0641b.n() << 24) | (c0641b.n() << 16) | (c0641b.n() << 8);
            this.f8889Z = n8;
            if (n8 >= 0 && n8 <= this.f8891b) {
                int i7 = this.f8900j0 + 1;
                this.f8900j0 = i7;
                for (AbstractC0482k abstractC0482k : this.f8892c.f8947a) {
                    abstractC0482k.c(i7);
                }
                s2 s2Var = this.f8893d;
                ((I0) s2Var.f8985c).f();
                ((q2) s2Var.f8984b).c();
                this.f8888Y = EnumC0681k1.BODY;
                return;
            }
            a6.o0 o0Var = a6.o0.f7177k;
            Locale locale = Locale.US;
            throw new a6.q0(o0Var.g("gRPC message exceeds maximum size " + this.f8891b + ": " + n8));
        }
        throw new a6.q0(a6.o0.f7179m.g("gRPC frame header malformed: reserved bits not zero"));
    }

    public final boolean g() {
        o2 o2Var = this.f8892c;
        int i7 = 0;
        try {
            if (this.f8896f0 == null) {
                this.f8896f0 = new C0641B();
            }
            int i8 = 0;
            while (true) {
                try {
                    int i9 = this.f8889Z - this.f8896f0.f8427c;
                    if (i9 > 0) {
                        int i10 = this.f8897g0.f8427c;
                        if (i10 == 0) {
                            if (i8 > 0) {
                                this.f8890a.a(i8);
                                if (this.f8888Y == EnumC0681k1.BODY) {
                                    o2Var.a(i8);
                                    this.f8901k0 += i8;
                                }
                            }
                            return false;
                        }
                        int min = Math.min(i9, i10);
                        i8 += min;
                        this.f8896f0.r(this.f8897g0.d(min));
                    } else if (i8 > 0) {
                        this.f8890a.a(i8);
                        if (this.f8888Y == EnumC0681k1.BODY) {
                            o2Var.a(i8);
                            this.f8901k0 += i8;
                            return true;
                        }
                        return true;
                    } else {
                        return true;
                    }
                } catch (Throwable th) {
                    int i11 = i8;
                    th = th;
                    i7 = i11;
                    if (i7 > 0) {
                        this.f8890a.a(i7);
                        if (this.f8888Y == EnumC0681k1.BODY) {
                            o2Var.a(i7);
                            this.f8901k0 += i7;
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
