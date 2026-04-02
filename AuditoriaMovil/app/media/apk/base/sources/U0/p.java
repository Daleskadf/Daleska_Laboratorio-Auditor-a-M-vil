package U0;

import H0.C0137q;
import H0.I;
import H0.InterfaceC0131k;
import K0.x;
import java.io.EOFException;
import java.util.Arrays;
import m1.F;
import m1.G;
import w1.C1950b;
import x1.C1985a;
/* loaded from: classes.dex */
public final class p implements G {
    public static final H0.r f;

    /* renamed from: g  reason: collision with root package name */
    public static final H0.r f5641g;

    /* renamed from: a  reason: collision with root package name */
    public final G f5642a;

    /* renamed from: b  reason: collision with root package name */
    public final H0.r f5643b;

    /* renamed from: c  reason: collision with root package name */
    public H0.r f5644c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f5645d;

    /* renamed from: e  reason: collision with root package name */
    public int f5646e;

    static {
        C0137q c0137q = new C0137q();
        c0137q.f1850l = I.l("application/id3");
        f = new H0.r(c0137q);
        C0137q c0137q2 = new C0137q();
        c0137q2.f1850l = I.l("application/x-emsg");
        f5641g = new H0.r(c0137q2);
    }

    public p(G g3, int i7) {
        this.f5642a = g3;
        if (i7 != 1) {
            if (i7 == 3) {
                this.f5643b = f5641g;
            } else {
                throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "Unknown metadataType: "));
            }
        } else {
            this.f5643b = f;
        }
        this.f5645d = new byte[0];
        this.f5646e = 0;
    }

    @Override // m1.G
    public final void a(K0.q qVar, int i7, int i8) {
        int i9 = this.f5646e + i7;
        byte[] bArr = this.f5645d;
        if (bArr.length < i9) {
            this.f5645d = Arrays.copyOf(bArr, (i9 / 2) + i9);
        }
        qVar.f(this.f5645d, this.f5646e, i7);
        this.f5646e += i7;
    }

    @Override // m1.G
    public final int b(InterfaceC0131k interfaceC0131k, int i7, boolean z7) {
        return f(interfaceC0131k, i7, z7);
    }

    @Override // m1.G
    public final void c(H0.r rVar) {
        this.f5644c = rVar;
        this.f5642a.c(this.f5643b);
    }

    @Override // m1.G
    public final /* synthetic */ void d(int i7, K0.q qVar) {
        io.flutter.plugins.pathprovider.b.b(this, qVar, i7);
    }

    @Override // m1.G
    public final void e(long j, int i7, int i8, int i9, F f4) {
        this.f5644c.getClass();
        int i10 = this.f5646e - i9;
        K0.q qVar = new K0.q(Arrays.copyOfRange(this.f5645d, i10 - i8, i10));
        byte[] bArr = this.f5645d;
        System.arraycopy(bArr, i10, bArr, 0, i9);
        this.f5646e = i9;
        String str = this.f5644c.f1886m;
        H0.r rVar = this.f5643b;
        if (!x.a(str, rVar.f1886m)) {
            if ("application/x-emsg".equals(this.f5644c.f1886m)) {
                C1985a j02 = C1950b.j0(qVar);
                H0.r b5 = j02.b();
                String str2 = rVar.f1886m;
                if (b5 != null && x.a(str2, b5.f1886m)) {
                    byte[] h8 = j02.h();
                    h8.getClass();
                    qVar = new K0.q(h8);
                } else {
                    H0.r b7 = j02.b();
                    K0.a.A("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + b7);
                    return;
                }
            } else {
                K0.a.A("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f5644c.f1886m);
                return;
            }
        }
        int a7 = qVar.a();
        G g3 = this.f5642a;
        g3.d(a7, qVar);
        g3.e(j, i7, a7, 0, f4);
    }

    @Override // m1.G
    public final int f(InterfaceC0131k interfaceC0131k, int i7, boolean z7) {
        int i8 = this.f5646e + i7;
        byte[] bArr = this.f5645d;
        if (bArr.length < i8) {
            this.f5645d = Arrays.copyOf(bArr, (i8 / 2) + i8);
        }
        int read = interfaceC0131k.read(this.f5645d, this.f5646e, i7);
        if (read == -1) {
            if (z7) {
                return -1;
            }
            throw new EOFException();
        }
        this.f5646e += read;
        return read;
    }
}
