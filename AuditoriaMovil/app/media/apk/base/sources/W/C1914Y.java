package w;

import D.AbstractC0055e;
import a.AbstractC0412a;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import g1.C1006c;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p.C1608t;
/* renamed from: w.Y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1914Y extends AbstractC1911V {

    /* renamed from: b  reason: collision with root package name */
    public final M3.q f16148b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f16149c;

    /* renamed from: d  reason: collision with root package name */
    public final G.k f16150d;

    /* renamed from: e  reason: collision with root package name */
    public final G.e f16151e;
    public C1902L f;

    /* renamed from: g  reason: collision with root package name */
    public C1006c f16152g;

    /* renamed from: h  reason: collision with root package name */
    public U.l f16153h;

    /* renamed from: i  reason: collision with root package name */
    public U.i f16154i;
    public H.d j;

    /* renamed from: o  reason: collision with root package name */
    public final G.e f16159o;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f16161q;

    /* renamed from: r  reason: collision with root package name */
    public H.m f16162r;

    /* renamed from: s  reason: collision with root package name */
    public final A.d f16163s;

    /* renamed from: t  reason: collision with root package name */
    public final A4.c f16164t;

    /* renamed from: u  reason: collision with root package name */
    public final A.l f16165u;

    /* renamed from: v  reason: collision with root package name */
    public final A.n f16166v;

    /* renamed from: a  reason: collision with root package name */
    public final Object f16147a = new Object();

    /* renamed from: k  reason: collision with root package name */
    public List f16155k = null;

    /* renamed from: l  reason: collision with root package name */
    public boolean f16156l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f16157m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f16158n = false;

    /* renamed from: p  reason: collision with root package name */
    public final Object f16160p = new Object();

    /* renamed from: w  reason: collision with root package name */
    public final AtomicBoolean f16167w = new AtomicBoolean(false);

    /* JADX WARN: Type inference failed for: r2v2, types: [A.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [A.d, java.lang.Object] */
    public C1914Y(A.m mVar, A.m mVar2, M3.q qVar, G.k kVar, G.e eVar, Handler handler) {
        boolean z7 = false;
        this.f16148b = qVar;
        this.f16149c = handler;
        this.f16150d = kVar;
        this.f16151e = eVar;
        ?? obj = new Object();
        obj.f5a = mVar2.T(TextureViewIsClosedQuirk.class);
        obj.f6b = mVar.T(PreviewOrientationIncorrectQuirk.class);
        obj.f7c = mVar.T(ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.f16163s = obj;
        this.f16165u = new A.l((mVar.T(CaptureSessionStuckQuirk.class) || mVar.T(IncorrectCaptureStateQuirk.class)) ? true : true);
        this.f16164t = new A4.c(mVar2, 2);
        ?? obj2 = new Object();
        obj2.f29a = mVar2.T(Preview3AThreadCrashQuirk.class);
        this.f16166v = obj2;
        this.f16159o = eVar;
    }

    @Override // w.AbstractC1911V
    public final void a(C1914Y c1914y) {
        Objects.requireNonNull(this.f);
        this.f.a(c1914y);
    }

    @Override // w.AbstractC1911V
    public final void b(C1914Y c1914y) {
        Objects.requireNonNull(this.f);
        this.f.b(c1914y);
    }

    @Override // w.AbstractC1911V
    public final void c(C1914Y c1914y) {
        synchronized (this.f16160p) {
            this.f16163s.b(this.f16161q);
        }
        l("onClosed()");
        o(c1914y);
    }

    @Override // w.AbstractC1911V
    public final void d(C1914Y c1914y) {
        C1914Y c1914y2;
        Objects.requireNonNull(this.f);
        q();
        this.f16165u.m();
        M3.q qVar = this.f16148b;
        Iterator it = qVar.s().iterator();
        while (it.hasNext() && (c1914y2 = (C1914Y) it.next()) != this) {
            c1914y2.q();
            c1914y2.f16165u.m();
        }
        synchronized (qVar.f3254c) {
            ((LinkedHashSet) qVar.f).remove(this);
        }
        this.f.d(c1914y);
    }

    @Override // w.AbstractC1911V
    public final void e(C1914Y c1914y) {
        C1914Y c1914y2;
        C1914Y c1914y3;
        C1914Y c1914y4;
        l("Session onConfigured()");
        A4.c cVar = this.f16164t;
        ArrayList q2 = this.f16148b.q();
        ArrayList p7 = this.f16148b.p();
        if (((CaptureSessionOnClosedNotCalledQuirk) cVar.f218b) != null) {
            LinkedHashSet<C1914Y> linkedHashSet = new LinkedHashSet();
            Iterator it = q2.iterator();
            while (it.hasNext() && (c1914y4 = (C1914Y) it.next()) != c1914y) {
                linkedHashSet.add(c1914y4);
            }
            for (C1914Y c1914y5 : linkedHashSet) {
                c1914y5.getClass();
                c1914y5.d(c1914y5);
            }
        }
        Objects.requireNonNull(this.f);
        M3.q qVar = this.f16148b;
        synchronized (qVar.f3254c) {
            ((LinkedHashSet) qVar.f3255d).add(this);
            ((LinkedHashSet) qVar.f).remove(this);
        }
        Iterator it2 = qVar.s().iterator();
        while (it2.hasNext() && (c1914y3 = (C1914Y) it2.next()) != this) {
            c1914y3.q();
            c1914y3.f16165u.m();
        }
        this.f.e(c1914y);
        if (((CaptureSessionOnClosedNotCalledQuirk) cVar.f218b) != null) {
            LinkedHashSet<C1914Y> linkedHashSet2 = new LinkedHashSet();
            Iterator it3 = p7.iterator();
            while (it3.hasNext() && (c1914y2 = (C1914Y) it3.next()) != c1914y) {
                linkedHashSet2.add(c1914y2);
            }
            for (C1914Y c1914y6 : linkedHashSet2) {
                c1914y6.getClass();
                c1914y6.c(c1914y6);
            }
        }
    }

    @Override // w.AbstractC1911V
    public final void f(C1914Y c1914y) {
        Objects.requireNonNull(this.f);
        this.f.f(c1914y);
    }

    @Override // w.AbstractC1911V
    public final void g(C1914Y c1914y) {
        U.l lVar;
        synchronized (this.f16147a) {
            try {
                if (!this.f16158n) {
                    this.f16158n = true;
                    g0.c.f(this.f16153h, "Need to call openCaptureSession before using this API.");
                    lVar = this.f16153h;
                } else {
                    lVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (lVar != null) {
            lVar.f5535b.a(new RunnableC1912W(this, c1914y, 0), j3.f.r());
        }
    }

    @Override // w.AbstractC1911V
    public final void h(C1914Y c1914y, Surface surface) {
        Objects.requireNonNull(this.f);
        this.f.h(c1914y, surface);
    }

    public final int i(ArrayList arrayList, A.k kVar) {
        CameraCaptureSession.CaptureCallback d7 = this.f16165u.d(kVar);
        g0.c.f(this.f16152g, "Need to call openCaptureSession before using this API.");
        return ((C1608t) this.f16152g.f11091a).t(arrayList, this.f16150d, d7);
    }

    public final void j() {
        if (!this.f16167w.compareAndSet(false, true)) {
            l("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f16166v.f29a) {
            try {
                l("Call abortCaptures() before closing session.");
                g0.c.f(this.f16152g, "Need to call openCaptureSession before using this API.");
                ((CameraCaptureSession) ((C1608t) this.f16152g.f11091a).f14880b).abortCaptures();
            } catch (Exception e7) {
                l("Exception when calling abortCaptures()" + e7);
            }
        }
        l("Session call close()");
        this.f16165u.g().a(new RunnableC1913X(this, 1), this.f16150d);
    }

    public final void k(CameraCaptureSession cameraCaptureSession) {
        if (this.f16152g == null) {
            this.f16152g = new C1006c(cameraCaptureSession, this.f16149c);
        }
    }

    public final void l(String str) {
        org.slf4j.helpers.i.l("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    public final void m(List list) {
        synchronized (this.f16147a) {
            q();
            if (!list.isEmpty()) {
                int i7 = 0;
                do {
                    try {
                        ((androidx.camera.core.impl.J) list.get(i7)).d();
                        i7++;
                    } catch (androidx.camera.core.impl.I e7) {
                        for (int i8 = i7 - 1; i8 >= 0; i8--) {
                            ((androidx.camera.core.impl.J) list.get(i8)).b();
                        }
                        throw e7;
                    }
                } while (i7 < list.size());
                this.f16155k = list;
            } else {
                this.f16155k = list;
            }
        }
    }

    public final boolean n() {
        boolean z7;
        synchronized (this.f16147a) {
            if (this.f16153h != null) {
                z7 = true;
            } else {
                z7 = false;
            }
        }
        return z7;
    }

    public final void o(C1914Y c1914y) {
        U.l lVar;
        synchronized (this.f16147a) {
            try {
                if (!this.f16156l) {
                    this.f16156l = true;
                    g0.c.f(this.f16153h, "Need to call openCaptureSession before using this API.");
                    lVar = this.f16153h;
                } else {
                    lVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        q();
        this.f16165u.m();
        if (lVar != null) {
            lVar.f5535b.a(new RunnableC1912W(this, c1914y, 1), j3.f.r());
        }
    }

    public final E3.b p(CameraDevice cameraDevice, y.u uVar, List list) {
        E3.b d7;
        synchronized (this.f16160p) {
            try {
                ArrayList p7 = this.f16148b.p();
                ArrayList arrayList = new ArrayList();
                Iterator it = p7.iterator();
                while (it.hasNext()) {
                    C1914Y c1914y = (C1914Y) it.next();
                    arrayList.add(AbstractC0412a.s(new H.e(c1914y.f16165u.g(), c1914y.f16159o, 1500L)));
                }
                H.m mVar = new H.m(new ArrayList(arrayList), false, j3.f.r());
                this.f16162r = mVar;
                H.d b5 = H.d.b(mVar);
                W3.a aVar = new W3.a(this, cameraDevice, uVar, list);
                G.k kVar = this.f16150d;
                b5.getClass();
                d7 = H.i.d(H.i.f(b5, aVar, kVar));
            } catch (Throwable th) {
                throw th;
            }
        }
        return d7;
    }

    public final void q() {
        synchronized (this.f16147a) {
            try {
                List<androidx.camera.core.impl.J> list = this.f16155k;
                if (list != null) {
                    for (androidx.camera.core.impl.J j : list) {
                        j.b();
                    }
                    this.f16155k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int r(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback d7 = this.f16165u.d(captureCallback);
        g0.c.f(this.f16152g, "Need to call openCaptureSession before using this API.");
        return ((C1608t) this.f16152g.f11091a).q0(captureRequest, this.f16150d, d7);
    }

    public final E3.b s(ArrayList arrayList) {
        E3.b t7;
        synchronized (this.f16160p) {
            this.f16161q = arrayList;
            t7 = t(arrayList);
        }
        return t7;
    }

    public final E3.b t(ArrayList arrayList) {
        synchronized (this.f16147a) {
            try {
                if (this.f16157m) {
                    return new H.k(new CancellationException("Opener is disabled"), 1);
                }
                H.d b5 = H.d.b(AbstractC0055e.A(arrayList, this.f16150d, this.f16151e));
                A4.d dVar = new A4.d(27, this, arrayList);
                G.k kVar = this.f16150d;
                b5.getClass();
                H.b f = H.i.f(b5, dVar, kVar);
                this.j = f;
                return H.i.d(f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean u() {
        boolean v6;
        synchronized (this.f16160p) {
            try {
                if (n()) {
                    this.f16163s.b(this.f16161q);
                } else {
                    H.m mVar = this.f16162r;
                    if (mVar != null) {
                        mVar.cancel(true);
                    }
                }
                v6 = v();
            } catch (Throwable th) {
                throw th;
            }
        }
        return v6;
    }

    public final boolean v() {
        boolean z7;
        H.d dVar = null;
        try {
            synchronized (this.f16147a) {
                if (!this.f16157m) {
                    H.d dVar2 = this.j;
                    if (dVar2 != null) {
                        dVar = dVar2;
                    }
                    this.f16157m = true;
                }
                z7 = !n();
            }
            return z7;
        } finally {
            if (dVar != null) {
                dVar.cancel(true);
            }
        }
    }

    public final C1006c w() {
        this.f16152g.getClass();
        return this.f16152g;
    }
}
