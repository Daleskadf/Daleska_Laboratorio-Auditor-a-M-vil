package A3;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
/* renamed from: A3.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0018p extends AbstractCollection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f183a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f184b;

    public /* synthetic */ C0018p(int i7, Serializable serializable) {
        this.f183a = i7;
        this.f184b = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f183a) {
            case 0:
                ((b0) this.f184b).c();
                return;
            case 1:
                ((C0025x) this.f184b).clear();
                return;
            default:
                ((C0008f) this.f184b).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f183a) {
            case 0:
                return ((b0) this.f184b).b(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((C0008f) this.f184b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f183a) {
            case 2:
                return ((C0008f) this.f184b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f183a) {
            case 0:
                return new C0005c((b0) this.f184b);
            case 1:
                C0025x c0025x = (C0025x) this.f184b;
                Map c8 = c0025x.c();
                if (c8 != null) {
                    return c8.values().iterator();
                }
                return new C0022u(c0025x, 2);
            default:
                return new s0(((C0008f) this.f184b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f183a) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C0008f c0008f = (C0008f) this.f184b;
                    for (Map.Entry entry : c0008f.entrySet()) {
                        if (F.f.l(obj, entry.getValue())) {
                            c0008f.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f183a) {
            case 2:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0008f c0008f = (C0008f) this.f184b;
                    for (Map.Entry entry : c0008f.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0008f.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f183a) {
            case 2:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0008f c0008f = (C0008f) this.f184b;
                    for (Map.Entry entry : c0008f.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0008f.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f183a) {
            case 0:
                return ((b0) this.f184b).f126e;
            case 1:
                return ((C0025x) this.f184b).size();
            default:
                return ((C0008f) this.f184b).f143c.size();
        }
    }

    public C0018p(C0008f c0008f) {
        this.f183a = 2;
        this.f184b = c0008f;
    }
}
