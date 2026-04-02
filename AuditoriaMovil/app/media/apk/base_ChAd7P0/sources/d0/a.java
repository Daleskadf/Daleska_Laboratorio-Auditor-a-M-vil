package D0;

import V2.d;
import androidx.lifecycle.C;
import androidx.lifecycle.D;
import androidx.lifecycle.InterfaceC0568u;
/* loaded from: classes.dex */
public final class a extends C {

    /* renamed from: l  reason: collision with root package name */
    public final d f822l;

    /* renamed from: m  reason: collision with root package name */
    public InterfaceC0568u f823m;

    /* renamed from: n  reason: collision with root package name */
    public b f824n;

    public a(d dVar) {
        this.f822l = dVar;
        if (dVar.f5948a == null) {
            dVar.f5948a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override // androidx.lifecycle.C
    public final void g() {
        d dVar = this.f822l;
        dVar.f5949b = true;
        dVar.f5951d = false;
        dVar.f5950c = false;
        dVar.f5955i.drainPermits();
        dVar.c();
    }

    @Override // androidx.lifecycle.C
    public final void h() {
        this.f822l.f5949b = false;
    }

    @Override // androidx.lifecycle.C
    public final void j(D d7) {
        super.j(d7);
        this.f823m = null;
        this.f824n = null;
    }

    public final void m() {
        InterfaceC0568u interfaceC0568u = this.f823m;
        b bVar = this.f824n;
        if (interfaceC0568u != null && bVar != null) {
            super.j(bVar);
            e(interfaceC0568u, bVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.f822l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
