package O0;

import H0.C0122b;
import android.util.Pair;
import e1.C0960z;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class V {

    /* renamed from: c  reason: collision with root package name */
    public final P0.d f3636c;

    /* renamed from: d  reason: collision with root package name */
    public final K0.u f3637d;

    /* renamed from: e  reason: collision with root package name */
    public final A.j f3638e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public int f3639g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3640h;

    /* renamed from: i  reason: collision with root package name */
    public T f3641i;
    public T j;

    /* renamed from: k  reason: collision with root package name */
    public T f3642k;

    /* renamed from: l  reason: collision with root package name */
    public int f3643l;

    /* renamed from: m  reason: collision with root package name */
    public Object f3644m;

    /* renamed from: n  reason: collision with root package name */
    public long f3645n;

    /* renamed from: a  reason: collision with root package name */
    public final H0.T f3634a = new H0.T();

    /* renamed from: b  reason: collision with root package name */
    public final H0.U f3635b = new H0.U();

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f3646o = new ArrayList();

    public V(P0.d dVar, K0.u uVar, A.j jVar, C0255q c0255q) {
        this.f3636c = dVar;
        this.f3637d = uVar;
        this.f3638e = jVar;
    }

    public static C0960z l(H0.V v6, Object obj, long j, long j8, H0.U u7, H0.T t7) {
        v6.g(obj, t7);
        v6.n(t7.f1718c, u7);
        v6.b(obj);
        int i7 = t7.f1721g.f1787a;
        if (i7 != 0) {
            if (i7 == 1) {
                t7.f(0);
            }
            t7.f1721g.getClass();
            t7.g(0);
        }
        v6.g(obj, t7);
        int c8 = t7.c(j);
        if (c8 == -1) {
            return new C0960z(obj, j8, t7.b(j));
        }
        return new C0960z(obj, c8, t7.e(c8), j8, -1);
    }

    public final T a() {
        T t7 = this.f3641i;
        if (t7 == null) {
            return null;
        }
        if (t7 == this.j) {
            this.j = t7.f3622l;
        }
        t7.g();
        int i7 = this.f3643l - 1;
        this.f3643l = i7;
        if (i7 == 0) {
            this.f3642k = null;
            T t8 = this.f3641i;
            this.f3644m = t8.f3614b;
            this.f3645n = t8.f.f3626a.f10855d;
        }
        this.f3641i = this.f3641i.f3622l;
        j();
        return this.f3641i;
    }

    public final void b() {
        if (this.f3643l == 0) {
            return;
        }
        T t7 = this.f3641i;
        K0.a.k(t7);
        this.f3644m = t7.f3614b;
        this.f3645n = t7.f.f3626a.f10855d;
        while (t7 != null) {
            t7.g();
            t7 = t7.f3622l;
        }
        this.f3641i = null;
        this.f3642k = null;
        this.j = null;
        this.f3643l = 0;
        j();
    }

    public final U c(H0.V v6, T t7, long j) {
        U f;
        long j8;
        U u7 = t7.f;
        long j9 = (t7.f3625o + u7.f3630e) - j;
        if (u7.f3631g) {
            U u8 = t7.f;
            C0960z c0960z = u8.f3626a;
            int d7 = v6.d(v6.b(c0960z.f10852a), this.f3634a, this.f3635b, this.f3639g, this.f3640h);
            if (d7 != -1) {
                H0.T t8 = this.f3634a;
                int i7 = v6.f(d7, t8, true).f1718c;
                Object obj = t8.f1717b;
                obj.getClass();
                long j10 = c0960z.f10855d;
                long j11 = 0;
                if (v6.m(i7, this.f3635b, 0L).f1735n == d7) {
                    Pair j12 = v6.j(this.f3635b, this.f3634a, i7, -9223372036854775807L, Math.max(0L, j9));
                    if (j12 != null) {
                        obj = j12.first;
                        long longValue = ((Long) j12.second).longValue();
                        T t9 = t7.f3622l;
                        if (t9 != null && t9.f3614b.equals(obj)) {
                            j10 = t9.f.f3626a.f10855d;
                        } else {
                            j10 = n(obj);
                            if (j10 == -1) {
                                j10 = this.f;
                                this.f = 1 + j10;
                            }
                        }
                        j8 = longValue;
                        j11 = -9223372036854775807L;
                    }
                } else {
                    j8 = 0;
                }
                C0960z l8 = l(v6, obj, j8, j10, this.f3635b, this.f3634a);
                if (j11 != -9223372036854775807L && u8.f3628c != -9223372036854775807L) {
                    int i8 = v6.g(c0960z.f10852a, t8).f1721g.f1787a;
                    t8.f1721g.getClass();
                    if (i8 > 0) {
                        t8.g(0);
                    }
                }
                return d(v6, l8, j11, j8);
            }
            return null;
        }
        C0960z c0960z2 = u7.f3626a;
        Object obj2 = c0960z2.f10852a;
        H0.T t10 = this.f3634a;
        v6.g(obj2, t10);
        boolean b5 = c0960z2.b();
        Object obj3 = c0960z2.f10852a;
        if (b5) {
            C0122b c0122b = t10.f1721g;
            int i9 = c0960z2.f10853b;
            int i10 = c0122b.a(i9).f1775a;
            if (i10 != -1) {
                int a7 = t10.f1721g.a(i9).a(c0960z2.f10854c);
                if (a7 < i10) {
                    f = e(v6, c0960z2.f10852a, i9, a7, u7.f3628c, c0960z2.f10855d);
                } else {
                    long j13 = u7.f3628c;
                    if (j13 == -9223372036854775807L) {
                        Pair j14 = v6.j(this.f3635b, t10, t10.f1718c, -9223372036854775807L, Math.max(0L, j9));
                        if (j14 != null) {
                            j13 = ((Long) j14.second).longValue();
                        }
                    }
                    v6.g(obj3, t10);
                    int i11 = c0960z2.f10853b;
                    t10.d(i11);
                    t10.f1721g.a(i11).getClass();
                    f = f(v6, c0960z2.f10852a, Math.max(0L, j13), u7.f3628c, c0960z2.f10855d);
                }
            }
            return null;
        }
        int i12 = c0960z2.f10856e;
        if (i12 != -1) {
            t10.f(i12);
        }
        int e7 = t10.e(i12);
        t10.g(i12);
        if (e7 != t10.f1721g.a(i12).f1775a) {
            f = e(v6, c0960z2.f10852a, c0960z2.f10856e, e7, u7.f3630e, c0960z2.f10855d);
        } else {
            v6.g(obj3, t10);
            t10.d(i12);
            t10.f1721g.a(i12).getClass();
            f = f(v6, c0960z2.f10852a, 0L, u7.f3630e, c0960z2.f10855d);
        }
        return f;
    }

    public final U d(H0.V v6, C0960z c0960z, long j, long j8) {
        v6.g(c0960z.f10852a, this.f3634a);
        if (c0960z.b()) {
            return e(v6, c0960z.f10852a, c0960z.f10853b, c0960z.f10854c, j, c0960z.f10855d);
        }
        return f(v6, c0960z.f10852a, j8, j, c0960z.f10855d);
    }

    public final U e(H0.V v6, Object obj, int i7, int i8, long j, long j8) {
        long j9;
        C0960z c0960z = new C0960z(obj, i7, i8, j8, -1);
        H0.T t7 = this.f3634a;
        long a7 = v6.g(obj, t7).a(i7, i8);
        if (i8 == t7.e(i7)) {
            t7.f1721g.getClass();
        }
        t7.g(i7);
        if (a7 != -9223372036854775807L && 0 >= a7) {
            j9 = Math.max(0L, a7 - 1);
        } else {
            j9 = 0;
        }
        return new U(c0960z, j9, j, -9223372036854775807L, a7, false, false, false, false);
    }

    public final U f(H0.V v6, Object obj, long j, long j8, long j9) {
        long j10;
        long j11;
        long j12;
        H0.T t7 = this.f3634a;
        v6.g(obj, t7);
        int b5 = t7.b(j);
        if (b5 != -1) {
            t7.f(b5);
        }
        boolean z7 = false;
        if (b5 == -1) {
            if (t7.f1721g.f1787a > 0) {
                t7.g(0);
            }
        } else {
            t7.g(b5);
        }
        C0960z c0960z = new C0960z(obj, j9, b5);
        if (!c0960z.b() && b5 == -1) {
            z7 = true;
        }
        boolean i7 = i(v6, c0960z);
        boolean h8 = h(v6, c0960z, z7);
        if (b5 != -1) {
            t7.g(b5);
        }
        if (b5 != -1) {
            t7.d(b5);
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            j11 = j10;
        } else {
            j11 = t7.f1719d;
        }
        if (j11 != -9223372036854775807L && j >= j11) {
            j12 = Math.max(0L, j11 - 1);
        } else {
            j12 = j;
        }
        return new U(c0960z, j12, j8, j10, j11, false, z7, i7, h8);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O0.U g(H0.V r20, O0.U r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            e1.z r3 = r2.f3626a
            boolean r4 = r3.b()
            r5 = -1
            int r6 = r3.f10856e
            if (r4 != 0) goto L16
            if (r6 != r5) goto L16
            r4 = 1
        L14:
            r12 = r4
            goto L18
        L16:
            r4 = 0
            goto L14
        L18:
            boolean r13 = r0.i(r1, r3)
            boolean r14 = r0.h(r1, r3, r12)
            java.lang.Object r4 = r3.f10852a
            H0.T r7 = r0.f3634a
            r1.g(r4, r7)
            boolean r1 = r3.b()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L3b
            if (r6 != r5) goto L35
            goto L3b
        L35:
            r7.d(r6)
            r10 = 0
            goto L3c
        L3b:
            r10 = r8
        L3c:
            boolean r1 = r3.b()
            int r4 = r3.f10853b
            if (r1 == 0) goto L4c
            int r1 = r3.f10854c
            long r8 = r7.a(r4, r1)
        L4a:
            r15 = r8
            goto L5c
        L4c:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L59
            r8 = -9223372036854775808
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 != 0) goto L57
            goto L59
        L57:
            r15 = r10
            goto L5c
        L59:
            long r8 = r7.f1719d
            goto L4a
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L66
            r7.g(r4)
            goto L6b
        L66:
            if (r6 == r5) goto L6b
            r7.g(r6)
        L6b:
            O0.U r17 = new O0.U
            long r4 = r2.f3627b
            long r6 = r2.f3628c
            r18 = 0
            r1 = r17
            r2 = r3
            r3 = r4
            r5 = r6
            r7 = r10
            r9 = r15
            r11 = r18
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.V.g(H0.V, O0.U):O0.U");
    }

    public final boolean h(H0.V v6, C0960z c0960z, boolean z7) {
        int b5 = v6.b(c0960z.f10852a);
        if (v6.m(v6.f(b5, this.f3634a, false).f1718c, this.f3635b, 0L).f1731i) {
            return false;
        }
        if (v6.d(b5, this.f3634a, this.f3635b, this.f3639g, this.f3640h) != -1 || !z7) {
            return false;
        }
        return true;
    }

    public final boolean i(H0.V v6, C0960z c0960z) {
        boolean z7;
        if (!c0960z.b() && c0960z.f10856e == -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            return false;
        }
        Object obj = c0960z.f10852a;
        if (v6.m(v6.g(obj, this.f3634a).f1718c, this.f3635b, 0L).f1736o != v6.b(obj)) {
            return false;
        }
        return true;
    }

    public final void j() {
        C0960z c0960z;
        A3.H o7 = A3.K.o();
        for (T t7 = this.f3641i; t7 != null; t7 = t7.f3622l) {
            o7.a(t7.f.f3626a);
        }
        T t8 = this.j;
        if (t8 == null) {
            c0960z = null;
        } else {
            c0960z = t8.f.f3626a;
        }
        this.f3637d.c(new A.h(this, o7, c0960z, 5));
    }

    public final boolean k(T t7) {
        K0.a.k(t7);
        boolean z7 = false;
        if (t7.equals(this.f3642k)) {
            return false;
        }
        this.f3642k = t7;
        while (true) {
            t7 = t7.f3622l;
            if (t7 == null) {
                break;
            }
            if (t7 == this.j) {
                this.j = this.f3641i;
                z7 = true;
            }
            t7.g();
            this.f3643l--;
        }
        T t8 = this.f3642k;
        t8.getClass();
        if (t8.f3622l != null) {
            t8.b();
            t8.f3622l = null;
            t8.c();
        }
        j();
        return z7;
    }

    public final C0960z m(H0.V v6, Object obj, long j) {
        long n7;
        int b5;
        Object obj2 = obj;
        H0.T t7 = this.f3634a;
        int i7 = v6.g(obj2, t7).f1718c;
        Object obj3 = this.f3644m;
        if (obj3 != null && (b5 = v6.b(obj3)) != -1 && v6.f(b5, t7, false).f1718c == i7) {
            n7 = this.f3645n;
        } else {
            T t8 = this.f3641i;
            while (true) {
                if (t8 != null) {
                    if (t8.f3614b.equals(obj2)) {
                        n7 = t8.f.f3626a.f10855d;
                        break;
                    }
                    t8 = t8.f3622l;
                } else {
                    T t9 = this.f3641i;
                    while (true) {
                        if (t9 != null) {
                            int b7 = v6.b(t9.f3614b);
                            if (b7 != -1 && v6.f(b7, t7, false).f1718c == i7) {
                                n7 = t9.f.f3626a.f10855d;
                                break;
                            }
                            t9 = t9.f3622l;
                        } else {
                            n7 = n(obj2);
                            if (n7 == -1) {
                                n7 = this.f;
                                this.f = 1 + n7;
                                if (this.f3641i == null) {
                                    this.f3644m = obj2;
                                    this.f3645n = n7;
                                }
                            }
                        }
                    }
                }
            }
        }
        long j8 = n7;
        v6.g(obj2, t7);
        int i8 = t7.f1718c;
        H0.U u7 = this.f3635b;
        v6.n(i8, u7);
        boolean z7 = false;
        for (int b8 = v6.b(obj); b8 >= u7.f1735n; b8--) {
            boolean z8 = true;
            v6.f(b8, t7, true);
            if (t7.f1721g.f1787a <= 0) {
                z8 = false;
            }
            z7 |= z8;
            if (t7.c(t7.f1719d) != -1) {
                obj2 = t7.f1717b;
                obj2.getClass();
            }
            if (z7 && (!z8 || t7.f1719d != 0)) {
                break;
            }
        }
        return l(v6, obj2, j, j8, this.f3635b, this.f3634a);
    }

    public final long n(Object obj) {
        for (int i7 = 0; i7 < this.f3646o.size(); i7++) {
            T t7 = (T) this.f3646o.get(i7);
            if (t7.f3614b.equals(obj)) {
                return t7.f.f3626a.f10855d;
            }
        }
        return -1L;
    }

    public final boolean o(H0.V v6) {
        T t7;
        T t8 = this.f3641i;
        if (t8 == null) {
            return true;
        }
        int b5 = v6.b(t8.f3614b);
        while (true) {
            b5 = v6.d(b5, this.f3634a, this.f3635b, this.f3639g, this.f3640h);
            while (true) {
                t8.getClass();
                t7 = t8.f3622l;
                if (t7 == null || t8.f.f3631g) {
                    break;
                }
                t8 = t7;
            }
            if (b5 == -1 || t7 == null || v6.b(t7.f3614b) != b5) {
                break;
            }
            t8 = t7;
        }
        boolean k2 = k(t8);
        t8.f = g(v6, t8.f);
        return !k2;
    }

    public final boolean p(H0.V v6, long j, long j8) {
        U u7;
        long j9;
        boolean z7;
        T t7 = null;
        for (T t8 = this.f3641i; t8 != null; t8 = t8.f3622l) {
            U u8 = t8.f;
            if (t7 == null) {
                u7 = g(v6, u8);
            } else {
                U c8 = c(v6, t7, j);
                if (c8 == null) {
                    return !k(t7);
                }
                if (u8.f3627b == c8.f3627b && u8.f3626a.equals(c8.f3626a)) {
                    u7 = c8;
                } else {
                    return !k(t7);
                }
            }
            t8.f = u7.a(u8.f3628c);
            long j10 = u8.f3630e;
            if (j10 != -9223372036854775807L) {
                long j11 = u7.f3630e;
                if (j10 != j11) {
                    t8.i();
                    if (j11 == -9223372036854775807L) {
                        j9 = Long.MAX_VALUE;
                    } else {
                        j9 = t8.f3625o + j11;
                    }
                    if (t8 == this.j && !t8.f.f && (j8 == Long.MIN_VALUE || j8 >= j9)) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (!k(t8) && !z7) {
                        return true;
                    }
                    return false;
                }
            }
            t7 = t8;
        }
        return true;
    }
}
