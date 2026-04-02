package m1;
/* loaded from: classes.dex */
public final class x implements InterfaceC1426A {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f14009a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f14010b;

    /* renamed from: c  reason: collision with root package name */
    public final long f14011c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14012d;

    public x(long[] jArr, long[] jArr2, long j) {
        boolean z7;
        boolean z8;
        if (jArr.length == jArr2.length) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        int length = jArr2.length;
        if (length > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f14012d = z8;
        if (z8 && jArr2[0] > 0) {
            int i7 = length + 1;
            long[] jArr3 = new long[i7];
            this.f14009a = jArr3;
            long[] jArr4 = new long[i7];
            this.f14010b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f14009a = jArr;
            this.f14010b = jArr2;
        }
        this.f14011c = j;
    }

    @Override // m1.InterfaceC1426A
    public final boolean h() {
        return this.f14012d;
    }

    @Override // m1.InterfaceC1426A
    public final z j(long j) {
        if (!this.f14012d) {
            B b5 = B.f13883c;
            return new z(b5, b5);
        }
        long[] jArr = this.f14010b;
        int f = K0.x.f(jArr, j, true);
        long j8 = jArr[f];
        long[] jArr2 = this.f14009a;
        B b7 = new B(j8, jArr2[f]);
        if (j8 != j && f != jArr.length - 1) {
            int i7 = f + 1;
            return new z(b7, new B(jArr[i7], jArr2[i7]));
        }
        return new z(b7, b7);
    }

    @Override // m1.InterfaceC1426A
    public final long l() {
        return this.f14011c;
    }
}
