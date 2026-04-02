package y;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
/* loaded from: classes.dex */
public class l extends C2030j {
    public l(int i7, Surface surface) {
        super(new C2031k(new OutputConfiguration(i7, surface)));
    }

    @Override // y.q
    public final void a(Surface surface) {
        ((OutputConfiguration) c()).addSurface(surface);
    }

    @Override // y.C2030j, y.q
    public final void b() {
        ((OutputConfiguration) c()).enableSurfaceSharing();
    }

    @Override // y.C2030j, y.q
    public Object c() {
        Object obj = this.f16594a;
        g0.c.b(obj instanceof C2031k);
        return ((C2031k) obj).f16583a;
    }

    @Override // y.C2030j, y.q
    public String d() {
        return ((C2031k) this.f16594a).f16584b;
    }

    @Override // y.C2030j, y.q
    public final boolean f() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // y.C2030j, y.q
    public void g(long j) {
        ((C2031k) this.f16594a).f16585c = j;
    }

    @Override // y.C2030j, y.q
    public void i(String str) {
        ((C2031k) this.f16594a).f16584b = str;
    }
}
