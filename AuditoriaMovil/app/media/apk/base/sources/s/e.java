package S;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class e implements Collection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f4820a;

    public e(f fVar) {
        this.f4820a = fVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f4820a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f4820a.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f4820a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f4820a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f4820a;
        int a7 = fVar.a(obj);
        if (a7 >= 0) {
            fVar.f(a7);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        f fVar = this.f4820a;
        int i7 = fVar.f4834c;
        int i8 = 0;
        boolean z7 = false;
        while (i8 < i7) {
            if (collection.contains(fVar.h(i8))) {
                fVar.f(i8);
                i8--;
                i7--;
                z7 = true;
            }
            i8++;
        }
        return z7;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        f fVar = this.f4820a;
        int i7 = fVar.f4834c;
        int i8 = 0;
        boolean z7 = false;
        while (i8 < i7) {
            if (!collection.contains(fVar.h(i8))) {
                fVar.f(i8);
                i8--;
                i7--;
                z7 = true;
            }
            i8++;
        }
        return z7;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f4820a.f4834c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        f fVar = this.f4820a;
        int i7 = fVar.f4834c;
        Object[] objArr = new Object[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = fVar.h(i8);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f4820a;
        int i7 = fVar.f4834c;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = fVar.h(i8);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
