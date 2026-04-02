package D;

import android.util.Size;
import android.view.Surface;
/* loaded from: classes.dex */
public final class t0 extends androidx.camera.core.impl.J {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f777o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final Object f778p;

    public t0(Surface surface, Size size, int i7) {
        super(size, i7);
        this.f778p = surface;
    }

    @Override // androidx.camera.core.impl.J
    public final E3.b f() {
        switch (this.f777o) {
            case 0:
                return ((v0) this.f778p).f786e;
            default:
                return H.i.c((Surface) this.f778p);
        }
    }

    public t0(Surface surface) {
        super(androidx.camera.core.impl.J.f7544k, 0);
        this.f778p = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(v0 v0Var, Size size) {
        super(size, 34);
        this.f778p = v0Var;
    }
}
