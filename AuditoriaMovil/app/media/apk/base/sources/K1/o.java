package k1;

import android.view.Surface;
/* loaded from: classes.dex */
public abstract class o {
    public static void a(Surface surface, float f) {
        int i7;
        if (f == 0.0f) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        try {
            surface.setFrameRate(f, i7);
        } catch (IllegalStateException e7) {
            K0.a.o("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e7);
        }
    }
}
