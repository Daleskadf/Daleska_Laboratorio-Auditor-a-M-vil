package S1;

import H0.C0137q;
import com.google.android.libraries.barhopper.RecognitionOptions;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class u implements InterfaceC0341i {

    /* renamed from: a  reason: collision with root package name */
    public final K0.q f5162a;

    /* renamed from: b  reason: collision with root package name */
    public final m1.y f5163b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5164c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5165d;

    /* renamed from: e  reason: collision with root package name */
    public m1.G f5166e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public int f5167g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f5168h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5169i;
    public boolean j;

    /* renamed from: k  reason: collision with root package name */
    public long f5170k;

    /* renamed from: l  reason: collision with root package name */
    public int f5171l;

    /* renamed from: m  reason: collision with root package name */
    public long f5172m;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, m1.y] */
    public u(String str, int i7) {
        K0.q qVar = new K0.q(4);
        this.f5162a = qVar;
        qVar.f2513a[0] = -1;
        this.f5163b = new Object();
        this.f5172m = -9223372036854775807L;
        this.f5164c = str;
        this.f5165d = i7;
    }

    @Override // S1.InterfaceC0341i
    public final void a() {
        this.f5167g = 0;
        this.f5168h = 0;
        this.j = false;
        this.f5172m = -9223372036854775807L;
    }

    @Override // S1.InterfaceC0341i
    public final void b(K0.q qVar) {
        boolean z7;
        boolean z8;
        K0.a.k(this.f5166e);
        while (qVar.a() > 0) {
            int i7 = this.f5167g;
            boolean z9 = true;
            K0.q qVar2 = this.f5162a;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int min = Math.min(qVar.a(), this.f5171l - this.f5168h);
                        this.f5166e.d(min, qVar);
                        int i8 = this.f5168h + min;
                        this.f5168h = i8;
                        if (i8 >= this.f5171l) {
                            if (this.f5172m == -9223372036854775807L) {
                                z9 = false;
                            }
                            K0.a.j(z9);
                            this.f5166e.e(this.f5172m, 1, this.f5171l, 0, null);
                            this.f5172m += this.f5170k;
                            this.f5168h = 0;
                            this.f5167g = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(qVar.a(), 4 - this.f5168h);
                    qVar.f(qVar2.f2513a, this.f5168h, min2);
                    int i9 = this.f5168h + min2;
                    this.f5168h = i9;
                    if (i9 >= 4) {
                        qVar2.G(0);
                        int h8 = qVar2.h();
                        m1.y yVar = this.f5163b;
                        if (!yVar.a(h8)) {
                            this.f5168h = 0;
                            this.f5167g = 1;
                        } else {
                            this.f5171l = yVar.f14014b;
                            if (!this.f5169i) {
                                this.f5170k = (yVar.f * 1000000) / yVar.f14015c;
                                C0137q c0137q = new C0137q();
                                c0137q.f1841a = this.f;
                                c0137q.f1850l = H0.I.l((String) yVar.f14018g);
                                c0137q.f1851m = RecognitionOptions.AZTEC;
                                c0137q.f1864z = yVar.f14016d;
                                c0137q.f1832A = yVar.f14015c;
                                c0137q.f1844d = this.f5164c;
                                c0137q.f = this.f5165d;
                                this.f5166e.c(new H0.r(c0137q));
                                this.f5169i = true;
                            }
                            qVar2.G(0);
                            this.f5166e.d(4, qVar2);
                            this.f5167g = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = qVar.f2513a;
                int i10 = qVar.f2514b;
                int i11 = qVar.f2515c;
                while (true) {
                    if (i10 < i11) {
                        byte b5 = bArr[i10];
                        if ((b5 & ForkServer.ERROR) == 255) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (this.j && (b5 & 224) == 224) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        this.j = z7;
                        if (z8) {
                            qVar.G(i10 + 1);
                            this.j = false;
                            qVar2.f2513a[1] = bArr[i10];
                            this.f5168h = 2;
                            this.f5167g = 1;
                            break;
                        }
                        i10++;
                    } else {
                        qVar.G(i11);
                        break;
                    }
                }
            }
        }
    }

    @Override // S1.InterfaceC0341i
    public final void d(int i7, long j) {
        this.f5172m = j;
    }

    @Override // S1.InterfaceC0341i
    public final void e(m1.q qVar, H h8) {
        h8.a();
        h8.d();
        this.f = (String) h8.f4961e;
        h8.d();
        this.f5166e = qVar.s(h8.f4959c, 1);
    }

    @Override // S1.InterfaceC0341i
    public final void c(boolean z7) {
    }
}
