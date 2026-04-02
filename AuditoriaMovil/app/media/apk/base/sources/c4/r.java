package c4;

import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final Class f8412a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f8413b;

    public r(Class cls, Class cls2) {
        this.f8412a = cls;
        this.f8413b = cls2;
    }

    public static r a(Class cls) {
        return new r(q.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f8413b.equals(rVar.f8413b)) {
            return false;
        }
        return this.f8412a.equals(rVar.f8412a);
    }

    public final int hashCode() {
        return this.f8412a.hashCode() + (this.f8413b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f8413b;
        Class cls2 = this.f8412a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + StringUtils.SPACE + cls.getName();
    }
}
