package b1;

import D.AbstractC0059i;
import K0.x;
import a1.C0432i;
import a1.C0434k;
import java.util.Locale;
import m1.G;
import m1.q;
/* renamed from: b1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0576c implements i {

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f8101h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f8102i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: a  reason: collision with root package name */
    public final C0434k f8103a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8104b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8105c;

    /* renamed from: d  reason: collision with root package name */
    public G f8106d;

    /* renamed from: e  reason: collision with root package name */
    public long f8107e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public int f8108g;

    public C0576c(C0434k c0434k) {
        this.f8103a = c0434k;
        String str = c0434k.f6842c.f1886m;
        str.getClass();
        this.f8104b = "audio/amr-wb".equals(str);
        this.f8105c = c0434k.f6841b;
        this.f8107e = -9223372036854775807L;
        this.f8108g = -1;
        this.f = 0L;
    }

    @Override // b1.i
    public final void a(long j, long j8) {
        this.f8107e = j;
        this.f = j8;
    }

    @Override // b1.i
    public final void b(long j) {
        this.f8107e = j;
    }

    @Override // b1.i
    public final void c(q qVar, int i7) {
        G s7 = qVar.s(i7, 1);
        this.f8106d = s7;
        s7.c(this.f8103a.f6842c);
    }

    @Override // b1.i
    public final void d(K0.q qVar, long j, int i7, boolean z7) {
        boolean z8;
        String str;
        int i8;
        int a7;
        K0.a.k(this.f8106d);
        int i9 = this.f8108g;
        if (i9 != -1 && i7 != (a7 = C0432i.a(i9))) {
            int i10 = x.f2529a;
            Locale locale = Locale.US;
            K0.a.A("RtpAmrReader", AbstractC0059i.y("Received RTP packet with unexpected sequence number. Expected: ", a7, "; received: ", i7, "."));
        }
        boolean z9 = true;
        qVar.H(1);
        int e7 = (qVar.e() >> 3) & 15;
        if ((e7 >= 0 && e7 <= 8) || e7 == 15) {
            z8 = true;
        } else {
            z8 = false;
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        boolean z10 = this.f8104b;
        if (z10) {
            str = "WB";
        } else {
            str = "NB";
        }
        sb.append(str);
        sb.append(" frame type ");
        sb.append(e7);
        K0.a.d(sb.toString(), z8);
        if (z10) {
            i8 = f8102i[e7];
        } else {
            i8 = f8101h[e7];
        }
        int a8 = qVar.a();
        if (a8 != i8) {
            z9 = false;
        }
        K0.a.d("compound payload not supported currently", z9);
        this.f8106d.d(a8, qVar);
        this.f8106d.e(f7.a.p0(this.f, j, this.f8107e, this.f8105c), 1, a8, 0, null);
        this.f8108g = i7;
    }
}
