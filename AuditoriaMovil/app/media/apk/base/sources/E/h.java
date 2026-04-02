package e;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0562n;
import androidx.lifecycle.InterfaceC0566s;
import androidx.lifecycle.InterfaceC0568u;
import z0.AbstractActivityC2064y;
/* loaded from: classes.dex */
public final /* synthetic */ class h implements InterfaceC0566s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0918D f10530a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2064y f10531b;

    public /* synthetic */ h(C0918D c0918d, AbstractActivityC2064y abstractActivityC2064y) {
        this.f10530a = c0918d;
        this.f10531b = abstractActivityC2064y;
    }

    @Override // androidx.lifecycle.InterfaceC0566s
    public final void j(InterfaceC0568u interfaceC0568u, EnumC0562n enumC0562n) {
        C0918D c0918d = this.f10530a;
        AbstractActivityC2064y abstractActivityC2064y = this.f10531b;
        if (enumC0562n == EnumC0562n.ON_CREATE) {
            OnBackInvokedDispatcher invoker = i.f10532a.a(abstractActivityC2064y);
            kotlin.jvm.internal.j.e(invoker, "invoker");
            c0918d.f10515e = invoker;
            c0918d.c(c0918d.f10516g);
        }
    }
}
