package b1;

import K0.p;
import K0.x;
import a1.C0434k;
import java.math.RoundingMode;
import m1.G;
import m1.q;
import r3.AbstractC1740d;
/* renamed from: b1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574a implements i {

    /* renamed from: a  reason: collision with root package name */
    public final C0434k f8087a;

    /* renamed from: b  reason: collision with root package name */
    public final p f8088b = new p();

    /* renamed from: c  reason: collision with root package name */
    public final int f8089c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8090d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8091e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public long f8092g;

    /* renamed from: h  reason: collision with root package name */
    public G f8093h;

    /* renamed from: i  reason: collision with root package name */
    public long f8094i;

    public C0574a(C0434k c0434k) {
        this.f8087a = c0434k;
        this.f8089c = c0434k.f6841b;
        String str = (String) c0434k.f6843d.get("mode");
        str.getClass();
        if (AbstractC1740d.m(str, "AAC-hbr")) {
            this.f8090d = 13;
            this.f8091e = 3;
        } else if (AbstractC1740d.m(str, "AAC-lbr")) {
            this.f8090d = 6;
            this.f8091e = 2;
        } else {
            throw new UnsupportedOperationException("AAC mode not supported");
        }
        this.f = this.f8091e + this.f8090d;
    }

    @Override // b1.i
    public final void a(long j, long j8) {
        this.f8092g = j;
        this.f8094i = j8;
    }

    @Override // b1.i
    public final void b(long j) {
        this.f8092g = j;
    }

    @Override // b1.i
    public final void c(q qVar, int i7) {
        G s7 = qVar.s(i7, 1);
        this.f8093h = s7;
        s7.c(this.f8087a.f6842c);
    }

    @Override // b1.i
    public final void d(K0.q qVar, long j, int i7, boolean z7) {
        this.f8093h.getClass();
        short r7 = qVar.r();
        int i8 = r7 / this.f;
        long p02 = f7.a.p0(this.f8094i, j, this.f8092g, this.f8089c);
        p pVar = this.f8088b;
        pVar.o(qVar);
        int i9 = this.f8091e;
        int i10 = this.f8090d;
        if (i8 == 1) {
            int i11 = pVar.i(i10);
            pVar.t(i9);
            this.f8093h.d(qVar.a(), qVar);
            if (z7) {
                this.f8093h.e(p02, 1, i11, 0, null);
                return;
            }
            return;
        }
        qVar.H((r7 + 7) / 8);
        long j8 = p02;
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = pVar.i(i10);
            pVar.t(i9);
            this.f8093h.d(i13, qVar);
            this.f8093h.e(j8, 1, i13, 0, null);
            j8 += x.U(i8, 1000000L, this.f8089c, RoundingMode.FLOOR);
        }
    }
}
