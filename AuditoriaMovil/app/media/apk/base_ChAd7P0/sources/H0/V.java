package H0;

import android.util.Pair;
/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a  reason: collision with root package name */
    public static final S f1738a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, H0.S] */
    static {
        K0.x.H(0);
        K0.x.H(1);
        K0.x.H(2);
    }

    public int a(boolean z7) {
        if (p()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z7) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i7, T t7, U u7, int i8, boolean z7) {
        int i9 = f(i7, t7, false).f1718c;
        if (m(i9, u7, 0L).f1736o == i7) {
            int e7 = e(i9, i8, z7);
            if (e7 == -1) {
                return -1;
            }
            return m(e7, u7, 0L).f1735n;
        }
        return i7 + 1;
    }

    public int e(int i7, int i8, boolean z7) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    if (i7 == c(z7)) {
                        return a(z7);
                    }
                    return i7 + 1;
                }
                throw new IllegalStateException();
            }
            return i7;
        } else if (i7 == c(z7)) {
            return -1;
        } else {
            return i7 + 1;
        }
    }

    public final boolean equals(Object obj) {
        int c8;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v6 = (V) obj;
        if (v6.o() != o() || v6.h() != h()) {
            return false;
        }
        U u7 = new U();
        T t7 = new T();
        U u8 = new U();
        T t8 = new T();
        for (int i7 = 0; i7 < o(); i7++) {
            if (!m(i7, u7, 0L).equals(v6.m(i7, u8, 0L))) {
                return false;
            }
        }
        for (int i8 = 0; i8 < h(); i8++) {
            if (!f(i8, t7, true).equals(v6.f(i8, t8, true))) {
                return false;
            }
        }
        int a7 = a(true);
        if (a7 != v6.a(true) || (c8 = c(true)) != v6.c(true)) {
            return false;
        }
        while (a7 != c8) {
            int e7 = e(a7, 0, true);
            if (e7 != v6.e(a7, 0, true)) {
                return false;
            }
            a7 = e7;
        }
        return true;
    }

    public abstract T f(int i7, T t7, boolean z7);

    public T g(Object obj, T t7) {
        return f(b(obj), t7, true);
    }

    public abstract int h();

    public final int hashCode() {
        U u7 = new U();
        T t7 = new T();
        int o7 = o() + 217;
        for (int i7 = 0; i7 < o(); i7++) {
            o7 = (o7 * 31) + m(i7, u7, 0L).hashCode();
        }
        int h8 = h() + (o7 * 31);
        for (int i8 = 0; i8 < h(); i8++) {
            h8 = (h8 * 31) + f(i8, t7, true).hashCode();
        }
        int a7 = a(true);
        while (a7 != -1) {
            h8 = (h8 * 31) + a7;
            a7 = e(a7, 0, true);
        }
        return h8;
    }

    public final Pair i(U u7, T t7, int i7, long j) {
        Pair j8 = j(u7, t7, i7, j, 0L);
        j8.getClass();
        return j8;
    }

    public final Pair j(U u7, T t7, int i7, long j, long j8) {
        K0.a.g(i7, o());
        m(i7, u7, j8);
        if (j == -9223372036854775807L) {
            j = u7.f1733l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i8 = u7.f1735n;
        f(i8, t7, false);
        while (i8 < u7.f1736o && t7.f1720e != j) {
            int i9 = i8 + 1;
            if (f(i9, t7, false).f1720e > j) {
                break;
            }
            i8 = i9;
        }
        f(i8, t7, true);
        long j9 = j - t7.f1720e;
        long j10 = t7.f1719d;
        if (j10 != -9223372036854775807L) {
            j9 = Math.min(j9, j10 - 1);
        }
        long max = Math.max(0L, j9);
        Object obj = t7.f1717b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i7, int i8, boolean z7) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    if (i7 == a(z7)) {
                        return c(z7);
                    }
                    return i7 - 1;
                }
                throw new IllegalStateException();
            }
            return i7;
        } else if (i7 == a(z7)) {
            return -1;
        } else {
            return i7 - 1;
        }
    }

    public abstract Object l(int i7);

    public abstract U m(int i7, U u7, long j);

    public final void n(int i7, U u7) {
        m(i7, u7, 0L);
    }

    public abstract int o();

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}
