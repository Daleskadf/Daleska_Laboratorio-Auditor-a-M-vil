package b1;

import D.AbstractC0059i;
import H0.C0137q;
import H0.r;
import K0.x;
import a1.C0432i;
import a1.C0434k;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Locale;
import m1.G;
import m1.q;
/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a  reason: collision with root package name */
    public final C0434k f8152a;

    /* renamed from: b  reason: collision with root package name */
    public G f8153b;

    /* renamed from: c  reason: collision with root package name */
    public long f8154c = -9223372036854775807L;

    /* renamed from: d  reason: collision with root package name */
    public int f8155d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f8156e = -1;
    public long f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    public long f8157g = 0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8158h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8159i;
    public boolean j;

    public k(C0434k c0434k) {
        this.f8152a = c0434k;
    }

    @Override // b1.i
    public final void a(long j, long j8) {
        this.f8154c = j;
        this.f8156e = -1;
        this.f8157g = j8;
    }

    @Override // b1.i
    public final void b(long j) {
        boolean z7;
        if (this.f8154c == -9223372036854775807L) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        this.f8154c = j;
    }

    @Override // b1.i
    public final void c(q qVar, int i7) {
        G s7 = qVar.s(i7, 2);
        this.f8153b = s7;
        s7.c(this.f8152a.f6842c);
    }

    @Override // b1.i
    public final void d(K0.q qVar, long j, int i7, boolean z7) {
        boolean z8;
        K0.a.k(this.f8153b);
        int u7 = qVar.u();
        if ((u7 & 16) == 16 && (u7 & 7) == 0) {
            if (this.f8158h && this.f8156e > 0) {
                G g3 = this.f8153b;
                g3.getClass();
                g3.e(this.f, this.f8159i ? 1 : 0, this.f8156e, 0, null);
                this.f8156e = -1;
                this.f = -9223372036854775807L;
                this.f8158h = false;
            }
            this.f8158h = true;
        } else if (this.f8158h) {
            int a7 = C0432i.a(this.f8155d);
            if (i7 < a7) {
                int i8 = x.f2529a;
                Locale locale = Locale.US;
                K0.a.A("RtpVP8Reader", AbstractC0059i.y("Received RTP packet with unexpected sequence number. Expected: ", a7, "; received: ", i7, ". Dropping packet."));
                return;
            }
        } else {
            K0.a.A("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
            return;
        }
        if ((u7 & RecognitionOptions.ITF) != 0) {
            int u8 = qVar.u();
            if ((u8 & RecognitionOptions.ITF) != 0 && (qVar.u() & RecognitionOptions.ITF) != 0) {
                qVar.H(1);
            }
            if ((u8 & 64) != 0) {
                qVar.H(1);
            }
            if ((u8 & 32) != 0 || (16 & u8) != 0) {
                qVar.H(1);
            }
        }
        if (this.f8156e == -1 && this.f8158h) {
            if ((qVar.e() & 1) == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f8159i = z8;
        }
        if (!this.j) {
            int i9 = qVar.f2514b;
            qVar.G(i9 + 6);
            int n7 = qVar.n() & 16383;
            int n8 = qVar.n() & 16383;
            qVar.G(i9);
            r rVar = this.f8152a.f6842c;
            if (n7 != rVar.f1892s || n8 != rVar.f1893t) {
                G g4 = this.f8153b;
                C0137q a8 = rVar.a();
                a8.f1856r = n7;
                a8.f1857s = n8;
                AbstractC0059i.H(a8, g4);
            }
            this.j = true;
        }
        int a9 = qVar.a();
        this.f8153b.d(a9, qVar);
        int i10 = this.f8156e;
        if (i10 == -1) {
            this.f8156e = a9;
        } else {
            this.f8156e = i10 + a9;
        }
        this.f = f7.a.p0(this.f8157g, j, this.f8154c, 90000);
        if (z7) {
            G g8 = this.f8153b;
            g8.getClass();
            g8.e(this.f, this.f8159i ? 1 : 0, this.f8156e, 0, null);
            this.f8156e = -1;
            this.f = -9223372036854775807L;
            this.f8158h = false;
        }
        this.f8155d = i7;
    }
}
