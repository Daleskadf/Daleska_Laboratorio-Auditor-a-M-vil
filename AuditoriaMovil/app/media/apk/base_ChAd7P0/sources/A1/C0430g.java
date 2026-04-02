package a1;

import A3.K;
import A3.e0;
import H0.C0140u;
import H4.e1;
import android.os.SystemClock;
import b1.C0574a;
import b1.C0575b;
import b1.C0576c;
import b1.C0577d;
import java.util.List;
/* renamed from: a1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0430g implements m1.o {

    /* renamed from: a  reason: collision with root package name */
    public final b1.i f6816a;

    /* renamed from: b  reason: collision with root package name */
    public final K0.q f6817b;

    /* renamed from: c  reason: collision with root package name */
    public final K0.q f6818c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6819d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f6820e;
    public final I.k f;

    /* renamed from: g  reason: collision with root package name */
    public m1.q f6821g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6822h;

    /* renamed from: i  reason: collision with root package name */
    public volatile long f6823i;
    public volatile int j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6824k;

    /* renamed from: l  reason: collision with root package name */
    public long f6825l;

    /* renamed from: m  reason: collision with root package name */
    public long f6826m;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C0430g(C0434k c0434k, int i7) {
        char c8;
        b1.i c0577d;
        b1.i iVar;
        this.f6819d = i7;
        String str = c0434k.f6842c.f1886m;
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c8 = 7;
                    break;
                }
                c8 = 65535;
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
                    c8 = '\b';
                    break;
                }
                c8 = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c8 = '\t';
                    break;
                }
                c8 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c8 = '\n';
                    break;
                }
                c8 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c8 = 11;
                    break;
                }
                c8 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c8 = '\f';
                    break;
                }
                c8 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c8 = '\r';
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        switch (c8) {
            case 0:
                c0577d = new C0577d(c0434k, 0);
                iVar = c0577d;
                break;
            case 1:
                c0577d = new b1.e(c0434k, 1);
                iVar = c0577d;
                break;
            case 2:
            case '\b':
                c0577d = new C0576c(c0434k);
                iVar = c0577d;
                break;
            case 3:
                if (c0434k.f6844e.equals("MP4A-LATM")) {
                    c0577d = new b1.f(c0434k);
                } else {
                    c0577d = new C0574a(c0434k);
                }
                iVar = c0577d;
                break;
            case 4:
                c0577d = new C0575b(c0434k);
                iVar = c0577d;
                break;
            case 5:
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case '\r':
                c0577d = new b1.j(c0434k);
                iVar = c0577d;
                break;
            case 6:
                c0577d = new b1.g(c0434k);
                iVar = c0577d;
                break;
            case 7:
                c0577d = new b1.e(c0434k, 0);
                iVar = c0577d;
                break;
            case '\t':
                c0577d = new b1.h(c0434k);
                iVar = c0577d;
                break;
            case '\n':
                c0577d = new b1.k(c0434k);
                iVar = c0577d;
                break;
            case 11:
                c0577d = new C0577d(c0434k, 1);
                iVar = c0577d;
                break;
            default:
                iVar = null;
                break;
        }
        iVar.getClass();
        this.f6816a = iVar;
        this.f6817b = new K0.q(65507);
        this.f6818c = new K0.q();
        this.f6820e = new Object();
        this.f = new I.k();
        this.f6823i = -9223372036854775807L;
        this.j = -1;
        this.f6825l = -9223372036854775807L;
        this.f6826m = -9223372036854775807L;
    }

    @Override // m1.o
    public final void a(long j, long j8) {
        synchronized (this.f6820e) {
            try {
                if (!this.f6824k) {
                    this.f6824k = true;
                }
                this.f6825l = j;
                this.f6826m = j8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m1.o
    public final m1.o c() {
        return this;
    }

    @Override // m1.o
    public final boolean e(m1.p pVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    @Override // m1.o
    public final List f() {
        A3.I i7 = K.f98b;
        return e0.f138e;
    }

    @Override // m1.o
    public final void g(m1.q qVar) {
        this.f6816a.c(qVar, this.f6819d);
        qVar.h();
        qVar.x(new m1.s(-9223372036854775807L));
        this.f6821g = qVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [a1.h, java.lang.Object] */
    @Override // m1.o
    public final int i(m1.p pVar, C0140u c0140u) {
        boolean z7;
        boolean z8;
        this.f6821g.getClass();
        int read = pVar.read(this.f6817b.f2513a, 0, 65507);
        if (read == -1) {
            return -1;
        }
        if (read == 0) {
            return 0;
        }
        this.f6817b.G(0);
        this.f6817b.F(read);
        K0.q qVar = this.f6817b;
        C0432i c0432i = null;
        if (qVar.a() >= 12) {
            int u7 = qVar.u();
            byte b5 = (byte) (u7 >> 6);
            byte b7 = (byte) (u7 & 15);
            if (b5 == 2) {
                int u8 = qVar.u();
                if (((u8 >> 7) & 1) == 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                byte b8 = (byte) (u8 & 127);
                int A7 = qVar.A();
                long w2 = qVar.w();
                int h8 = qVar.h();
                byte[] bArr = C0432i.f6832g;
                if (b7 > 0) {
                    byte[] bArr2 = new byte[b7 * 4];
                    for (int i7 = 0; i7 < b7; i7++) {
                        qVar.f(bArr2, i7 * 4, 4);
                    }
                }
                byte[] bArr3 = new byte[qVar.a()];
                qVar.f(bArr3, 0, qVar.a());
                ?? obj = new Object();
                obj.f = bArr;
                obj.f6827a = z7;
                obj.f6828b = b8;
                if (A7 >= 0 && A7 <= 65535) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                K0.a.e(z8);
                obj.f6829c = 65535 & A7;
                obj.f6830d = w2;
                obj.f6831e = h8;
                obj.f = bArr3;
                c0432i = new C0432i(obj);
            }
        }
        if (c0432i == null) {
            return 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - 30;
        this.f.d(c0432i, elapsedRealtime);
        C0432i e7 = this.f.e(j);
        if (e7 == null) {
            return 0;
        }
        if (!this.f6822h) {
            if (this.f6823i == -9223372036854775807L) {
                this.f6823i = e7.f6836d;
            }
            if (this.j == -1) {
                this.j = e7.f6835c;
            }
            this.f6816a.b(this.f6823i);
            this.f6822h = true;
        }
        synchronized (this.f6820e) {
            try {
                if (this.f6824k) {
                    if (this.f6825l != -9223372036854775807L && this.f6826m != -9223372036854775807L) {
                        this.f.f();
                        this.f6816a.a(this.f6825l, this.f6826m);
                        this.f6824k = false;
                        this.f6825l = -9223372036854775807L;
                        this.f6826m = -9223372036854775807L;
                    }
                } else {
                    do {
                        K0.q qVar2 = this.f6818c;
                        byte[] bArr4 = e7.f;
                        qVar2.getClass();
                        qVar2.E(bArr4, bArr4.length);
                        this.f6816a.d(this.f6818c, e7.f6836d, e7.f6835c, e7.f6833a);
                        e7 = this.f.e(j);
                    } while (e7 != null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // m1.o
    public final void release() {
    }
}
