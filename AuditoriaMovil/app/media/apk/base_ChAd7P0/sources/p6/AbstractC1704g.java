package p6;

import n6.j;
/* renamed from: p6.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1704g extends AbstractC1698a {
    public AbstractC1704g(n6.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != j.f14394a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // n6.d
    public final n6.i getContext() {
        return j.f14394a;
    }
}
