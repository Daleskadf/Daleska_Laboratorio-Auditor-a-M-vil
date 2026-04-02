package h0;

import android.graphics.Insets;
import android.media.ImageReader;
import android.view.WindowInsets;
import w.C1932q;
/* renamed from: h0.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1024D {
    public static /* bridge */ /* synthetic */ int a(Insets insets) {
        return insets.left;
    }

    public static /* bridge */ /* synthetic */ ImageReader c(int i7, int i8) {
        return ImageReader.newInstance(i7, i8, 34, 5, 256L);
    }

    public static /* synthetic */ WindowInsets.Builder e(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ void h() {
    }

    public static /* bridge */ /* synthetic */ void j(C1932q c1932q) {
        c1932q.onCameraAccessPrioritiesChanged();
    }

    public static /* bridge */ /* synthetic */ int m(Insets insets) {
        return insets.top;
    }

    public static /* bridge */ /* synthetic */ int q(Insets insets) {
        return insets.right;
    }

    public static /* bridge */ /* synthetic */ int s(Insets insets) {
        return insets.bottom;
    }
}
