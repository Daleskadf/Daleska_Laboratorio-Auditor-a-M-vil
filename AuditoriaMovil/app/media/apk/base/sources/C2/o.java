package C2;
/* loaded from: classes.dex */
public final class o extends w {

    /* renamed from: a  reason: collision with root package name */
    public final v f526a;

    /* renamed from: b  reason: collision with root package name */
    public final u f527b;

    public o(v vVar, u uVar) {
        this.f526a = vVar;
        this.f527b = uVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        v vVar = this.f526a;
        if (vVar != null ? vVar.equals(((o) wVar).f526a) : ((o) wVar).f526a == null) {
            u uVar = this.f527b;
            if (uVar == null) {
                if (((o) wVar).f527b == null) {
                    return true;
                }
            } else if (uVar.equals(((o) wVar).f527b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        v vVar = this.f526a;
        if (vVar == null) {
            hashCode = 0;
        } else {
            hashCode = vVar.hashCode();
        }
        int i8 = (hashCode ^ 1000003) * 1000003;
        u uVar = this.f527b;
        if (uVar != null) {
            i7 = uVar.hashCode();
        }
        return i7 ^ i8;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f526a + ", mobileSubtype=" + this.f527b + "}";
    }
}
