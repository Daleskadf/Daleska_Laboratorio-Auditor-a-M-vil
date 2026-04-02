package K4;

import java.util.Map;
/* loaded from: classes.dex */
public final class n implements Map.Entry {

    /* renamed from: X  reason: collision with root package name */
    public final boolean f2672X;

    /* renamed from: Y  reason: collision with root package name */
    public Object f2673Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f2674Z;

    /* renamed from: a  reason: collision with root package name */
    public n f2675a;

    /* renamed from: b  reason: collision with root package name */
    public n f2676b;

    /* renamed from: c  reason: collision with root package name */
    public n f2677c;

    /* renamed from: d  reason: collision with root package name */
    public n f2678d;

    /* renamed from: e  reason: collision with root package name */
    public n f2679e;
    public final Object f;

    public n(boolean z7) {
        this.f = null;
        this.f2672X = z7;
        this.f2679e = this;
        this.f2678d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f2673Y;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2673Y;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Object obj = this.f;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f2673Y;
        if (obj2 != null) {
            i7 = obj2.hashCode();
        }
        return i7 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f2672X) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f2673Y;
        this.f2673Y = obj;
        return obj2;
    }

    public final String toString() {
        return this.f + "=" + this.f2673Y;
    }

    public n(boolean z7, n nVar, Object obj, n nVar2, n nVar3) {
        this.f2675a = nVar;
        this.f = obj;
        this.f2672X = z7;
        this.f2674Z = 1;
        this.f2678d = nVar2;
        this.f2679e = nVar3;
        nVar3.f2678d = this;
        nVar2.f2679e = this;
    }
}
