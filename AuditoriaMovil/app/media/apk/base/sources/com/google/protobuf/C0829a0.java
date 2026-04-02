package com.google.protobuf;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.apache.tika.utils.StringUtils;
/* renamed from: com.google.protobuf.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0829a0 extends AbstractC0830b implements InterfaceC0831b0, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public final List f10055b;

    static {
        new C0829a0();
    }

    public C0829a0(ArrayList arrayList) {
        super(true);
        this.f10055b = arrayList;
    }

    @Override // com.google.protobuf.U
    public final U a(int i7) {
        List list = this.f10055b;
        if (i7 >= list.size()) {
            ArrayList arrayList = new ArrayList(i7);
            arrayList.addAll(list);
            return new C0829a0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        e();
        this.f10055b.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC0830b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f10055b.size(), collection);
    }

    @Override // com.google.protobuf.InterfaceC0831b0
    public final InterfaceC0831b0 b() {
        if (this.f10056a) {
            return new T0(this);
        }
        return this;
    }

    @Override // com.google.protobuf.InterfaceC0831b0
    public final Object c(int i7) {
        return this.f10055b.get(i7);
    }

    @Override // com.google.protobuf.AbstractC0830b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.f10055b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.InterfaceC0831b0
    public final List d() {
        return DesugarCollections.unmodifiableList(this.f10055b);
    }

    @Override // com.google.protobuf.InterfaceC0831b0
    public final void g(AbstractC0852m abstractC0852m) {
        e();
        this.f10055b.add(abstractC0852m);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        String str;
        List list = this.f10055b;
        Object obj = list.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0852m) {
            AbstractC0852m abstractC0852m = (AbstractC0852m) obj;
            abstractC0852m.getClass();
            Charset charset = V.f10033a;
            if (abstractC0852m.size() == 0) {
                str = StringUtils.EMPTY;
            } else {
                str = abstractC0852m.w(charset);
            }
            if (abstractC0852m.q()) {
                list.set(i7, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, V.f10033a);
            J0 j02 = b1.f10057a;
            if (b1.f10057a.U(0, bArr, 0, bArr.length) == 0) {
                list.set(i7, str);
            }
        }
        return str;
    }

    @Override // com.google.protobuf.AbstractC0830b, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        e();
        Object remove = this.f10055b.remove(i7);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof AbstractC0852m) {
            AbstractC0852m abstractC0852m = (AbstractC0852m) remove;
            abstractC0852m.getClass();
            Charset charset = V.f10033a;
            if (abstractC0852m.size() == 0) {
                return StringUtils.EMPTY;
            }
            return abstractC0852m.w(charset);
        }
        return new String((byte[]) remove, V.f10033a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        e();
        Object obj2 = this.f10055b.set(i7, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC0852m) {
            AbstractC0852m abstractC0852m = (AbstractC0852m) obj2;
            abstractC0852m.getClass();
            Charset charset = V.f10033a;
            if (abstractC0852m.size() == 0) {
                return StringUtils.EMPTY;
            }
            return abstractC0852m.w(charset);
        }
        return new String((byte[]) obj2, V.f10033a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10055b.size();
    }

    public C0829a0() {
        super(false);
        this.f10055b = Collections.emptyList();
    }

    @Override // com.google.protobuf.AbstractC0830b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        e();
        if (collection instanceof InterfaceC0831b0) {
            collection = ((InterfaceC0831b0) collection).d();
        }
        boolean addAll = this.f10055b.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public C0829a0(int i7) {
        this(new ArrayList(i7));
    }
}
