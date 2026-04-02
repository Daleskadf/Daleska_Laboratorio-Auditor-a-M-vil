package x;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import p.C1608t;
import w.C1932q;
/* loaded from: classes.dex */
public class q extends C1608t {
    public static boolean z0(RuntimeException runtimeException) {
        boolean z7;
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        if (runtimeException.getClass().equals(RuntimeException.class) && (stackTrace = runtimeException.getStackTrace()) != null && stackTrace.length >= 0) {
            z7 = "_enableShutterSound".equals(stackTrace[0].getMethodName());
        } else {
            z7 = false;
        }
        if (!z7) {
            return false;
        }
        return true;
    }

    @Override // p.C1608t
    public CameraCharacteristics b0(String str) {
        try {
            return super.b0(str);
        } catch (RuntimeException e7) {
            if (z0(e7)) {
                throw new C1967a(e7);
            }
            throw e7;
        }
    }

    @Override // p.C1608t
    public void l0(String str, G.k kVar, CameraDevice.StateCallback stateCallback) {
        try {
            ((CameraManager) this.f14880b).openCamera(str, kVar, stateCallback);
        } catch (CameraAccessException e7) {
            throw new C1967a(e7);
        } catch (IllegalArgumentException e8) {
        } catch (SecurityException e9) {
            throw e9;
        } catch (RuntimeException e10) {
            if (z0(e10)) {
                throw new C1967a(e10);
            }
            throw e10;
        }
    }

    @Override // p.C1608t
    public final void n0(G.k kVar, C1932q c1932q) {
        ((CameraManager) this.f14880b).registerAvailabilityCallback(kVar, c1932q);
    }

    @Override // p.C1608t
    public final void w0(CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.f14880b).unregisterAvailabilityCallback(availabilityCallback);
    }
}
