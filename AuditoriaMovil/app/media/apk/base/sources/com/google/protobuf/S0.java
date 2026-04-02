package com.google.protobuf;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class S0 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public Iterator f10031a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10031a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f10031a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
