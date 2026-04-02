package S0;

import D.AbstractC0059i;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final long f4887a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4888b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4889c;

    /* renamed from: d  reason: collision with root package name */
    public int f4890d;

    public j(long j, long j8, String str) {
        this.f4889c = str == null ? StringUtils.EMPTY : str;
        this.f4887a = j;
        this.f4888b = j8;
    }

    public final j a(j jVar, String str) {
        long j;
        long j8;
        long j9;
        String x7 = K0.a.x(str, this.f4889c);
        if (jVar == null || !x7.equals(K0.a.x(str, jVar.f4889c))) {
            return null;
        }
        long j10 = this.f4888b;
        int i7 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        long j11 = jVar.f4888b;
        if (i7 != 0) {
            long j12 = this.f4887a;
            j = j10;
            if (j12 + j10 == jVar.f4887a) {
                if (j11 == -1) {
                    j9 = -1;
                } else {
                    j9 = j + j11;
                }
                return new j(j12, j9, x7);
            }
        } else {
            j = j10;
        }
        if (j11 != -1) {
            long j13 = jVar.f4887a;
            if (j13 + j11 == this.f4887a) {
                if (j == -1) {
                    j8 = -1;
                } else {
                    j8 = j11 + j;
                }
                return new j(j13, j8, x7);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f4887a == jVar.f4887a && this.f4888b == jVar.f4888b && this.f4889c.equals(jVar.f4889c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f4890d == 0) {
            this.f4890d = this.f4889c.hashCode() + ((((527 + ((int) this.f4887a)) * 31) + ((int) this.f4888b)) * 31);
        }
        return this.f4890d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.f4889c);
        sb.append(", start=");
        sb.append(this.f4887a);
        sb.append(", length=");
        return AbstractC0059i.C(sb, this.f4888b, ")");
    }
}
