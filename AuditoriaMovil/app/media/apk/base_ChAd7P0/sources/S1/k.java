package S1;

import O0.K;
import com.google.android.libraries.barhopper.RecognitionOptions;
/* loaded from: classes.dex */
public final class k implements InterfaceC0341i {

    /* renamed from: q  reason: collision with root package name */
    public static final double[] f5038q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    public String f5039a;

    /* renamed from: b  reason: collision with root package name */
    public m1.G f5040b;

    /* renamed from: c  reason: collision with root package name */
    public final E f5041c;

    /* renamed from: d  reason: collision with root package name */
    public final K0.q f5042d;

    /* renamed from: e  reason: collision with root package name */
    public final K f5043e;
    public final boolean[] f = new boolean[4];

    /* renamed from: g  reason: collision with root package name */
    public final j f5044g;

    /* renamed from: h  reason: collision with root package name */
    public long f5045h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5046i;
    public boolean j;

    /* renamed from: k  reason: collision with root package name */
    public long f5047k;

    /* renamed from: l  reason: collision with root package name */
    public long f5048l;

    /* renamed from: m  reason: collision with root package name */
    public long f5049m;

    /* renamed from: n  reason: collision with root package name */
    public long f5050n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5051o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5052p;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, S1.j] */
    public k(E e7) {
        this.f5041c = e7;
        ?? obj = new Object();
        obj.f5037d = new byte[RecognitionOptions.ITF];
        this.f5044g = obj;
        if (e7 != null) {
            this.f5043e = new K(178);
            this.f5042d = new K0.q();
        } else {
            this.f5043e = null;
            this.f5042d = null;
        }
        this.f5048l = -9223372036854775807L;
        this.f5050n = -9223372036854775807L;
    }

    @Override // S1.InterfaceC0341i
    public final void a() {
        L0.g.a(this.f);
        j jVar = this.f5044g;
        jVar.f5034a = false;
        jVar.f5035b = 0;
        jVar.f5036c = 0;
        K k2 = this.f5043e;
        if (k2 != null) {
            k2.d();
        }
        this.f5045h = 0L;
        this.f5046i = false;
        this.f5048l = -9223372036854775807L;
        this.f5050n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0208  */
    @Override // S1.InterfaceC0341i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(K0.q r27) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.k.b(K0.q):void");
    }

    @Override // S1.InterfaceC0341i
    public final void c(boolean z7) {
        K0.a.k(this.f5040b);
        if (z7) {
            boolean z8 = this.f5051o;
            this.f5040b.e(this.f5050n, z8 ? 1 : 0, (int) (this.f5045h - this.f5049m), 0, null);
        }
    }

    @Override // S1.InterfaceC0341i
    public final void d(int i7, long j) {
        this.f5048l = j;
    }

    @Override // S1.InterfaceC0341i
    public final void e(m1.q qVar, H h8) {
        h8.a();
        h8.d();
        this.f5039a = (String) h8.f4961e;
        h8.d();
        this.f5040b = qVar.s(h8.f4959c, 2);
        E e7 = this.f5041c;
        if (e7 != null) {
            e7.b(qVar, h8);
        }
    }
}
