package c6;

import a6.AbstractC0480i;
import a6.AbstractC0482k;
import a6.C0475d;
import a6.C0476e;
import a6.C0481j;
import a6.C0483l;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.utils.StringUtils;
/* renamed from: c6.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0671h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f8829a = Logger.getLogger(AbstractC0671h0.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final Set f8830b = DesugarCollections.unmodifiableSet(EnumSet.of(a6.n0.OK, a6.n0.INVALID_ARGUMENT, a6.n0.NOT_FOUND, a6.n0.ALREADY_EXISTS, a6.n0.FAILED_PRECONDITION, a6.n0.ABORTED, a6.n0.OUT_OF_RANGE, a6.n0.DATA_LOSS));

    /* renamed from: c  reason: collision with root package name */
    public static final a6.Z f8831c;

    /* renamed from: d  reason: collision with root package name */
    public static final a6.Z f8832d;

    /* renamed from: e  reason: collision with root package name */
    public static final a6.c0 f8833e;
    public static final a6.Z f;

    /* renamed from: g  reason: collision with root package name */
    public static final a6.c0 f8834g;

    /* renamed from: h  reason: collision with root package name */
    public static final a6.Z f8835h;

    /* renamed from: i  reason: collision with root package name */
    public static final a6.Z f8836i;
    public static final a6.Z j;

    /* renamed from: k  reason: collision with root package name */
    public static final a6.Z f8837k;

    /* renamed from: l  reason: collision with root package name */
    public static final long f8838l;

    /* renamed from: m  reason: collision with root package name */
    public static final E1 f8839m;

    /* renamed from: n  reason: collision with root package name */
    public static final C0475d f8840n;

    /* renamed from: o  reason: collision with root package name */
    public static final C0662e0 f8841o;

    /* renamed from: p  reason: collision with root package name */
    public static final q2 f8842p;

    /* renamed from: q  reason: collision with root package name */
    public static final q2 f8843q;

    /* renamed from: r  reason: collision with root package name */
    public static final C0665f0 f8844r;

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, c6.e0] */
    static {
        Charset.forName("US-ASCII");
        f8831c = new a6.Z("grpc-timeout", new q2(11));
        C0483l c0483l = a6.e0.f7140d;
        f8832d = new a6.Z("grpc-encoding", c0483l);
        f8833e = a6.I.a("grpc-accept-encoding", new q2(10));
        f = new a6.Z("content-encoding", c0483l);
        f8834g = a6.I.a("accept-encoding", new q2(10));
        f8835h = new a6.Z("content-length", c0483l);
        f8836i = new a6.Z("content-type", c0483l);
        j = new a6.Z("te", c0483l);
        f8837k = new a6.Z("user-agent", c0483l);
        z3.g.f16883c.getClass();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f8838l = timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        f8839m = new E1();
        f8840n = new C0475d("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", 0);
        f8841o = new Object();
        f8842p = new q2(8);
        f8843q = new q2(9);
        f8844r = new C0665f0(0);
    }

    public static URI a(String str) {
        G.i.j(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e7) {
            throw new IllegalArgumentException("Invalid authority: ".concat(str), e7);
        }
    }

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e7) {
            f8829a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e7);
        }
    }

    public static AbstractC0482k[] c(C0476e c0476e, a6.e0 e0Var, int i7, boolean z7) {
        List list = c0476e.f7136e;
        int size = list.size();
        AbstractC0482k[] abstractC0482kArr = new AbstractC0482k[size + 1];
        C0476e c0476e2 = C0476e.f7131i;
        C0481j c0481j = new C0481j(c0476e, i7, z7);
        for (int i8 = 0; i8 < list.size(); i8++) {
            abstractC0482kArr[i8] = ((AbstractC0480i) list.get(i8)).a(c0481j, e0Var);
        }
        abstractC0482kArr[size] = f8841o;
        return abstractC0482kArr;
    }

    public static String d(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static E3.c e(String str) {
        Boolean bool = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        return new E3.c(Executors.defaultThreadFactory(), str, new AtomicLong(0L), bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c6.InterfaceC0720y f(a6.M r5, boolean r6) {
        /*
            a6.A r0 = r5.f7092a
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.e()
            c6.y0 r0 = (c6.C0721y0) r0
            c6.u0 r2 = r0.f9054v
            if (r2 == 0) goto L10
            goto L1c
        L10:
            a6.u0 r2 = r0.f9043k
            c6.q0 r3 = new c6.q0
            r4 = 1
            r3.<init>(r0, r4)
            r2.execute(r3)
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L29
            i6.q r5 = r5.f7093b
            if (r5 != 0) goto L23
            return r2
        L23:
            c6.a0 r6 = new c6.a0
            r6.<init>(r5, r2)
            return r6
        L29:
            a6.o0 r0 = r5.f7094c
            boolean r2 = r0.e()
            if (r2 != 0) goto L4f
            boolean r5 = r5.f7095d
            if (r5 == 0) goto L41
            c6.a0 r5 = new c6.a0
            a6.o0 r6 = h(r0)
            c6.w r0 = c6.EnumC0714w.DROPPED
            r5.<init>(r6, r0)
            return r5
        L41:
            if (r6 != 0) goto L4f
            c6.a0 r5 = new c6.a0
            a6.o0 r6 = h(r0)
            c6.w r0 = c6.EnumC0714w.PROCESSED
            r5.<init>(r6, r0)
            return r5
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.AbstractC0671h0.f(a6.M, boolean):c6.y");
    }

    public static a6.o0 g(int i7) {
        a6.n0 n0Var;
        if (i7 >= 100 && i7 < 200) {
            n0Var = a6.n0.INTERNAL;
        } else {
            if (i7 != 400) {
                if (i7 != 401) {
                    if (i7 != 403) {
                        if (i7 != 404) {
                            if (i7 != 429) {
                                if (i7 != 431) {
                                    switch (i7) {
                                        case 502:
                                        case 503:
                                        case 504:
                                            break;
                                        default:
                                            n0Var = a6.n0.UNKNOWN;
                                            break;
                                    }
                                }
                            }
                            n0Var = a6.n0.UNAVAILABLE;
                        } else {
                            n0Var = a6.n0.UNIMPLEMENTED;
                        }
                    } else {
                        n0Var = a6.n0.PERMISSION_DENIED;
                    }
                } else {
                    n0Var = a6.n0.UNAUTHENTICATED;
                }
            }
            n0Var = a6.n0.INTERNAL;
        }
        a6.o0 b5 = n0Var.b();
        return b5.g("HTTP status code " + i7);
    }

    public static a6.o0 h(a6.o0 o0Var) {
        boolean z7;
        if (o0Var != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.g(z7);
        if (f8830b.contains(o0Var.f7183a)) {
            a6.o0 o0Var2 = a6.o0.f7179m;
            return o0Var2.g("Inappropriate status code from control plane: " + o0Var.f7183a + StringUtils.SPACE + o0Var.f7184b).f(o0Var.f7185c);
        }
        return o0Var;
    }
}
