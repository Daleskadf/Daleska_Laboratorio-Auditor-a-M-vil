package D;
/* renamed from: D.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062l {

    /* renamed from: a  reason: collision with root package name */
    public final M.n f737a;

    public C0062l(M.n nVar) {
        if (nVar != null) {
            this.f737a = nVar;
            return;
        }
        throw new NullPointerException("Null surfaceOutput");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0062l) {
            C0062l c0062l = (C0062l) obj;
            c0062l.getClass();
            return this.f737a.equals(c0062l.f737a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f737a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.f737a + "}";
    }
}
