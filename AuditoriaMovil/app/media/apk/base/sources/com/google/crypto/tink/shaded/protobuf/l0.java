package com.google.crypto.tink.shaded.protobuf;

import java.util.ListIterator;
/* loaded from: classes.dex */
public final class l0 implements ListIterator {

    /* renamed from: a  reason: collision with root package name */
    public ListIterator f9677a;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f9677a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9677a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f9677a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9677a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f9677a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9677a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
