package w;

import D.t0;
import a.AbstractC0412a;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.Surface;
import androidx.camera.core.impl.C0503e;
import androidx.camera.core.impl.o0;
import androidx.camera.core.impl.u0;
import c1.RunnableC0626c;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import t4.RunnableC1822b;
/* renamed from: w.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1930o extends CameraDevice.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16251a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16252b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f16253c;

    public C1930o(G.k kVar, CameraDevice.StateCallback stateCallback) {
        this.f16253c = kVar;
        this.f16252b = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f16251a) {
            case 0:
                ((C1936u) this.f16253c).t("openCameraConfigAndClose camera closed", null);
                ((U.i) this.f16252b).a(null);
                return;
            default:
                ((G.k) this.f16253c).execute(new x.k(this, cameraDevice, 0));
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f16251a) {
            case 0:
                ((C1936u) this.f16253c).t("openCameraConfigAndClose camera disconnected", null);
                ((U.i) this.f16252b).a(null);
                return;
            default:
                ((G.k) this.f16253c).execute(new x.k(this, cameraDevice, 1));
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i7) {
        switch (this.f16251a) {
            case 0:
                ((C1936u) this.f16253c).t("openCameraConfigAndClose camera error " + i7, null);
                ((U.i) this.f16252b).a(null);
                return;
            default:
                ((G.k) this.f16253c).execute(new K0.g(this, cameraDevice, i7, 8));
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        Object obj = this.f16253c;
        switch (this.f16251a) {
            case 0:
                C1936u c1936u = (C1936u) obj;
                c1936u.t("openCameraConfigAndClose camera opened", null);
                C1903M c1903m = new C1903M(c1936u.f16267A0, new A.m(Collections.emptyList()), false);
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                Surface surface = new Surface(surfaceTexture);
                t0 t0Var = new t0(surface);
                H.i.d(t0Var.f7552e).a(new RunnableC1822b(14, surface, surfaceTexture), j3.f.r());
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashSet hashSet = new HashSet();
                androidx.camera.core.impl.W b5 = androidx.camera.core.impl.W.b();
                ArrayList arrayList = new ArrayList();
                androidx.camera.core.impl.Y a7 = androidx.camera.core.impl.Y.a();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                D.D d7 = D.D.f607d;
                F3.o a8 = C0503e.a(t0Var);
                a8.f = d7;
                linkedHashSet.add(a8.e());
                c1936u.t("Start configAndClose.", null);
                ArrayList arrayList5 = new ArrayList(linkedHashSet);
                ArrayList arrayList6 = new ArrayList(arrayList2);
                ArrayList arrayList7 = new ArrayList(arrayList3);
                ArrayList arrayList8 = new ArrayList(arrayList4);
                ArrayList arrayList9 = new ArrayList(hashSet);
                androidx.camera.core.impl.Z a9 = androidx.camera.core.impl.Z.a(b5);
                ArrayList arrayList10 = new ArrayList(arrayList);
                u0 u0Var = u0.f7673b;
                ArrayMap arrayMap = new ArrayMap();
                ArrayMap arrayMap2 = a7.f7674a;
                for (Iterator it = arrayMap2.keySet().iterator(); it.hasNext(); it = it) {
                    String str = (String) it.next();
                    arrayMap.put(str, arrayMap2.get(str));
                }
                o0 o0Var = new o0(arrayList5, arrayList6, arrayList7, arrayList8, new androidx.camera.core.impl.E(arrayList9, a9, 1, arrayList10, false, new u0(arrayMap), null), null, null, null);
                C1908S c1908s = c1936u.f16293u0;
                G.e eVar = (G.e) c1908s.f16113b;
                M3.q qVar = (M3.q) c1908s.f16115d;
                G.k kVar = (G.k) c1908s.f16112a;
                H.d b7 = H.d.b(AbstractC0412a.s(new H.g(c1903m.m(o0Var, cameraDevice, new C1914Y((A.m) c1908s.f16116e, (A.m) c1908s.f, qVar, kVar, eVar, (Handler) c1908s.f16114c)), 0)));
                A4.d dVar = new A4.d(26, c1903m, t0Var);
                b7.getClass();
                G.k kVar2 = c1936u.f16275c;
                H.b f = H.i.f(b7, dVar, kVar2);
                Objects.requireNonNull(cameraDevice);
                f.a(new RunnableC0626c(cameraDevice, 24), kVar2);
                return;
            default:
                ((G.k) obj).execute(new x.k(this, cameraDevice, 2));
                return;
        }
    }

    public C1930o(C1936u c1936u, U.i iVar) {
        this.f16253c = c1936u;
        this.f16252b = iVar;
    }
}
