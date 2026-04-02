package F;

import android.util.Rational;
import android.util.Size;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Rational f1092a = new Rational(4, 3);

    /* renamed from: b  reason: collision with root package name */
    public static final Rational f1093b = new Rational(3, 4);

    /* renamed from: c  reason: collision with root package name */
    public static final Rational f1094c = new Rational(16, 9);

    /* renamed from: d  reason: collision with root package name */
    public static final Rational f1095d = new Rational(9, 16);

    public static boolean a(Rational rational, Size size) {
        Size size2 = L.a.f2816b;
        if (rational == null) {
            return false;
        }
        if (!rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            if (size.getHeight() * size.getWidth() < L.a.a(size2)) {
                return false;
            }
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            int i7 = width % 16;
            if (i7 == 0 && height % 16 == 0) {
                if (!b(Math.max(0, height - 16), width, rational) && !b(Math.max(0, width - 16), height, rational2)) {
                    return false;
                }
            } else if (i7 == 0) {
                return b(height, width, rational);
            } else {
                if (height % 16 != 0) {
                    return false;
                }
                return b(width, height, rational2);
            }
        }
        return true;
    }

    public static boolean b(int i7, int i8, Rational rational) {
        boolean z7;
        if (i8 % 16 == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.b(z7);
        double numerator = (rational.getNumerator() * i7) / rational.getDenominator();
        if (numerator > Math.max(0, i8 - 16) && numerator < i8 + 16) {
            return true;
        }
        return false;
    }
}
