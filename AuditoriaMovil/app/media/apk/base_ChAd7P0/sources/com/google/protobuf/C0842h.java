package com.google.protobuf;

import java.util.NoSuchElementException;
/* renamed from: com.google.protobuf.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0842h extends AbstractC0844i {

    /* renamed from: a  reason: collision with root package name */
    public int f10069a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f10070b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC0852m f10071c;

    public C0842h(AbstractC0852m abstractC0852m) {
        this.f10071c = abstractC0852m;
        this.f10070b = abstractC0852m.size();
    }

    @Override // com.google.protobuf.AbstractC0844i
    public final byte a() {
        int i7 = this.f10069a;
        if (i7 < this.f10070b) {
            this.f10069a = i7 + 1;
            return this.f10071c.o(i7);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f10069a < this.f10070b) {
            return true;
        }
        return false;
    }
}
