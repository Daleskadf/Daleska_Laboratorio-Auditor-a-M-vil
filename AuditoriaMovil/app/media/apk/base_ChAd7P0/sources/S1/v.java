package S1;
/* loaded from: classes.dex */
public final class v implements InterfaceC0341i {

    /* renamed from: e  reason: collision with root package name */
    public String f5177e;
    public m1.G f;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5180i;

    /* renamed from: k  reason: collision with root package name */
    public int f5181k;

    /* renamed from: l  reason: collision with root package name */
    public int f5182l;

    /* renamed from: n  reason: collision with root package name */
    public int f5184n;

    /* renamed from: o  reason: collision with root package name */
    public int f5185o;

    /* renamed from: s  reason: collision with root package name */
    public int f5189s;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5191u;

    /* renamed from: d  reason: collision with root package name */
    public int f5176d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final K0.q f5173a = new K0.q(new byte[15], 2);

    /* renamed from: b  reason: collision with root package name */
    public final K0.p f5174b = new K0.p();

    /* renamed from: c  reason: collision with root package name */
    public final K0.q f5175c = new K0.q();

    /* renamed from: p  reason: collision with root package name */
    public final w f5186p = new Object();

    /* renamed from: q  reason: collision with root package name */
    public int f5187q = -2147483647;

    /* renamed from: r  reason: collision with root package name */
    public int f5188r = -1;

    /* renamed from: t  reason: collision with root package name */
    public long f5190t = -1;
    public boolean j = true;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5183m = true;

    /* renamed from: g  reason: collision with root package name */
    public double f5178g = -9.223372036854776E18d;

    /* renamed from: h  reason: collision with root package name */
    public double f5179h = -9.223372036854776E18d;

    @Override // S1.InterfaceC0341i
    public final void a() {
        this.f5176d = 0;
        this.f5182l = 0;
        this.f5173a.D(2);
        this.f5184n = 0;
        this.f5185o = 0;
        this.f5187q = -2147483647;
        this.f5188r = -1;
        this.f5189s = 0;
        this.f5190t = -1L;
        this.f5191u = false;
        this.f5180i = false;
        this.f5183m = true;
        this.j = true;
        this.f5178g = -9.223372036854776E18d;
        this.f5179h = -9.223372036854776E18d;
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0476 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x045d A[SYNTHETIC] */
    @Override // S1.InterfaceC0341i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(K0.q r24) {
        /*
            Method dump skipped, instructions count: 1372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.v.b(K0.q):void");
    }

    @Override // S1.InterfaceC0341i
    public final void d(int i7, long j) {
        this.f5181k = i7;
        if (!this.j && (this.f5185o != 0 || !this.f5183m)) {
            this.f5180i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.f5180i) {
                this.f5179h = j;
            } else {
                this.f5178g = j;
            }
        }
    }

    @Override // S1.InterfaceC0341i
    public final void e(m1.q qVar, H h8) {
        h8.a();
        h8.d();
        this.f5177e = (String) h8.f4961e;
        h8.d();
        this.f = qVar.s(h8.f4959c, 1);
    }

    @Override // S1.InterfaceC0341i
    public final void c(boolean z7) {
    }
}
