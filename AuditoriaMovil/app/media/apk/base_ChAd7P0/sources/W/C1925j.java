package w;

import D.n0;
import a.AbstractC0412a;
import a6.t0;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Size;
import androidx.camera.core.impl.C0501c;
import androidx.camera.core.impl.InterfaceC0515q;
import androidx.camera.core.impl.InterfaceC0518u;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.o0;
import androidx.camera.core.impl.u0;
import androidx.camera.core.impl.w0;
import androidx.camera.core.impl.y0;
import b3.C0585f;
import e0.C0927b;
import f5.C0993a;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import v.C1878a;
/* renamed from: w.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1925j implements InterfaceC0518u {

    /* renamed from: X  reason: collision with root package name */
    public final C1905O f16212X;

    /* renamed from: Y  reason: collision with root package name */
    public final Q0.A f16213Y;

    /* renamed from: Z  reason: collision with root package name */
    public final c0 f16214Z;

    /* renamed from: a  reason: collision with root package name */
    public final A.k f16215a;

    /* renamed from: b  reason: collision with root package name */
    public final G.k f16216b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f16217c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final x.j f16218d;

    /* renamed from: e  reason: collision with root package name */
    public final C0585f f16219e;

    /* renamed from: e0  reason: collision with root package name */
    public final A.l f16220e0;
    public final j0 f;

    /* renamed from: f0  reason: collision with root package name */
    public final U2.b f16221f0;

    /* renamed from: g0  reason: collision with root package name */
    public final C.e f16222g0;

    /* renamed from: h0  reason: collision with root package name */
    public final C0993a f16223h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C0585f f16224i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f16225j0;

    /* renamed from: k0  reason: collision with root package name */
    public volatile boolean f16226k0;

    /* renamed from: l0  reason: collision with root package name */
    public volatile int f16227l0;

    /* renamed from: m0  reason: collision with root package name */
    public final A4.c f16228m0;

    /* renamed from: n0  reason: collision with root package name */
    public final A.a f16229n0;

    /* renamed from: o0  reason: collision with root package name */
    public final AtomicLong f16230o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f16231p0;
    public long q0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.camera.core.impl.i0, androidx.camera.core.impl.j0] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, A.l] */
    /* JADX WARN: Type inference failed for: r1v4, types: [w.h, androidx.camera.core.impl.j, java.lang.Object] */
    public C1925j(x.j jVar, G.e eVar, G.k kVar, C0585f c0585f, A.m mVar) {
        ?? i0Var = new i0();
        this.f = i0Var;
        this.f16225j0 = 0;
        this.f16226k0 = false;
        this.f16227l0 = 2;
        this.f16230o0 = new AtomicLong(0L);
        this.f16231p0 = 1;
        this.q0 = 0L;
        ?? obj = new Object();
        obj.f16206a = new HashSet();
        obj.f16207b = new ArrayMap();
        this.f16218d = jVar;
        this.f16219e = c0585f;
        this.f16216b = kVar;
        this.f16224i0 = new C0585f(kVar);
        A.k kVar2 = new A.k(kVar);
        this.f16215a = kVar2;
        i0Var.f7639b.f752a = this.f16231p0;
        i0Var.f7639b.b(new C1899I(kVar2));
        i0Var.f7639b.b(obj);
        ?? obj2 = new Object();
        obj2.f25a = false;
        obj2.f26b = new C0927b(17);
        this.f16220e0 = obj2;
        this.f16212X = new C1905O(this, eVar, kVar);
        this.f16213Y = new Q0.A(this, jVar, kVar);
        this.f16214Z = new c0(this, jVar, kVar);
        this.f16221f0 = new U2.b(jVar);
        this.f16228m0 = new A4.c(mVar, 1);
        this.f16229n0 = new A.a(mVar, 0);
        this.f16222g0 = new C.e(this, kVar);
        this.f16223h0 = new C0993a(this, jVar, mVar, kVar, eVar);
    }

    public static int f(x.j jVar, int i7) {
        int[] iArr = (int[]) jVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (h(iArr, i7)) {
            return i7;
        }
        if (!h(iArr, 1)) {
            return 0;
        }
        return 1;
    }

    public static boolean h(int[] iArr, int i7) {
        for (int i8 : iArr) {
            if (i7 == i8) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public final E3.b B(boolean z7) {
        E3.b s7;
        if (!g()) {
            return new H.k(new Exception("Camera is not active."), 1);
        }
        c0 c0Var = this.f16214Z;
        if (!c0Var.f16186c) {
            org.slf4j.helpers.i.l("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            s7 = new H.k(new IllegalStateException("No flash unit"), 1);
        } else {
            c0.a(c0Var.f16185b, Integer.valueOf(z7 ? 1 : 0));
            s7 = AbstractC0412a.s(new X3.c(c0Var, z7));
        }
        return H.i.d(s7);
    }

    public final void a(InterfaceC1924i interfaceC1924i) {
        ((HashSet) this.f16215a.f21b).add(interfaceC1924i);
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public final androidx.camera.core.impl.G b() {
        A.m mVar;
        C.e eVar = this.f16222g0;
        synchronized (eVar.f) {
            D.J j = (D.J) eVar.f424g;
            j.getClass();
            mVar = new A.m(androidx.camera.core.impl.Z.a(j.f620b), 2);
        }
        return mVar;
    }

    public final void c() {
        synchronized (this.f16217c) {
            try {
                int i7 = this.f16225j0;
                if (i7 != 0) {
                    this.f16225j0 = i7 - 1;
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(boolean z7) {
        this.f16226k0 = z7;
        if (!z7) {
            n0 n0Var = new n0();
            n0Var.f752a = this.f16231p0;
            n0Var.f753b = true;
            androidx.camera.core.impl.W b5 = androidx.camera.core.impl.W.b();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            b5.j(C1878a.o0(key), Integer.valueOf(f(this.f16218d, 1)));
            b5.j(C1878a.o0(CaptureRequest.FLASH_MODE), 0);
            n0Var.d(new A.m(androidx.camera.core.impl.Z.a(b5), 2));
            n(Collections.singletonList(n0Var.e()));
        }
        o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (h(r8, 1) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
        if (r4 != 2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.camera.core.impl.o0 e() {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1925j.e():androidx.camera.core.impl.o0");
    }

    public final boolean g() {
        int i7;
        synchronized (this.f16217c) {
            i7 = this.f16225j0;
        }
        if (i7 > 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public final E3.b i(float f) {
        E3.b kVar;
        I.b e7;
        if (!g()) {
            return new H.k(new Exception("Camera is not active."), 1);
        }
        Q0.A a7 = this.f16213Y;
        synchronized (((h0) a7.f4139e)) {
            try {
                ((h0) a7.f4139e).e(f);
                e7 = I.b.e((h0) a7.f4139e);
            } catch (IllegalArgumentException e8) {
                kVar = new H.k(e8, 1);
            }
        }
        a7.i(e7);
        kVar = AbstractC0412a.s(new d0(a7, e7, 1));
        return H.i.d(kVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public final void j() {
        C.e eVar = this.f16222g0;
        synchronized (eVar.f) {
            eVar.f424g = new D.J(2);
        }
        H.i.d(AbstractC0412a.s(new C.c(eVar, 1))).a(new org.apache.tika.parser.a(2), j3.f.r());
    }

    public final void k(boolean z7) {
        I.b e7;
        org.slf4j.helpers.i.l("Camera2CameraControlImp", "setActive: isActive = " + z7);
        C1905O c1905o = this.f16212X;
        if (z7 != c1905o.f16105b) {
            c1905o.f16105b = z7;
            if (!c1905o.f16105b) {
                C1925j c1925j = c1905o.f16104a;
                ((HashSet) c1925j.f16215a.f21b).remove(null);
                ((HashSet) c1925j.f16215a.f21b).remove(null);
                if (c1905o.f16107d.length > 0 && c1905o.f16105b) {
                    n0 n0Var = new n0();
                    n0Var.f753b = true;
                    n0Var.f752a = c1905o.f16106c;
                    androidx.camera.core.impl.W b5 = androidx.camera.core.impl.W.b();
                    b5.j(C1878a.o0(CaptureRequest.CONTROL_AF_TRIGGER), 2);
                    n0Var.d(new A.m(androidx.camera.core.impl.Z.a(b5), 2));
                    c1905o.f16104a.n(Collections.singletonList(n0Var.e()));
                }
                MeteringRectangle[] meteringRectangleArr = C1905O.f16103h;
                c1905o.f16107d = meteringRectangleArr;
                c1905o.f16108e = meteringRectangleArr;
                c1905o.f = meteringRectangleArr;
                c1925j.o();
            }
        }
        Q0.A a7 = this.f16213Y;
        if (a7.f4136b != z7) {
            a7.f4136b = z7;
            if (!z7) {
                synchronized (((h0) a7.f4139e)) {
                    ((h0) a7.f4139e).f(1.0f);
                    e7 = I.b.e((h0) a7.f4139e);
                }
                a7.i(e7);
                ((g0) a7.f4140g).p();
                ((C1925j) a7.f4137c).o();
            }
        }
        c0 c0Var = this.f16214Z;
        if (c0Var.f16188e != z7) {
            c0Var.f16188e = z7;
            if (!z7) {
                if (c0Var.f16189g) {
                    c0Var.f16189g = false;
                    c0Var.f16184a.d(false);
                    c0.a(c0Var.f16185b, 0);
                }
                U.i iVar = c0Var.f;
                if (iVar != null) {
                    iVar.b(new Exception("Camera is not active."));
                    c0Var.f = null;
                }
            }
        }
        this.f16220e0.k(z7);
        C.e eVar = this.f16222g0;
        eVar.getClass();
        ((G.k) eVar.f423e).execute(new C.d(eVar, z7, 0));
        if (!z7) {
            ((AtomicInteger) this.f16224i0.f8171b).set(0);
            org.slf4j.helpers.i.l("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public final void l(androidx.camera.core.impl.G g3) {
        C.e eVar = this.f16222g0;
        A.m j02 = C5.i.k0(g3).j0();
        synchronized (eVar.f) {
            D.J j = (D.J) eVar.f424g;
            j.getClass();
            androidx.camera.core.impl.F f = androidx.camera.core.impl.F.OPTIONAL;
            for (C0501c c0501c : j02.H()) {
                j.f620b.i(c0501c, f, j02.G(c0501c));
            }
        }
        H.i.d(AbstractC0412a.s(new C.c(eVar, 0))).a(new org.apache.tika.parser.a(2), j3.f.r());
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public final E3.b m(float f) {
        E3.b kVar;
        I.b e7;
        if (!g()) {
            return new H.k(new Exception("Camera is not active."), 1);
        }
        Q0.A a7 = this.f16213Y;
        synchronized (((h0) a7.f4139e)) {
            try {
                ((h0) a7.f4139e).f(f);
                e7 = I.b.e((h0) a7.f4139e);
            } catch (IllegalArgumentException e8) {
                kVar = new H.k(e8, 1);
            }
        }
        a7.i(e7);
        kVar = AbstractC0412a.s(new d0(a7, e7, 0));
        return H.i.d(kVar);
    }

    public final void n(List list) {
        InterfaceC0515q interfaceC0515q;
        int b5;
        int a7;
        InterfaceC0515q interfaceC0515q2;
        C0585f c0585f = this.f16219e;
        c0585f.getClass();
        list.getClass();
        C1936u c1936u = (C1936u) c0585f.f8171b;
        c1936u.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.E e7 = (androidx.camera.core.impl.E) it.next();
            HashSet hashSet = new HashSet();
            androidx.camera.core.impl.W.b();
            ArrayList arrayList2 = new ArrayList();
            androidx.camera.core.impl.Y.a();
            hashSet.addAll(e7.f7535a);
            androidx.camera.core.impl.W c8 = androidx.camera.core.impl.W.c(e7.f7536b);
            arrayList2.addAll(e7.f7538d);
            ArrayMap arrayMap = new ArrayMap();
            u0 u0Var = e7.f;
            for (String str : u0Var.f7674a.keySet()) {
                arrayMap.put(str, u0Var.f7674a.get(str));
            }
            u0 u0Var2 = new u0(arrayMap);
            if (e7.f7537c == 5 && (interfaceC0515q2 = e7.f7540g) != null) {
                interfaceC0515q = interfaceC0515q2;
            } else {
                interfaceC0515q = null;
            }
            if (DesugarCollections.unmodifiableList(e7.f7535a).isEmpty() && e7.f7539e) {
                if (!hashSet.isEmpty()) {
                    org.slf4j.helpers.i.O("Camera2CameraImpl", "The capture config builder already has surface inside.");
                } else {
                    t0 t0Var = c1936u.f16273a;
                    t0Var.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : ((LinkedHashMap) t0Var.f7210c).entrySet()) {
                        w0 w0Var = (w0) entry.getValue();
                        if (w0Var.f && w0Var.f7681e) {
                            arrayList3.add(((w0) entry.getValue()).f7677a);
                        }
                    }
                    for (o0 o0Var : DesugarCollections.unmodifiableCollection(arrayList3)) {
                        androidx.camera.core.impl.E e8 = o0Var.f7656g;
                        List<androidx.camera.core.impl.J> unmodifiableList = DesugarCollections.unmodifiableList(e8.f7535a);
                        if (!unmodifiableList.isEmpty()) {
                            if (e8.a() != 0 && (a7 = e8.a()) != 0) {
                                c8.j(y0.f7692R, Integer.valueOf(a7));
                            }
                            if (e8.b() != 0 && (b5 = e8.b()) != 0) {
                                c8.j(y0.f7693S, Integer.valueOf(b5));
                            }
                            for (androidx.camera.core.impl.J j : unmodifiableList) {
                                hashSet.add(j);
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        org.slf4j.helpers.i.O("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            androidx.camera.core.impl.Z a8 = androidx.camera.core.impl.Z.a(c8);
            ArrayList arrayList5 = new ArrayList(arrayList2);
            u0 u0Var3 = u0.f7673b;
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayMap arrayMap3 = u0Var2.f7674a;
            for (String str2 : arrayMap3.keySet()) {
                arrayMap2.put(str2, arrayMap3.get(str2));
            }
            arrayList.add(new androidx.camera.core.impl.E(arrayList4, a8, e7.f7537c, arrayList5, e7.f7539e, new u0(arrayMap2), interfaceC0515q));
        }
        c1936u.t("Issue capture request", null);
        c1936u.f16281h0.k(arrayList);
    }

    public final long o() {
        this.q0 = this.f16230o0.getAndIncrement();
        ((C1936u) this.f16219e.f8171b).K();
        return this.q0;
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public final Rect q() {
        Rect rect = (Rect) this.f16218d.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public final void t(int i7) {
        if (!g()) {
            org.slf4j.helpers.i.O("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f16227l0 = i7;
        org.slf4j.helpers.i.l("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f16227l0);
        U2.b bVar = this.f16221f0;
        if (this.f16227l0 != 1) {
            int i8 = this.f16227l0;
        }
        bVar.getClass();
        H.i.d(AbstractC0412a.s(new X5.E(this, 24)));
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public final void z(j0 j0Var) {
        boolean isEmpty;
        HashMap hashMap;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        int[] inputFormats;
        U2.b bVar = this.f16221f0;
        V2.k kVar = (V2.k) bVar.f5723e;
        while (true) {
            synchronized (kVar.f5966c) {
                isEmpty = ((ArrayDeque) kVar.f5965b).isEmpty();
            }
            if (isEmpty) {
                break;
            }
            ((D.b0) kVar.m()).close();
        }
        D.t0 t0Var = (D.t0) bVar.f5725h;
        StreamConfigurationMap streamConfigurationMap2 = null;
        if (t0Var != null) {
            n0 n0Var = (n0) bVar.f;
            if (n0Var != null) {
                H.i.d(t0Var.f7552e).a(new E.d(n0Var, 2), j3.f.C());
                bVar.f = null;
            }
            t0Var.a();
            bVar.f5725h = null;
        }
        ImageWriter imageWriter = (ImageWriter) bVar.f5726i;
        if (imageWriter != null) {
            imageWriter.close();
            bVar.f5726i = null;
        }
        if (bVar.f5719a) {
            j0Var.f7639b.f752a = 1;
        } else if (bVar.f5721c) {
            j0Var.f7639b.f752a = 1;
        } else {
            try {
                streamConfigurationMap2 = (StreamConfigurationMap) ((x.j) bVar.f5722d).a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            } catch (AssertionError e7) {
                org.slf4j.helpers.i.t("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e7.getMessage());
            }
            if (streamConfigurationMap2 != null && streamConfigurationMap2.getInputFormats() != null) {
                hashMap = new HashMap();
                for (int i7 : streamConfigurationMap2.getInputFormats()) {
                    Size[] inputSizes = streamConfigurationMap2.getInputSizes(i7);
                    if (inputSizes != null) {
                        Arrays.sort(inputSizes, new F.c(true));
                        hashMap.put(Integer.valueOf(i7), inputSizes[0]);
                    }
                }
            } else {
                hashMap = new HashMap();
            }
            if (bVar.f5720b && !hashMap.isEmpty() && hashMap.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) ((x.j) bVar.f5722d).a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
                for (int i8 : validOutputFormatsForInput) {
                    if (i8 == 256) {
                        Size size = (Size) hashMap.get(34);
                        D.g0 g0Var = new D.g0(size.getWidth(), size.getHeight(), 34, 9);
                        bVar.f5724g = g0Var.f706b;
                        bVar.f = new n0(g0Var);
                        g0Var.N(new X5.E(bVar, 26), j3.f.A());
                        D.t0 t0Var2 = new D.t0(((n0) bVar.f).getSurface(), new Size(((n0) bVar.f).getWidth(), ((n0) bVar.f).getHeight()), 34);
                        bVar.f5725h = t0Var2;
                        n0 n0Var2 = (n0) bVar.f;
                        E3.b d7 = H.i.d(t0Var2.f7552e);
                        Objects.requireNonNull(n0Var2);
                        d7.a(new E.d(n0Var2, 2), j3.f.C());
                        j0Var.b((D.t0) bVar.f5725h, D.D.f607d, -1);
                        D.f0 f0Var = (D.f0) bVar.f5724g;
                        j0Var.f7639b.b(f0Var);
                        ArrayList arrayList = j0Var.f7642e;
                        if (!arrayList.contains(f0Var)) {
                            arrayList.add(f0Var);
                        }
                        C1894D c1894d = new C1894D(bVar, 2);
                        ArrayList arrayList2 = j0Var.f7641d;
                        if (!arrayList2.contains(c1894d)) {
                            arrayList2.add(c1894d);
                        }
                        j0Var.f7643g = new InputConfiguration(((n0) bVar.f).getWidth(), ((n0) bVar.f).getHeight(), ((n0) bVar.f).c());
                        return;
                    }
                }
            }
            j0Var.f7639b.f752a = 1;
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public final void w(I.i iVar) {
    }
}
