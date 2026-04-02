package com.google.protobuf;

import java.util.ListIterator;
/* loaded from: classes.dex */
public final class R0 implements ListIterator {

    /* renamed from: a  reason: collision with root package name */
    public ListIterator f10030a;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f10030a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f10030a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f10030a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f10030a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f10030a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f10030a.previousIndex();
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
