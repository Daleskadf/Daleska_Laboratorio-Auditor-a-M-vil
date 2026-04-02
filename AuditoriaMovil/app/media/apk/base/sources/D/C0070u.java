package D;

import androidx.camera.core.impl.InterfaceC0519v;
import androidx.camera.core.impl.InterfaceC0521x;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* renamed from: D.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070u {

    /* renamed from: b  reason: collision with root package name */
    public static final C0070u f779b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0070u f780c;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f781a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new androidx.camera.core.impl.U(0));
        f779b = new C0070u(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new androidx.camera.core.impl.U(1));
        f780c = new C0070u(linkedHashSet2);
    }

    public C0070u(LinkedHashSet linkedHashSet) {
        this.f781a = linkedHashSet;
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = this.f781a.iterator();
        while (it.hasNext()) {
            List<InterfaceC0519v> unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            androidx.camera.core.impl.U u7 = (androidx.camera.core.impl.U) ((InterfaceC0069t) it.next());
            u7.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (InterfaceC0519v interfaceC0519v : unmodifiableList) {
                g0.c.a("The camera info doesn't contain internal implementation.", interfaceC0519v instanceof InterfaceC0519v);
                if (interfaceC0519v.b() == u7.f7587b) {
                    arrayList3.add(interfaceC0519v);
                }
            }
            arrayList2 = arrayList3;
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Iterator it = this.f781a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            InterfaceC0069t interfaceC0069t = (InterfaceC0069t) it.next();
            if (interfaceC0069t instanceof androidx.camera.core.impl.U) {
                Integer valueOf = Integer.valueOf(((androidx.camera.core.impl.U) interfaceC0069t).f7587b);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final InterfaceC0521x c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC0521x) it.next()).a());
        }
        ArrayList a7 = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            InterfaceC0521x interfaceC0521x = (InterfaceC0521x) it2.next();
            if (a7.contains(interfaceC0521x.a())) {
                linkedHashSet2.add(interfaceC0521x);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (InterfaceC0521x) it3.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
