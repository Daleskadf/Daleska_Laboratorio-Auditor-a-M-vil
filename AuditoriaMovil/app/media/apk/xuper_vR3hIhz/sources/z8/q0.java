package z8;

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.hpplay.component.protocol.plist.ASCIIPropertyListParser;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import y8.c;
import y8.j0;
import y8.k;
import y8.k1;
import y8.o0;
import y8.v0;
import z8.d2;
import z8.i2;
import z8.r;
/* loaded from: classes3.dex */
public abstract class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f20833a = Logger.getLogger(q0.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final Set f20834b = Collections.unmodifiableSet(EnumSet.of(k1.b.OK, k1.b.INVALID_ARGUMENT, k1.b.NOT_FOUND, k1.b.ALREADY_EXISTS, k1.b.FAILED_PRECONDITION, k1.b.ABORTED, k1.b.OUT_OF_RANGE, k1.b.DATA_LOSS));

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f20835c = Charset.forName("US-ASCII");

    /* renamed from: d  reason: collision with root package name */
    public static final v0.g f20836d = v0.g.e("grpc-timeout", new i());

    /* renamed from: e  reason: collision with root package name */
    public static final v0.g f20837e;

    /* renamed from: f  reason: collision with root package name */
    public static final v0.g f20838f;

    /* renamed from: g  reason: collision with root package name */
    public static final v0.g f20839g;

    /* renamed from: h  reason: collision with root package name */
    public static final v0.g f20840h;

    /* renamed from: i  reason: collision with root package name */
    public static final v0.g f20841i;

    /* renamed from: j  reason: collision with root package name */
    public static final v0.g f20842j;

    /* renamed from: k  reason: collision with root package name */
    public static final v0.g f20843k;

    /* renamed from: l  reason: collision with root package name */
    public static final v0.g f20844l;

    /* renamed from: m  reason: collision with root package name */
    public static final Splitter f20845m;

    /* renamed from: n  reason: collision with root package name */
    public static final long f20846n;

    /* renamed from: o  reason: collision with root package name */
    public static final long f20847o;

    /* renamed from: p  reason: collision with root package name */
    public static final long f20848p;

    /* renamed from: q  reason: collision with root package name */
    public static final y8.d1 f20849q;

    /* renamed from: r  reason: collision with root package name */
    public static final y8.d1 f20850r;

    /* renamed from: s  reason: collision with root package name */
    public static final c.C0345c f20851s;

    /* renamed from: t  reason: collision with root package name */
    public static final y8.k f20852t;

    /* renamed from: u  reason: collision with root package name */
    public static final d2.d f20853u;

    /* renamed from: v  reason: collision with root package name */
    public static final d2.d f20854v;

    /* renamed from: w  reason: collision with root package name */
    public static final Supplier f20855w;

    /* loaded from: classes3.dex */
    public class a implements y8.d1 {
        @Override // y8.d1
        public y8.c1 a(SocketAddress socketAddress) {
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public class b extends y8.k {
    }

    /* loaded from: classes3.dex */
    public class c implements d2.d {
        @Override // z8.d2.d
        /* renamed from: a */
        public void close(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // z8.d2.d
        /* renamed from: b */
        public Executor create() {
            return Executors.newCachedThreadPool(q0.i("grpc-default-executor-%d", true));
        }

        public String toString() {
            return "grpc-default-executor";
        }
    }

    /* loaded from: classes3.dex */
    public class d implements d2.d {
        @Override // z8.d2.d
        /* renamed from: a */
        public void close(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        @Override // z8.d2.d
        /* renamed from: b */
        public ScheduledExecutorService create() {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, q0.i("grpc-timer-%d", true));
            try {
                newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
            return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Supplier {
        @Override // com.google.common.base.Supplier
        /* renamed from: a */
        public Stopwatch get() {
            return Stopwatch.createUnstarted();
        }
    }

    /* loaded from: classes3.dex */
    public class f implements s {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k.a f20856a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ s f20857b;

        public f(k.a aVar, s sVar) {
            this.f20856a = aVar;
            this.f20857b = sVar;
        }

        @Override // z8.s
        public q b(y8.w0 w0Var, y8.v0 v0Var, y8.c cVar, y8.k[] kVarArr) {
            boolean z10;
            y8.k a10 = this.f20856a.a(k.b.a().b(cVar).a(), v0Var);
            if (kVarArr[kVarArr.length - 1] == q0.f20852t) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10, "lb tracer already assigned");
            kVarArr[kVarArr.length - 1] = a10;
            return this.f20857b.b(w0Var, v0Var, cVar, kVarArr);
        }

        @Override // y8.m0
        public y8.i0 d() {
            return this.f20857b.d();
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements j0.a {
        public g() {
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        @Override // y8.v0.j
        /* renamed from: c */
        public byte[] b(byte[] bArr) {
            return bArr;
        }

        @Override // y8.v0.j
        /* renamed from: d */
        public byte[] a(byte[] bArr) {
            return bArr;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum c uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes3.dex */
    public static final class h {

        /* renamed from: c  reason: collision with root package name */
        public static final h f20858c;

        /* renamed from: d  reason: collision with root package name */
        public static final h f20859d;

        /* renamed from: e  reason: collision with root package name */
        public static final h f20860e;

        /* renamed from: f  reason: collision with root package name */
        public static final h f20861f;

        /* renamed from: g  reason: collision with root package name */
        public static final h f20862g;

        /* renamed from: h  reason: collision with root package name */
        public static final h f20863h;

        /* renamed from: i  reason: collision with root package name */
        public static final h f20864i;

        /* renamed from: j  reason: collision with root package name */
        public static final h f20865j;

        /* renamed from: k  reason: collision with root package name */
        public static final h f20866k;

        /* renamed from: l  reason: collision with root package name */
        public static final h f20867l;

        /* renamed from: m  reason: collision with root package name */
        public static final h f20868m;

        /* renamed from: n  reason: collision with root package name */
        public static final h f20869n;

        /* renamed from: o  reason: collision with root package name */
        public static final h f20870o;

        /* renamed from: p  reason: collision with root package name */
        public static final h f20871p;

        /* renamed from: q  reason: collision with root package name */
        public static final h[] f20872q;

        /* renamed from: r  reason: collision with root package name */
        public static final /* synthetic */ h[] f20873r;

        /* renamed from: a  reason: collision with root package name */
        public final int f20874a;

        /* renamed from: b  reason: collision with root package name */
        public final y8.k1 f20875b;

        static {
            y8.k1 k1Var = y8.k1.f19904u;
            h hVar = new h("NO_ERROR", 0, 0, k1Var);
            f20858c = hVar;
            y8.k1 k1Var2 = y8.k1.f19903t;
            h hVar2 = new h("PROTOCOL_ERROR", 1, 1, k1Var2);
            f20859d = hVar2;
            h hVar3 = new h("INTERNAL_ERROR", 2, 2, k1Var2);
            f20860e = hVar3;
            h hVar4 = new h("FLOW_CONTROL_ERROR", 3, 3, k1Var2);
            f20861f = hVar4;
            h hVar5 = new h("SETTINGS_TIMEOUT", 4, 4, k1Var2);
            f20862g = hVar5;
            h hVar6 = new h("STREAM_CLOSED", 5, 5, k1Var2);
            f20863h = hVar6;
            h hVar7 = new h("FRAME_SIZE_ERROR", 6, 6, k1Var2);
            f20864i = hVar7;
            h hVar8 = new h("REFUSED_STREAM", 7, 7, k1Var);
            f20865j = hVar8;
            h hVar9 = new h("CANCEL", 8, 8, y8.k1.f19890g);
            f20866k = hVar9;
            h hVar10 = new h("COMPRESSION_ERROR", 9, 9, k1Var2);
            f20867l = hVar10;
            h hVar11 = new h("CONNECT_ERROR", 10, 10, k1Var2);
            f20868m = hVar11;
            h hVar12 = new h("ENHANCE_YOUR_CALM", 11, 11, y8.k1.f19898o.r("Bandwidth exhausted"));
            f20869n = hVar12;
            h hVar13 = new h("INADEQUATE_SECURITY", 12, 12, y8.k1.f19896m.r("Permission denied as protocol is not secure enough to call"));
            f20870o = hVar13;
            h hVar14 = new h("HTTP_1_1_REQUIRED", 13, 13, y8.k1.f19891h);
            f20871p = hVar14;
            f20873r = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14};
            f20872q = a();
        }

        public h(String str, int i10, int i11, y8.k1 k1Var) {
            this.f20874a = i11;
            String str2 = "HTTP/2 error code: " + name();
            if (k1Var.o() != null) {
                str2 = str2 + " (" + k1Var.o() + ")";
            }
            this.f20875b = k1Var.r(str2);
        }

        public static h[] a() {
            h[] values = values();
            h[] hVarArr = new h[((int) values[values.length - 1].b()) + 1];
            for (h hVar : values) {
                hVarArr[(int) hVar.b()] = hVar;
            }
            return hVarArr;
        }

        public static h c(long j10) {
            h[] hVarArr = f20872q;
            if (j10 < hVarArr.length && j10 >= 0) {
                return hVarArr[(int) j10];
            }
            return null;
        }

        public static y8.k1 e(long j10) {
            h c10 = c(j10);
            if (c10 == null) {
                y8.k1 i10 = y8.k1.i(f20860e.d().n().c());
                return i10.r("Unrecognized HTTP/2 error code: " + j10);
            }
            return c10.d();
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) f20873r.clone();
        }

        public long b() {
            return this.f20874a;
        }

        public y8.k1 d() {
            return this.f20875b;
        }
    }

    /* loaded from: classes3.dex */
    public static class i implements v0.d {
        @Override // y8.v0.d
        /* renamed from: c */
        public Long b(String str) {
            boolean z10;
            boolean z11;
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkArgument(z10, "empty timeout");
            if (str.length() <= 9) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkArgument(z11, "bad timeout format");
            long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
            char charAt = str.charAt(str.length() - 1);
            if (charAt != 'H') {
                if (charAt != 'M') {
                    if (charAt != 'S') {
                        if (charAt != 'u') {
                            if (charAt != 'm') {
                                if (charAt == 'n') {
                                    return Long.valueOf(parseLong);
                                }
                                throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(charAt)));
                            }
                            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
                        }
                        return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
                    }
                    return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
                }
                return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
            }
            return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
        }

        @Override // y8.v0.d
        /* renamed from: d */
        public String a(Long l10) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l10.longValue() >= 0) {
                if (l10.longValue() < 100000000) {
                    return l10 + "n";
                } else if (l10.longValue() < 100000000000L) {
                    return timeUnit.toMicros(l10.longValue()) + "u";
                } else if (l10.longValue() < 100000000000000L) {
                    return timeUnit.toMillis(l10.longValue()) + "m";
                } else if (l10.longValue() < 100000000000000000L) {
                    return timeUnit.toSeconds(l10.longValue()) + "S";
                } else if (l10.longValue() < 6000000000000000000L) {
                    return timeUnit.toMinutes(l10.longValue()) + "M";
                } else {
                    return timeUnit.toHours(l10.longValue()) + "H";
                }
            }
            throw new IllegalArgumentException("Timeout too small");
        }
    }

    static {
        v0.d dVar = y8.v0.f20029e;
        f20837e = v0.g.e("grpc-encoding", dVar);
        f20838f = y8.j0.b("grpc-accept-encoding", new g(null));
        f20839g = v0.g.e("content-encoding", dVar);
        f20840h = y8.j0.b("accept-encoding", new g(null));
        f20841i = v0.g.e("content-length", dVar);
        f20842j = v0.g.e("content-type", dVar);
        f20843k = v0.g.e("te", dVar);
        f20844l = v0.g.e("user-agent", dVar);
        f20845m = Splitter.on((char) ASCIIPropertyListParser.ARRAY_ITEM_DELIMITER_TOKEN).trimResults();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f20846n = timeUnit.toNanos(20L);
        f20847o = TimeUnit.HOURS.toNanos(2L);
        f20848p = timeUnit.toNanos(20L);
        f20849q = new s1();
        f20850r = new a();
        f20851s = c.C0345c.b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f20852t = new b();
        f20853u = new c();
        f20854v = new d();
        f20855w = new e();
    }

    public static URI b(String str) {
        Preconditions.checkNotNull(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException("Invalid authority: " + str, e10);
        }
    }

    public static String c(String str) {
        boolean z10;
        URI b10 = b(str);
        boolean z11 = true;
        if (b10.getHost() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "No host in authority '%s'", str);
        if (b10.getUserInfo() != null) {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    public static void d(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            f20833a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e10);
        }
    }

    public static void e(i2.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next != null) {
                d(next);
            } else {
                return;
            }
        }
    }

    public static y8.k[] f(y8.c cVar, y8.v0 v0Var, int i10, boolean z10) {
        List i11 = cVar.i();
        int size = i11.size() + 1;
        y8.k[] kVarArr = new y8.k[size];
        k.b a10 = k.b.a().b(cVar).d(i10).c(z10).a();
        for (int i12 = 0; i12 < i11.size(); i12++) {
            kVarArr[i12] = ((k.a) i11.get(i12)).a(a10, v0Var);
        }
        kVarArr[size - 1] = f20852t;
        return kVarArr;
    }

    public static String g(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append('/');
        sb.append("1.52.1");
        return sb.toString();
    }

    public static String h(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static ThreadFactory i(String str, boolean z10) {
        return new ThreadFactoryBuilder().setDaemon(z10).setNameFormat(str).build();
    }

    public static s j(o0.e eVar, boolean z10) {
        s sVar;
        o0.h c10 = eVar.c();
        if (c10 != null) {
            sVar = ((l2) c10.d()).a();
        } else {
            sVar = null;
        }
        if (sVar != null) {
            k.a b10 = eVar.b();
            if (b10 == null) {
                return sVar;
            }
            return new f(b10, sVar);
        }
        if (!eVar.a().p()) {
            if (eVar.d()) {
                return new g0(n(eVar.a()), r.a.DROPPED);
            }
            if (!z10) {
                return new g0(n(eVar.a()), r.a.PROCESSED);
            }
        }
        return null;
    }

    public static k1.b k(int i10) {
        if (i10 >= 100 && i10 < 200) {
            return k1.b.INTERNAL;
        }
        if (i10 != 400) {
            if (i10 != 401) {
                if (i10 != 403) {
                    if (i10 != 404) {
                        if (i10 != 429) {
                            if (i10 != 431) {
                                switch (i10) {
                                    case 502:
                                    case 503:
                                    case 504:
                                        break;
                                    default:
                                        return k1.b.UNKNOWN;
                                }
                            }
                        }
                        return k1.b.UNAVAILABLE;
                    }
                    return k1.b.UNIMPLEMENTED;
                }
                return k1.b.PERMISSION_DENIED;
            }
            return k1.b.UNAUTHENTICATED;
        }
        return k1.b.INTERNAL;
    }

    public static y8.k1 l(int i10) {
        y8.k1 b10 = k(i10).b();
        return b10.r("HTTP status code " + i10);
    }

    public static boolean m(String str) {
        char charAt;
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("application/grpc")) {
            return false;
        }
        if (lowerCase.length() != 16 && (charAt = lowerCase.charAt(16)) != '+' && charAt != ';') {
            return false;
        }
        return true;
    }

    public static y8.k1 n(y8.k1 k1Var) {
        boolean z10;
        if (k1Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10);
        if (f20834b.contains(k1Var.n())) {
            y8.k1 k1Var2 = y8.k1.f19903t;
            return k1Var2.r("Inappropriate status code from control plane: " + k1Var.n() + " " + k1Var.o()).q(k1Var.m());
        }
        return k1Var;
    }

    public static boolean o(y8.c cVar) {
        return !Boolean.TRUE.equals(cVar.h(f20851s));
    }
}
