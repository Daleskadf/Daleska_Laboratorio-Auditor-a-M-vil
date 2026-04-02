package c6;
/* loaded from: classes.dex */
public final class L0 extends a6.O {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8491a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final a6.M f8492b;

    public L0(a6.M m7) {
        G.i.j(m7, "result");
        this.f8492b = m7;
    }

    @Override // a6.O
    public final a6.M a(D1 d12) {
        switch (this.f8491a) {
            case 0:
                return this.f8492b;
            default:
                return this.f8492b;
        }
    }

    public final String toString() {
        switch (this.f8491a) {
            case 0:
                K5.d dVar = new K5.d(L0.class.getSimpleName());
                dVar.a(this.f8492b, "panicPickResult");
                return dVar.toString();
            default:
                return "FixedResultPicker(" + this.f8492b + ")";
        }
    }

    public L0(Throwable th) {
        a6.o0 f = a6.o0.f7179m.g("Panic! This is a bug!").f(th);
        a6.M m7 = a6.M.f7091e;
        G.i.f("drop status shouldn't be OK", !f.e());
        this.f8492b = new a6.M(null, null, f, true);
    }
}
