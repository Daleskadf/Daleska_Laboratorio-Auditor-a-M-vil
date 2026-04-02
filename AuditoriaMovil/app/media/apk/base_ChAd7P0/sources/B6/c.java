package B6;
/* loaded from: classes.dex */
public final class c extends a {
    static {
        new a((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        c cVar;
        char c8;
        char c9;
        if (obj instanceof c) {
            char c10 = this.f394a;
            char c11 = this.f395b;
            if (c10 < c11 || c10 == c11 || (c8 = (cVar = (c) obj).f394a) < (c9 = cVar.f395b) || c8 == c9) {
                c cVar2 = (c) obj;
                if (c10 != cVar2.f394a || c11 != cVar2.f395b) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        char c8 = this.f394a;
        char c9 = this.f395b;
        if (c8 < c9 || c8 == c9) {
            return (c8 * 31) + c9;
        }
        return -1;
    }

    public final String toString() {
        return this.f394a + ".." + this.f395b;
    }
}
