package A2;
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f77a;

    /* renamed from: b  reason: collision with root package name */
    public final d f78b;

    public a(Object obj, d dVar) {
        if (obj != null) {
            this.f77a = (byte[]) obj;
            if (dVar != null) {
                this.f78b = dVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        a aVar = (a) ((c) obj);
        aVar.getClass();
        if (this.f77a.equals(aVar.f77a) && this.f78b.equals(aVar.f78b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f78b.hashCode() ^ (((1000003 * 1000003) ^ this.f77a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f77a + ", priority=" + this.f78b + "}";
    }
}
