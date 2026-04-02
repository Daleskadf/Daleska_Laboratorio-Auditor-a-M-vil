package x;

import android.hardware.camera2.CameraCaptureSession;
/* renamed from: x.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1971e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16390a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1973g f16391b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f16392c;

    public /* synthetic */ RunnableC1971e(C1973g c1973g, CameraCaptureSession cameraCaptureSession, int i7) {
        this.f16390a = i7;
        this.f16391b = c1973g;
        this.f16392c = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16390a) {
            case 0:
                this.f16391b.f16397a.onActive(this.f16392c);
                return;
            case 1:
                this.f16391b.f16397a.onClosed(this.f16392c);
                return;
            case 2:
                this.f16391b.f16397a.onCaptureQueueEmpty(this.f16392c);
                return;
            case 3:
                this.f16391b.f16397a.onConfigured(this.f16392c);
                return;
            case 4:
                this.f16391b.f16397a.onReady(this.f16392c);
                return;
            default:
                this.f16391b.f16397a.onConfigureFailed(this.f16392c);
                return;
        }
    }
}
