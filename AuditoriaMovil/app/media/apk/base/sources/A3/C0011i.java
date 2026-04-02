package A3;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
/* renamed from: A3.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011i extends C0014l implements NavigableSet {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b0 f153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0011i(b0 b0Var, NavigableMap navigableMap) {
        super(b0Var, navigableMap);
        this.f153d = b0Var;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return e().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C0009g) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C0011i(this.f153d, e().descendingMap());
    }

    @Override // A3.C0014l
    /* renamed from: f */
    public final NavigableMap e() {
        return (NavigableMap) ((SortedMap) this.f146a);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return e().floorKey(obj);
    }

    @Override // A3.C0014l, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return e().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return e().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C0007e c0007e = (C0007e) iterator();
        if (c0007e.hasNext()) {
            Object next = c0007e.next();
            c0007e.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (descendingIterator.hasNext()) {
            Object next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }
        return null;
    }

    @Override // A3.C0014l, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // A3.C0014l, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z7) {
        return new C0011i(this.f153d, e().headMap(obj, z7));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z7, Object obj2, boolean z8) {
        return new C0011i(this.f153d, e().subMap(obj, z7, obj2, z8));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z7) {
        return new C0011i(this.f153d, e().tailMap(obj, z7));
    }
}
