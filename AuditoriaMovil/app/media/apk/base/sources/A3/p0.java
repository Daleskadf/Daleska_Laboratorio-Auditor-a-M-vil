package A3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
/* loaded from: classes.dex */
public final class p0 extends o0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f181a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f181a.iterator();
        it.getClass();
        z3.k kVar = this.f182b;
        kVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (kVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, A3.o0] */
    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new o0(((SortedSet) this.f181a).headSet(obj), this.f182b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f181a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f182b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, A3.o0] */
    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new o0(((SortedSet) this.f181a).subSet(obj, obj2), this.f182b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, A3.o0] */
    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new o0(((SortedSet) this.f181a).tailSet(obj), this.f182b);
    }
}
