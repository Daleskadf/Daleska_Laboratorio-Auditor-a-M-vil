package j$.util;

import j$.util.Map;
import java.io.Serializable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1355u implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = -1034234728574286014L;

    /* renamed from: a  reason: collision with root package name */
    private final java.util.Map f13411a;

    /* renamed from: b  reason: collision with root package name */
    private transient java.util.Set f13412b;

    /* renamed from: c  reason: collision with root package name */
    private transient java.util.Set f13413c;

    /* renamed from: d  reason: collision with root package name */
    private transient java.util.Collection f13414d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1355u(java.util.Map map) {
        map.getClass();
        this.f13411a = map;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f13411a.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f13411a.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f13411a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f13411a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f13411a.get(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        if (this.f13412b == null) {
            this.f13412b = DesugarCollections.unmodifiableSet(this.f13411a.keySet());
        }
        return this.f13412b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Set, j$.util.n] */
    @Override // java.util.Map
    public final java.util.Set entrySet() {
        if (this.f13413c == null) {
            this.f13413c = new C1220n(this.f13411a.entrySet());
        }
        return this.f13413c;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        if (this.f13414d == null) {
            this.f13414d = DesugarCollections.unmodifiableCollection(this.f13411a.values());
        }
        return this.f13414d;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || this.f13411a.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f13411a.hashCode();
    }

    public final String toString() {
        return this.f13411a.toString();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        return Map.EL.getOrDefault(this.f13411a, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        Map.EL.a(this.f13411a, biConsumer);
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }
}
