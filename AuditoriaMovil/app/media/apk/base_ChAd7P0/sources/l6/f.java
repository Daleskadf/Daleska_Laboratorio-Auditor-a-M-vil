package l6;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class f implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13868a;

    public /* synthetic */ f(Object obj) {
        this.f13868a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof e) {
            return ((e) obj).f13867a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (!kotlin.jvm.internal.j.a(this.f13868a, ((f) obj).f13868a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f13868a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f13868a;
        if (obj instanceof e) {
            return ((e) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
