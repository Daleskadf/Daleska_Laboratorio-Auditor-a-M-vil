package x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import p.C1608t;
/* renamed from: x.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1974h extends C1608t {
    @Override // p.C1608t
    public final int q0(CaptureRequest captureRequest, G.k kVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f14880b).setSingleRepeatingRequest(captureRequest, kVar, captureCallback);
    }

    @Override // p.C1608t
    public final int t(ArrayList arrayList, G.k kVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f14880b).captureBurstRequests(arrayList, kVar, captureCallback);
    }
}
