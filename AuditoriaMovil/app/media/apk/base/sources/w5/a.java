package W5;

import H0.e0;
import O0.H;
import O0.r;
import j$.util.Objects;
/* loaded from: classes.dex */
public final class a extends io.flutter.plugins.videoplayer.b {

    /* renamed from: e  reason: collision with root package name */
    public boolean f6221e;

    @Override // io.flutter.plugins.videoplayer.b
    public final void d() {
        r rVar = this.f12399c;
        H h8 = (H) rVar;
        h8.Z();
        e0 e0Var = h8.f3509W0;
        io.flutter.plugins.videoplayer.a aVar = io.flutter.plugins.videoplayer.a.ROTATE_0;
        int i7 = e0Var.f1793a;
        int i8 = e0Var.f1794b;
        if (i7 != 0 && i8 != 0 && !this.f6221e) {
            H h9 = (H) rVar;
            h9.Z();
            H0.r rVar2 = h9.f3493G0;
            Objects.requireNonNull(rVar2);
            try {
                aVar = io.flutter.plugins.videoplayer.a.a(rVar2.f1895v);
            } catch (IllegalArgumentException unused) {
                aVar = io.flutter.plugins.videoplayer.a.ROTATE_0;
            }
        }
        this.f12400d.m(i7, i8, ((H) rVar).J(), aVar.b());
    }
}
