package c4;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final r f8395a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8396b;

    public i(r rVar, boolean z7) {
        this.f8395a = rVar;
        this.f8396b = z7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!iVar.f8395a.equals(this.f8395a) || iVar.f8396b != this.f8396b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f8395a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f8396b).hashCode();
    }
}
