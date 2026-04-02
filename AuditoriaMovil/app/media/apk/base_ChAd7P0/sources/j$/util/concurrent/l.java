package j$.util.concurrent;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class l implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    final int f12915a;

    /* renamed from: b  reason: collision with root package name */
    final Object f12916b;

    /* renamed from: c  reason: collision with root package name */
    volatile Object f12917c;

    /* renamed from: d  reason: collision with root package name */
    volatile l f12918d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i7, Object obj, Object obj2) {
        this.f12915a = i7;
        this.f12916b = obj;
        this.f12917c = obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i7, Object obj, Object obj2, l lVar) {
        this(i7, obj, obj2);
        this.f12918d = lVar;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12916b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12917c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f12916b.hashCode() ^ this.f12917c.hashCode();
    }

    public final String toString() {
        return u.b(this.f12916b, this.f12917c);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f12916b) || key.equals(obj2)) && (value == (obj3 = this.f12917c) || value.equals(obj3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l a(int i7, Object obj) {
        Object obj2;
        if (obj != null) {
            l lVar = this;
            do {
                if (lVar.f12915a == i7 && ((obj2 = lVar.f12916b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return lVar;
                }
                lVar = lVar.f12918d;
            } while (lVar != null);
            return null;
        }
        return null;
    }
}
