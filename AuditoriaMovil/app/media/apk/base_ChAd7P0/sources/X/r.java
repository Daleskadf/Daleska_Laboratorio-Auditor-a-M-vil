package x;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
/* loaded from: classes.dex */
public class r extends q {
    @Override // x.q, p.C1608t
    public final CameraCharacteristics b0(String str) {
        try {
            return ((CameraManager) this.f14880b).getCameraCharacteristics(str);
        } catch (CameraAccessException e7) {
            throw new C1967a(e7);
        }
    }

    @Override // x.q, p.C1608t
    public final void l0(String str, G.k kVar, CameraDevice.StateCallback stateCallback) {
        try {
            ((CameraManager) this.f14880b).openCamera(str, kVar, stateCallback);
        } catch (CameraAccessException e7) {
            throw new C1967a(e7);
        }
    }
}
