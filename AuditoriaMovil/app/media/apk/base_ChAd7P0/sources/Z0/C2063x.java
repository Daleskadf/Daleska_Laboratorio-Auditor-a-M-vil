package z0;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0570w;
import e.C0918D;
import e.InterfaceC0919E;
import g.InterfaceC1000e;
import g0.InterfaceC1003a;
import h0.InterfaceC1045e;
/* renamed from: z0.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2063x extends org.slf4j.helpers.i implements X.g, X.h, W.M, W.N, androidx.lifecycle.Y, InterfaceC0919E, InterfaceC1000e, Z1.e, O, InterfaceC1045e {

    /* renamed from: X  reason: collision with root package name */
    public final L f16854X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2064y f16855Y;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractActivityC2064y f16856d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractActivityC2064y f16857e;
    public final Handler f;

    public C2063x(AbstractActivityC2064y abstractActivityC2064y) {
        this.f16855Y = abstractActivityC2064y;
        Handler handler = new Handler();
        this.f16856d = abstractActivityC2064y;
        this.f16857e = abstractActivityC2064y;
        this.f = handler;
        this.f16854X = new L();
    }

    @Override // org.slf4j.helpers.i
    public final View H(int i7) {
        return this.f16855Y.findViewById(i7);
    }

    @Override // org.slf4j.helpers.i
    public final boolean I() {
        Window window = this.f16855Y.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // e.InterfaceC0919E
    public final C0918D a() {
        return this.f16855Y.a();
    }

    @Override // Z1.e
    public final K5.s c() {
        return (K5.s) this.f16855Y.f10553d.f690c;
    }

    @Override // X.g
    public final void d(InterfaceC1003a interfaceC1003a) {
        this.f16855Y.d(interfaceC1003a);
    }

    @Override // androidx.lifecycle.Y
    public final androidx.lifecycle.X g() {
        return this.f16855Y.g();
    }

    @Override // androidx.lifecycle.InterfaceC0568u
    public final C0570w h() {
        return this.f16855Y.f16859o0;
    }

    @Override // X.g
    public final void i(InterfaceC1003a interfaceC1003a) {
        this.f16855Y.i(interfaceC1003a);
    }

    @Override // z0.O
    public final void e() {
    }
}
