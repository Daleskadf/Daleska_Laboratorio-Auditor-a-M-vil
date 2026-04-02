package C3;

import G.i;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f530a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d7) {
        boolean z7;
        long j;
        if (Math.getExponent(d7) > 1023) {
            return false;
        }
        if (d7 != 0.0d) {
            if (Math.getExponent(d7) <= 1023) {
                z7 = true;
            } else {
                z7 = false;
            }
            i.f("not a normal value", z7);
            int exponent = Math.getExponent(d7);
            long doubleToRawLongBits = Double.doubleToRawLongBits(d7) & 4503599627370495L;
            if (exponent == -1023) {
                j = doubleToRawLongBits << 1;
            } else {
                j = doubleToRawLongBits | 4503599627370496L;
            }
            if (52 - Long.numberOfTrailingZeros(j) > Math.getExponent(d7)) {
                return false;
            }
        }
        return true;
    }
}
