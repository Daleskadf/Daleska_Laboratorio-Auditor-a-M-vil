package androidx.camera.core;

import D.T;
import D.Z;
import D.a0;
import D.b0;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Locale;
import org.slf4j.helpers.i;
/* loaded from: classes.dex */
public abstract class ImageProcessingUtil {

    /* renamed from: a  reason: collision with root package name */
    public static int f7520a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(b0 b0Var) {
        a0 a0Var;
        if (!d(b0Var)) {
            i.t("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int width = b0Var.getWidth();
        int height = b0Var.getHeight();
        int n02 = b0Var.f()[0].n0();
        int n03 = b0Var.f()[1].n0();
        int n04 = b0Var.f()[2].n0();
        int m02 = b0Var.f()[0].m0();
        int m03 = b0Var.f()[1].m0();
        if (nativeShiftPixel(b0Var.f()[0].l0(), n02, b0Var.f()[1].l0(), n03, b0Var.f()[2].l0(), n04, m02, m03, width, height, m02, m03, m03) != 0) {
            a0Var = a0.ERROR_CONVERSION;
        } else {
            a0Var = a0.SUCCESS;
        }
        if (a0Var == a0.ERROR_CONVERSION) {
            i.t("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    public static T b(b0 b0Var, androidx.camera.core.impl.T t7, ByteBuffer byteBuffer, int i7, boolean z7) {
        int i8;
        int i9;
        int i10;
        a0 a0Var;
        if (!d(b0Var)) {
            i.t("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (i7 != 0 && i7 != 90 && i7 != 180 && i7 != 270) {
            i.t("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface surface = t7.getSurface();
        int width = b0Var.getWidth();
        int height = b0Var.getHeight();
        int n02 = b0Var.f()[0].n0();
        int n03 = b0Var.f()[1].n0();
        int n04 = b0Var.f()[2].n0();
        int m02 = b0Var.f()[0].m0();
        int m03 = b0Var.f()[1].m0();
        if (z7) {
            i8 = m02;
        } else {
            i8 = 0;
        }
        if (z7) {
            i9 = m03;
        } else {
            i9 = 0;
        }
        if (z7) {
            i10 = m03;
        } else {
            i10 = 0;
        }
        if (nativeConvertAndroid420ToABGR(b0Var.f()[0].l0(), n02, b0Var.f()[1].l0(), n03, b0Var.f()[2].l0(), n04, m02, m03, surface, byteBuffer, width, height, i8, i9, i10, i7) != 0) {
            a0Var = a0.ERROR_CONVERSION;
        } else {
            a0Var = a0.SUCCESS;
        }
        if (a0Var == a0.ERROR_CONVERSION) {
            i.t("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            i.l("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - currentTimeMillis) + "], image count: " + f7520a);
            f7520a = f7520a + 1;
        }
        b0 acquireLatestImage = t7.acquireLatestImage();
        if (acquireLatestImage == null) {
            i.t("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        T t8 = new T(acquireLatestImage);
        t8.a(new Z(acquireLatestImage, b0Var, 1));
        return t8;
    }

    public static void c(Bitmap bitmap, ByteBuffer byteBuffer, int i7) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i7, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean d(b0 b0Var) {
        if (b0Var.e() == 35 && b0Var.f().length == 3) {
            return true;
        }
        return false;
    }

    public static T e(b0 b0Var, androidx.camera.core.impl.T t7, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i7) {
        String str;
        a0 a0Var;
        a0 a0Var2;
        if (!d(b0Var)) {
            i.t("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        } else if (i7 != 0 && i7 != 90 && i7 != 180 && i7 != 270) {
            i.t("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        } else {
            a0 a0Var3 = a0.ERROR_CONVERSION;
            if (i7 <= 0) {
                str = "ImageProcessingUtil";
                a0Var = a0Var3;
                a0Var3 = a0Var;
            } else {
                int width = b0Var.getWidth();
                int height = b0Var.getHeight();
                int n02 = b0Var.f()[0].n0();
                int n03 = b0Var.f()[1].n0();
                int n04 = b0Var.f()[2].n0();
                int m02 = b0Var.f()[1].m0();
                Image dequeueInputImage = imageWriter.dequeueInputImage();
                if (dequeueInputImage == null) {
                    a0Var2 = a0Var3;
                    str = "ImageProcessingUtil";
                } else {
                    a0Var2 = a0Var3;
                    str = "ImageProcessingUtil";
                    if (nativeRotateYUV(b0Var.f()[0].l0(), n02, b0Var.f()[1].l0(), n03, b0Var.f()[2].l0(), n04, m02, dequeueInputImage.getPlanes()[0].getBuffer(), dequeueInputImage.getPlanes()[0].getRowStride(), dequeueInputImage.getPlanes()[0].getPixelStride(), dequeueInputImage.getPlanes()[1].getBuffer(), dequeueInputImage.getPlanes()[1].getRowStride(), dequeueInputImage.getPlanes()[1].getPixelStride(), dequeueInputImage.getPlanes()[2].getBuffer(), dequeueInputImage.getPlanes()[2].getRowStride(), dequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i7) != 0) {
                        a0Var3 = a0Var2;
                    } else {
                        imageWriter.queueInputImage(dequeueInputImage);
                        a0Var3 = a0.SUCCESS;
                    }
                }
                a0Var = a0Var2;
            }
            if (a0Var3 == a0Var) {
                i.t(str, "rotate YUV failure");
                return null;
            }
            String str2 = str;
            b0 acquireLatestImage = t7.acquireLatestImage();
            if (acquireLatestImage == null) {
                i.t(str2, "YUV rotation acquireLatestImage failure");
                return null;
            }
            T t8 = new T(acquireLatestImage);
            t8.a(new Z(acquireLatestImage, b0Var, 0));
            return t8;
        }
    }

    public static void f(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            i.t("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i7, ByteBuffer byteBuffer2, int i8, ByteBuffer byteBuffer3, int i9, int i10, int i11, Surface surface, ByteBuffer byteBuffer4, int i12, int i13, int i14, int i15, int i16, int i17);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i7, int i8, int i9, int i10, boolean z7);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i7, ByteBuffer byteBuffer2, int i8, ByteBuffer byteBuffer3, int i9, int i10, ByteBuffer byteBuffer4, int i11, int i12, ByteBuffer byteBuffer5, int i13, int i14, ByteBuffer byteBuffer6, int i15, int i16, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i17, int i18, int i19);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i7, ByteBuffer byteBuffer2, int i8, ByteBuffer byteBuffer3, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
