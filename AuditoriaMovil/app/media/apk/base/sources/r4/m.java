package r4;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: c  reason: collision with root package name */
    public static final m f15508c = new m(null, null);

    /* renamed from: a  reason: collision with root package name */
    public final q4.q f15509a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f15510b;

    public m(q4.q qVar, Boolean bool) {
        boolean z7;
        if (qVar != null && bool != null) {
            z7 = false;
        } else {
            z7 = true;
        }
        m5.d.i("Precondition can specify \"exists\" or \"updateTime\" but not both", z7, new Object[0]);
        this.f15509a = qVar;
        this.f15510b = bool;
    }

    public static m a(boolean z7) {
        return new m(null, Boolean.valueOf(z7));
    }

    public final boolean b(q4.n nVar) {
        boolean z7;
        q4.q qVar = this.f15509a;
        if (qVar != null) {
            if (!nVar.d() || !nVar.f15364c.equals(qVar)) {
                return false;
            }
            return true;
        }
        Boolean bool = this.f15510b;
        if (bool != null) {
            if (bool.booleanValue() != nVar.d()) {
                return false;
            }
            return true;
        }
        if (qVar == null && bool == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Precondition should be empty", z7, new Object[0]);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        q4.q qVar = mVar.f15509a;
        q4.q qVar2 = this.f15509a;
        if (qVar2 == null ? qVar != null : !qVar2.equals(qVar)) {
            return false;
        }
        Boolean bool = mVar.f15510b;
        Boolean bool2 = this.f15510b;
        if (bool2 != null) {
            return bool2.equals(bool);
        }
        if (bool == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = 0;
        q4.q qVar = this.f15509a;
        if (qVar != null) {
            i7 = qVar.f15371a.hashCode();
        } else {
            i7 = 0;
        }
        int i9 = i7 * 31;
        Boolean bool = this.f15510b;
        if (bool != null) {
            i8 = bool.hashCode();
        }
        return i9 + i8;
    }

    public final String toString() {
        Boolean bool = this.f15510b;
        q4.q qVar = this.f15509a;
        if (qVar == null && bool == null) {
            return "Precondition{<none>}";
        }
        if (qVar != null) {
            return "Precondition{updateTime=" + qVar + "}";
        } else if (bool != null) {
            return "Precondition{exists=" + bool + "}";
        } else {
            m5.d.g("Invalid Precondition", new Object[0]);
            throw null;
        }
    }
}
