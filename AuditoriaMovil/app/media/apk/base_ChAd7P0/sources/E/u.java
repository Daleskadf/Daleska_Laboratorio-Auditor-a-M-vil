package e;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0562n;
import androidx.lifecycle.InterfaceC0566s;
import androidx.lifecycle.InterfaceC0568u;
/* loaded from: classes.dex */
public final class u implements InterfaceC0566s {

    /* renamed from: b  reason: collision with root package name */
    public static final l6.g f10575b = m5.d.m(r.f10570a);

    /* renamed from: a  reason: collision with root package name */
    public final n f10576a;

    public u(n nVar) {
        this.f10576a = nVar;
    }

    @Override // androidx.lifecycle.InterfaceC0566s
    public final void j(InterfaceC0568u interfaceC0568u, EnumC0562n enumC0562n) {
        if (enumC0562n != EnumC0562n.ON_DESTROY) {
            return;
        }
        Object systemService = this.f10576a.getSystemService("input_method");
        kotlin.jvm.internal.j.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        q qVar = (q) f10575b.a();
        Object b5 = qVar.b(inputMethodManager);
        if (b5 == null) {
            return;
        }
        synchronized (b5) {
            View c8 = qVar.c(inputMethodManager);
            if (c8 == null) {
                return;
            }
            if (c8.isAttachedToWindow()) {
                return;
            }
            boolean a7 = qVar.a(inputMethodManager);
            if (a7) {
                inputMethodManager.isActive();
            }
        }
    }
}
