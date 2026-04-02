package b1;

import D.AbstractC0059i;
import H0.C0137q;
import K0.x;
import a1.C0432i;
import a1.C0434k;
import java.util.ArrayList;
import java.util.Locale;
import m1.AbstractC1428b;
import m1.G;
import m1.q;
/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a  reason: collision with root package name */
    public final C0434k f8141a;

    /* renamed from: b  reason: collision with root package name */
    public G f8142b;

    /* renamed from: d  reason: collision with root package name */
    public long f8144d;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8146g;

    /* renamed from: c  reason: collision with root package name */
    public long f8143c = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f8145e = -1;

    public h(C0434k c0434k) {
        this.f8141a = c0434k;
    }

    @Override // b1.i
    public final void a(long j, long j8) {
        this.f8143c = j;
        this.f8144d = j8;
    }

    @Override // b1.i
    public final void b(long j) {
        this.f8143c = j;
    }

    @Override // b1.i
    public final void c(q qVar, int i7) {
        G s7 = qVar.s(i7, 1);
        this.f8142b = s7;
        s7.c(this.f8141a.f6842c);
    }

    @Override // b1.i
    public final void d(K0.q qVar, long j, int i7, boolean z7) {
        boolean z8;
        K0.a.k(this.f8142b);
        boolean z9 = false;
        if (!this.f) {
            int i8 = qVar.f2514b;
            if (qVar.f2515c > 18) {
                z8 = true;
            } else {
                z8 = false;
            }
            K0.a.d("ID Header has insufficient data", z8);
            K0.a.d("ID Header missing", qVar.s(8, z3.h.f16886c).equals("OpusHead"));
            if (qVar.u() == 1) {
                z9 = true;
            }
            K0.a.d("version number must always be 1", z9);
            qVar.G(i8);
            ArrayList c8 = AbstractC1428b.c(qVar.f2513a);
            C0137q a7 = this.f8141a.f6842c.a();
            a7.f1853o = c8;
            AbstractC0059i.H(a7, this.f8142b);
            this.f = true;
        } else if (!this.f8146g) {
            if (qVar.f2515c >= 8) {
                z9 = true;
            }
            K0.a.d("Comment Header has insufficient data", z9);
            K0.a.d("Comment Header should follow ID Header", qVar.s(8, z3.h.f16886c).equals("OpusTags"));
            this.f8146g = true;
        } else {
            int a8 = C0432i.a(this.f8145e);
            if (i7 != a8) {
                int i9 = x.f2529a;
                Locale locale = Locale.US;
                K0.a.A("RtpOpusReader", AbstractC0059i.y("Received RTP packet with unexpected sequence number. Expected: ", a8, "; received: ", i7, "."));
            }
            int a9 = qVar.a();
            this.f8142b.d(a9, qVar);
            this.f8142b.e(f7.a.p0(this.f8144d, j, this.f8143c, 48000), 1, a9, 0, null);
        }
        this.f8145e = i7;
    }
}
