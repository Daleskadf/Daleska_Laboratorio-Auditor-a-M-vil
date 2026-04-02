package com.google.protobuf;

import java.util.Iterator;
/* renamed from: com.google.protobuf.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0844i implements Iterator {
    public abstract byte a();

    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
