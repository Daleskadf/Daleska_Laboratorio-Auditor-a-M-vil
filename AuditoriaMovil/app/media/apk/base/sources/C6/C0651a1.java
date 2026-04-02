package c6;

import a1.C0415A;
import a6.AbstractC0471A;
import a6.AbstractC0478g;
import a6.C0483l;
import a6.C0485n;
import a6.C0492v;
import b3.C0585f;
import d6.AbstractC0910g;
import d6.C0912i;
import d6.C0913j;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
/* renamed from: c6.a1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0651a1 extends a6.V {

    /* renamed from: E  reason: collision with root package name */
    public static final Method f8741E;

    /* renamed from: a  reason: collision with root package name */
    public final A.m f8744a;

    /* renamed from: b  reason: collision with root package name */
    public final A.m f8745b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f8746c;

    /* renamed from: d  reason: collision with root package name */
    public final a6.k0 f8747d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f8748e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f8749g;

    /* renamed from: h  reason: collision with root package name */
    public final C0492v f8750h;

    /* renamed from: i  reason: collision with root package name */
    public final C0485n f8751i;
    public final long j;

    /* renamed from: k  reason: collision with root package name */
    public final int f8752k;

    /* renamed from: l  reason: collision with root package name */
    public final int f8753l;

    /* renamed from: m  reason: collision with root package name */
    public final long f8754m;

    /* renamed from: n  reason: collision with root package name */
    public final long f8755n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f8756o;

    /* renamed from: p  reason: collision with root package name */
    public final a6.E f8757p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f8758q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f8759r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f8760s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f8761t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f8762u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f8763v;

    /* renamed from: w  reason: collision with root package name */
    public final C0585f f8764w;

    /* renamed from: x  reason: collision with root package name */
    public final C0415A f8765x;

    /* renamed from: y  reason: collision with root package name */
    public static final Logger f8742y = Logger.getLogger(C0651a1.class.getName());

    /* renamed from: z  reason: collision with root package name */
    public static final long f8743z = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: A  reason: collision with root package name */
    public static final long f8737A = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: B  reason: collision with root package name */
    public static final A.m f8738B = new A.m(AbstractC0671h0.f8842p, 27);

    /* renamed from: C  reason: collision with root package name */
    public static final C0492v f8739C = C0492v.f7218d;

    /* renamed from: D  reason: collision with root package name */
    public static final C0485n f8740D = C0485n.f7170b;

    static {
        Method method;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class<?> cls2 = Boolean.TYPE;
            method = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e7) {
            f8742y.log(Level.FINE, "Unable to apply census stats", (Throwable) e7);
            method = null;
            f8741E = method;
        } catch (NoSuchMethodException e8) {
            f8742y.log(Level.FINE, "Unable to apply census stats", (Throwable) e8);
            method = null;
            f8741E = method;
        }
        f8741E = method;
    }

    public C0651a1(String str, C0585f c0585f, C0415A c0415a) {
        a6.k0 k0Var;
        A.m mVar = f8738B;
        this.f8744a = mVar;
        this.f8745b = mVar;
        this.f8746c = new ArrayList();
        Logger logger = a6.k0.f7162d;
        synchronized (a6.k0.class) {
            try {
                if (a6.k0.f7163e == null) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        boolean z7 = X.f8640a;
                        arrayList.add(X.class);
                    } catch (ClassNotFoundException e7) {
                        a6.k0.f7162d.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e7);
                    }
                    List<a6.j0> k2 = AbstractC0478g.k(a6.j0.class, DesugarCollections.unmodifiableList(arrayList), a6.j0.class.getClassLoader(), new C0483l(9));
                    if (k2.isEmpty()) {
                        a6.k0.f7162d.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    a6.k0.f7163e = new a6.k0();
                    for (a6.j0 j0Var : k2) {
                        Logger logger2 = a6.k0.f7162d;
                        logger2.fine("Service loader found " + j0Var);
                        a6.k0.f7163e.a(j0Var);
                    }
                    a6.k0.f7163e.c();
                }
                k0Var = a6.k0.f7163e;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8747d = k0Var;
        this.f8748e = new ArrayList();
        this.f8749g = "pick_first";
        this.f8750h = f8739C;
        this.f8751i = f8740D;
        this.j = f8743z;
        this.f8752k = 5;
        this.f8753l = 5;
        this.f8754m = 16777216L;
        this.f8755n = 1048576L;
        this.f8756o = true;
        this.f8757p = a6.E.f7074e;
        this.f8758q = true;
        this.f8759r = true;
        this.f8760s = true;
        this.f8761t = true;
        this.f8762u = true;
        this.f8763v = true;
        G.i.j(str, "target");
        this.f = str;
        this.f8764w = c0585f;
        this.f8765x = c0415a;
    }

    @Override // a6.V
    public final a6.U a() {
        boolean z7;
        SSLSocketFactory sSLSocketFactory;
        Method method;
        C0913j c0913j = (C0913j) this.f8764w.f8171b;
        if (c0913j.f10404h != Long.MAX_VALUE) {
            z7 = true;
        } else {
            z7 = false;
        }
        int i7 = AbstractC0910g.f10381b[c0913j.f10403g.ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                try {
                    if (c0913j.f10402e == null) {
                        c0913j.f10402e = SSLContext.getInstance("Default", io.grpc.okhttp.internal.l.f12564d.f12565a).getSocketFactory();
                    }
                    sSLSocketFactory = c0913j.f10402e;
                } catch (GeneralSecurityException e7) {
                    throw new RuntimeException("TLS Provider failure", e7);
                }
            } else {
                throw new RuntimeException("Unknown negotiation type: " + c0913j.f10403g);
            }
        } else {
            sSLSocketFactory = null;
        }
        C0912i c0912i = new C0912i(c0913j.f10400c, c0913j.f10401d, sSLSocketFactory, c0913j.f, c0913j.f10406k, z7, c0913j.f10404h, c0913j.f10405i, c0913j.j, c0913j.f10407l, c0913j.f10399b);
        q2 q2Var = new q2(7);
        A.m mVar = new A.m(AbstractC0671h0.f8842p, 27);
        C0665f0 c0665f0 = AbstractC0671h0.f8844r;
        ArrayList arrayList = new ArrayList(this.f8746c);
        synchronized (AbstractC0471A.class) {
        }
        if (this.f8759r && (method = f8741E) != null) {
            try {
                if (method.invoke(null, Boolean.valueOf(this.f8760s), Boolean.valueOf(this.f8761t), Boolean.FALSE, Boolean.valueOf(this.f8762u)) != null) {
                    throw new ClassCastException();
                }
            } catch (IllegalAccessException e8) {
                f8742y.log(Level.FINE, "Unable to apply census stats", (Throwable) e8);
            } catch (InvocationTargetException e9) {
                f8742y.log(Level.FINE, "Unable to apply census stats", (Throwable) e9);
            }
        }
        if (this.f8763v) {
            try {
                if (Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", null).invoke(null, null) != null) {
                    throw new ClassCastException();
                }
            } catch (ClassNotFoundException e10) {
                f8742y.log(Level.FINE, "Unable to apply census stats", (Throwable) e10);
            } catch (IllegalAccessException e11) {
                f8742y.log(Level.FINE, "Unable to apply census stats", (Throwable) e11);
            } catch (NoSuchMethodException e12) {
                f8742y.log(Level.FINE, "Unable to apply census stats", (Throwable) e12);
            } catch (InvocationTargetException e13) {
                f8742y.log(Level.FINE, "Unable to apply census stats", (Throwable) e13);
            }
        }
        return new C0657c1(new Z0(this, c0912i, q2Var, mVar, c0665f0, arrayList));
    }
}
