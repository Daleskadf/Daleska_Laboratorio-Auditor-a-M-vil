package a6;
/* renamed from: a6.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487p {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC0486o f7186a;

    /* renamed from: b  reason: collision with root package name */
    public final o0 f7187b;

    public C0487p(EnumC0486o enumC0486o, o0 o0Var) {
        G.i.j(enumC0486o, "state is null");
        this.f7186a = enumC0486o;
        G.i.j(o0Var, "status is null");
        this.f7187b = o0Var;
    }

    public static C0487p a(EnumC0486o enumC0486o) {
        boolean z7;
        if (enumC0486o != EnumC0486o.TRANSIENT_FAILURE) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.f("state is TRANSIENT_ERROR. Use forError() instead", z7);
        return new C0487p(enumC0486o, o0.f7173e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0487p)) {
            return false;
        }
        C0487p c0487p = (C0487p) obj;
        if (!this.f7186a.equals(c0487p.f7186a) || !this.f7187b.equals(c0487p.f7187b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f7186a.hashCode() ^ this.f7187b.hashCode();
    }

    public final String toString() {
        o0 o0Var = this.f7187b;
        boolean e7 = o0Var.e();
        EnumC0486o enumC0486o = this.f7186a;
        if (e7) {
            return enumC0486o.toString();
        }
        return enumC0486o + "(" + o0Var + ")";
    }
}
