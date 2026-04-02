package androidx.datastore.preferences.protobuf;

import java.util.Map;
/* loaded from: classes.dex */
public final class e0 implements Map.Entry, Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final Comparable f7809a;

    /* renamed from: b  reason: collision with root package name */
    public Object f7810b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d0 f7811c;

    public e0(d0 d0Var, Comparable comparable, Object obj) {
        this.f7811c = d0Var;
        this.f7809a = comparable;
        this.f7810b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f7809a.compareTo(((e0) obj).f7809a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f7809a;
        if (comparable == null) {
            if (key == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = comparable.equals(key);
        }
        if (equals) {
            Object obj2 = this.f7810b;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    equals2 = true;
                } else {
                    equals2 = false;
                }
            } else {
                equals2 = obj2.equals(value);
            }
            if (equals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7809a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7810b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Comparable comparable = this.f7809a;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f7810b;
        if (obj != null) {
            i7 = obj.hashCode();
        }
        return i7 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f7811c.b();
        Object obj2 = this.f7810b;
        this.f7810b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f7809a + "=" + this.f7810b;
    }
}
