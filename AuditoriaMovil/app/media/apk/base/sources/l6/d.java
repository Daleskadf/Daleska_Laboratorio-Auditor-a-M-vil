package l6;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13865a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f13866b;

    public d(Object obj, Object obj2) {
        this.f13865a = obj;
        this.f13866b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.j.a(this.f13865a, dVar.f13865a) && kotlin.jvm.internal.j.a(this.f13866b, dVar.f13866b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Object obj = this.f13865a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i8 = hashCode * 31;
        Object obj2 = this.f13866b;
        if (obj2 != null) {
            i7 = obj2.hashCode();
        }
        return i8 + i7;
    }

    public final String toString() {
        return "(" + this.f13865a + ", " + this.f13866b + ')';
    }
}
