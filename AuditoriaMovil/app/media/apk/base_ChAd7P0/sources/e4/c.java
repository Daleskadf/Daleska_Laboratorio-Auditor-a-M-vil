package e4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import q4.n;
/* loaded from: classes.dex */
public abstract class c implements Iterable {
    public abstract boolean e(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!h().equals(cVar.h()) || size() != cVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = cVar.iterator();
        while (it.hasNext()) {
            if (!((Map.Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract Object f(q4.h hVar);

    public abstract Comparator h();

    public final int hashCode() {
        int hashCode = h().hashCode();
        Iterator it = iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + ((Map.Entry) it.next()).hashCode();
        }
        return hashCode;
    }

    public abstract Object i();

    public abstract boolean isEmpty();

    public abstract Object k();

    public abstract int l(n nVar);

    public abstract c m(Object obj, Object obj2);

    public abstract Iterator n(Object obj);

    public abstract c o(Object obj);

    public abstract int size();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator it = iterator();
        boolean z7 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z7) {
                z7 = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(entry.getKey());
            sb.append("=>");
            sb.append(entry.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }
}
