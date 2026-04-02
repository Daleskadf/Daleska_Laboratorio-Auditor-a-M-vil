package y;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
/* loaded from: classes.dex */
public class n extends l {
    public n(int i7, Surface surface) {
        super(new m(new OutputConfiguration(i7, surface)));
    }

    @Override // y.l, y.C2030j, y.q
    public Object c() {
        Object obj = this.f16594a;
        g0.c.b(obj instanceof m);
        return ((m) obj).f16586a;
    }

    @Override // y.l, y.C2030j, y.q
    public final String d() {
        return null;
    }

    @Override // y.l, y.C2030j, y.q
    public void g(long j) {
        ((m) this.f16594a).f16587b = j;
    }

    @Override // y.l, y.C2030j, y.q
    public final void i(String str) {
        ((OutputConfiguration) c()).setPhysicalCameraId(str);
    }
}
