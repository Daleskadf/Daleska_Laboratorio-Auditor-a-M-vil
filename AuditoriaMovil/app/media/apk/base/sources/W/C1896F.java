package w;

import O0.RunnableC0240b;
import android.hardware.camera2.CameraDevice;
import c1.RunnableC0626c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* renamed from: w.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1896F extends CameraDevice.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16072a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16073b;

    public C1896F(M3.q qVar) {
        this.f16072a = 1;
        this.f16073b = qVar;
    }

    public void a() {
        ArrayList s7;
        synchronized (((M3.q) this.f16073b).f3254c) {
            s7 = ((M3.q) this.f16073b).s();
            ((LinkedHashSet) ((M3.q) this.f16073b).f).clear();
            ((LinkedHashSet) ((M3.q) this.f16073b).f3255d).clear();
            ((LinkedHashSet) ((M3.q) this.f16073b).f3256e).clear();
        }
        Iterator it = s7.iterator();
        while (it.hasNext()) {
            C1914Y c1914y = (C1914Y) it.next();
            c1914y.q();
            c1914y.f16165u.m();
        }
    }

    public void b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((M3.q) this.f16073b).f3254c) {
            linkedHashSet.addAll((LinkedHashSet) ((M3.q) this.f16073b).f);
            linkedHashSet.addAll((LinkedHashSet) ((M3.q) this.f16073b).f3255d);
        }
        ((G.k) ((M3.q) this.f16073b).f3252a).execute(new RunnableC0626c(linkedHashSet, 27));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f16072a) {
            case 0:
                Iterator it = ((ArrayList) this.f16073b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                }
                return;
            default:
                b();
                a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f16072a) {
            case 0:
                Iterator it = ((ArrayList) this.f16073b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                }
                return;
            default:
                b();
                a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i7) {
        switch (this.f16072a) {
            case 0:
                Iterator it = ((ArrayList) this.f16073b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i7);
                }
                return;
            default:
                b();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                synchronized (((M3.q) this.f16073b).f3254c) {
                    linkedHashSet.addAll((LinkedHashSet) ((M3.q) this.f16073b).f);
                    linkedHashSet.addAll((LinkedHashSet) ((M3.q) this.f16073b).f3255d);
                }
                ((G.k) ((M3.q) this.f16073b).f3252a).execute(new RunnableC0240b(linkedHashSet, i7, 4));
                a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.f16072a) {
            case 0:
                Iterator it = ((ArrayList) this.f16073b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                }
                return;
            default:
                return;
        }
    }

    public C1896F(ArrayList arrayList) {
        this.f16072a = 0;
        this.f16073b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof C1897G)) {
                ((ArrayList) this.f16073b).add(stateCallback);
            }
        }
    }

    private final void c(CameraDevice cameraDevice) {
    }
}
