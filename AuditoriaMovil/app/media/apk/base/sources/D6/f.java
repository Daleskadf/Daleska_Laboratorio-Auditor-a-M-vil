package D6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m6.p;
/* loaded from: classes.dex */
public abstract class f extends g {
    public static List H(d dVar) {
        kotlin.jvm.internal.j.e(dVar, "<this>");
        Iterator it = dVar.iterator();
        if (!it.hasNext()) {
            return p.f14074a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return G.i.A(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
