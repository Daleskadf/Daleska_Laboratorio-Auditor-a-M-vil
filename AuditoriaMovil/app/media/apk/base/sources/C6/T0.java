package c6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class T0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8584a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ V0 f8585b;

    public /* synthetic */ T0(V0 v02, int i7) {
        this.f8584a = i7;
        this.f8585b = v02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        switch (this.f8584a) {
            case 0:
                V0 v02 = this.f8585b;
                if (v02.f8607g.f8677E == null) {
                    AtomicReference atomicReference = v02.f8605d;
                    if (atomicReference.get() == Z0.f8671m0) {
                        atomicReference.set(null);
                    }
                    v02.f8607g.f8681I.R(Z0.f8668j0);
                    return;
                }
                return;
            case 1:
                if (this.f8585b.f8605d.get() == Z0.f8671m0) {
                    this.f8585b.f8605d.set(null);
                }
                LinkedHashSet<U0> linkedHashSet = this.f8585b.f8607g.f8677E;
                if (linkedHashSet != null) {
                    for (U0 u02 : linkedHashSet) {
                        u02.a("Channel is forcefully shutdown", null);
                    }
                }
                E.e eVar = this.f8585b.f8607g.f8681I;
                a6.o0 o0Var = Z0.f8667i0;
                eVar.R(o0Var);
                synchronized (eVar.f920b) {
                    arrayList = new ArrayList((HashSet) eVar.f921c);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0711v) it.next()).i(o0Var);
                }
                ((Z0) eVar.f923e).f8680H.d(o0Var);
                return;
            default:
                this.f8585b.f8607g.C();
                return;
        }
    }
}
