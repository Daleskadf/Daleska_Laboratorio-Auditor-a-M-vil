package c6;

import D.AbstractC0055e;
import D.AbstractC0059i;
import a6.AbstractC0479h;
import a6.C0476e;
import a6.C0483l;
import a6.C0485n;
import a6.C0490t;
import a6.C0492v;
import a6.EnumC0477f;
import a6.EnumC0486o;
import b3.C0585f;
import d6.AbstractC0910g;
import d6.C0912i;
import d6.C0913j;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class Z0 extends a6.U implements a6.G {

    /* renamed from: g0  reason: collision with root package name */
    public static final Logger f8665g0 = Logger.getLogger(Z0.class.getName());

    /* renamed from: h0  reason: collision with root package name */
    public static final Pattern f8666h0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: i0  reason: collision with root package name */
    public static final a6.o0 f8667i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final a6.o0 f8668j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final a6.o0 f8669k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final C0666f1 f8670l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final J0 f8671m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final C0648I f8672n0;

    /* renamed from: A  reason: collision with root package name */
    public Q0 f8673A;

    /* renamed from: B  reason: collision with root package name */
    public volatile a6.O f8674B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f8675C;

    /* renamed from: D  reason: collision with root package name */
    public final HashSet f8676D;

    /* renamed from: E  reason: collision with root package name */
    public LinkedHashSet f8677E;

    /* renamed from: F  reason: collision with root package name */
    public final Object f8678F;

    /* renamed from: G  reason: collision with root package name */
    public final HashSet f8679G;

    /* renamed from: H  reason: collision with root package name */
    public final N f8680H;

    /* renamed from: I  reason: collision with root package name */
    public final E.e f8681I;

    /* renamed from: J  reason: collision with root package name */
    public final AtomicBoolean f8682J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f8683K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f8684L;

    /* renamed from: M  reason: collision with root package name */
    public volatile boolean f8685M;

    /* renamed from: N  reason: collision with root package name */
    public final CountDownLatch f8686N;

    /* renamed from: O  reason: collision with root package name */
    public final q2 f8687O;

    /* renamed from: P  reason: collision with root package name */
    public final E.e f8688P;

    /* renamed from: Q  reason: collision with root package name */
    public final C0694p f8689Q;

    /* renamed from: R  reason: collision with root package name */
    public final C0685m f8690R;

    /* renamed from: S  reason: collision with root package name */
    public final a6.E f8691S;

    /* renamed from: T  reason: collision with root package name */
    public final V0 f8692T;

    /* renamed from: U  reason: collision with root package name */
    public W0 f8693U;

    /* renamed from: V  reason: collision with root package name */
    public C0666f1 f8694V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f8695W;

    /* renamed from: X  reason: collision with root package name */
    public final boolean f8696X;

    /* renamed from: Y  reason: collision with root package name */
    public final C0585f f8697Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f8698Z;

    /* renamed from: a0  reason: collision with root package name */
    public final long f8699a0;
    public final boolean b0;

    /* renamed from: c0  reason: collision with root package name */
    public final C0483l f8700c0;

    /* renamed from: d  reason: collision with root package name */
    public final a6.H f8701d;

    /* renamed from: d0  reason: collision with root package name */
    public final C0695p0 f8702d0;

    /* renamed from: e  reason: collision with root package name */
    public final String f8703e;

    /* renamed from: e0  reason: collision with root package name */
    public final C0644E f8704e0;
    public final a6.k0 f;

    /* renamed from: f0  reason: collision with root package name */
    public final F5.d f8705f0;

    /* renamed from: g  reason: collision with root package name */
    public final a6.g0 f8706g;

    /* renamed from: h  reason: collision with root package name */
    public final s2 f8707h;

    /* renamed from: i  reason: collision with root package name */
    public final C0679k f8708i;
    public final X0 j;

    /* renamed from: k  reason: collision with root package name */
    public final Executor f8709k;

    /* renamed from: l  reason: collision with root package name */
    public final A.m f8710l;

    /* renamed from: m  reason: collision with root package name */
    public final P0 f8711m;

    /* renamed from: n  reason: collision with root package name */
    public final P0 f8712n;

    /* renamed from: o  reason: collision with root package name */
    public final q2 f8713o;

    /* renamed from: p  reason: collision with root package name */
    public final a6.u0 f8714p;

    /* renamed from: q  reason: collision with root package name */
    public final C0492v f8715q;

    /* renamed from: r  reason: collision with root package name */
    public final C0485n f8716r;

    /* renamed from: s  reason: collision with root package name */
    public final C0665f0 f8717s;

    /* renamed from: t  reason: collision with root package name */
    public final long f8718t;

    /* renamed from: u  reason: collision with root package name */
    public final C0644E f8719u;

    /* renamed from: v  reason: collision with root package name */
    public final q2 f8720v;

    /* renamed from: w  reason: collision with root package name */
    public final V0 f8721w;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList f8722x;

    /* renamed from: y  reason: collision with root package name */
    public d2 f8723y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f8724z;

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, c6.J0] */
    static {
        a6.o0 o0Var = a6.o0.f7180n;
        f8667i0 = o0Var.g("Channel shutdownNow invoked");
        f8668j0 = o0Var.g("Channel shutdown invoked");
        f8669k0 = o0Var.g("Subchannel shutdown invoked");
        f8670l0 = new C0666f1(null, new HashMap(), new HashMap(), null, null, null);
        f8671m0 = new Object();
        f8672n0 = new C0648I(1);
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [F5.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [c6.E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [c6.E, java.lang.Object] */
    public Z0(C0651a1 c0651a1, C0912i c0912i, q2 q2Var, A.m mVar, C0665f0 c0665f0, ArrayList arrayList) {
        int i7;
        boolean z7;
        q2 q2Var2 = q2.f8962b;
        a6.u0 u0Var = new a6.u0(new M0(this));
        this.f8714p = u0Var;
        ?? obj = new Object();
        obj.f8442b = new ArrayList();
        obj.f8441a = EnumC0486o.IDLE;
        this.f8719u = obj;
        this.f8676D = new HashSet(16, 0.75f);
        this.f8678F = new Object();
        this.f8679G = new HashSet(1, 0.75f);
        this.f8681I = new E.e(this);
        this.f8682J = new AtomicBoolean(false);
        this.f8686N = new CountDownLatch(1);
        this.f8693U = W0.NO_RESOLUTION;
        this.f8694V = f8670l0;
        this.f8695W = false;
        this.f8697Y = new C0585f(1);
        this.f8700c0 = C0490t.f7203d;
        A.c cVar = new A.c(this, 26);
        this.f8702d0 = new C0695p0(this, 1);
        ?? obj2 = new Object();
        obj2.f8442b = this;
        this.f8704e0 = obj2;
        String str = c0651a1.f;
        G.i.j(str, "target");
        this.f8703e = str;
        a6.H h8 = new a6.H("Channel", str, a6.H.f7079d.incrementAndGet());
        this.f8701d = h8;
        this.f8713o = q2Var2;
        A.m mVar2 = c0651a1.f8744a;
        G.i.j(mVar2, "executorPool");
        this.f8710l = mVar2;
        Executor executor = (Executor) n2.a((m2) mVar2.f28b);
        G.i.j(executor, "executor");
        this.f8709k = executor;
        A.m mVar3 = c0651a1.f8745b;
        G.i.j(mVar3, "offloadExecutorPool");
        P0 p02 = new P0(mVar3);
        this.f8712n = p02;
        C0679k c0679k = new C0679k(c0912i, p02);
        this.f8708i = c0679k;
        X0 x02 = new X0(c0912i.f10388d);
        this.j = x02;
        C0694p c0694p = new C0694p(h8, q2Var2.c(), AbstractC0059i.M("Channel for '", str, "'"));
        this.f8689Q = c0694p;
        C0685m c0685m = new C0685m(c0694p, q2Var2);
        this.f8690R = c0685m;
        E1 e12 = AbstractC0671h0.f8839m;
        boolean z8 = c0651a1.f8756o;
        this.b0 = z8;
        s2 s2Var = new s2(c0651a1.f8749g);
        this.f8707h = s2Var;
        a6.k0 k0Var = c0651a1.f8747d;
        this.f = k0Var;
        I.k kVar = new I.k(z8, c0651a1.f8752k, c0651a1.f8753l, s2Var);
        C0913j c0913j = (C0913j) c0651a1.f8765x.f6744a;
        c0913j.getClass();
        int i8 = AbstractC0910g.f10381b[c0913j.f10403g.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                i7 = 443;
            } else {
                throw new AssertionError(c0913j.f10403g + " not handled");
            }
        } else {
            i7 = 80;
        }
        Integer valueOf = Integer.valueOf(i7);
        e12.getClass();
        a6.g0 g0Var = new a6.g0(valueOf, e12, u0Var, kVar, x02, c0685m, p02);
        this.f8706g = g0Var;
        c0679k.f8874a.getClass();
        this.f8723y = D(str, k0Var, g0Var, Collections.singleton(InetSocketAddress.class));
        this.f8711m = new P0(mVar);
        N n7 = new N(executor, u0Var);
        this.f8680H = n7;
        n7.e(cVar);
        this.f8720v = q2Var;
        boolean z9 = c0651a1.f8758q;
        this.f8696X = z9;
        V0 v02 = new V0(this, this.f8723y.f());
        this.f8692T = v02;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f8721w = v02;
            this.f8722x = new ArrayList(c0651a1.f8748e);
            G.i.j(c0665f0, "stopwatchSupplier");
            this.f8717s = c0665f0;
            long j = c0651a1.j;
            if (j == -1) {
                this.f8718t = j;
            } else {
                if (j >= C0651a1.f8737A) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                G.i.h(z7, "invalid idleTimeoutMillis %s", j);
                this.f8718t = c0651a1.j;
            }
            K0 k02 = new K0(this, 5);
            ScheduledExecutorService scheduledExecutorService = c0912i.f10388d;
            T1 t1 = new T1();
            ?? obj3 = new Object();
            obj3.f1210e = k02;
            obj3.f1209d = u0Var;
            obj3.f1208c = scheduledExecutorService;
            obj3.f = t1;
            t1.b();
            this.f8705f0 = obj3;
            C0492v c0492v = c0651a1.f8750h;
            G.i.j(c0492v, "decompressorRegistry");
            this.f8715q = c0492v;
            C0485n c0485n = c0651a1.f8751i;
            G.i.j(c0485n, "compressorRegistry");
            this.f8716r = c0485n;
            this.f8699a0 = c0651a1.f8754m;
            this.f8698Z = c0651a1.f8755n;
            this.f8687O = new q2(13);
            this.f8688P = new E.e(15);
            a6.E e7 = c0651a1.f8757p;
            e7.getClass();
            this.f8691S = e7;
            a6.G g3 = (a6.G) e7.f7075a.put(Long.valueOf(c().f7082c), this);
            if (!z9) {
                this.f8695W = true;
            }
        } else if (it.next() == null) {
            G.i.j(null, "interceptor");
            throw null;
        } else {
            throw new ClassCastException();
        }
    }

    public static void A(Z0 z02) {
        if (!z02.f8685M && z02.f8682J.get() && z02.f8676D.isEmpty() && z02.f8679G.isEmpty()) {
            z02.f8690R.l(EnumC0477f.INFO, "Terminated");
            a6.G g3 = (a6.G) z02.f8691S.f7075a.remove(Long.valueOf(z02.c().f7082c));
            A.m mVar = z02.f8710l;
            n2.b((m2) mVar.f28b, z02.f8709k);
            P0 p02 = z02.f8711m;
            synchronized (p02) {
                Executor executor = p02.f8561b;
                if (executor != null) {
                    n2.b((m2) p02.f8560a.f28b, executor);
                    p02.f8561b = null;
                }
            }
            z02.f8712n.a();
            z02.f8708i.close();
            z02.f8685M = true;
            z02.f8686N.countDown();
        }
    }

    public static d2 D(String str, a6.k0 k0Var, a6.g0 g0Var, Collection collection) {
        URI uri;
        a6.j0 j0Var;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder();
        W w2 = null;
        try {
            uri = new URI(str);
        } catch (URISyntaxException e7) {
            sb.append(e7.getMessage());
            uri = null;
        }
        if (uri != null) {
            j0Var = k0Var.b(uri.getScheme());
        } else {
            j0Var = null;
        }
        if (j0Var == null && !f8666h0.matcher(str).matches()) {
            try {
                synchronized (k0Var) {
                    str4 = k0Var.f7164a;
                }
                uri = new URI(str4, StringUtils.EMPTY, "/" + str, null);
                j0Var = k0Var.b(uri.getScheme());
            } catch (URISyntaxException e8) {
                throw new IllegalArgumentException(e8);
            }
        }
        if (j0Var == null) {
            if (sb.length() > 0) {
                str3 = " (" + ((Object) sb) + ")";
            } else {
                str3 = StringUtils.EMPTY;
            }
            throw new IllegalArgumentException(AbstractC0059i.M("Could not find a NameResolverProvider for ", str, str3));
        } else if (collection != null && !collection.containsAll(j0Var.a())) {
            throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.j("Address types of NameResolver '", uri.getScheme(), "' for '", str, "' not supported by transport"));
        } else {
            if ("dns".equals(uri.getScheme())) {
                String path = uri.getPath();
                G.i.j(path, "targetPath");
                if (path.startsWith("/")) {
                    String substring = path.substring(1);
                    uri.getAuthority();
                    w2 = new W(substring, g0Var, AbstractC0671h0.f8842p, new T1(), X.f8640a);
                } else {
                    throw new IllegalArgumentException(H4.W.z("the path component (%s) of the target (%s) must start with '/'", path, uri));
                }
            }
            if (w2 != null) {
                q2 q2Var = new q2(7);
                X0 x02 = g0Var.f7151e;
                if (x02 != null) {
                    a6.u0 u0Var = g0Var.f7149c;
                    return new d2(w2, new C0673i(q2Var, x02, u0Var), u0Var);
                }
                throw new IllegalStateException("ScheduledExecutorService not set in Builder");
            }
            if (sb.length() > 0) {
                str2 = " (" + ((Object) sb) + ")";
            } else {
                str2 = StringUtils.EMPTY;
            }
            throw new IllegalArgumentException(AbstractC0059i.M("cannot create a NameResolver for ", str, str2));
        }
    }

    public static void y(Z0 z02) {
        z02.G(true);
        N n7 = z02.f8680H;
        n7.i(null);
        z02.f8690R.l(EnumC0477f.INFO, "Entering IDLE state");
        z02.f8719u.b(EnumC0486o.IDLE);
        Object[] objArr = {z02.f8678F, n7};
        C0695p0 c0695p0 = z02.f8702d0;
        c0695p0.getClass();
        for (int i7 = 0; i7 < 2; i7++) {
            if (((Set) c0695p0.f229a).contains(objArr[i7])) {
                z02.C();
                return;
            }
        }
    }

    public static void z(Z0 z02) {
        if (z02.f8683K) {
            Iterator it = z02.f8676D.iterator();
            while (it.hasNext()) {
                C0721y0 c0721y0 = (C0721y0) it.next();
                c0721y0.getClass();
                a6.o0 o0Var = f8667i0;
                RunnableC0700r0 runnableC0700r0 = new RunnableC0700r0(c0721y0, o0Var, 0);
                a6.u0 u0Var = c0721y0.f9043k;
                u0Var.execute(runnableC0700r0);
                u0Var.execute(new RunnableC0700r0(c0721y0, o0Var, 1));
            }
            Iterator it2 = z02.f8679G.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public final void B(boolean z7) {
        ScheduledFuture scheduledFuture;
        F5.d dVar = this.f8705f0;
        dVar.f1207b = false;
        if (z7 && (scheduledFuture = (ScheduledFuture) dVar.f1211g) != null) {
            scheduledFuture.cancel(false);
            dVar.f1211g = null;
        }
    }

    public final void C() {
        this.f8714p.e();
        if (!this.f8682J.get() && !this.f8675C) {
            if (!((Set) this.f8702d0.f229a).isEmpty()) {
                B(false);
            } else {
                E();
            }
            if (this.f8673A != null) {
                return;
            }
            this.f8690R.l(EnumC0477f.INFO, "Exiting idle mode");
            Q0 q0 = new Q0(this);
            s2 s2Var = this.f8707h;
            s2Var.getClass();
            q0.f8567d = new E.e(s2Var, q0);
            this.f8673A = q0;
            this.f8723y.n(new R0(this, q0, this.f8723y));
            this.f8724z = true;
        }
    }

    public final void E() {
        long j = this.f8718t;
        if (j == -1) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        F5.d dVar = this.f8705f0;
        dVar.getClass();
        long nanos = timeUnit.toNanos(j);
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long a7 = ((T1) dVar.f).a(timeUnit2) + nanos;
        dVar.f1207b = true;
        if (a7 - dVar.f1206a < 0 || ((ScheduledFuture) dVar.f1211g) == null) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) dVar.f1211g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            dVar.f1211g = ((ScheduledExecutorService) dVar.f1208c).schedule(new J1(dVar, 1), nanos, timeUnit2);
        }
        dVar.f1206a = a7;
    }

    public final void F() {
        this.f8690R.l(EnumC0477f.DEBUG, "shutdown() called");
        if (!this.f8682J.compareAndSet(false, true)) {
            return;
        }
        K0 k02 = new K0(this, 3);
        a6.u0 u0Var = this.f8714p;
        u0Var.execute(k02);
        V0 v02 = this.f8692T;
        v02.f8607g.f8714p.execute(new T0(v02, 0));
        u0Var.execute(new K0(this, 0));
    }

    public final void G(boolean z7) {
        boolean z8;
        this.f8714p.e();
        if (z7) {
            G.i.o("nameResolver is not started", this.f8724z);
            if (this.f8673A != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            G.i.o("lbHelper is null", z8);
        }
        d2 d2Var = this.f8723y;
        if (d2Var != null) {
            d2Var.m();
            this.f8724z = false;
            if (z7) {
                String str = this.f8703e;
                a6.k0 k0Var = this.f;
                a6.g0 g0Var = this.f8706g;
                this.f8708i.f8874a.getClass();
                this.f8723y = D(str, k0Var, g0Var, Collections.singleton(InetSocketAddress.class));
            } else {
                this.f8723y = null;
            }
        }
        Q0 q0 = this.f8673A;
        if (q0 != null) {
            E.e eVar = q0.f8567d;
            ((a6.Q) eVar.f921c).f();
            eVar.f921c = null;
            this.f8673A = null;
        }
        this.f8674B = null;
    }

    @Override // a6.G
    public final a6.H c() {
        return this.f8701d;
    }

    @Override // a6.AbstractC0478g
    public final AbstractC0479h n(Q0.A a7, C0476e c0476e) {
        return this.f8721w.n(a7, c0476e);
    }

    @Override // a6.U
    public final boolean s(long j, TimeUnit timeUnit) {
        return this.f8686N.await(j, timeUnit);
    }

    @Override // a6.U
    public final void t() {
        this.f8714p.execute(new K0(this, 1));
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.b("logId", this.f8701d.f7082c);
        C7.a(this.f8703e, "target");
        return C7.toString();
    }

    @Override // a6.U
    public final EnumC0486o u() {
        EnumC0486o enumC0486o = (EnumC0486o) this.f8719u.f8441a;
        if (enumC0486o != null) {
            if (enumC0486o == EnumC0486o.IDLE) {
                this.f8714p.execute(new K0(this, 2));
            }
            return enumC0486o;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    @Override // a6.U
    public final void v(EnumC0486o enumC0486o, t4.q qVar) {
        this.f8714p.execute(new H2.a(this, qVar, enumC0486o, 4));
    }

    @Override // a6.U
    public final /* bridge */ /* synthetic */ a6.U w() {
        F();
        return this;
    }

    @Override // a6.U
    public final a6.U x() {
        this.f8690R.l(EnumC0477f.DEBUG, "shutdownNow() called");
        F();
        V0 v02 = this.f8692T;
        v02.f8607g.f8714p.execute(new T0(v02, 1));
        this.f8714p.execute(new K0(this, 4));
        return this;
    }
}
