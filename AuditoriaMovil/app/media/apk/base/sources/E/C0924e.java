package e;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0562n;
import androidx.lifecycle.InterfaceC0566s;
import androidx.lifecycle.InterfaceC0568u;
import z0.AbstractActivityC2064y;
/* renamed from: e.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0924e implements InterfaceC0566s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10524a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10525b;

    public /* synthetic */ C0924e(Object obj, int i7) {
        this.f10524a = i7;
        this.f10525b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0566s
    public final void j(InterfaceC0568u interfaceC0568u, EnumC0562n enumC0562n) {
        Window window;
        View peekDecorView;
        switch (this.f10524a) {
            case 0:
                AbstractActivityC2064y abstractActivityC2064y = (AbstractActivityC2064y) this.f10525b;
                if (enumC0562n == EnumC0562n.ON_STOP && (window = abstractActivityC2064y.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    return;
                }
                return;
            case 1:
                AbstractActivityC2064y abstractActivityC2064y2 = (AbstractActivityC2064y) this.f10525b;
                if (enumC0562n == EnumC0562n.ON_DESTROY) {
                    abstractActivityC2064y2.f10551b.f8441a = null;
                    if (!abstractActivityC2064y2.isChangingConfigurations()) {
                        abstractActivityC2064y2.g().a();
                    }
                    k kVar = abstractActivityC2064y2.f;
                    AbstractActivityC2064y abstractActivityC2064y3 = kVar.f10537d;
                    abstractActivityC2064y3.getWindow().getDecorView().removeCallbacks(kVar);
                    abstractActivityC2064y3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                    return;
                }
                return;
            default:
                K5.s this$0 = (K5.s) this.f10525b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                if (enumC0562n == EnumC0562n.ON_START) {
                    this$0.f2737c = true;
                    return;
                } else if (enumC0562n == EnumC0562n.ON_STOP) {
                    this$0.f2737c = false;
                    return;
                } else {
                    return;
                }
        }
    }
}
