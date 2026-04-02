package x;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.Set;
/* loaded from: classes.dex */
public final class s extends r {
    @Override // p.C1608t
    public final Set d0() {
        try {
            return ((CameraManager) this.f14880b).getConcurrentCameraIds();
        } catch (CameraAccessException e7) {
            throw new C1967a(e7);
        }
    }
}
