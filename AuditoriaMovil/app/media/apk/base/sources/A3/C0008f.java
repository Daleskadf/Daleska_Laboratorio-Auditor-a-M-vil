package A3;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
/* renamed from: A3.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0008f extends AbstractMap {

    /* renamed from: a  reason: collision with root package name */
    public transient C0006d f141a;

    /* renamed from: b  reason: collision with root package name */
    public transient C0018p f142b;

    /* renamed from: c  reason: collision with root package name */
    public final transient Map f143c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b0 f144d;

    public C0008f(b0 b0Var, Map map) {
        this.f144d = b0Var;
        this.f143c = map;
    }

    public final G a(Map.Entry entry) {
        C0016n c0016n;
        Object key = entry.getKey();
        b0 b0Var = this.f144d;
        b0Var.getClass();
        List list = (List) ((Collection) entry.getValue());
        if (list instanceof RandomAccess) {
            c0016n = new C0016n(b0Var, key, list, null);
        } else {
            c0016n = new C0016n(b0Var, key, list, null);
        }
        return new G(key, c0016n);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b0 b0Var = this.f144d;
        if (this.f143c == b0Var.f125d) {
            b0Var.c();
            return;
        }
        C0007e c0007e = new C0007e(this);
        while (c0007e.hasNext()) {
            c0007e.next();
            c0007e.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f143c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0006d c0006d = this.f141a;
        if (c0006d == null) {
            C0006d c0006d2 = new C0006d(this);
            this.f141a = c0006d2;
            return c0006d2;
        }
        return c0006d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.f143c.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        C0016n c0016n;
        Map map = this.f143c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        b0 b0Var = this.f144d;
        b0Var.getClass();
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            c0016n = new C0016n(b0Var, obj, list, null);
        } else {
            c0016n = new C0016n(b0Var, obj, list, null);
        }
        return c0016n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f143c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set c0009g;
        b0 b0Var = this.f144d;
        Set set = b0Var.f185a;
        if (set == null) {
            Map map = b0Var.f125d;
            if (map instanceof NavigableMap) {
                c0009g = new C0011i(b0Var, (NavigableMap) map);
            } else if (map instanceof SortedMap) {
                c0009g = new C0014l(b0Var, (SortedMap) map);
            } else {
                c0009g = new C0009g(b0Var, map);
            }
            set = c0009g;
            b0Var.f185a = set;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f143c.remove(obj);
        if (collection == null) {
            return null;
        }
        b0 b0Var = this.f144d;
        Collection d7 = b0Var.d();
        d7.addAll(collection);
        b0Var.f126e -= collection.size();
        collection.clear();
        return d7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f143c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f143c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0018p c0018p = this.f142b;
        if (c0018p == null) {
            C0018p c0018p2 = new C0018p(this);
            this.f142b = c0018p2;
            return c0018p2;
        }
        return c0018p;
    }
}
