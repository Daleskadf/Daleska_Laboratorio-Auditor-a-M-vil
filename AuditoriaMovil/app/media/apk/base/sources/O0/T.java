package O0;

import android.util.Pair;
import e1.C0939d;
import e1.C0953s;
import e1.C0960z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
/* loaded from: classes.dex */
public final class T {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3613a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3614b;

    /* renamed from: c  reason: collision with root package name */
    public final e1.U[] f3615c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3616d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3617e;
    public U f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3618g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean[] f3619h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC0243e[] f3620i;
    public final h1.u j;

    /* renamed from: k  reason: collision with root package name */
    public final d0 f3621k;

    /* renamed from: l  reason: collision with root package name */
    public T f3622l;

    /* renamed from: m  reason: collision with root package name */
    public e1.b0 f3623m;

    /* renamed from: n  reason: collision with root package name */
    public h1.v f3624n;

    /* renamed from: o  reason: collision with root package name */
    public long f3625o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [e1.d] */
    public T(AbstractC0243e[] abstractC0243eArr, long j, h1.u uVar, i1.e eVar, d0 d0Var, U u7, h1.v vVar) {
        this.f3620i = abstractC0243eArr;
        this.f3625o = j;
        this.j = uVar;
        this.f3621k = d0Var;
        C0960z c0960z = u7.f3626a;
        this.f3614b = c0960z.f10852a;
        this.f = u7;
        this.f3623m = e1.b0.f10779d;
        this.f3624n = vVar;
        this.f3615c = new e1.U[abstractC0243eArr.length];
        this.f3619h = new boolean[abstractC0243eArr.length];
        d0Var.getClass();
        int i7 = j0.f3778k;
        Pair pair = (Pair) c0960z.f10852a;
        Object obj = pair.first;
        C0960z a7 = c0960z.a(pair.second);
        c0 c0Var = (c0) d0Var.f3686a.get(obj);
        c0Var.getClass();
        ((HashSet) d0Var.f3692h).add(c0Var);
        b0 b0Var = (b0) ((HashMap) d0Var.f).get(c0Var);
        if (b0Var != null) {
            b0Var.f3669a.e(b0Var.f3670b);
        }
        c0Var.f3676c.add(a7);
        C0953s b5 = c0Var.f3674a.b(a7, eVar, u7.f3627b);
        ((IdentityHashMap) d0Var.f3690e).put(b5, c0Var);
        d0Var.d();
        long j8 = u7.f3629d;
        this.f3613a = j8 != -9223372036854775807L ? new C0939d(b5, true, 0L, j8) : b5;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [e1.x, java.lang.Object] */
    public final long a(h1.v vVar, long j, boolean z7, boolean[] zArr) {
        AbstractC0243e[] abstractC0243eArr;
        Object[] objArr;
        boolean z8;
        int i7 = 0;
        while (true) {
            boolean z9 = true;
            if (i7 >= vVar.f11324a) {
                break;
            }
            if (z7 || !vVar.a(this.f3624n, i7)) {
                z9 = false;
            }
            this.f3619h[i7] = z9;
            i7++;
        }
        int i8 = 0;
        while (true) {
            abstractC0243eArr = this.f3620i;
            int length = abstractC0243eArr.length;
            objArr = this.f3615c;
            if (i8 >= length) {
                break;
            }
            if (abstractC0243eArr[i8].f3700b == -2) {
                objArr[i8] = null;
            }
            i8++;
        }
        b();
        this.f3624n = vVar;
        c();
        long i9 = this.f3613a.i(vVar.f11326c, this.f3619h, this.f3615c, zArr, j);
        for (int i10 = 0; i10 < abstractC0243eArr.length; i10++) {
            if (abstractC0243eArr[i10].f3700b == -2 && this.f3624n.b(i10)) {
                objArr[i10] = new Object();
            }
        }
        this.f3617e = false;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            if (objArr[i11] != null) {
                K0.a.j(vVar.b(i11));
                if (abstractC0243eArr[i11].f3700b != -2) {
                    this.f3617e = true;
                }
            } else {
                if (vVar.f11326c[i11] == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                K0.a.j(z8);
            }
        }
        return i9;
    }

    public final void b() {
        if (this.f3622l == null) {
            int i7 = 0;
            while (true) {
                h1.v vVar = this.f3624n;
                if (i7 < vVar.f11324a) {
                    boolean b5 = vVar.b(i7);
                    h1.r rVar = this.f3624n.f11326c[i7];
                    if (b5 && rVar != null) {
                        rVar.g();
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.f3622l == null) {
            int i7 = 0;
            while (true) {
                h1.v vVar = this.f3624n;
                if (i7 < vVar.f11324a) {
                    boolean b5 = vVar.b(i7);
                    h1.r rVar = this.f3624n.f11326c[i7];
                    if (b5 && rVar != null) {
                        rVar.e();
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, e1.W] */
    public final long d() {
        long j;
        if (!this.f3616d) {
            return this.f.f3627b;
        }
        if (this.f3617e) {
            j = this.f3613a.o();
        } else {
            j = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return this.f.f3630e;
        }
        return j;
    }

    public final long e() {
        return this.f.f3627b + this.f3625o;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, e1.W] */
    public final boolean f() {
        if (this.f3616d && (!this.f3617e || this.f3613a.o() == Long.MIN_VALUE)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [e1.x, java.lang.Object] */
    public final void g() {
        b();
        ?? r02 = this.f3613a;
        try {
            boolean z7 = r02 instanceof C0939d;
            d0 d0Var = this.f3621k;
            if (z7) {
                d0Var.j(((C0939d) r02).f10788a);
            } else {
                d0Var.j(r02);
            }
        } catch (RuntimeException e7) {
            K0.a.o("MediaPeriodHolder", "Period release failed.", e7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x029f, code lost:
        if (A3.B.f81a.c(r9.f11262b, r15.f11262b).c(r9.f11261a, r15.f11261a).e() > 0) goto L115;
     */
    /* JADX WARN: Type inference failed for: r1v18, types: [A3.H, A3.E] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, h1.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h1.v h(float r31, H0.V r32) {
        /*
            Method dump skipped, instructions count: 2005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.T.h(float, H0.V):h1.v");
    }

    public final void i() {
        Object obj = this.f3613a;
        if (obj instanceof C0939d) {
            long j = this.f.f3629d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            C0939d c0939d = (C0939d) obj;
            c0939d.f10792e = 0L;
            c0939d.f = j;
        }
    }
}
