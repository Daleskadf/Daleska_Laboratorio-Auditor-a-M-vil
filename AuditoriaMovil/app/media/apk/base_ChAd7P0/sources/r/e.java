package R;

import B5.AbstractActivityC0032e;
import C5.i;
import D.C;
import D.C0070u;
import D.C0075z;
import D.InterfaceC0069t;
import D.y0;
import F.f;
import F3.o;
import I.g;
import U.l;
import android.content.Context;
import android.os.Trace;
import androidx.camera.core.impl.AbstractC0517t;
import androidx.camera.core.impl.B;
import androidx.camera.core.impl.C0502d;
import androidx.camera.core.impl.InterfaceC0516s;
import androidx.camera.core.impl.InterfaceC0519v;
import androidx.camera.core.impl.InterfaceC0521x;
import androidx.camera.core.impl.K;
import androidx.camera.core.impl.h0;
import h3.AbstractC1079a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import m6.AbstractC1446g;
import m6.AbstractC1448i;
import p.C1608t;
import w.C1893C;
import w.C1926k;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: h  reason: collision with root package name */
    public static final e f4513h = new e();

    /* renamed from: b  reason: collision with root package name */
    public d f4515b;

    /* renamed from: c  reason: collision with root package name */
    public l f4516c;

    /* renamed from: e  reason: collision with root package name */
    public C0075z f4518e;
    public Context f;

    /* renamed from: a  reason: collision with root package name */
    public final Object f4514a = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final o f4517d = new o();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f4519g = new HashMap();

    public static final void a(e eVar, C c8) {
        boolean z7;
        eVar.getClass();
        Trace.beginSection(f.D("CX:configureInstanceInternal"));
        try {
            synchronized (eVar.f4514a) {
                if (eVar.f4515b == null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                g0.c.g("CameraX has already been configured. To use a different configuration, shutdown() must be called.", z7);
                eVar.f4515b = new d(c8);
            }
        } finally {
            Trace.endSection();
        }
    }

    public static final i b(e eVar, C0070u c0070u) {
        eVar.getClass();
        Iterator it = c0070u.f781a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            j.d(next, "cameraSelector.cameraFilterSet");
            InterfaceC0069t interfaceC0069t = (InterfaceC0069t) next;
            C0502d c0502d = InterfaceC0069t.f776a;
            if (!j.a(c0502d, c0502d)) {
                synchronized (K.f7556a) {
                    InterfaceC0516s interfaceC0516s = (InterfaceC0516s) K.f7557b.get(c0502d);
                }
                j.b(eVar.f);
            }
        }
        return AbstractC0517t.f7671a;
    }

    public static final void c(e eVar, int i7) {
        int i8;
        boolean z7;
        C0075z c0075z = eVar.f4518e;
        if (c0075z != null) {
            C1926k c1926k = c0075z.f;
            if (c1926k != null) {
                B.a aVar = c1926k.f16233b;
                if (i7 != aVar.f223a) {
                    Iterator it = ((ArrayList) aVar.f224b).iterator();
                    while (it.hasNext()) {
                        B b5 = (B) it.next();
                        int i9 = aVar.f223a;
                        synchronized (b5.f7526b) {
                            boolean z8 = true;
                            if (i7 == 2) {
                                i8 = 2;
                            } else {
                                i8 = 1;
                            }
                            b5.f7527c = i8;
                            if (i9 != 2 && i7 == 2) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (i9 != 2 || i7 == 2) {
                                z8 = false;
                            }
                            if (z7 || z8) {
                                b5.b();
                            }
                        }
                    }
                }
                if (aVar.f223a == 2 && i7 != 2) {
                    ((ArrayList) aVar.f225c).clear();
                }
                aVar.f223a = i7;
                return;
            }
            throw new IllegalStateException("CameraX not initialized yet.");
        }
    }

    public final b d(AbstractActivityC0032e lifecycleOwner, C0070u c0070u, y0... y0VarArr) {
        int i7;
        j.e(lifecycleOwner, "lifecycleOwner");
        Trace.beginSection(f.D("CX:bindToLifecycle"));
        try {
            C0075z c0075z = this.f4518e;
            if (c0075z == null) {
                i7 = 0;
            } else {
                C1926k c1926k = c0075z.f;
                if (c1926k != null) {
                    i7 = c1926k.f16233b.f223a;
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            if (i7 != 2) {
                c(this, 1);
                return e(lifecycleOwner, c0070u, (y0[]) Arrays.copyOf(y0VarArr, y0VarArr.length));
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
        } finally {
            Trace.endSection();
        }
    }

    public final b e(AbstractActivityC0032e lifecycleOwner, C0070u c0070u, y0... useCases) {
        b bVar;
        j.e(lifecycleOwner, "lifecycleOwner");
        j.e(useCases, "useCases");
        Trace.beginSection(f.D("CX:bindToLifecycle-internal"));
        try {
            AbstractC1079a.e();
            C0075z c0075z = this.f4518e;
            j.b(c0075z);
            InterfaceC0521x c8 = c0070u.c(c0075z.f813a.E());
            j.d(c8, "primaryCameraSelector.se…cameraRepository.cameras)");
            c8.l(true);
            h0 f = f(c0070u);
            o oVar = this.f4517d;
            I.a v6 = g.v(f, null);
            synchronized (oVar.f1178b) {
                bVar = (b) ((HashMap) oVar.f1179c).get(new a(lifecycleOwner, v6));
            }
            Collection m7 = this.f4517d.m();
            Iterator it = AbstractC1446g.O(useCases).iterator();
            while (it.hasNext()) {
                y0 y0Var = (y0) it.next();
                for (Object lifecycleCameras : m7) {
                    j.d(lifecycleCameras, "lifecycleCameras");
                    b bVar2 = (b) lifecycleCameras;
                    if (bVar2.q(y0Var) && !bVar2.equals(bVar)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{y0Var}, 1)));
                    }
                }
            }
            if (bVar == null) {
                o oVar2 = this.f4517d;
                C0075z c0075z2 = this.f4518e;
                j.b(c0075z2);
                C1926k c1926k = c0075z2.f;
                if (c1926k != null) {
                    B.a aVar = c1926k.f16233b;
                    C0075z c0075z3 = this.f4518e;
                    j.b(c0075z3);
                    C1608t c1608t = c0075z3.f818g;
                    if (c1608t != null) {
                        C0075z c0075z4 = this.f4518e;
                        j.b(c0075z4);
                        C1893C c1893c = c0075z4.f819h;
                        if (c1893c != null) {
                            bVar = oVar2.i(lifecycleOwner, new g(c8, null, f, null, aVar, c1608t, c1893c));
                        } else {
                            throw new IllegalStateException("CameraX not initialized yet.");
                        }
                    } else {
                        throw new IllegalStateException("CameraX not initialized yet.");
                    }
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            if (useCases.length != 0) {
                o oVar3 = this.f4517d;
                List L6 = AbstractC1448i.L(Arrays.copyOf(useCases, useCases.length));
                C0075z c0075z5 = this.f4518e;
                j.b(c0075z5);
                C1926k c1926k2 = c0075z5.f;
                if (c1926k2 != null) {
                    oVar3.b(bVar, L6, c1926k2.f16233b);
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            return bVar;
        } finally {
            Trace.endSection();
        }
    }

    public final h0 f(C0070u cameraSelector) {
        Object obj;
        j.e(cameraSelector, "cameraSelector");
        Trace.beginSection(f.D("CX:getCameraInfo"));
        try {
            C0075z c0075z = this.f4518e;
            j.b(c0075z);
            InterfaceC0519v m7 = cameraSelector.c(c0075z.f813a.E()).m();
            j.d(m7, "cameraSelector.select(mC…meras).cameraInfoInternal");
            i b5 = b(this, cameraSelector);
            I.a aVar = new I.a(m7.c(), (C0502d) b5.f593b);
            synchronized (this.f4514a) {
                obj = this.f4519g.get(aVar);
                if (obj == null) {
                    obj = new h0(m7, b5);
                    this.f4519g.put(aVar, obj);
                }
            }
            return (h0) obj;
        } finally {
            Trace.endSection();
        }
    }

    public final void g() {
        Trace.beginSection(f.D("CX:unbindAll"));
        try {
            AbstractC1079a.e();
            c(this, 0);
            this.f4517d.y();
        } finally {
            Trace.endSection();
        }
    }
}
