package A3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: A3.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0009g extends q0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map f146a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b0 f147b;

    public C0009g(b0 b0Var, Map map) {
        this.f147b = b0Var;
        map.getClass();
        this.f146a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C0007e c0007e = (C0007e) it;
            if (c0007e.hasNext()) {
                c0007e.next();
                c0007e.remove();
            } else {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f146a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f146a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.f146a.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f146a.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f146a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0007e(this, this.f146a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i7;
        Collection collection = (Collection) this.f146a.remove(obj);
        if (collection != null) {
            i7 = collection.size();
            collection.clear();
            this.f147b.f126e -= i7;
        } else {
            i7 = 0;
        }
        if (i7 <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f146a.size();
    }
}
