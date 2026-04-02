package H0;
/* renamed from: H0.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144y {

    /* renamed from: a  reason: collision with root package name */
    public final long f1909a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1910b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1911c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1912d;

    /* renamed from: e  reason: collision with root package name */
    public final float f1913e;

    static {
        new C0143x().a();
        K0.x.H(0);
        K0.x.H(1);
        K0.x.H(2);
        K0.x.H(3);
        K0.x.H(4);
    }

    public C0144y(C0143x c0143x) {
        long j = c0143x.f1904a;
        long j8 = c0143x.f1905b;
        long j9 = c0143x.f1906c;
        float f = c0143x.f1907d;
        float f4 = c0143x.f1908e;
        this.f1909a = j;
        this.f1910b = j8;
        this.f1911c = j9;
        this.f1912d = f;
        this.f1913e = f4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [H0.x, java.lang.Object] */
    public final C0143x a() {
        ?? obj = new Object();
        obj.f1904a = this.f1909a;
        obj.f1905b = this.f1910b;
        obj.f1906c = this.f1911c;
        obj.f1907d = this.f1912d;
        obj.f1908e = this.f1913e;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0144y)) {
            return false;
        }
        C0144y c0144y = (C0144y) obj;
        if (this.f1909a == c0144y.f1909a && this.f1910b == c0144y.f1910b && this.f1911c == c0144y.f1911c && this.f1912d == c0144y.f1912d && this.f1913e == c0144y.f1913e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j = this.f1909a;
        long j8 = this.f1910b;
        long j9 = this.f1911c;
        int i8 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) ((j9 >>> 32) ^ j9))) * 31;
        float f = this.f1912d;
        int i9 = 0;
        if (f != 0.0f) {
            i7 = Float.floatToIntBits(f);
        } else {
            i7 = 0;
        }
        int i10 = (i8 + i7) * 31;
        float f4 = this.f1913e;
        if (f4 != 0.0f) {
            i9 = Float.floatToIntBits(f4);
        }
        return i10 + i9;
    }
}
