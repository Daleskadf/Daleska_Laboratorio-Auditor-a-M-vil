package g1;

import A.j;
import A3.K;
import A3.e0;
import D.AbstractC0059i;
import H0.I;
import H0.r;
import J1.i;
import M0.x;
import N0.f;
import O0.AbstractC0243e;
import O0.C;
import O0.E;
import O0.H;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c6.C0692o0;
import com.google.firebase.firestore.Z;
import f5.C0993a;
import j$.util.Objects;
/* renamed from: g1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1008e extends AbstractC0243e implements Handler.Callback {

    /* renamed from: A0  reason: collision with root package name */
    public boolean f11093A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f11094B0;

    /* renamed from: C0  reason: collision with root package name */
    public r f11095C0;

    /* renamed from: D0  reason: collision with root package name */
    public long f11096D0;

    /* renamed from: E0  reason: collision with root package name */
    public long f11097E0;

    /* renamed from: F0  reason: collision with root package name */
    public long f11098F0;

    /* renamed from: m0  reason: collision with root package name */
    public final Z f11099m0;

    /* renamed from: n0  reason: collision with root package name */
    public final f f11100n0;

    /* renamed from: o0  reason: collision with root package name */
    public InterfaceC1004a f11101o0;

    /* renamed from: p0  reason: collision with root package name */
    public final C1006c f11102p0;
    public boolean q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f11103r0;

    /* renamed from: s0  reason: collision with root package name */
    public J1.e f11104s0;

    /* renamed from: t0  reason: collision with root package name */
    public i f11105t0;

    /* renamed from: u0  reason: collision with root package name */
    public J1.c f11106u0;

    /* renamed from: v0  reason: collision with root package name */
    public J1.c f11107v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f11108w0;

    /* renamed from: x0  reason: collision with root package name */
    public final Handler f11109x0;

    /* renamed from: y0  reason: collision with root package name */
    public final E f11110y0;

    /* renamed from: z0  reason: collision with root package name */
    public final x f11111z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1008e(E e7, Looper looper) {
        super(3);
        Handler handler;
        C1006c c1006c = InterfaceC1007d.f11092W;
        this.f11110y0 = e7;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.f11109x0 = handler;
        this.f11102p0 = c1006c;
        this.f11099m0 = new Z(6);
        this.f11100n0 = new f(1);
        this.f11111z0 = new x((char) 0, 5);
        this.f11098F0 = -9223372036854775807L;
        this.f11096D0 = -9223372036854775807L;
        this.f11097E0 = -9223372036854775807L;
    }

    public final void B() {
        boolean z7;
        if (!Objects.equals(this.f11095C0.f1886m, "application/cea-608") && !Objects.equals(this.f11095C0.f1886m, "application/x-mp4-cea-608") && !Objects.equals(this.f11095C0.f1886m, "application/cea-708")) {
            z7 = false;
        } else {
            z7 = true;
        }
        K0.a.i("Legacy decoding is disabled, can't handle " + this.f11095C0.f1886m + " samples (expected application/x-media3-cues).", z7);
    }

    public final long C() {
        if (this.f11108w0 == -1) {
            return Long.MAX_VALUE;
        }
        this.f11106u0.getClass();
        if (this.f11108w0 >= this.f11106u0.e0()) {
            return Long.MAX_VALUE;
        }
        return this.f11106u0.x(this.f11108w0);
    }

    public final long D(long j) {
        boolean z7;
        boolean z8 = false;
        if (j != -9223372036854775807L) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        if (this.f11096D0 != -9223372036854775807L) {
            z8 = true;
        }
        K0.a.j(z8);
        return j - this.f11096D0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r3.equals("application/cea-608") == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E() {
        /*
            r7 = this;
            r0 = 1
            r7.q0 = r0
            H0.r r1 = r7.f11095C0
            r1.getClass()
            g1.c r2 = r7.f11102p0
            r2.getClass()
            java.lang.String r3 = r1.f1886m
            if (r3 == 0) goto L4d
            int r4 = r1.f1870F
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case 930165504: goto L31;
                case 1566015601: goto L28;
                case 1566016562: goto L1d;
                default: goto L1b;
            }
        L1b:
            r0 = r5
            goto L3b
        L1d:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L26
            goto L1b
        L26:
            r0 = 2
            goto L3b
        L28:
            java.lang.String r6 = "application/cea-608"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L3b
            goto L1b
        L31:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3a
            goto L1b
        L3a:
            r0 = 0
        L3b:
            switch(r0) {
                case 0: goto L47;
                case 1: goto L47;
                case 2: goto L3f;
                default: goto L3e;
            }
        L3e:
            goto L4d
        L3f:
            K1.g r0 = new K1.g
            java.util.List r1 = r1.f1889p
            r0.<init>(r4, r1)
            goto L6e
        L47:
            K1.c r0 = new K1.c
            r0.<init>(r3, r4)
            goto L6e
        L4d:
            java.lang.Object r0 = r2.f11091a
            f5.a r0 = (f5.C0993a) r0
            boolean r2 = r0.i(r1)
            if (r2 == 0) goto L76
            J1.l r0 = r0.j(r1)
            W0.b r1 = new W0.b
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L6e:
            r7.f11104s0 = r0
            long r1 = r7.f3706g0
            r0.a(r1)
            return
        L76:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = io.flutter.plugins.pathprovider.b.h(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C1008e.E():void");
    }

    public final void F(J0.c cVar) {
        K k2 = cVar.f2339a;
        E e7 = this.f11110y0;
        e7.f3482a.f3523g0.e(27, new C(k2));
        H h8 = e7.f3482a;
        h8.getClass();
        h8.f3523g0.e(27, new j(cVar, 16));
    }

    public final void G() {
        this.f11105t0 = null;
        this.f11108w0 = -1;
        J1.c cVar = this.f11106u0;
        if (cVar != null) {
            cVar.f();
            this.f11106u0 = null;
        }
        J1.c cVar2 = this.f11107v0;
        if (cVar2 != null) {
            cVar2.f();
            this.f11107v0 = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            F((J0.c) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // O0.AbstractC0243e
    public final String i() {
        return "TextRenderer";
    }

    @Override // O0.AbstractC0243e
    public final boolean k() {
        return this.f11094B0;
    }

    @Override // O0.AbstractC0243e
    public final boolean l() {
        return true;
    }

    @Override // O0.AbstractC0243e
    public final void m() {
        this.f11095C0 = null;
        this.f11098F0 = -9223372036854775807L;
        e0 e0Var = e0.f138e;
        D(this.f11097E0);
        J0.c cVar = new J0.c(e0Var);
        Handler handler = this.f11109x0;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            F(cVar);
        }
        this.f11096D0 = -9223372036854775807L;
        this.f11097E0 = -9223372036854775807L;
        if (this.f11104s0 != null) {
            G();
            J1.e eVar = this.f11104s0;
            eVar.getClass();
            eVar.release();
            this.f11104s0 = null;
            this.f11103r0 = 0;
        }
    }

    @Override // O0.AbstractC0243e
    public final void o(long j, boolean z7) {
        this.f11097E0 = j;
        InterfaceC1004a interfaceC1004a = this.f11101o0;
        if (interfaceC1004a != null) {
            interfaceC1004a.clear();
        }
        e0 e0Var = e0.f138e;
        D(this.f11097E0);
        J0.c cVar = new J0.c(e0Var);
        Handler handler = this.f11109x0;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            F(cVar);
        }
        this.f11093A0 = false;
        this.f11094B0 = false;
        this.f11098F0 = -9223372036854775807L;
        r rVar = this.f11095C0;
        if (rVar != null && !Objects.equals(rVar.f1886m, "application/x-media3-cues")) {
            if (this.f11103r0 != 0) {
                G();
                J1.e eVar = this.f11104s0;
                eVar.getClass();
                eVar.release();
                this.f11104s0 = null;
                this.f11103r0 = 0;
                E();
                return;
            }
            G();
            J1.e eVar2 = this.f11104s0;
            eVar2.getClass();
            eVar2.flush();
            eVar2.a(this.f3706g0);
        }
    }

    @Override // O0.AbstractC0243e
    public final void t(r[] rVarArr, long j, long j8) {
        InterfaceC1004a c0692o0;
        this.f11096D0 = j8;
        r rVar = rVarArr[0];
        this.f11095C0 = rVar;
        if (!Objects.equals(rVar.f1886m, "application/x-media3-cues")) {
            B();
            if (this.f11104s0 != null) {
                this.f11103r0 = 1;
                return;
            } else {
                E();
                return;
            }
        }
        if (this.f11095C0.f1871G == 1) {
            c0692o0 = new C1005b();
        } else {
            c0692o0 = new C0692o0(1);
        }
        this.f11101o0 = c0692o0;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x023f A[EXC_TOP_SPLITTER, LOOP:2: B:138:0x023f->B:131:0x02ad, LOOP_START, PHI: r15 
      PHI: (r15v2 M0.x) = (r15v1 M0.x), (r15v3 M0.x) binds: [B:100:0x023b, B:131:0x02ad] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ed  */
    @Override // O0.AbstractC0243e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C1008e.v(long, long):void");
    }

    @Override // O0.AbstractC0243e
    public final int z(r rVar) {
        int i7;
        if (!Objects.equals(rVar.f1886m, "application/x-media3-cues")) {
            C1006c c1006c = this.f11102p0;
            c1006c.getClass();
            if (!((C0993a) c1006c.f11091a).i(rVar)) {
                String str = rVar.f1886m;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    if (I.j(str)) {
                        return AbstractC0059i.s(1, 0, 0, 0);
                    }
                    return AbstractC0059i.s(0, 0, 0, 0);
                }
            }
        }
        if (rVar.f1874J == 0) {
            i7 = 4;
        } else {
            i7 = 2;
        }
        return AbstractC0059i.s(i7, 0, 0, 0);
    }
}
