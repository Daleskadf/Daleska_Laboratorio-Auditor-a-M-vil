package H0;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public final class T {

    /* renamed from: a  reason: collision with root package name */
    public Object f1716a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1717b;

    /* renamed from: c  reason: collision with root package name */
    public int f1718c;

    /* renamed from: d  reason: collision with root package name */
    public long f1719d;

    /* renamed from: e  reason: collision with root package name */
    public long f1720e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public C0122b f1721g = C0122b.f1785c;

    static {
        AbstractC0059i.F(0, 1, 2, 3, 4);
    }

    public final long a(int i7, int i8) {
        C0121a a7 = this.f1721g.a(i7);
        if (a7.f1775a != -1) {
            return a7.f[i8];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        int i7;
        C0121a a7;
        int i8;
        C0122b c0122b = this.f1721g;
        long j8 = this.f1719d;
        c0122b.getClass();
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j8 != -9223372036854775807L && j >= j8) {
            return -1;
        }
        int i9 = 0;
        while (true) {
            i7 = c0122b.f1787a;
            if (i9 >= i7) {
                break;
            }
            c0122b.a(i9).getClass();
            c0122b.a(i9).getClass();
            if (0 > j && ((i8 = (a7 = c0122b.a(i9)).f1775a) == -1 || a7.a(-1) < i8)) {
                break;
            }
            i9++;
        }
        if (i9 >= i7) {
            return -1;
        }
        return i9;
    }

    public final int c(long j) {
        C0122b c0122b = this.f1721g;
        int i7 = c0122b.f1787a - 1;
        c0122b.b(i7);
        while (i7 >= 0 && j != Long.MIN_VALUE) {
            c0122b.a(i7).getClass();
            if (j >= 0) {
                break;
            }
            i7--;
        }
        if (i7 >= 0) {
            C0121a a7 = c0122b.a(i7);
            int i8 = a7.f1775a;
            if (i8 != -1) {
                for (int i9 = 0; i9 < i8; i9++) {
                    int i10 = a7.f1779e[i9];
                    if (i10 == 0 || i10 == 1) {
                        return i7;
                    }
                }
            } else {
                return i7;
            }
        }
        return -1;
    }

    public final long d(int i7) {
        this.f1721g.a(i7).getClass();
        return 0L;
    }

    public final int e(int i7) {
        return this.f1721g.a(i7).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !T.class.equals(obj.getClass())) {
            return false;
        }
        T t7 = (T) obj;
        if (K0.x.a(this.f1716a, t7.f1716a) && K0.x.a(this.f1717b, t7.f1717b) && this.f1718c == t7.f1718c && this.f1719d == t7.f1719d && this.f1720e == t7.f1720e && this.f == t7.f && K0.x.a(this.f1721g, t7.f1721g)) {
            return true;
        }
        return false;
    }

    public final boolean f(int i7) {
        C0122b c0122b = this.f1721g;
        if (i7 == c0122b.f1787a - 1) {
            c0122b.b(i7);
            return false;
        }
        return false;
    }

    public final boolean g(int i7) {
        this.f1721g.a(i7).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i7, long j, long j8, C0122b c0122b, boolean z7) {
        this.f1716a = obj;
        this.f1717b = obj2;
        this.f1718c = i7;
        this.f1719d = j;
        this.f1720e = j8;
        this.f1721g = c0122b;
        this.f = z7;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f1716a;
        int i7 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i8 = (217 + hashCode) * 31;
        Object obj2 = this.f1717b;
        if (obj2 != null) {
            i7 = obj2.hashCode();
        }
        long j = this.f1719d;
        long j8 = this.f1720e;
        return this.f1721g.hashCode() + ((((((((((i8 + i7) * 31) + this.f1718c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
