package y;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
/* loaded from: classes.dex */
public final class o extends n {
    public o(int i7, Surface surface) {
        super(new OutputConfiguration(i7, surface));
    }

    @Override // y.n, y.l, y.C2030j, y.q
    public final Object c() {
        Object obj = this.f16594a;
        g0.c.b(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // y.n, y.l, y.C2030j, y.q
    public final void g(long j) {
        ((OutputConfiguration) c()).setDynamicRangeProfile(j);
    }

    @Override // y.q
    public final void h(int i7) {
        ((OutputConfiguration) c()).setMirrorMode(i7);
    }

    @Override // y.q
    public final void j(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) c()).setStreamUseCase(j);
    }
}
