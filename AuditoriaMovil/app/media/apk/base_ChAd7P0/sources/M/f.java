package M;

import a6.t0;
import g0.InterfaceC1003a;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class f implements InterfaceC1003a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3074a;

    /* renamed from: b  reason: collision with root package name */
    public Object f3075b;

    public /* synthetic */ f() {
        this.f3074a = 0;
    }

    @Override // g0.InterfaceC1003a
    public final void accept(Object obj) {
        switch (this.f3074a) {
            case 0:
                kotlin.jvm.internal.j.c((InterfaceC1003a) this.f3075b, "Listener is not set.");
                ((InterfaceC1003a) this.f3075b).accept(obj);
                return;
            case 1:
                e0.g gVar = (e0.g) obj;
                if (gVar == null) {
                    gVar = new e0.g(-3);
                }
                ((t0) this.f3075b).T(gVar);
                return;
            default:
                e0.g gVar2 = (e0.g) obj;
                synchronized (e0.h.f10607c) {
                    try {
                        S.k kVar = e0.h.f10608d;
                        ArrayList arrayList = (ArrayList) kVar.get((String) this.f3075b);
                        if (arrayList != null) {
                            kVar.remove((String) this.f3075b);
                            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                ((InterfaceC1003a) arrayList.get(i7)).accept(gVar2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ f(Object obj, int i7) {
        this.f3074a = i7;
        this.f3075b = obj;
    }
}
