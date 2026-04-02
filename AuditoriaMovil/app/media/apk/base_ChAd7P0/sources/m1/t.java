package m1;

import H0.C0137q;
import H0.I;
import a6.t0;
import java.util.Collections;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final int f13987a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13988b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13989c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13990d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13991e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13992g;

    /* renamed from: h  reason: collision with root package name */
    public final int f13993h;

    /* renamed from: i  reason: collision with root package name */
    public final int f13994i;
    public final long j;

    /* renamed from: k  reason: collision with root package name */
    public final t0 f13995k;

    /* renamed from: l  reason: collision with root package name */
    public final H0.H f13996l;

    public t(byte[] bArr, int i7) {
        K0.p pVar = new K0.p(bArr, bArr.length);
        pVar.q(i7 * 8);
        this.f13987a = pVar.i(16);
        this.f13988b = pVar.i(16);
        this.f13989c = pVar.i(24);
        this.f13990d = pVar.i(24);
        int i8 = pVar.i(20);
        this.f13991e = i8;
        this.f = d(i8);
        this.f13992g = pVar.i(3) + 1;
        int i9 = pVar.i(5) + 1;
        this.f13993h = i9;
        this.f13994i = a(i9);
        this.j = pVar.k(36);
        this.f13995k = null;
        this.f13996l = null;
    }

    public static int a(int i7) {
        if (i7 != 8) {
            if (i7 != 12) {
                if (i7 != 16) {
                    if (i7 != 20) {
                        if (i7 != 24) {
                            return -1;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int d(int i7) {
        switch (i7) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f13991e;
    }

    public final H0.r c(byte[] bArr, H0.H h8) {
        bArr[4] = Byte.MIN_VALUE;
        int i7 = this.f13990d;
        if (i7 <= 0) {
            i7 = -1;
        }
        H0.H h9 = this.f13996l;
        if (h9 != null) {
            h8 = h9.d(h8);
        }
        C0137q c0137q = new C0137q();
        c0137q.f1850l = I.l("audio/flac");
        c0137q.f1851m = i7;
        c0137q.f1864z = this.f13992g;
        c0137q.f1832A = this.f13991e;
        c0137q.f1833B = K0.x.A(this.f13993h);
        c0137q.f1853o = Collections.singletonList(bArr);
        c0137q.j = h8;
        return new H0.r(c0137q);
    }

    public t(int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j, t0 t0Var, H0.H h8) {
        this.f13987a = i7;
        this.f13988b = i8;
        this.f13989c = i9;
        this.f13990d = i10;
        this.f13991e = i11;
        this.f = d(i11);
        this.f13992g = i12;
        this.f13993h = i13;
        this.f13994i = a(i13);
        this.j = j;
        this.f13995k = t0Var;
        this.f13996l = h8;
    }
}
