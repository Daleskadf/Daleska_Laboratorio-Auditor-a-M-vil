package E2;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final c f1058a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1059b;

    public a(c cVar, long j) {
        if (cVar != null) {
            this.f1058a = cVar;
            this.f1059b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1058a.equals(aVar.f1058a) && this.f1059b == aVar.f1059b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f1059b;
        return ((this.f1058a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.f1058a);
        sb.append(", nextRequestWaitMillis=");
        return AbstractC0059i.C(sb, this.f1059b, "}");
    }
}
