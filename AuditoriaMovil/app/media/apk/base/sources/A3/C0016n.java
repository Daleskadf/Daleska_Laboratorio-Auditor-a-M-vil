package A3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: A3.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0016n extends AbstractCollection implements List {

    /* renamed from: a  reason: collision with root package name */
    public final Object f174a;

    /* renamed from: b  reason: collision with root package name */
    public Collection f175b;

    /* renamed from: c  reason: collision with root package name */
    public final C0016n f176c;

    /* renamed from: d  reason: collision with root package name */
    public final Collection f177d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b0 f178e;
    public final /* synthetic */ b0 f;

    public C0016n(b0 b0Var, Object obj, List list, C0016n c0016n) {
        Collection collection;
        this.f = b0Var;
        this.f178e = b0Var;
        this.f174a = obj;
        this.f175b = list;
        this.f176c = c0016n;
        if (c0016n == null) {
            collection = null;
        } else {
            collection = c0016n.f175b;
        }
        this.f177d = collection;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        boolean isEmpty = this.f175b.isEmpty();
        boolean add = this.f175b.add(obj);
        if (add) {
            this.f178e.f126e++;
            if (isEmpty) {
                e();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f175b.addAll(collection);
        if (addAll) {
            this.f178e.f126e += this.f175b.size() - size;
            if (size == 0) {
                e();
            }
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f175b.clear();
        this.f178e.f126e -= size;
        h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        f();
        return this.f175b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        f();
        return this.f175b.containsAll(collection);
    }

    public final void e() {
        C0016n c0016n = this.f176c;
        if (c0016n != null) {
            c0016n.e();
        } else {
            this.f178e.f125d.put(this.f174a, this.f175b);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        f();
        return this.f175b.equals(obj);
    }

    public final void f() {
        Collection collection;
        C0016n c0016n = this.f176c;
        if (c0016n != null) {
            c0016n.f();
            if (c0016n.f175b != this.f177d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f175b.isEmpty() && (collection = (Collection) this.f178e.f125d.get(this.f174a)) != null) {
            this.f175b = collection;
        }
    }

    @Override // java.util.List
    public final Object get(int i7) {
        f();
        return ((List) this.f175b).get(i7);
    }

    public final void h() {
        C0016n c0016n = this.f176c;
        if (c0016n != null) {
            c0016n.h();
        } else if (this.f175b.isEmpty()) {
            this.f178e.f125d.remove(this.f174a);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        return this.f175b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        f();
        return ((List) this.f175b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        f();
        return new C0007e(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        return ((List) this.f175b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        f();
        return new C0015m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        f();
        boolean remove = this.f175b.remove(obj);
        if (remove) {
            b0 b0Var = this.f178e;
            b0Var.f126e--;
            h();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f175b.removeAll(collection);
        if (removeAll) {
            this.f178e.f126e += this.f175b.size() - size;
            h();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f175b.retainAll(collection);
        if (retainAll) {
            this.f178e.f126e += this.f175b.size() - size;
            h();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        f();
        return ((List) this.f175b).set(i7, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        f();
        return this.f175b.size();
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        f();
        List subList = ((List) this.f175b).subList(i7, i8);
        C0016n c0016n = this.f176c;
        if (c0016n == null) {
            c0016n = this;
        }
        b0 b0Var = this.f;
        b0Var.getClass();
        boolean z7 = subList instanceof RandomAccess;
        Object obj = this.f174a;
        if (z7) {
            return new C0016n(b0Var, obj, subList, c0016n);
        }
        return new C0016n(b0Var, obj, subList, c0016n);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return this.f175b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        f();
        return new C0015m(this, i7);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        f();
        Object remove = ((List) this.f175b).remove(i7);
        b0 b0Var = this.f;
        b0Var.f126e--;
        h();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        f();
        boolean isEmpty = this.f175b.isEmpty();
        ((List) this.f175b).add(i7, obj);
        this.f.f126e++;
        if (isEmpty) {
            e();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f175b).addAll(i7, collection);
        if (addAll) {
            this.f.f126e += this.f175b.size() - size;
            if (size == 0) {
                e();
            }
        }
        return addAll;
    }
}
