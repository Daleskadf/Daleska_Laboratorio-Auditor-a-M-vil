package R;

import F3.o;
import androidx.lifecycle.E;
import androidx.lifecycle.EnumC0562n;
import androidx.lifecycle.InterfaceC0567t;
import androidx.lifecycle.InterfaceC0568u;
import java.util.HashMap;
import java.util.Set;
/* loaded from: classes.dex */
public final class c implements InterfaceC0567t {

    /* renamed from: a  reason: collision with root package name */
    public final o f4510a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0568u f4511b;

    public c(InterfaceC0568u interfaceC0568u, o oVar) {
        this.f4511b = interfaceC0568u;
        this.f4510a = oVar;
    }

    @E(EnumC0562n.ON_DESTROY)
    public void onDestroy(InterfaceC0568u interfaceC0568u) {
        o oVar = this.f4510a;
        synchronized (oVar.f1178b) {
            try {
                c l8 = oVar.l(interfaceC0568u);
                if (l8 != null) {
                    oVar.u(interfaceC0568u);
                    for (a aVar : (Set) ((HashMap) oVar.f1180d).get(l8)) {
                        ((HashMap) oVar.f1179c).remove(aVar);
                    }
                    ((HashMap) oVar.f1180d).remove(l8);
                    l8.f4511b.h().b(l8);
                }
            } finally {
            }
        }
    }

    @E(EnumC0562n.ON_START)
    public void onStart(InterfaceC0568u interfaceC0568u) {
        this.f4510a.t(interfaceC0568u);
    }

    @E(EnumC0562n.ON_STOP)
    public void onStop(InterfaceC0568u interfaceC0568u) {
        this.f4510a.u(interfaceC0568u);
    }
}
