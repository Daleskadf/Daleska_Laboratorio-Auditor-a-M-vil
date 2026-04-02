package J6;
/* loaded from: classes.dex */
public final class i implements n6.i {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f2442a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n6.i f2443b;

    public i(n6.i iVar, Throwable th) {
        this.f2442a = th;
        this.f2443b = iVar;
    }

    @Override // n6.i
    public final Object fold(Object obj, w6.p pVar) {
        return this.f2443b.fold(obj, pVar);
    }

    @Override // n6.i
    public final n6.g get(n6.h hVar) {
        return this.f2443b.get(hVar);
    }

    @Override // n6.i
    public final n6.i minusKey(n6.h hVar) {
        return this.f2443b.minusKey(hVar);
    }

    @Override // n6.i
    public final n6.i plus(n6.i iVar) {
        return this.f2443b.plus(iVar);
    }
}
