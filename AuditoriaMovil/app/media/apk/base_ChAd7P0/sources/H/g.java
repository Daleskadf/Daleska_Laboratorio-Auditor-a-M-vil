package H;
/* loaded from: classes.dex */
public final /* synthetic */ class g implements U.j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1623a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ E3.b f1624b;

    public /* synthetic */ g(E3.b bVar, int i7) {
        this.f1623a = i7;
        this.f1624b = bVar;
    }

    @Override // U.j
    public final Object i(U.i iVar) {
        switch (this.f1623a) {
            case 0:
                C.b bVar = new C.b(iVar, 7);
                G.a r7 = j3.f.r();
                E3.b bVar2 = this.f1624b;
                bVar2.a(bVar, r7);
                return "transformVoidFuture [" + bVar2 + "]";
            default:
                G.a r8 = j3.f.r();
                E3.b bVar3 = this.f1624b;
                i.e(false, bVar3, iVar, r8);
                return "nonCancellationPropagating[" + bVar3 + "]";
        }
    }
}
