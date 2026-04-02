package kotlin.jvm.internal;
/* loaded from: classes.dex */
public final class l implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Class f13791a;

    public l(Class jClass) {
        j.e(jClass, "jClass");
        this.f13791a = jClass;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.f13791a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (j.a(this.f13791a, ((l) obj).f13791a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13791a.hashCode();
    }

    public final String toString() {
        return this.f13791a.toString() + " (Kotlin reflection is not available)";
    }
}
