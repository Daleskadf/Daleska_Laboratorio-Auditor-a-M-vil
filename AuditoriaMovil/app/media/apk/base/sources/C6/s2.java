package c6;

import D.AbstractC0055e;
import D.C0054d;
import a1.C0415A;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class s2 implements InterfaceC0717x {

    /* renamed from: d  reason: collision with root package name */
    public static final q2 f8982d = new q2(16);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8983a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8984b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8985c;

    public /* synthetic */ s2(int i7, Object obj, Object obj2) {
        this.f8983a = i7;
        this.f8985c = obj;
        this.f8984b = obj2;
    }

    @Override // c6.InterfaceC0717x
    public void O(a6.o0 o0Var, EnumC0714w enumC0714w, a6.e0 e0Var) {
        boolean z7;
        boolean z8;
        T1 t1;
        N0 n02;
        C0054d c0054d;
        boolean z9;
        switch (this.f8983a) {
            case 2:
                E.e eVar = ((C0706t0) this.f8985c).f8990b.f9010b;
                if (o0Var.e()) {
                    ((I0) eVar.f922d).f();
                } else {
                    ((I0) eVar.f923e).f();
                }
                ((InterfaceC0717x) this.f8984b).O(o0Var, enumC0714w, e0Var);
                return;
            default:
                synchronized (((N0) this.f8985c).f8529i) {
                    N0 n03 = (N0) this.f8985c;
                    n03.f8534o = n03.f8534o.d((Y1) this.f8984b);
                    ((N0) this.f8985c).f8533n.f8937b.add(String.valueOf(o0Var.f7183a));
                }
                if (((N0) this.f8985c).f8537r.decrementAndGet() == Integer.MIN_VALUE) {
                    ((N0) this.f8985c).f8524c.execute(new X1(this, 0));
                    return;
                }
                Y1 y12 = (Y1) this.f8984b;
                if (y12.f8659c) {
                    N0 n04 = (N0) this.f8985c;
                    L1 o7 = n04.o(y12);
                    if (o7 != null) {
                        n04.f8523b.execute(o7);
                    }
                    if (((N0) this.f8985c).f8534o.f == ((Y1) this.f8984b)) {
                        ((N0) this.f8985c).v(o0Var, enumC0714w, e0Var);
                        return;
                    }
                    return;
                }
                EnumC0714w enumC0714w2 = EnumC0714w.MISCARRIED;
                if (enumC0714w == enumC0714w2 && ((N0) this.f8985c).f8536q.incrementAndGet() > 1000) {
                    N0 n05 = (N0) this.f8985c;
                    L1 o8 = n05.o((Y1) this.f8984b);
                    if (o8 != null) {
                        n05.f8523b.execute(o8);
                    }
                    if (((N0) this.f8985c).f8534o.f == ((Y1) this.f8984b)) {
                        ((N0) this.f8985c).v(a6.o0.f7179m.g("Too many transparent retries. Might be a bug in gRPC").f(new a6.q0(o0Var)), enumC0714w, e0Var);
                        return;
                    }
                    return;
                }
                if (((N0) this.f8985c).f8534o.f == null) {
                    boolean z10 = true;
                    if (enumC0714w != enumC0714w2 && (enumC0714w != EnumC0714w.REFUSED || !((N0) this.f8985c).f8535p.compareAndSet(false, true))) {
                        if (enumC0714w == EnumC0714w.DROPPED) {
                            N0 n06 = (N0) this.f8985c;
                            if (n06.f8528h) {
                                n06.s();
                            }
                        } else {
                            ((N0) this.f8985c).f8535p.set(true);
                            N0 n07 = (N0) this.f8985c;
                            Integer num = null;
                            if (n07.f8528h) {
                                String str = (String) e0Var.c(N0.f8515F);
                                if (str != null) {
                                    try {
                                        num = Integer.valueOf(str);
                                    } catch (NumberFormatException unused) {
                                        num = -1;
                                    }
                                }
                                N0 n08 = (N0) this.f8985c;
                                boolean contains = n08.f8527g.f8878c.contains(o0Var.f7183a);
                                if (n08.f8532m != null && (contains || (num != null && num.intValue() < 0))) {
                                    z9 = !n08.f8532m.a();
                                } else {
                                    z9 = false;
                                }
                                if (contains && !z9 && !o0Var.e() && num != null && num.intValue() > 0) {
                                    num = 0;
                                }
                                if (!contains || z9) {
                                    z10 = false;
                                }
                                if (z10) {
                                    N0.n((N0) this.f8985c, num);
                                }
                                synchronized (((N0) this.f8985c).f8529i) {
                                    try {
                                        N0 n09 = (N0) this.f8985c;
                                        n09.f8534o = n09.f8534o.b((Y1) this.f8984b);
                                        if (z10) {
                                            N0 n010 = (N0) this.f8985c;
                                            if (!n010.t(n010.f8534o)) {
                                                if (!((N0) this.f8985c).f8534o.f8611d.isEmpty()) {
                                                }
                                            }
                                            return;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                a2 a2Var = n07.f;
                                long j = 0;
                                if (a2Var == null) {
                                    t1 = new T1(0L, false);
                                } else {
                                    boolean contains2 = a2Var.f.contains(o0Var.f7183a);
                                    String str2 = (String) e0Var.c(N0.f8515F);
                                    if (str2 != null) {
                                        try {
                                            num = Integer.valueOf(str2);
                                        } catch (NumberFormatException unused2) {
                                            num = -1;
                                        }
                                    }
                                    if (n07.f8532m != null && (contains2 || (num != null && num.intValue() < 0))) {
                                        z7 = !n07.f8532m.a();
                                    } else {
                                        z7 = false;
                                    }
                                    if (n07.f.f8766a > ((Y1) this.f8984b).f8660d + 1 && !z7) {
                                        if (num == null) {
                                            if (contains2) {
                                                j = (long) (N0.f8517H.nextDouble() * n07.f8543x);
                                                a2 a2Var2 = n07.f;
                                                n07.f8543x = Math.min((long) (n07.f8543x * a2Var2.f8769d), a2Var2.f8768c);
                                                z8 = true;
                                            }
                                        } else if (num.intValue() >= 0) {
                                            j = TimeUnit.MILLISECONDS.toNanos(num.intValue());
                                            n07.f8543x = n07.f.f8767b;
                                            z8 = true;
                                        }
                                        t1 = new T1(j, z8);
                                    }
                                    z8 = false;
                                    t1 = new T1(j, z8);
                                }
                                if (t1.f8587b) {
                                    Y1 p7 = ((N0) this.f8985c).p(((Y1) this.f8984b).f8660d + 1, false);
                                    if (p7 != null) {
                                        synchronized (((N0) this.f8985c).f8529i) {
                                            n02 = (N0) this.f8985c;
                                            c0054d = new C0054d(n02.f8529i);
                                            n02.f8541v = c0054d;
                                        }
                                        c0054d.q(n02.f8525d.schedule(new W1(this, p7, 0), t1.f8588c, TimeUnit.NANOSECONDS));
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    } else {
                        Y1 p8 = ((N0) this.f8985c).p(((Y1) this.f8984b).f8660d, true);
                        if (p8 != null) {
                            N0 n011 = (N0) this.f8985c;
                            if (n011.f8528h) {
                                synchronized (n011.f8529i) {
                                    N0 n012 = (N0) this.f8985c;
                                    n012.f8534o = n012.f8534o.c((Y1) this.f8984b, p8);
                                }
                            }
                            ((N0) this.f8985c).f8523b.execute(new W1(this, p8, 1));
                            return;
                        }
                        return;
                    }
                }
                N0 n013 = (N0) this.f8985c;
                L1 o9 = n013.o((Y1) this.f8984b);
                if (o9 != null) {
                    n013.f8523b.execute(o9);
                }
                if (((N0) this.f8985c).f8534o.f == ((Y1) this.f8984b)) {
                    ((N0) this.f8985c).v(o0Var, enumC0714w, e0Var);
                    return;
                }
                return;
        }
    }

    @Override // c6.InterfaceC0717x
    public void Q(a6.e0 e0Var) {
        AtomicInteger atomicInteger;
        int i7;
        int i8;
        switch (this.f8983a) {
            case 2:
                ((InterfaceC0717x) this.f8984b).Q(e0Var);
                return;
            default:
                if (((Y1) this.f8984b).f8660d > 0) {
                    a6.Z z7 = N0.f8514E;
                    e0Var.a(z7);
                    e0Var.f(z7, String.valueOf(((Y1) this.f8984b).f8660d));
                }
                N0 n02 = (N0) this.f8985c;
                a6.Z z8 = N0.f8514E;
                L1 o7 = n02.o((Y1) this.f8984b);
                if (o7 != null) {
                    n02.f8523b.execute(o7);
                }
                if (((N0) this.f8985c).f8534o.f == ((Y1) this.f8984b)) {
                    Z1 z12 = ((N0) this.f8985c).f8532m;
                    if (z12 != null) {
                        do {
                            atomicInteger = z12.f8728d;
                            i7 = atomicInteger.get();
                            i8 = z12.f8725a;
                            if (i7 == i8) {
                            }
                        } while (!atomicInteger.compareAndSet(i7, Math.min(z12.f8727c + i7, i8)));
                    }
                    ((N0) this.f8985c).f8524c.execute(new RunnableC0646G(22, this, e0Var));
                    return;
                }
                return;
        }
    }

    @Override // c6.InterfaceC0717x
    public void X(C0415A c0415a) {
        boolean z7;
        switch (this.f8983a) {
            case 2:
                ((InterfaceC0717x) this.f8984b).X(c0415a);
                return;
            default:
                V1 v12 = ((N0) this.f8985c).f8534o;
                if (v12.f != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                G.i.o("Headers should be received prior to messages.", z7);
                if (v12.f != ((Y1) this.f8984b)) {
                    Logger logger = AbstractC0671h0.f8829a;
                    while (true) {
                        InputStream k2 = c0415a.k();
                        if (k2 != null) {
                            AbstractC0671h0.b(k2);
                        } else {
                            return;
                        }
                    }
                } else {
                    ((N0) this.f8985c).f8524c.execute(new RunnableC0646G(23, this, c0415a));
                    return;
                }
        }
    }

    @Override // c6.InterfaceC0717x
    public void n() {
        switch (this.f8983a) {
            case 2:
                ((InterfaceC0717x) this.f8984b).n();
                return;
            default:
                N0 n02 = (N0) this.f8985c;
                if (n02.b()) {
                    n02.f8524c.execute(new X1(this, 1));
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.f8983a) {
            case 2:
                K5.d C7 = AbstractC0055e.C(this);
                C7.a((InterfaceC0717x) this.f8984b, "delegate");
                return C7.toString();
            default:
                return super.toString();
        }
    }

    public s2() {
        this.f8983a = 0;
        q2 q2Var = q2.f8962b;
        this.f8985c = k2.n();
        this.f8984b = q2Var;
    }

    public s2(String str) {
        this.f8983a = 1;
        a6.T b5 = a6.T.b();
        G.i.j(b5, "registry");
        this.f8984b = b5;
        G.i.j(str, "defaultPolicy");
        this.f8985c = str;
    }
}
