package R0;

import A3.N;
import H0.C;
import H0.C0144y;
import H0.C0145z;
import H0.D;
import K0.x;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.firebase.firestore.Z;
import e0.C0927b;
import e1.AbstractC0936a;
import e1.C0960z;
import e1.InterfaceC0958x;
import e1.r;
import f1.C0986h;
import f5.C0993a;
import i1.q;
import j1.AbstractC1362a;
import java.io.IOException;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class h extends AbstractC0936a {

    /* renamed from: A0  reason: collision with root package name */
    public Uri f4562A0;

    /* renamed from: B0  reason: collision with root package name */
    public final Uri f4563B0;

    /* renamed from: C0  reason: collision with root package name */
    public S0.c f4564C0;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f4565D0;

    /* renamed from: E0  reason: collision with root package name */
    public long f4566E0;

    /* renamed from: F0  reason: collision with root package name */
    public long f4567F0;

    /* renamed from: G0  reason: collision with root package name */
    public long f4568G0;

    /* renamed from: H0  reason: collision with root package name */
    public int f4569H0;

    /* renamed from: I0  reason: collision with root package name */
    public long f4570I0;

    /* renamed from: J0  reason: collision with root package name */
    public int f4571J0;

    /* renamed from: K0  reason: collision with root package name */
    public C f4572K0;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f4573Y;

    /* renamed from: Z  reason: collision with root package name */
    public final M0.g f4574Z;

    /* renamed from: e0  reason: collision with root package name */
    public final N f4575e0;

    /* renamed from: f0  reason: collision with root package name */
    public final C0993a f4576f0;

    /* renamed from: g0  reason: collision with root package name */
    public final T0.g f4577g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Z f4578h0;

    /* renamed from: i0  reason: collision with root package name */
    public final E.e f4579i0;

    /* renamed from: j0  reason: collision with root package name */
    public final long f4580j0;

    /* renamed from: k0  reason: collision with root package name */
    public final long f4581k0;

    /* renamed from: l0  reason: collision with root package name */
    public final T0.d f4582l0;

    /* renamed from: m0  reason: collision with root package name */
    public final i1.p f4583m0;

    /* renamed from: n0  reason: collision with root package name */
    public final C5.i f4584n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Object f4585o0;

    /* renamed from: p0  reason: collision with root package name */
    public final SparseArray f4586p0;
    public final d q0;

    /* renamed from: r0  reason: collision with root package name */
    public final d f4587r0;

    /* renamed from: s0  reason: collision with root package name */
    public final A4.c f4588s0;

    /* renamed from: t0  reason: collision with root package name */
    public final i1.o f4589t0;

    /* renamed from: u0  reason: collision with root package name */
    public M0.h f4590u0;

    /* renamed from: v0  reason: collision with root package name */
    public i1.n f4591v0;

    /* renamed from: w0  reason: collision with root package name */
    public M0.C f4592w0;

    /* renamed from: x0  reason: collision with root package name */
    public a f4593x0;

    /* renamed from: y0  reason: collision with root package name */
    public Handler f4594y0;

    /* renamed from: z0  reason: collision with root package name */
    public C0144y f4595z0;

    static {
        D.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [R0.d] */
    /* JADX WARN: Type inference failed for: r2v12, types: [R0.d] */
    public h(C c8, M0.g gVar, i1.p pVar, N n7, C0993a c0993a, T0.g gVar2, Z z7, long j, long j8) {
        this.f4572K0 = c8;
        this.f4595z0 = c8.f1643c;
        C0145z c0145z = c8.f1642b;
        c0145z.getClass();
        Uri uri = c0145z.f1914a;
        this.f4562A0 = uri;
        this.f4563B0 = uri;
        this.f4564C0 = null;
        this.f4574Z = gVar;
        this.f4583m0 = pVar;
        this.f4575e0 = n7;
        this.f4577g0 = gVar2;
        this.f4578h0 = z7;
        this.f4580j0 = j;
        this.f4581k0 = j8;
        this.f4576f0 = c0993a;
        this.f4579i0 = new E.e(10);
        this.f4573Y = false;
        this.f4582l0 = a(null);
        this.f4585o0 = new Object();
        this.f4586p0 = new SparseArray();
        this.f4588s0 = new A4.c(this, 20);
        this.f4570I0 = -9223372036854775807L;
        this.f4568G0 = -9223372036854775807L;
        this.f4584n0 = new C5.i(this, 19);
        this.f4589t0 = new A.m(this, 15);
        this.q0 = new Runnable(this) { // from class: R0.d

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ h f4551b;

            {
                this.f4551b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f4551b.A();
                        return;
                    default:
                        this.f4551b.z(false);
                        return;
                }
            }
        };
        this.f4587r0 = new Runnable(this) { // from class: R0.d

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ h f4551b;

            {
                this.f4551b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f4551b.A();
                        return;
                    default:
                        this.f4551b.z(false);
                        return;
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean u(S0.h r5) {
        /*
            r0 = 0
            r1 = r0
        L2:
            java.util.List r2 = r5.f4880c
            int r3 = r2.size()
            if (r1 >= r3) goto L1d
            java.lang.Object r2 = r2.get(r1)
            S0.a r2 = (S0.a) r2
            int r2 = r2.f4839b
            r3 = 1
            if (r2 == r3) goto L1c
            r4 = 2
            if (r2 != r4) goto L19
            goto L1c
        L19:
            int r1 = r1 + 1
            goto L2
        L1c:
            return r3
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.h.u(S0.h):boolean");
    }

    public final void A() {
        Uri uri;
        this.f4594y0.removeCallbacks(this.q0);
        if (this.f4591v0.c()) {
            return;
        }
        if (this.f4591v0.d()) {
            this.f4565D0 = true;
            return;
        }
        synchronized (this.f4585o0) {
            uri = this.f4562A0;
        }
        this.f4565D0 = false;
        q qVar = new q(this.f4590u0, uri, 4, this.f4583m0);
        C5.i iVar = this.f4584n0;
        this.f4578h0.getClass();
        this.f4582l0.k(new r(qVar.f11432a, qVar.f11433b, this.f4591v0.f(qVar, iVar, 3)), qVar.f11434c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // e1.AbstractC0936a
    public final InterfaceC0958x b(C0960z c0960z, i1.e eVar, long j) {
        int intValue = ((Integer) c0960z.f10852a).intValue() - this.f4571J0;
        T0.d a7 = a(c0960z);
        T0.d dVar = new T0.d(this.f10774d.f5289c, 0, c0960z);
        int i7 = this.f4571J0 + intValue;
        S0.c cVar = this.f4564C0;
        M0.C c8 = this.f4592w0;
        long j8 = this.f4568G0;
        P0.k kVar = this.f10770X;
        K0.a.k(kVar);
        c cVar2 = new c(i7, cVar, this.f4579i0, intValue, this.f4575e0, c8, this.f4577g0, dVar, this.f4578h0, a7, j8, this.f4589t0, eVar, this.f4576f0, this.f4588s0, kVar);
        this.f4586p0.put(i7, cVar2);
        return cVar2;
    }

    @Override // e1.AbstractC0936a
    public final synchronized C h() {
        return this.f4572K0;
    }

    @Override // e1.AbstractC0936a
    public final void k() {
        this.f4589t0.a();
    }

    @Override // e1.AbstractC0936a
    public final void m(M0.C c8) {
        this.f4592w0 = c8;
        Looper myLooper = Looper.myLooper();
        P0.k kVar = this.f10770X;
        K0.a.k(kVar);
        T0.g gVar = this.f4577g0;
        gVar.p(myLooper, kVar);
        gVar.b();
        if (this.f4573Y) {
            z(false);
            return;
        }
        this.f4590u0 = this.f4574Z.a();
        this.f4591v0 = new i1.n("DashMediaSource");
        this.f4594y0 = x.n(null);
        A();
    }

    @Override // e1.AbstractC0936a
    public final void o(InterfaceC0958x interfaceC0958x) {
        c cVar = (c) interfaceC0958x;
        p pVar = cVar.f4540h0;
        pVar.f4631Z = true;
        pVar.f4635d.removeCallbacksAndMessages(null);
        for (C0986h c0986h : cVar.f4545m0) {
            c0986h.A(cVar);
        }
        cVar.f4544l0 = null;
        this.f4586p0.remove(cVar.f4532a);
    }

    @Override // e1.AbstractC0936a
    public final void q() {
        this.f4565D0 = false;
        this.f4590u0 = null;
        i1.n nVar = this.f4591v0;
        if (nVar != null) {
            nVar.e(null);
            this.f4591v0 = null;
        }
        this.f4566E0 = 0L;
        this.f4567F0 = 0L;
        this.f4562A0 = this.f4563B0;
        this.f4593x0 = null;
        Handler handler = this.f4594y0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f4594y0 = null;
        }
        this.f4568G0 = -9223372036854775807L;
        this.f4569H0 = 0;
        this.f4570I0 = -9223372036854775807L;
        this.f4586p0.clear();
        E.e eVar = this.f4579i0;
        ((HashMap) eVar.f920b).clear();
        ((HashMap) eVar.f921c).clear();
        ((HashMap) eVar.f922d).clear();
        this.f4577g0.release();
    }

    @Override // e1.AbstractC0936a
    public final synchronized void t(C c8) {
        this.f4572K0 = c8;
    }

    public final void v() {
        boolean z7;
        i1.n nVar = this.f4591v0;
        e eVar = new e(this);
        synchronized (AbstractC1362a.f13420b) {
            z7 = AbstractC1362a.f13421c;
        }
        if (z7) {
            eVar.a();
            return;
        }
        if (nVar == null) {
            nVar = new i1.n("SntpClient");
        }
        nVar.f(new e5.b(19), new C0927b(eVar), 1);
    }

    public final void w(q qVar, long j, long j8) {
        long j9 = qVar.f11432a;
        Uri uri = qVar.f11435d.f3133c;
        r rVar = new r(j8);
        this.f4578h0.getClass();
        this.f4582l0.c(rVar, qVar.f11434c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void x(IOException iOException) {
        K0.a.o("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.f4568G0 = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        z(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x02f2, code lost:
        if (r10 != (-9223372036854775807L)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x035e, code lost:
        if (r12.f1904a == (-9223372036854775807L)) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c6, code lost:
        r2 = r40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c9  */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28, types: [int] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20, types: [h1.r] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(boolean r41) {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.h.z(boolean):void");
    }
}
