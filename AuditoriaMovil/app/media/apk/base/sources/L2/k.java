package l2;

import java.util.List;
import m6.AbstractC1447h;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13840a;

    public k(List list) {
        this.f13840a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class.equals(obj.getClass())) {
            return this.f13840a.equals(((k) obj).f13840a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13840a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Iterable] */
    public final String toString() {
        return AbstractC1447h.R(this.f13840a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
