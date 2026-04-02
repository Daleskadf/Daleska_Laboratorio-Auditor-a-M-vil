package O0;

import D.C0054d;
import D.RunnableC0053c;
import H0.C0126f;
import H0.C0132l;
import H0.C0133m;
import H0.C0136p;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import b3.C0585f;
import e1.C0960z;
import e1.InterfaceC0959y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class H extends B0.b implements r {

    /* renamed from: A0  reason: collision with root package name */
    public boolean f3487A0;

    /* renamed from: B0  reason: collision with root package name */
    public final l0 f3488B0;

    /* renamed from: C0  reason: collision with root package name */
    public e1.X f3489C0;

    /* renamed from: D0  reason: collision with root package name */
    public final C0255q f3490D0;

    /* renamed from: E0  reason: collision with root package name */
    public H0.M f3491E0;

    /* renamed from: F0  reason: collision with root package name */
    public H0.F f3492F0;

    /* renamed from: G0  reason: collision with root package name */
    public H0.r f3493G0;

    /* renamed from: H0  reason: collision with root package name */
    public AudioTrack f3494H0;

    /* renamed from: I0  reason: collision with root package name */
    public Surface f3495I0;

    /* renamed from: J0  reason: collision with root package name */
    public Surface f3496J0;

    /* renamed from: K0  reason: collision with root package name */
    public SurfaceHolder f3497K0;

    /* renamed from: L0  reason: collision with root package name */
    public boolean f3498L0;

    /* renamed from: M0  reason: collision with root package name */
    public final int f3499M0;

    /* renamed from: N0  reason: collision with root package name */
    public K0.r f3500N0;

    /* renamed from: O0  reason: collision with root package name */
    public final int f3501O0;

    /* renamed from: P0  reason: collision with root package name */
    public C0126f f3502P0;

    /* renamed from: Q0  reason: collision with root package name */
    public float f3503Q0;

    /* renamed from: R0  reason: collision with root package name */
    public boolean f3504R0;

    /* renamed from: S0  reason: collision with root package name */
    public final boolean f3505S0;

    /* renamed from: T0  reason: collision with root package name */
    public boolean f3506T0;

    /* renamed from: U0  reason: collision with root package name */
    public final int f3507U0;

    /* renamed from: V0  reason: collision with root package name */
    public boolean f3508V0;

    /* renamed from: W0  reason: collision with root package name */
    public H0.e0 f3509W0;

    /* renamed from: X  reason: collision with root package name */
    public final AbstractC0243e[] f3510X;

    /* renamed from: X0  reason: collision with root package name */
    public H0.F f3511X0;

    /* renamed from: Y  reason: collision with root package name */
    public final h1.u f3512Y;

    /* renamed from: Y0  reason: collision with root package name */
    public e0 f3513Y0;

    /* renamed from: Z  reason: collision with root package name */
    public final K0.u f3514Z;

    /* renamed from: Z0  reason: collision with root package name */
    public int f3515Z0;

    /* renamed from: a1  reason: collision with root package name */
    public long f3516a1;

    /* renamed from: b  reason: collision with root package name */
    public final h1.v f3517b;

    /* renamed from: c  reason: collision with root package name */
    public final H0.M f3518c;

    /* renamed from: d  reason: collision with root package name */
    public final A.n f3519d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f3520e;

    /* renamed from: e0  reason: collision with root package name */
    public final C0262y f3521e0;
    public final H0.P f;

    /* renamed from: f0  reason: collision with root package name */
    public final N f3522f0;

    /* renamed from: g0  reason: collision with root package name */
    public final K0.k f3523g0;

    /* renamed from: h0  reason: collision with root package name */
    public final CopyOnWriteArraySet f3524h0;

    /* renamed from: i0  reason: collision with root package name */
    public final H0.T f3525i0;

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f3526j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f3527k0;

    /* renamed from: l0  reason: collision with root package name */
    public final InterfaceC0959y f3528l0;

    /* renamed from: m0  reason: collision with root package name */
    public final P0.d f3529m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Looper f3530n0;

    /* renamed from: o0  reason: collision with root package name */
    public final i1.d f3531o0;

    /* renamed from: p0  reason: collision with root package name */
    public final K0.s f3532p0;
    public final E q0;

    /* renamed from: r0  reason: collision with root package name */
    public final F f3533r0;

    /* renamed from: s0  reason: collision with root package name */
    public final C0054d f3534s0;

    /* renamed from: t0  reason: collision with root package name */
    public final C0242d f3535t0;

    /* renamed from: u0  reason: collision with root package name */
    public final t2.i f3536u0;

    /* renamed from: v0  reason: collision with root package name */
    public final v4.d f3537v0;

    /* renamed from: w0  reason: collision with root package name */
    public final long f3538w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f3539x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f3540y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f3541z0;

    static {
        H0.D.a("media3.exoplayer");
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [A.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, O0.F] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, D.d] */
    /* JADX WARN: Type inference failed for: r2v20, types: [v4.d, java.lang.Object] */
    public H(C0254p c0254p) {
        super(1);
        boolean z7;
        P0.k a7;
        int generateAudioSessionId;
        this.f3519d = new Object();
        try {
            K0.a.r("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + K0.x.f2533e + "]");
            Context context = c0254p.f3810a;
            Looper looper = c0254p.f3815g;
            this.f3520e = context.getApplicationContext();
            K0.s sVar = c0254p.f3811b;
            this.f3529m0 = new P0.d(sVar);
            this.f3507U0 = c0254p.f3816h;
            this.f3502P0 = c0254p.f3817i;
            this.f3499M0 = c0254p.j;
            this.f3504R0 = false;
            this.f3538w0 = c0254p.f3822o;
            E e7 = new E(this);
            this.q0 = e7;
            this.f3533r0 = new Object();
            Handler handler = new Handler(looper);
            AbstractC0243e[] a8 = ((C0249k) c0254p.f3812c.get()).a(handler, e7, e7, e7, e7);
            this.f3510X = a8;
            if (a8.length > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            K0.a.j(z7);
            this.f3512Y = (h1.u) c0254p.f3814e.get();
            this.f3528l0 = (InterfaceC0959y) c0254p.f3813d.get();
            this.f3531o0 = (i1.d) c0254p.f.get();
            this.f3527k0 = c0254p.f3818k;
            this.f3488B0 = c0254p.f3819l;
            this.f3530n0 = looper;
            this.f3532p0 = sVar;
            this.f = this;
            this.f3523g0 = new K0.k(looper, sVar, new C0262y(this));
            this.f3524h0 = new CopyOnWriteArraySet();
            this.f3526j0 = new ArrayList();
            this.f3489C0 = new e1.X();
            this.f3490D0 = C0255q.f3826a;
            this.f3517b = new h1.v(new k0[a8.length], new h1.r[a8.length], H0.b0.f1789b, null);
            this.f3525i0 = new H0.T();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i7 = 0; i7 < 20; i7++) {
                int i8 = iArr[i7];
                K0.a.j(!false);
                sparseBooleanArray.append(i8, true);
            }
            this.f3512Y.getClass();
            K0.a.j(!false);
            sparseBooleanArray.append(29, true);
            K0.a.j(!false);
            C0136p c0136p = new C0136p(sparseBooleanArray);
            this.f3518c = new H0.M(c0136p);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i9 = 0; i9 < c0136p.f1831a.size(); i9++) {
                int a9 = c0136p.a(i9);
                K0.a.j(!false);
                sparseBooleanArray2.append(a9, true);
            }
            K0.a.j(!false);
            sparseBooleanArray2.append(4, true);
            K0.a.j(!false);
            sparseBooleanArray2.append(10, true);
            K0.a.j(!false);
            this.f3491E0 = new H0.M(new C0136p(sparseBooleanArray2));
            this.f3514Z = this.f3532p0.a(this.f3530n0, null);
            C0262y c0262y = new C0262y(this);
            this.f3521e0 = c0262y;
            this.f3513Y0 = e0.i(this.f3517b);
            this.f3529m0.K(this.f, this.f3530n0);
            int i10 = K0.x.f2529a;
            String str = c0254p.f3825r;
            if (i10 < 31) {
                a7 = new P0.k(str);
            } else {
                a7 = A.a(this.f3520e, this, c0254p.f3823p, str);
            }
            this.f3522f0 = new N(this.f3510X, this.f3512Y, this.f3517b, new C0248j(), this.f3531o0, this.f3539x0, this.f3529m0, this.f3488B0, c0254p.f3820m, c0254p.f3821n, this.f3530n0, this.f3532p0, c0262y, a7, this.f3490D0);
            this.f3503Q0 = 1.0f;
            this.f3539x0 = 0;
            H0.F f = H0.F.f1669y;
            this.f3492F0 = f;
            this.f3511X0 = f;
            this.f3515Z0 = -1;
            if (i10 < 21) {
                AudioTrack audioTrack = this.f3494H0;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f3494H0.release();
                    this.f3494H0 = null;
                }
                if (this.f3494H0 == null) {
                    this.f3494H0 = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f3501O0 = this.f3494H0.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f3520e.getSystemService("audio");
                if (audioManager == null) {
                    generateAudioSessionId = -1;
                } else {
                    generateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.f3501O0 = generateAudioSessionId;
            }
            int i11 = J0.c.f2338b;
            this.f3505S0 = true;
            P0.d dVar = this.f3529m0;
            dVar.getClass();
            this.f3523g0.a(dVar);
            i1.d dVar2 = this.f3531o0;
            Handler handler2 = new Handler(this.f3530n0);
            P0.d dVar3 = this.f3529m0;
            i1.g gVar = (i1.g) dVar2;
            gVar.getClass();
            dVar3.getClass();
            C0585f c0585f = gVar.f11404b;
            c0585f.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c0585f.f8171b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                i1.c cVar = (i1.c) it.next();
                if (cVar.f11388b == dVar3) {
                    cVar.f11389c = true;
                    copyOnWriteArrayList.remove(cVar);
                }
            }
            copyOnWriteArrayList.add(new i1.c(handler2, dVar3));
            this.f3524h0.add(this.q0);
            E e8 = this.q0;
            ?? obj = new Object();
            obj.f689b = context.getApplicationContext();
            obj.f690c = new RunnableC0239a(obj, handler, e8);
            this.f3534s0 = obj;
            obj.p();
            C0242d c0242d = new C0242d(context, handler, this.q0);
            this.f3535t0 = c0242d;
            c0242d.b(null);
            t2.i iVar = new t2.i(7);
            context.getApplicationContext();
            this.f3536u0 = iVar;
            ?? obj2 = new Object();
            context.getApplicationContext();
            this.f3537v0 = obj2;
            C0132l c0132l = new C0132l(0);
            c0132l.f1818b = 0;
            c0132l.f1819c = 0;
            new C0133m(c0132l);
            this.f3509W0 = H0.e0.f1792e;
            this.f3500N0 = K0.r.f2516c;
            this.f3512Y.b(this.f3502P0);
            S(1, Integer.valueOf(this.f3501O0), 10);
            S(2, Integer.valueOf(this.f3501O0), 10);
            S(1, this.f3502P0, 3);
            S(2, Integer.valueOf(this.f3499M0), 4);
            S(2, 0, 5);
            S(1, Boolean.valueOf(this.f3504R0), 9);
            S(2, this.f3533r0, 7);
            S(6, this.f3533r0, 8);
            S(-1, Integer.valueOf(this.f3507U0), 16);
            this.f3519d.d();
        } catch (Throwable th) {
            this.f3519d.d();
            throw th;
        }
    }

    public static long L(e0 e0Var) {
        H0.U u7 = new H0.U();
        H0.T t7 = new H0.T();
        e0Var.f3713a.g(e0Var.f3714b.f10852a, t7);
        long j = e0Var.f3715c;
        if (j == -9223372036854775807L) {
            return e0Var.f3713a.m(t7.f1718c, u7, 0L).f1733l;
        }
        return t7.f1720e + j;
    }

    public final long A(e0 e0Var) {
        if (e0Var.f3714b.b()) {
            Object obj = e0Var.f3714b.f10852a;
            H0.V v6 = e0Var.f3713a;
            H0.T t7 = this.f3525i0;
            v6.g(obj, t7);
            long j = e0Var.f3715c;
            if (j == -9223372036854775807L) {
                return K0.x.Z(v6.m(I(e0Var), (H0.U) this.f229a, 0L).f1733l);
            }
            return K0.x.Z(t7.f1720e) + K0.x.Z(j);
        }
        return K0.x.Z(G(e0Var));
    }

    public final int C() {
        Z();
        if (M()) {
            return this.f3513Y0.f3714b.f10853b;
        }
        return -1;
    }

    public final int D() {
        Z();
        if (M()) {
            return this.f3513Y0.f3714b.f10854c;
        }
        return -1;
    }

    public final int E() {
        Z();
        int I7 = I(this.f3513Y0);
        if (I7 == -1) {
            return 0;
        }
        return I7;
    }

    public final long F() {
        Z();
        return K0.x.Z(G(this.f3513Y0));
    }

    public final long G(e0 e0Var) {
        long j;
        if (e0Var.f3713a.p()) {
            return K0.x.M(this.f3516a1);
        }
        if (e0Var.f3726p) {
            j = e0Var.j();
        } else {
            j = e0Var.f3729s;
        }
        if (e0Var.f3714b.b()) {
            return j;
        }
        H0.V v6 = e0Var.f3713a;
        Object obj = e0Var.f3714b.f10852a;
        H0.T t7 = this.f3525i0;
        v6.g(obj, t7);
        return j + t7.f1720e;
    }

    public final H0.V H() {
        Z();
        return this.f3513Y0.f3713a;
    }

    public final int I(e0 e0Var) {
        if (e0Var.f3713a.p()) {
            return this.f3515Z0;
        }
        return e0Var.f3713a.g(e0Var.f3714b.f10852a, this.f3525i0).f1718c;
    }

    public final long J() {
        Z();
        if (M()) {
            e0 e0Var = this.f3513Y0;
            C0960z c0960z = e0Var.f3714b;
            H0.V v6 = e0Var.f3713a;
            Object obj = c0960z.f10852a;
            H0.T t7 = this.f3525i0;
            v6.g(obj, t7);
            return K0.x.Z(t7.a(c0960z.f10853b, c0960z.f10854c));
        }
        H0.V H7 = H();
        if (H7.p()) {
            return -9223372036854775807L;
        }
        return K0.x.Z(H7.m(E(), (H0.U) this.f229a, 0L).f1734m);
    }

    public final boolean K() {
        Z();
        return this.f3513Y0.f3722l;
    }

    public final boolean M() {
        Z();
        return this.f3513Y0.f3714b.b();
    }

    public final e0 N(e0 e0Var, H0.V v6, Pair pair) {
        boolean z7;
        C0960z c0960z;
        e1.b0 b0Var;
        h1.v vVar;
        List list;
        int i7;
        long j;
        if (!v6.p() && pair == null) {
            z7 = false;
        } else {
            z7 = true;
        }
        K0.a.e(z7);
        H0.V v7 = e0Var.f3713a;
        long A7 = A(e0Var);
        e0 h8 = e0Var.h(v6);
        if (v6.p()) {
            C0960z c0960z2 = e0.f3712u;
            long M7 = K0.x.M(this.f3516a1);
            e0 b5 = h8.c(c0960z2, M7, M7, M7, 0L, e1.b0.f10779d, this.f3517b, A3.e0.f138e).b(c0960z2);
            b5.f3727q = b5.f3729s;
            return b5;
        }
        Object obj = h8.f3714b.f10852a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            c0960z = new C0960z(pair.first);
        } else {
            c0960z = h8.f3714b;
        }
        C0960z c0960z3 = c0960z;
        long longValue = ((Long) pair.second).longValue();
        long M8 = K0.x.M(A7);
        if (!v7.p()) {
            M8 -= v7.g(obj, this.f3525i0).f1720e;
        }
        if (equals && longValue >= M8) {
            if (i7 == 0) {
                int b7 = v6.b(h8.f3721k.f10852a);
                if (b7 == -1 || v6.f(b7, this.f3525i0, false).f1718c != v6.g(c0960z3.f10852a, this.f3525i0).f1718c) {
                    v6.g(c0960z3.f10852a, this.f3525i0);
                    if (c0960z3.b()) {
                        j = this.f3525i0.a(c0960z3.f10853b, c0960z3.f10854c);
                    } else {
                        j = this.f3525i0.f1719d;
                    }
                    e0 b8 = h8.c(c0960z3, h8.f3729s, h8.f3729s, h8.f3716d, j - h8.f3729s, h8.f3719h, h8.f3720i, h8.j).b(c0960z3);
                    b8.f3727q = j;
                    return b8;
                }
                return h8;
            }
            K0.a.j(!c0960z3.b());
            long max = Math.max(0L, h8.f3728r - (longValue - M8));
            long j8 = h8.f3727q;
            if (h8.f3721k.equals(h8.f3714b)) {
                j8 = longValue + max;
            }
            e0 c8 = h8.c(c0960z3, longValue, longValue, longValue, max, h8.f3719h, h8.f3720i, h8.j);
            c8.f3727q = j8;
            return c8;
        }
        K0.a.j(!c0960z3.b());
        if (!equals) {
            b0Var = e1.b0.f10779d;
        } else {
            b0Var = h8.f3719h;
        }
        e1.b0 b0Var2 = b0Var;
        if (!equals) {
            vVar = this.f3517b;
        } else {
            vVar = h8.f3720i;
        }
        h1.v vVar2 = vVar;
        if (!equals) {
            A3.I i8 = A3.K.f98b;
            list = A3.e0.f138e;
        } else {
            list = h8.j;
        }
        e0 b9 = h8.c(c0960z3, longValue, longValue, longValue, 0L, b0Var2, vVar2, list).b(c0960z3);
        b9.f3727q = longValue;
        return b9;
    }

    public final Pair O(H0.V v6, int i7, long j) {
        if (v6.p()) {
            this.f3515Z0 = i7;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f3516a1 = j;
            return null;
        }
        if (i7 == -1 || i7 >= v6.o()) {
            i7 = v6.a(false);
            j = K0.x.Z(v6.m(i7, (H0.U) this.f229a, 0L).f1733l);
        }
        return v6.i((H0.U) this.f229a, this.f3525i0, i7, K0.x.M(j));
    }

    public final void P(final int i7, final int i8) {
        K0.r rVar = this.f3500N0;
        if (i7 != rVar.f2517a || i8 != rVar.f2518b) {
            this.f3500N0 = new K0.r(i7, i8);
            this.f3523g0.e(24, new K0.h() { // from class: O0.v
                @Override // K0.h
                public final void invoke(Object obj) {
                    ((H0.N) obj).y(i7, i8);
                }
            });
            S(2, new K0.r(i7, i8), 14);
        }
    }

    public final void Q() {
        int i7;
        Z();
        boolean K7 = K();
        int i8 = 2;
        int d7 = this.f3535t0.d(2, K7);
        if (d7 == -1) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        W(d7, i7, K7);
        e0 e0Var = this.f3513Y0;
        if (e0Var.f3717e != 1) {
            return;
        }
        e0 e7 = e0Var.e(null);
        if (e7.f3713a.p()) {
            i8 = 4;
        }
        e0 g3 = e7.g(i8);
        this.f3540y0++;
        K0.u uVar = this.f3522f0.f3576Y;
        uVar.getClass();
        K0.t b5 = K0.u.b();
        b5.f2520a = uVar.f2522a.obtainMessage(29);
        b5.b();
        X(g3, 1, false, 5, -9223372036854775807L, -1);
    }

    public final void R() {
        SurfaceHolder surfaceHolder = this.f3497K0;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.q0);
            this.f3497K0 = null;
        }
    }

    public final void S(int i7, Object obj, int i8) {
        AbstractC0243e[] abstractC0243eArr;
        int i9;
        for (AbstractC0243e abstractC0243e : this.f3510X) {
            if (i7 == -1 || abstractC0243e.f3700b == i7) {
                int I7 = I(this.f3513Y0);
                H0.V v6 = this.f3513Y0.f3713a;
                if (I7 == -1) {
                    i9 = 0;
                } else {
                    i9 = I7;
                }
                N n7 = this.f3522f0;
                h0 h0Var = new h0(n7, abstractC0243e, v6, i9, this.f3532p0, n7.f3583e0);
                K0.a.j(!h0Var.f3763g);
                h0Var.f3761d = i8;
                K0.a.j(!h0Var.f3763g);
                h0Var.f3762e = obj;
                h0Var.c();
            }
        }
    }

    public final void T(Surface surface) {
        AbstractC0243e[] abstractC0243eArr;
        boolean z7;
        int i7;
        ArrayList arrayList = new ArrayList();
        for (AbstractC0243e abstractC0243e : this.f3510X) {
            if (abstractC0243e.f3700b == 2) {
                int I7 = I(this.f3513Y0);
                H0.V v6 = this.f3513Y0.f3713a;
                if (I7 == -1) {
                    i7 = 0;
                } else {
                    i7 = I7;
                }
                N n7 = this.f3522f0;
                h0 h0Var = new h0(n7, abstractC0243e, v6, i7, this.f3532p0, n7.f3583e0);
                K0.a.j(!h0Var.f3763g);
                h0Var.f3761d = 1;
                K0.a.j(!h0Var.f3763g);
                h0Var.f3762e = surface;
                h0Var.c();
                arrayList.add(h0Var);
            }
        }
        Surface surface2 = this.f3495I0;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((h0) it.next()).a(this.f3538w0);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z7 = true;
            }
            z7 = false;
            Surface surface3 = this.f3495I0;
            Surface surface4 = this.f3496J0;
            if (surface3 == surface4) {
                surface4.release();
                this.f3496J0 = null;
            }
        } else {
            z7 = false;
        }
        this.f3495I0 = surface;
        if (z7) {
            C0250l c0250l = new C0250l(2, new RuntimeException("Detaching surface timed out."), 1003);
            e0 e0Var = this.f3513Y0;
            e0 b5 = e0Var.b(e0Var.f3714b);
            b5.f3727q = b5.f3729s;
            b5.f3728r = 0L;
            e0 e7 = b5.g(1).e(c0250l);
            this.f3540y0++;
            K0.u uVar = this.f3522f0.f3576Y;
            uVar.getClass();
            K0.t b7 = K0.u.b();
            b7.f2520a = uVar.f2522a.obtainMessage(6);
            b7.b();
            X(e7, 0, false, 5, -9223372036854775807L, -1);
        }
    }

    public final void U(Surface surface) {
        int i7;
        Z();
        R();
        T(surface);
        if (surface == null) {
            i7 = 0;
        } else {
            i7 = -1;
        }
        P(i7, i7);
    }

    public final void V() {
        boolean z7;
        int k2;
        boolean z8;
        int e7;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18 = true;
        H0.M m7 = this.f3491E0;
        int i7 = K0.x.f2529a;
        H h8 = (H) this.f;
        boolean M7 = h8.M();
        H0.V H7 = h8.H();
        boolean p7 = H7.p();
        H0.U u7 = (H0.U) h8.f229a;
        if (!p7 && H7.m(h8.E(), u7, 0L).f1730h) {
            z7 = true;
        } else {
            z7 = false;
        }
        H0.V H8 = h8.H();
        if (H8.p()) {
            k2 = -1;
        } else {
            int E4 = h8.E();
            h8.Z();
            int i8 = h8.f3539x0;
            if (i8 == 1) {
                i8 = 0;
            }
            h8.Z();
            k2 = H8.k(E4, i8, false);
        }
        if (k2 != -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        H0.V H9 = h8.H();
        if (H9.p()) {
            e7 = -1;
        } else {
            int E7 = h8.E();
            h8.Z();
            int i9 = h8.f3539x0;
            if (i9 == 1) {
                i9 = 0;
            }
            h8.Z();
            e7 = H9.e(E7, i9, false);
        }
        if (e7 != -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        H0.V H10 = h8.H();
        if (!H10.p() && H10.m(h8.E(), u7, 0L).a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        H0.V H11 = h8.H();
        if (!H11.p() && H11.m(h8.E(), u7, 0L).f1731i) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean p8 = h8.H().p();
        A4.c cVar = new A4.c(11);
        C0136p c0136p = this.f3518c.f1704a;
        A.l lVar = (A.l) cVar.f218b;
        lVar.getClass();
        for (int i10 = 0; i10 < c0136p.f1831a.size(); i10++) {
            lVar.a(c0136p.a(i10));
        }
        boolean z19 = !M7;
        cVar.d(4, z19);
        if (z7 && !M7) {
            z12 = true;
        } else {
            z12 = false;
        }
        cVar.d(5, z12);
        if (z8 && !M7) {
            z13 = true;
        } else {
            z13 = false;
        }
        cVar.d(6, z13);
        if (!p8 && ((z8 || !z10 || z7) && !M7)) {
            z14 = true;
        } else {
            z14 = false;
        }
        cVar.d(7, z14);
        if (z9 && !M7) {
            z15 = true;
        } else {
            z15 = false;
        }
        cVar.d(8, z15);
        if (!p8 && ((z9 || (z10 && z11)) && !M7)) {
            z16 = true;
        } else {
            z16 = false;
        }
        cVar.d(9, z16);
        cVar.d(10, z19);
        if (z7 && !M7) {
            z17 = true;
        } else {
            z17 = false;
        }
        cVar.d(11, z17);
        cVar.d(12, (!z7 || M7) ? false : false);
        H0.M m8 = new H0.M(lVar.b());
        this.f3491E0 = m8;
        if (!m8.equals(m7)) {
            this.f3523g0.c(13, new C0262y(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    public final void W(int i7, int i8, boolean z7) {
        ?? r13;
        int i9 = 0;
        if (z7 && i7 != -1) {
            r13 = 1;
        } else {
            r13 = 0;
        }
        if (i7 == 0) {
            i9 = 1;
        }
        e0 e0Var = this.f3513Y0;
        if (e0Var.f3722l == r13 && e0Var.f3724n == i9 && e0Var.f3723m == i8) {
            return;
        }
        this.f3540y0++;
        e0 e0Var2 = this.f3513Y0;
        boolean z8 = e0Var2.f3726p;
        e0 e0Var3 = e0Var2;
        if (z8) {
            e0Var3 = e0Var2.a();
        }
        e0 d7 = e0Var3.d(i8, i9, r13);
        int i10 = (i9 << 4) | i8;
        K0.u uVar = this.f3522f0.f3576Y;
        uVar.getClass();
        K0.t b5 = K0.u.b();
        b5.f2520a = uVar.f2522a.obtainMessage(1, r13, i10);
        b5.b();
        X(d7, 0, false, 5, -9223372036854775807L, -1);
    }

    public final void X(final e0 e0Var, int i7, boolean z7, final int i8, long j, int i9) {
        Pair pair;
        int i10;
        H0.C c8;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        Object obj;
        H0.C c9;
        Object obj2;
        int i12;
        long j8;
        long j9;
        long j10;
        long L6;
        Object obj3;
        H0.C c10;
        Object obj4;
        int i13;
        long j11;
        e0 e0Var2 = this.f3513Y0;
        this.f3513Y0 = e0Var;
        boolean equals = e0Var2.f3713a.equals(e0Var.f3713a);
        H0.V v6 = e0Var2.f3713a;
        H0.V v7 = e0Var.f3713a;
        if (v7.p() && v6.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (v7.p() != v6.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            C0960z c0960z = e0Var2.f3714b;
            Object obj5 = c0960z.f10852a;
            H0.T t7 = this.f3525i0;
            int i14 = v6.g(obj5, t7).f1718c;
            H0.U u7 = (H0.U) this.f229a;
            Object obj6 = v6.m(i14, u7, 0L).f1724a;
            C0960z c0960z2 = e0Var.f3714b;
            if (!obj6.equals(v7.m(v7.g(c0960z2.f10852a, t7).f1718c, u7, 0L).f1724a)) {
                if (z7 && i8 == 0) {
                    i10 = 1;
                } else if (z7 && i8 == 1) {
                    i10 = 2;
                } else if (!equals) {
                    i10 = 3;
                } else {
                    throw new IllegalStateException();
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i10));
            } else if (z7 && i8 == 0 && c0960z.f10855d < c0960z2.f10855d) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = new Pair(Boolean.FALSE, -1);
            }
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            if (!e0Var.f3713a.p()) {
                c8 = e0Var.f3713a.m(e0Var.f3713a.g(e0Var.f3714b.f10852a, this.f3525i0).f1718c, (H0.U) this.f229a, 0L).f1726c;
            } else {
                c8 = null;
            }
            this.f3511X0 = H0.F.f1669y;
        } else {
            c8 = null;
        }
        if (booleanValue || !e0Var2.j.equals(e0Var.j)) {
            H0.E a7 = this.f3511X0.a();
            List list = e0Var.j;
            for (int i15 = 0; i15 < list.size(); i15++) {
                H0.H h8 = (H0.H) list.get(i15);
                int i16 = 0;
                while (true) {
                    H0.G[] gArr = h8.f1692a;
                    if (i16 < gArr.length) {
                        gArr[i16].c(a7);
                        i16++;
                    }
                }
            }
            this.f3511X0 = new H0.F(a7);
        }
        H0.F x7 = x();
        boolean equals2 = x7.equals(this.f3492F0);
        this.f3492F0 = x7;
        if (e0Var2.f3722l != e0Var.f3722l) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (e0Var2.f3717e != e0Var.f3717e) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 || z8) {
            Y();
        }
        if (e0Var2.f3718g != e0Var.f3718g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!equals) {
            this.f3523g0.c(0, new C0256s(e0Var, i7, 0));
        }
        if (z7) {
            H0.T t8 = new H0.T();
            if (!e0Var2.f3713a.p()) {
                Object obj7 = e0Var2.f3714b.f10852a;
                e0Var2.f3713a.g(obj7, t8);
                int i17 = t8.f1718c;
                int b5 = e0Var2.f3713a.b(obj7);
                z11 = z9;
                z12 = z10;
                obj = e0Var2.f3713a.m(i17, (H0.U) this.f229a, 0L).f1724a;
                c9 = ((H0.U) this.f229a).f1726c;
                i11 = i17;
                i12 = b5;
                obj2 = obj7;
            } else {
                z11 = z9;
                z12 = z10;
                i11 = i9;
                obj = null;
                c9 = null;
                obj2 = null;
                i12 = -1;
            }
            if (i8 == 0) {
                if (e0Var2.f3714b.b()) {
                    C0960z c0960z3 = e0Var2.f3714b;
                    j10 = t8.a(c0960z3.f10853b, c0960z3.f10854c);
                    L6 = L(e0Var2);
                } else if (e0Var2.f3714b.f10856e != -1) {
                    j10 = L(this.f3513Y0);
                    L6 = j10;
                } else {
                    j8 = t8.f1720e;
                    j9 = t8.f1719d;
                    j10 = j8 + j9;
                    L6 = j10;
                }
            } else if (e0Var2.f3714b.b()) {
                j10 = e0Var2.f3729s;
                L6 = L(e0Var2);
            } else {
                j8 = t8.f1720e;
                j9 = e0Var2.f3729s;
                j10 = j8 + j9;
                L6 = j10;
            }
            long Z6 = K0.x.Z(j10);
            long Z7 = K0.x.Z(L6);
            C0960z c0960z4 = e0Var2.f3714b;
            final H0.O o7 = new H0.O(obj, i11, c9, obj2, i12, Z6, Z7, c0960z4.f10853b, c0960z4.f10854c);
            int E4 = E();
            if (!this.f3513Y0.f3713a.p()) {
                e0 e0Var3 = this.f3513Y0;
                Object obj8 = e0Var3.f3714b.f10852a;
                e0Var3.f3713a.g(obj8, this.f3525i0);
                int b7 = this.f3513Y0.f3713a.b(obj8);
                H0.V v8 = this.f3513Y0.f3713a;
                H0.U u8 = (H0.U) this.f229a;
                i13 = b7;
                obj3 = v8.m(E4, u8, 0L).f1724a;
                c10 = u8.f1726c;
                obj4 = obj8;
            } else {
                obj3 = null;
                c10 = null;
                obj4 = null;
                i13 = -1;
            }
            long Z8 = K0.x.Z(j);
            if (this.f3513Y0.f3714b.b()) {
                j11 = K0.x.Z(L(this.f3513Y0));
            } else {
                j11 = Z8;
            }
            C0960z c0960z5 = this.f3513Y0.f3714b;
            final H0.O o8 = new H0.O(obj3, E4, c10, obj4, i13, Z8, j11, c0960z5.f10853b, c0960z5.f10854c);
            this.f3523g0.c(11, new K0.h() { // from class: O0.z
                @Override // K0.h
                public final void invoke(Object obj9) {
                    H0.N n7 = (H0.N) obj9;
                    n7.getClass();
                    n7.c(i8, o7, o8);
                }
            });
        } else {
            z11 = z9;
            z12 = z10;
        }
        if (booleanValue) {
            this.f3523g0.c(1, new C0256s(c8, intValue, 1));
        }
        if (e0Var2.f != e0Var.f) {
            this.f3523g0.c(10, new K0.h() { // from class: O0.t
                @Override // K0.h
                public final void invoke(Object obj9) {
                    H0.N n7 = (H0.N) obj9;
                    switch (r2) {
                        case 0:
                            e0 e0Var4 = e0Var;
                            boolean z13 = e0Var4.f3718g;
                            n7.getClass();
                            n7.j(e0Var4.f3718g);
                            return;
                        case 1:
                            e0 e0Var5 = e0Var;
                            n7.p(e0Var5.f3717e, e0Var5.f3722l);
                            return;
                        case 2:
                            n7.t(e0Var.f3717e);
                            return;
                        case 3:
                            e0 e0Var6 = e0Var;
                            n7.q(e0Var6.f3723m, e0Var6.f3722l);
                            return;
                        case 4:
                            n7.a(e0Var.f3724n);
                            return;
                        case 5:
                            n7.D(e0Var.k());
                            return;
                        case 6:
                            n7.f(e0Var.f3725o);
                            return;
                        case 7:
                            n7.z(e0Var.f);
                            return;
                        case 8:
                            n7.v(e0Var.f);
                            return;
                        default:
                            n7.x(e0Var.f3720i.f11327d);
                            return;
                    }
                }
            });
            if (e0Var.f != null) {
                this.f3523g0.c(10, new K0.h() { // from class: O0.t
                    @Override // K0.h
                    public final void invoke(Object obj9) {
                        H0.N n7 = (H0.N) obj9;
                        switch (r2) {
                            case 0:
                                e0 e0Var4 = e0Var;
                                boolean z13 = e0Var4.f3718g;
                                n7.getClass();
                                n7.j(e0Var4.f3718g);
                                return;
                            case 1:
                                e0 e0Var5 = e0Var;
                                n7.p(e0Var5.f3717e, e0Var5.f3722l);
                                return;
                            case 2:
                                n7.t(e0Var.f3717e);
                                return;
                            case 3:
                                e0 e0Var6 = e0Var;
                                n7.q(e0Var6.f3723m, e0Var6.f3722l);
                                return;
                            case 4:
                                n7.a(e0Var.f3724n);
                                return;
                            case 5:
                                n7.D(e0Var.k());
                                return;
                            case 6:
                                n7.f(e0Var.f3725o);
                                return;
                            case 7:
                                n7.z(e0Var.f);
                                return;
                            case 8:
                                n7.v(e0Var.f);
                                return;
                            default:
                                n7.x(e0Var.f3720i.f11327d);
                                return;
                        }
                    }
                });
            }
        }
        h1.v vVar = e0Var2.f3720i;
        h1.v vVar2 = e0Var.f3720i;
        if (vVar != vVar2) {
            h1.u uVar = this.f3512Y;
            h1.t tVar = vVar2.f11328e;
            uVar.getClass();
            this.f3523g0.c(2, new K0.h() { // from class: O0.t
                @Override // K0.h
                public final void invoke(Object obj9) {
                    H0.N n7 = (H0.N) obj9;
                    switch (r2) {
                        case 0:
                            e0 e0Var4 = e0Var;
                            boolean z13 = e0Var4.f3718g;
                            n7.getClass();
                            n7.j(e0Var4.f3718g);
                            return;
                        case 1:
                            e0 e0Var5 = e0Var;
                            n7.p(e0Var5.f3717e, e0Var5.f3722l);
                            return;
                        case 2:
                            n7.t(e0Var.f3717e);
                            return;
                        case 3:
                            e0 e0Var6 = e0Var;
                            n7.q(e0Var6.f3723m, e0Var6.f3722l);
                            return;
                        case 4:
                            n7.a(e0Var.f3724n);
                            return;
                        case 5:
                            n7.D(e0Var.k());
                            return;
                        case 6:
                            n7.f(e0Var.f3725o);
                            return;
                        case 7:
                            n7.z(e0Var.f);
                            return;
                        case 8:
                            n7.v(e0Var.f);
                            return;
                        default:
                            n7.x(e0Var.f3720i.f11327d);
                            return;
                    }
                }
            });
        }
        if (!equals2) {
            this.f3523g0.c(14, new A.j(this.f3492F0, 14));
        }
        if (z12) {
            this.f3523g0.c(3, new K0.h() { // from class: O0.t
                @Override // K0.h
                public final void invoke(Object obj9) {
                    H0.N n7 = (H0.N) obj9;
                    switch (r2) {
                        case 0:
                            e0 e0Var4 = e0Var;
                            boolean z13 = e0Var4.f3718g;
                            n7.getClass();
                            n7.j(e0Var4.f3718g);
                            return;
                        case 1:
                            e0 e0Var5 = e0Var;
                            n7.p(e0Var5.f3717e, e0Var5.f3722l);
                            return;
                        case 2:
                            n7.t(e0Var.f3717e);
                            return;
                        case 3:
                            e0 e0Var6 = e0Var;
                            n7.q(e0Var6.f3723m, e0Var6.f3722l);
                            return;
                        case 4:
                            n7.a(e0Var.f3724n);
                            return;
                        case 5:
                            n7.D(e0Var.k());
                            return;
                        case 6:
                            n7.f(e0Var.f3725o);
                            return;
                        case 7:
                            n7.z(e0Var.f);
                            return;
                        case 8:
                            n7.v(e0Var.f);
                            return;
                        default:
                            n7.x(e0Var.f3720i.f11327d);
                            return;
                    }
                }
            });
        }
        if (z11 || z8) {
            this.f3523g0.c(-1, new K0.h() { // from class: O0.t
                @Override // K0.h
                public final void invoke(Object obj9) {
                    H0.N n7 = (H0.N) obj9;
                    switch (r2) {
                        case 0:
                            e0 e0Var4 = e0Var;
                            boolean z13 = e0Var4.f3718g;
                            n7.getClass();
                            n7.j(e0Var4.f3718g);
                            return;
                        case 1:
                            e0 e0Var5 = e0Var;
                            n7.p(e0Var5.f3717e, e0Var5.f3722l);
                            return;
                        case 2:
                            n7.t(e0Var.f3717e);
                            return;
                        case 3:
                            e0 e0Var6 = e0Var;
                            n7.q(e0Var6.f3723m, e0Var6.f3722l);
                            return;
                        case 4:
                            n7.a(e0Var.f3724n);
                            return;
                        case 5:
                            n7.D(e0Var.k());
                            return;
                        case 6:
                            n7.f(e0Var.f3725o);
                            return;
                        case 7:
                            n7.z(e0Var.f);
                            return;
                        case 8:
                            n7.v(e0Var.f);
                            return;
                        default:
                            n7.x(e0Var.f3720i.f11327d);
                            return;
                    }
                }
            });
        }
        if (z11) {
            this.f3523g0.c(4, new K0.h() { // from class: O0.t
                @Override // K0.h
                public final void invoke(Object obj9) {
                    H0.N n7 = (H0.N) obj9;
                    switch (r2) {
                        case 0:
                            e0 e0Var4 = e0Var;
                            boolean z13 = e0Var4.f3718g;
                            n7.getClass();
                            n7.j(e0Var4.f3718g);
                            return;
                        case 1:
                            e0 e0Var5 = e0Var;
                            n7.p(e0Var5.f3717e, e0Var5.f3722l);
                            return;
                        case 2:
                            n7.t(e0Var.f3717e);
                            return;
                        case 3:
                            e0 e0Var6 = e0Var;
                            n7.q(e0Var6.f3723m, e0Var6.f3722l);
                            return;
                        case 4:
                            n7.a(e0Var.f3724n);
                            return;
                        case 5:
                            n7.D(e0Var.k());
                            return;
                        case 6:
                            n7.f(e0Var.f3725o);
                            return;
                        case 7:
                            n7.z(e0Var.f);
                            return;
                        case 8:
                            n7.v(e0Var.f);
                            return;
                        default:
                            n7.x(e0Var.f3720i.f11327d);
                            return;
                    }
                }
            });
        }
        if (z8 || e0Var2.f3723m != e0Var.f3723m) {
            this.f3523g0.c(5, new K0.h() { // from class: O0.t
                @Override // K0.h
                public final void invoke(Object obj9) {
                    H0.N n7 = (H0.N) obj9;
                    switch (r2) {
                        case 0:
                            e0 e0Var4 = e0Var;
                            boolean z13 = e0Var4.f3718g;
                            n7.getClass();
                            n7.j(e0Var4.f3718g);
                            return;
                        case 1:
                            e0 e0Var5 = e0Var;
                            n7.p(e0Var5.f3717e, e0Var5.f3722l);
                            return;
                        case 2:
                            n7.t(e0Var.f3717e);
                            return;
                        case 3:
                            e0 e0Var6 = e0Var;
                            n7.q(e0Var6.f3723m, e0Var6.f3722l);
                            return;
                        case 4:
                            n7.a(e0Var.f3724n);
                            return;
                        case 5:
                            n7.D(e0Var.k());
                            return;
                        case 6:
                            n7.f(e0Var.f3725o);
                            return;
                        case 7:
                            n7.z(e0Var.f);
                            return;
                        case 8:
                            n7.v(e0Var.f);
                            return;
                        default:
                            n7.x(e0Var.f3720i.f11327d);
                            return;
                    }
                }
            });
        }
        if (e0Var2.f3724n != e0Var.f3724n) {
            this.f3523g0.c(6, new K0.h() { // from class: O0.t
                @Override // K0.h
                public final void invoke(Object obj9) {
                    H0.N n7 = (H0.N) obj9;
                    switch (r2) {
                        case 0:
                            e0 e0Var4 = e0Var;
                            boolean z13 = e0Var4.f3718g;
                            n7.getClass();
                            n7.j(e0Var4.f3718g);
                            return;
                        case 1:
                            e0 e0Var5 = e0Var;
                            n7.p(e0Var5.f3717e, e0Var5.f3722l);
                            return;
                        case 2:
                            n7.t(e0Var.f3717e);
                            return;
                        case 3:
                            e0 e0Var6 = e0Var;
                            n7.q(e0Var6.f3723m, e0Var6.f3722l);
                            return;
                        case 4:
                            n7.a(e0Var.f3724n);
                            return;
                        case 5:
                            n7.D(e0Var.k());
                            return;
                        case 6:
                            n7.f(e0Var.f3725o);
                            return;
                        case 7:
                            n7.z(e0Var.f);
                            return;
                        case 8:
                            n7.v(e0Var.f);
                            return;
                        default:
                            n7.x(e0Var.f3720i.f11327d);
                            return;
                    }
                }
            });
        }
        if (e0Var2.k() != e0Var.k()) {
            this.f3523g0.c(7, new K0.h() { // from class: O0.t
                @Override // K0.h
                public final void invoke(Object obj9) {
                    H0.N n7 = (H0.N) obj9;
                    switch (r2) {
                        case 0:
                            e0 e0Var4 = e0Var;
                            boolean z13 = e0Var4.f3718g;
                            n7.getClass();
                            n7.j(e0Var4.f3718g);
                            return;
                        case 1:
                            e0 e0Var5 = e0Var;
                            n7.p(e0Var5.f3717e, e0Var5.f3722l);
                            return;
                        case 2:
                            n7.t(e0Var.f3717e);
                            return;
                        case 3:
                            e0 e0Var6 = e0Var;
                            n7.q(e0Var6.f3723m, e0Var6.f3722l);
                            return;
                        case 4:
                            n7.a(e0Var.f3724n);
                            return;
                        case 5:
                            n7.D(e0Var.k());
                            return;
                        case 6:
                            n7.f(e0Var.f3725o);
                            return;
                        case 7:
                            n7.z(e0Var.f);
                            return;
                        case 8:
                            n7.v(e0Var.f);
                            return;
                        default:
                            n7.x(e0Var.f3720i.f11327d);
                            return;
                    }
                }
            });
        }
        if (!e0Var2.f3725o.equals(e0Var.f3725o)) {
            this.f3523g0.c(12, new K0.h() { // from class: O0.t
                @Override // K0.h
                public final void invoke(Object obj9) {
                    H0.N n7 = (H0.N) obj9;
                    switch (r2) {
                        case 0:
                            e0 e0Var4 = e0Var;
                            boolean z13 = e0Var4.f3718g;
                            n7.getClass();
                            n7.j(e0Var4.f3718g);
                            return;
                        case 1:
                            e0 e0Var5 = e0Var;
                            n7.p(e0Var5.f3717e, e0Var5.f3722l);
                            return;
                        case 2:
                            n7.t(e0Var.f3717e);
                            return;
                        case 3:
                            e0 e0Var6 = e0Var;
                            n7.q(e0Var6.f3723m, e0Var6.f3722l);
                            return;
                        case 4:
                            n7.a(e0Var.f3724n);
                            return;
                        case 5:
                            n7.D(e0Var.k());
                            return;
                        case 6:
                            n7.f(e0Var.f3725o);
                            return;
                        case 7:
                            n7.z(e0Var.f);
                            return;
                        case 8:
                            n7.v(e0Var.f);
                            return;
                        default:
                            n7.x(e0Var.f3720i.f11327d);
                            return;
                    }
                }
            });
        }
        V();
        this.f3523g0.b();
        if (e0Var2.f3726p != e0Var.f3726p) {
            Iterator it = this.f3524h0.iterator();
            while (it.hasNext()) {
                ((E) it.next()).f3482a.Y();
            }
        }
    }

    public final void Y() {
        Z();
        int i7 = this.f3513Y0.f3717e;
        v4.d dVar = this.f3537v0;
        t2.i iVar = this.f3536u0;
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                if (i7 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                Z();
                boolean z7 = this.f3513Y0.f3726p;
                K();
                iVar.getClass();
                K();
                dVar.getClass();
                return;
            }
        }
        iVar.getClass();
        dVar.getClass();
    }

    public final void Z() {
        IllegalStateException illegalStateException;
        A.n nVar = this.f3519d;
        synchronized (nVar) {
            boolean z7 = false;
            while (!nVar.f29a) {
                try {
                    nVar.wait();
                } catch (InterruptedException unused) {
                    z7 = true;
                }
            }
            if (z7) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f3530n0.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f3530n0.getThread().getName();
            int i7 = K0.x.f2529a;
            Locale locale = Locale.US;
            String j = io.flutter.plugins.pathprovider.b.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f3505S0) {
                if (this.f3506T0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                K0.a.B("ExoPlayerImpl", j, illegalStateException);
                this.f3506T0 = true;
                return;
            }
            throw new IllegalStateException(j);
        }
    }

    @Override // B0.b
    public final void r(int i7, long j) {
        boolean z7;
        Z();
        if (i7 == -1) {
            return;
        }
        if (i7 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        H0.V v6 = this.f3513Y0.f3713a;
        if (!v6.p() && i7 >= v6.o()) {
            return;
        }
        P0.d dVar = this.f3529m0;
        if (!dVar.f3905Z) {
            P0.a E4 = dVar.E();
            dVar.f3905Z = true;
            dVar.J(E4, -1, new P0.b(6));
        }
        this.f3540y0++;
        if (M()) {
            K0.a.A("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            K k2 = new K(this.f3513Y0);
            k2.c(1);
            H h8 = this.f3521e0.f3838a;
            h8.f3514Z.c(new RunnableC0053c(10, h8, k2));
            return;
        }
        e0 e0Var = this.f3513Y0;
        int i8 = e0Var.f3717e;
        if (i8 == 3 || (i8 == 4 && !v6.p())) {
            e0Var = this.f3513Y0.g(2);
        }
        int E7 = E();
        e0 N7 = N(e0Var, v6, O(v6, i7, j));
        this.f3522f0.f3576Y.a(3, new M(v6, i7, K0.x.M(j))).b();
        X(N7, 0, true, 1, G(N7), E7);
    }

    public final H0.F x() {
        byte[] bArr;
        H0.V H7 = H();
        if (H7.p()) {
            return this.f3511X0;
        }
        H0.C c8 = H7.m(E(), (H0.U) this.f229a, 0L).f1726c;
        H0.E a7 = this.f3511X0.a();
        H0.F f = c8.f1644d;
        if (f != null) {
            CharSequence charSequence = f.f1670a;
            if (charSequence != null) {
                a7.f1648a = charSequence;
            }
            CharSequence charSequence2 = f.f1671b;
            if (charSequence2 != null) {
                a7.f1649b = charSequence2;
            }
            CharSequence charSequence3 = f.f1672c;
            if (charSequence3 != null) {
                a7.f1650c = charSequence3;
            }
            CharSequence charSequence4 = f.f1673d;
            if (charSequence4 != null) {
                a7.f1651d = charSequence4;
            }
            CharSequence charSequence5 = f.f1674e;
            if (charSequence5 != null) {
                a7.f1652e = charSequence5;
            }
            byte[] bArr2 = f.f;
            if (bArr2 != null) {
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) bArr2.clone();
                }
                a7.f = bArr;
                a7.f1653g = f.f1675g;
            }
            Integer num = f.f1676h;
            if (num != null) {
                a7.f1654h = num;
            }
            Integer num2 = f.f1677i;
            if (num2 != null) {
                a7.f1655i = num2;
            }
            Integer num3 = f.j;
            if (num3 != null) {
                a7.j = num3;
            }
            Boolean bool = f.f1678k;
            if (bool != null) {
                a7.f1656k = bool;
            }
            Integer num4 = f.f1679l;
            if (num4 != null) {
                a7.f1657l = num4;
            }
            Integer num5 = f.f1680m;
            if (num5 != null) {
                a7.f1657l = num5;
            }
            Integer num6 = f.f1681n;
            if (num6 != null) {
                a7.f1658m = num6;
            }
            Integer num7 = f.f1682o;
            if (num7 != null) {
                a7.f1659n = num7;
            }
            Integer num8 = f.f1683p;
            if (num8 != null) {
                a7.f1660o = num8;
            }
            Integer num9 = f.f1684q;
            if (num9 != null) {
                a7.f1661p = num9;
            }
            Integer num10 = f.f1685r;
            if (num10 != null) {
                a7.f1662q = num10;
            }
            CharSequence charSequence6 = f.f1686s;
            if (charSequence6 != null) {
                a7.f1663r = charSequence6;
            }
            CharSequence charSequence7 = f.f1687t;
            if (charSequence7 != null) {
                a7.f1664s = charSequence7;
            }
            CharSequence charSequence8 = f.f1688u;
            if (charSequence8 != null) {
                a7.f1665t = charSequence8;
            }
            CharSequence charSequence9 = f.f1689v;
            if (charSequence9 != null) {
                a7.f1666u = charSequence9;
            }
            CharSequence charSequence10 = f.f1690w;
            if (charSequence10 != null) {
                a7.f1667v = charSequence10;
            }
            Integer num11 = f.f1691x;
            if (num11 != null) {
                a7.f1668w = num11;
            }
        }
        return new H0.F(a7);
    }

    public final long y() {
        Z();
        if (M()) {
            e0 e0Var = this.f3513Y0;
            if (e0Var.f3721k.equals(e0Var.f3714b)) {
                return K0.x.Z(this.f3513Y0.f3727q);
            }
            return J();
        }
        Z();
        if (this.f3513Y0.f3713a.p()) {
            return this.f3516a1;
        }
        e0 e0Var2 = this.f3513Y0;
        long j = 0;
        if (e0Var2.f3721k.f10855d != e0Var2.f3714b.f10855d) {
            return K0.x.Z(e0Var2.f3713a.m(E(), (H0.U) this.f229a, 0L).f1734m);
        }
        long j8 = e0Var2.f3727q;
        if (this.f3513Y0.f3721k.b()) {
            e0 e0Var3 = this.f3513Y0;
            e0Var3.f3713a.g(e0Var3.f3721k.f10852a, this.f3525i0).d(this.f3513Y0.f3721k.f10853b);
        } else {
            j = j8;
        }
        e0 e0Var4 = this.f3513Y0;
        H0.V v6 = e0Var4.f3713a;
        Object obj = e0Var4.f3721k.f10852a;
        H0.T t7 = this.f3525i0;
        v6.g(obj, t7);
        return K0.x.Z(j + t7.f1720e);
    }
}
