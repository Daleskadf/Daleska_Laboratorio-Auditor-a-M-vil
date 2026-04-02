package j$.util.concurrent;

import java.util.Map;
/* loaded from: classes2.dex */
final class k implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    final Object f12912a;

    /* renamed from: b  reason: collision with root package name */
    Object f12913b;

    /* renamed from: c  reason: collision with root package name */
    final ConcurrentHashMap f12914c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f12912a = obj;
        this.f12913b = obj2;
        this.f12914c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12912a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12913b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f12912a.hashCode() ^ this.f12913b.hashCode();
    }

    public final String toString() {
        return u.b(this.f12912a, this.f12913b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f12912a) || key.equals(obj2)) && (value == (obj3 = this.f12913b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f12913b;
        this.f12913b = obj;
        this.f12914c.put(this.f12912a, obj);
        return obj2;
    }
}
