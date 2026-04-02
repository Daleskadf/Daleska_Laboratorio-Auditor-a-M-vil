package F1;

import B5.S;
import K0.x;
import java.math.RoundingMode;
import m1.B;
import m1.z;
import org.apache.tika.pipes.PipesConfigBase;
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long f1119a;

    /* renamed from: b  reason: collision with root package name */
    public final S f1120b;

    /* renamed from: c  reason: collision with root package name */
    public final S f1121c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1122d;

    /* renamed from: e  reason: collision with root package name */
    public long f1123e;

    public b(long j, long j8, long j9) {
        this.f1123e = j;
        this.f1119a = j9;
        S s7 = new S(2, (byte) 0);
        this.f1120b = s7;
        S s8 = new S(2, (byte) 0);
        this.f1121c = s8;
        s7.c(0L);
        s8.c(j8);
        int i7 = -2147483647;
        if (j != -9223372036854775807L) {
            long U7 = x.U(j8 - j9, 8L, j, RoundingMode.HALF_UP);
            if (U7 > 0 && U7 <= 2147483647L) {
                i7 = (int) U7;
            }
            this.f1122d = i7;
            return;
        }
        this.f1122d = -2147483647;
    }

    public final boolean a(long j) {
        S s7 = this.f1120b;
        if (j - s7.e(s7.f335b - 1) < PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH) {
            return true;
        }
        return false;
    }

    @Override // F1.f
    public final long b(long j) {
        return this.f1120b.e(x.d(this.f1121c, j));
    }

    @Override // F1.f
    public final long d() {
        return this.f1119a;
    }

    @Override // m1.InterfaceC1426A
    public final boolean h() {
        return true;
    }

    @Override // m1.InterfaceC1426A
    public final z j(long j) {
        S s7 = this.f1120b;
        int d7 = x.d(s7, j);
        long e7 = s7.e(d7);
        S s8 = this.f1121c;
        B b5 = new B(e7, s8.e(d7));
        if (e7 != j && d7 != s7.f335b - 1) {
            int i7 = d7 + 1;
            return new z(b5, new B(s7.e(i7), s8.e(i7)));
        }
        return new z(b5, b5);
    }

    @Override // F1.f
    public final int k() {
        return this.f1122d;
    }

    @Override // m1.InterfaceC1426A
    public final long l() {
        return this.f1123e;
    }
}
