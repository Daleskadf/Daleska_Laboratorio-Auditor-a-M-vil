package w3;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final int f16362a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16363b;

    public l(int i7, long j) {
        this.f16362a = i7;
        this.f16363b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f16362a == lVar.f16362a && this.f16363b == lVar.f16363b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f16363b;
        return ((int) (j ^ (j >>> 32))) ^ ((this.f16362a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(this.f16362a);
        sb.append(", eventTimestamp=");
        return AbstractC0059i.C(sb, this.f16363b, "}");
    }
}
