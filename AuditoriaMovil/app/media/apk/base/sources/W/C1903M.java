package w;

import D.n0;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.AbstractC0508j;
import androidx.camera.core.impl.C0503e;
import androidx.camera.core.impl.InterfaceC0515q;
import androidx.camera.core.impl.o0;
import androidx.camera.core.impl.utils.SurfaceUtil;
import c1.RunnableC0626c;
import g1.C1006c;
import h3.AbstractC1079a;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p.C1608t;
import r3.AbstractC1740d;
import y.AbstractC2021a;
import y.C2028h;
import y.InterfaceC2022b;
/* renamed from: w.M  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1903M {

    /* renamed from: d  reason: collision with root package name */
    public C1914Y f16082d;

    /* renamed from: e  reason: collision with root package name */
    public C1914Y f16083e;
    public o0 f;

    /* renamed from: i  reason: collision with root package name */
    public EnumC1901K f16086i;
    public U.l j;

    /* renamed from: k  reason: collision with root package name */
    public U.i f16087k;

    /* renamed from: o  reason: collision with root package name */
    public final A.l f16091o;

    /* renamed from: p  reason: collision with root package name */
    public final C1006c f16092p;

    /* renamed from: q  reason: collision with root package name */
    public final A.a f16093q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f16094r;

    /* renamed from: a  reason: collision with root package name */
    public final Object f16079a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f16080b = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f16084g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public List f16085h = Collections.emptyList();

    /* renamed from: l  reason: collision with root package name */
    public HashMap f16088l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    public final A.n f16089m = new A.n(1);

    /* renamed from: n  reason: collision with root package name */
    public final A.n f16090n = new A.n(2);

    /* renamed from: c  reason: collision with root package name */
    public final C1902L f16081c = new C1902L(this);

    public C1903M(C1006c c1006c, A.m mVar, boolean z7) {
        this.f16086i = EnumC1901K.UNINITIALIZED;
        this.f16086i = EnumC1901K.INITIALIZED;
        this.f16092p = c1006c;
        this.f16091o = new A.l(mVar.T(CaptureNoResponseQuirk.class));
        this.f16093q = new A.a(mVar, 1);
        this.f16094r = z7;
    }

    public static C1940y b(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback c1940y;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0508j abstractC0508j = (AbstractC0508j) it.next();
            if (abstractC0508j == null) {
                c1940y = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                AbstractC1740d.z(abstractC0508j, arrayList2);
                if (arrayList2.size() == 1) {
                    c1940y = (CameraCaptureSession.CaptureCallback) arrayList2.get(0);
                } else {
                    c1940y = new C1940y(arrayList2);
                }
            }
            arrayList.add(c1940y);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new C1940y(arrayList);
    }

    public static HashMap c(HashMap hashMap, HashMap hashMap2) {
        HashMap hashMap3 = new HashMap();
        for (Integer num : hashMap.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) hashMap.get(num)).iterator();
            if (!it.hasNext()) {
                org.slf4j.helpers.i.t("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: 0, streamInfos size: " + arrayList.size());
            } else {
                SurfaceUtil.a((Surface) hashMap2.get(((C0503e) it.next()).f7616a));
                P0.h.j();
                throw null;
            }
        }
        return hashMap3;
    }

    public static ArrayList g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2028h c2028h = (C2028h) it.next();
            if (!arrayList2.contains(c2028h.f16578a.e())) {
                arrayList2.add(c2028h.f16578a.e());
                arrayList3.add(c2028h);
            }
        }
        return arrayList3;
    }

    public static HashMap h(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0503e c0503e = (C0503e) it.next();
            if (c0503e.f7619d > 0 && c0503e.f7617b.isEmpty()) {
                int i7 = c0503e.f7619d;
                List list = (List) hashMap.get(Integer.valueOf(i7));
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(Integer.valueOf(i7), list);
                }
                list.add(c0503e);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Integer num : hashMap.keySet()) {
            num.getClass();
            if (((List) hashMap.get(num)).size() >= 2) {
                hashMap2.put(num, (List) hashMap.get(num));
            }
        }
        return hashMap2;
    }

    public final void a() {
        synchronized (this.f16079a) {
            try {
                int ordinal = this.f16086i.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3 || ordinal == 4) {
                                C1914Y c1914y = this.f16082d;
                                g0.c.f(c1914y, "The Opener shouldn't null in state:" + this.f16086i);
                                this.f16082d.u();
                                this.f16086i = EnumC1901K.CLOSED;
                                this.f16091o.m();
                                this.f = null;
                            }
                        } else {
                            C1914Y c1914y2 = this.f16082d;
                            g0.c.f(c1914y2, "The Opener shouldn't null in state:" + this.f16086i);
                            this.f16082d.u();
                        }
                    }
                    this.f16086i = EnumC1901K.RELEASED;
                } else {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f16086i);
                }
            } finally {
            }
        }
    }

    public final void d() {
        EnumC1901K enumC1901K = this.f16086i;
        EnumC1901K enumC1901K2 = EnumC1901K.RELEASED;
        if (enumC1901K == enumC1901K2) {
            org.slf4j.helpers.i.l("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f16086i = enumC1901K2;
        this.f16083e = null;
        U.i iVar = this.f16087k;
        if (iVar != null) {
            iVar.a(null);
            this.f16087k = null;
        }
    }

    public final List e() {
        List unmodifiableList;
        synchronized (this.f16079a) {
            unmodifiableList = DesugarCollections.unmodifiableList(this.f16080b);
        }
        return unmodifiableList;
    }

    public final C2028h f(C0503e c0503e, HashMap hashMap, String str) {
        long j;
        Surface surface = (Surface) hashMap.get(c0503e.f7616a);
        g0.c.f(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        C2028h c2028h = new C2028h(c0503e.f7619d, surface);
        y.q qVar = c2028h.f16578a;
        if (str != null) {
            qVar.i(str);
        } else {
            qVar.i(null);
        }
        boolean z7 = true;
        int i7 = c0503e.f7618c;
        if (i7 == 0) {
            qVar.h(1);
        } else if (i7 == 1) {
            qVar.h(2);
        }
        List<androidx.camera.core.impl.J> list = c0503e.f7617b;
        if (!list.isEmpty()) {
            qVar.b();
            for (androidx.camera.core.impl.J j8 : list) {
                Surface surface2 = (Surface) hashMap.get(j8);
                g0.c.f(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                qVar.a(surface2);
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            C1006c c1006c = this.f16092p;
            c1006c.getClass();
            if (i8 < 33) {
                z7 = false;
            }
            g0.c.g("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", z7);
            DynamicRangeProfiles a7 = ((InterfaceC2022b) c1006c.f11091a).a();
            if (a7 != null) {
                D.D d7 = c0503e.f7620e;
                Long a8 = AbstractC2021a.a(d7, a7);
                if (a8 == null) {
                    org.slf4j.helpers.i.t("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + d7);
                } else {
                    j = a8.longValue();
                    qVar.g(j);
                    return c2028h;
                }
            }
        }
        j = 1;
        qVar.g(j);
        return c2028h;
    }

    public final boolean i() {
        boolean z7;
        synchronized (this.f16079a) {
            try {
                EnumC1901K enumC1901K = this.f16086i;
                if (enumC1901K != EnumC1901K.OPENED && enumC1901K != EnumC1901K.OPENING) {
                    z7 = false;
                }
                z7 = true;
            } finally {
            }
        }
        return z7;
    }

    public final void j(ArrayList arrayList) {
        A.k kVar;
        ArrayList arrayList2;
        boolean z7;
        InterfaceC0515q interfaceC0515q;
        synchronized (this.f16079a) {
            try {
                if (this.f16086i != EnumC1901K.OPENED) {
                    org.slf4j.helpers.i.l("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                } else if (!arrayList.isEmpty()) {
                    try {
                        kVar = new A.k(2);
                        arrayList2 = new ArrayList();
                        org.slf4j.helpers.i.l("CaptureSession", "Issuing capture request.");
                        Iterator it = arrayList.iterator();
                        z7 = false;
                        while (it.hasNext()) {
                            androidx.camera.core.impl.E e7 = (androidx.camera.core.impl.E) it.next();
                            if (DesugarCollections.unmodifiableList(e7.f7535a).isEmpty()) {
                                org.slf4j.helpers.i.l("CaptureSession", "Skipping issuing empty capture request.");
                            } else {
                                Iterator it2 = DesugarCollections.unmodifiableList(e7.f7535a).iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        androidx.camera.core.impl.J j = (androidx.camera.core.impl.J) it2.next();
                                        if (!this.f16084g.containsKey(j)) {
                                            org.slf4j.helpers.i.l("CaptureSession", "Skipping capture request with invalid surface: " + j);
                                            break;
                                        }
                                    } else {
                                        if (e7.f7537c == 2) {
                                            z7 = true;
                                        }
                                        n0 n0Var = new n0(e7);
                                        if (e7.f7537c == 5 && (interfaceC0515q = e7.f7540g) != null) {
                                            n0Var.f751X = interfaceC0515q;
                                        }
                                        o0 o0Var = this.f;
                                        if (o0Var != null) {
                                            n0Var.d(o0Var.f7656g.f7536b);
                                        }
                                        n0Var.d(e7.f7536b);
                                        androidx.camera.core.impl.E e8 = n0Var.e();
                                        C1914Y c1914y = this.f16083e;
                                        c1914y.f16152g.getClass();
                                        CaptureRequest c8 = AbstractC1079a.c(e8, ((CameraCaptureSession) ((C1608t) c1914y.f16152g.f11091a).f14880b).getDevice(), this.f16084g, false, this.f16093q);
                                        if (c8 == null) {
                                            org.slf4j.helpers.i.l("CaptureSession", "Skipping issuing request without surface.");
                                            return;
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        for (AbstractC0508j abstractC0508j : e7.f7538d) {
                                            AbstractC1740d.z(abstractC0508j, arrayList3);
                                        }
                                        kVar.a(c8, arrayList3);
                                        arrayList2.add(c8);
                                    }
                                }
                            }
                        }
                    } catch (CameraAccessException e9) {
                        org.slf4j.helpers.i.t("CaptureSession", "Unable to access camera: " + e9.getMessage());
                        Thread.dumpStack();
                    }
                    if (!arrayList2.isEmpty()) {
                        if (this.f16089m.e(arrayList2, z7)) {
                            C1914Y c1914y2 = this.f16083e;
                            g0.c.f(c1914y2.f16152g, "Need to call openCaptureSession before using this API.");
                            ((CameraCaptureSession) ((C1608t) c1914y2.f16152g.f11091a).f14880b).stopRepeating();
                            kVar.f22c = new C1900J(this);
                        }
                        if (this.f16090n.c(arrayList2, z7)) {
                            kVar.a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new C1940y(this)));
                        }
                        this.f16083e.i(arrayList2, kVar);
                        return;
                    }
                    org.slf4j.helpers.i.l("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(List list) {
        synchronized (this.f16079a) {
            try {
                switch (this.f16086i.ordinal()) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f16086i);
                    case 1:
                    case 2:
                    case 3:
                        this.f16080b.addAll(list);
                        break;
                    case 4:
                        this.f16080b.addAll(list);
                        this.f16091o.g().a(new RunnableC0626c(this, 26), j3.f.r());
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    public final void l(o0 o0Var) {
        synchronized (this.f16079a) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            if (o0Var == null) {
                org.slf4j.helpers.i.l("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
            } else if (this.f16086i != EnumC1901K.OPENED) {
                org.slf4j.helpers.i.l("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
            } else {
                androidx.camera.core.impl.E e7 = o0Var.f7656g;
                if (DesugarCollections.unmodifiableList(e7.f7535a).isEmpty()) {
                    org.slf4j.helpers.i.l("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                    try {
                        C1914Y c1914y = this.f16083e;
                        g0.c.f(c1914y.f16152g, "Need to call openCaptureSession before using this API.");
                        ((CameraCaptureSession) ((C1608t) c1914y.f16152g.f11091a).f14880b).stopRepeating();
                    } catch (CameraAccessException e8) {
                        org.slf4j.helpers.i.t("CaptureSession", "Unable to access camera: " + e8.getMessage());
                        Thread.dumpStack();
                    }
                    return;
                }
                try {
                    org.slf4j.helpers.i.l("CaptureSession", "Issuing request for session.");
                    C1914Y c1914y2 = this.f16083e;
                    c1914y2.f16152g.getClass();
                    CaptureRequest c8 = AbstractC1079a.c(e7, ((CameraCaptureSession) ((C1608t) c1914y2.f16152g.f11091a).f14880b).getDevice(), this.f16084g, true, this.f16093q);
                    if (c8 == null) {
                        org.slf4j.helpers.i.l("CaptureSession", "Skipping issuing empty request for session.");
                        return;
                    }
                    this.f16083e.r(c8, this.f16091o.d(b(e7.f7538d, new CameraCaptureSession.CaptureCallback[0])));
                    return;
                } catch (CameraAccessException e9) {
                    org.slf4j.helpers.i.t("CaptureSession", "Unable to access camera: " + e9.getMessage());
                    Thread.dumpStack();
                    return;
                }
                throw th;
            }
        }
    }

    public final E3.b m(o0 o0Var, CameraDevice cameraDevice, C1914Y c1914y) {
        synchronized (this.f16079a) {
            try {
                if (this.f16086i.ordinal() != 1) {
                    org.slf4j.helpers.i.t("CaptureSession", "Open not allowed in state: " + this.f16086i);
                    return new H.k(new IllegalStateException("open() should not allow the state: " + this.f16086i), 1);
                }
                this.f16086i = EnumC1901K.GET_SURFACE;
                ArrayList arrayList = new ArrayList(o0Var.b());
                this.f16085h = arrayList;
                this.f16082d = c1914y;
                H.d b5 = H.d.b(c1914y.s(arrayList));
                M.b bVar = new M.b(this, o0Var, cameraDevice, 6);
                G.k kVar = this.f16082d.f16150d;
                b5.getClass();
                H.b f = H.i.f(b5, bVar, kVar);
                C1006c c1006c = new C1006c(this);
                f.a(new H.h(0, f, c1006c), this.f16082d.f16150d);
                return H.i.d(f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0009, B:5:0x000f, B:23:0x0074, B:7:0x0013, B:9:0x0017, B:12:0x001d, B:14:0x0041, B:15:0x0045, B:17:0x0049, B:18:0x0054, B:19:0x0056, B:21:0x0058, B:22:0x0070, B:26:0x0078, B:27:0x008b), top: B:30:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0009, B:5:0x000f, B:23:0x0074, B:7:0x0013, B:9:0x0017, B:12:0x001d, B:14:0x0041, B:15:0x0045, B:17:0x0049, B:18:0x0054, B:19:0x0056, B:21:0x0058, B:22:0x0070, B:26:0x0078, B:27:0x008b), top: B:30:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final E3.b n() {
        /*
            r5 = this;
            java.lang.String r0 = "release() should not be possible in state: "
            java.lang.String r1 = "The Opener shouldn't null in state:"
            java.lang.String r2 = "The Opener shouldn't null in state:"
            java.lang.Object r3 = r5.f16079a
            monitor-enter(r3)
            w.K r4 = r5.f16086i     // Catch: java.lang.Throwable -> L1b
            int r4 = r4.ordinal()     // Catch: java.lang.Throwable -> L1b
            switch(r4) {
                case 0: goto L78;
                case 1: goto L70;
                case 2: goto L58;
                case 3: goto L1d;
                case 4: goto L13;
                case 5: goto L13;
                case 6: goto L45;
                default: goto L12;
            }     // Catch: java.lang.Throwable -> L1b
        L12:
            goto L74
        L13:
            w.Y r0 = r5.f16083e     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            r0.j()     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r0 = move-exception
            goto L8c
        L1d:
            w.K r0 = w.EnumC1901K.RELEASING     // Catch: java.lang.Throwable -> L1b
            r5.f16086i = r0     // Catch: java.lang.Throwable -> L1b
            A.l r0 = r5.f16091o     // Catch: java.lang.Throwable -> L1b
            r0.m()     // Catch: java.lang.Throwable -> L1b
            w.Y r0 = r5.f16082d     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            w.K r2 = r5.f16086i     // Catch: java.lang.Throwable -> L1b
            r1.append(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1b
            g0.c.f(r0, r1)     // Catch: java.lang.Throwable -> L1b
            w.Y r0 = r5.f16082d     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.u()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L45
            r5.d()     // Catch: java.lang.Throwable -> L1b
            goto L74
        L45:
            U.l r0 = r5.j     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L54
            w.J r0 = new w.J     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L1b
            U.l r0 = a.AbstractC0412a.s(r0)     // Catch: java.lang.Throwable -> L1b
            r5.j = r0     // Catch: java.lang.Throwable -> L1b
        L54:
            U.l r0 = r5.j     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            return r0
        L58:
            w.Y r0 = r5.f16082d     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            w.K r1 = r5.f16086i     // Catch: java.lang.Throwable -> L1b
            r2.append(r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L1b
            g0.c.f(r0, r1)     // Catch: java.lang.Throwable -> L1b
            w.Y r0 = r5.f16082d     // Catch: java.lang.Throwable -> L1b
            r0.u()     // Catch: java.lang.Throwable -> L1b
        L70:
            w.K r0 = w.EnumC1901K.RELEASED     // Catch: java.lang.Throwable -> L1b
            r5.f16086i = r0     // Catch: java.lang.Throwable -> L1b
        L74:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            H.k r0 = H.k.f1628c
            return r0
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            w.K r0 = r5.f16086i     // Catch: java.lang.Throwable -> L1b
            r2.append(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1     // Catch: java.lang.Throwable -> L1b
        L8c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1903M.n():E3.b");
    }

    public final void o(o0 o0Var) {
        synchronized (this.f16079a) {
            try {
                switch (this.f16086i.ordinal()) {
                    case 0:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f16086i);
                    case 1:
                    case 2:
                    case 3:
                        this.f = o0Var;
                        break;
                    case 4:
                        this.f = o0Var;
                        if (o0Var == null) {
                            return;
                        }
                        if (!this.f16084g.keySet().containsAll(o0Var.b())) {
                            org.slf4j.helpers.i.t("CaptureSession", "Does not have the proper configured lists");
                            return;
                        }
                        org.slf4j.helpers.i.l("CaptureSession", "Attempting to submit CaptureRequest after setting");
                        l(this.f);
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }
}
