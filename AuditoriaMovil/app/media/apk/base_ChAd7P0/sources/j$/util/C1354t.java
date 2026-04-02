package j$.util;

import j$.util.Collection;
import j$.util.stream.AbstractC1340x0;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
/* renamed from: j$.util.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1354t extends C1357w {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override // j$.util.C1220n, java.lang.Iterable, j$.util.Collection
    public final void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        Collection.EL.a(this.f13000a, new C1223q(consumer));
    }

    @Override // j$.util.C1220n, java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final Spliterator spliterator() {
        return new C1224s(Collection.EL.c(this.f13000a));
    }

    @Override // j$.util.C1220n, java.util.Collection, j$.util.Collection
    public final Stream stream() {
        return AbstractC1340x0.f0(spliterator(), false);
    }

    @Override // j$.util.C1220n, java.util.Collection, j$.util.Collection
    public final Stream parallelStream() {
        return AbstractC1340x0.f0(spliterator(), true);
    }

    @Override // j$.util.C1220n, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1219m(this);
    }

    @Override // j$.util.C1220n, java.util.Collection
    public final Object[] toArray() {
        Object[] array = this.f13000a.toArray();
        for (int i7 = 0; i7 < array.length; i7++) {
            array[i7] = new r((Map.Entry) array[i7]);
        }
        return array;
    }

    @Override // j$.util.C1220n, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.f13000a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i7 = 0; i7 < array.length; i7++) {
            array[i7] = new r((Map.Entry) array[i7]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }

    @Override // j$.util.C1220n, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return this.f13000a.contains(new r((Map.Entry) obj));
        }
        return false;
    }

    @Override // j$.util.C1220n, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.C1357w, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            if (set.size() != this.f13000a.size()) {
                return false;
            }
            return containsAll(set);
        }
        return false;
    }
}
