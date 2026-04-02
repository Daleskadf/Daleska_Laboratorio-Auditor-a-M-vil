package c6;
/* renamed from: c6.t1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0707t1 extends a6.O {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8991a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8992b;

    public C0707t1(a6.M m7) {
        G.i.j(m7, "result");
        this.f8992b = m7;
    }

    @Override // a6.O
    public final a6.M a(D1 d12) {
        switch (this.f8991a) {
            case 0:
                return (a6.M) this.f8992b;
            default:
                return a6.M.a((a6.o0) this.f8992b);
        }
    }

    public String toString() {
        switch (this.f8991a) {
            case 0:
                K5.d dVar = new K5.d(C0707t1.class.getSimpleName());
                dVar.a((a6.M) this.f8992b, "result");
                return dVar.toString();
            default:
                return super.toString();
        }
    }

    public C0707t1(a6.o0 o0Var) {
        this.f8992b = o0Var;
    }
}
