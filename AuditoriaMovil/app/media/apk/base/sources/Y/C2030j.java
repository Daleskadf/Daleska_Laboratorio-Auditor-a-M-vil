package y;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
/* renamed from: y.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2030j extends q {
    public C2030j(int i7, Surface surface) {
        super(new C2029i(new OutputConfiguration(i7, surface)));
    }

    @Override // y.q
    public void b() {
        ((C2029i) this.f16594a).f16581c = true;
    }

    @Override // y.q
    public Object c() {
        Object obj = this.f16594a;
        g0.c.b(obj instanceof C2029i);
        return ((C2029i) obj).f16579a;
    }

    @Override // y.q
    public String d() {
        return ((C2029i) this.f16594a).f16580b;
    }

    @Override // y.q
    public final Surface e() {
        return ((OutputConfiguration) c()).getSurface();
    }

    @Override // y.q
    public boolean f() {
        return ((C2029i) this.f16594a).f16581c;
    }

    @Override // y.q
    public void g(long j) {
        ((C2029i) this.f16594a).f16582d = j;
    }

    @Override // y.q
    public void i(String str) {
        ((C2029i) this.f16594a).f16580b = str;
    }
}
