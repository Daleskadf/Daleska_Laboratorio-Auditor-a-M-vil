package T5;
/* loaded from: classes.dex */
public final class P {

    /* renamed from: a  reason: collision with root package name */
    public final String f5422a;

    /* renamed from: b  reason: collision with root package name */
    public final N f5423b;

    public P(String str, N type) {
        kotlin.jvm.internal.j.e(type, "type");
        this.f5422a = str;
        this.f5423b = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p7 = (P) obj;
        if (kotlin.jvm.internal.j.a(this.f5422a, p7.f5422a) && this.f5423b == p7.f5423b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f5422a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f5423b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f5422a + ", type=" + this.f5423b + ")";
    }
}
