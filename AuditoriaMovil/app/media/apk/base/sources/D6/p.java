package d6;

import A3.N;
import B5.S;
import D.AbstractC0055e;
import D.C0054d;
import H4.W;
import Q6.AbstractC0281b;
import a6.AbstractC0482k;
import a6.B;
import a6.C0472a;
import a6.C0473b;
import a6.C0476e;
import a6.H;
import a6.e0;
import a6.f0;
import a6.o0;
import a6.p0;
import a6.t0;
import c6.AbstractC0671h0;
import c6.C0665f0;
import c6.C0689n0;
import c6.C0695p0;
import c6.E0;
import c6.EnumC0714w;
import c6.F0;
import c6.G0;
import c6.InterfaceC0642C;
import c6.InterfaceC0669g1;
import c6.InterfaceC0711v;
import c6.RunnableC0686m0;
import c6.T1;
import c6.h2;
import c6.k2;
import c6.o2;
import c6.q2;
import c6.s2;
import e6.C0973h;
import e6.C0974i;
import e6.EnumC0966a;
import f6.C0995b;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class p implements InterfaceC0642C {

    /* renamed from: P  reason: collision with root package name */
    public static final Map f10437P;

    /* renamed from: Q  reason: collision with root package name */
    public static final Logger f10438Q;

    /* renamed from: A  reason: collision with root package name */
    public final SocketFactory f10439A;

    /* renamed from: B  reason: collision with root package name */
    public final SSLSocketFactory f10440B;

    /* renamed from: C  reason: collision with root package name */
    public int f10441C;

    /* renamed from: D  reason: collision with root package name */
    public final LinkedList f10442D;

    /* renamed from: E  reason: collision with root package name */
    public final io.grpc.okhttp.internal.c f10443E;

    /* renamed from: F  reason: collision with root package name */
    public G0 f10444F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f10445G;

    /* renamed from: H  reason: collision with root package name */
    public long f10446H;

    /* renamed from: I  reason: collision with root package name */
    public long f10447I;

    /* renamed from: J  reason: collision with root package name */
    public final G.c f10448J;

    /* renamed from: K  reason: collision with root package name */
    public final int f10449K;

    /* renamed from: L  reason: collision with root package name */
    public final s2 f10450L;

    /* renamed from: M  reason: collision with root package name */
    public final C0695p0 f10451M;

    /* renamed from: N  reason: collision with root package name */
    public final B f10452N;

    /* renamed from: O  reason: collision with root package name */
    public final int f10453O;

    /* renamed from: a  reason: collision with root package name */
    public final InetSocketAddress f10454a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10455b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10456c;

    /* renamed from: d  reason: collision with root package name */
    public final Random f10457d;

    /* renamed from: e  reason: collision with root package name */
    public final C0665f0 f10458e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final C0974i f10459g;

    /* renamed from: h  reason: collision with root package name */
    public C0054d f10460h;

    /* renamed from: i  reason: collision with root package name */
    public C0907d f10461i;
    public K0.o j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f10462k;

    /* renamed from: l  reason: collision with root package name */
    public final H f10463l;

    /* renamed from: m  reason: collision with root package name */
    public int f10464m;

    /* renamed from: n  reason: collision with root package name */
    public final HashMap f10465n;

    /* renamed from: o  reason: collision with root package name */
    public final Executor f10466o;

    /* renamed from: p  reason: collision with root package name */
    public final h2 f10467p;

    /* renamed from: q  reason: collision with root package name */
    public final ScheduledExecutorService f10468q;

    /* renamed from: r  reason: collision with root package name */
    public final int f10469r;

    /* renamed from: s  reason: collision with root package name */
    public int f10470s;

    /* renamed from: t  reason: collision with root package name */
    public o f10471t;

    /* renamed from: u  reason: collision with root package name */
    public C0473b f10472u;

    /* renamed from: v  reason: collision with root package name */
    public o0 f10473v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f10474w;

    /* renamed from: x  reason: collision with root package name */
    public C0689n0 f10475x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f10476y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f10477z;

    static {
        EnumMap enumMap = new EnumMap(EnumC0966a.class);
        EnumC0966a enumC0966a = EnumC0966a.NO_ERROR;
        o0 o0Var = o0.f7179m;
        enumMap.put((EnumMap) enumC0966a, (EnumC0966a) o0Var.g("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) EnumC0966a.PROTOCOL_ERROR, (EnumC0966a) o0Var.g("Protocol error"));
        enumMap.put((EnumMap) EnumC0966a.INTERNAL_ERROR, (EnumC0966a) o0Var.g("Internal error"));
        enumMap.put((EnumMap) EnumC0966a.FLOW_CONTROL_ERROR, (EnumC0966a) o0Var.g("Flow control error"));
        enumMap.put((EnumMap) EnumC0966a.STREAM_CLOSED, (EnumC0966a) o0Var.g("Stream closed"));
        enumMap.put((EnumMap) EnumC0966a.FRAME_TOO_LARGE, (EnumC0966a) o0Var.g("Frame too large"));
        enumMap.put((EnumMap) EnumC0966a.REFUSED_STREAM, (EnumC0966a) o0.f7180n.g("Refused stream"));
        enumMap.put((EnumMap) EnumC0966a.CANCEL, (EnumC0966a) o0.f.g("Cancelled"));
        enumMap.put((EnumMap) EnumC0966a.COMPRESSION_ERROR, (EnumC0966a) o0Var.g("Compression error"));
        enumMap.put((EnumMap) EnumC0966a.CONNECT_ERROR, (EnumC0966a) o0Var.g("Connect error"));
        enumMap.put((EnumMap) EnumC0966a.ENHANCE_YOUR_CALM, (EnumC0966a) o0.f7177k.g("Enhance your calm"));
        enumMap.put((EnumMap) EnumC0966a.INADEQUATE_SECURITY, (EnumC0966a) o0.f7176i.g("Inadequate security"));
        f10437P = DesugarCollections.unmodifiableMap(enumMap);
        f10438Q = Logger.getLogger(p.class.getName());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e6.i, java.lang.Object] */
    public p(C0912i c0912i, InetSocketAddress inetSocketAddress, String str, C0473b c0473b, B b5, G.c cVar) {
        C0665f0 c0665f0 = AbstractC0671h0.f8844r;
        ?? obj = new Object();
        this.f10457d = new Random();
        Object obj2 = new Object();
        this.f10462k = obj2;
        this.f10465n = new HashMap();
        this.f10441C = 0;
        this.f10442D = new LinkedList();
        this.f10451M = new C0695p0(this, 2);
        this.f10453O = 30000;
        G.i.j(inetSocketAddress, "address");
        this.f10454a = inetSocketAddress;
        this.f10455b = str;
        this.f10469r = c0912i.f10383Y;
        this.f = c0912i.f10392g0;
        Executor executor = c0912i.f10386b;
        G.i.j(executor, "executor");
        this.f10466o = executor;
        this.f10467p = new h2(c0912i.f10386b);
        ScheduledExecutorService scheduledExecutorService = c0912i.f10388d;
        G.i.j(scheduledExecutorService, "scheduledExecutorService");
        this.f10468q = scheduledExecutorService;
        this.f10464m = 3;
        this.f10439A = SocketFactory.getDefault();
        this.f10440B = c0912i.f;
        io.grpc.okhttp.internal.c cVar2 = c0912i.f10382X;
        G.i.j(cVar2, "connectionSpec");
        this.f10443E = cVar2;
        G.i.j(c0665f0, "stopwatchFactory");
        this.f10458e = c0665f0;
        this.f10459g = obj;
        this.f10456c = "grpc-java-okhttp/1.62.2";
        this.f10452N = b5;
        this.f10448J = cVar;
        this.f10449K = c0912i.f10393h0;
        c0912i.f10389e.getClass();
        this.f10450L = new s2();
        this.f10463l = H.a(p.class, inetSocketAddress.toString());
        C0473b c0473b2 = C0473b.f7115b;
        C0472a c0472a = k2.f8880b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c0472a, c0473b);
        for (Map.Entry entry : c0473b2.f7116a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C0472a) entry.getKey(), entry.getValue());
            }
        }
        this.f10472u = new C0473b(identityHashMap);
        synchronized (obj2) {
        }
    }

    public static void g(p pVar, EnumC0966a enumC0966a, String str) {
        pVar.getClass();
        pVar.u(0, enumC0966a, y(enumC0966a).a(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v9, types: [Q6.e, java.lang.Object] */
    public static Socket h(p pVar, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        Socket createSocket;
        String str3;
        int i7;
        String str4;
        pVar.getClass();
        Socket socket = null;
        try {
            InetAddress address = inetSocketAddress2.getAddress();
            SocketFactory socketFactory = pVar.f10439A;
            if (address != null) {
                createSocket = socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            } else {
                createSocket = socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            }
            try {
                createSocket.setTcpNoDelay(true);
                createSocket.setSoTimeout(pVar.f10453O);
                Q6.d f = AbstractC0281b.f(createSocket);
                Q6.q qVar = new Q6.q(AbstractC0281b.e(createSocket));
                t0 i8 = pVar.i(inetSocketAddress, str, str2);
                io.grpc.okhttp.internal.e eVar = (io.grpc.okhttp.internal.e) i8.f7210c;
                C0995b c0995b = (C0995b) i8.f7209b;
                Locale locale = Locale.US;
                qVar.g("CONNECT " + c0995b.f11069a + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + c0995b.f11070b + " HTTP/1.1");
                qVar.g("\r\n");
                int length = eVar.f12550b.length / 2;
                for (int i9 = 0; i9 < length; i9++) {
                    int i10 = i9 * 2;
                    String[] strArr = eVar.f12550b;
                    if (i10 >= 0 && i10 < strArr.length) {
                        str3 = strArr[i10];
                        qVar.g(str3);
                        qVar.g(": ");
                        i7 = i10 + 1;
                        if (i7 >= 0 && i7 < strArr.length) {
                            str4 = strArr[i7];
                            qVar.g(str4);
                            qVar.g("\r\n");
                        }
                        str4 = null;
                        qVar.g(str4);
                        qVar.g("\r\n");
                    }
                    str3 = null;
                    qVar.g(str3);
                    qVar.g(": ");
                    i7 = i10 + 1;
                    if (i7 >= 0) {
                        str4 = strArr[i7];
                        qVar.g(str4);
                        qVar.g("\r\n");
                    }
                    str4 = null;
                    qVar.g(str4);
                    qVar.g("\r\n");
                }
                qVar.g("\r\n");
                qVar.flush();
                N l8 = N.l(s(f));
                do {
                } while (!s(f).equals(StringUtils.EMPTY));
                int i11 = l8.f104b;
                if (i11 >= 200 && i11 < 300) {
                    createSocket.setSoTimeout(0);
                    return createSocket;
                }
                ?? obj = new Object();
                try {
                    createSocket.shutdownOutput();
                    f.i(obj, 1024L);
                } catch (IOException e7) {
                    obj.z("Unable to read body: " + e7.toString());
                }
                try {
                    createSocket.close();
                } catch (IOException unused) {
                }
                Locale locale2 = Locale.US;
                throw new p0(o0.f7180n.g("Response returned from proxy was not successful (expected 2xx, got " + i11 + StringUtils.SPACE + ((String) l8.f106d) + "). Response body:\n" + obj.q(obj.f4462b, E6.a.f1074a)));
            } catch (IOException e8) {
                e = e8;
                socket = createSocket;
                if (socket != null) {
                    AbstractC0671h0.b(socket);
                }
                throw new p0(o0.f7180n.g("Failed trying to connect with proxy").f(e));
            }
        } catch (IOException e9) {
            e = e9;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [Q6.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [Q6.e, java.lang.Object] */
    public static String s(Q6.d dVar) {
        long j;
        Q6.t tVar;
        long j8;
        long j9;
        long j10;
        ?? obj = new Object();
        while (dVar.i(obj, 1L) != -1) {
            if (obj.c(obj.f4462b - 1) == 10) {
                long j11 = obj.f4462b;
                if (Long.MAX_VALUE > j11) {
                    j = j11;
                } else {
                    j = Long.MAX_VALUE;
                }
                if (0 == j || (tVar = obj.f4461a) == null) {
                    j9 = -1;
                    j10 = -1;
                } else if (j11 < 0) {
                    while (j11 > 0) {
                        tVar = tVar.f4496g;
                        kotlin.jvm.internal.j.b(tVar);
                        j11 -= tVar.f4493c - tVar.f4492b;
                    }
                    long j12 = 0;
                    loop4: while (j11 < j) {
                        int min = (int) Math.min(tVar.f4493c, (tVar.f4492b + j) - j11);
                        for (int i7 = (int) ((tVar.f4492b + j12) - j11); i7 < min; i7++) {
                            if (tVar.f4491a[i7] == 10) {
                                j8 = i7 - tVar.f4492b;
                                j10 = j8 + j11;
                                j9 = -1;
                                break loop4;
                            }
                        }
                        j12 = j11 + (tVar.f4493c - tVar.f4492b);
                        tVar = tVar.f;
                        kotlin.jvm.internal.j.b(tVar);
                        j11 = j12;
                    }
                    j9 = -1;
                    j10 = -1;
                } else {
                    j11 = 0;
                    while (true) {
                        long j13 = (tVar.f4493c - tVar.f4492b) + j11;
                        if (j13 > 0) {
                            break;
                        }
                        tVar = tVar.f;
                        kotlin.jvm.internal.j.b(tVar);
                        j11 = j13;
                    }
                    long j14 = 0;
                    loop7: while (j11 < j) {
                        int min2 = (int) Math.min(tVar.f4493c, (tVar.f4492b + j) - j11);
                        for (int i8 = (int) ((tVar.f4492b + j14) - j11); i8 < min2; i8++) {
                            if (tVar.f4491a[i8] == 10) {
                                j8 = i8 - tVar.f4492b;
                                j10 = j8 + j11;
                                j9 = -1;
                                break loop4;
                            }
                        }
                        j14 = (tVar.f4493c - tVar.f4492b) + j11;
                        tVar = tVar.f;
                        kotlin.jvm.internal.j.b(tVar);
                        j11 = j14;
                    }
                    j9 = -1;
                    j10 = -1;
                }
                if (j10 != j9) {
                    return R6.a.a(obj, j10);
                }
                if (Long.MAX_VALUE < obj.f4462b && obj.c(9223372036854775806L) == 13 && obj.c(Long.MAX_VALUE) == 10) {
                    return R6.a.a(obj, Long.MAX_VALUE);
                }
                ?? obj2 = new Object();
                long min3 = Math.min(32, obj.f4462b);
                long j15 = 0;
                AbstractC0281b.c(obj.f4462b, 0L, min3);
                if (min3 != 0) {
                    obj2.f4462b += min3;
                    Q6.t tVar2 = obj.f4461a;
                    while (true) {
                        kotlin.jvm.internal.j.b(tVar2);
                        long j16 = tVar2.f4493c - tVar2.f4492b;
                        if (j15 < j16) {
                            break;
                        }
                        j15 -= j16;
                        tVar2 = tVar2.f;
                    }
                    while (min3 > 0) {
                        kotlin.jvm.internal.j.b(tVar2);
                        Q6.t c8 = tVar2.c();
                        int i9 = c8.f4492b + ((int) j15);
                        c8.f4492b = i9;
                        c8.f4493c = Math.min(i9 + ((int) min3), c8.f4493c);
                        Q6.t tVar3 = obj2.f4461a;
                        if (tVar3 == null) {
                            c8.f4496g = c8;
                            c8.f = c8;
                            obj2.f4461a = c8;
                        } else {
                            Q6.t tVar4 = tVar3.f4496g;
                            kotlin.jvm.internal.j.b(tVar4);
                            tVar4.b(c8);
                        }
                        min3 -= c8.f4493c - c8.f4492b;
                        tVar2 = tVar2.f;
                        j15 = 0;
                    }
                }
                throw new EOFException("\\n not found: limit=" + Math.min(obj.f4462b, Long.MAX_VALUE) + " content=" + obj2.n(obj2.f4462b).d() + (char) 8230);
            }
        }
        throw new EOFException("\\n not found: " + obj.n(obj.f4462b).d());
    }

    public static o0 y(EnumC0966a enumC0966a) {
        o0 o0Var = (o0) f10437P.get(enumC0966a);
        if (o0Var == null) {
            o0 o0Var2 = o0.f7174g;
            return o0Var2.g("Unknown http2 error code: " + enumC0966a.httpCode);
        }
        return o0Var;
    }

    @Override // c6.InterfaceC0672h1
    public final void a(o0 o0Var) {
        synchronized (this.f10462k) {
            try {
                if (this.f10473v != null) {
                    return;
                }
                this.f10473v = o0Var;
                this.f10460h.s(o0Var);
                x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c6.InterfaceC0720y
    public final InterfaceC0711v b(Q0.A a7, e0 e0Var, C0476e c0476e, AbstractC0482k[] abstractC0482kArr) {
        G.i.j(a7, "method");
        G.i.j(e0Var, "headers");
        C0473b c0473b = this.f10472u;
        o2 o2Var = new o2(abstractC0482kArr);
        for (AbstractC0482k abstractC0482k : abstractC0482kArr) {
            abstractC0482k.n(c0473b, e0Var);
        }
        synchronized (this.f10462k) {
            try {
                try {
                    return new m(a7, e0Var, this.f10461i, this, this.j, this.f10462k, this.f10469r, this.f, this.f10455b, this.f10456c, o2Var, this.f10450L, c0476e);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // a6.G
    public final H c() {
        return this.f10463l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [a6.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [a6.e0, java.lang.Object] */
    @Override // c6.InterfaceC0672h1
    public final void d(o0 o0Var) {
        a(o0Var);
        synchronized (this.f10462k) {
            try {
                Iterator it = this.f10465n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((m) entry.getValue()).f10429n.h(o0Var, false, new Object());
                    p((m) entry.getValue());
                }
                for (m mVar : this.f10442D) {
                    mVar.f10429n.g(o0Var, EnumC0714w.MISCARRIED, true, new Object());
                    p(mVar);
                }
                this.f10442D.clear();
                x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c6.InterfaceC0672h1
    public final Runnable e(InterfaceC0669g1 interfaceC0669g1) {
        this.f10460h = (C0054d) interfaceC0669g1;
        if (this.f10445G) {
            G0 g02 = new G0(new A.m(this, 26), this.f10468q, this.f10446H, this.f10447I);
            this.f10444F = g02;
            g02.c();
        }
        C0906c c0906c = new C0906c(this.f10467p, this);
        C0974i c0974i = this.f10459g;
        Q6.q qVar = new Q6.q(c0906c);
        c0974i.getClass();
        C0905b c0905b = new C0905b(c0906c, new C0973h(qVar));
        synchronized (this.f10462k) {
            C0907d c0907d = new C0907d(this, c0905b);
            this.f10461i = c0907d;
            this.j = new K0.o(this, c0907d);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f10467p.execute(new H2.a(this, countDownLatch, c0906c, 8));
        try {
            t();
            countDownLatch.countDown();
            this.f10467p.execute(new G.c(this, 26));
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // c6.InterfaceC0642C
    public final C0473b f() {
        return this.f10472u;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f9  */
    /* JADX WARN: Type inference failed for: r5v19, types: [Q6.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v35, types: [Q6.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a6.t0 i(java.net.InetSocketAddress r29, java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 1319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.p.i(java.net.InetSocketAddress, java.lang.String, java.lang.String):a6.t0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(int i7, o0 o0Var, EnumC0714w enumC0714w, boolean z7, EnumC0966a enumC0966a, e0 e0Var) {
        synchronized (this.f10462k) {
            try {
                m mVar = (m) this.f10465n.remove(Integer.valueOf(i7));
                if (mVar != null) {
                    if (enumC0966a != null) {
                        this.f10461i.g(i7, EnumC0966a.CANCEL);
                    }
                    if (o0Var != null) {
                        mVar.f10429n.g(o0Var, enumC0714w, z7, e0Var != null ? e0Var : new Object());
                    }
                    if (!v()) {
                        x();
                        p(mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final z[] k() {
        z[] zVarArr;
        synchronized (this.f10462k) {
            try {
                zVarArr = new z[this.f10465n.size()];
                int i7 = 0;
                for (m mVar : this.f10465n.values()) {
                    zVarArr[i7] = mVar.f10429n.o();
                    i7++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zVarArr;
    }

    public final int l() {
        URI a7 = AbstractC0671h0.a(this.f10455b);
        if (a7.getPort() != -1) {
            return a7.getPort();
        }
        return this.f10454a.getPort();
    }

    public final p0 m() {
        synchronized (this.f10462k) {
            try {
                o0 o0Var = this.f10473v;
                if (o0Var != null) {
                    return new p0(o0Var);
                }
                return new p0(o0.f7180n.g("Connection closed"));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final m n(int i7) {
        m mVar;
        synchronized (this.f10462k) {
            mVar = (m) this.f10465n.get(Integer.valueOf(i7));
        }
        return mVar;
    }

    public final boolean o(int i7) {
        boolean z7;
        synchronized (this.f10462k) {
            if (i7 < this.f10464m) {
                z7 = true;
                if ((i7 & 1) == 1) {
                }
            }
            z7 = false;
        }
        return z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:11:0x001c, B:13:0x0022, B:19:0x002d, B:21:0x0033, B:18:0x0029), top: B:30:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(d6.m r5) {
        /*
            r4 = this;
            boolean r0 = r4.f10477z
            r1 = 0
            if (r0 == 0) goto L3b
            java.util.LinkedList r0 = r4.f10442D
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3b
            java.util.HashMap r0 = r4.f10465n
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3b
            r4.f10477z = r1
            c6.G0 r0 = r4.f10444F
            if (r0 == 0) goto L3b
            monitor-enter(r0)
            c6.F0 r2 = r0.f8459d     // Catch: java.lang.Throwable -> L27
            c6.F0 r3 = c6.F0.PING_SCHEDULED     // Catch: java.lang.Throwable -> L27
            if (r2 == r3) goto L29
            c6.F0 r3 = c6.F0.PING_DELAYED     // Catch: java.lang.Throwable -> L27
            if (r2 != r3) goto L2d
            goto L29
        L27:
            r5 = move-exception
            goto L39
        L29:
            c6.F0 r2 = c6.F0.IDLE     // Catch: java.lang.Throwable -> L27
            r0.f8459d = r2     // Catch: java.lang.Throwable -> L27
        L2d:
            c6.F0 r2 = r0.f8459d     // Catch: java.lang.Throwable -> L27
            c6.F0 r3 = c6.F0.PING_SENT     // Catch: java.lang.Throwable -> L27
            if (r2 != r3) goto L37
            c6.F0 r2 = c6.F0.IDLE_AND_PING_SENT     // Catch: java.lang.Throwable -> L27
            r0.f8459d = r2     // Catch: java.lang.Throwable -> L27
        L37:
            monitor-exit(r0)
            goto L3b
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r5
        L3b:
            boolean r0 = r5.f8795e
            if (r0 == 0) goto L44
            c6.p0 r0 = r4.f10451M
            r0.u(r5, r1)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.p.p(d6.m):void");
    }

    public final void q(Exception exc) {
        u(0, EnumC0966a.INTERNAL_ERROR, o0.f7180n.f(exc));
    }

    public final void r(E0 e02, E3.a aVar) {
        boolean z7;
        long nextLong;
        synchronized (this.f10462k) {
            try {
                boolean z8 = true;
                if (this.f10461i != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                G.i.p(z7);
                if (this.f10476y) {
                    p0 m7 = m();
                    Logger logger = C0689n0.f8914g;
                    aVar.execute(new RunnableC0686m0(e02, m7));
                    return;
                }
                C0689n0 c0689n0 = this.f10475x;
                if (c0689n0 != null) {
                    nextLong = 0;
                    z8 = false;
                } else {
                    nextLong = this.f10457d.nextLong();
                    this.f10458e.getClass();
                    T1 t1 = new T1();
                    t1.b();
                    C0689n0 c0689n02 = new C0689n0(nextLong, t1);
                    this.f10475x = c0689n02;
                    this.f10450L.getClass();
                    c0689n0 = c0689n02;
                }
                if (z8) {
                    this.f10461i.d((int) (nextLong >>> 32), (int) nextLong, false);
                }
                c0689n0.a(e02, aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t() {
        synchronized (this.f10462k) {
            try {
                C0907d c0907d = this.f10461i;
                c0907d.getClass();
                try {
                    c0907d.f10373b.b();
                } catch (IOException e7) {
                    c0907d.f10372a.q(e7);
                }
                S s7 = new S(5, (byte) 0);
                s7.k(7, this.f);
                C0907d c0907d2 = this.f10461i;
                c0907d2.f10374c.Q(q.OUTBOUND, s7);
                try {
                    c0907d2.f10373b.j(s7);
                } catch (IOException e8) {
                    c0907d2.f10372a.q(e8);
                }
                int i7 = this.f;
                if (i7 > 65535) {
                    this.f10461i.m(0, i7 - 65535);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.b("logId", this.f10463l.f7082c);
        C7.a(this.f10454a, "address");
        return C7.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [a6.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [a6.e0, java.lang.Object] */
    public final void u(int i7, EnumC0966a enumC0966a, o0 o0Var) {
        synchronized (this.f10462k) {
            try {
                if (this.f10473v == null) {
                    this.f10473v = o0Var;
                    this.f10460h.s(o0Var);
                }
                if (enumC0966a != null && !this.f10474w) {
                    this.f10474w = true;
                    this.f10461i.c(enumC0966a, new byte[0]);
                }
                Iterator it = this.f10465n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i7) {
                        it.remove();
                        ((m) entry.getValue()).f10429n.g(o0Var, EnumC0714w.REFUSED, false, new Object());
                        p((m) entry.getValue());
                    }
                }
                for (m mVar : this.f10442D) {
                    mVar.f10429n.g(o0Var, EnumC0714w.MISCARRIED, true, new Object());
                    p(mVar);
                }
                this.f10442D.clear();
                x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean v() {
        boolean z7 = false;
        while (true) {
            LinkedList linkedList = this.f10442D;
            if (linkedList.isEmpty() || this.f10465n.size() >= this.f10441C) {
                break;
            }
            w((m) linkedList.poll());
            z7 = true;
        }
        return z7;
    }

    public final void w(m mVar) {
        boolean z7;
        boolean z8;
        boolean z9;
        if (mVar.f10429n.f10418K == -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("StreamId already assigned", z7);
        this.f10465n.put(Integer.valueOf(this.f10464m), mVar);
        if (!this.f10477z) {
            this.f10477z = true;
            G0 g02 = this.f10444F;
            if (g02 != null) {
                g02.b();
            }
        }
        if (mVar.f8795e) {
            this.f10451M.u(mVar, true);
        }
        l lVar = mVar.f10429n;
        int i7 = this.f10464m;
        if (lVar.f10418K == -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            lVar.f10418K = i7;
            K0.o oVar = lVar.f10413F;
            lVar.f10417J = new z(oVar, i7, oVar.f2502a, lVar);
            l lVar2 = lVar.f10419L.f10429n;
            if (lVar2.j != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            G.i.p(z9);
            synchronized (lVar2.f8772b) {
                G.i.o("Already allocated", !lVar2.f);
                lVar2.f = true;
            }
            lVar2.f();
            s2 s2Var = lVar2.f8773c;
            s2Var.getClass();
            ((q2) s2Var.f8984b).c();
            if (lVar.f10415H) {
                lVar.f10412E.j(lVar.f10419L.f10432q, lVar.f10418K, lVar.f10422x);
                for (AbstractC0482k abstractC0482k : lVar.f10419L.f10427l.f8947a) {
                    abstractC0482k.h();
                }
                lVar.f10422x = null;
                Q6.e eVar = lVar.f10423y;
                if (eVar.f4462b > 0) {
                    lVar.f10413F.b(lVar.f10424z, lVar.f10417J, eVar, lVar.f10408A);
                }
                lVar.f10415H = false;
            }
            f0 f0Var = (f0) mVar.j.f4137c;
            if ((f0Var != f0.UNARY && f0Var != f0.SERVER_STREAMING) || mVar.f10432q) {
                this.f10461i.flush();
            }
            int i8 = this.f10464m;
            if (i8 >= 2147483645) {
                this.f10464m = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                u(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, EnumC0966a.NO_ERROR, o0.f7180n.g("Stream ids exhausted"));
                return;
            }
            this.f10464m = i8 + 2;
            return;
        }
        throw new IllegalStateException(W.z("the stream has been started with id %s", Integer.valueOf(i7)));
    }

    public final void x() {
        if (this.f10473v == null || !this.f10465n.isEmpty() || !this.f10442D.isEmpty() || this.f10476y) {
            return;
        }
        this.f10476y = true;
        G0 g02 = this.f10444F;
        if (g02 != null) {
            synchronized (g02) {
                try {
                    F0 f02 = g02.f8459d;
                    F0 f03 = F0.DISCONNECTED;
                    if (f02 != f03) {
                        g02.f8459d = f03;
                        ScheduledFuture scheduledFuture = g02.f8460e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        ScheduledFuture scheduledFuture2 = g02.f;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            g02.f = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0689n0 c0689n0 = this.f10475x;
        if (c0689n0 != null) {
            c0689n0.c(m());
            this.f10475x = null;
        }
        if (!this.f10474w) {
            this.f10474w = true;
            this.f10461i.c(EnumC0966a.NO_ERROR, new byte[0]);
        }
        this.f10461i.close();
    }
}
