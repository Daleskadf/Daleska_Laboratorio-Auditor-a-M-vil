package z0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public final class K implements I {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ L f16642a;

    public K(L l8) {
        this.f16642a = l8;
    }

    @Override // z0.I
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        L l8 = this.f16642a;
        ArrayList arrayList3 = l8.f16661d;
        C2041a c2041a = (C2041a) arrayList3.get(arrayList3.size() - 1);
        l8.f16664h = c2041a;
        Iterator it = c2041a.f16728a.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = ((U) it.next()).f16716b;
            if (abstractComponentCallbacksC2061v != null) {
                abstractComponentCallbacksC2061v.f16834h0 = true;
            }
        }
        boolean R7 = l8.R(arrayList, arrayList2, -1, 0);
        if (!l8.f16668m.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(L.F((C2041a) it2.next()));
            }
            Iterator it3 = l8.f16668m.iterator();
            while (it3.hasNext()) {
                if (it3.next() == null) {
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v2 = (AbstractComponentCallbacksC2061v) it4.next();
                        throw null;
                    }
                } else {
                    throw new ClassCastException();
                }
            }
        }
        return R7;
    }
}
