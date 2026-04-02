package a0;
/* loaded from: classes.dex */
public class d {
    public final Object first;
    public final Object second;

    public d(Object obj, Object obj2) {
        this.first = obj;
        this.second = obj2;
    }

    public static <A, B> d create(A a10, B b10) {
        return new d(a10, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!c.a(dVar.first, this.first) || !c.a(dVar.second, this.second)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.first;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.second;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "Pair{" + this.first + " " + this.second + "}";
    }
}
