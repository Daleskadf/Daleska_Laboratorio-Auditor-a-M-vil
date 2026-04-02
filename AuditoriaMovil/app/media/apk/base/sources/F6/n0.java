package F6;
/* loaded from: classes.dex */
public final class n0 extends AbstractC0099l0 {

    /* renamed from: X  reason: collision with root package name */
    public final C0104q f1288X;

    /* renamed from: Y  reason: collision with root package name */
    public final Object f1289Y;

    /* renamed from: e  reason: collision with root package name */
    public final u0 f1290e;
    public final o0 f;

    public n0(u0 u0Var, o0 o0Var, C0104q c0104q, Object obj) {
        this.f1290e = u0Var;
        this.f = o0Var;
        this.f1288X = c0104q;
        this.f1289Y = obj;
    }

    @Override // w6.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return l6.j.f13876a;
    }

    @Override // F6.AbstractC0099l0
    public final void j(Throwable th) {
        C0104q c0104q = this.f1288X;
        u0 u0Var = this.f1290e;
        u0Var.getClass();
        C0104q F7 = u0.F(c0104q);
        o0 o0Var = this.f;
        Object obj = this.f1289Y;
        if (F7 != null) {
            while (H.m(F7.f1300e, false, new n0(u0Var, o0Var, F7, obj), 1) == z0.f1325a) {
                F7 = u0.F(F7);
                if (F7 == null) {
                    u0Var.h(u0Var.r(o0Var, obj));
                }
            }
            return;
        }
        u0Var.h(u0Var.r(o0Var, obj));
    }
}
