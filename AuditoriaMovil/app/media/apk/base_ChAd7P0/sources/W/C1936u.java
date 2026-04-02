package w;

import D.C0057g;
import D.j0;
import D.y0;
import a.AbstractC0412a;
import a1.C0415A;
import a6.t0;
import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.AbstractC0508j;
import androidx.camera.core.impl.AbstractC0517t;
import androidx.camera.core.impl.C0497a;
import androidx.camera.core.impl.C0501c;
import androidx.camera.core.impl.C0505g;
import androidx.camera.core.impl.C0506h;
import androidx.camera.core.impl.EnumC0520w;
import androidx.camera.core.impl.InterfaceC0518u;
import androidx.camera.core.impl.InterfaceC0519v;
import androidx.camera.core.impl.InterfaceC0521x;
import androidx.camera.core.impl.n0;
import androidx.camera.core.impl.o0;
import androidx.camera.core.impl.w0;
import b3.C0585f;
import c1.RunnableC0626c;
import g1.C1006c;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p.C1608t;
import t4.RunnableC1822b;
import x.C1967a;
import z.AbstractC2038a;
/* renamed from: w.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1936u implements InterfaceC0521x {

    /* renamed from: A0  reason: collision with root package name */
    public final C1006c f16267A0;

    /* renamed from: B0  reason: collision with root package name */
    public final C1910U f16268B0;

    /* renamed from: C0  reason: collision with root package name */
    public final C1608t f16269C0;

    /* renamed from: X  reason: collision with root package name */
    public final C1608t f16270X;

    /* renamed from: Y  reason: collision with root package name */
    public final C1925j f16271Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C1935t f16272Z;

    /* renamed from: a  reason: collision with root package name */
    public final t0 f16273a;

    /* renamed from: b  reason: collision with root package name */
    public final x.p f16274b;

    /* renamed from: c  reason: collision with root package name */
    public final G.k f16275c;

    /* renamed from: d  reason: collision with root package name */
    public final G.e f16276d;

    /* renamed from: e  reason: collision with root package name */
    public volatile EnumC1934s f16277e = EnumC1934s.INITIALIZED;

    /* renamed from: e0  reason: collision with root package name */
    public final C1939x f16278e0;
    public final C0415A f;

    /* renamed from: f0  reason: collision with root package name */
    public CameraDevice f16279f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f16280g0;

    /* renamed from: h0  reason: collision with root package name */
    public C1903M f16281h0;

    /* renamed from: i0  reason: collision with root package name */
    public final LinkedHashMap f16282i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f16283j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C1932q f16284k0;

    /* renamed from: l0  reason: collision with root package name */
    public final B.a f16285l0;

    /* renamed from: m0  reason: collision with root package name */
    public final androidx.camera.core.impl.B f16286m0;

    /* renamed from: n0  reason: collision with root package name */
    public final boolean f16287n0;

    /* renamed from: o0  reason: collision with root package name */
    public final boolean f16288o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f16289p0;
    public boolean q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f16290r0;

    /* renamed from: s0  reason: collision with root package name */
    public C1908S f16291s0;

    /* renamed from: t0  reason: collision with root package name */
    public final M3.q f16292t0;

    /* renamed from: u0  reason: collision with root package name */
    public final C1908S f16293u0;

    /* renamed from: v0  reason: collision with root package name */
    public final HashSet f16294v0;

    /* renamed from: w0  reason: collision with root package name */
    public C5.i f16295w0;

    /* renamed from: x0  reason: collision with root package name */
    public final Object f16296x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f16297y0;

    /* renamed from: z0  reason: collision with root package name */
    public final C1904N f16298z0;

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, M3.q] */
    public C1936u(Context context, x.p pVar, String str, C1939x c1939x, B.a aVar, androidx.camera.core.impl.B b5, Executor executor, Handler handler, C1904N c1904n, long j) {
        C0415A c0415a = new C0415A(1);
        this.f = c0415a;
        this.f16280g0 = 0;
        new AtomicInteger(0);
        this.f16282i0 = new LinkedHashMap();
        this.f16283j0 = 0;
        this.f16289p0 = false;
        this.q0 = false;
        this.f16290r0 = true;
        this.f16294v0 = new HashSet();
        this.f16295w0 = AbstractC0517t.f7671a;
        this.f16296x0 = new Object();
        this.f16297y0 = false;
        this.f16269C0 = new C1608t(this);
        this.f16274b = pVar;
        this.f16285l0 = aVar;
        this.f16286m0 = b5;
        G.e eVar = new G.e(handler);
        this.f16276d = eVar;
        G.k kVar = new G.k(executor);
        this.f16275c = kVar;
        this.f16272Z = new C1935t(this, kVar, eVar, j);
        this.f16273a = new t0(str, 2);
        ((androidx.lifecycle.C) c0415a.f6744a).i(new A.c(EnumC0520w.CLOSED, 23));
        C1608t c1608t = new C1608t(b5);
        this.f16270X = c1608t;
        ?? obj = new Object();
        obj.f3254c = new Object();
        obj.f3255d = new LinkedHashSet();
        obj.f3256e = new LinkedHashSet();
        obj.f = new LinkedHashSet();
        obj.f3253b = new C1896F((M3.q) obj);
        obj.f3252a = kVar;
        this.f16292t0 = obj;
        this.f16298z0 = c1904n;
        try {
            x.j b7 = pVar.b(str);
            C1925j c1925j = new C1925j(b7, eVar, kVar, new C0585f(this, 18), c1939x.f16310i);
            this.f16271Y = c1925j;
            this.f16278e0 = c1939x;
            c1939x.l(c1925j);
            c1939x.f16309h.m((androidx.lifecycle.C) c1608t.f14881c);
            this.f16267A0 = C1006c.A(b7);
            this.f16281h0 = z();
            this.f16293u0 = new C1908S(kVar, eVar, handler, obj, c1939x.f16310i, AbstractC2038a.f16621a);
            this.f16287n0 = c1939x.f16310i.T(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.f16288o0 = c1939x.f16310i.T(LegacyCameraSurfaceCleanupQuirk.class);
            C1932q c1932q = new C1932q(this, str);
            this.f16284k0 = c1932q;
            C0415A c0415a2 = new C0415A(this);
            synchronized (b5.f7526b) {
                g0.c.g("Camera is already registered: " + this, !b5.f7529e.containsKey(this));
                b5.f7529e.put(this, new androidx.camera.core.impl.A(kVar, c0415a2, c1932q));
            }
            pVar.f16413a.n0(kVar, c1932q);
            this.f16268B0 = new C1910U(context, str, pVar, new e5.b(23));
        } catch (C1967a e7) {
            throw new Exception(e7);
        }
    }

    public static String v(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                return "UNKNOWN ERROR";
                            }
                            return "ERROR_CAMERA_SERVICE";
                        }
                        return "ERROR_CAMERA_DEVICE";
                    }
                    return "ERROR_CAMERA_DISABLED";
                }
                return "ERROR_MAX_CAMERAS_IN_USE";
            }
            return "ERROR_CAMERA_IN_USE";
        }
        return "ERROR_NONE";
    }

    public static String w(C1908S c1908s) {
        StringBuilder sb = new StringBuilder("MeteringRepeating");
        c1908s.getClass();
        sb.append(c1908s.hashCode());
        return sb.toString();
    }

    public static String x(y0 y0Var) {
        return y0Var.f() + y0Var.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [p4.P, java.lang.Object] */
    public final void A(boolean z7) {
        if (!z7) {
            this.f16272Z.f16266e.f6374b = -1L;
        }
        this.f16272Z.a();
        this.f16269C0.s();
        t("Opening camera.", null);
        E(EnumC1934s.OPENING);
        try {
            x.p pVar = this.f16274b;
            pVar.f16413a.l0(this.f16278e0.f16303a, this.f16275c, s());
        } catch (SecurityException e7) {
            t("Unable to open camera due to " + e7.getMessage(), null);
            E(EnumC1934s.REOPENING);
            this.f16272Z.b();
        } catch (C1967a e8) {
            t("Unable to open camera due to " + e8.getMessage(), null);
            if (e8.f16375a != 10001) {
                C1608t c1608t = this.f16269C0;
                if (((C1936u) c1608t.f14881c).f16277e != EnumC1934s.OPENING) {
                    ((C1936u) c1608t.f14881c).t("Don't need the onError timeout handler.", null);
                    return;
                }
                ((C1936u) c1608t.f14881c).t("Camera waiting for onError.", null);
                c1608t.s();
                ?? obj = new Object();
                obj.f15212c = c1608t;
                obj.f15211b = new AtomicBoolean(false);
                obj.f15210a = ((C1936u) c1608t.f14881c).f16276d.schedule(new RunnableC1933r(obj, 0), 2000L, TimeUnit.MILLISECONDS);
                c1608t.f14880b = obj;
                return;
            }
            F(EnumC1934s.INITIALIZED, new C0057g(7, e8), true);
        }
    }

    public final void B() {
        boolean z7;
        if (this.f16277e == EnumC1934s.OPENED) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.g(null, z7);
        n0 B7 = this.f16273a.B();
        if (B7.f7648k && B7.j) {
            if (!this.f16286m0.e(this.f16279f0.getId(), this.f16285l0.e(this.f16279f0.getId()))) {
                t("Unable to create capture session in camera operating mode = " + this.f16285l0.f223a, null);
                return;
            }
            HashMap hashMap = new HashMap();
            Collection<o0> C7 = this.f16273a.C();
            Collection D4 = this.f16273a.D();
            C0501c c0501c = AbstractC1909T.f16117a;
            ArrayList arrayList = new ArrayList(D4);
            Iterator it = C7.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o0 o0Var = (o0) it.next();
                androidx.camera.core.impl.Z z8 = o0Var.f7656g.f7536b;
                C0501c c0501c2 = AbstractC1909T.f16117a;
                if (z8.f7596a.containsKey(c0501c2) && o0Var.b().size() != 1) {
                    org.slf4j.helpers.i.t("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(o0Var.b().size())));
                    break;
                } else if (o0Var.f7656g.f7536b.f7596a.containsKey(c0501c2)) {
                    int i7 = 0;
                    for (o0 o0Var2 : C7) {
                        if (((androidx.camera.core.impl.y0) arrayList.get(i7)).f() == A0.METERING_REPEATING) {
                            g0.c.g("MeteringRepeating should contain a surface", !o0Var2.b().isEmpty());
                            hashMap.put((androidx.camera.core.impl.J) o0Var2.b().get(0), 1L);
                        } else if (o0Var2.f7656g.f7536b.f7596a.containsKey(c0501c2) && !o0Var2.b().isEmpty()) {
                            hashMap.put((androidx.camera.core.impl.J) o0Var2.b().get(0), (Long) o0Var2.f7656g.f7536b.G(c0501c2));
                        }
                        i7++;
                    }
                }
            }
            C1903M c1903m = this.f16281h0;
            synchronized (c1903m.f16079a) {
                c1903m.f16088l = hashMap;
            }
            C1903M c1903m2 = this.f16281h0;
            o0 b5 = B7.b();
            CameraDevice cameraDevice = this.f16279f0;
            cameraDevice.getClass();
            C1908S c1908s = this.f16293u0;
            E3.b m7 = c1903m2.m(b5, cameraDevice, new C1914Y((A.m) c1908s.f16116e, (A.m) c1908s.f, (M3.q) c1908s.f16115d, (G.k) c1908s.f16112a, (G.e) c1908s.f16113b, (Handler) c1908s.f16114c));
            m7.a(new H.h(0, m7, new C1931p(this, c1903m2, 1)), this.f16275c);
            return;
        }
        t("Unable to create capture session due to conflicting configurations", null);
    }

    public final void C() {
        if (this.f16291s0 != null) {
            StringBuilder sb = new StringBuilder("MeteringRepeating");
            this.f16291s0.getClass();
            sb.append(this.f16291s0.hashCode());
            String sb2 = sb.toString();
            t0 t0Var = this.f16273a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) t0Var.f7210c;
            if (linkedHashMap.containsKey(sb2)) {
                w0 w0Var = (w0) linkedHashMap.get(sb2);
                w0Var.f7681e = false;
                if (!w0Var.f) {
                    linkedHashMap.remove(sb2);
                }
            }
            StringBuilder sb3 = new StringBuilder("MeteringRepeating");
            this.f16291s0.getClass();
            sb3.append(this.f16291s0.hashCode());
            String sb4 = sb3.toString();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) t0Var.f7210c;
            if (linkedHashMap2.containsKey(sb4)) {
                w0 w0Var2 = (w0) linkedHashMap2.get(sb4);
                w0Var2.f = false;
                if (!w0Var2.f7681e) {
                    linkedHashMap2.remove(sb4);
                }
            }
            C1908S c1908s = this.f16291s0;
            c1908s.getClass();
            org.slf4j.helpers.i.l("MeteringRepeating", "MeteringRepeating clear!");
            D.t0 t0Var2 = (D.t0) c1908s.f16112a;
            if (t0Var2 != null) {
                t0Var2.a();
            }
            c1908s.f16112a = null;
            this.f16291s0 = null;
        }
    }

    public final void D() {
        boolean z7;
        o0 o0Var;
        if (this.f16281h0 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.g(null, z7);
        t("Resetting Capture Session", null);
        C1903M c1903m = this.f16281h0;
        synchronized (c1903m.f16079a) {
            o0Var = c1903m.f;
        }
        List e7 = c1903m.e();
        C1903M z8 = z();
        this.f16281h0 = z8;
        z8.o(o0Var);
        this.f16281h0.k(e7);
        if (this.f16277e.ordinal() != 8) {
            t("Skipping Capture Session state check due to current camera state: " + this.f16277e + " and previous session status: " + c1903m.i(), null);
        } else if (this.f16287n0 && c1903m.i()) {
            t("Close camera before creating new session", null);
            E(EnumC1934s.REOPENING_QUIRK);
        }
        if (this.f16288o0 && c1903m.i()) {
            t("ConfigAndClose is required when close the camera.", null);
            this.f16289p0 = true;
        }
        c1903m.a();
        E3.b n7 = c1903m.n();
        t("Releasing session in state " + this.f16277e.name(), null);
        this.f16282i0.put(c1903m, n7);
        n7.a(new H.h(0, n7, new C1931p(this, c1903m, 0)), j3.f.r());
    }

    public final void E(EnumC1934s enumC1934s) {
        F(enumC1934s, null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(w.EnumC1934s r10, D.C0057g r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1936u.F(w.s, D.g, boolean):void");
    }

    public final ArrayList G(ArrayList arrayList) {
        o0 o0Var;
        Size size;
        ArrayList F7;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            boolean z7 = this.f16290r0;
            String x7 = x(y0Var);
            Class<?> cls = y0Var.getClass();
            if (z7) {
                o0Var = y0Var.f809m;
            } else {
                o0Var = y0Var.f810n;
            }
            o0 o0Var2 = o0Var;
            androidx.camera.core.impl.y0 y0Var2 = y0Var.f;
            C0505g c0505g = y0Var.f804g;
            if (c0505g != null) {
                size = c0505g.f7621a;
            } else {
                size = null;
            }
            if (y0Var.b() == null) {
                F7 = null;
            } else {
                F7 = Q.d.F(y0Var);
            }
            arrayList2.add(new C1918c(x7, cls, o0Var2, y0Var2, size, c0505g, F7));
        }
        return arrayList2;
    }

    public final void H(ArrayList arrayList) {
        boolean z7;
        Size size;
        boolean isEmpty = this.f16273a.C().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            z7 = true;
            if (!it.hasNext()) {
                break;
            }
            C1918c c1918c = (C1918c) it.next();
            if (!this.f16273a.L(c1918c.f16178a)) {
                t0 t0Var = this.f16273a;
                String str = c1918c.f16178a;
                o0 o0Var = c1918c.f16180c;
                androidx.camera.core.impl.y0 y0Var = c1918c.f16181d;
                C0505g c0505g = c1918c.f;
                ArrayList arrayList3 = c1918c.f16183g;
                LinkedHashMap linkedHashMap = (LinkedHashMap) t0Var.f7210c;
                w0 w0Var = (w0) linkedHashMap.get(str);
                if (w0Var == null) {
                    w0Var = new w0(o0Var, y0Var, c0505g, arrayList3);
                    linkedHashMap.put(str, w0Var);
                }
                w0Var.f7681e = true;
                t0Var.Y(str, o0Var, y0Var, c0505g, arrayList3);
                arrayList2.add(c1918c.f16178a);
                if (c1918c.f16179b == j0.class && (size = c1918c.f16182e) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        t("Use cases [" + TextUtils.join(", ", arrayList2) + "] now ATTACHED", null);
        if (isEmpty) {
            this.f16271Y.k(true);
            C1925j c1925j = this.f16271Y;
            synchronized (c1925j.f16217c) {
                c1925j.f16225j0++;
            }
        }
        p();
        L();
        K();
        D();
        EnumC1934s enumC1934s = this.f16277e;
        EnumC1934s enumC1934s2 = EnumC1934s.OPENED;
        if (enumC1934s == enumC1934s2) {
            B();
        } else {
            int ordinal = this.f16277e.ordinal();
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    t("open() ignored due to being in state: " + this.f16277e, null);
                } else {
                    E(EnumC1934s.REOPENING);
                    if (!this.f16282i0.isEmpty() && !this.q0 && this.f16280g0 == 0) {
                        if (this.f16279f0 == null) {
                            z7 = false;
                        }
                        g0.c.g("Camera Device should be open if session close is not complete", z7);
                        E(enumC1934s2);
                        B();
                    }
                }
            } else {
                I(false);
            }
        }
        if (rational != null) {
            this.f16271Y.f16212X.getClass();
        }
    }

    public final void I(boolean z7) {
        t("Attempting to force open the camera.", null);
        if (!this.f16286m0.d(this)) {
            t("No cameras available. Waiting for available camera before opening camera.", null);
            E(EnumC1934s.PENDING_OPEN);
            return;
        }
        A(z7);
    }

    public final void J(boolean z7) {
        t("Attempting to open the camera.", null);
        if (this.f16284k0.f16258b && this.f16286m0.d(this)) {
            A(z7);
            return;
        }
        t("No cameras available. Waiting for available camera before opening camera.", null);
        E(EnumC1934s.PENDING_OPEN);
    }

    public final void K() {
        boolean z7;
        t0 t0Var = this.f16273a;
        t0Var.getClass();
        n0 n0Var = new n0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) t0Var.f7210c).entrySet()) {
            w0 w0Var = (w0) entry.getValue();
            if (w0Var.f && w0Var.f7681e) {
                n0Var.a(w0Var.f7677a);
                arrayList.add((String) entry.getKey());
            }
        }
        org.slf4j.helpers.i.l("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + ((String) t0Var.f7209b));
        if (n0Var.f7648k && n0Var.j) {
            z7 = true;
        } else {
            z7 = false;
        }
        C1925j c1925j = this.f16271Y;
        if (z7) {
            int i7 = n0Var.b().f7656g.f7537c;
            c1925j.f16231p0 = i7;
            c1925j.f16212X.f16106c = i7;
            c1925j.f16223h0.getClass();
            n0Var.a(c1925j.e());
            this.f16281h0.o(n0Var.b());
            return;
        }
        c1925j.f16231p0 = 1;
        c1925j.f16212X.f16106c = 1;
        c1925j.f16223h0.getClass();
        this.f16281h0.o(c1925j.e());
    }

    public final void L() {
        boolean z7 = false;
        for (androidx.camera.core.impl.y0 y0Var : this.f16273a.D()) {
            z7 |= y0Var.Y();
        }
        this.f16271Y.f16221f0.f5719a = z7;
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x, D.InterfaceC0065o
    public final InterfaceC0519v a() {
        return m();
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final void b(boolean z7) {
        this.f16275c.execute(new C.d(this, z7, 4));
    }

    @Override // D.x0
    public final void c(y0 y0Var) {
        o0 o0Var;
        ArrayList F7;
        y0Var.getClass();
        String x7 = x(y0Var);
        if (this.f16290r0) {
            o0Var = y0Var.f809m;
        } else {
            o0Var = y0Var.f810n;
        }
        o0 o0Var2 = o0Var;
        androidx.camera.core.impl.y0 y0Var2 = y0Var.f;
        C0505g c0505g = y0Var.f804g;
        if (y0Var.b() == null) {
            F7 = null;
        } else {
            F7 = Q.d.F(y0Var);
        }
        this.f16275c.execute(new RunnableC1929n(this, x7, o0Var2, y0Var2, c0505g, F7, 1));
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final boolean d() {
        if (((C1939x) a()).b() == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final void e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(G(arrayList2));
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            String x7 = x(y0Var);
            HashSet hashSet = this.f16294v0;
            if (hashSet.contains(x7)) {
                y0Var.t();
                hashSet.remove(x7);
            }
        }
        this.f16275c.execute(new RunnableC1927l(this, arrayList3, 0));
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final void f(C5.i iVar) {
        if (iVar == null) {
            iVar = AbstractC0517t.f7671a;
        }
        iVar.o0();
        this.f16295w0 = iVar;
        synchronized (this.f16296x0) {
        }
    }

    @Override // D.x0
    public final void g(y0 y0Var) {
        o0 o0Var;
        ArrayList F7;
        String x7 = x(y0Var);
        if (this.f16290r0) {
            o0Var = y0Var.f809m;
        } else {
            o0Var = y0Var.f810n;
        }
        o0 o0Var2 = o0Var;
        androidx.camera.core.impl.y0 y0Var2 = y0Var.f;
        C0505g c0505g = y0Var.f804g;
        if (y0Var.b() == null) {
            F7 = null;
        } else {
            F7 = Q.d.F(y0Var);
        }
        this.f16275c.execute(new RunnableC1929n(this, x7, o0Var2, y0Var2, c0505g, F7, 0));
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final void h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        C1925j c1925j = this.f16271Y;
        synchronized (c1925j.f16217c) {
            c1925j.f16225j0++;
        }
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            String x7 = x(y0Var);
            HashSet hashSet = this.f16294v0;
            if (!hashSet.contains(x7)) {
                hashSet.add(x7);
                y0Var.s();
                y0Var.q();
            }
        }
        try {
            this.f16275c.execute(new RunnableC1927l(this, new ArrayList(G(arrayList2)), 1));
        } catch (RejectedExecutionException e7) {
            t("Unable to attach use cases.", e7);
            c1925j.c();
        }
    }

    @Override // D.x0
    public final void i(y0 y0Var) {
        o0 o0Var;
        ArrayList F7;
        y0Var.getClass();
        if (this.f16290r0) {
            o0Var = y0Var.f809m;
        } else {
            o0Var = y0Var.f810n;
        }
        o0 o0Var2 = o0Var;
        androidx.camera.core.impl.y0 y0Var2 = y0Var.f;
        C0505g c0505g = y0Var.f804g;
        if (y0Var.b() == null) {
            F7 = null;
        } else {
            F7 = Q.d.F(y0Var);
        }
        this.f16275c.execute(new N.f(this, x(y0Var), o0Var2, y0Var2, c0505g, F7, 2));
    }

    @Override // D.x0
    public final void j(y0 y0Var) {
        y0Var.getClass();
        this.f16275c.execute(new RunnableC1822b(16, this, x(y0Var)));
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final /* synthetic */ boolean k() {
        return true;
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final void l(boolean z7) {
        this.f16290r0 = z7;
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final InterfaceC0519v m() {
        return this.f16278e0;
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final InterfaceC0518u n() {
        return this.f16271Y;
    }

    @Override // androidx.camera.core.impl.InterfaceC0521x
    public final androidx.camera.core.impl.r o() {
        return this.f16295w0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ff, code lost:
        r3 = (android.util.Size) r6.get(0);
     */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, w.S] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1936u.p():void");
    }

    public final void q() {
        boolean z7;
        ArrayList<androidx.camera.core.impl.E> arrayList;
        int intValue;
        if (this.f16277e != EnumC1934s.CLOSING && this.f16277e != EnumC1934s.RELEASING && (this.f16277e != EnumC1934s.REOPENING || this.f16280g0 == 0)) {
            z7 = false;
        } else {
            z7 = true;
        }
        g0.c.g("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f16277e + " (error: " + v(this.f16280g0) + ")", z7);
        D();
        C1903M c1903m = this.f16281h0;
        synchronized (c1903m.f16079a) {
            try {
                if (!c1903m.f16080b.isEmpty()) {
                    arrayList = new ArrayList(c1903m.f16080b);
                    c1903m.f16080b.clear();
                } else {
                    arrayList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            for (androidx.camera.core.impl.E e7 : arrayList) {
                for (AbstractC0508j abstractC0508j : e7.f7538d) {
                    Object obj = e7.f.f7674a.get("CAPTURE_CONFIG_ID_KEY");
                    if (obj == null) {
                        intValue = -1;
                    } else {
                        intValue = ((Integer) obj).intValue();
                    }
                    abstractC0508j.a(intValue);
                }
            }
        }
    }

    public final void r() {
        boolean z7;
        if (this.f16277e != EnumC1934s.RELEASING && this.f16277e != EnumC1934s.CLOSING) {
            z7 = false;
        } else {
            z7 = true;
        }
        g0.c.g(null, z7);
        g0.c.g(null, this.f16282i0.isEmpty());
        if (!this.f16289p0) {
            u();
        } else if (this.q0) {
            t("Ignored since configAndClose is processing", null);
        } else if (!this.f16284k0.f16258b) {
            this.f16289p0 = false;
            u();
            t("Ignore configAndClose and finish the close flow directly since camera is unavailable.", null);
        } else {
            t("Open camera to configAndClose", null);
            U.l s7 = AbstractC0412a.s(new C1928m(this, 0));
            this.q0 = true;
            s7.f5535b.a(new RunnableC0626c(this, 23), this.f16275c);
        }
    }

    public final CameraDevice.StateCallback s() {
        ArrayList arrayList = new ArrayList(this.f16273a.B().b().f7653c);
        arrayList.add((C1896F) this.f16292t0.f3253b);
        arrayList.add(this.f16272Z);
        return j3.f.g(arrayList);
    }

    public final void t(String str, Throwable th) {
        String i7 = io.flutter.plugins.pathprovider.b.i("{", toString(), "} ", str);
        String N7 = org.slf4j.helpers.i.N("Camera2CameraImpl");
        if (org.slf4j.helpers.i.E(3, N7)) {
            Log.d(N7, i7, th);
        }
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f16278e0.f16303a);
    }

    public final void u() {
        boolean z7;
        if (this.f16277e != EnumC1934s.RELEASING && this.f16277e != EnumC1934s.CLOSING) {
            z7 = false;
        } else {
            z7 = true;
        }
        g0.c.g(null, z7);
        g0.c.g(null, this.f16282i0.isEmpty());
        this.f16279f0 = null;
        if (this.f16277e == EnumC1934s.CLOSING) {
            E(EnumC1934s.INITIALIZED);
            return;
        }
        x.p pVar = this.f16274b;
        pVar.f16413a.w0(this.f16284k0);
        E(EnumC1934s.RELEASED);
    }

    public final boolean y() {
        int i7;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f16296x0) {
            try {
                if (this.f16285l0.f223a == 2) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
            } finally {
            }
        }
        t0 t0Var = this.f16273a;
        t0Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) t0Var.f7210c).entrySet()) {
            if (((w0) entry.getValue()).f7681e) {
                arrayList2.add((w0) entry.getValue());
            }
        }
        for (w0 w0Var : DesugarCollections.unmodifiableCollection(arrayList2)) {
            List list = w0Var.f7680d;
            if (list == null || list.get(0) != A0.METERING_REPEATING) {
                if (w0Var.f7679c != null && w0Var.f7680d != null) {
                    o0 o0Var = w0Var.f7677a;
                    androidx.camera.core.impl.y0 y0Var = w0Var.f7678b;
                    for (androidx.camera.core.impl.J j : o0Var.b()) {
                        C1910U c1910u = this.f16268B0;
                        int x7 = y0Var.x();
                        C0506h c8 = C0506h.c(i7, x7, j.f7554h, c1910u.i(x7));
                        int x8 = y0Var.x();
                        Size size = j.f7554h;
                        C0505g c0505g = w0Var.f7679c;
                        arrayList.add(new C0497a(c8, x8, size, c0505g.f7622b, w0Var.f7680d, c0505g.f7624d, y0Var.v()));
                    }
                } else {
                    org.slf4j.helpers.i.O("Camera2CameraImpl", "Invalid stream spec or capture types in " + w0Var);
                    return false;
                }
            }
        }
        this.f16291s0.getClass();
        HashMap hashMap = new HashMap();
        C1908S c1908s = this.f16291s0;
        hashMap.put((C1907Q) c1908s.f16114c, Collections.singletonList((Size) c1908s.f16115d));
        try {
            this.f16268B0.g(i7, arrayList, hashMap, false, false);
            t("Surface combination with metering repeating supported!", null);
            return true;
        } catch (IllegalArgumentException e7) {
            t("Surface combination with metering repeating  not supported!", e7);
            return false;
        }
    }

    public final C1903M z() {
        C1903M c1903m;
        synchronized (this.f16296x0) {
            c1903m = new C1903M(this.f16267A0, this.f16278e0.f16310i, false);
        }
        return c1903m;
    }
}
