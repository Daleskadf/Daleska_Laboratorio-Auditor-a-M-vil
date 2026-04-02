package w;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: w.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1894D extends CameraCaptureSession.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16070a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16071b;

    public /* synthetic */ C1894D(Object obj, int i7) {
        this.f16070a = i7;
        this.f16071b = obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        switch (this.f16070a) {
            case 0:
                Iterator it = ((ArrayList) this.f16071b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                }
                return;
            case 1:
                C1914Y c1914y = (C1914Y) this.f16071b;
                c1914y.k(cameraCaptureSession);
                c1914y.a(c1914y);
                return;
            default:
                super.onActive(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        switch (this.f16070a) {
            case 0:
                Iterator it = ((ArrayList) this.f16071b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
                }
                return;
            case 1:
                C1914Y c1914y = (C1914Y) this.f16071b;
                c1914y.k(cameraCaptureSession);
                c1914y.b(c1914y);
                return;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f16070a) {
            case 0:
                Iterator it = ((ArrayList) this.f16071b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                }
                return;
            case 1:
                C1914Y c1914y = (C1914Y) this.f16071b;
                c1914y.k(cameraCaptureSession);
                c1914y.c(c1914y);
                return;
            default:
                super.onClosed(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        U.i iVar;
        switch (this.f16070a) {
            case 0:
                Iterator it = ((ArrayList) this.f16071b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((C1914Y) this.f16071b).k(cameraCaptureSession);
                    C1914Y c1914y = (C1914Y) this.f16071b;
                    c1914y.d(c1914y);
                    synchronized (((C1914Y) this.f16071b).f16147a) {
                        g0.c.f(((C1914Y) this.f16071b).f16154i, "OpenCaptureSession completer should not null");
                        C1914Y c1914y2 = (C1914Y) this.f16071b;
                        iVar = c1914y2.f16154i;
                        c1914y2.f16154i = null;
                    }
                    iVar.b(new IllegalStateException("onConfigureFailed"));
                    return;
                } catch (Throwable th) {
                    synchronized (((C1914Y) this.f16071b).f16147a) {
                        g0.c.f(((C1914Y) this.f16071b).f16154i, "OpenCaptureSession completer should not null");
                        C1914Y c1914y3 = (C1914Y) this.f16071b;
                        U.i iVar2 = c1914y3.f16154i;
                        c1914y3.f16154i = null;
                        iVar2.b(new IllegalStateException("onConfigureFailed"));
                        throw th;
                    }
                }
            default:
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        U.i iVar;
        switch (this.f16070a) {
            case 0:
                Iterator it = ((ArrayList) this.f16071b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((C1914Y) this.f16071b).k(cameraCaptureSession);
                    C1914Y c1914y = (C1914Y) this.f16071b;
                    c1914y.e(c1914y);
                    synchronized (((C1914Y) this.f16071b).f16147a) {
                        g0.c.f(((C1914Y) this.f16071b).f16154i, "OpenCaptureSession completer should not null");
                        C1914Y c1914y2 = (C1914Y) this.f16071b;
                        iVar = c1914y2.f16154i;
                        c1914y2.f16154i = null;
                    }
                    iVar.a(null);
                    return;
                } catch (Throwable th) {
                    synchronized (((C1914Y) this.f16071b).f16147a) {
                        g0.c.f(((C1914Y) this.f16071b).f16154i, "OpenCaptureSession completer should not null");
                        C1914Y c1914y3 = (C1914Y) this.f16071b;
                        U.i iVar2 = c1914y3.f16154i;
                        c1914y3.f16154i = null;
                        iVar2.a(null);
                        throw th;
                    }
                }
            default:
                Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    ((U2.b) this.f16071b).f5726i = ImageWriter.newInstance(inputSurface, 1);
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        switch (this.f16070a) {
            case 0:
                Iterator it = ((ArrayList) this.f16071b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                }
                return;
            case 1:
                C1914Y c1914y = (C1914Y) this.f16071b;
                c1914y.k(cameraCaptureSession);
                c1914y.f(c1914y);
                return;
            default:
                super.onReady(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        switch (this.f16070a) {
            case 0:
                Iterator it = ((ArrayList) this.f16071b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
                }
                return;
            case 1:
                C1914Y c1914y = (C1914Y) this.f16071b;
                c1914y.k(cameraCaptureSession);
                c1914y.h(c1914y, surface);
                return;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                return;
        }
    }

    public C1894D(List list) {
        this.f16070a = 0;
        this.f16071b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof C1895E)) {
                ((ArrayList) this.f16071b).add(stateCallback);
            }
        }
    }

    private final void a(CameraCaptureSession cameraCaptureSession) {
    }
}
