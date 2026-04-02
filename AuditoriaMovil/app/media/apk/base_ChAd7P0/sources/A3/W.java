package A3;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class W extends AbstractSequentialList implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractCollection f120a;

    /* renamed from: b  reason: collision with root package name */
    public final z3.i f121b;

    public W(List list, z3.i iVar) {
        list.getClass();
        this.f120a = (AbstractCollection) list;
        this.f121b = iVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new U(this, this.f120a.listIterator(i7), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        this.f120a.subList(i7, i8).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f120a.size();
    }
}
