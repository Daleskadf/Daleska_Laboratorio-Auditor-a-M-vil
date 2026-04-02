package R0;

import H0.r;
import K0.x;
import e1.U;
import p.C1608t;
/* loaded from: classes.dex */
public final class m implements U {

    /* renamed from: X  reason: collision with root package name */
    public int f4615X;

    /* renamed from: a  reason: collision with root package name */
    public final r f4617a;

    /* renamed from: c  reason: collision with root package name */
    public long[] f4619c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4620d;

    /* renamed from: e  reason: collision with root package name */
    public S0.g f4621e;
    public boolean f;

    /* renamed from: b  reason: collision with root package name */
    public final C1608t f4618b = new C1608t(24);

    /* renamed from: Y  reason: collision with root package name */
    public long f4616Y = -9223372036854775807L;

    public m(S0.g gVar, r rVar, boolean z7) {
        this.f4617a = rVar;
        this.f4621e = gVar;
        this.f4619c = gVar.f4875b;
        c(gVar, z7);
    }

    @Override // e1.U
    public final boolean b() {
        return true;
    }

    public final void c(S0.g gVar, boolean z7) {
        long j;
        int i7 = this.f4615X;
        long j8 = -9223372036854775807L;
        if (i7 == 0) {
            j = -9223372036854775807L;
        } else {
            j = this.f4619c[i7 - 1];
        }
        this.f4620d = z7;
        this.f4621e = gVar;
        long[] jArr = gVar.f4875b;
        this.f4619c = jArr;
        long j9 = this.f4616Y;
        if (j9 != -9223372036854775807L) {
            int b5 = x.b(jArr, j9, true);
            this.f4615X = b5;
            if (this.f4620d && b5 == this.f4619c.length) {
                j8 = j9;
            }
            this.f4616Y = j8;
        } else if (j != -9223372036854775807L) {
            this.f4615X = x.b(jArr, j, false);
        }
    }

    @Override // e1.U
    public final int g(M0.x xVar, N0.f fVar, int i7) {
        boolean z7;
        int i8 = this.f4615X;
        if (i8 == this.f4619c.length) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7 && !this.f4620d) {
            fVar.f1354b = 4;
            return -4;
        } else if ((i7 & 2) == 0 && this.f) {
            if (z7) {
                return -3;
            }
            if ((i7 & 1) == 0) {
                this.f4615X = i8 + 1;
            }
            if ((i7 & 4) == 0) {
                byte[] T7 = this.f4618b.T(this.f4621e.f4874a[i8]);
                fVar.h(T7.length);
                fVar.f3350e.put(T7);
            }
            fVar.f3345X = this.f4619c[i8];
            fVar.f1354b = 1;
            return -4;
        } else {
            xVar.f3211c = this.f4617a;
            this.f = true;
            return -5;
        }
    }

    @Override // e1.U
    public final int h(long j) {
        int max = Math.max(this.f4615X, x.b(this.f4619c, j, true));
        int i7 = max - this.f4615X;
        this.f4615X = max;
        return i7;
    }

    @Override // e1.U
    public final void a() {
    }
}
