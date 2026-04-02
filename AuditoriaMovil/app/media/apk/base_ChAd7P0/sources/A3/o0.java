package A3;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
/* loaded from: classes.dex */
public class o0 extends AbstractCollection implements Set {

    /* renamed from: a  reason: collision with root package name */
    public final Set f181a;

    /* renamed from: b  reason: collision with root package name */
    public final z3.k f182b;

    public o0(Set set, z3.k kVar) {
        this.f181a = set;
        this.f182b = kVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        G.i.g(this.f182b.apply(obj));
        return this.f181a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            G.i.g(this.f182b.apply(obj));
        }
        return this.f181a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f181a;
        boolean z7 = set instanceof RandomAccess;
        z3.k kVar = this.f182b;
        if (z7 && (set instanceof List)) {
            List list = (List) set;
            kVar.getClass();
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                Object obj = list.get(i8);
                if (!kVar.apply(obj)) {
                    if (i8 > i7) {
                        try {
                            list.set(i7, obj);
                        } catch (IllegalArgumentException unused) {
                            AbstractC0021t.r(list, kVar, i7, i8);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            AbstractC0021t.r(list, kVar, i7, i8);
                            return;
                        }
                    }
                    i7++;
                }
            }
            list.subList(i7, list.size()).clear();
            return;
        }
        Iterator it = set.iterator();
        kVar.getClass();
        while (it.hasNext()) {
            if (kVar.apply(it.next())) {
                it.remove();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z7;
        Set set = this.f181a;
        set.getClass();
        try {
            z7 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z7 = false;
        }
        if (!z7) {
            return false;
        }
        return this.f182b.apply(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return AbstractC0021t.i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC0021t.m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f181a.iterator();
        z3.k kVar = this.f182b;
        G.i.j(kVar, "predicate");
        boolean z7 = false;
        int i7 = 0;
        while (true) {
            if (it.hasNext()) {
                if (kVar.apply(it.next())) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 != -1) {
            z7 = true;
        }
        return true ^ z7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f181a.iterator();
        it.getClass();
        z3.k kVar = this.f182b;
        kVar.getClass();
        return new Q(it, kVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f181a.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f181a.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f182b.apply(next) && collection.contains(next)) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f181a.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f182b.apply(next) && !collection.contains(next)) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i7 = 0;
        for (Object obj : this.f181a) {
            if (this.f182b.apply(obj)) {
                i7++;
            }
        }
        return i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            Q q2 = (Q) it;
            if (q2.hasNext()) {
                arrayList.add(q2.next());
            } else {
                return arrayList.toArray();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            Q q2 = (Q) it;
            if (q2.hasNext()) {
                arrayList.add(q2.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
