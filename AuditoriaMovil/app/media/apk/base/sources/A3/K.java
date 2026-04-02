package A3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public abstract class K extends F implements List, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public static final I f98b = new I(e0.f138e, 0);

    public static e0 n(int i7, Object[] objArr) {
        if (i7 == 0) {
            return e0.f138e;
        }
        return new e0(objArr, i7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A3.H, A3.E] */
    public static H o() {
        return new E(4);
    }

    public static K p(Collection collection) {
        if (collection instanceof F) {
            K e7 = ((F) collection).e();
            if (e7.l()) {
                Object[] array = e7.toArray(F.f89a);
                return n(array.length, array);
            }
            return e7;
        }
        Object[] array2 = collection.toArray();
        AbstractC0021t.c(array2.length, array2);
        return n(array2.length, array2);
    }

    public static e0 q(Object[] objArr) {
        if (objArr.length == 0) {
            return e0.f138e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC0021t.c(objArr2.length, objArr2);
        return n(objArr2.length, objArr2);
    }

    public static e0 s() {
        return e0.f138e;
    }

    public static e0 t(Long l8, Long l9, Long l10, Long l11, Long l12) {
        Object[] objArr = {l8, l9, l10, l11, l12};
        AbstractC0021t.c(5, objArr);
        return n(5, objArr);
    }

    public static e0 u(Object obj) {
        Object[] objArr = {obj};
        AbstractC0021t.c(1, objArr);
        return n(1, objArr);
    }

    public static e0 v(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC0021t.c(2, objArr);
        return n(2, objArr);
    }

    public static e0 w(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        AbstractC0021t.c(3, objArr);
        return n(3, objArr);
    }

    public static e0 x(d0 d0Var, Collection collection) {
        d0Var.getClass();
        if (!(collection instanceof Collection)) {
            Iterator it = collection.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collection = arrayList;
        }
        Object[] array = collection.toArray();
        AbstractC0021t.c(array.length, array);
        Arrays.sort(array, d0Var);
        return n(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // A3.F, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i7 = 0; i7 < size; i7++) {
                        if (F.f.l(get(i7), list.get(i7))) {
                        }
                    }
                    return true;
                }
                Iterator it = list.iterator();
                for (Object obj2 : this) {
                    if (it.hasNext()) {
                        if (!F.f.l(obj2, it.next())) {
                        }
                    }
                }
                return !it.hasNext();
            }
        }
        return false;
    }

    @Override // A3.F
    public int f(int i7, Object[] objArr) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = get(i8);
        }
        return i7 + size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = ~(~(get(i8).hashCode() + (i7 * 31)));
        }
        return i7;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
            }
        }
        return -1;
    }

    @Override // A3.F, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // A3.F
    public final t0 m() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: r */
    public final I listIterator(int i7) {
        G.i.k(i7, size());
        if (isEmpty()) {
            return f98b;
        }
        return new I(this, i7);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: y */
    public K subList(int i7, int i8) {
        G.i.l(i7, i8, size());
        int i9 = i8 - i7;
        if (i9 == size()) {
            return this;
        }
        if (i9 == 0) {
            return e0.f138e;
        }
        return new J(this, i7, i9);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // A3.F
    public final K e() {
        return this;
    }
}
