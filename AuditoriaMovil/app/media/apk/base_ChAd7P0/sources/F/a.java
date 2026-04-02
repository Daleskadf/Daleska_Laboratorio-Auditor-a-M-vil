package F;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final RectF f1090a;

    /* renamed from: b  reason: collision with root package name */
    public final Rational f1091b;

    public a(Rational rational, Rational rational2) {
        this.f1091b = rational2 == null ? new Rational(4, 3) : rational2;
        this.f1090a = b(rational);
    }

    public static float a(RectF rectF, RectF rectF2) {
        float width;
        float height;
        if (rectF.width() < rectF2.width()) {
            width = rectF.width();
        } else {
            width = rectF2.width();
        }
        if (rectF.height() < rectF2.height()) {
            height = rectF.height();
        } else {
            height = rectF2.height();
        }
        return width * height;
    }

    public final RectF b(Rational rational) {
        float floatValue = rational.floatValue();
        Rational rational2 = this.f1091b;
        if (floatValue == rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator());
        }
        if (rational.floatValue() > rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator());
        }
        return new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z7;
        Rational rational = (Rational) obj;
        Rational rational2 = (Rational) obj2;
        boolean z8 = false;
        if (rational.equals(rational2)) {
            return 0;
        }
        RectF b5 = b(rational);
        RectF b7 = b(rational2);
        RectF rectF = this.f1090a;
        if (b5.width() >= rectF.width() && b5.height() >= rectF.height()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (b7.width() >= rectF.width() && b7.height() >= rectF.height()) {
            z8 = true;
        }
        if (z7 && z8) {
            return (int) Math.signum((b5.height() * b5.width()) - (b7.height() * b7.width()));
        } else if (z7) {
            return -1;
        } else {
            if (z8) {
                return 1;
            }
            return -((int) Math.signum(a(b5, rectF) - a(b7, rectF)));
        }
    }
}
