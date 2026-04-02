package J1;

import D.AbstractC0059i;
import H0.C0137q;
import H0.I;
import H0.InterfaceC0131k;
import H0.r;
import K0.q;
import K0.x;
import java.io.EOFException;
import m1.F;
import m1.G;
/* loaded from: classes.dex */
public final class o implements G {

    /* renamed from: a  reason: collision with root package name */
    public final G f2385a;

    /* renamed from: b  reason: collision with root package name */
    public final j f2386b;

    /* renamed from: g  reason: collision with root package name */
    public l f2390g;

    /* renamed from: h  reason: collision with root package name */
    public r f2391h;

    /* renamed from: d  reason: collision with root package name */
    public int f2388d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f2389e = 0;
    public byte[] f = x.f;

    /* renamed from: c  reason: collision with root package name */
    public final q f2387c = new q();

    public o(G g3, j jVar) {
        this.f2385a = g3;
        this.f2386b = jVar;
    }

    @Override // m1.G
    public final void a(q qVar, int i7, int i8) {
        if (this.f2390g == null) {
            this.f2385a.a(qVar, i7, i8);
            return;
        }
        g(i7);
        qVar.f(this.f, this.f2389e, i7);
        this.f2389e += i7;
    }

    @Override // m1.G
    public final int b(InterfaceC0131k interfaceC0131k, int i7, boolean z7) {
        return f(interfaceC0131k, i7, z7);
    }

    @Override // m1.G
    public final void c(r rVar) {
        boolean z7;
        l lVar;
        rVar.f1886m.getClass();
        String str = rVar.f1886m;
        if (I.g(str) == 3) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        boolean equals = rVar.equals(this.f2391h);
        j jVar = this.f2386b;
        if (!equals) {
            this.f2391h = rVar;
            if (jVar.i(rVar)) {
                lVar = jVar.j(rVar);
            } else {
                lVar = null;
            }
            this.f2390g = lVar;
        }
        l lVar2 = this.f2390g;
        G g3 = this.f2385a;
        if (lVar2 == null) {
            g3.c(rVar);
            return;
        }
        C0137q a7 = rVar.a();
        a7.f1850l = I.l("application/x-media3-cues");
        a7.f1848i = str;
        a7.f1855q = Long.MAX_VALUE;
        a7.f1837F = jVar.k(rVar);
        AbstractC0059i.H(a7, g3);
    }

    @Override // m1.G
    public final /* synthetic */ void d(int i7, q qVar) {
        io.flutter.plugins.pathprovider.b.b(this, qVar, i7);
    }

    @Override // m1.G
    public final void e(long j, int i7, int i8, int i9, F f) {
        boolean z7;
        if (this.f2390g == null) {
            this.f2385a.e(j, i7, i8, i9, f);
            return;
        }
        if (f == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.d("DRM on subtitles is not supported", z7);
        int i10 = (this.f2389e - i9) - i8;
        this.f2390g.l(this.f, i10, i8, k.f2376c, new n(this, j, i7));
        int i11 = i10 + i8;
        this.f2388d = i11;
        if (i11 == this.f2389e) {
            this.f2388d = 0;
            this.f2389e = 0;
        }
    }

    @Override // m1.G
    public final int f(InterfaceC0131k interfaceC0131k, int i7, boolean z7) {
        if (this.f2390g == null) {
            return this.f2385a.f(interfaceC0131k, i7, z7);
        }
        g(i7);
        int read = interfaceC0131k.read(this.f, this.f2389e, i7);
        if (read == -1) {
            if (z7) {
                return -1;
            }
            throw new EOFException();
        }
        this.f2389e += read;
        return read;
    }

    public final void g(int i7) {
        byte[] bArr;
        int length = this.f.length;
        int i8 = this.f2389e;
        if (length - i8 >= i7) {
            return;
        }
        int i9 = i8 - this.f2388d;
        int max = Math.max(i9 * 2, i7 + i9);
        byte[] bArr2 = this.f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.f2388d, bArr, 0, i9);
        this.f2388d = 0;
        this.f2389e = i9;
        this.f = bArr;
    }
}
