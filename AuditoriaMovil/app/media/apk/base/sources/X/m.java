package x;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import y.u;
/* loaded from: classes.dex */
public final class m extends l {
    @Override // x.l, p.C1608t
    public final void w(u uVar) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) uVar.f16601a.a();
        sessionConfiguration.getClass();
        try {
            ((CameraDevice) this.f14880b).createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e7) {
            throw new C1967a(e7);
        }
    }
}
