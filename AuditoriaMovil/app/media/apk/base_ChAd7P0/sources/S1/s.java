package S1;

import O0.K;
/* loaded from: classes.dex */
public final class s implements InterfaceC0341i {

    /* renamed from: a  reason: collision with root package name */
    public final E f5130a;

    /* renamed from: b  reason: collision with root package name */
    public String f5131b;

    /* renamed from: c  reason: collision with root package name */
    public m1.G f5132c;

    /* renamed from: d  reason: collision with root package name */
    public r f5133d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5134e;

    /* renamed from: l  reason: collision with root package name */
    public long f5139l;
    public final boolean[] f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    public final K f5135g = new K(32);

    /* renamed from: h  reason: collision with root package name */
    public final K f5136h = new K(33);

    /* renamed from: i  reason: collision with root package name */
    public final K f5137i = new K(34);
    public final K j = new K(39);

    /* renamed from: k  reason: collision with root package name */
    public final K f5138k = new K(40);

    /* renamed from: m  reason: collision with root package name */
    public long f5140m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    public final K0.q f5141n = new K0.q();

    public s(E e7) {
        this.f5130a = e7;
    }

    @Override // S1.InterfaceC0341i
    public final void a() {
        this.f5139l = 0L;
        this.f5140m = -9223372036854775807L;
        L0.g.a(this.f);
        this.f5135g.d();
        this.f5136h.d();
        this.f5137i.d();
        this.j.d();
        this.f5138k.d();
        r rVar = this.f5133d;
        if (rVar != null) {
            rVar.f = false;
            rVar.f5124g = false;
            rVar.f5125h = false;
            rVar.f5126i = false;
            rVar.j = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022c A[SYNTHETIC] */
    @Override // S1.InterfaceC0341i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(K0.q r38) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.s.b(K0.q):void");
    }

    @Override // S1.InterfaceC0341i
    public final void c(boolean z7) {
        K0.a.k(this.f5132c);
        int i7 = K0.x.f2529a;
        if (z7) {
            r rVar = this.f5133d;
            long j = this.f5139l;
            rVar.f5129m = rVar.f5121c;
            rVar.a((int) (j - rVar.f5120b));
            rVar.f5127k = rVar.f5120b;
            rVar.f5120b = j;
            rVar.a(0);
            rVar.f5126i = false;
        }
    }

    @Override // S1.InterfaceC0341i
    public final void d(int i7, long j) {
        this.f5140m = j;
    }

    @Override // S1.InterfaceC0341i
    public final void e(m1.q qVar, H h8) {
        h8.a();
        h8.d();
        this.f5131b = (String) h8.f4961e;
        h8.d();
        m1.G s7 = qVar.s(h8.f4959c, 2);
        this.f5132c = s7;
        this.f5133d = new r(s7);
        this.f5130a.b(qVar, h8);
    }

    public final void f(byte[] bArr, int i7, int i8) {
        boolean z7;
        r rVar = this.f5133d;
        if (rVar.f) {
            int i9 = rVar.f5122d;
            int i10 = (i7 + 2) - i9;
            if (i10 < i8) {
                if ((bArr[i10] & 128) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                rVar.f5124g = z7;
                rVar.f = false;
            } else {
                rVar.f5122d = (i8 - i7) + i9;
            }
        }
        if (!this.f5134e) {
            this.f5135g.a(bArr, i7, i8);
            this.f5136h.a(bArr, i7, i8);
            this.f5137i.a(bArr, i7, i8);
        }
        this.j.a(bArr, i7, i8);
        this.f5138k.a(bArr, i7, i8);
    }
}
