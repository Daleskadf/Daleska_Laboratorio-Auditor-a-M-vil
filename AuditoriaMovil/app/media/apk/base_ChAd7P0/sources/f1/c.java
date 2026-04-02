package F1;

import K0.x;
import android.util.Pair;
import m1.B;
import m1.z;
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f1124a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f1125b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1126c;

    public c(long[] jArr, long[] jArr2, long j) {
        this.f1124a = jArr;
        this.f1125b = jArr2;
        this.f1126c = j == -9223372036854775807L ? x.M(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair a(long[] jArr, long[] jArr2, long j) {
        double d7;
        int f = x.f(jArr, j, true);
        long j8 = jArr[f];
        long j9 = jArr2[f];
        int i7 = f + 1;
        if (i7 == jArr.length) {
            return Pair.create(Long.valueOf(j8), Long.valueOf(j9));
        }
        long j10 = jArr[i7];
        long j11 = jArr2[i7];
        if (j10 == j8) {
            d7 = 0.0d;
        } else {
            d7 = (j - j8) / (j10 - j8);
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d7 * (j11 - j9))) + j9));
    }

    @Override // F1.f
    public final long b(long j) {
        return x.M(((Long) a(this.f1124a, this.f1125b, j).second).longValue());
    }

    @Override // F1.f
    public final long d() {
        return -1L;
    }

    @Override // m1.InterfaceC1426A
    public final boolean h() {
        return true;
    }

    @Override // m1.InterfaceC1426A
    public final z j(long j) {
        Pair a7 = a(this.f1125b, this.f1124a, x.Z(x.k(j, 0L, this.f1126c)));
        B b5 = new B(x.M(((Long) a7.first).longValue()), ((Long) a7.second).longValue());
        return new z(b5, b5);
    }

    @Override // F1.f
    public final int k() {
        return -2147483647;
    }

    @Override // m1.InterfaceC1426A
    public final long l() {
        return this.f1126c;
    }
}
