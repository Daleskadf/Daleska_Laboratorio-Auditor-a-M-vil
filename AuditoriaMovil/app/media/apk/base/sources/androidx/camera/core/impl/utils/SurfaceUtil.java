package androidx.camera.core.impl.utils;

import android.view.Surface;
import j6.C1372c;
/* loaded from: classes.dex */
public abstract class SurfaceUtil {
    static {
        System.loadLibrary("surface_util_jni");
    }

    public static C1372c a(Surface surface) {
        int[] nativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        C1372c c1372c = new C1372c(3);
        int i7 = nativeGetSurfaceInfo[0];
        int i8 = nativeGetSurfaceInfo[1];
        int i9 = nativeGetSurfaceInfo[2];
        return c1372c;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
