package U;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Object f5529a;

    /* renamed from: b  reason: collision with root package name */
    public l f5530b;

    /* renamed from: c  reason: collision with root package name */
    public m f5531c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5532d;

    public final boolean a(Object obj) {
        boolean z7 = true;
        this.f5532d = true;
        l lVar = this.f5530b;
        z7 = (lVar == null || !lVar.f5535b.j(obj)) ? false : false;
        if (z7) {
            this.f5529a = null;
            this.f5530b = null;
            this.f5531c = null;
        }
        return z7;
    }

    public final boolean b(Throwable th) {
        boolean z7 = true;
        this.f5532d = true;
        l lVar = this.f5530b;
        z7 = (lVar == null || !lVar.f5535b.k(th)) ? false : false;
        if (z7) {
            this.f5529a = null;
            this.f5530b = null;
            this.f5531c = null;
        }
        return z7;
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f5530b;
        if (lVar != null) {
            k kVar = lVar.f5535b;
            if (!kVar.isDone()) {
                kVar.k(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f5529a, 1));
            }
        }
        if (!this.f5532d && (mVar = this.f5531c) != null) {
            mVar.j(null);
        }
    }
}
