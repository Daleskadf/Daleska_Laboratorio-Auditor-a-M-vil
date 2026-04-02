package x;

import android.hardware.camera2.CameraDevice;
import w.C1930o;
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16403a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1930o f16404b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CameraDevice f16405c;

    public /* synthetic */ k(C1930o c1930o, CameraDevice cameraDevice, int i7) {
        this.f16403a = i7;
        this.f16404b = c1930o;
        this.f16405c = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16403a) {
            case 0:
                ((CameraDevice.StateCallback) this.f16404b.f16252b).onClosed(this.f16405c);
                return;
            case 1:
                ((CameraDevice.StateCallback) this.f16404b.f16252b).onDisconnected(this.f16405c);
                return;
            default:
                ((CameraDevice.StateCallback) this.f16404b.f16252b).onOpened(this.f16405c);
                return;
        }
    }
}
