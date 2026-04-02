package r4;

import java.util.HashSet;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final f f15492b = new f(new HashSet());

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f15493a;

    public f(HashSet hashSet) {
        this.f15493a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            return this.f15493a.equals(((f) obj).f15493a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15493a.hashCode();
    }

    public final String toString() {
        return "FieldMask{mask=" + this.f15493a.toString() + "}";
    }
}
