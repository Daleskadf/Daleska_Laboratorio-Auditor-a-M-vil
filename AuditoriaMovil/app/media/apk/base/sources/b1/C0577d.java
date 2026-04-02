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
/* renamed from: b1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577d implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8109a;

    /* renamed from: b  reason: collision with root package name */
    public final C0434k f8110b;

    /* renamed from: c  reason: collision with root package name */
    public G f8111c;

    /* renamed from: d  reason: collision with root package name */
    public long f8112d;

    /* renamed from: e  reason: collision with root package name */
    public long f8113e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f8114g;

    /* renamed from: h  reason: collision with root package name */
    public long f8115h;

    /* renamed from: i  reason: collision with root package name */
    public int f8116i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8117k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8118l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f8119m;

    public C0577d(C0434k c0434k, int i7) {
        this.f8109a = i7;
        switch (i7) {
            case 1:
                this.f8110b = c0434k;
                this.f8112d = -9223372036854775807L;
                this.f8114g = -1;
                this.f8115h = -9223372036854775807L;
                this.f8113e = 0L;
                this.f = -1;
                this.f8116i = -1;
                this.j = -1;
                return;
            default:
                this.f8110b = c0434k;
                this.f8112d = -9223372036854775807L;
                this.f8114g = -1;
                return;
        }
    }

    @Override // b1.i
    public final void a(long j, long j8) {
        switch (this.f8109a) {
            case 0:
                this.f8112d = j;
                this.f = 0;
                this.f8113e = j8;
                return;
            default:
                this.f8112d = j;
                this.f8114g = -1;
                this.f8113e = j8;
                return;
        }
    }

    @Override // b1.i
    public final void b(long j) {
        boolean z7;
        boolean z8;
        switch (this.f8109a) {
            case 0:
                if (this.f8112d == -9223372036854775807L) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                K0.a.j(z7);
                this.f8112d = j;
                return;
            default:
                if (this.f8112d == -9223372036854775807L) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                K0.a.j(z8);
                this.f8112d = j;
                return;
        }
    }

    @Override // b1.i
    public final void c(q qVar, int i7) {
        switch (this.f8109a) {
            case 0:
                G s7 = qVar.s(i7, 2);
                this.f8111c = s7;
                s7.c(this.f8110b.f6842c);
                return;
            default:
                G s8 = qVar.s(i7, 2);
                this.f8111c = s8;
                s8.c(this.f8110b.f6842c);
                return;
        }
    }

    @Override // b1.i
    public final void d(K0.q qVar, long j, int i7, boolean z7) {
        Object[] objArr;
        boolean z8;
        boolean z9;
        int i8;
        int i9;
        boolean z10;
        C0434k c0434k = this.f8110b;
        switch (this.f8109a) {
            case 0:
                K0.a.k(this.f8111c);
                int i10 = qVar.f2514b;
                int A7 = qVar.A();
                if ((A7 & RecognitionOptions.UPC_E) > 0) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                if ((A7 & RecognitionOptions.UPC_A) == 0 && (A7 & 504) == 0 && (A7 & 7) == 0) {
                    if (objArr != null) {
                        if (this.f8119m && this.f > 0) {
                            G g3 = this.f8111c;
                            g3.getClass();
                            g3.e(this.f8115h, this.f8117k ? 1 : 0, this.f, 0, null);
                            this.f = 0;
                            this.f8115h = -9223372036854775807L;
                            this.f8117k = false;
                            this.f8119m = false;
                        }
                        this.f8119m = true;
                        if ((qVar.e() & 252) < 128) {
                            K0.a.A("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                            return;
                        }
                        byte[] bArr = qVar.f2513a;
                        bArr[i10] = 0;
                        bArr[i10 + 1] = 0;
                        qVar.G(i10);
                    } else if (this.f8119m) {
                        int a7 = C0432i.a(this.f8114g);
                        if (i7 < a7) {
                            int i11 = x.f2529a;
                            Locale locale = Locale.US;
                            K0.a.A("RtpH263Reader", AbstractC0059i.y("Received RTP packet with unexpected sequence number. Expected: ", a7, "; received: ", i7, ". Dropping packet."));
                            return;
                        }
                    } else {
                        K0.a.A("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                        return;
                    }
                    if (this.f == 0) {
                        boolean z11 = this.f8118l;
                        int i12 = qVar.f2514b;
                        if (((qVar.w() >> 10) & 63) == 32) {
                            int e7 = qVar.e();
                            int i13 = (e7 >> 1) & 1;
                            if (!z11 && i13 == 0) {
                                int i14 = (e7 >> 2) & 7;
                                if (i14 == 1) {
                                    this.f8116i = RecognitionOptions.ITF;
                                    this.j = 96;
                                } else {
                                    int i15 = i14 - 2;
                                    this.f8116i = 176 << i15;
                                    this.j = 144 << i15;
                                }
                            }
                            qVar.G(i12);
                            if (i13 == 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            this.f8117k = z8;
                        } else {
                            qVar.G(i12);
                            this.f8117k = false;
                        }
                        if (!this.f8118l && this.f8117k) {
                            int i16 = this.f8116i;
                            r rVar = c0434k.f6842c;
                            if (i16 != rVar.f1892s || this.j != rVar.f1893t) {
                                G g4 = this.f8111c;
                                C0137q a8 = rVar.a();
                                a8.f1856r = this.f8116i;
                                a8.f1857s = this.j;
                                AbstractC0059i.H(a8, g4);
                            }
                            this.f8118l = true;
                        }
                    }
                    int a9 = qVar.a();
                    this.f8111c.d(a9, qVar);
                    this.f += a9;
                    this.f8115h = f7.a.p0(this.f8113e, j, this.f8112d, 90000);
                    if (z7) {
                        G g8 = this.f8111c;
                        g8.getClass();
                        g8.e(this.f8115h, this.f8117k ? 1 : 0, this.f, 0, null);
                        this.f = 0;
                        this.f8115h = -9223372036854775807L;
                        this.f8117k = false;
                        this.f8119m = false;
                    }
                    this.f8114g = i7;
                    return;
                }
                K0.a.A("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
                return;
            default:
                K0.a.k(this.f8111c);
                int u7 = qVar.u();
                if ((u7 & 8) == 8) {
                    if (this.f8117k && this.f8114g > 0) {
                        G g9 = this.f8111c;
                        g9.getClass();
                        g9.e(this.f8115h, this.f8119m ? 1 : 0, this.f8114g, 0, null);
                        this.f8114g = -1;
                        this.f8115h = -9223372036854775807L;
                        this.f8117k = false;
                    }
                    this.f8117k = true;
                } else if (this.f8117k) {
                    int a10 = C0432i.a(this.f);
                    if (i7 < a10) {
                        int i17 = x.f2529a;
                        Locale locale2 = Locale.US;
                        K0.a.A("RtpVp9Reader", AbstractC0059i.y("Received RTP packet with unexpected sequence number. Expected: ", a10, "; received: ", i7, ". Dropping packet."));
                        return;
                    }
                } else {
                    K0.a.A("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                    return;
                }
                if ((u7 & RecognitionOptions.ITF) == 0 || (qVar.u() & RecognitionOptions.ITF) == 0 || qVar.a() >= 1) {
                    int i18 = u7 & 16;
                    if (i18 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    K0.a.d("VP9 flexible mode is not supported.", z9);
                    if ((u7 & 32) != 0) {
                        qVar.H(1);
                        if (qVar.a() >= 1) {
                            if (i18 == 0) {
                                qVar.H(1);
                            }
                        } else {
                            return;
                        }
                    }
                    if ((u7 & 2) != 0) {
                        int u8 = qVar.u();
                        int i19 = (u8 >> 5) & 7;
                        if ((u8 & 16) != 0) {
                            int i20 = i19 + 1;
                            if (qVar.a() >= i20 * 4) {
                                for (int i21 = 0; i21 < i20; i21++) {
                                    this.f8116i = qVar.A();
                                    this.j = qVar.A();
                                }
                            } else {
                                return;
                            }
                        }
                        if ((u8 & 8) != 0) {
                            int u9 = qVar.u();
                            if (qVar.a() >= u9) {
                                for (int i22 = 0; i22 < u9; i22++) {
                                    int A8 = (qVar.A() & 12) >> 2;
                                    if (qVar.a() >= A8) {
                                        qVar.H(A8);
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    }
                    if (this.f8114g == -1 && this.f8117k) {
                        if ((qVar.e() & 4) == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f8119m = z10;
                    }
                    if (!this.f8118l && (i8 = this.f8116i) != -1 && (i9 = this.j) != -1) {
                        r rVar2 = c0434k.f6842c;
                        if (i8 != rVar2.f1892s || i9 != rVar2.f1893t) {
                            G g10 = this.f8111c;
                            C0137q a11 = rVar2.a();
                            a11.f1856r = this.f8116i;
                            a11.f1857s = this.j;
                            AbstractC0059i.H(a11, g10);
                        }
                        this.f8118l = true;
                    }
                    int a12 = qVar.a();
                    this.f8111c.d(a12, qVar);
                    int i23 = this.f8114g;
                    if (i23 == -1) {
                        this.f8114g = a12;
                    } else {
                        this.f8114g = i23 + a12;
                    }
                    this.f8115h = f7.a.p0(this.f8113e, j, this.f8112d, 90000);
                    if (z7) {
                        G g11 = this.f8111c;
                        g11.getClass();
                        g11.e(this.f8115h, this.f8119m ? 1 : 0, this.f8114g, 0, null);
                        this.f8114g = -1;
                        this.f8115h = -9223372036854775807L;
                        this.f8117k = false;
                    }
                    this.f = i7;
                    return;
                }
                return;
        }
    }
}
