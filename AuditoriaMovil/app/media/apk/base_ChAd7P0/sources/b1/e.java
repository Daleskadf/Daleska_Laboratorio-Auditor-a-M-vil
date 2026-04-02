package b1;

import D.AbstractC0059i;
import H0.J;
import K0.x;
import a1.C0432i;
import a1.C0434k;
import java.util.Locale;
import java.util.TreeMap;
import m1.G;
import m1.q;
/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8120a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8121b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8122c;

    /* renamed from: d  reason: collision with root package name */
    public Object f8123d;

    /* renamed from: e  reason: collision with root package name */
    public Object f8124e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public long f8125g;

    /* renamed from: h  reason: collision with root package name */
    public int f8126h;

    /* renamed from: i  reason: collision with root package name */
    public int f8127i;
    public long j;

    public e(String str, String str2, long j, int i7, int i8, int i9, int[] iArr, TreeMap treeMap) {
        this.f8120a = 2;
        this.f8121b = str;
        this.f8122c = str2;
        this.f8125g = j;
        this.j = 0L;
        this.f = i7;
        this.f8126h = i8;
        this.f8127i = i9;
        this.f8123d = iArr;
        this.f8124e = treeMap;
    }

    @Override // b1.i
    public void a(long j, long j8) {
        switch (this.f8120a) {
            case 0:
                this.f8125g = j;
                this.f8127i = 0;
                this.j = j8;
                return;
            default:
                this.f8125g = j;
                this.f8127i = 0;
                this.j = j8;
                return;
        }
    }

    @Override // b1.i
    public void b(long j) {
        int i7 = this.f8120a;
    }

    @Override // b1.i
    public void c(q qVar, int i7) {
        switch (this.f8120a) {
            case 0:
                G s7 = qVar.s(i7, 2);
                this.f8124e = s7;
                int i8 = x.f2529a;
                s7.c(((C0434k) this.f8123d).f6842c);
                return;
            default:
                G s8 = qVar.s(i7, 2);
                this.f8124e = s8;
                s8.c(((C0434k) this.f8123d).f6842c);
                return;
        }
    }

    @Override // b1.i
    public void d(K0.q qVar, long j, int i7, boolean z7) {
        boolean z8;
        boolean z9;
        int i8;
        int i9;
        boolean z10;
        boolean z11;
        int i10;
        Object obj = this.f8121b;
        int i11 = 1;
        switch (this.f8120a) {
            case 0:
                try {
                    int i12 = qVar.f2513a[0] & 31;
                    K0.a.k((G) this.f8124e);
                    if (i12 > 0 && i12 < 24) {
                        int a7 = qVar.a();
                        this.f8127i = g() + this.f8127i;
                        ((G) this.f8124e).d(a7, qVar);
                        this.f8127i += a7;
                        if ((qVar.f2513a[0] & 31) == 5) {
                            i9 = 1;
                        } else {
                            i9 = 0;
                        }
                        this.f = i9;
                    } else if (i12 == 24) {
                        qVar.u();
                        while (qVar.a() > 4) {
                            int A7 = qVar.A();
                            this.f8127i = g() + this.f8127i;
                            ((G) this.f8124e).d(A7, qVar);
                            this.f8127i += A7;
                        }
                        this.f = 0;
                    } else if (i12 == 28) {
                        byte[] bArr = qVar.f2513a;
                        byte b5 = bArr[0];
                        byte b7 = bArr[1];
                        int i13 = (b5 & 224) | (b7 & 31);
                        if ((b7 & 128) > 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if ((b7 & 64) > 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        K0.q qVar2 = (K0.q) obj;
                        if (z8) {
                            this.f8127i = g() + this.f8127i;
                            byte[] bArr2 = qVar.f2513a;
                            bArr2[1] = (byte) i13;
                            qVar2.getClass();
                            qVar2.E(bArr2, bArr2.length);
                            qVar2.G(1);
                        } else {
                            int a8 = C0432i.a(this.f8126h);
                            if (i7 != a8) {
                                int i14 = x.f2529a;
                                Locale locale = Locale.US;
                                K0.a.A("RtpH264Reader", AbstractC0059i.y("Received RTP packet with unexpected sequence number. Expected: ", a8, "; received: ", i7, ". Dropping packet."));
                            } else {
                                byte[] bArr3 = qVar.f2513a;
                                qVar2.getClass();
                                qVar2.E(bArr3, bArr3.length);
                                qVar2.G(2);
                            }
                        }
                        int a9 = qVar2.a();
                        ((G) this.f8124e).d(a9, qVar2);
                        this.f8127i += a9;
                        if (z9) {
                            if ((i13 & 31) == 5) {
                                i8 = 1;
                            } else {
                                i8 = 0;
                            }
                            this.f = i8;
                        }
                    } else {
                        throw J.b(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i12)), null);
                    }
                    if (z7) {
                        if (this.f8125g == -9223372036854775807L) {
                            this.f8125g = j;
                        }
                        ((G) this.f8124e).e(f7.a.p0(this.j, j, this.f8125g, 90000), this.f, this.f8127i, 0, null);
                        this.f8127i = 0;
                    }
                    this.f8126h = i7;
                    return;
                } catch (IndexOutOfBoundsException e7) {
                    throw J.b(null, e7);
                }
            default:
                byte[] bArr4 = qVar.f2513a;
                if (bArr4.length != 0) {
                    int i15 = (bArr4[0] >> 1) & 63;
                    K0.a.k((G) this.f8124e);
                    K0.q qVar3 = (K0.q) this.f8122c;
                    if (i15 >= 0 && i15 < 48) {
                        int a10 = qVar.a();
                        int i16 = this.f8127i;
                        qVar3.G(0);
                        int a11 = qVar3.a();
                        G g3 = (G) this.f8124e;
                        g3.getClass();
                        g3.d(a11, qVar3);
                        this.f8127i = a11 + i16;
                        ((G) this.f8124e).d(a10, qVar);
                        this.f8127i += a10;
                        int i17 = (qVar.f2513a[0] >> 1) & 63;
                        if (i17 != 19 && i17 != 20) {
                            i11 = 0;
                        }
                        this.f = i11;
                    } else if (i15 != 48) {
                        if (i15 == 49) {
                            byte[] bArr5 = qVar.f2513a;
                            if (bArr5.length >= 3) {
                                int i18 = bArr5[1] & 7;
                                byte b8 = bArr5[2];
                                int i19 = b8 & 63;
                                if ((b8 & 128) > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if ((b8 & 64) > 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                K0.q qVar4 = (K0.q) obj;
                                if (z10) {
                                    int i20 = this.f8127i;
                                    qVar3.G(0);
                                    int a12 = qVar3.a();
                                    G g4 = (G) this.f8124e;
                                    g4.getClass();
                                    g4.d(a12, qVar3);
                                    this.f8127i = a12 + i20;
                                    byte[] bArr6 = qVar.f2513a;
                                    bArr6[1] = (byte) ((i19 << 1) & 127);
                                    bArr6[2] = (byte) i18;
                                    qVar4.getClass();
                                    qVar4.E(bArr6, bArr6.length);
                                    qVar4.G(1);
                                } else {
                                    int i21 = (this.f8126h + 1) % 65535;
                                    if (i7 != i21) {
                                        int i22 = x.f2529a;
                                        Locale locale2 = Locale.US;
                                        K0.a.A("RtpH265Reader", AbstractC0059i.y("Received RTP packet with unexpected sequence number. Expected: ", i21, "; received: ", i7, ". Dropping packet."));
                                    } else {
                                        qVar4.getClass();
                                        qVar4.E(bArr5, bArr5.length);
                                        qVar4.G(3);
                                    }
                                }
                                int a13 = qVar4.a();
                                ((G) this.f8124e).d(a13, qVar4);
                                this.f8127i += a13;
                                if (z11) {
                                    if (i19 != 19 && i19 != 20) {
                                        i10 = 0;
                                    } else {
                                        i10 = 1;
                                    }
                                    this.f = i10;
                                }
                            } else {
                                throw J.b("Malformed FU header.", null);
                            }
                        } else {
                            throw J.b(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i15)), null);
                        }
                    } else {
                        throw new UnsupportedOperationException("need to implement processAggregationPacket");
                    }
                    if (z7) {
                        if (this.f8125g == -9223372036854775807L) {
                            this.f8125g = j;
                        }
                        ((G) this.f8124e).e(f7.a.p0(this.j, j, this.f8125g, 90000), this.f, this.f8127i, 0, null);
                        this.f8127i = 0;
                    }
                    this.f8126h = i7;
                    return;
                }
                throw J.b("Empty RTP data packet.", null);
        }
    }

    public int g() {
        K0.q qVar = (K0.q) this.f8122c;
        qVar.G(0);
        int a7 = qVar.a();
        G g3 = (G) this.f8124e;
        g3.getClass();
        g3.d(a7, qVar);
        return a7;
    }

    public e(C0434k c0434k, int i7) {
        this.f8120a = i7;
        switch (i7) {
            case 1:
                this.f8121b = new K0.q();
                this.f8122c = new K0.q(L0.g.f2861a);
                this.f8123d = c0434k;
                this.f8125g = -9223372036854775807L;
                this.f8126h = -1;
                return;
            default:
                this.f8122c = new K0.q(L0.g.f2861a);
                this.f8123d = c0434k;
                this.f8121b = new K0.q();
                this.f8125g = -9223372036854775807L;
                this.f8126h = -1;
                return;
        }
    }

    private final void e(long j) {
    }

    private final void f(long j) {
    }
}
