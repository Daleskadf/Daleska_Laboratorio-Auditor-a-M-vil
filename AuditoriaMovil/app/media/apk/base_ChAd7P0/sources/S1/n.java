package S1;

import O0.K;
import com.google.android.libraries.barhopper.RecognitionOptions;
/* loaded from: classes.dex */
public final class n implements InterfaceC0341i {

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f5065l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final E f5066a;

    /* renamed from: b  reason: collision with root package name */
    public final K0.q f5067b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean[] f5068c = new boolean[4];

    /* renamed from: d  reason: collision with root package name */
    public final l f5069d;

    /* renamed from: e  reason: collision with root package name */
    public final K f5070e;
    public m f;

    /* renamed from: g  reason: collision with root package name */
    public long f5071g;

    /* renamed from: h  reason: collision with root package name */
    public String f5072h;

    /* renamed from: i  reason: collision with root package name */
    public m1.G f5073i;
    public boolean j;

    /* renamed from: k  reason: collision with root package name */
    public long f5074k;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, S1.l] */
    public n(E e7) {
        this.f5066a = e7;
        ?? obj = new Object();
        obj.f5057e = new byte[RecognitionOptions.ITF];
        this.f5069d = obj;
        this.f5074k = -9223372036854775807L;
        this.f5070e = new K(178);
        this.f5067b = new K0.q();
    }

    @Override // S1.InterfaceC0341i
    public final void a() {
        L0.g.a(this.f5068c);
        l lVar = this.f5069d;
        lVar.f5053a = false;
        lVar.f5055c = 0;
        lVar.f5054b = 0;
        m mVar = this.f;
        if (mVar != null) {
            mVar.f5059b = false;
            mVar.f5060c = false;
            mVar.f5061d = false;
            mVar.f5062e = -1;
        }
        K k2 = this.f5070e;
        if (k2 != null) {
            k2.d();
        }
        this.f5071g = 0L;
        this.f5074k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024c  */
    @Override // S1.InterfaceC0341i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(K0.q r19) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.n.b(K0.q):void");
    }

    @Override // S1.InterfaceC0341i
    public final void c(boolean z7) {
        K0.a.k(this.f);
        if (z7) {
            this.f.b(0, this.f5071g, this.j);
            m mVar = this.f;
            mVar.f5059b = false;
            mVar.f5060c = false;
            mVar.f5061d = false;
            mVar.f5062e = -1;
        }
    }

    @Override // S1.InterfaceC0341i
    public final void d(int i7, long j) {
        this.f5074k = j;
    }

    @Override // S1.InterfaceC0341i
    public final void e(m1.q qVar, H h8) {
        h8.a();
        h8.d();
        this.f5072h = (String) h8.f4961e;
        h8.d();
        m1.G s7 = qVar.s(h8.f4959c, 2);
        this.f5073i = s7;
        this.f = new m(s7);
        this.f5066a.b(qVar, h8);
    }
}
