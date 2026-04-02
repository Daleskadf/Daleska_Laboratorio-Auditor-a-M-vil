package U;
/* loaded from: classes.dex */
public final class k extends h {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ l f5533Y;

    public k(l lVar) {
        this.f5533Y = lVar;
    }

    @Override // U.h
    public final String h() {
        i iVar = (i) this.f5533Y.f5534a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f5529a + "]";
    }
}
