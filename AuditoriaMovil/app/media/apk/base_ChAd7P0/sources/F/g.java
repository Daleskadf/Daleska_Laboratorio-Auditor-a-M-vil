package F;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final RectF f1104a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix a(RectF rectF, RectF rectF2, int i7, boolean z7) {
        Matrix matrix = new Matrix();
        RectF rectF3 = f1104a;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i7);
        if (z7) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static boolean b(int i7) {
        if (i7 != 90 && i7 != 270) {
            if (i7 != 0 && i7 != 180) {
                throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "Invalid rotation degrees: "));
            }
            return false;
        }
        return true;
    }

    public static boolean c(Size size, Size size2) {
        float width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
        float width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        float width3 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
        if (width >= (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f) && width3 >= width2) {
            return true;
        }
        return false;
    }

    public static Size d(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static Size e(Size size, int i7) {
        boolean z7;
        if (i7 % 90 == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.a("Invalid rotation degrees: " + i7, z7);
        if (b(f(i7))) {
            return new Size(size.getHeight(), size.getWidth());
        }
        return size;
    }

    public static int f(int i7) {
        return ((i7 % 360) + 360) % 360;
    }
}
