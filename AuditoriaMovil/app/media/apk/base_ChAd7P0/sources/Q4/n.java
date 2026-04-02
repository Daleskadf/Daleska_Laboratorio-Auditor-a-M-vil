package q4;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final h f15362a;

    /* renamed from: b  reason: collision with root package name */
    public m f15363b;

    /* renamed from: c  reason: collision with root package name */
    public q f15364c;

    /* renamed from: d  reason: collision with root package name */
    public q f15365d;

    /* renamed from: e  reason: collision with root package name */
    public o f15366e;
    public l f;

    public n(h hVar) {
        this.f15362a = hVar;
        this.f15365d = q.f15370b;
    }

    public static n g(h hVar) {
        m mVar = m.INVALID;
        q qVar = q.f15370b;
        return new n(hVar, mVar, qVar, qVar, new o(), l.SYNCED);
    }

    public static n h(h hVar, q qVar) {
        n nVar = new n(hVar);
        nVar.b(qVar);
        return nVar;
    }

    public final void a(q qVar, o oVar) {
        this.f15364c = qVar;
        this.f15363b = m.FOUND_DOCUMENT;
        this.f15366e = oVar;
        this.f = l.SYNCED;
    }

    public final void b(q qVar) {
        this.f15364c = qVar;
        this.f15363b = m.NO_DOCUMENT;
        this.f15366e = new o();
        this.f = l.SYNCED;
    }

    public final boolean c() {
        return this.f.equals(l.HAS_LOCAL_MUTATIONS);
    }

    public final boolean d() {
        return this.f15363b.equals(m.FOUND_DOCUMENT);
    }

    public final boolean e() {
        return this.f15363b.equals(m.NO_DOCUMENT);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f15362a.equals(nVar.f15362a) || !this.f15364c.equals(nVar.f15364c) || !this.f15363b.equals(nVar.f15363b) || !this.f.equals(nVar.f)) {
            return false;
        }
        return this.f15366e.equals(nVar.f15366e);
    }

    public final n f() {
        return new n(this.f15362a, this.f15363b, this.f15364c, this.f15365d, new o(this.f15366e.b()), this.f);
    }

    public final int hashCode() {
        return this.f15362a.f15357a.hashCode();
    }

    public final String toString() {
        return "Document{key=" + this.f15362a + ", version=" + this.f15364c + ", readTime=" + this.f15365d + ", type=" + this.f15363b + ", documentState=" + this.f + ", value=" + this.f15366e + '}';
    }

    public n(h hVar, m mVar, q qVar, q qVar2, o oVar, l lVar) {
        this.f15362a = hVar;
        this.f15364c = qVar;
        this.f15365d = qVar2;
        this.f15363b = mVar;
        this.f = lVar;
        this.f15366e = oVar;
    }
}
