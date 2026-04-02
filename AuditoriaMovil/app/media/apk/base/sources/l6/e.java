package l6;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f13867a;

    public e(Throwable exception) {
        kotlin.jvm.internal.j.e(exception, "exception");
        this.f13867a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.j.a(this.f13867a, ((e) obj).f13867a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13867a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f13867a + ')';
    }
}
