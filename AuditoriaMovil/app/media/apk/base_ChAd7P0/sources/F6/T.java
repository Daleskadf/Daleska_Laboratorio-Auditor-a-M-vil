package F6;
/* loaded from: classes.dex */
public final class T extends AbstractC0099l0 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f1240e;
    public final Object f;

    public /* synthetic */ T(Object obj, int i7) {
        this.f1240e = i7;
        this.f = obj;
    }

    @Override // w6.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f1240e) {
            case 0:
                j((Throwable) obj);
                return l6.j.f13876a;
            case 1:
                j((Throwable) obj);
                return l6.j.f13876a;
            case 2:
                j((Throwable) obj);
                return l6.j.f13876a;
            default:
                j((Throwable) obj);
                return l6.j.f13876a;
        }
    }

    @Override // F6.AbstractC0099l0
    public final void j(Throwable th) {
        switch (this.f1240e) {
            case 0:
                ((S) this.f).a();
                return;
            case 1:
                ((w6.l) this.f).invoke(th);
                return;
            case 2:
                Object x7 = i().x();
                boolean z7 = x7 instanceof C0108v;
                m0 m0Var = (m0) this.f;
                if (z7) {
                    m0Var.resumeWith(org.slf4j.helpers.i.j(((C0108v) x7).f1316a));
                    return;
                } else {
                    m0Var.resumeWith(H.w(x7));
                    return;
                }
            default:
                ((C0100m) this.f).resumeWith(l6.j.f13876a);
                return;
        }
    }
}
