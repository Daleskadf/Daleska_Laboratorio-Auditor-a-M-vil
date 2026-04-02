package e4;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4.C1673c;
/* loaded from: classes.dex */
public final class e implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    public final c f10876a;

    public e(List list, Comparator comparator) {
        c v6;
        Map emptyMap = Collections.emptyMap();
        if (list.size() < 25) {
            Collections.sort(list, comparator);
            int size = list.size();
            Object[] objArr = new Object[size];
            Object[] objArr2 = new Object[size];
            int i7 = 0;
            for (Object obj : list) {
                objArr[i7] = obj;
                objArr2[i7] = emptyMap.get(obj);
                i7++;
            }
            v6 = new b(comparator, objArr, objArr2);
        } else {
            v6 = E.e.v(list, emptyMap, comparator);
        }
        this.f10876a = v6;
    }

    public final e e(Object obj) {
        return new e(this.f10876a.m(obj, null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f10876a.equals(((e) obj).f10876a);
    }

    public final d f(C1673c c1673c) {
        return new d(this.f10876a.n(c1673c));
    }

    public final e h(Object obj) {
        c cVar = this.f10876a;
        c o7 = cVar.o(obj);
        if (o7 == cVar) {
            return this;
        }
        return new e(o7);
    }

    public final int hashCode() {
        return this.f10876a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this.f10876a.iterator());
    }

    public e(c cVar) {
        this.f10876a = cVar;
    }
}
