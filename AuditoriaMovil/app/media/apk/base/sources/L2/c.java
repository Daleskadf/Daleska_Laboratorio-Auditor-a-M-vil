package l2;

import i2.C1102b;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final C1102b f13821a;

    /* renamed from: b  reason: collision with root package name */
    public final b f13822b;

    /* renamed from: c  reason: collision with root package name */
    public final b f13823c;

    public c(C1102b c1102b, b bVar, b bVar2) {
        this.f13821a = c1102b;
        this.f13822b = bVar;
        this.f13823c = bVar2;
        if (c1102b.b() == 0 && c1102b.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (c1102b.f11449a != 0 && c1102b.f11450b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!c.class.equals(cls)) {
            return false;
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        if (kotlin.jvm.internal.j.a(this.f13821a, cVar.f13821a) && kotlin.jvm.internal.j.a(this.f13822b, cVar.f13822b) && kotlin.jvm.internal.j.a(this.f13823c, cVar.f13823c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13822b.hashCode();
        return this.f13823c.hashCode() + ((hashCode + (this.f13821a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f13821a + ", type=" + this.f13822b + ", state=" + this.f13823c + " }";
    }
}
