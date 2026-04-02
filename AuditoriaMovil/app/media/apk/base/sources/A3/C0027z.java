package A3;

import java.util.Comparator;
/* renamed from: A3.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027z extends B {
    public static B f(int i7) {
        if (i7 < 0) {
            return B.f82b;
        }
        if (i7 > 0) {
            return B.f83c;
        }
        return B.f81a;
    }

    @Override // A3.B
    public final B a(int i7, int i8) {
        int i9;
        if (i7 < i8) {
            i9 = -1;
        } else if (i7 > i8) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        return f(i9);
    }

    @Override // A3.B
    public final B b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // A3.B
    public final B c(boolean z7, boolean z8) {
        int i7;
        if (z7 == z8) {
            i7 = 0;
        } else if (z7) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        return f(i7);
    }

    @Override // A3.B
    public final B d(boolean z7, boolean z8) {
        int i7;
        if (z8 == z7) {
            i7 = 0;
        } else if (z8) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        return f(i7);
    }

    @Override // A3.B
    public final int e() {
        return 0;
    }
}
