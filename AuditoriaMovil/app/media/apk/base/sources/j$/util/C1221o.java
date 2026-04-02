package j$.util;

import java.util.ListIterator;
import java.util.function.Consumer;
/* renamed from: j$.util.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1221o implements ListIterator, A {

    /* renamed from: a  reason: collision with root package name */
    private final ListIterator f13001a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1221o(C1222p c1222p, int i7) {
        this.f13001a = c1222p.f13002b.listIterator(i7);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f13001a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f13001a.next();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13001a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f13001a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13001a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13001a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, j$.util.A
    public final void forEachRemaining(Consumer consumer) {
        AbstractC1210d.q(this.f13001a, consumer);
    }
}
