package V5;

import O0.H;
import O0.r;
import j$.util.Objects;
/* loaded from: classes.dex */
public final class c extends io.flutter.plugins.videoplayer.b {
    @Override // io.flutter.plugins.videoplayer.b
    public final void d() {
        int i7;
        r rVar = this.f12399c;
        H h8 = (H) rVar;
        h8.Z();
        H0.r rVar2 = h8.f3493G0;
        Objects.requireNonNull(rVar2);
        io.flutter.plugins.videoplayer.a a7 = io.flutter.plugins.videoplayer.a.a(rVar2.f1895v);
        io.flutter.plugins.videoplayer.a aVar = io.flutter.plugins.videoplayer.a.ROTATE_90;
        int i8 = rVar2.f1892s;
        int i9 = rVar2.f1893t;
        if (a7 != aVar && a7 != io.flutter.plugins.videoplayer.a.ROTATE_270) {
            i7 = i9;
        } else {
            a7 = io.flutter.plugins.videoplayer.a.a(0);
            i7 = i8;
            i8 = i9;
        }
        this.f12400d.m(i8, i7, ((H) rVar).J(), a7.b());
    }
}
