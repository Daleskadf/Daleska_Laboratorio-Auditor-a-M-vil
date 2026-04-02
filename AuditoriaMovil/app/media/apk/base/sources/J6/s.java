package J6;

import p6.InterfaceC1701d;
/* loaded from: classes.dex */
public final class s implements n6.d, InterfaceC1701d {

    /* renamed from: a  reason: collision with root package name */
    public final n6.d f2456a;

    /* renamed from: b  reason: collision with root package name */
    public final n6.i f2457b;

    public s(n6.d dVar, n6.i iVar) {
        this.f2456a = dVar;
        this.f2457b = iVar;
    }

    @Override // p6.InterfaceC1701d
    public final InterfaceC1701d getCallerFrame() {
        n6.d dVar = this.f2456a;
        if (dVar instanceof InterfaceC1701d) {
            return (InterfaceC1701d) dVar;
        }
        return null;
    }

    @Override // n6.d
    public final n6.i getContext() {
        return this.f2457b;
    }

    @Override // n6.d
    public final void resumeWith(Object obj) {
        this.f2456a.resumeWith(obj);
    }
}
