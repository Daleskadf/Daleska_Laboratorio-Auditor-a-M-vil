package W0;

import D.AbstractC0059i;
import H0.r;
import M0.x;
import O0.AbstractC0243e;
import android.graphics.Bitmap;
import android.os.Trace;
import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class g extends AbstractC0243e {

    /* renamed from: A0  reason: collision with root package name */
    public Bitmap f6109A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f6110B0;

    /* renamed from: C0  reason: collision with root package name */
    public B2.c f6111C0;

    /* renamed from: D0  reason: collision with root package name */
    public B2.c f6112D0;

    /* renamed from: E0  reason: collision with root package name */
    public int f6113E0;

    /* renamed from: m0  reason: collision with root package name */
    public final A4.c f6114m0;

    /* renamed from: n0  reason: collision with root package name */
    public final N0.f f6115n0;

    /* renamed from: o0  reason: collision with root package name */
    public final ArrayDeque f6116o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f6117p0;
    public boolean q0;

    /* renamed from: r0  reason: collision with root package name */
    public f f6118r0;

    /* renamed from: s0  reason: collision with root package name */
    public long f6119s0;

    /* renamed from: t0  reason: collision with root package name */
    public long f6120t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f6121u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f6122v0;

    /* renamed from: w0  reason: collision with root package name */
    public r f6123w0;

    /* renamed from: x0  reason: collision with root package name */
    public b f6124x0;

    /* renamed from: y0  reason: collision with root package name */
    public N0.f f6125y0;

    /* renamed from: z0  reason: collision with root package name */
    public e f6126z0;

    public g(A4.c cVar) {
        super(4);
        this.f6114m0 = cVar;
        this.f6126z0 = e.f6105a;
        this.f6115n0 = new N0.f(0);
        this.f6118r0 = f.f6106c;
        this.f6116o0 = new ArrayDeque();
        this.f6120t0 = -9223372036854775807L;
        this.f6119s0 = -9223372036854775807L;
        this.f6121u0 = 0;
        this.f6122v0 = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0141, code lost:
        if (r14.f249a == ((r0.f1873I * r1.f1872H) - 1)) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(long r13) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.g.B(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0104, code lost:
        if (r2 == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011d  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, B2.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(long r13) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.g.C(long):boolean");
    }

    public final void D() {
        r rVar = this.f6123w0;
        A4.c cVar = this.f6114m0;
        int t7 = cVar.t(rVar);
        if (t7 != AbstractC0059i.s(4, 0, 0, 0) && t7 != AbstractC0059i.s(3, 0, 0, 0)) {
            throw f(new Exception("Provided decoder factory can't create decoder for format."), this.f6123w0, false, 4005);
        }
        b bVar = this.f6124x0;
        if (bVar != null) {
            bVar.release();
        }
        this.f6124x0 = new b((P0.b) cVar.f218b);
    }

    public final void E() {
        this.f6125y0 = null;
        this.f6121u0 = 0;
        this.f6120t0 = -9223372036854775807L;
        b bVar = this.f6124x0;
        if (bVar != null) {
            bVar.release();
            this.f6124x0 = null;
        }
    }

    @Override // O0.AbstractC0243e, O0.g0
    public final void b(int i7, Object obj) {
        e eVar;
        if (i7 == 15) {
            if (obj instanceof e) {
                eVar = (e) obj;
            } else {
                eVar = null;
            }
            if (eVar == null) {
                eVar = e.f6105a;
            }
            this.f6126z0 = eVar;
        }
    }

    @Override // O0.AbstractC0243e
    public final String i() {
        return "ImageRenderer";
    }

    @Override // O0.AbstractC0243e
    public final boolean k() {
        return this.q0;
    }

    @Override // O0.AbstractC0243e
    public final boolean l() {
        int i7 = this.f6122v0;
        if (i7 != 3 && (i7 != 0 || !this.f6110B0)) {
            return false;
        }
        return true;
    }

    @Override // O0.AbstractC0243e
    public final void m() {
        this.f6123w0 = null;
        this.f6118r0 = f.f6106c;
        this.f6116o0.clear();
        E();
        this.f6126z0.getClass();
    }

    @Override // O0.AbstractC0243e
    public final void n(boolean z7, boolean z8) {
        this.f6122v0 = z8 ? 1 : 0;
    }

    @Override // O0.AbstractC0243e
    public final void o(long j, boolean z7) {
        this.f6122v0 = Math.min(this.f6122v0, 1);
        this.q0 = false;
        this.f6117p0 = false;
        this.f6109A0 = null;
        this.f6111C0 = null;
        this.f6112D0 = null;
        this.f6110B0 = false;
        this.f6125y0 = null;
        b bVar = this.f6124x0;
        if (bVar != null) {
            bVar.flush();
        }
        this.f6116o0.clear();
    }

    @Override // O0.AbstractC0243e
    public final void p() {
        E();
    }

    @Override // O0.AbstractC0243e
    public final void q() {
        E();
        this.f6122v0 = Math.min(this.f6122v0, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r2 >= r7) goto L14;
     */
    @Override // O0.AbstractC0243e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(H0.r[] r6, long r7, long r9) {
        /*
            r5 = this;
            W0.f r6 = r5.f6118r0
            long r6 = r6.f6108b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L31
            java.util.ArrayDeque r6 = r5.f6116o0
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L26
            long r7 = r5.f6120t0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L31
            long r2 = r5.f6119s0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L26
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L26
            goto L31
        L26:
            W0.f r7 = new W0.f
            long r0 = r5.f6120t0
            r7.<init>(r0, r9)
            r6.add(r7)
            goto L38
        L31:
            W0.f r6 = new W0.f
            r6.<init>(r0, r9)
            r5.f6118r0 = r6
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.g.t(H0.r[], long, long):void");
    }

    @Override // O0.AbstractC0243e
    public final void v(long j, long j8) {
        if (this.q0) {
            return;
        }
        if (this.f6123w0 == null) {
            x xVar = this.f3701c;
            xVar.t();
            N0.f fVar = this.f6115n0;
            fVar.e();
            int u7 = u(xVar, fVar, 2);
            if (u7 == -5) {
                r rVar = (r) xVar.f3211c;
                K0.a.k(rVar);
                this.f6123w0 = rVar;
                D();
            } else if (u7 == -4) {
                K0.a.j(fVar.c(4));
                this.f6117p0 = true;
                this.q0 = true;
                return;
            } else {
                return;
            }
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (B(j)) {
            }
            while (C(j)) {
            }
            Trace.endSection();
        } catch (d e7) {
            throw f(e7, null, false, 4003);
        }
    }

    @Override // O0.AbstractC0243e
    public final int z(r rVar) {
        return this.f6114m0.t(rVar);
    }
}
