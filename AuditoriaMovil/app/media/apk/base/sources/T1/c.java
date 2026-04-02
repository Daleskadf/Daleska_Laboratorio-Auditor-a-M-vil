package T1;

import G1.i;
import H0.C0137q;
import H0.I;
import H0.J;
import H0.r;
import K0.x;
import java.math.RoundingMode;
import m1.G;
import m1.l;
import m1.q;
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final q f5305a;

    /* renamed from: b  reason: collision with root package name */
    public final G f5306b;

    /* renamed from: c  reason: collision with root package name */
    public final i f5307c;

    /* renamed from: d  reason: collision with root package name */
    public final r f5308d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5309e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public int f5310g;

    /* renamed from: h  reason: collision with root package name */
    public long f5311h;

    public c(q qVar, G g3, i iVar, String str, int i7) {
        this.f5305a = qVar;
        this.f5306b = g3;
        this.f5307c = iVar;
        int i8 = iVar.f1378d;
        int i9 = iVar.f1375a;
        int i10 = (i8 * i9) / 8;
        int i11 = iVar.f1377c;
        if (i11 == i10) {
            int i12 = iVar.f1376b;
            int i13 = i12 * i10;
            int i14 = i13 * 8;
            int max = Math.max(i10, i13 / 10);
            this.f5309e = max;
            C0137q c0137q = new C0137q();
            c0137q.f1850l = I.l(str);
            c0137q.f1846g = i14;
            c0137q.f1847h = i14;
            c0137q.f1851m = max;
            c0137q.f1864z = i9;
            c0137q.f1832A = i12;
            c0137q.f1833B = i7;
            this.f5308d = new r(c0137q);
            return;
        }
        throw J.a(null, "Expected block size: " + i10 + "; got: " + i11);
    }

    @Override // T1.b
    public final boolean a(l lVar, long j) {
        int i7;
        int i8;
        int i9;
        long j8 = j;
        while (true) {
            i7 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
            if (i7 <= 0 || (i8 = this.f5310g) >= (i9 = this.f5309e)) {
                break;
            }
            int b5 = this.f5306b.b(lVar, (int) Math.min(i9 - i8, j8), true);
            if (b5 == -1) {
                j8 = 0;
            } else {
                this.f5310g += b5;
                j8 -= b5;
            }
        }
        i iVar = this.f5307c;
        int i10 = this.f5310g;
        int i11 = iVar.f1377c;
        int i12 = i10 / i11;
        if (i12 > 0) {
            long j9 = this.f;
            long j10 = this.f5311h;
            long j11 = iVar.f1376b;
            int i13 = x.f2529a;
            int i14 = i12 * i11;
            int i15 = this.f5310g - i14;
            this.f5306b.e(j9 + x.U(j10, 1000000L, j11, RoundingMode.FLOOR), 1, i14, i15, null);
            this.f5311h += i12;
            this.f5310g = i15;
        }
        if (i7 <= 0) {
            return true;
        }
        return false;
    }

    @Override // T1.b
    public final void b(int i7, long j) {
        this.f5305a.x(new f(this.f5307c, 1, i7, j));
        this.f5306b.c(this.f5308d);
    }

    @Override // T1.b
    public final void c(long j) {
        this.f = j;
        this.f5310g = 0;
        this.f5311h = 0L;
    }
}
