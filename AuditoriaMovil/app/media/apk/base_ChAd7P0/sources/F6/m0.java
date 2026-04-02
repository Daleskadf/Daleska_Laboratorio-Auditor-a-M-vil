package F6;
/* loaded from: classes.dex */
public final class m0 extends C0100m {

    /* renamed from: Z  reason: collision with root package name */
    public final u0 f1286Z;

    public m0(u0 u0Var, n6.d dVar) {
        super(1, dVar);
        this.f1286Z = u0Var;
    }

    @Override // F6.C0100m
    public final Throwable q(u0 u0Var) {
        Throwable b5;
        Object x7 = this.f1286Z.x();
        if ((x7 instanceof o0) && (b5 = ((o0) x7).b()) != null) {
            return b5;
        }
        if (x7 instanceof C0108v) {
            return ((C0108v) x7).f1316a;
        }
        return u0Var.getCancellationException();
    }

    @Override // F6.C0100m
    public final String y() {
        return "AwaitContinuation";
    }
}
