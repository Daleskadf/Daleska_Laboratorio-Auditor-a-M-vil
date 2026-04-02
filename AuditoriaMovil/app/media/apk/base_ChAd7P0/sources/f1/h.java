package F1;

import K0.x;
import m1.B;
import m1.z;
/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long f1151a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1152b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1153c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1154d;

    /* renamed from: e  reason: collision with root package name */
    public final long f1155e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long[] f1156g;

    public h(long j, int i7, long j8, int i8, long j9, long[] jArr) {
        this.f1151a = j;
        this.f1152b = i7;
        this.f1153c = j8;
        this.f1154d = i8;
        this.f1155e = j9;
        this.f1156g = jArr;
        this.f = j9 != -1 ? j + j9 : -1L;
    }

    @Override // F1.f
    public final long b(long j) {
        long j8;
        double d7;
        long j9 = j - this.f1151a;
        if (h() && j9 > this.f1152b) {
            long[] jArr = this.f1156g;
            K0.a.k(jArr);
            double d8 = (j9 * 256.0d) / this.f1155e;
            int f = x.f(jArr, (long) d8, true);
            long j10 = this.f1153c;
            long j11 = (f * j10) / 100;
            long j12 = jArr[f];
            int i7 = f + 1;
            long j13 = (j10 * i7) / 100;
            if (f == 99) {
                j8 = 256;
            } else {
                j8 = jArr[i7];
            }
            if (j12 == j8) {
                d7 = 0.0d;
            } else {
                d7 = (d8 - j12) / (j8 - j12);
            }
            return Math.round(d7 * (j13 - j11)) + j11;
        }
        return 0L;
    }

    @Override // F1.f
    public final long d() {
        return this.f;
    }

    @Override // m1.InterfaceC1426A
    public final boolean h() {
        if (this.f1156g != null) {
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1426A
    public final z j(long j) {
        double d7;
        double d8;
        boolean h8 = h();
        int i7 = this.f1152b;
        long j8 = this.f1151a;
        if (!h8) {
            B b5 = new B(0L, j8 + i7);
            return new z(b5, b5);
        }
        long k2 = x.k(j, 0L, this.f1153c);
        double d9 = (k2 * 100.0d) / this.f1153c;
        double d10 = 0.0d;
        if (d9 > 0.0d) {
            if (d9 >= 100.0d) {
                d8 = 256.0d;
                d10 = 256.0d;
                double d11 = d10 / d8;
                long j9 = this.f1155e;
                B b7 = new B(k2, j8 + x.k(Math.round(d11 * j9), i7, j9 - 1));
                return new z(b7, b7);
            }
            int i8 = (int) d9;
            long[] jArr = this.f1156g;
            K0.a.k(jArr);
            double d12 = jArr[i8];
            if (i8 == 99) {
                d7 = 256.0d;
            } else {
                d7 = jArr[i8 + 1];
            }
            d10 = ((d7 - d12) * (d9 - i8)) + d12;
        }
        d8 = 256.0d;
        double d112 = d10 / d8;
        long j92 = this.f1155e;
        B b72 = new B(k2, j8 + x.k(Math.round(d112 * j92), i7, j92 - 1));
        return new z(b72, b72);
    }

    @Override // F1.f
    public final int k() {
        return this.f1154d;
    }

    @Override // m1.InterfaceC1426A
    public final long l() {
        return this.f1153c;
    }
}
