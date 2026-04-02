package S1;

import D.AbstractC0059i;
import H0.C0137q;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
/* renamed from: S1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337e implements InterfaceC0341i {

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f4990w = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4991a;

    /* renamed from: d  reason: collision with root package name */
    public final String f4994d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4995e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public m1.G f4996g;

    /* renamed from: h  reason: collision with root package name */
    public m1.G f4997h;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5000l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5001m;

    /* renamed from: p  reason: collision with root package name */
    public int f5004p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5005q;

    /* renamed from: s  reason: collision with root package name */
    public int f5007s;

    /* renamed from: u  reason: collision with root package name */
    public m1.G f5009u;

    /* renamed from: v  reason: collision with root package name */
    public long f5010v;

    /* renamed from: b  reason: collision with root package name */
    public final K0.p f4992b = new K0.p(new byte[7], 7);

    /* renamed from: c  reason: collision with root package name */
    public final K0.q f4993c = new K0.q(Arrays.copyOf(f4990w, 10));

    /* renamed from: i  reason: collision with root package name */
    public int f4998i = 0;
    public int j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f4999k = RecognitionOptions.QR_CODE;

    /* renamed from: n  reason: collision with root package name */
    public int f5002n = -1;

    /* renamed from: o  reason: collision with root package name */
    public int f5003o = -1;

    /* renamed from: r  reason: collision with root package name */
    public long f5006r = -9223372036854775807L;

    /* renamed from: t  reason: collision with root package name */
    public long f5008t = -9223372036854775807L;

    public C0337e(int i7, String str, boolean z7) {
        this.f4991a = z7;
        this.f4994d = str;
        this.f4995e = i7;
    }

    @Override // S1.InterfaceC0341i
    public final void a() {
        this.f5008t = -9223372036854775807L;
        this.f5001m = false;
        this.f4998i = 0;
        this.j = 0;
        this.f4999k = RecognitionOptions.QR_CODE;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f7  */
    @Override // S1.InterfaceC0341i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(K0.q r24) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.C0337e.b(K0.q):void");
    }

    @Override // S1.InterfaceC0341i
    public final void d(int i7, long j) {
        this.f5008t = j;
    }

    @Override // S1.InterfaceC0341i
    public final void e(m1.q qVar, H h8) {
        h8.a();
        h8.d();
        this.f = (String) h8.f4961e;
        h8.d();
        m1.G s7 = qVar.s(h8.f4959c, 1);
        this.f4996g = s7;
        this.f5009u = s7;
        if (this.f4991a) {
            h8.a();
            h8.d();
            m1.G s8 = qVar.s(h8.f4959c, 5);
            this.f4997h = s8;
            C0137q c0137q = new C0137q();
            h8.d();
            c0137q.f1841a = (String) h8.f4961e;
            c0137q.f1850l = H0.I.l("application/id3");
            AbstractC0059i.H(c0137q, s8);
            return;
        }
        this.f4997h = new m1.n();
    }

    @Override // S1.InterfaceC0341i
    public final void c(boolean z7) {
    }
}
