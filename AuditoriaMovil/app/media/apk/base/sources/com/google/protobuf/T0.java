package com.google.protobuf;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class T0 extends AbstractList implements InterfaceC0831b0, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final C0829a0 f10032a;

    public T0(C0829a0 c0829a0) {
        this.f10032a = c0829a0;
    }

    @Override // com.google.protobuf.InterfaceC0831b0
    public final InterfaceC0831b0 b() {
        return this;
    }

    @Override // com.google.protobuf.InterfaceC0831b0
    public final Object c(int i7) {
        return this.f10032a.f10055b.get(i7);
    }

    @Override // com.google.protobuf.InterfaceC0831b0
    public final List d() {
        return DesugarCollections.unmodifiableList(this.f10032a.f10055b);
    }

    @Override // com.google.protobuf.InterfaceC0831b0
    public final void g(AbstractC0852m abstractC0852m) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return (String) this.f10032a.get(i7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, java.lang.Object, com.google.protobuf.S0] */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        ?? obj = new Object();
        obj.f10031a = this.f10032a.iterator();
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ListIterator, java.lang.Object, com.google.protobuf.R0] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        ?? obj = new Object();
        obj.f10030a = this.f10032a.listIterator(i7);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10032a.f10055b.size();
    }
}
