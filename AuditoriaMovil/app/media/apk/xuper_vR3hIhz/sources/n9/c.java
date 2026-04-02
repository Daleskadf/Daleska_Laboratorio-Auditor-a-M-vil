package n9;
/* loaded from: classes3.dex */
public abstract class c {
    public static final int a(int i10, int i11, int i12) {
        return c(c(i10, i12) - c(i11, i12), i12);
    }

    public static final int b(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                return i11 - a(i11, i10, i12);
            }
            return i11;
        } else if (i12 < 0) {
            if (i10 > i11) {
                return i11 + a(i10, i11, -i12);
            }
            return i11;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    public static final int c(int i10, int i11) {
        int i12 = i10 % i11;
        if (i12 < 0) {
            return i12 + i11;
        }
        return i12;
    }
}
