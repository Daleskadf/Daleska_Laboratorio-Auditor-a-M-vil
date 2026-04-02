package x;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.concurrent.Executor;
/* renamed from: x.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1973g extends CameraCaptureSession.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final CameraCaptureSession.StateCallback f16397a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f16398b;

    public C1973g(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.f16398b = executor;
        this.f16397a = stateCallback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f16398b.execute(new RunnableC1971e(this, cameraCaptureSession, 0));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        this.f16398b.execute(new RunnableC1971e(this, cameraCaptureSession, 2));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f16398b.execute(new RunnableC1971e(this, cameraCaptureSession, 1));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f16398b.execute(new RunnableC1971e(this, cameraCaptureSession, 5));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.f16398b.execute(new RunnableC1971e(this, cameraCaptureSession, 3));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f16398b.execute(new RunnableC1971e(this, cameraCaptureSession, 4));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.f16398b.execute(new RunnableC1972f(this, cameraCaptureSession, surface, 0));
    }
}
