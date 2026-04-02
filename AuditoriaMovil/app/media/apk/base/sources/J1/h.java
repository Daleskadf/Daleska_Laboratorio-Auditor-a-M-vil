package J1;

import A3.K;
import A3.e0;
import H0.C0137q;
import H0.C0140u;
import H0.I;
import H0.J;
import H0.r;
import K0.q;
import K0.x;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import m1.G;
import m1.p;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class h implements m1.o {

    /* renamed from: a  reason: collision with root package name */
    public final l f2366a;

    /* renamed from: b  reason: collision with root package name */
    public final r f2367b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f2368c;
    public G f;

    /* renamed from: g  reason: collision with root package name */
    public int f2371g;

    /* renamed from: h  reason: collision with root package name */
    public int f2372h;

    /* renamed from: i  reason: collision with root package name */
    public long[] f2373i;
    public long j;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f2370e = x.f;

    /* renamed from: d  reason: collision with root package name */
    public final q f2369d = new q();

    public h(l lVar, r rVar) {
        this.f2366a = lVar;
        C0137q a7 = rVar.a();
        a7.f1850l = I.l("application/x-media3-cues");
        a7.f1848i = rVar.f1886m;
        a7.f1837F = lVar.m();
        this.f2367b = new r(a7);
        this.f2368c = new ArrayList();
        this.f2372h = 0;
        this.f2373i = x.f2534g;
        this.j = -9223372036854775807L;
    }

    @Override // m1.o
    public final void a(long j, long j8) {
        boolean z7;
        int i7 = this.f2372h;
        if (i7 != 0 && i7 != 5) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        this.j = j8;
        if (this.f2372h == 2) {
            this.f2372h = 1;
        }
        if (this.f2372h == 4) {
            this.f2372h = 3;
        }
    }

    public final void b(g gVar) {
        K0.a.k(this.f);
        byte[] bArr = gVar.f2365b;
        int length = bArr.length;
        q qVar = this.f2369d;
        qVar.getClass();
        qVar.E(bArr, bArr.length);
        this.f.d(length, qVar);
        this.f.e(gVar.f2364a, 1, length, 0, null);
    }

    @Override // m1.o
    public final m1.o c() {
        return this;
    }

    @Override // m1.o
    public final boolean e(p pVar) {
        return true;
    }

    @Override // m1.o
    public final List f() {
        A3.I i7 = K.f98b;
        return e0.f138e;
    }

    @Override // m1.o
    public final void g(m1.q qVar) {
        boolean z7;
        if (this.f2372h == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        G s7 = qVar.s(0, 3);
        this.f = s7;
        s7.c(this.f2367b);
        qVar.h();
        qVar.x(new m1.x(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f2372h = 1;
    }

    @Override // m1.o
    public final int i(p pVar, C0140u c0140u) {
        boolean z7;
        int i7;
        int f;
        k kVar;
        int i8;
        int i9 = this.f2372h;
        if (i9 != 0 && i9 != 5) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        if (this.f2372h == 1) {
            if (((m1.l) pVar).f13973c != -1) {
                i8 = AbstractC1740d.g(((m1.l) pVar).f13973c);
            } else {
                i8 = 1024;
            }
            if (i8 > this.f2370e.length) {
                this.f2370e = new byte[i8];
            }
            this.f2371g = 0;
            this.f2372h = 2;
        }
        int i10 = this.f2372h;
        ArrayList arrayList = this.f2368c;
        if (i10 == 2) {
            byte[] bArr = this.f2370e;
            if (bArr.length == this.f2371g) {
                this.f2370e = Arrays.copyOf(bArr, bArr.length + RecognitionOptions.UPC_E);
            }
            byte[] bArr2 = this.f2370e;
            int i11 = this.f2371g;
            m1.l lVar = (m1.l) pVar;
            int read = lVar.read(bArr2, i11, bArr2.length - i11);
            if (read != -1) {
                this.f2371g += read;
            }
            long j = lVar.f13973c;
            if ((j != -1 && this.f2371g == j) || read == -1) {
                try {
                    long j8 = this.j;
                    if (j8 != -9223372036854775807L) {
                        kVar = new k(j8, true);
                    } else {
                        kVar = k.f2376c;
                    }
                    this.f2366a.l(this.f2370e, 0, this.f2371g, kVar, new A.j(this, 6));
                    Collections.sort(arrayList);
                    this.f2373i = new long[arrayList.size()];
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        this.f2373i[i12] = ((g) arrayList.get(i12)).f2364a;
                    }
                    this.f2370e = x.f;
                    this.f2372h = 4;
                } catch (RuntimeException e7) {
                    throw J.a(e7, "SubtitleParser failed.");
                }
            }
        }
        if (this.f2372h == 3) {
            if (((m1.l) pVar).f13973c != -1) {
                i7 = AbstractC1740d.g(((m1.l) pVar).f13973c);
            } else {
                i7 = RecognitionOptions.UPC_E;
            }
            if (((m1.l) pVar).r(i7) == -1) {
                long j9 = this.j;
                if (j9 == -9223372036854775807L) {
                    f = 0;
                } else {
                    f = x.f(this.f2373i, j9, true);
                }
                while (f < arrayList.size()) {
                    b((g) arrayList.get(f));
                    f++;
                }
                this.f2372h = 4;
            }
        }
        if (this.f2372h != 4) {
            return 0;
        }
        return -1;
    }

    @Override // m1.o
    public final void release() {
        if (this.f2372h == 5) {
            return;
        }
        this.f2366a.a();
        this.f2372h = 5;
    }
}
