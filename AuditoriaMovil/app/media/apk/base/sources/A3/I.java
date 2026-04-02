package A3;

import java.util.ListIterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class I extends t0 implements ListIterator {

    /* renamed from: a  reason: collision with root package name */
    public final int f92a;

    /* renamed from: b  reason: collision with root package name */
    public int f93b;

    /* renamed from: c  reason: collision with root package name */
    public final K f94c;

    public I(K k2, int i7) {
        int size = k2.size();
        G.i.k(i7, size);
        this.f92a = size;
        this.f93b = i7;
        this.f94c = k2;
    }

    public final Object a(int i7) {
        return this.f94c.get(i7);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f93b < this.f92a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f93b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f93b;
            this.f93b = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f93b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f93b - 1;
            this.f93b = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f93b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
