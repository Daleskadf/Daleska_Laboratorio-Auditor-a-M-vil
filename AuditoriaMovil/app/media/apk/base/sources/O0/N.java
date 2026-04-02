package O0;

import D.AbstractC0059i;
import D.RunnableC0053c;
import H0.C0144y;
import H4.e1;
import H4.p1;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.libraries.barhopper.RecognitionOptions;
import e1.C0937b;
import e1.C0960z;
import e1.InterfaceC0957w;
import e1.InterfaceC0958x;
import g1.C1008e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.XMLReaderUtils;
/* loaded from: classes.dex */
public final class N implements Handler.Callback, InterfaceC0957w, f0 {

    /* renamed from: O0  reason: collision with root package name */
    public static final long f3560O0 = K0.x.Z(10000);

    /* renamed from: A0  reason: collision with root package name */
    public int f3561A0;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f3563C0;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f3564D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f3565E0;

    /* renamed from: F0  reason: collision with root package name */
    public int f3566F0;

    /* renamed from: G0  reason: collision with root package name */
    public M f3567G0;

    /* renamed from: H0  reason: collision with root package name */
    public long f3568H0;

    /* renamed from: I0  reason: collision with root package name */
    public long f3569I0;

    /* renamed from: J0  reason: collision with root package name */
    public int f3570J0;

    /* renamed from: K0  reason: collision with root package name */
    public boolean f3571K0;

    /* renamed from: L0  reason: collision with root package name */
    public C0250l f3572L0;

    /* renamed from: N0  reason: collision with root package name */
    public C0255q f3574N0;

    /* renamed from: X  reason: collision with root package name */
    public final i1.d f3575X;

    /* renamed from: Y  reason: collision with root package name */
    public final K0.u f3576Y;

    /* renamed from: Z  reason: collision with root package name */
    public final HandlerThread f3577Z;

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0243e[] f3578a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f3579b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC0243e[] f3580c;

    /* renamed from: d  reason: collision with root package name */
    public final h1.u f3581d;

    /* renamed from: e  reason: collision with root package name */
    public final h1.v f3582e;

    /* renamed from: e0  reason: collision with root package name */
    public final Looper f3583e0;
    public final C0248j f;

    /* renamed from: f0  reason: collision with root package name */
    public final H0.U f3584f0;

    /* renamed from: g0  reason: collision with root package name */
    public final H0.T f3585g0;

    /* renamed from: h0  reason: collision with root package name */
    public final long f3586h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C5.g f3587i0;

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f3588j0;

    /* renamed from: k0  reason: collision with root package name */
    public final K0.s f3589k0;

    /* renamed from: l0  reason: collision with root package name */
    public final C0262y f3590l0;

    /* renamed from: m0  reason: collision with root package name */
    public final V f3591m0;

    /* renamed from: n0  reason: collision with root package name */
    public final d0 f3592n0;

    /* renamed from: o0  reason: collision with root package name */
    public final C0246h f3593o0;

    /* renamed from: p0  reason: collision with root package name */
    public final long f3594p0;
    public final P0.k q0;

    /* renamed from: r0  reason: collision with root package name */
    public l0 f3595r0;

    /* renamed from: s0  reason: collision with root package name */
    public e0 f3596s0;

    /* renamed from: t0  reason: collision with root package name */
    public K f3597t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f3598u0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f3600w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f3601x0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f3603z0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f3562B0 = false;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f3599v0 = false;

    /* renamed from: M0  reason: collision with root package name */
    public long f3573M0 = -9223372036854775807L;

    /* renamed from: y0  reason: collision with root package name */
    public long f3602y0 = -9223372036854775807L;

    public N(AbstractC0243e[] abstractC0243eArr, h1.u uVar, h1.v vVar, C0248j c0248j, i1.d dVar, int i7, P0.d dVar2, l0 l0Var, C0246h c0246h, long j, Looper looper, K0.s sVar, C0262y c0262y, P0.k kVar, C0255q c0255q) {
        this.f3590l0 = c0262y;
        this.f3578a = abstractC0243eArr;
        this.f3581d = uVar;
        this.f3582e = vVar;
        this.f = c0248j;
        this.f3575X = dVar;
        this.f3561A0 = i7;
        this.f3595r0 = l0Var;
        this.f3593o0 = c0246h;
        this.f3594p0 = j;
        this.f3589k0 = sVar;
        this.q0 = kVar;
        this.f3574N0 = c0255q;
        this.f3586h0 = c0248j.f3775g;
        H0.S s7 = H0.V.f1738a;
        e0 i8 = e0.i(vVar);
        this.f3596s0 = i8;
        this.f3597t0 = new K(i8);
        this.f3580c = new AbstractC0243e[abstractC0243eArr.length];
        h1.p pVar = (h1.p) uVar;
        pVar.getClass();
        for (int i9 = 0; i9 < abstractC0243eArr.length; i9++) {
            AbstractC0243e abstractC0243e = abstractC0243eArr[i9];
            abstractC0243e.f3703e = i9;
            abstractC0243e.f = kVar;
            abstractC0243e.f3696X = sVar;
            this.f3580c[i9] = abstractC0243e;
            AbstractC0243e abstractC0243e2 = this.f3580c[i9];
            synchronized (abstractC0243e2.f3699a) {
                abstractC0243e2.f3711l0 = pVar;
            }
        }
        this.f3587i0 = new C5.g(this, sVar);
        this.f3588j0 = new ArrayList();
        this.f3579b = Collections.newSetFromMap(new IdentityHashMap());
        this.f3584f0 = new H0.U();
        this.f3585g0 = new H0.T();
        uVar.f11322a = this;
        uVar.f11323b = dVar;
        this.f3571K0 = true;
        K0.u a7 = sVar.a(looper, null);
        this.f3591m0 = new V(dVar2, a7, new A.j(this, 19), c0255q);
        this.f3592n0 = new d0(this, dVar2, a7, kVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f3577Z = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f3583e0 = looper2;
        this.f3576Y = sVar.a(looper2, this);
    }

    public static Pair G(H0.V v6, M m7, boolean z7, int i7, boolean z8, H0.U u7, H0.T t7) {
        H0.V v7;
        Pair i8;
        int H7;
        H0.V v8 = m7.f3557a;
        if (v6.p()) {
            return null;
        }
        if (v8.p()) {
            v7 = v6;
        } else {
            v7 = v8;
        }
        try {
            i8 = v7.i(u7, t7, m7.f3558b, m7.f3559c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (v6.equals(v7)) {
            return i8;
        }
        if (v6.b(i8.first) != -1) {
            if (v7.g(i8.first, t7).f && v7.m(t7.f1718c, u7, 0L).f1735n == v7.b(i8.first)) {
                return v6.i(u7, t7, v6.g(i8.first, t7).f1718c, m7.f3559c);
            }
            return i8;
        }
        if (z7 && (H7 = H(u7, t7, i7, z8, i8.first, v7, v6)) != -1) {
            return v6.i(u7, t7, H7, -9223372036854775807L);
        }
        return null;
    }

    public static int H(H0.U u7, H0.T t7, int i7, boolean z7, Object obj, H0.V v6, H0.V v7) {
        Object obj2 = v6.m(v6.g(obj, t7).f1718c, u7, 0L).f1724a;
        for (int i8 = 0; i8 < v7.o(); i8++) {
            if (v7.m(i8, u7, 0L).f1724a.equals(obj2)) {
                return i8;
            }
        }
        int b5 = v6.b(obj);
        int h8 = v6.h();
        int i9 = b5;
        int i10 = -1;
        for (int i11 = 0; i11 < h8 && i10 == -1; i11++) {
            i9 = v6.d(i9, t7, u7, i7, z7);
            if (i9 == -1) {
                break;
            }
            i10 = v7.b(v6.l(i9));
        }
        if (i10 == -1) {
            return -1;
        }
        return v7.f(i10, t7, false).f1718c;
    }

    public static void O(AbstractC0243e abstractC0243e, long j) {
        abstractC0243e.f3708i0 = true;
        if (abstractC0243e instanceof C1008e) {
            C1008e c1008e = (C1008e) abstractC0243e;
            K0.a.j(c1008e.f3708i0);
            c1008e.f11098F0 = j;
        }
    }

    public static boolean p(AbstractC0243e abstractC0243e) {
        if (abstractC0243e.f3697Y != 0) {
            return true;
        }
        return false;
    }

    public final void A() {
        h1.v vVar;
        boolean z7;
        float f = this.f3587i0.c().f1701a;
        V v6 = this.f3591m0;
        T t7 = v6.f3641i;
        T t8 = v6.j;
        h1.v vVar2 = null;
        T t9 = t7;
        boolean z8 = true;
        while (t9 != null && t9.f3616d) {
            h1.v h8 = t9.h(f, this.f3596s0.f3713a);
            if (t9 == this.f3591m0.f3641i) {
                vVar = h8;
            } else {
                vVar = vVar2;
            }
            h1.v vVar3 = t9.f3624n;
            if (vVar3 != null) {
                int length = vVar3.f11326c.length;
                h1.r[] rVarArr = h8.f11326c;
                if (length == rVarArr.length) {
                    for (int i7 = 0; i7 < rVarArr.length; i7++) {
                        if (h8.a(vVar3, i7)) {
                        }
                    }
                    if (t9 == t8) {
                        z8 = false;
                    }
                    t9 = t9.f3622l;
                    vVar2 = vVar;
                }
            }
            if (z8) {
                V v7 = this.f3591m0;
                T t10 = v7.f3641i;
                boolean k2 = v7.k(t10);
                boolean[] zArr = new boolean[this.f3578a.length];
                vVar.getClass();
                long a7 = t10.a(vVar, this.f3596s0.f3729s, k2, zArr);
                e0 e0Var = this.f3596s0;
                if (e0Var.f3717e != 4 && a7 != e0Var.f3729s) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                e0 e0Var2 = this.f3596s0;
                this.f3596s0 = n(e0Var2.f3714b, a7, e0Var2.f3715c, e0Var2.f3716d, z7, 5);
                if (z7) {
                    E(a7);
                }
                boolean[] zArr2 = new boolean[this.f3578a.length];
                int i8 = 0;
                while (true) {
                    AbstractC0243e[] abstractC0243eArr = this.f3578a;
                    if (i8 >= abstractC0243eArr.length) {
                        break;
                    }
                    AbstractC0243e abstractC0243e = abstractC0243eArr[i8];
                    boolean p7 = p(abstractC0243e);
                    zArr2[i8] = p7;
                    e1.U u7 = t10.f3615c[i8];
                    if (p7) {
                        if (u7 != abstractC0243e.f3698Z) {
                            c(abstractC0243e);
                        } else if (zArr[i8]) {
                            long j = this.f3568H0;
                            abstractC0243e.f3708i0 = false;
                            abstractC0243e.f3706g0 = j;
                            abstractC0243e.f3707h0 = j;
                            abstractC0243e.o(j, false);
                            i8++;
                        }
                    }
                    i8++;
                }
                e(zArr2, this.f3568H0);
            } else {
                this.f3591m0.k(t9);
                if (t9.f3616d) {
                    t9.a(h8, Math.max(t9.f.f3627b, this.f3568H0 - t9.f3625o), false, new boolean[t9.f3620i.length]);
                }
            }
            j(true);
            if (this.f3596s0.f3717e != 4) {
                r();
                h0();
                this.f3576Y.e(2);
                return;
            }
            return;
        }
    }

    @Override // e1.V
    public final void B(e1.W w2) {
        this.f3576Y.a(9, (InterfaceC0958x) w2).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.N.C(boolean, boolean, boolean, boolean):void");
    }

    public final void D() {
        boolean z7;
        T t7 = this.f3591m0.f3641i;
        if (t7 != null && t7.f.f3632h && this.f3599v0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f3600w0 = z7;
    }

    public final void E(long j) {
        V v6;
        long j8;
        AbstractC0243e[] abstractC0243eArr;
        h1.r[] rVarArr;
        T t7 = this.f3591m0.f3641i;
        if (t7 == null) {
            j8 = 1000000000000L;
        } else {
            j8 = t7.f3625o;
        }
        long j9 = j + j8;
        this.f3568H0 = j9;
        ((m0) this.f3587i0.f587c).b(j9);
        for (AbstractC0243e abstractC0243e : this.f3578a) {
            if (p(abstractC0243e)) {
                long j10 = this.f3568H0;
                abstractC0243e.f3708i0 = false;
                abstractC0243e.f3706g0 = j10;
                abstractC0243e.f3707h0 = j10;
                abstractC0243e.o(j10, false);
            }
        }
        for (T t8 = v6.f3641i; t8 != null; t8 = t8.f3622l) {
            for (h1.r rVar : t8.f3624n.f11326c) {
                if (rVar != null) {
                    rVar.p();
                }
            }
        }
    }

    public final void F(H0.V v6, H0.V v7) {
        if (v6.p() && v7.p()) {
            return;
        }
        ArrayList arrayList = this.f3588j0;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            AbstractC0059i.I(arrayList.get(size));
            throw null;
        }
    }

    public final void I(long j) {
        long j8;
        if (this.f3596s0.f3717e == 3 && !Z()) {
            j8 = 1000;
        } else {
            j8 = f3560O0;
        }
        this.f3576Y.f2522a.sendEmptyMessageAtTime(2, j + j8);
    }

    public final void J(boolean z7) {
        C0960z c0960z = this.f3591m0.f3641i.f.f3626a;
        long L6 = L(c0960z, this.f3596s0.f3729s, true, false);
        if (L6 != this.f3596s0.f3729s) {
            e0 e0Var = this.f3596s0;
            this.f3596s0 = n(c0960z, L6, e0Var.f3715c, e0Var.f3716d, z7, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [e1.x, java.lang.Object] */
    public final void K(M m7) {
        long j;
        boolean z7;
        long j8;
        long j9;
        boolean z8;
        C0960z c0960z;
        long j10;
        long j11;
        boolean z9;
        boolean z10;
        long j12;
        long j13;
        e0 e0Var;
        int i7;
        boolean z11 = true;
        this.f3597t0.c(1);
        Pair G2 = G(this.f3596s0.f3713a, m7, true, this.f3561A0, this.f3562B0, this.f3584f0, this.f3585g0);
        if (G2 == null) {
            Pair g3 = g(this.f3596s0.f3713a);
            c0960z = (C0960z) g3.first;
            long longValue = ((Long) g3.second).longValue();
            z8 = !this.f3596s0.f3713a.p();
            j8 = longValue;
            j9 = -9223372036854775807L;
        } else {
            Object obj = G2.first;
            long longValue2 = ((Long) G2.second).longValue();
            if (m7.f3559c == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                j = longValue2;
            }
            C0960z m8 = this.f3591m0.m(this.f3596s0.f3713a, obj, longValue2);
            if (m8.b()) {
                this.f3596s0.f3713a.g(m8.f10852a, this.f3585g0);
                if (this.f3585g0.e(m8.f10853b) == m8.f10854c) {
                    this.f3585g0.f1721g.getClass();
                }
                j8 = 0;
                j9 = j;
                c0960z = m8;
                z8 = true;
            } else {
                if (m7.f3559c == -9223372036854775807L) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                j8 = longValue2;
                j9 = j;
                z8 = z7;
                c0960z = m8;
            }
        }
        try {
            if (this.f3596s0.f3713a.p()) {
                this.f3567G0 = m7;
            } else if (G2 == null) {
                if (this.f3596s0.f3717e != 1) {
                    Y(4);
                }
                C(false, true, false, true);
            } else {
                if (c0960z.equals(this.f3596s0.f3714b)) {
                    T t7 = this.f3591m0.f3641i;
                    if (t7 != null && t7.f3616d && j8 != 0) {
                        j13 = t7.f3613a.c(j8, this.f3595r0);
                    } else {
                        j13 = j8;
                    }
                    if (K0.x.Z(j13) == K0.x.Z(this.f3596s0.f3729s) && ((i7 = (e0Var = this.f3596s0).f3717e) == 2 || i7 == 3)) {
                        long j14 = e0Var.f3729s;
                        this.f3596s0 = n(c0960z, j14, j9, j14, z8, 2);
                        return;
                    }
                    j11 = j13;
                } else {
                    j11 = j8;
                }
                if (this.f3596s0.f3717e == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                V v6 = this.f3591m0;
                if (v6.f3641i != v6.j) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                long L6 = L(c0960z, j11, z10, z9);
                if (j8 == L6) {
                    z11 = false;
                }
                z8 |= z11;
                try {
                    e0 e0Var2 = this.f3596s0;
                    H0.V v7 = e0Var2.f3713a;
                    i0(v7, c0960z, v7, e0Var2.f3714b, j9, true);
                    j12 = L6;
                    this.f3596s0 = n(c0960z, j12, j9, j12, z8, 2);
                } catch (Throwable th) {
                    th = th;
                    j10 = L6;
                    this.f3596s0 = n(c0960z, j10, j9, j10, z8, 2);
                    throw th;
                }
            }
            j12 = j8;
            this.f3596s0 = n(c0960z, j12, j9, j12, z8, 2);
        } catch (Throwable th2) {
            th = th2;
            j10 = j8;
        }
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [e1.x, java.lang.Object] */
    public final long L(C0960z c0960z, long j, boolean z7, boolean z8) {
        d0();
        j0(false, true);
        if (z8 || this.f3596s0.f3717e == 3) {
            Y(2);
        }
        V v6 = this.f3591m0;
        T t7 = v6.f3641i;
        T t8 = t7;
        while (t8 != null && !c0960z.equals(t8.f.f3626a)) {
            t8 = t8.f3622l;
        }
        if (z7 || t7 != t8 || (t8 != null && t8.f3625o + j < 0)) {
            AbstractC0243e[] abstractC0243eArr = this.f3578a;
            for (AbstractC0243e abstractC0243e : abstractC0243eArr) {
                c(abstractC0243e);
            }
            if (t8 != null) {
                while (v6.f3641i != t8) {
                    v6.a();
                }
                v6.k(t8);
                t8.f3625o = 1000000000000L;
                e(new boolean[abstractC0243eArr.length], v6.j.e());
            }
        }
        if (t8 != null) {
            v6.k(t8);
            if (!t8.f3616d) {
                t8.f = t8.f.b(j);
            } else if (t8.f3617e) {
                ?? r9 = t8.f3613a;
                j = r9.q(j);
                r9.r(j - this.f3586h0);
            }
            E(j);
            r();
        } else {
            v6.b();
            E(j);
        }
        j(false);
        this.f3576Y.e(2);
        return j;
    }

    public final void M(h0 h0Var) {
        Looper looper = h0Var.f;
        Looper looper2 = this.f3583e0;
        K0.u uVar = this.f3576Y;
        if (looper == looper2) {
            synchronized (h0Var) {
            }
            try {
                h0Var.f3758a.b(h0Var.f3761d, h0Var.f3762e);
                h0Var.b(true);
                int i7 = this.f3596s0.f3717e;
                if (i7 == 3 || i7 == 2) {
                    uVar.e(2);
                    return;
                }
                return;
            } catch (Throwable th) {
                h0Var.b(true);
                throw th;
            }
        }
        uVar.a(15, h0Var).b();
    }

    public final void N(h0 h0Var) {
        Looper looper = h0Var.f;
        if (!looper.getThread().isAlive()) {
            K0.a.A("TAG", "Trying to send message on a dead thread.");
            h0Var.b(false);
            return;
        }
        this.f3589k0.a(looper, null).c(new RunnableC0053c(11, this, h0Var));
    }

    public final void P(AtomicBoolean atomicBoolean, boolean z7) {
        AbstractC0243e[] abstractC0243eArr;
        if (this.f3563C0 != z7) {
            this.f3563C0 = z7;
            if (!z7) {
                for (AbstractC0243e abstractC0243e : this.f3578a) {
                    if (!p(abstractC0243e) && this.f3579b.remove(abstractC0243e)) {
                        abstractC0243e.x();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void Q(J j) {
        this.f3597t0.c(1);
        int i7 = j.f3545c;
        ArrayList arrayList = j.f3543a;
        e1.X x7 = j.f3544b;
        if (i7 != -1) {
            this.f3567G0 = new M(new j0(arrayList, x7), j.f3545c, j.f3546d);
        }
        d0 d0Var = this.f3592n0;
        ArrayList arrayList2 = (ArrayList) d0Var.f3689d;
        d0Var.k(0, arrayList2.size());
        k(d0Var.a(arrayList2.size(), arrayList, x7), false);
    }

    public final void R(boolean z7) {
        this.f3599v0 = z7;
        D();
        if (this.f3600w0) {
            V v6 = this.f3591m0;
            if (v6.j != v6.f3641i) {
                J(true);
                j(false);
            }
        }
    }

    public final void S(int i7, int i8, boolean z7, boolean z8) {
        h1.r[] rVarArr;
        this.f3597t0.c(z8 ? 1 : 0);
        this.f3596s0 = this.f3596s0.d(i8, i7, z7);
        j0(false, false);
        for (T t7 = this.f3591m0.f3641i; t7 != null; t7 = t7.f3622l) {
            for (h1.r rVar : t7.f3624n.f11326c) {
                if (rVar != null) {
                    rVar.b(z7);
                }
            }
        }
        if (!Z()) {
            d0();
            h0();
            return;
        }
        int i9 = this.f3596s0.f3717e;
        K0.u uVar = this.f3576Y;
        if (i9 == 3) {
            C5.g gVar = this.f3587i0;
            gVar.f586b = true;
            ((m0) gVar.f587c).f();
            b0();
            uVar.e(2);
        } else if (i9 == 2) {
            uVar.e(2);
        }
    }

    public final void T(H0.L l8) {
        this.f3576Y.d(16);
        C5.g gVar = this.f3587i0;
        gVar.e(l8);
        H0.L c8 = gVar.c();
        m(c8, c8.f1701a, true, true);
    }

    public final void U(C0255q c0255q) {
        this.f3574N0 = c0255q;
        H0.V v6 = this.f3596s0.f3713a;
        V v7 = this.f3591m0;
        v7.getClass();
        c0255q.getClass();
        if (!v7.f3646o.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < v7.f3646o.size(); i7++) {
                ((T) v7.f3646o.get(i7)).g();
            }
            v7.f3646o = arrayList;
        }
    }

    public final void V(int i7) {
        this.f3561A0 = i7;
        H0.V v6 = this.f3596s0.f3713a;
        V v7 = this.f3591m0;
        v7.f3639g = i7;
        if (!v7.o(v6)) {
            J(true);
        }
        j(false);
    }

    public final void W(boolean z7) {
        this.f3562B0 = z7;
        H0.V v6 = this.f3596s0.f3713a;
        V v7 = this.f3591m0;
        v7.f3640h = z7;
        if (!v7.o(v6)) {
            J(true);
        }
        j(false);
    }

    public final void X(e1.X x7) {
        this.f3597t0.c(1);
        d0 d0Var = this.f3592n0;
        int size = ((ArrayList) d0Var.f3689d).size();
        if (x7.f10755b.length != size) {
            x7 = new e1.X(new Random(x7.f10754a.nextLong())).a(size);
        }
        d0Var.f3694k = x7;
        k(d0Var.b(), false);
    }

    public final void Y(int i7) {
        e0 e0Var = this.f3596s0;
        if (e0Var.f3717e != i7) {
            if (i7 != 2) {
                this.f3573M0 = -9223372036854775807L;
            }
            this.f3596s0 = e0Var.g(i7);
        }
    }

    public final boolean Z() {
        e0 e0Var = this.f3596s0;
        if (e0Var.f3722l && e0Var.f3724n == 0) {
            return true;
        }
        return false;
    }

    @Override // e1.InterfaceC0957w
    public final void a(InterfaceC0958x interfaceC0958x) {
        this.f3576Y.a(8, interfaceC0958x).b();
    }

    public final boolean a0(H0.V v6, C0960z c0960z) {
        if (c0960z.b() || v6.p()) {
            return false;
        }
        int i7 = v6.g(c0960z.f10852a, this.f3585g0).f1718c;
        H0.U u7 = this.f3584f0;
        v6.n(i7, u7);
        if (!u7.a() || !u7.f1731i || u7.f == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    public final void b(J j, int i7) {
        this.f3597t0.c(1);
        d0 d0Var = this.f3592n0;
        if (i7 == -1) {
            i7 = ((ArrayList) d0Var.f3689d).size();
        }
        k(d0Var.a(i7, j.f3543a, j.f3544b), false);
    }

    public final void b0() {
        T t7 = this.f3591m0.f3641i;
        if (t7 == null) {
            return;
        }
        h1.v vVar = t7.f3624n;
        int i7 = 0;
        while (true) {
            AbstractC0243e[] abstractC0243eArr = this.f3578a;
            if (i7 < abstractC0243eArr.length) {
                if (vVar.b(i7)) {
                    AbstractC0243e abstractC0243e = abstractC0243eArr[i7];
                    int i8 = abstractC0243e.f3697Y;
                    boolean z7 = true;
                    if (i8 == 1) {
                        if (i8 != 1) {
                            z7 = false;
                        }
                        K0.a.j(z7);
                        abstractC0243e.f3697Y = 2;
                        abstractC0243e.r();
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void c(AbstractC0243e abstractC0243e) {
        boolean z7;
        boolean z8;
        if (!p(abstractC0243e)) {
            return;
        }
        C5.g gVar = this.f3587i0;
        if (abstractC0243e == ((AbstractC0243e) gVar.f589e)) {
            gVar.f = null;
            gVar.f589e = null;
            gVar.f585a = true;
        }
        int i7 = abstractC0243e.f3697Y;
        if (i7 == 2) {
            if (i7 == 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            K0.a.j(z8);
            abstractC0243e.f3697Y = 1;
            abstractC0243e.s();
        }
        if (abstractC0243e.f3697Y == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        abstractC0243e.f3701c.t();
        abstractC0243e.f3697Y = 0;
        abstractC0243e.f3698Z = null;
        abstractC0243e.f3704e0 = null;
        abstractC0243e.f3708i0 = false;
        abstractC0243e.m();
        this.f3566F0--;
    }

    public final void c0(boolean z7, boolean z8) {
        boolean z9;
        if (!z7 && this.f3563C0) {
            z9 = false;
        } else {
            z9 = true;
        }
        C(z9, false, true, false);
        this.f3597t0.c(z8 ? 1 : 0);
        C0248j c0248j = this.f;
        if (c0248j.f3776h.remove(this.q0) != null) {
            c0248j.d();
        }
        Y(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:361:0x05bc, code lost:
        if (r2 >= r6.b()) goto L266;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x035d A[EDGE_INSN: B:461:0x035d->B:200:0x035d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0179  */
    /* JADX WARN: Type inference failed for: r0v65, types: [h1.v] */
    /* JADX WARN: Type inference failed for: r1v2, types: [e1.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v82, types: [e1.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v93, types: [e1.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57, types: [int] */
    /* JADX WARN: Type inference failed for: r3v26, types: [e1.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v75, types: [java.lang.Object, e1.W] */
    /* JADX WARN: Type inference failed for: r4v82, types: [h1.r[]] */
    /* JADX WARN: Type inference failed for: r4v83, types: [h1.r] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [int] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32, types: [int] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 1889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.N.d():void");
    }

    public final void d0() {
        AbstractC0243e[] abstractC0243eArr;
        int i7;
        boolean z7;
        C5.g gVar = this.f3587i0;
        gVar.f586b = false;
        m0 m0Var = (m0) gVar.f587c;
        if (m0Var.f3803b) {
            m0Var.b(m0Var.d());
            m0Var.f3803b = false;
        }
        for (AbstractC0243e abstractC0243e : this.f3578a) {
            if (p(abstractC0243e) && (i7 = abstractC0243e.f3697Y) == 2) {
                if (i7 == 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                K0.a.j(z7);
                abstractC0243e.f3697Y = 1;
                abstractC0243e.s();
            }
        }
    }

    public final void e(boolean[] zArr, long j) {
        AbstractC0243e[] abstractC0243eArr;
        Set set;
        int i7;
        V v6;
        T t7;
        h1.v vVar;
        Set set2;
        boolean z7;
        int i8;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        S s7;
        V v7 = this.f3591m0;
        T t8 = v7.j;
        h1.v vVar2 = t8.f3624n;
        int i9 = 0;
        while (true) {
            abstractC0243eArr = this.f3578a;
            int length = abstractC0243eArr.length;
            set = this.f3579b;
            if (i9 >= length) {
                break;
            }
            if (!vVar2.b(i9) && set.remove(abstractC0243eArr[i9])) {
                abstractC0243eArr[i9].x();
            }
            i9++;
        }
        int i10 = 0;
        while (i10 < abstractC0243eArr.length) {
            if (vVar2.b(i10)) {
                boolean z12 = zArr[i10];
                AbstractC0243e abstractC0243e = abstractC0243eArr[i10];
                if (!p(abstractC0243e)) {
                    T t9 = v7.j;
                    if (t9 == v7.f3641i) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    h1.v vVar3 = t9.f3624n;
                    k0 k0Var = vVar3.f11325b[i10];
                    h1.r rVar = vVar3.f11326c[i10];
                    if (rVar != null) {
                        v6 = v7;
                        i8 = rVar.length();
                    } else {
                        v6 = v7;
                        i8 = 0;
                    }
                    H0.r[] rVarArr = new H0.r[i8];
                    vVar = vVar2;
                    for (int i11 = 0; i11 < i8; i11++) {
                        rVarArr[i11] = rVar.d(i11);
                    }
                    if (Z() && this.f3596s0.f3717e == 3) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (!z12 && z8) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    this.f3566F0++;
                    set.add(abstractC0243e);
                    e1.U u7 = t9.f3615c[i10];
                    t7 = t8;
                    boolean z13 = z8;
                    long j8 = t9.f3625o;
                    U u8 = t9.f;
                    if (abstractC0243e.f3697Y == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    K0.a.j(z10);
                    abstractC0243e.f3702d = k0Var;
                    abstractC0243e.f3697Y = 1;
                    abstractC0243e.n(z9, z7);
                    boolean z14 = z7;
                    i7 = i10;
                    set2 = set;
                    abstractC0243e.w(rVarArr, u7, j, j8, u8.f3626a);
                    abstractC0243e.f3708i0 = false;
                    abstractC0243e.f3706g0 = j;
                    abstractC0243e.f3707h0 = j;
                    abstractC0243e.o(j, z9);
                    abstractC0243e.b(11, new I(this));
                    C5.g gVar = this.f3587i0;
                    gVar.getClass();
                    S h8 = abstractC0243e.h();
                    if (h8 != null && h8 != (s7 = (S) gVar.f)) {
                        if (s7 == null) {
                            gVar.f = h8;
                            gVar.f589e = abstractC0243e;
                            ((Q0.L) h8).e(((m0) gVar.f587c).f3806e);
                        } else {
                            throw new C0250l(2, new IllegalStateException("Multiple renderer media clocks enabled."), PipesIterator.DEFAULT_QUEUE_SIZE);
                        }
                    }
                    if (z13 && z14) {
                        if (abstractC0243e.f3697Y == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        K0.a.j(z11);
                        abstractC0243e.f3697Y = 2;
                        abstractC0243e.r();
                    }
                    i10 = i7 + 1;
                    set = set2;
                    v7 = v6;
                    vVar2 = vVar;
                    t8 = t7;
                }
            }
            i7 = i10;
            v6 = v7;
            t7 = t8;
            vVar = vVar2;
            set2 = set;
            i10 = i7 + 1;
            set = set2;
            v7 = v6;
            vVar2 = vVar;
            t8 = t7;
        }
        t8.f3618g = true;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, e1.W] */
    public final void e0() {
        boolean z7;
        T t7 = this.f3591m0.f3642k;
        if (!this.f3603z0 && (t7 == null || !t7.f3613a.d())) {
            z7 = false;
        } else {
            z7 = true;
        }
        boolean z8 = z7;
        e0 e0Var = this.f3596s0;
        if (z8 != e0Var.f3718g) {
            this.f3596s0 = new e0(e0Var.f3713a, e0Var.f3714b, e0Var.f3715c, e0Var.f3716d, e0Var.f3717e, e0Var.f, z8, e0Var.f3719h, e0Var.f3720i, e0Var.j, e0Var.f3721k, e0Var.f3722l, e0Var.f3723m, e0Var.f3724n, e0Var.f3725o, e0Var.f3727q, e0Var.f3728r, e0Var.f3729s, e0Var.f3730t, e0Var.f3726p);
        }
    }

    public final long f(H0.V v6, Object obj, long j) {
        H0.T t7 = this.f3585g0;
        int i7 = v6.g(obj, t7).f1718c;
        H0.U u7 = this.f3584f0;
        v6.n(i7, u7);
        if (u7.f == -9223372036854775807L || !u7.a() || !u7.f1731i) {
            return -9223372036854775807L;
        }
        return K0.x.M(K0.x.z(u7.f1729g) - u7.f) - (j + t7.f1720e);
    }

    public final void f0(h1.v vVar) {
        H0.V v6 = this.f3596s0.f3713a;
        h1.r[] rVarArr = vVar.f11326c;
        C0248j c0248j = this.f;
        C0247i c0247i = (C0247i) c0248j.f3776h.get(this.q0);
        c0247i.getClass();
        int i7 = c0248j.f;
        if (i7 == -1) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                AbstractC0243e[] abstractC0243eArr = this.f3578a;
                int i10 = 13107200;
                if (i8 < abstractC0243eArr.length) {
                    if (rVarArr[i8] != null) {
                        switch (abstractC0243eArr[i8].f3700b) {
                            case 0:
                                i10 = 144310272;
                                break;
                            case 1:
                                break;
                            case 2:
                                i10 = 131072000;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i10 = 131072;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        i9 += i10;
                    }
                    i8++;
                } else {
                    i7 = Math.max(13107200, i9);
                }
            }
        }
        c0247i.f3767b = i7;
        c0248j.d();
    }

    public final Pair g(H0.V v6) {
        long j = 0;
        if (v6.p()) {
            return Pair.create(e0.f3712u, 0L);
        }
        Pair i7 = v6.i(this.f3584f0, this.f3585g0, v6.a(this.f3562B0), -9223372036854775807L);
        C0960z m7 = this.f3591m0.m(v6, i7.first, 0L);
        long longValue = ((Long) i7.second).longValue();
        if (m7.b()) {
            Object obj = m7.f10852a;
            H0.T t7 = this.f3585g0;
            v6.g(obj, t7);
            if (m7.f10854c == t7.e(m7.f10853b)) {
                t7.f1721g.getClass();
            }
        } else {
            j = longValue;
        }
        return Pair.create(m7, Long.valueOf(j));
    }

    public final void g0(int i7, int i8, List list) {
        boolean z7;
        boolean z8 = true;
        this.f3597t0.c(1);
        d0 d0Var = this.f3592n0;
        d0Var.getClass();
        ArrayList arrayList = (ArrayList) d0Var.f3689d;
        if (i7 >= 0 && i7 <= i8 && i8 <= arrayList.size()) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        if (list.size() != i8 - i7) {
            z8 = false;
        }
        K0.a.e(z8);
        for (int i9 = i7; i9 < i8; i9++) {
            ((c0) arrayList.get(i9)).f3674a.t((H0.C) list.get(i9 - i7));
        }
        k(d0Var.b(), false);
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, e1.W] */
    public final void h(InterfaceC0958x interfaceC0958x) {
        boolean z7;
        T t7 = this.f3591m0.f3642k;
        if (t7 != null && t7.f3613a == interfaceC0958x) {
            long j = this.f3568H0;
            if (t7 != null) {
                if (t7.f3622l == null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                K0.a.j(z7);
                if (t7.f3616d) {
                    t7.f3613a.t(j - t7.f3625o);
                }
            }
            r();
        }
    }

    /* JADX WARN: Type inference failed for: r1v35, types: [e1.x, java.lang.Object] */
    public final void h0() {
        long j;
        boolean z7;
        long max;
        long max2;
        long j8;
        long max3;
        T t7 = this.f3591m0.f3641i;
        if (t7 == null) {
            return;
        }
        if (t7.f3616d) {
            j = t7.f3613a.l();
        } else {
            j = -9223372036854775807L;
        }
        if (j != -9223372036854775807L) {
            if (!t7.f()) {
                this.f3591m0.k(t7);
                j(false);
                r();
            }
            E(j);
            if (j != this.f3596s0.f3729s) {
                e0 e0Var = this.f3596s0;
                this.f3596s0 = n(e0Var.f3714b, j, e0Var.f3715c, j, true, 5);
            }
        } else {
            C5.g gVar = this.f3587i0;
            if (t7 != this.f3591m0.j) {
                z7 = true;
            } else {
                z7 = false;
            }
            AbstractC0243e abstractC0243e = (AbstractC0243e) gVar.f589e;
            m0 m0Var = (m0) gVar.f587c;
            if (abstractC0243e != null && !abstractC0243e.k() && ((!z7 || ((AbstractC0243e) gVar.f589e).f3697Y == 2) && (((AbstractC0243e) gVar.f589e).l() || (!z7 && !((AbstractC0243e) gVar.f589e).j())))) {
                S s7 = (S) gVar.f;
                s7.getClass();
                long d7 = s7.d();
                if (gVar.f585a) {
                    if (d7 < m0Var.d()) {
                        if (m0Var.f3803b) {
                            m0Var.b(m0Var.d());
                            m0Var.f3803b = false;
                        }
                    } else {
                        gVar.f585a = false;
                        if (gVar.f586b) {
                            m0Var.f();
                        }
                    }
                }
                m0Var.b(d7);
                H0.L c8 = s7.c();
                if (!c8.equals(m0Var.f3806e)) {
                    m0Var.e(c8);
                    ((N) gVar.f588d).f3576Y.a(16, c8).b();
                }
            } else {
                gVar.f585a = true;
                if (gVar.f586b) {
                    m0Var.f();
                }
            }
            long d8 = gVar.d();
            this.f3568H0 = d8;
            long j9 = d8 - t7.f3625o;
            long j10 = this.f3596s0.f3729s;
            if (!this.f3588j0.isEmpty() && !this.f3596s0.f3714b.b()) {
                if (this.f3571K0) {
                    this.f3571K0 = false;
                }
                e0 e0Var2 = this.f3596s0;
                e0Var2.f3713a.b(e0Var2.f3714b.f10852a);
                int min = Math.min(this.f3570J0, this.f3588j0.size());
                if (min > 0 && this.f3588j0.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < this.f3588j0.size() && this.f3588j0.get(min) != null) {
                    throw new ClassCastException();
                }
                this.f3570J0 = min;
            }
            if (this.f3587i0.a()) {
                boolean z8 = !this.f3597t0.f3549c;
                e0 e0Var3 = this.f3596s0;
                this.f3596s0 = n(e0Var3.f3714b, j9, e0Var3.f3715c, j9, z8, 6);
            } else {
                e0 e0Var4 = this.f3596s0;
                e0Var4.f3729s = j9;
                e0Var4.f3730t = SystemClock.elapsedRealtime();
            }
        }
        this.f3596s0.f3727q = this.f3591m0.f3642k.d();
        e0 e0Var5 = this.f3596s0;
        long j11 = e0Var5.f3727q;
        T t8 = this.f3591m0.f3642k;
        if (t8 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j11 - (this.f3568H0 - t8.f3625o));
        }
        e0Var5.f3728r = max;
        e0 e0Var6 = this.f3596s0;
        if (e0Var6.f3722l && e0Var6.f3717e == 3 && a0(e0Var6.f3713a, e0Var6.f3714b)) {
            e0 e0Var7 = this.f3596s0;
            float f = 1.0f;
            if (e0Var7.f3725o.f1701a == 1.0f) {
                C0246h c0246h = this.f3593o0;
                long f4 = f(e0Var7.f3713a, e0Var7.f3714b.f10852a, e0Var7.f3729s);
                long j12 = this.f3596s0.f3727q;
                T t9 = this.f3591m0.f3642k;
                if (t9 == null) {
                    max2 = 0;
                } else {
                    max2 = Math.max(0L, j12 - (this.f3568H0 - t9.f3625o));
                }
                if (c0246h.f3748c != -9223372036854775807L) {
                    long j13 = f4 - max2;
                    if (c0246h.f3756m == -9223372036854775807L) {
                        c0246h.f3756m = j13;
                        c0246h.f3757n = 0L;
                    } else {
                        c0246h.f3756m = Math.max(j13, (((float) j13) * 9.999871E-4f) + (((float) j8) * 0.999f));
                        c0246h.f3757n = (9.999871E-4f * ((float) Math.abs(j13 - max3))) + (0.999f * ((float) c0246h.f3757n));
                    }
                    if (c0246h.f3755l != -9223372036854775807L && SystemClock.elapsedRealtime() - c0246h.f3755l < 1000) {
                        f = c0246h.f3754k;
                    } else {
                        c0246h.f3755l = SystemClock.elapsedRealtime();
                        long j14 = (c0246h.f3757n * 3) + c0246h.f3756m;
                        if (c0246h.f3752h > j14) {
                            float M7 = (float) K0.x.M(1000L);
                            long[] jArr = {j14, c0246h.f3750e, c0246h.f3752h - (((c0246h.f3754k - 1.0f) * M7) + ((c0246h.f3753i - 1.0f) * M7))};
                            long j15 = jArr[0];
                            for (int i7 = 1; i7 < 3; i7++) {
                                long j16 = jArr[i7];
                                if (j16 > j15) {
                                    j15 = j16;
                                }
                            }
                            c0246h.f3752h = j15;
                        } else {
                            long k2 = K0.x.k(f4 - (Math.max(0.0f, c0246h.f3754k - 1.0f) / 1.0E-7f), c0246h.f3752h, j14);
                            c0246h.f3752h = k2;
                            long j17 = c0246h.f3751g;
                            if (j17 != -9223372036854775807L && k2 > j17) {
                                c0246h.f3752h = j17;
                            }
                        }
                        long j18 = f4 - c0246h.f3752h;
                        if (Math.abs(j18) < c0246h.f3746a) {
                            c0246h.f3754k = 1.0f;
                        } else {
                            c0246h.f3754k = K0.x.i((1.0E-7f * ((float) j18)) + 1.0f, c0246h.j, c0246h.f3753i);
                        }
                        f = c0246h.f3754k;
                    }
                }
                if (this.f3587i0.c().f1701a != f) {
                    H0.L l8 = new H0.L(f, this.f3596s0.f3725o.f1702b);
                    this.f3576Y.d(16);
                    this.f3587i0.e(l8);
                    m(this.f3596s0.f3725o, this.f3587i0.c().f1701a, false, false);
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        V v6;
        boolean z7;
        T t7;
        int i7;
        T t8;
        int i8;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int i9 = PipesIterator.DEFAULT_QUEUE_SIZE;
        try {
            switch (message.what) {
                case 1:
                    if (message.arg1 != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i10 = message.arg2;
                    S(i10 >> 4, i10 & 15, z8, true);
                    break;
                case 2:
                    d();
                    break;
                case 3:
                    K((M) message.obj);
                    break;
                case 4:
                    T((H0.L) message.obj);
                    break;
                case 5:
                    this.f3595r0 = (l0) message.obj;
                    break;
                case 6:
                    c0(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    l((InterfaceC0958x) message.obj);
                    break;
                case 9:
                    h((InterfaceC0958x) message.obj);
                    break;
                case 10:
                    A();
                    break;
                case 11:
                    V(message.arg1);
                    break;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (message.arg1 != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    W(z9);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    P((AtomicBoolean) message.obj, z10);
                    break;
                case 14:
                    h0 h0Var = (h0) message.obj;
                    h0Var.getClass();
                    M(h0Var);
                    break;
                case 15:
                    N((h0) message.obj);
                    break;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    H0.L l8 = (H0.L) message.obj;
                    m(l8, l8.f1701a, true, false);
                    break;
                case 17:
                    Q((J) message.obj);
                    break;
                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    b((J) message.obj, message.arg1);
                    break;
                case 19:
                    AbstractC0059i.I(message.obj);
                    u();
                    throw null;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    z(message.arg1, message.arg2, (e1.X) message.obj);
                    break;
                case 21:
                    X((e1.X) message.obj);
                    break;
                case 22:
                    t();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    R(z11);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    A();
                    J(true);
                    break;
                case 26:
                    A();
                    J(true);
                    break;
                case 27:
                    g0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    U((C0255q) message.obj);
                    break;
                case 29:
                    v();
                    break;
            }
        } catch (H0.J e7) {
            boolean z12 = e7.f1696a;
            int i11 = e7.f1697b;
            if (i11 == 1) {
                if (z12) {
                    i8 = 3001;
                } else {
                    i8 = 3003;
                }
            } else {
                if (i11 == 4) {
                    if (z12) {
                        i8 = 3002;
                    } else {
                        i8 = 3004;
                    }
                }
                i(e7, i9);
            }
            i9 = i8;
            i(e7, i9);
        } catch (M0.i e8) {
            i(e8, e8.f3159a);
        } catch (C0250l e9) {
            C0250l c0250l = e9;
            int i12 = c0250l.f3794c;
            V v7 = this.f3591m0;
            if (i12 == 1 && (t8 = v7.j) != null) {
                v6 = v7;
                c0250l = new C0250l(c0250l.getMessage(), c0250l.getCause(), c0250l.f1698a, c0250l.f3794c, c0250l.f3795d, c0250l.f3796e, c0250l.f, c0250l.f3791X, t8.f.f3626a, c0250l.f1699b, c0250l.f3793Z);
            } else {
                v6 = v7;
            }
            if (c0250l.f3793Z && (this.f3572L0 == null || (i7 = c0250l.f1698a) == 5004 || i7 == 5003)) {
                K0.a.B("ExoPlayerImplInternal", "Recoverable renderer error", c0250l);
                C0250l c0250l2 = this.f3572L0;
                if (c0250l2 != null) {
                    c0250l2.addSuppressed(c0250l);
                    c0250l = this.f3572L0;
                } else {
                    this.f3572L0 = c0250l;
                }
                K0.u uVar = this.f3576Y;
                K0.t a7 = uVar.a(25, c0250l);
                uVar.getClass();
                Message message2 = a7.f2520a;
                message2.getClass();
                uVar.f2522a.sendMessageAtFrontOfQueue(message2);
                a7.a();
                z7 = true;
            } else {
                C0250l c0250l3 = this.f3572L0;
                if (c0250l3 != null) {
                    c0250l3.addSuppressed(c0250l);
                    c0250l = this.f3572L0;
                }
                C0250l c0250l4 = c0250l;
                K0.a.o("ExoPlayerImplInternal", "Playback error", c0250l4);
                if (c0250l4.f3794c == 1) {
                    V v8 = v6;
                    if (v8.f3641i != v8.j) {
                        while (true) {
                            t7 = v8.f3641i;
                            if (t7 == v8.j) {
                                break;
                            }
                            v8.a();
                        }
                        t7.getClass();
                        s();
                        U u7 = t7.f;
                        C0960z c0960z = u7.f3626a;
                        long j = u7.f3627b;
                        this.f3596s0 = n(c0960z, j, u7.f3628c, j, true, 0);
                    }
                    z7 = true;
                } else {
                    z7 = true;
                }
                c0(z7, false);
                this.f3596s0 = this.f3596s0.e(c0250l4);
            }
        } catch (T0.b e10) {
            i(e10, e10.f5285a);
        } catch (C0937b e11) {
            i(e11, 1002);
        } catch (IOException e12) {
            i(e12, 2000);
        } catch (RuntimeException e13) {
            C0250l c0250l5 = new C0250l(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1004);
            K0.a.o("ExoPlayerImplInternal", "Playback error", c0250l5);
            c0(true, false);
            this.f3596s0 = this.f3596s0.e(c0250l5);
        }
        z7 = true;
        s();
        return z7;
    }

    public final void i(IOException iOException, int i7) {
        C0250l c0250l = new C0250l(0, iOException, i7);
        T t7 = this.f3591m0.f3641i;
        if (t7 != null) {
            U u7 = t7.f;
            c0250l = new C0250l(c0250l.getMessage(), c0250l.getCause(), c0250l.f1698a, c0250l.f3794c, c0250l.f3795d, c0250l.f3796e, c0250l.f, c0250l.f3791X, u7.f3626a, c0250l.f1699b, c0250l.f3793Z);
        }
        K0.a.o("ExoPlayerImplInternal", "Playback error", c0250l);
        c0(false, false);
        this.f3596s0 = this.f3596s0.e(c0250l);
    }

    public final void i0(H0.V v6, C0960z c0960z, H0.V v7, C0960z c0960z2, long j, boolean z7) {
        Object obj;
        H0.L l8;
        if (!a0(v6, c0960z)) {
            if (c0960z.b()) {
                l8 = H0.L.f1700d;
            } else {
                l8 = this.f3596s0.f3725o;
            }
            C5.g gVar = this.f3587i0;
            if (!gVar.c().equals(l8)) {
                this.f3576Y.d(16);
                gVar.e(l8);
                m(this.f3596s0.f3725o, l8.f1701a, false, false);
                return;
            }
            return;
        }
        Object obj2 = c0960z.f10852a;
        H0.T t7 = this.f3585g0;
        int i7 = v6.g(obj2, t7).f1718c;
        H0.U u7 = this.f3584f0;
        v6.n(i7, u7);
        C0144y c0144y = u7.j;
        C0246h c0246h = this.f3593o0;
        c0246h.getClass();
        c0246h.f3748c = K0.x.M(c0144y.f1909a);
        c0246h.f = K0.x.M(c0144y.f1910b);
        c0246h.f3751g = K0.x.M(c0144y.f1911c);
        float f = c0144y.f1912d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        c0246h.j = f;
        float f4 = c0144y.f1913e;
        if (f4 == -3.4028235E38f) {
            f4 = 1.03f;
        }
        c0246h.f3753i = f4;
        if (f == 1.0f && f4 == 1.0f) {
            c0246h.f3748c = -9223372036854775807L;
        }
        c0246h.a();
        if (j != -9223372036854775807L) {
            c0246h.f3749d = f(v6, obj2, j);
            c0246h.a();
            return;
        }
        Object obj3 = u7.f1724a;
        if (!v7.p()) {
            obj = v7.m(v7.g(c0960z2.f10852a, t7).f1718c, u7, 0L).f1724a;
        } else {
            obj = null;
        }
        if (!K0.x.a(obj, obj3) || z7) {
            c0246h.f3749d = -9223372036854775807L;
            c0246h.a();
        }
    }

    public final void j(boolean z7) {
        C0960z c0960z;
        long d7;
        T t7 = this.f3591m0.f3642k;
        if (t7 == null) {
            c0960z = this.f3596s0.f3714b;
        } else {
            c0960z = t7.f.f3626a;
        }
        boolean equals = this.f3596s0.f3721k.equals(c0960z);
        if (!equals) {
            this.f3596s0 = this.f3596s0.b(c0960z);
        }
        e0 e0Var = this.f3596s0;
        if (t7 == null) {
            d7 = e0Var.f3729s;
        } else {
            d7 = t7.d();
        }
        e0Var.f3727q = d7;
        e0 e0Var2 = this.f3596s0;
        long j = e0Var2.f3727q;
        T t8 = this.f3591m0.f3642k;
        long j8 = 0;
        if (t8 != null) {
            j8 = Math.max(0L, j - (this.f3568H0 - t8.f3625o));
        }
        e0Var2.f3728r = j8;
        if ((!equals || z7) && t7 != null && t7.f3616d) {
            f0(t7.f3624n);
        }
    }

    public final void j0(boolean z7, boolean z8) {
        long j;
        this.f3601x0 = z7;
        if (z7 && !z8) {
            this.f3589k0.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = -9223372036854775807L;
        }
        this.f3602y0 = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02e1 A[Catch: all -> 0x02e7, TryCatch #2 {all -> 0x02e7, blocks: (B:169:0x02db, B:171:0x02e1, B:185:0x0306, B:187:0x0313, B:189:0x0319, B:191:0x0323, B:192:0x0330, B:193:0x0333, B:197:0x033e), top: B:257:0x027f }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0448  */
    /* JADX WARN: Type inference failed for: r13v1, types: [long] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2, types: [O0.M] */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(H0.V r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.N.k(H0.V, boolean):void");
    }

    public final synchronized void k0(C0251m c0251m, long j) {
        this.f3589k0.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z7 = false;
        while (!((Boolean) c0251m.get()).booleanValue() && j > 0) {
            try {
                this.f3589k0.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z7 = true;
            }
            this.f3589k0.getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [e1.x, java.lang.Object] */
    public final void l(InterfaceC0958x interfaceC0958x) {
        long j;
        V v6 = this.f3591m0;
        T t7 = v6.f3642k;
        if (t7 != null && t7.f3613a == interfaceC0958x) {
            float f = this.f3587i0.c().f1701a;
            H0.V v7 = this.f3596s0.f3713a;
            t7.f3616d = true;
            t7.f3623m = t7.f3613a.m();
            h1.v h8 = t7.h(f, v7);
            U u7 = t7.f;
            long j8 = u7.f3630e;
            int i7 = (j8 > (-9223372036854775807L) ? 1 : (j8 == (-9223372036854775807L) ? 0 : -1));
            long j9 = u7.f3627b;
            if (i7 != 0 && j9 >= j8) {
                j = Math.max(0L, j8 - 1);
            } else {
                j = j9;
            }
            long a7 = t7.a(h8, j, false, new boolean[t7.f3620i.length]);
            long j10 = t7.f3625o;
            U u8 = t7.f;
            t7.f3625o = (u8.f3627b - a7) + j10;
            t7.f = u8.b(a7);
            f0(t7.f3624n);
            if (t7 == v6.f3641i) {
                E(t7.f.f3627b);
                e(new boolean[this.f3578a.length], v6.j.e());
                e0 e0Var = this.f3596s0;
                C0960z c0960z = e0Var.f3714b;
                long j11 = t7.f.f3627b;
                this.f3596s0 = n(c0960z, j11, e0Var.f3715c, j11, false, 5);
            }
            r();
        }
    }

    public final void m(H0.L l8, float f, boolean z7, boolean z8) {
        int i7;
        if (z7) {
            if (z8) {
                this.f3597t0.c(1);
            }
            this.f3596s0 = this.f3596s0.f(l8);
        }
        float f4 = l8.f1701a;
        T t7 = this.f3591m0.f3641i;
        while (true) {
            i7 = 0;
            if (t7 == null) {
                break;
            }
            h1.r[] rVarArr = t7.f3624n.f11326c;
            int length = rVarArr.length;
            while (i7 < length) {
                h1.r rVar = rVarArr[i7];
                if (rVar != null) {
                    rVar.n(f4);
                }
                i7++;
            }
            t7 = t7.f3622l;
        }
        AbstractC0243e[] abstractC0243eArr = this.f3578a;
        int length2 = abstractC0243eArr.length;
        while (i7 < length2) {
            AbstractC0243e abstractC0243e = abstractC0243eArr[i7];
            if (abstractC0243e != null) {
                abstractC0243e.y(f, l8.f1701a);
            }
            i7++;
        }
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [A3.H, A3.E] */
    public final e0 n(C0960z c0960z, long j, long j8, long j9, boolean z7, int i7) {
        boolean z8;
        e1.b0 b0Var;
        h1.v vVar;
        A3.e0 e0Var;
        long max;
        e1.b0 b0Var2;
        h1.v vVar2;
        A3.e0 e0Var2;
        boolean z9;
        boolean z10;
        int i8;
        int i9;
        boolean z11 = false;
        if (!this.f3571K0 && j == this.f3596s0.f3729s && c0960z.equals(this.f3596s0.f3714b)) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.f3571K0 = z8;
        D();
        e0 e0Var3 = this.f3596s0;
        e1.b0 b0Var3 = e0Var3.f3719h;
        h1.v vVar3 = e0Var3.f3720i;
        List list = e0Var3.j;
        if (this.f3592n0.f3687b) {
            T t7 = this.f3591m0.f3641i;
            if (t7 == null) {
                b0Var2 = e1.b0.f10779d;
            } else {
                b0Var2 = t7.f3623m;
            }
            if (t7 == null) {
                vVar2 = this.f3582e;
            } else {
                vVar2 = t7.f3624n;
            }
            h1.r[] rVarArr = vVar2.f11326c;
            ?? e7 = new A3.E(4);
            int length = rVarArr.length;
            int i10 = 0;
            boolean z12 = false;
            while (i10 < length) {
                h1.r rVar = rVarArr[i10];
                if (rVar != null) {
                    H0.H h8 = rVar.d(0).f1884k;
                    if (h8 == null) {
                        e7.a(new H0.H(new H0.G[0]));
                    } else {
                        e7.a(h8);
                        i9 = 1;
                        z12 = true;
                        i10 += i9;
                    }
                }
                i9 = 1;
                i10 += i9;
            }
            if (z12) {
                e0Var2 = e7.g();
            } else {
                A3.I i11 = A3.K.f98b;
                e0Var2 = A3.e0.f138e;
            }
            if (t7 != null) {
                U u7 = t7.f;
                if (u7.f3628c != j8) {
                    t7.f = u7.a(j8);
                }
            }
            T t8 = this.f3591m0.f3641i;
            if (t8 != null) {
                h1.v vVar4 = t8.f3624n;
                boolean z13 = false;
                int i12 = 0;
                while (true) {
                    AbstractC0243e[] abstractC0243eArr = this.f3578a;
                    if (i12 < abstractC0243eArr.length) {
                        if (vVar4.b(i12)) {
                            i8 = 1;
                            if (abstractC0243eArr[i12].f3700b != 1) {
                                z9 = false;
                                break;
                            } else if (vVar4.f11325b[i12].f3789a != 0) {
                                z13 = true;
                            }
                        } else {
                            i8 = 1;
                        }
                        i12 += i8;
                    } else {
                        z9 = true;
                        break;
                    }
                }
                if (z13 && z9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != this.f3565E0) {
                    this.f3565E0 = z10;
                    if (!z10 && this.f3596s0.f3726p) {
                        this.f3576Y.e(2);
                    }
                }
            }
            e0Var = e0Var2;
            b0Var = b0Var2;
            vVar = vVar2;
        } else if (!c0960z.equals(e0Var3.f3714b)) {
            b0Var = e1.b0.f10779d;
            vVar = this.f3582e;
            e0Var = A3.e0.f138e;
        } else {
            b0Var = b0Var3;
            vVar = vVar3;
            e0Var = list;
        }
        if (z7) {
            K k2 = this.f3597t0;
            if (k2.f3549c && k2.f3550d != 5) {
                if (i7 == 5) {
                    z11 = true;
                }
                K0.a.e(z11);
            } else {
                k2.f3548b = true;
                k2.f3549c = true;
                k2.f3550d = i7;
            }
        }
        e0 e0Var4 = this.f3596s0;
        long j10 = e0Var4.f3727q;
        T t9 = this.f3591m0.f3642k;
        if (t9 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j10 - (this.f3568H0 - t9.f3625o));
        }
        return e0Var4.c(c0960z, j, j8, j9, max, b0Var, vVar, e0Var);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [e1.x, java.lang.Object, e1.W] */
    public final boolean o() {
        e1.U[] uArr;
        long k2;
        T t7 = this.f3591m0.f3642k;
        if (t7 == null) {
            return false;
        }
        try {
            ?? r22 = t7.f3613a;
            if (!t7.f3616d) {
                r22.p();
            } else {
                for (e1.U u7 : t7.f3615c) {
                    if (u7 != null) {
                        u7.a();
                    }
                }
            }
            if (!t7.f3616d) {
                k2 = 0;
            } else {
                k2 = r22.k();
            }
            if (k2 == Long.MIN_VALUE) {
                return false;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean q() {
        T t7 = this.f3591m0.f3641i;
        long j = t7.f.f3630e;
        if (t7.f3616d && (j == -9223372036854775807L || this.f3596s0.f3729s < j || !Z())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, e1.W] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, e1.W] */
    /* JADX WARN: Type inference failed for: r7v10, types: [e1.x, java.lang.Object] */
    public final void r() {
        long k2;
        long max;
        long j;
        boolean c8;
        boolean z7;
        boolean z8;
        boolean z9 = false;
        if (!o()) {
            c8 = false;
        } else {
            T t7 = this.f3591m0.f3642k;
            if (!t7.f3616d) {
                k2 = 0;
            } else {
                k2 = t7.f3613a.k();
            }
            T t8 = this.f3591m0.f3642k;
            if (t8 == null) {
                max = 0;
            } else {
                max = Math.max(0L, k2 - (this.f3568H0 - t8.f3625o));
            }
            T t9 = this.f3591m0.f3641i;
            if (a0(this.f3596s0.f3713a, t7.f.f3626a)) {
                j = this.f3593o0.f3752h;
            } else {
                j = -9223372036854775807L;
            }
            P0.k kVar = this.q0;
            H0.V v6 = this.f3596s0.f3713a;
            float f = this.f3587i0.c().f1701a;
            boolean z10 = this.f3596s0.f3722l;
            O o7 = new O(kVar, max, f, this.f3601x0, j);
            c8 = this.f.c(o7);
            T t10 = this.f3591m0.f3641i;
            if (!c8 && t10.f3616d && max < 500000 && this.f3586h0 > 0) {
                t10.f3613a.r(this.f3596s0.f3729s);
                c8 = this.f.c(o7);
            }
        }
        this.f3603z0 = c8;
        if (c8) {
            T t11 = this.f3591m0.f3642k;
            long j8 = this.f3568H0;
            float f4 = this.f3587i0.c().f1701a;
            long j9 = this.f3602y0;
            if (t11.f3622l == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            K0.a.j(z7);
            ?? r12 = t11.f3613a;
            P p7 = new P();
            p7.f3607a = j8 - t11.f3625o;
            if (f4 <= 0.0f && f4 != -3.4028235E38f) {
                z8 = false;
            } else {
                z8 = true;
            }
            K0.a.e(z8);
            p7.f3608b = f4;
            if (j9 >= 0 || j9 == -9223372036854775807L) {
                z9 = true;
            }
            K0.a.e(z9);
            p7.f3609c = j9;
            r12.n(new Q(p7));
        }
        e0();
    }

    public final void s() {
        boolean z7;
        K k2 = this.f3597t0;
        e0 e0Var = this.f3596s0;
        boolean z8 = k2.f3548b;
        if (((e0) k2.f3551e) != e0Var) {
            z7 = true;
        } else {
            z7 = false;
        }
        boolean z9 = z8 | z7;
        k2.f3548b = z9;
        k2.f3551e = e0Var;
        if (z9) {
            H h8 = this.f3590l0.f3838a;
            h8.f3514Z.c(new RunnableC0053c(10, h8, k2));
            this.f3597t0 = new K(this.f3596s0);
        }
    }

    public final void t() {
        k(this.f3592n0.b(), true);
    }

    public final void u() {
        this.f3597t0.c(1);
        throw null;
    }

    public final void v() {
        boolean z7;
        int i7;
        this.f3597t0.c(1);
        int i8 = 0;
        C(false, false, false, true);
        C0248j c0248j = this.f;
        c0248j.getClass();
        long id = Thread.currentThread().getId();
        long j = c0248j.f3777i;
        if (j != -1 && j != id) {
            z7 = false;
        } else {
            z7 = true;
        }
        K0.a.i("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z7);
        c0248j.f3777i = id;
        HashMap hashMap = c0248j.f3776h;
        P0.k kVar = this.q0;
        if (!hashMap.containsKey(kVar)) {
            hashMap.put(kVar, new Object());
        }
        C0247i c0247i = (C0247i) hashMap.get(kVar);
        c0247i.getClass();
        int i9 = c0248j.f;
        if (i9 == -1) {
            i9 = 13107200;
        }
        c0247i.f3767b = i9;
        c0247i.f3766a = false;
        if (this.f3596s0.f3713a.p()) {
            i7 = 4;
        } else {
            i7 = 2;
        }
        Y(i7);
        i1.g gVar = (i1.g) this.f3575X;
        gVar.getClass();
        d0 d0Var = this.f3592n0;
        K0.a.j(!d0Var.f3687b);
        d0Var.f3695l = gVar;
        while (true) {
            ArrayList arrayList = (ArrayList) d0Var.f3689d;
            if (i8 < arrayList.size()) {
                c0 c0Var = (c0) arrayList.get(i8);
                d0Var.i(c0Var);
                ((HashSet) d0Var.f3692h).add(c0Var);
                i8++;
            } else {
                d0Var.f3687b = true;
                this.f3576Y.e(2);
                return;
            }
        }
    }

    public final synchronized boolean w() {
        if (!this.f3598u0 && this.f3583e0.getThread().isAlive()) {
            this.f3576Y.e(7);
            k0(new C0251m(this, 1), this.f3594p0);
            return this.f3598u0;
        }
        return true;
    }

    public final void x() {
        try {
            C(true, false, true, false);
            y();
            C0248j c0248j = this.f;
            if (c0248j.f3776h.remove(this.q0) != null) {
                c0248j.d();
            }
            if (c0248j.f3776h.isEmpty()) {
                c0248j.f3777i = -1L;
            }
            Y(1);
            HandlerThread handlerThread = this.f3577Z;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.f3598u0 = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.f3577Z;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.f3598u0 = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void y() {
        boolean z7;
        for (int i7 = 0; i7 < this.f3578a.length; i7++) {
            AbstractC0243e abstractC0243e = this.f3580c[i7];
            synchronized (abstractC0243e.f3699a) {
                abstractC0243e.f3711l0 = null;
            }
            AbstractC0243e abstractC0243e2 = this.f3578a[i7];
            if (abstractC0243e2.f3697Y == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            K0.a.j(z7);
            abstractC0243e2.p();
        }
    }

    public final void z(int i7, int i8, e1.X x7) {
        boolean z7 = true;
        this.f3597t0.c(1);
        d0 d0Var = this.f3592n0;
        d0Var.getClass();
        if (i7 < 0 || i7 > i8 || i8 > ((ArrayList) d0Var.f3689d).size()) {
            z7 = false;
        }
        K0.a.e(z7);
        d0Var.f3694k = x7;
        d0Var.k(i7, i8);
        k(d0Var.b(), false);
    }
}
