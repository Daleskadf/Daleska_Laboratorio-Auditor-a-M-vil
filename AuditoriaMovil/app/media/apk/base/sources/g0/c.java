package g0;

import java.util.Locale;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f11087a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static char[] f11088b = new char[24];

    public static void a(String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static void b(boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void c(String str, float f) {
        if (!Float.isNaN(f)) {
            if (!Float.isInfinite(f)) {
                return;
            }
            throw new IllegalArgumentException(str.concat(" must not be infinite"));
        }
        throw new IllegalArgumentException(str.concat(" must not be NaN"));
    }

    public static void d(int i7, int i8, int i9, String str) {
        if (i7 >= i8) {
            if (i7 <= i9) {
                return;
            }
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i8 + ", " + i9 + "] (too high)");
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i8 + ", " + i9 + "] (too low)");
    }

    public static void e(String str, long j) {
        if (j >= 0) {
            if (j <= Long.MAX_VALUE) {
                return;
            }
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str.concat(" is out of range of [0, 9223372036854775807] (too high)"));
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str.concat(" is out of range of [0, 9223372036854775807] (too low)"));
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(String.valueOf(str));
    }

    public static void g(String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void h(long j, StringBuilder sb) {
        synchronized (f11087a) {
            sb.append(f11088b, 0, i(j));
        }
    }

    public static int i(long j) {
        char c8;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z7;
        boolean z8;
        boolean z9;
        if (f11088b.length < 0) {
            f11088b = new char[0];
        }
        char[] cArr = f11088b;
        int i11 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i11 == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (i11 > 0) {
            c8 = '+';
        } else {
            j = -j;
            c8 = '-';
        }
        int i12 = (int) (j % 1000);
        int floor = (int) Math.floor(j / 1000);
        if (floor > 86400) {
            i7 = floor / 86400;
            floor -= 86400 * i7;
        } else {
            i7 = 0;
        }
        if (floor > 3600) {
            i8 = floor / 3600;
            floor -= i8 * 3600;
        } else {
            i8 = 0;
        }
        if (floor > 60) {
            int i13 = floor / 60;
            i9 = floor - (i13 * 60);
            i10 = i13;
        } else {
            i9 = floor;
            i10 = 0;
        }
        cArr[0] = c8;
        int j8 = j(cArr, i7, 'd', 1, false, 0);
        if (j8 != 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        int j9 = j(cArr, i8, 'h', j8, z7, 0);
        if (j9 != 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        int j10 = j(cArr, i10, 'm', j9, z8, 0);
        if (j10 != 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int j11 = j(cArr, i12, 'm', j(cArr, i9, 's', j10, z9, 0), true, 0);
        cArr[j11] = 's';
        return j11 + 1;
    }

    public static int j(char[] cArr, int i7, char c8, int i8, boolean z7, int i9) {
        int i10;
        if (z7 || i7 > 0) {
            if ((z7 && i9 >= 3) || i7 > 99) {
                int i11 = i7 / 100;
                cArr[i8] = (char) (i11 + 48);
                i10 = i8 + 1;
                i7 -= i11 * 100;
            } else {
                i10 = i8;
            }
            if ((z7 && i9 >= 2) || i7 > 9 || i8 != i10) {
                int i12 = i7 / 10;
                cArr[i10] = (char) (i12 + 48);
                i10++;
                i7 -= i12 * 10;
            }
            cArr[i10] = (char) (i7 + 48);
            cArr[i10 + 1] = c8;
            return i10 + 2;
        }
        return i8;
    }
}
