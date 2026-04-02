package Q;

import android.hardware.camera2.CaptureResult;
import androidx.camera.core.impl.EnumC0512n;
import androidx.camera.core.impl.EnumC0513o;
import androidx.camera.core.impl.EnumC0514p;
import androidx.camera.core.impl.InterfaceC0515q;
import androidx.camera.core.impl.u0;
/* loaded from: classes.dex */
public final class h implements InterfaceC0515q {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0515q f4130a;

    /* renamed from: b  reason: collision with root package name */
    public final u0 f4131b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4132c;

    public h(InterfaceC0515q interfaceC0515q, u0 u0Var, long j) {
        this.f4130a = interfaceC0515q;
        this.f4131b = u0Var;
        this.f4132c = j;
    }

    @Override // androidx.camera.core.impl.InterfaceC0515q
    public final u0 a() {
        return this.f4131b;
    }

    @Override // androidx.camera.core.impl.InterfaceC0515q
    public final long b() {
        InterfaceC0515q interfaceC0515q = this.f4130a;
        if (interfaceC0515q != null) {
            return interfaceC0515q.b();
        }
        long j = this.f4132c;
        if (j != -1) {
            return j;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // androidx.camera.core.impl.InterfaceC0515q
    public final EnumC0512n g() {
        InterfaceC0515q interfaceC0515q = this.f4130a;
        if (interfaceC0515q != null) {
            return interfaceC0515q.g();
        }
        return EnumC0512n.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC0515q
    public final EnumC0514p k() {
        InterfaceC0515q interfaceC0515q = this.f4130a;
        if (interfaceC0515q != null) {
            return interfaceC0515q.k();
        }
        return EnumC0514p.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC0515q
    public final /* synthetic */ CaptureResult m() {
        return null;
    }

    @Override // androidx.camera.core.impl.InterfaceC0515q
    public final EnumC0513o n() {
        InterfaceC0515q interfaceC0515q = this.f4130a;
        if (interfaceC0515q != null) {
            return interfaceC0515q.n();
        }
        return EnumC0513o.UNKNOWN;
    }
}
