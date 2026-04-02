package A4;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f214a;

    /* renamed from: b  reason: collision with root package name */
    public final c f215b;

    public b(Set set, c cVar) {
        this.f214a = b(set);
        this.f215b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f212a);
            sb.append('/');
            sb.append(aVar.f213b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        c cVar = this.f215b;
        synchronized (((HashSet) cVar.f218b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f218b);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f214a;
        if (isEmpty) {
            return str;
        }
        return str + ' ' + b(cVar.q());
    }
}
