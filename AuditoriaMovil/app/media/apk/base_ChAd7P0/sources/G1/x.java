package G1;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final u f1504a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1505b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f1506c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f1507d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1508e;
    public final long[] f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1509g;

    /* renamed from: h  reason: collision with root package name */
    public final long f1510h;

    public x(u uVar, long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, long j) {
        boolean z7;
        boolean z8;
        if (iArr.length == jArr2.length) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        if (jArr.length == jArr2.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        K0.a.e(z8);
        K0.a.e(iArr2.length == jArr2.length);
        this.f1504a = uVar;
        this.f1506c = jArr;
        this.f1507d = iArr;
        this.f1508e = i7;
        this.f = jArr2;
        this.f1509g = iArr2;
        this.f1510h = j;
        this.f1505b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f;
        for (int b5 = K0.x.b(jArr, j, true); b5 < jArr.length; b5++) {
            if ((this.f1509g[b5] & 1) != 0) {
                return b5;
            }
        }
        return -1;
    }
}
