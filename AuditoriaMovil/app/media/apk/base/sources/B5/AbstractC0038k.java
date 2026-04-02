package B5;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Insets;
import android.hardware.HardwareBuffer;
import android.media.ImageReader;
import android.media.MediaCodecInfo;
import android.view.WindowInsets;
/* renamed from: B5.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0038k {
    public static /* bridge */ /* synthetic */ Bitmap a(HardwareBuffer hardwareBuffer, ColorSpace colorSpace) {
        return Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
    }

    public static /* bridge */ /* synthetic */ Insets b(WindowInsets windowInsets) {
        return windowInsets.getSystemGestureInsets();
    }

    public static /* bridge */ /* synthetic */ ImageReader d(int i7, int i8) {
        return ImageReader.newInstance(i7, i8, 1, 3, 768L);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint e() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint f(int i7, int i8, int i9) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i7, i8, i9);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint g(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ WindowInsets.Builder h() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ void m() {
    }
}
