package b1;

import D.AbstractC0059i;
import K0.x;
import a1.C0432i;
import a1.C0434k;
import android.util.Log;
import java.util.Locale;
import m1.G;
import m1.q;
/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    public final C0434k f8147a;

    /* renamed from: b  reason: collision with root package name */
    public G f8148b;

    /* renamed from: c  reason: collision with root package name */
    public long f8149c = -9223372036854775807L;

    /* renamed from: d  reason: collision with root package name */
    public long f8150d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f8151e = -1;

    public j(C0434k c0434k) {
        this.f8147a = c0434k;
    }

    @Override // b1.i
    public final void a(long j, long j8) {
        this.f8149c = j;
        this.f8150d = j8;
    }

    @Override // b1.i
    public final void b(long j) {
        this.f8149c = j;
    }

    @Override // b1.i
    public final void c(q qVar, int i7) {
        G s7 = qVar.s(i7, 1);
        this.f8148b = s7;
        s7.c(this.f8147a.f6842c);
    }

    @Override // b1.i
    public final void d(K0.q qVar, long j, int i7, boolean z7) {
        int a7;
        this.f8148b.getClass();
        int i8 = this.f8151e;
        if (i8 != -1 && i7 != (a7 = C0432i.a(i8))) {
            int i9 = x.f2529a;
            Locale locale = Locale.US;
            Log.w("RtpPcmReader", AbstractC0059i.y("Received RTP packet with unexpected sequence number. Expected: ", a7, "; received: ", i7, "."));
        }
        long p02 = f7.a.p0(this.f8150d, j, this.f8149c, this.f8147a.f6841b);
        int a8 = qVar.a();
        this.f8148b.d(a8, qVar);
        this.f8148b.e(p02, 1, a8, 0, null);
        this.f8151e = i7;
    }
}
