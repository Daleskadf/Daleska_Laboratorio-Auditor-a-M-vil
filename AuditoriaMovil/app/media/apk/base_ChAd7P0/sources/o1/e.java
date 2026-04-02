package o1;

import K0.x;
import com.google.android.libraries.barhopper.RecognitionOptions;
import m1.B;
import m1.G;
import m1.z;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final G f14540a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14541b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14542c;

    /* renamed from: d  reason: collision with root package name */
    public final long f14543d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14544e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f14545g;

    /* renamed from: h  reason: collision with root package name */
    public int f14546h;

    /* renamed from: i  reason: collision with root package name */
    public int f14547i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public long[] f14548k;

    /* renamed from: l  reason: collision with root package name */
    public int[] f14549l;

    public e(int i7, int i8, long j, int i9, G g3) {
        int i10;
        int i11;
        boolean z7 = true;
        if (i8 != 1 && i8 != 2) {
            z7 = false;
        }
        K0.a.e(z7);
        this.f14543d = j;
        this.f14544e = i9;
        this.f14540a = g3;
        if (i8 == 2) {
            i10 = 1667497984;
        } else {
            i10 = 1651965952;
        }
        int i12 = (((i7 % 10) + 48) << 8) | ((i7 / 10) + 48);
        this.f14541b = i10 | i12;
        if (i8 == 2) {
            i11 = i12 | 1650720768;
        } else {
            i11 = -1;
        }
        this.f14542c = i11;
        this.f14548k = new long[RecognitionOptions.UPC_A];
        this.f14549l = new int[RecognitionOptions.UPC_A];
    }

    public final B a(int i7) {
        return new B(((this.f14543d * 1) / this.f14544e) * this.f14549l[i7], this.f14548k[i7]);
    }

    public final z b(long j) {
        int i7 = (int) (j / ((this.f14543d * 1) / this.f14544e));
        int e7 = x.e(this.f14549l, i7, true, true);
        if (this.f14549l[e7] == i7) {
            B a7 = a(e7);
            return new z(a7, a7);
        }
        B a8 = a(e7);
        int i8 = e7 + 1;
        if (i8 < this.f14548k.length) {
            return new z(a8, a(i8));
        }
        return new z(a8, a8);
    }
}
