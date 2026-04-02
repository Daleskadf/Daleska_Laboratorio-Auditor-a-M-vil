package C2;
/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a  reason: collision with root package name */
    public final q f511a;

    /* renamed from: b  reason: collision with root package name */
    public final i f512b;

    public k(q qVar, i iVar) {
        this.f511a = qVar;
        this.f512b = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        q qVar = this.f511a;
        if (qVar != null ? qVar.equals(((k) rVar).f511a) : ((k) rVar).f511a == null) {
            if (this.f512b.equals(((k) rVar).f512b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        q qVar = this.f511a;
        if (qVar == null) {
            hashCode = 0;
        } else {
            hashCode = qVar.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ this.f512b.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f511a + ", androidClientInfo=" + this.f512b + "}";
    }
}
