package r4;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final q4.k f15494a;

    /* renamed from: b  reason: collision with root package name */
    public final p f15495b;

    public g(q4.k kVar, p pVar) {
        this.f15494a = kVar;
        this.f15495b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f15494a.equals(gVar.f15494a)) {
            return false;
        }
        return this.f15495b.equals(gVar.f15495b);
    }

    public final int hashCode() {
        return this.f15495b.hashCode() + (this.f15494a.hashCode() * 31);
    }
}
