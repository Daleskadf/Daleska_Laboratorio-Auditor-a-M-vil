package L5;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final f f3031a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3032b;

    /* renamed from: c  reason: collision with root package name */
    public final s f3033c;

    public j(f fVar, String str) {
        this(fVar, str, y.f3047b);
    }

    public final void a(i iVar) {
        V2.k kVar;
        if (iVar == null) {
            kVar = null;
        } else {
            kVar = new V2.k(this, iVar);
        }
        this.f3031a.n(this.f3032b, kVar);
    }

    public j(f fVar, String str, s sVar) {
        this.f3031a = fVar;
        this.f3032b = str;
        this.f3033c = sVar;
    }
}
