package w;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.AbstractC0508j;
/* renamed from: w.I  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1899I extends AbstractC0508j {

    /* renamed from: a  reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f16075a;

    public C1899I(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.f16075a = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }
}
