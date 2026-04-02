package S1;

import O0.K;
/* loaded from: classes.dex */
public final class q implements InterfaceC0341i {

    /* renamed from: a  reason: collision with root package name */
    public final E f5106a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5107b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5108c;

    /* renamed from: g  reason: collision with root package name */
    public long f5111g;

    /* renamed from: i  reason: collision with root package name */
    public String f5113i;
    public m1.G j;

    /* renamed from: k  reason: collision with root package name */
    public p f5114k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5115l;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5117n;

    /* renamed from: h  reason: collision with root package name */
    public final boolean[] f5112h = new boolean[3];

    /* renamed from: d  reason: collision with root package name */
    public final K f5109d = new K(7);

    /* renamed from: e  reason: collision with root package name */
    public final K f5110e = new K(8);
    public final K f = new K(6);

    /* renamed from: m  reason: collision with root package name */
    public long f5116m = -9223372036854775807L;

    /* renamed from: o  reason: collision with root package name */
    public final K0.q f5118o = new K0.q();

    public q(E e7, boolean z7, boolean z8) {
        this.f5106a = e7;
        this.f5107b = z7;
        this.f5108c = z8;
    }

    @Override // S1.InterfaceC0341i
    public final void a() {
        this.f5111g = 0L;
        this.f5117n = false;
        this.f5116m = -9223372036854775807L;
        L0.g.a(this.f5112h);
        this.f5109d.d();
        this.f5110e.d();
        this.f.d();
        p pVar = this.f5114k;
        if (pVar != null) {
            pVar.f5097k = false;
            pVar.f5101o = false;
            o oVar = pVar.f5100n;
            oVar.f5076b = false;
            oVar.f5075a = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02ae, code lost:
        if (r2 != 1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0220, code lost:
        if (r6.f5086n != r7.f5086n) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0231, code lost:
        if (r6.f5088p != r7.f5088p) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x023f, code lost:
        if (r6.f5084l != r7.f5084l) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0286  */
    @Override // S1.InterfaceC0341i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(K0.q r31) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.q.b(K0.q):void");
    }

    @Override // S1.InterfaceC0341i
    public final void c(boolean z7) {
        K0.a.k(this.j);
        int i7 = K0.x.f2529a;
        if (z7) {
            p pVar = this.f5114k;
            long j = this.f5111g;
            pVar.a();
            pVar.j = j;
            long j8 = pVar.f5103q;
            if (j8 != -9223372036854775807L) {
                boolean z8 = pVar.f5104r;
                pVar.f5089a.e(j8, z8 ? 1 : 0, (int) (j - pVar.f5102p), 0, null);
            }
            pVar.f5101o = false;
        }
    }

    @Override // S1.InterfaceC0341i
    public final void d(int i7, long j) {
        boolean z7;
        this.f5116m = j;
        boolean z8 = this.f5117n;
        if ((i7 & 2) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f5117n = z7 | z8;
    }

    @Override // S1.InterfaceC0341i
    public final void e(m1.q qVar, H h8) {
        h8.a();
        h8.d();
        this.f5113i = (String) h8.f4961e;
        h8.d();
        m1.G s7 = qVar.s(h8.f4959c, 2);
        this.j = s7;
        this.f5114k = new p(s7, this.f5107b, this.f5108c);
        this.f5106a.b(qVar, h8);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.q.f(byte[], int, int):void");
    }
}
