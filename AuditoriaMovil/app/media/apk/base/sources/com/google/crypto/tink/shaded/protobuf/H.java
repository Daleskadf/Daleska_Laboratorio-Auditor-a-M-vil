package com.google.crypto.tink.shaded.protobuf;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class H extends AbstractC0775b implements I, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f9601b;

    static {
        new H(10).f9632a = false;
    }

    public H(int i7) {
        this(new ArrayList(i7));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C
    public final C a(int i7) {
        ArrayList arrayList = this.f9601b;
        if (i7 >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i7);
            arrayList2.addAll(arrayList);
            return new H(arrayList2);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        e();
        this.f9601b.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0775b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f9601b.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final I b() {
        if (this.f9632a) {
            return new n0(this);
        }
        return this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final Object c(int i7) {
        return this.f9601b.get(i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0775b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.f9601b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final List d() {
        return DesugarCollections.unmodifiableList(this.f9601b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        String str;
        ArrayList arrayList = this.f9601b;
        Object obj = arrayList.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0781h) {
            AbstractC0781h abstractC0781h = (AbstractC0781h) obj;
            abstractC0781h.getClass();
            Charset charset = D.f9598a;
            if (abstractC0781h.size() == 0) {
                str = StringUtils.EMPTY;
            } else {
                C0780g c0780g = (C0780g) abstractC0781h;
                str = new String(c0780g.f9647d, c0780g.l(), c0780g.size(), charset);
            }
            C0780g c0780g2 = (C0780g) abstractC0781h;
            int l8 = c0780g2.l();
            if (v0.f9700a.K(c0780g2.f9647d, l8, c0780g2.size() + l8) == 0) {
                arrayList.set(i7, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, D.f9598a);
            org.slf4j.helpers.i iVar = v0.f9700a;
            if (v0.f9700a.K(bArr, 0, bArr.length) == 0) {
                arrayList.set(i7, str);
            }
        }
        return str;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void j(AbstractC0781h abstractC0781h) {
        e();
        this.f9601b.add(abstractC0781h);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0775b, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        e();
        Object remove = this.f9601b.remove(i7);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof AbstractC0781h) {
            AbstractC0781h abstractC0781h = (AbstractC0781h) remove;
            abstractC0781h.getClass();
            Charset charset = D.f9598a;
            if (abstractC0781h.size() == 0) {
                return StringUtils.EMPTY;
            }
            C0780g c0780g = (C0780g) abstractC0781h;
            return new String(c0780g.f9647d, c0780g.l(), c0780g.size(), charset);
        }
        return new String((byte[]) remove, D.f9598a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        e();
        Object obj2 = this.f9601b.set(i7, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC0781h) {
            AbstractC0781h abstractC0781h = (AbstractC0781h) obj2;
            abstractC0781h.getClass();
            Charset charset = D.f9598a;
            if (abstractC0781h.size() == 0) {
                return StringUtils.EMPTY;
            }
            C0780g c0780g = (C0780g) abstractC0781h;
            return new String(c0780g.f9647d, c0780g.l(), c0780g.size(), charset);
        }
        return new String((byte[]) obj2, D.f9598a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9601b.size();
    }

    public H(ArrayList arrayList) {
        this.f9601b = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0775b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        e();
        if (collection instanceof I) {
            collection = ((I) collection).d();
        }
        boolean addAll = this.f9601b.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
