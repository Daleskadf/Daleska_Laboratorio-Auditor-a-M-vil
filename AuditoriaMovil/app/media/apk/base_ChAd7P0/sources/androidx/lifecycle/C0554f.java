package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
/* renamed from: androidx.lifecycle.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0554f implements InterfaceC0566s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7936a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7937b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7938c;

    public C0554f(DefaultLifecycleObserver defaultLifecycleObserver, InterfaceC0566s interfaceC0566s) {
        kotlin.jvm.internal.j.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f7937b = defaultLifecycleObserver;
        this.f7938c = interfaceC0566s;
    }

    @Override // androidx.lifecycle.InterfaceC0566s
    public final void j(InterfaceC0568u interfaceC0568u, EnumC0562n enumC0562n) {
        switch (this.f7936a) {
            case 0:
                int i7 = AbstractC0553e.f7935a[enumC0562n.ordinal()];
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.f7937b;
                switch (i7) {
                    case 1:
                        defaultLifecycleObserver.g(interfaceC0568u);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(interfaceC0568u);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(interfaceC0568u);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(interfaceC0568u);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(interfaceC0568u);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(interfaceC0568u);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0566s interfaceC0566s = (InterfaceC0566s) this.f7938c;
                if (interfaceC0566s != null) {
                    interfaceC0566s.j(interfaceC0568u, enumC0562n);
                    return;
                }
                return;
            case 1:
                if (enumC0562n == EnumC0562n.ON_START) {
                    ((AbstractC0564p) this.f7937b).b(this);
                    ((K5.s) this.f7938c).e();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0550b) this.f7938c).f7928a;
                InterfaceC0567t interfaceC0567t = (InterfaceC0567t) this.f7937b;
                C0550b.a((List) hashMap.get(enumC0562n), interfaceC0568u, enumC0562n, interfaceC0567t);
                C0550b.a((List) hashMap.get(EnumC0562n.ON_ANY), interfaceC0568u, enumC0562n, interfaceC0567t);
                return;
        }
    }

    public C0554f(InterfaceC0567t interfaceC0567t) {
        this.f7937b = interfaceC0567t;
        C0552d c0552d = C0552d.f7932c;
        Class<?> cls = interfaceC0567t.getClass();
        C0550b c0550b = (C0550b) c0552d.f7933a.get(cls);
        this.f7938c = c0550b == null ? c0552d.a(cls, null) : c0550b;
    }

    public C0554f(K5.s sVar, AbstractC0564p abstractC0564p) {
        this.f7937b = abstractC0564p;
        this.f7938c = sVar;
    }
}
