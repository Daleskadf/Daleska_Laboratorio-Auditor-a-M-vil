package k1;

import java.util.Arrays;
/* renamed from: k1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1389f {

    /* renamed from: a  reason: collision with root package name */
    public long f13592a;

    /* renamed from: b  reason: collision with root package name */
    public long f13593b;

    /* renamed from: c  reason: collision with root package name */
    public long f13594c;

    /* renamed from: d  reason: collision with root package name */
    public long f13595d;

    /* renamed from: e  reason: collision with root package name */
    public long f13596e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean[] f13597g = new boolean[15];

    /* renamed from: h  reason: collision with root package name */
    public int f13598h;

    public final boolean a() {
        if (this.f13595d > 15 && this.f13598h == 0) {
            return true;
        }
        return false;
    }

    public final void b(long j) {
        long j8 = this.f13595d;
        if (j8 == 0) {
            this.f13592a = j;
        } else if (j8 == 1) {
            long j9 = j - this.f13592a;
            this.f13593b = j9;
            this.f = j9;
            this.f13596e = 1L;
        } else {
            long j10 = j - this.f13594c;
            int i7 = (int) (j8 % 15);
            int i8 = (Math.abs(j10 - this.f13593b) > 1000000L ? 1 : (Math.abs(j10 - this.f13593b) == 1000000L ? 0 : -1));
            boolean[] zArr = this.f13597g;
            if (i8 <= 0) {
                this.f13596e++;
                this.f += j10;
                if (zArr[i7]) {
                    zArr[i7] = false;
                    this.f13598h--;
                }
            } else if (!zArr[i7]) {
                zArr[i7] = true;
                this.f13598h++;
            }
        }
        this.f13595d++;
        this.f13594c = j;
    }

    public final void c() {
        this.f13595d = 0L;
        this.f13596e = 0L;
        this.f = 0L;
        this.f13598h = 0;
        Arrays.fill(this.f13597g, false);
    }
}
