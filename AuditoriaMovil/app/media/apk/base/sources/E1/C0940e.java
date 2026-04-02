package e1;

import H0.C0122b;
/* renamed from: e1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0940e extends AbstractC0951p {

    /* renamed from: c  reason: collision with root package name */
    public final long f10793c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10794d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10795e;
    public final boolean f;

    public C0940e(H0.V v6, long j, long j8) {
        super(v6);
        long max;
        boolean z7 = false;
        if (v6.h() == 1) {
            H0.U m7 = v6.m(0, new H0.U(), 0L);
            long max2 = Math.max(0L, j);
            if (!m7.f1732k && max2 != 0 && !m7.f1730h) {
                throw new C0941f(1);
            }
            if (j8 == Long.MIN_VALUE) {
                max = m7.f1734m;
            } else {
                max = Math.max(0L, j8);
            }
            long j9 = m7.f1734m;
            int i7 = (j9 > (-9223372036854775807L) ? 1 : (j9 == (-9223372036854775807L) ? 0 : -1));
            if (i7 != 0) {
                max = max > j9 ? j9 : max;
                if (max2 > max) {
                    throw new C0941f(2);
                }
            }
            this.f10793c = max2;
            this.f10794d = max;
            int i8 = (max > (-9223372036854775807L) ? 1 : (max == (-9223372036854775807L) ? 0 : -1));
            this.f10795e = i8 != 0 ? max - max2 : -9223372036854775807L;
            if (m7.f1731i && (i8 == 0 || (i7 != 0 && max == j9))) {
                z7 = true;
            }
            this.f = z7;
            return;
        }
        throw new C0941f(0);
    }

    @Override // e1.AbstractC0951p, H0.V
    public final H0.T f(int i7, H0.T t7, boolean z7) {
        long j;
        this.f10826b.f(0, t7, z7);
        long j8 = t7.f1720e - this.f10793c;
        long j9 = this.f10795e;
        if (j9 == -9223372036854775807L) {
            j = -9223372036854775807L;
        } else {
            j = j9 - j8;
        }
        t7.h(t7.f1716a, t7.f1717b, 0, j, j8, C0122b.f1785c, false);
        return t7;
    }

    @Override // e1.AbstractC0951p, H0.V
    public final H0.U m(int i7, H0.U u7, long j) {
        this.f10826b.m(0, u7, 0L);
        long j8 = u7.f1737p;
        long j9 = this.f10793c;
        u7.f1737p = j8 + j9;
        u7.f1734m = this.f10795e;
        u7.f1731i = this.f;
        long j10 = u7.f1733l;
        if (j10 != -9223372036854775807L) {
            long max = Math.max(j10, j9);
            u7.f1733l = max;
            long j11 = this.f10794d;
            if (j11 != -9223372036854775807L) {
                max = Math.min(max, j11);
            }
            u7.f1733l = max - j9;
        }
        long Z6 = K0.x.Z(j9);
        long j12 = u7.f1728e;
        if (j12 != -9223372036854775807L) {
            u7.f1728e = j12 + Z6;
        }
        long j13 = u7.f;
        if (j13 != -9223372036854775807L) {
            u7.f = j13 + Z6;
        }
        return u7;
    }
}
