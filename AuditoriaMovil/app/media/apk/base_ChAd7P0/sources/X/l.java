package x;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import g1.C1006c;
import java.util.List;
import p.C1608t;
import y.C2027g;
import y.t;
import y.u;
/* loaded from: classes.dex */
public class l extends C1608t {
    @Override // p.C1608t
    public void w(u uVar) {
        CameraDevice cameraDevice = (CameraDevice) this.f14880b;
        C1608t.u(cameraDevice, uVar);
        t tVar = uVar.f16601a;
        C1973g c1973g = new C1973g(tVar.g(), tVar.c());
        List d7 = tVar.d();
        C1006c c1006c = (C1006c) this.f14881c;
        c1006c.getClass();
        C2027g f = tVar.f();
        Handler handler = (Handler) c1006c.f11091a;
        try {
            if (f != null) {
                InputConfiguration inputConfiguration = f.f16577a.f16576a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, u.a(d7), c1973g, handler);
            } else if (tVar.b() == 1) {
                cameraDevice.createConstrainedHighSpeedCaptureSession(C1608t.v0(d7), c1973g, handler);
            } else {
                cameraDevice.createCaptureSessionByOutputConfigurations(u.a(d7), c1973g, handler);
            }
        } catch (CameraAccessException e7) {
            throw new C1967a(e7);
        }
    }
}
