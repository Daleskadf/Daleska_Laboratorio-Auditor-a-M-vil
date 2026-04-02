package Q;

import androidx.camera.core.impl.InterfaceC0519v;
import androidx.camera.core.impl.L;
import java.util.UUID;
/* loaded from: classes.dex */
public final class j extends L {

    /* renamed from: b  reason: collision with root package name */
    public final String f4133b;

    /* renamed from: c  reason: collision with root package name */
    public int f4134c;

    public j(InterfaceC0519v interfaceC0519v) {
        super(interfaceC0519v);
        this.f4133b = "virtual-" + interfaceC0519v.c() + "-" + UUID.randomUUID().toString();
    }

    @Override // androidx.camera.core.impl.L, androidx.camera.core.impl.InterfaceC0519v
    public final int a() {
        return e(0);
    }

    @Override // androidx.camera.core.impl.L, androidx.camera.core.impl.InterfaceC0519v
    public final String c() {
        return this.f4133b;
    }

    @Override // androidx.camera.core.impl.L, androidx.camera.core.impl.InterfaceC0519v
    public final int e(int i7) {
        return F.g.f(this.f7558a.e(i7) - this.f4134c);
    }
}
