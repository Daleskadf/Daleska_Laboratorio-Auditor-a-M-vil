package S1;

import H0.C0137q;
import Y1.C0406g;
import com.google.android.libraries.barhopper.RecognitionOptions;
import m1.AbstractC1428b;
import m1.C1429c;
/* renamed from: S1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334b implements InterfaceC0341i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4965a;

    /* renamed from: b  reason: collision with root package name */
    public final K0.p f4966b;

    /* renamed from: c  reason: collision with root package name */
    public final K0.q f4967c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4968d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4969e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public m1.G f4970g;

    /* renamed from: h  reason: collision with root package name */
    public int f4971h;

    /* renamed from: i  reason: collision with root package name */
    public int f4972i;
    public boolean j;

    /* renamed from: k  reason: collision with root package name */
    public long f4973k;

    /* renamed from: l  reason: collision with root package name */
    public H0.r f4974l;

    /* renamed from: m  reason: collision with root package name */
    public int f4975m;

    /* renamed from: n  reason: collision with root package name */
    public long f4976n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0334b() {
        this(null, 0, 0);
        this.f4965a = 0;
    }

    @Override // S1.InterfaceC0341i
    public final void a() {
        switch (this.f4965a) {
            case 0:
                this.f4971h = 0;
                this.f4972i = 0;
                this.j = false;
                this.f4976n = -9223372036854775807L;
                return;
            default:
                this.f4971h = 0;
                this.f4972i = 0;
                this.j = false;
                this.f4976n = -9223372036854775807L;
                return;
        }
    }

    @Override // S1.InterfaceC0341i
    public final void b(K0.q qVar) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        switch (this.f4965a) {
            case 0:
                K0.a.k(this.f4970g);
                while (qVar.a() > 0) {
                    int i7 = this.f4971h;
                    K0.q qVar2 = this.f4967c;
                    boolean z12 = true;
                    if (i7 == 0) {
                        while (true) {
                            if (qVar.a() <= 0) {
                                break;
                            } else if (!this.j) {
                                if (qVar.u() == 11) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                this.j = z7;
                            } else {
                                int u7 = qVar.u();
                                if (u7 == 119) {
                                    this.j = false;
                                    this.f4971h = 1;
                                    byte[] bArr = qVar2.f2513a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f4972i = 2;
                                } else {
                                    if (u7 == 11) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    this.j = z8;
                                }
                            }
                        }
                    } else if (i7 != 1) {
                        if (i7 == 2) {
                            int min = Math.min(qVar.a(), this.f4975m - this.f4972i);
                            this.f4970g.d(min, qVar);
                            int i8 = this.f4972i + min;
                            this.f4972i = i8;
                            if (i8 == this.f4975m) {
                                if (this.f4976n == -9223372036854775807L) {
                                    z12 = false;
                                }
                                K0.a.j(z12);
                                this.f4970g.e(this.f4976n, 1, this.f4975m, 0, null);
                                this.f4976n += this.f4973k;
                                this.f4971h = 0;
                            }
                        }
                    } else {
                        byte[] bArr2 = qVar2.f2513a;
                        int min2 = Math.min(qVar.a(), 128 - this.f4972i);
                        qVar.f(bArr2, this.f4972i, min2);
                        int i9 = this.f4972i + min2;
                        this.f4972i = i9;
                        if (i9 == 128) {
                            K0.p pVar = this.f4966b;
                            pVar.q(0);
                            C1429c o7 = AbstractC1428b.o(pVar);
                            H0.r rVar = this.f4974l;
                            int i10 = o7.f13929b;
                            int i11 = o7.f13930c;
                            String str = o7.f13928a;
                            if (rVar == null || i11 != rVar.f1865A || i10 != rVar.f1866B || !K0.x.a(str, rVar.f1886m)) {
                                C0137q c0137q = new C0137q();
                                c0137q.f1841a = this.f;
                                c0137q.f1850l = H0.I.l(str);
                                c0137q.f1864z = i11;
                                c0137q.f1832A = i10;
                                c0137q.f1844d = this.f4968d;
                                c0137q.f = this.f4969e;
                                int i12 = o7.f;
                                c0137q.f1847h = i12;
                                if ("audio/ac3".equals(str)) {
                                    c0137q.f1846g = i12;
                                }
                                H0.r rVar2 = new H0.r(c0137q);
                                this.f4974l = rVar2;
                                this.f4970g.c(rVar2);
                            }
                            this.f4975m = o7.f13931d;
                            this.f4973k = (o7.f13932e * 1000000) / this.f4974l.f1866B;
                            qVar2.G(0);
                            this.f4970g.d(RecognitionOptions.ITF, qVar2);
                            this.f4971h = 2;
                        }
                    }
                }
                return;
            default:
                K0.a.k(this.f4970g);
                while (qVar.a() > 0) {
                    int i13 = this.f4971h;
                    K0.q qVar3 = this.f4967c;
                    boolean z13 = true;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                int min3 = Math.min(qVar.a(), this.f4975m - this.f4972i);
                                this.f4970g.d(min3, qVar);
                                int i14 = this.f4972i + min3;
                                this.f4972i = i14;
                                if (i14 == this.f4975m) {
                                    if (this.f4976n == -9223372036854775807L) {
                                        z13 = false;
                                    }
                                    K0.a.j(z13);
                                    this.f4970g.e(this.f4976n, 1, this.f4975m, 0, null);
                                    this.f4976n += this.f4973k;
                                    this.f4971h = 0;
                                }
                            }
                        } else {
                            byte[] bArr3 = qVar3.f2513a;
                            int min4 = Math.min(qVar.a(), 16 - this.f4972i);
                            qVar.f(bArr3, this.f4972i, min4);
                            int i15 = this.f4972i + min4;
                            this.f4972i = i15;
                            if (i15 == 16) {
                                K0.p pVar2 = this.f4966b;
                                pVar2.q(0);
                                C0406g p7 = AbstractC1428b.p(pVar2);
                                H0.r rVar3 = this.f4974l;
                                int i16 = p7.f6659a;
                                if (rVar3 == null || 2 != rVar3.f1865A || i16 != rVar3.f1866B || !"audio/ac4".equals(rVar3.f1886m)) {
                                    C0137q c0137q2 = new C0137q();
                                    c0137q2.f1841a = this.f;
                                    c0137q2.f1850l = H0.I.l("audio/ac4");
                                    c0137q2.f1864z = 2;
                                    c0137q2.f1832A = i16;
                                    c0137q2.f1844d = this.f4968d;
                                    c0137q2.f = this.f4969e;
                                    H0.r rVar4 = new H0.r(c0137q2);
                                    this.f4974l = rVar4;
                                    this.f4970g.c(rVar4);
                                }
                                this.f4975m = p7.f6660b;
                                this.f4973k = (p7.f6661c * 1000000) / this.f4974l.f1866B;
                                qVar3.G(0);
                                this.f4970g.d(16, qVar3);
                                this.f4971h = 2;
                            }
                        }
                    } else {
                        while (qVar.a() > 0) {
                            if (!this.j) {
                                if (qVar.u() == 172) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                this.j = z9;
                            } else {
                                int u8 = qVar.u();
                                if (u8 == 172) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.j = z10;
                                int i17 = 65;
                                if (u8 == 64 || u8 == 65) {
                                    if (u8 == 65) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    this.f4971h = 1;
                                    byte[] bArr4 = qVar3.f2513a;
                                    bArr4[0] = -84;
                                    if (!z11) {
                                        i17 = 64;
                                    }
                                    bArr4[1] = (byte) i17;
                                    this.f4972i = 2;
                                }
                            }
                        }
                    }
                }
                return;
        }
    }

    @Override // S1.InterfaceC0341i
    public final void c(boolean z7) {
        int i7 = this.f4965a;
    }

    @Override // S1.InterfaceC0341i
    public final void d(int i7, long j) {
        switch (this.f4965a) {
            case 0:
                this.f4976n = j;
                return;
            default:
                this.f4976n = j;
                return;
        }
    }

    @Override // S1.InterfaceC0341i
    public final void e(m1.q qVar, H h8) {
        switch (this.f4965a) {
            case 0:
                h8.a();
                h8.d();
                this.f = (String) h8.f4961e;
                h8.d();
                this.f4970g = qVar.s(h8.f4959c, 1);
                return;
            default:
                h8.a();
                h8.d();
                this.f = (String) h8.f4961e;
                h8.d();
                this.f4970g = qVar.s(h8.f4959c, 1);
                return;
        }
    }

    public C0334b(String str, int i7, int i8) {
        this.f4965a = i8;
        switch (i8) {
            case 1:
                K0.p pVar = new K0.p(new byte[16], 16);
                this.f4966b = pVar;
                this.f4967c = new K0.q(pVar.f2509d);
                this.f4971h = 0;
                this.f4972i = 0;
                this.j = false;
                this.f4976n = -9223372036854775807L;
                this.f4968d = str;
                this.f4969e = i7;
                return;
            default:
                K0.p pVar2 = new K0.p(new byte[RecognitionOptions.ITF], (int) RecognitionOptions.ITF);
                this.f4966b = pVar2;
                this.f4967c = new K0.q(pVar2.f2509d);
                this.f4971h = 0;
                this.f4976n = -9223372036854775807L;
                this.f4968d = str;
                this.f4969e = i7;
                return;
        }
    }

    private final void f(boolean z7) {
    }

    private final void g(boolean z7) {
    }
}
