package D;

import H4.e1;
import O0.C0244f;
import O0.C0250l;
import Q0.C0276m;
import a1.AbstractC0421G;
import a1.C0416B;
import a1.C0417C;
import a1.C0418D;
import a1.C0436m;
import a1.C0437n;
import android.net.Uri;
import e1.C0960z;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.utils.StringUtils;
import w4.InterfaceC1955a;
import w4.InterfaceC1956b;
/* renamed from: D.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0053c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f685a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f686b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f687c;

    public /* synthetic */ RunnableC0053c(int i7, Object obj, Object obj2) {
        this.f685a = i7;
        this.f686b = obj;
        this.f687c = obj2;
    }

    private final void a() {
        O0.h0 h0Var = (O0.h0) this.f687c;
        ((O0.N) this.f686b).getClass();
        try {
            synchronized (h0Var) {
            }
            h0Var.f3758a.b(h0Var.f3761d, h0Var.f3762e);
            h0Var.b(true);
        } catch (C0250l e7) {
            K0.a.o("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
            throw new RuntimeException(e7);
        }
    }

    private final void b() {
        C0276m c0276m = (C0276m) this.f686b;
        C0244f c0244f = (C0244f) this.f687c;
        c0276m.getClass();
        synchronized (c0244f) {
        }
        O0.E e7 = c0276m.f4297c;
        int i7 = K0.x.f2529a;
        P0.d dVar = e7.f3482a.f3529m0;
        dVar.J(dVar.G((C0960z) dVar.f3909d.f), 1013, new P0.b(3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [M0.x] */
    /* JADX WARN: Type inference failed for: r2v26, types: [R0.a, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, a1.A] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.io.IOException] */
    private final void c() {
        boolean z7;
        boolean z8;
        String str;
        boolean z9;
        C0417C a7;
        A3.e0 s7;
        R0.a aVar;
        ?? r13 = (M0.x) this.f686b;
        A3.K k2 = (A3.K) this.f687c;
        C0436m c0436m = (C0436m) r13.f3211c;
        c0436m.getClass();
        Pattern pattern = a1.z.f6925a;
        if (a1.z.f6926b.matcher((CharSequence) k2.get(0)).matches()) {
            Matcher matcher = a1.z.f6926b.matcher((CharSequence) k2.get(0));
            K0.a.e(matcher.matches());
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            int indexOf = k2.indexOf(StringUtils.EMPTY);
            if (indexOf > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            K0.a.e(z9);
            List subList = k2.subList(1, indexOf);
            A4.c cVar = new A4.c(29);
            cVar.c(subList);
            A3.N n7 = new A3.N(parseInt, new C0437n(cVar), new K6.w(a1.z.f6931h, 1).b(k2.subList(indexOf + 1, k2.size())));
            C0437n c0437n = (C0437n) n7.f105c;
            String c8 = c0437n.c("CSeq");
            K0.a.h(c8);
            int parseInt2 = Integer.parseInt(c8);
            C0416B c0416b = (C0416B) C0436m.d(c0436m).get(parseInt2);
            if (c0416b != null) {
                C0436m.d(c0436m).remove(parseInt2);
                int i7 = n7.f104b;
                int i8 = c0416b.f6746b;
                try {
                    try {
                        if (i7 != 200) {
                            if (i7 != 401) {
                                if (i7 != 461) {
                                    if (i7 != 301 && i7 != 302) {
                                        C0436m.c(c0436m, new R0.a(a1.z.h(i8) + StringUtils.SPACE + i7));
                                        return;
                                    }
                                    if (c0436m.f6862j0 != -1) {
                                        c0436m.f6862j0 = 0;
                                    }
                                    String c9 = c0437n.c(HttpHeaders.LOCATION);
                                    if (c9 == null) {
                                        c0436m.f6852a.s0("Redirection without new location.", null);
                                        return;
                                    }
                                    Uri parse = Uri.parse(c9);
                                    c0436m.f6850Y = a1.z.f(parse);
                                    c0436m.f6857e0 = a1.z.d(parse);
                                    C0436m.a(c0436m).q(C0436m.b(c0436m), c0436m.f6858f0);
                                    return;
                                }
                                String str2 = a1.z.h(i8) + StringUtils.SPACE + i7;
                                String c10 = c0416b.f6747c.c("Transport");
                                K0.a.h(c10);
                                if (i8 == 10 && !c10.contains("TCP")) {
                                    aVar = new IOException(str2);
                                } else {
                                    aVar = new R0.a(str2);
                                }
                                C0436m.c(c0436m, aVar);
                                return;
                            } else if (c0436m.f6857e0 != null && !c0436m.f6864l0) {
                                c0437n.getClass();
                                A3.K d7 = c0437n.f6867a.d(C0437n.b("WWW-Authenticate"));
                                if (!d7.isEmpty()) {
                                    for (int i9 = 0; i9 < d7.size(); i9++) {
                                        c0436m.f6861i0 = a1.z.e((String) d7.get(i9));
                                        if (c0436m.f6861i0.f2502a == 2) {
                                            break;
                                        }
                                    }
                                    C0436m.a(c0436m).o();
                                    c0436m.f6864l0 = true;
                                    return;
                                }
                                throw H0.J.b("Missing WWW-Authenticate header in a 401 response.", null);
                            } else {
                                C0436m.c(c0436m, new R0.a(a1.z.h(i8) + StringUtils.SPACE + i7));
                                return;
                            }
                        }
                        switch (i8) {
                            case 1:
                            case 3:
                            case 7:
                            case 8:
                            case 9:
                            case 11:
                            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                                return;
                            case 2:
                                r13.F(new M0.x(c0437n, AbstractC0421G.a((String) n7.f106d), 23, false));
                                return;
                            case 4:
                                A3.e0 b5 = a1.z.b(c0437n.c("Public"));
                                ?? obj = new Object();
                                obj.f6744a = A3.K.p(b5);
                                r13.G(obj);
                                return;
                            case 5:
                                r13.I();
                                return;
                            case 6:
                                String c11 = c0437n.c("Range");
                                if (c11 == null) {
                                    a7 = C0417C.f6749c;
                                } else {
                                    a7 = C0417C.a(c11);
                                }
                                try {
                                    String c12 = c0437n.c("RTP-Info");
                                    if (c12 == null) {
                                        s7 = A3.K.s();
                                    } else {
                                        s7 = C0418D.a(C0436m.b(c0436m), c12);
                                    }
                                } catch (H0.J unused) {
                                    s7 = A3.K.s();
                                }
                                r13.J(new M0.x(a7, s7));
                                return;
                            case 10:
                                String c13 = c0437n.c("Session");
                                String c14 = c0437n.c("Transport");
                                if (c13 != null && c14 != null) {
                                    r13.K(new C5.i(a1.z.c(c13), 27));
                                    return;
                                }
                                throw H0.J.b("Missing mandatory session or transport header", null);
                            default:
                                throw new IllegalStateException();
                        }
                    } catch (IllegalArgumentException e7) {
                        e = e7;
                        C0436m.c(c0436m, new IOException(e));
                        return;
                    }
                } catch (H0.J e8) {
                    e = e8;
                    C0436m.c(c0436m, new IOException(e));
                    return;
                }
            }
            return;
        }
        Matcher matcher2 = a1.z.f6925a.matcher((CharSequence) k2.get(0));
        K0.a.e(matcher2.matches());
        String group2 = matcher2.group(1);
        group2.getClass();
        a1.z.a(group2);
        String group3 = matcher2.group(2);
        group3.getClass();
        Uri.parse(group3);
        int indexOf2 = k2.indexOf(StringUtils.EMPTY);
        if (indexOf2 > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        List subList2 = k2.subList(1, indexOf2);
        A4.c cVar2 = new A4.c(29);
        cVar2.c(subList2);
        C0437n p7 = cVar2.p();
        new K6.w(a1.z.f6931h, 1).b(k2.subList(indexOf2 + 1, k2.size()));
        String c15 = p7.c("CSeq");
        c15.getClass();
        int parseInt3 = Integer.parseInt(c15);
        A3.N n8 = c0436m.f6849X;
        C0436m c0436m2 = (C0436m) n8.f106d;
        A3.N n9 = new A3.N(405, new A4.c(c0436m2.f6854c, c0436m2.f6858f0, parseInt3).p(), StringUtils.EMPTY);
        C0437n c0437n2 = (C0437n) n9.f105c;
        if (c0437n2.c("CSeq") != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        K0.a.e(z8);
        A3.H h8 = new A3.H();
        int i10 = n9.f104b;
        Integer valueOf = Integer.valueOf(i10);
        if (i10 != 200) {
            if (i10 != 461) {
                if (i10 != 500) {
                    if (i10 != 505) {
                        if (i10 != 301) {
                            if (i10 != 302) {
                                if (i10 != 400) {
                                    if (i10 != 401) {
                                        if (i10 != 404) {
                                            if (i10 != 405) {
                                                switch (i10) {
                                                    case 454:
                                                        str = "Session Not Found";
                                                        break;
                                                    case 455:
                                                        str = "Method Not Valid In This State";
                                                        break;
                                                    case 456:
                                                        str = "Header Field Not Valid";
                                                        break;
                                                    case 457:
                                                        str = "Invalid Range";
                                                        break;
                                                    default:
                                                        throw new IllegalArgumentException();
                                                }
                                            } else {
                                                str = "Method Not Allowed";
                                            }
                                        } else {
                                            str = "Not Found";
                                        }
                                    } else {
                                        str = "Unauthorized";
                                    }
                                } else {
                                    str = "Bad Request";
                                }
                            } else {
                                str = "Move Temporarily";
                            }
                        } else {
                            str = "Move Permanently";
                        }
                    } else {
                        str = "RTSP Version Not Supported";
                    }
                } else {
                    str = "Internal Server Error";
                }
            } else {
                str = "Unsupported Transport";
            }
        } else {
            str = "OK";
        }
        h8.c(K0.x.o("%s %s %s", "RTSP/1.0", valueOf, str));
        A3.L a8 = c0437n2.a();
        A3.t0 it = a8.e().iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            A3.K d8 = a8.d(str3);
            for (int i11 = 0; i11 < d8.size(); i11++) {
                h8.c(K0.x.o("%s: %s", str3, d8.get(i11)));
            }
        }
        h8.c(StringUtils.EMPTY);
        h8.c((String) n9.f106d);
        c0436m2.f6851Z.b(h8.g());
        n8.f104b = Math.max(n8.f104b, parseInt3 + 1);
    }

    private final void d() {
        androidx.camera.core.impl.J j = (androidx.camera.core.impl.J) this.f686b;
        String str = (String) this.f687c;
        j.getClass();
        try {
            j.f7552e.get();
            j.e(androidx.camera.core.impl.J.f7547n.decrementAndGet(), androidx.camera.core.impl.J.f7546m.get(), "Surface terminated");
        } catch (Exception e7) {
            org.slf4j.helpers.i.t("DeferrableSurface", "Unexpected surface termination for " + j + "\nStack Trace:\n" + str);
            synchronized (j.f7548a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", j, Boolean.valueOf(j.f7550c), Integer.valueOf(j.f7549b)), e7);
            }
        }
    }

    private final void e() {
        InterfaceC1955a interfaceC1955a;
        c4.p pVar = (c4.p) this.f686b;
        InterfaceC1956b interfaceC1956b = (InterfaceC1956b) this.f687c;
        if (pVar.f8411b == c4.p.f8409d) {
            synchronized (pVar) {
                interfaceC1955a = pVar.f8410a;
                pVar.f8410a = null;
                pVar.f8411b = interfaceC1956b;
            }
            interfaceC1955a.f(interfaceC1956b);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void f() {
        c4.o oVar = (c4.o) this.f686b;
        InterfaceC1956b interfaceC1956b = (InterfaceC1956b) this.f687c;
        synchronized (oVar) {
            try {
                if (oVar.f8407b == null) {
                    oVar.f8406a.add(interfaceC1956b);
                } else {
                    oVar.f8407b.add(interfaceC1956b.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00fb -> B:39:0x00ed). Please submit an issue!!! */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.RunnableC0053c.run():void");
    }

    public /* synthetic */ RunnableC0053c(a1.x xVar, byte[] bArr, A3.e0 e0Var) {
        this.f685a = 25;
        this.f686b = xVar;
        this.f687c = bArr;
    }
}
