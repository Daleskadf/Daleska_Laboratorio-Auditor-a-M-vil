package h4;

import a6.t0;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
/* renamed from: h4.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1083c {

    /* renamed from: a  reason: collision with root package name */
    public final String f11337a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f11338b;

    public C1083c(String str, Map map) {
        this.f11337a = str;
        this.f11338b = map;
    }

    public static t0 a(String str) {
        return new t0(str, 17);
    }

    public static C1083c c(String str) {
        return new C1083c(str, Collections.emptyMap());
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f11338b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1083c)) {
            return false;
        }
        C1083c c1083c = (C1083c) obj;
        if (this.f11337a.equals(c1083c.f11337a) && this.f11338b.equals(c1083c.f11338b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11338b.hashCode() + (this.f11337a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f11337a + ", properties=" + this.f11338b.values() + "}";
    }
}
