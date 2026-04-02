package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.impl.AbstractC0508j;
import androidx.camera.core.impl.EnumC0511m;
import androidx.camera.core.impl.o0;
import androidx.camera.core.impl.u0;
import j6.C1372c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p.C1608t;
/* renamed from: w.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1940y extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16311a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16312b;

    public C1940y(AbstractC0508j abstractC0508j) {
        this.f16311a = 1;
        if (abstractC0508j != null) {
            this.f16312b = abstractC0508j;
            return;
        }
        throw new NullPointerException("cameraCaptureCallback is null");
    }

    public static int a(CaptureRequest captureRequest) {
        Integer num;
        if (!(captureRequest.getTag() instanceof u0) || (num = (Integer) ((u0) captureRequest.getTag()).f7674a.get("CAPTURE_CONFIG_ID_KEY")) == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        switch (this.f16311a) {
            case 0:
                Iterator it = ((ArrayList) this.f16312b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                }
                return;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        u0 u0Var;
        switch (this.f16311a) {
            case 0:
                Iterator it = ((ArrayList) this.f16312b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                return;
            case 1:
                super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                Object tag = captureRequest.getTag();
                if (tag != null) {
                    g0.c.a("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof u0);
                    u0Var = (u0) tag;
                } else {
                    u0Var = u0.f7673b;
                }
                ((AbstractC0508j) this.f16312b).b(a(captureRequest), new C1608t(13, u0Var, totalCaptureResult));
                return;
            default:
                synchronized (((C1903M) this.f16312b).f16079a) {
                    try {
                        o0 o0Var = ((C1903M) this.f16312b).f;
                        if (o0Var != null) {
                            androidx.camera.core.impl.E e7 = o0Var.f7656g;
                            org.slf4j.helpers.i.l("CaptureSession", "Submit FLASH_MODE_OFF request");
                            C1903M c1903m = (C1903M) this.f16312b;
                            c1903m.f16090n.getClass();
                            c1903m.k(Collections.singletonList(A.n.b(e7)));
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.f16311a) {
            case 0:
                Iterator it = ((ArrayList) this.f16312b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                return;
            case 1:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                ((AbstractC0508j) this.f16312b).c(a(captureRequest), new C1372c(EnumC0511m.ERROR, 14));
                return;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f16311a) {
            case 0:
                Iterator it = ((ArrayList) this.f16312b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                return;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i7) {
        switch (this.f16311a) {
            case 0:
                Iterator it = ((ArrayList) this.f16312b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceAborted(cameraCaptureSession, i7);
                }
                return;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i7);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i7, long j) {
        switch (this.f16311a) {
            case 0:
                Iterator it = ((ArrayList) this.f16312b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceCompleted(cameraCaptureSession, i7, j);
                }
                return;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i7, j);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j8) {
        switch (this.f16311a) {
            case 0:
                Iterator it = ((ArrayList) this.f16312b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j, j8);
                }
                return;
            case 1:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j8);
                ((AbstractC0508j) this.f16312b).d(a(captureRequest));
                return;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j8);
                return;
        }
    }

    public C1940y(List list) {
        this.f16311a = 0;
        this.f16312b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) it.next();
            if (!(captureCallback instanceof C1941z)) {
                ((ArrayList) this.f16312b).add(captureCallback);
            }
        }
    }

    public C1940y(C1903M c1903m) {
        this.f16311a = 2;
        this.f16312b = c1903m;
    }
}
