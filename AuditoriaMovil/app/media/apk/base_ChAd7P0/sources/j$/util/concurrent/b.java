package j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class b implements Collection, Serializable {
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a  reason: collision with root package name */
    final ConcurrentHashMap f12899a;

    @Override // java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract Iterator iterator();

    @Override // java.util.Collection, java.util.Set
    public abstract boolean remove(Object obj);

    @Override // java.util.Collection
    public final Object[] toArray() {
        long j = this.f12899a.j();
        if (j < 0) {
            j = 0;
        }
        if (j > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i7 = (int) j;
        Object[] objArr = new Object[i7];
        Iterator it = iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i8 == i7) {
                if (i7 >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i9 = i7 < 1073741819 ? (i7 >>> 1) + 1 + i7 : 2147483639;
                objArr = Arrays.copyOf(objArr, i9);
                i7 = i9;
            }
            objArr[i8] = next;
            i8++;
        }
        return i8 == i7 ? objArr : Arrays.copyOf(objArr, i8);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        long j = this.f12899a.j();
        if (j < 0) {
            j = 0;
        }
        if (j > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i7 = (int) j;
        Object[] objArr2 = objArr.length >= i7 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        int length = objArr2.length;
        Iterator it = iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i8 == length) {
                if (length >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i9 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                objArr2 = Arrays.copyOf(objArr2, i9);
                length = i9;
            }
            objArr2[i8] = next;
            i8++;
        }
        if (objArr != objArr2 || i8 >= length) {
            return i8 == length ? objArr2 : Arrays.copyOf(objArr2, i8);
        }
        objArr2[i8] = null;
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ConcurrentHashMap concurrentHashMap) {
        this.f12899a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f12899a.clear();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f12899a.size();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f12899a.isEmpty();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsAll(java.util.Collection r2) {
        /*
            r1 = this;
            if (r2 == r1) goto L1a
            java.util.Iterator r2 = r2.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r2.next()
            if (r0 == 0) goto L18
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L6
        L18:
            r2 = 0
            return r2
        L1a:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.b.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        collection.getClass();
        l[] lVarArr = this.f12899a.f12886a;
        boolean z7 = false;
        if (lVarArr == null) {
            return false;
        }
        if ((collection instanceof Set) && collection.size() > lVarArr.length) {
            Iterator it = iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z7 = true;
                }
            }
        } else {
            for (Object obj : collection) {
                z7 |= remove(obj);
            }
        }
        return z7;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }
}
