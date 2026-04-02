package m1;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class j implements InterfaceC1426A {

    /* renamed from: a  reason: collision with root package name */
    public final int f13959a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f13960b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f13961c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f13962d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f13963e;
    public final long f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f13960b = iArr;
        this.f13961c = jArr;
        this.f13962d = jArr2;
        this.f13963e = jArr3;
        int length = iArr.length;
        this.f13959a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // m1.InterfaceC1426A
    public final boolean h() {
        return true;
    }

    @Override // m1.InterfaceC1426A
    public final z j(long j) {
        long[] jArr = this.f13963e;
        int f = K0.x.f(jArr, j, true);
        long j8 = jArr[f];
        long[] jArr2 = this.f13961c;
        B b5 = new B(j8, jArr2[f]);
        if (j8 < j && f != this.f13959a - 1) {
            int i7 = f + 1;
            return new z(b5, new B(jArr[i7], jArr2[i7]));
        }
        return new z(b5, b5);
    }

    @Override // m1.InterfaceC1426A
    public final long l() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f13959a + ", sizes=" + Arrays.toString(this.f13960b) + ", offsets=" + Arrays.toString(this.f13961c) + ", timeUs=" + Arrays.toString(this.f13963e) + ", durationsUs=" + Arrays.toString(this.f13962d) + ")";
    }
}
