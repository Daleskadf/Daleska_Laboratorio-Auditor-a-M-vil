package F1;

import K0.x;
import m1.B;
import m1.z;
/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f1146a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f1147b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1148c;

    /* renamed from: d  reason: collision with root package name */
    public final long f1149d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1150e;

    public g(long[] jArr, long[] jArr2, long j, long j8, int i7) {
        this.f1146a = jArr;
        this.f1147b = jArr2;
        this.f1148c = j;
        this.f1149d = j8;
        this.f1150e = i7;
    }

    @Override // F1.f
    public final long b(long j) {
        return this.f1146a[x.f(this.f1147b, j, true)];
    }

    @Override // F1.f
    public final long d() {
        return this.f1149d;
    }

    @Override // m1.InterfaceC1426A
    public final boolean h() {
        return true;
    }

    @Override // m1.InterfaceC1426A
    public final z j(long j) {
        long[] jArr = this.f1146a;
        int f = x.f(jArr, j, true);
        long j8 = jArr[f];
        long[] jArr2 = this.f1147b;
        B b5 = new B(j8, jArr2[f]);
        if (j8 < j && f != jArr.length - 1) {
            int i7 = f + 1;
            return new z(b5, new B(jArr[i7], jArr2[i7]));
        }
        return new z(b5, b5);
    }

    @Override // F1.f
    public final int k() {
        return this.f1150e;
    }

    @Override // m1.InterfaceC1426A
    public final long l() {
        return this.f1148c;
    }
}
