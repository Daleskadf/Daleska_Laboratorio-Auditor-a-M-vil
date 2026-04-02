package com.google.protobuf;

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
public final class G0 extends AbstractMap {

    /* renamed from: X  reason: collision with root package name */
    public static final /* synthetic */ int f10007X = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f10008a;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10011d;

    /* renamed from: e  reason: collision with root package name */
    public volatile S.a f10012e;

    /* renamed from: b  reason: collision with root package name */
    public List f10009b = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    public Map f10010c = Collections.emptyMap();
    public Map f = Collections.emptyMap();

    public G0(int i7) {
        this.f10008a = i7;
    }

    public final int a(Comparable comparable) {
        int i7;
        int size = this.f10009b.size();
        int i8 = size - 1;
        if (i8 >= 0) {
            int compareTo = comparable.compareTo(((K0) this.f10009b.get(i8)).f10017a);
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
            int compareTo2 = comparable.compareTo(((K0) this.f10009b.get(i10)).f10017a);
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
        if (!this.f10011d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final Map.Entry c(int i7) {
        return (Map.Entry) this.f10009b.get(i7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f10009b.isEmpty()) {
            this.f10009b.clear();
        }
        if (!this.f10010c.isEmpty()) {
            this.f10010c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f10010c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Iterable d() {
        if (this.f10010c.isEmpty()) {
            return J0.f10015b;
        }
        return this.f10010c.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f10010c.isEmpty() && !(this.f10010c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f10010c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.f10010c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f10012e == null) {
            this.f10012e = new S.a(2, this);
        }
        return this.f10012e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return super.equals(obj);
        }
        G0 g02 = (G0) obj;
        int size = size();
        if (size != g02.size()) {
            return false;
        }
        int size2 = this.f10009b.size();
        if (size2 != g02.f10009b.size()) {
            return ((AbstractSet) entrySet()).equals(g02.entrySet());
        }
        for (int i7 = 0; i7 < size2; i7++) {
            if (!c(i7).equals(g02.c(i7))) {
                return false;
            }
        }
        if (size2 == size) {
            return true;
        }
        return this.f10010c.equals(g02.f10010c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a7 = a(comparable);
        if (a7 >= 0) {
            return ((K0) this.f10009b.get(a7)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f10009b.isEmpty();
        int i7 = this.f10008a;
        if (isEmpty && !(this.f10009b instanceof ArrayList)) {
            this.f10009b = new ArrayList(i7);
        }
        int i8 = -(a7 + 1);
        if (i8 >= i7) {
            return e().put(comparable, obj);
        }
        if (this.f10009b.size() == i7) {
            K0 k02 = (K0) this.f10009b.remove(i7 - 1);
            e().put(k02.f10017a, k02.f10018b);
        }
        this.f10009b.add(i8, new K0(this, comparable, obj));
        return null;
    }

    public final Object g(int i7) {
        b();
        Object obj = ((K0) this.f10009b.remove(i7)).f10018b;
        if (!this.f10010c.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f10009b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new K0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a7 = a(comparable);
        if (a7 >= 0) {
            return ((K0) this.f10009b.get(a7)).f10018b;
        }
        return this.f10010c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f10009b.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += ((K0) this.f10009b.get(i8)).hashCode();
        }
        if (this.f10010c.size() > 0) {
            return i7 + this.f10010c.hashCode();
        }
        return i7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a7 = a(comparable);
        if (a7 >= 0) {
            return g(a7);
        }
        if (this.f10010c.isEmpty()) {
            return null;
        }
        return this.f10010c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f10010c.size() + this.f10009b.size();
    }
}
