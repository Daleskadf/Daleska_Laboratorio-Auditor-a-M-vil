package z0;

import androidx.lifecycle.InterfaceC0568u;
/* renamed from: z0.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2056p implements androidx.lifecycle.D {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f16783a;

    public C2056p(r rVar) {
        this.f16783a = rVar;
    }

    @Override // androidx.lifecycle.D
    public final void a(Object obj) {
        if (((InterfaceC0568u) obj) != null) {
            r rVar = this.f16783a;
            if (rVar.f16791S0) {
                rVar.getClass();
                throw new IllegalStateException("Fragment " + rVar + " did not return a View from onCreateView() or this was called before onCreateView().");
            }
        }
    }
}
