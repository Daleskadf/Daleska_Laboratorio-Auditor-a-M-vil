package e;

import androidx.lifecycle.AbstractC0564p;
import androidx.lifecycle.EnumC0562n;
import androidx.lifecycle.InterfaceC0566s;
import androidx.lifecycle.InterfaceC0568u;
/* renamed from: e.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0915A implements InterfaceC0566s, InterfaceC0922c {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0564p f10504a;

    /* renamed from: b  reason: collision with root package name */
    public final z0.D f10505b;

    /* renamed from: c  reason: collision with root package name */
    public C0916B f10506c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0918D f10507d;

    public C0915A(C0918D c0918d, AbstractC0564p lifecycle, z0.D onBackPressedCallback) {
        kotlin.jvm.internal.j.e(lifecycle, "lifecycle");
        kotlin.jvm.internal.j.e(onBackPressedCallback, "onBackPressedCallback");
        this.f10507d = c0918d;
        this.f10504a = lifecycle;
        this.f10505b = onBackPressedCallback;
        lifecycle.a(this);
    }

    @Override // e.InterfaceC0922c
    public final void cancel() {
        this.f10504a.b(this);
        this.f10505b.f16631b.remove(this);
        C0916B c0916b = this.f10506c;
        if (c0916b != null) {
            c0916b.cancel();
        }
        this.f10506c = null;
    }

    @Override // androidx.lifecycle.InterfaceC0566s
    public final void j(InterfaceC0568u interfaceC0568u, EnumC0562n enumC0562n) {
        if (enumC0562n == EnumC0562n.ON_START) {
            C0918D c0918d = this.f10507d;
            z0.D onBackPressedCallback = this.f10505b;
            kotlin.jvm.internal.j.e(onBackPressedCallback, "onBackPressedCallback");
            c0918d.f10512b.addLast(onBackPressedCallback);
            C0916B c0916b = new C0916B(c0918d, onBackPressedCallback);
            onBackPressedCallback.f16631b.add(c0916b);
            c0918d.d();
            onBackPressedCallback.f16632c = new C0917C(0, c0918d, C0918D.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
            this.f10506c = c0916b;
        } else if (enumC0562n == EnumC0562n.ON_STOP) {
            C0916B c0916b2 = this.f10506c;
            if (c0916b2 != null) {
                c0916b2.cancel();
            }
        } else if (enumC0562n == EnumC0562n.ON_DESTROY) {
            cancel();
        }
    }
}
