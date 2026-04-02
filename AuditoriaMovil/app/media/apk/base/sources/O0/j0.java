package O0;

import android.util.Pair;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class j0 extends H0.V {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f3778k = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f3779b;

    /* renamed from: c  reason: collision with root package name */
    public final e1.X f3780c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3781d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3782e;
    public final int[] f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f3783g;

    /* renamed from: h  reason: collision with root package name */
    public final H0.V[] f3784h;

    /* renamed from: i  reason: collision with root package name */
    public final Object[] f3785i;
    public final HashMap j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j0(java.util.List r7, e1.X r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            H0.V[] r0 = new H0.V[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            O0.W r4 = (O0.W) r4
            int r5 = r3 + 1
            H0.V r4 = r4.b()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            O0.W r3 = (O0.W) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.a()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.j0.<init>(java.util.List, e1.X):void");
    }

    @Override // H0.V
    public final int a(boolean z7) {
        if (this.f3779b == 0) {
            return -1;
        }
        int i7 = 0;
        if (z7) {
            int[] iArr = this.f3780c.f10755b;
            if (iArr.length > 0) {
                i7 = iArr[0];
            } else {
                i7 = -1;
            }
        }
        do {
            H0.V[] vArr = this.f3784h;
            if (vArr[i7].p()) {
                i7 = q(i7, z7);
            } else {
                return vArr[i7].a(z7) + this.f3783g[i7];
            }
        } while (i7 != -1);
        return -1;
    }

    @Override // H0.V
    public final int b(Object obj) {
        int intValue;
        int b5;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        if (intValue == -1 || (b5 = this.f3784h[intValue].b(obj3)) == -1) {
            return -1;
        }
        return this.f[intValue] + b5;
    }

    @Override // H0.V
    public final int c(boolean z7) {
        int i7;
        int i8 = this.f3779b;
        if (i8 == 0) {
            return -1;
        }
        if (z7) {
            int[] iArr = this.f3780c.f10755b;
            if (iArr.length > 0) {
                i7 = iArr[iArr.length - 1];
            } else {
                i7 = -1;
            }
        } else {
            i7 = i8 - 1;
        }
        do {
            H0.V[] vArr = this.f3784h;
            if (vArr[i7].p()) {
                i7 = r(i7, z7);
            } else {
                return vArr[i7].c(z7) + this.f3783g[i7];
            }
        } while (i7 != -1);
        return -1;
    }

    @Override // H0.V
    public final int e(int i7, int i8, boolean z7) {
        int[] iArr = this.f3783g;
        int i9 = 0;
        int e7 = K0.x.e(iArr, i7 + 1, false, false);
        int i10 = iArr[e7];
        H0.V[] vArr = this.f3784h;
        H0.V v6 = vArr[e7];
        int i11 = i7 - i10;
        if (i8 != 2) {
            i9 = i8;
        }
        int e8 = v6.e(i11, i9, z7);
        if (e8 != -1) {
            return i10 + e8;
        }
        int q2 = q(e7, z7);
        while (q2 != -1 && vArr[q2].p()) {
            q2 = q(q2, z7);
        }
        if (q2 != -1) {
            return vArr[q2].a(z7) + iArr[q2];
        } else if (i8 != 2) {
            return -1;
        } else {
            return a(z7);
        }
    }

    @Override // H0.V
    public final H0.T f(int i7, H0.T t7, boolean z7) {
        int[] iArr = this.f;
        int e7 = K0.x.e(iArr, i7 + 1, false, false);
        int i8 = this.f3783g[e7];
        this.f3784h[e7].f(i7 - iArr[e7], t7, z7);
        t7.f1718c += i8;
        if (z7) {
            Object obj = this.f3785i[e7];
            Object obj2 = t7.f1717b;
            obj2.getClass();
            t7.f1717b = Pair.create(obj, obj2);
        }
        return t7;
    }

    @Override // H0.V
    public final H0.T g(Object obj, H0.T t7) {
        int intValue;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i7 = this.f3783g[intValue];
        this.f3784h[intValue].g(obj3, t7);
        t7.f1718c += i7;
        t7.f1717b = obj;
        return t7;
    }

    @Override // H0.V
    public final int h() {
        return this.f3782e;
    }

    @Override // H0.V
    public final int k(int i7, int i8, boolean z7) {
        int[] iArr = this.f3783g;
        int i9 = 0;
        int e7 = K0.x.e(iArr, i7 + 1, false, false);
        int i10 = iArr[e7];
        H0.V[] vArr = this.f3784h;
        H0.V v6 = vArr[e7];
        int i11 = i7 - i10;
        if (i8 != 2) {
            i9 = i8;
        }
        int k2 = v6.k(i11, i9, z7);
        if (k2 != -1) {
            return i10 + k2;
        }
        int r7 = r(e7, z7);
        while (r7 != -1 && vArr[r7].p()) {
            r7 = r(r7, z7);
        }
        if (r7 != -1) {
            return vArr[r7].c(z7) + iArr[r7];
        } else if (i8 != 2) {
            return -1;
        } else {
            return c(z7);
        }
    }

    @Override // H0.V
    public final Object l(int i7) {
        int[] iArr = this.f;
        int e7 = K0.x.e(iArr, i7 + 1, false, false);
        return Pair.create(this.f3785i[e7], this.f3784h[e7].l(i7 - iArr[e7]));
    }

    @Override // H0.V
    public final H0.U m(int i7, H0.U u7, long j) {
        int[] iArr = this.f3783g;
        int e7 = K0.x.e(iArr, i7 + 1, false, false);
        int i8 = iArr[e7];
        int i9 = this.f[e7];
        this.f3784h[e7].m(i7 - i8, u7, j);
        Object obj = this.f3785i[e7];
        if (!H0.U.f1722q.equals(u7.f1724a)) {
            obj = Pair.create(obj, u7.f1724a);
        }
        u7.f1724a = obj;
        u7.f1735n += i9;
        u7.f1736o += i9;
        return u7;
    }

    @Override // H0.V
    public final int o() {
        return this.f3781d;
    }

    public final int q(int i7, boolean z7) {
        if (z7) {
            e1.X x7 = this.f3780c;
            int i8 = x7.f10756c[i7] + 1;
            int[] iArr = x7.f10755b;
            if (i8 >= iArr.length) {
                return -1;
            }
            return iArr[i8];
        } else if (i7 >= this.f3779b - 1) {
            return -1;
        } else {
            return i7 + 1;
        }
    }

    public final int r(int i7, boolean z7) {
        if (z7) {
            e1.X x7 = this.f3780c;
            int i8 = x7.f10756c[i7] - 1;
            if (i8 < 0) {
                return -1;
            }
            return x7.f10755b[i8];
        } else if (i7 <= 0) {
            return -1;
        } else {
            return i7 - 1;
        }
    }

    public j0(H0.V[] vArr, Object[] objArr, e1.X x7) {
        this.f3780c = x7;
        this.f3779b = x7.f10755b.length;
        int length = vArr.length;
        this.f3784h = vArr;
        this.f = new int[length];
        this.f3783g = new int[length];
        this.f3785i = objArr;
        this.j = new HashMap();
        int length2 = vArr.length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i7 < length2) {
            H0.V v6 = vArr[i7];
            this.f3784h[i10] = v6;
            this.f3783g[i10] = i8;
            this.f[i10] = i9;
            i8 += v6.o();
            i9 += this.f3784h[i10].h();
            this.j.put(objArr[i10], Integer.valueOf(i10));
            i7++;
            i10++;
        }
        this.f3781d = i8;
        this.f3782e = i9;
    }
}
