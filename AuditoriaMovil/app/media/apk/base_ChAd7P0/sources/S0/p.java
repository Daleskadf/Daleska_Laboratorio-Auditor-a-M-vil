package S0;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
/* loaded from: classes.dex */
public final class p extends n {
    public final R1.j j;

    /* renamed from: k  reason: collision with root package name */
    public final R1.j f4902k;

    /* renamed from: l  reason: collision with root package name */
    public final long f4903l;

    public p(j jVar, long j, long j8, long j9, long j10, long j11, List list, long j12, R1.j jVar2, R1.j jVar3, long j13, long j14) {
        super(jVar, j, j8, j9, j11, list, j12, j13, j14);
        this.j = jVar2;
        this.f4902k = jVar3;
        this.f4903l = j10;
    }

    @Override // S0.s
    public final j a(m mVar) {
        R1.j jVar = this.j;
        if (jVar != null) {
            H0.r rVar = mVar.f4892a;
            return new j(0L, -1L, jVar.g0(rVar.f1876a, 0L, 0L, rVar.f1883i));
        }
        return this.f4908a;
    }

    @Override // S0.n
    public final long d(long j) {
        List list = this.f;
        if (list != null) {
            return list.size();
        }
        long j8 = this.f4903l;
        if (j8 != -1) {
            return (j8 - this.f4897d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f4909b));
        BigInteger multiply2 = BigInteger.valueOf(this.f4898e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i7 = C3.a.f528a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // S0.n
    public final j h(k kVar, long j) {
        long j8;
        long j9 = this.f4897d;
        List list = this.f;
        if (list != null) {
            j8 = ((q) list.get((int) (j - j9))).f4904a;
        } else {
            j8 = (j - j9) * this.f4898e;
        }
        long j10 = j8;
        H0.r rVar = kVar.f4892a;
        return new j(0L, -1L, this.f4902k.g0(rVar.f1876a, j, j10, rVar.f1883i));
    }
}
