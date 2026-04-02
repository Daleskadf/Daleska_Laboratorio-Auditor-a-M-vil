package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class d0 extends AbstractMap {
    public static final /* synthetic */ int f = 0;

    /* renamed from: a  reason: collision with root package name */
    public List f7803a;

    /* renamed from: b  reason: collision with root package name */
    public Map f7804b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7805c;

    /* renamed from: d  reason: collision with root package name */
    public volatile S.a f7806d;

    /* renamed from: e  reason: collision with root package name */
    public Map f7807e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, androidx.datastore.preferences.protobuf.d0] */
    public static d0 f() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f7803a = Collections.emptyList();
        abstractMap.f7804b = Collections.emptyMap();
        abstractMap.f7807e = Collections.emptyMap();
        return abstractMap;
    }

    public final int a(Comparable comparable) {
        int i7;
        int size = this.f7803a.size();
        int i8 = size - 1;
        if (i8 >= 0) {
            int compareTo = comparable.compareTo(((e0) this.f7803a.get(i8)).f7809a);
            if (compareTo > 0) {
                i7 = size + 1;
                return -i7;
            } else if (compareTo == 0) {
                return i8;
            }
        }
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) / 2;
            int compareTo2 = comparable.compareTo(((e0) this.f7803a.get(i10)).f7809a);
            if (compareTo2 < 0) {
                i8 = i10 - 1;
            } else if (compareTo2 > 0) {
                i9 = i10 + 1;
            } else {
                return i10;
            }
        }
        i7 = i9 + 1;
        return -i7;
    }

    public final void b() {
        if (!this.f7805c) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final Map.Entry c(int i7) {
        return (Map.Entry) this.f7803a.get(i7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f7803a.isEmpty()) {
            this.f7803a.clear();
        }
        if (!this.f7804b.isEmpty()) {
            this.f7804b.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f7804b.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Set d() {
        if (this.f7804b.isEmpty()) {
            return Collections.emptySet();
        }
        return this.f7804b.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f7804b.isEmpty() && !(this.f7804b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7804b = treeMap;
            this.f7807e = treeMap.descendingMap();
        }
        return (SortedMap) this.f7804b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f7806d == null) {
            this.f7806d = new S.a(1, this);
        }
        return this.f7806d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return super.equals(obj);
        }
        d0 d0Var = (d0) obj;
        int size = size();
        if (size != d0Var.size()) {
            return false;
        }
        int size2 = this.f7803a.size();
        if (size2 != d0Var.f7803a.size()) {
            return ((AbstractSet) entrySet()).equals(d0Var.entrySet());
        }
        for (int i7 = 0; i7 < size2; i7++) {
            if (!c(i7).equals(d0Var.c(i7))) {
                return false;
            }
        }
        if (size2 == size) {
            return true;
        }
        return this.f7804b.equals(d0Var.f7804b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a7 = a(comparable);
        if (a7 >= 0) {
            return ((e0) this.f7803a.get(a7)).setValue(obj);
        }
        b();
        if (this.f7803a.isEmpty() && !(this.f7803a instanceof ArrayList)) {
            this.f7803a = new ArrayList(16);
        }
        int i7 = -(a7 + 1);
        if (i7 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f7803a.size() == 16) {
            e0 e0Var = (e0) this.f7803a.remove(15);
            e().put(e0Var.f7809a, e0Var.f7810b);
        }
        this.f7803a.add(i7, new e0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a7 = a(comparable);
        if (a7 >= 0) {
            return ((e0) this.f7803a.get(a7)).f7810b;
        }
        return this.f7804b.get(comparable);
    }

    public final Object h(int i7) {
        b();
        Object obj = ((e0) this.f7803a.remove(i7)).f7810b;
        if (!this.f7804b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f7803a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new e0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f7803a.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += ((e0) this.f7803a.get(i8)).hashCode();
        }
        if (this.f7804b.size() > 0) {
            return i7 + this.f7804b.hashCode();
        }
        return i7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a7 = a(comparable);
        if (a7 >= 0) {
            return h(a7);
        }
        if (this.f7804b.isEmpty()) {
            return null;
        }
        return this.f7804b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7804b.size() + this.f7803a.size();
    }
}
