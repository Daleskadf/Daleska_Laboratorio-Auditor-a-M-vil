package e;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import m6.AbstractC1447h;
import m6.AbstractC1453n;
import m6.C1445f;
import z0.C2053m;
import z0.K;
import z0.L;
import z0.X;
import z0.Y;
/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.k implements w6.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10577a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0918D f10578b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(C0918D c0918d, int i7) {
        super(1);
        this.f10577a = i7;
        this.f10578b = c0918d;
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f10577a) {
            case 0:
                kotlin.jvm.internal.j.e((C0921b) obj, "backEvent");
                C0918D c0918d = this.f10578b;
                C1445f c1445f = c0918d.f10512b;
                c1445f.getClass();
                ListIterator listIterator = c1445f.listIterator(c1445f.f14072c);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((z0.D) obj2).f16630a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                z0.D d7 = (z0.D) obj2;
                if (c0918d.f10513c != null) {
                    c0918d.a();
                }
                c0918d.f10513c = d7;
                if (d7 != null) {
                    boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                    L l8 = d7.f16633d;
                    if (isLoggable) {
                        Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + l8);
                    }
                    l8.x();
                    l8.y(new K(l8), false);
                }
                return l6.j.f13876a;
            default:
                C0921b backEvent = (C0921b) obj;
                kotlin.jvm.internal.j.e(backEvent, "backEvent");
                C0918D c0918d2 = this.f10578b;
                z0.D d8 = c0918d2.f10513c;
                if (d8 == null) {
                    C1445f c1445f2 = c0918d2.f10512b;
                    c1445f2.getClass();
                    ListIterator listIterator2 = c1445f2.listIterator(c1445f2.f14072c);
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((z0.D) obj3).f16630a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    d8 = (z0.D) obj3;
                }
                if (d8 != null) {
                    boolean isLoggable2 = Log.isLoggable("FragmentManager", 2);
                    L l9 = d8.f16633d;
                    if (isLoggable2) {
                        Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + l9);
                    }
                    if (l9.f16664h != null) {
                        Iterator it = l9.f(new ArrayList(Collections.singletonList(l9.f16664h)), 0, 1).iterator();
                        while (it.hasNext()) {
                            C2053m c2053m = (C2053m) it.next();
                            c2053m.getClass();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.f10520c);
                            }
                            ArrayList arrayList = c2053m.f16778c;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                ((Y) it2.next()).getClass();
                                AbstractC1453n.N(arrayList2, null);
                            }
                            List Y3 = AbstractC1447h.Y(AbstractC1447h.b0(arrayList2));
                            int size = Y3.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                ((X) Y3.get(i7)).b(backEvent, c2053m.f16776a);
                            }
                        }
                        Iterator it3 = l9.f16668m.iterator();
                        if (it3.hasNext()) {
                            it3.next().getClass();
                            throw new ClassCastException();
                        }
                    }
                }
                return l6.j.f13876a;
        }
    }
}
