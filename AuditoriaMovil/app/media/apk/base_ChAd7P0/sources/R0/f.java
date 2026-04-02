package R0;

import H0.C;
import H0.C0122b;
import H0.C0144y;
import H0.T;
import H0.V;
import K0.x;
/* loaded from: classes.dex */
public final class f extends V {

    /* renamed from: b  reason: collision with root package name */
    public final long f4553b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4554c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4555d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4556e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4557g;

    /* renamed from: h  reason: collision with root package name */
    public final long f4558h;

    /* renamed from: i  reason: collision with root package name */
    public final S0.c f4559i;
    public final C j;

    /* renamed from: k  reason: collision with root package name */
    public final C0144y f4560k;

    public f(long j, long j8, long j9, int i7, long j10, long j11, long j12, S0.c cVar, C c8, C0144y c0144y) {
        boolean z7;
        boolean z8 = cVar.f4850d;
        if (c0144y != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z8 == z7);
        this.f4553b = j;
        this.f4554c = j8;
        this.f4555d = j9;
        this.f4556e = i7;
        this.f = j10;
        this.f4557g = j11;
        this.f4558h = j12;
        this.f4559i = cVar;
        this.j = c8;
        this.f4560k = c0144y;
    }

    @Override // H0.V
    public final int b(Object obj) {
        int intValue;
        if (!(obj instanceof Integer) || (intValue = ((Integer) obj).intValue() - this.f4556e) < 0 || intValue >= h()) {
            return -1;
        }
        return intValue;
    }

    @Override // H0.V
    public final T f(int i7, T t7, boolean z7) {
        String str;
        K0.a.g(i7, h());
        Integer num = null;
        S0.c cVar = this.f4559i;
        if (z7) {
            str = cVar.b(i7).f4878a;
        } else {
            str = null;
        }
        if (z7) {
            num = Integer.valueOf(this.f4556e + i7);
        }
        t7.getClass();
        t7.h(str, num, 0, cVar.d(i7), x.M(cVar.b(i7).f4879b - cVar.b(0).f4879b) - this.f, C0122b.f1785c, false);
        return t7;
    }

    @Override // H0.V
    public final int h() {
        return this.f4559i.f4857m.size();
    }

    @Override // H0.V
    public final Object l(int i7) {
        K0.a.g(i7, h());
        return Integer.valueOf(this.f4556e + i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r7 > r21.f4557g) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    @Override // H0.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final H0.U m(int r22, H0.U r23, long r24) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.f.m(int, H0.U, long):H0.U");
    }

    @Override // H0.V
    public final int o() {
        return 1;
    }
}
