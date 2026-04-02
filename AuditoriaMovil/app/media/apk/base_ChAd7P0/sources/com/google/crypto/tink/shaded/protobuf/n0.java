package com.google.crypto.tink.shaded.protobuf;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class n0 extends AbstractList implements I, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final H f9682a;

    public n0(H h8) {
        this.f9682a = h8;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final I b() {
        return this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final Object c(int i7) {
        return this.f9682a.f9601b.get(i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final List d() {
        return DesugarCollections.unmodifiableList(this.f9682a.f9601b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return (String) this.f9682a.get(i7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.m0, java.util.Iterator, java.lang.Object] */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        ?? obj = new Object();
        obj.f9679a = this.f9682a.iterator();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void j(AbstractC0781h abstractC0781h) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.l0, java.util.ListIterator, java.lang.Object] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        ?? obj = new Object();
        obj.f9677a = this.f9682a.listIterator(i7);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9682a.size();
    }
}
