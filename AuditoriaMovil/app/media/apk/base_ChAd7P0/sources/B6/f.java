package B6;
/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: d  reason: collision with root package name */
    public static final f f408d = new d(1, 0, 1);

    public final boolean e(int i7) {
        if (this.f401a <= i7 && i7 <= this.f402b) {
            return true;
        }
        return false;
    }

    @Override // B6.d
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (this.f401a == fVar.f401a) {
                    if (this.f402b == fVar.f402b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // B6.d
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f401a * 31) + this.f402b;
    }

    @Override // B6.d
    public final boolean isEmpty() {
        if (this.f401a > this.f402b) {
            return true;
        }
        return false;
    }

    @Override // B6.d
    public final String toString() {
        return this.f401a + ".." + this.f402b;
    }
}
