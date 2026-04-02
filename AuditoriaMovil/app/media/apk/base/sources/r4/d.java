package r4;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f15490a;

    /* renamed from: b  reason: collision with root package name */
    public final h f15491b;

    public d(int i7, h hVar) {
        this.f15490a = i7;
        this.f15491b = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f15490a == dVar.f15490a && this.f15491b.equals(dVar.f15491b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15490a ^ 1000003) * 1000003) ^ this.f15491b.hashCode();
    }

    public final String toString() {
        return "Overlay{largestBatchId=" + this.f15490a + ", mutation=" + this.f15491b + "}";
    }
}
