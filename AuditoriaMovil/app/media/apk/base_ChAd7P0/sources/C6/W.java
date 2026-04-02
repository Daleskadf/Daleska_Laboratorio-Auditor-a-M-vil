package c6;

import a6.AbstractC0471A;
import a6.AbstractC0478g;
import a6.C0493w;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class W extends AbstractC0471A {

    /* renamed from: s  reason: collision with root package name */
    public static final Logger f8615s;

    /* renamed from: t  reason: collision with root package name */
    public static final Set f8616t;

    /* renamed from: u  reason: collision with root package name */
    public static final boolean f8617u;

    /* renamed from: v  reason: collision with root package name */
    public static final boolean f8618v;

    /* renamed from: w  reason: collision with root package name */
    public static final boolean f8619w;

    /* renamed from: x  reason: collision with root package name */
    public static String f8620x;

    /* renamed from: a  reason: collision with root package name */
    public final E1 f8621a;

    /* renamed from: b  reason: collision with root package name */
    public final Random f8622b = new Random();

    /* renamed from: c  reason: collision with root package name */
    public volatile T f8623c = T.INSTANCE;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference f8624d = new AtomicReference();

    /* renamed from: e  reason: collision with root package name */
    public final String f8625e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8626g;

    /* renamed from: h  reason: collision with root package name */
    public final q2 f8627h;

    /* renamed from: i  reason: collision with root package name */
    public final long f8628i;
    public final a6.u0 j;

    /* renamed from: k  reason: collision with root package name */
    public final T1 f8629k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8630l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f8631m;

    /* renamed from: n  reason: collision with root package name */
    public Executor f8632n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f8633o;

    /* renamed from: p  reason: collision with root package name */
    public final I.k f8634p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8635q;

    /* renamed from: r  reason: collision with root package name */
    public AbstractC0478g f8636r;

    static {
        Logger logger = Logger.getLogger(W.class.getName());
        f8615s = logger;
        f8616t = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f8617u = Boolean.parseBoolean(property);
        f8618v = Boolean.parseBoolean(property2);
        f8619w = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    if (Class.forName("c6.z0", true, W.class.getClassLoader()).asSubclass(V.class).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (Exception e7) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e7);
                }
            } catch (Exception e8) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e8);
            }
        } catch (ClassCastException e9) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e9);
        } catch (ClassNotFoundException e10) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e10);
        }
    }

    public W(String str, a6.g0 g0Var, q2 q2Var, T1 t1, boolean z7) {
        boolean z8;
        G.i.j(g0Var, "args");
        this.f8627h = q2Var;
        G.i.j(str, "name");
        URI create = URI.create("//".concat(str));
        if (create.getHost() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        G.i.e(str, "Invalid DNS name: %s", z8);
        String authority = create.getAuthority();
        if (authority != null) {
            this.f8625e = authority;
            this.f = create.getHost();
            if (create.getPort() == -1) {
                this.f8626g = g0Var.f7147a;
            } else {
                this.f8626g = create.getPort();
            }
            E1 e12 = g0Var.f7148b;
            G.i.j(e12, "proxyDetector");
            this.f8621a = e12;
            long j = 0;
            if (!z7) {
                String property = System.getProperty("networkaddress.cache.ttl");
                long j8 = 30;
                if (property != null) {
                    try {
                        j8 = Long.parseLong(property);
                    } catch (NumberFormatException unused) {
                        f8615s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                    }
                }
                if (j8 > 0) {
                    j = TimeUnit.SECONDS.toNanos(j8);
                } else {
                    j = j8;
                }
            }
            this.f8628i = j;
            this.f8629k = t1;
            a6.u0 u0Var = g0Var.f7149c;
            G.i.j(u0Var, "syncContext");
            this.j = u0Var;
            P0 p02 = g0Var.f7152g;
            this.f8632n = p02;
            this.f8633o = p02 == null;
            I.k kVar = g0Var.f7150d;
            G.i.j(kVar, "serviceConfigParser");
            this.f8634p = kVar;
            return;
        }
        throw new NullPointerException(H4.W.z("nameUri (%s) doesn't have an authority", create));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map r(java.util.Map r8, java.util.Random r9, java.lang.String r10) {
        /*
            r0 = 0
            r1 = 1
            java.util.Set r2 = r8.entrySet()
            java.util.Iterator r2 = r2.iterator()
        La:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.util.Set r5 = c6.W.f8616t
            boolean r4 = r5.contains(r4)
            java.lang.String r5 = "Bad key: %s"
            a.AbstractC0412a.g0(r3, r5, r4)
            goto La
        L26:
            java.lang.String r2 = "clientLanguage"
            java.util.List r2 = c6.C0.d(r2, r8)
            r3 = 0
            if (r2 == 0) goto L4f
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L4f
            java.util.Iterator r2 = r2.iterator()
        L39:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L4e
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "java"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L39
            goto L4f
        L4e:
            return r3
        L4f:
            java.lang.String r2 = "percentage"
            java.lang.Double r2 = c6.C0.e(r2, r8)
            if (r2 == 0) goto L70
            int r4 = r2.intValue()
            r5 = 100
            if (r4 < 0) goto L63
            if (r4 > r5) goto L63
            r6 = r1
            goto L64
        L63:
            r6 = r0
        L64:
            java.lang.String r7 = "Bad percentage: %s"
            a.AbstractC0412a.g0(r2, r7, r6)
            int r9 = r9.nextInt(r5)
            if (r9 < r4) goto L70
            return r3
        L70:
            java.lang.String r9 = "clientHostname"
            java.util.List r9 = c6.C0.d(r9, r8)
            if (r9 == 0) goto L96
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L96
            java.util.Iterator r9 = r9.iterator()
        L82:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L95
            java.lang.Object r2 = r9.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L82
            goto L96
        L95:
            return r3
        L96:
            java.lang.String r9 = "serviceConfig"
            java.util.Map r10 = c6.C0.g(r9, r8)
            if (r10 == 0) goto L9f
            return r10
        L9f:
            F6.x r10 = new F6.x
            java.lang.String r2 = "key '%s' missing in '%s'"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r8
            r3[r1] = r9
            java.lang.String r8 = java.lang.String.format(r2, r3)
            r10.<init>(r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.W.r(java.util.Map, java.util.Random, java.lang.String):java.util.Map");
    }

    public static ArrayList s(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!str.startsWith("grpc_config=")) {
                f8615s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            } else {
                String substring = str.substring(12);
                Logger logger = B0.f8429a;
                Q4.a aVar = new Q4.a(new StringReader(substring));
                try {
                    Object a7 = B0.a(aVar);
                    if (a7 instanceof List) {
                        List list2 = (List) a7;
                        C0.a(list2);
                        arrayList.addAll(list2);
                    } else {
                        throw new ClassCastException("wrong type " + a7);
                    }
                } finally {
                    try {
                        aVar.close();
                    } catch (IOException e7) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e7);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // a6.AbstractC0471A
    public final String f() {
        return this.f8625e;
    }

    @Override // a6.AbstractC0471A
    public final void k() {
        boolean z7;
        if (this.f8636r != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("not started", z7);
        t();
    }

    @Override // a6.AbstractC0471A
    public final void m() {
        if (this.f8631m) {
            return;
        }
        this.f8631m = true;
        Executor executor = this.f8632n;
        if (executor != null && this.f8633o) {
            n2.b(this.f8627h, executor);
            this.f8632n = null;
        }
    }

    @Override // a6.AbstractC0471A
    public final void n(AbstractC0478g abstractC0478g) {
        boolean z7;
        if (this.f8636r == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("already started", z7);
        if (this.f8633o) {
            this.f8632n = (Executor) n2.a(this.f8627h);
        }
        this.f8636r = abstractC0478g;
        t();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final R1.j q() {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.W.q():R1.j");
    }

    public final void t() {
        long j;
        int i7;
        if (!this.f8635q && !this.f8631m) {
            if (!this.f8630l || (this.f8628i) == 0 || (i7 > 0 && this.f8629k.a(TimeUnit.NANOSECONDS) > j)) {
                this.f8635q = true;
                this.f8632n.execute(new RunnableC0646G(this, this.f8636r));
            }
        }
    }

    public final List u() {
        try {
            try {
                T t7 = this.f8623c;
                String str = this.f;
                t7.getClass();
                List<InetAddress> unmodifiableList = DesugarCollections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(unmodifiableList.size());
                for (InetAddress inetAddress : unmodifiableList) {
                    arrayList.add(new C0493w(new InetSocketAddress(inetAddress, this.f8626g)));
                }
                return DesugarCollections.unmodifiableList(arrayList);
            } catch (Exception e7) {
                Object obj = z3.r.f16897a;
                if (!(e7 instanceof RuntimeException)) {
                    throw new RuntimeException(e7);
                }
                throw ((RuntimeException) e7);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                f8615s.log(Level.FINE, "Address resolution failure", (Throwable) null);
            }
            throw th;
        }
    }
}
