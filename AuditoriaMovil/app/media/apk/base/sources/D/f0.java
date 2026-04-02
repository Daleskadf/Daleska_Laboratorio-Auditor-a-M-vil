package D;

import androidx.camera.core.impl.AbstractC0508j;
import androidx.camera.core.impl.InterfaceC0515q;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class f0 extends AbstractC0508j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f698a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f699b;

    public /* synthetic */ f0(Object obj, int i7) {
        this.f698a = i7;
        this.f699b = obj;
    }

    @Override // androidx.camera.core.impl.AbstractC0508j
    public void b(int i7, InterfaceC0515q interfaceC0515q) {
        switch (this.f698a) {
            case 0:
                g0 g0Var = (g0) this.f699b;
                synchronized (g0Var.f705a) {
                    try {
                        if (!g0Var.f709e) {
                            g0Var.f704Z.put(interfaceC0515q.b(), new I.c(interfaceC0515q));
                            g0Var.f();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 1:
            default:
                return;
            case 2:
                Iterator it = ((Q.g) this.f699b).f4122a.iterator();
                while (it.hasNext()) {
                    androidx.camera.core.impl.o0 o0Var = ((y0) it.next()).f809m;
                    for (AbstractC0508j abstractC0508j : o0Var.f7656g.f7538d) {
                        abstractC0508j.b(i7, new Q.h(interfaceC0515q, o0Var.f7656g.f, -1L));
                    }
                }
                return;
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0508j
    public void d(int i7) {
        switch (this.f698a) {
            case 1:
                j3.f.C().execute(new C.b(this, 3));
                return;
            default:
                return;
        }
    }
}
