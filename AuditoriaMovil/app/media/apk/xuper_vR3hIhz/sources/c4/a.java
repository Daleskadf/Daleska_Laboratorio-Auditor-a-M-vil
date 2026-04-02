package c4;

import java.lang.reflect.Array;
/* loaded from: classes.dex */
public final class a extends m {

    /* renamed from: l  reason: collision with root package name */
    public final k3.j f5526l;

    /* renamed from: m  reason: collision with root package name */
    public final Object f5527m;

    public a(k3.j jVar, n nVar, Object obj, Object obj2, Object obj3, boolean z10) {
        super(obj.getClass(), nVar, null, null, jVar.hashCode(), obj2, obj3, z10);
        this.f5526l = jVar;
        this.f5527m = obj;
    }

    public static a b0(k3.j jVar, n nVar) {
        return c0(jVar, nVar, null, null);
    }

    public static a c0(k3.j jVar, n nVar, Object obj, Object obj2) {
        return new a(jVar, nVar, Array.newInstance(jVar.q(), 0), obj, obj2, false);
    }

    @Override // k3.j
    public boolean A() {
        return true;
    }

    @Override // k3.j
    public boolean C() {
        return true;
    }

    @Override // k3.j
    public boolean D() {
        return true;
    }

    @Override // k3.j
    public k3.j P(Class cls, n nVar, k3.j jVar, k3.j[] jVarArr) {
        return null;
    }

    @Override // k3.j
    public k3.j R(k3.j jVar) {
        return new a(jVar, this.f5560h, Array.newInstance(jVar.q(), 0), this.f14920c, this.f14921d, this.f14922e);
    }

    public Object[] d0() {
        return (Object[]) this.f5527m;
    }

    @Override // k3.j
    /* renamed from: e0 */
    public a S(Object obj) {
        if (obj == this.f5526l.t()) {
            return this;
        }
        return new a(this.f5526l.W(obj), this.f5560h, this.f5527m, this.f14920c, this.f14921d, this.f14922e);
    }

    @Override // k3.j
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != a.class) {
            return false;
        }
        return this.f5526l.equals(((a) obj).f5526l);
    }

    @Override // k3.j
    /* renamed from: f0 */
    public a T(Object obj) {
        if (obj == this.f5526l.u()) {
            return this;
        }
        return new a(this.f5526l.X(obj), this.f5560h, this.f5527m, this.f14920c, this.f14921d, this.f14922e);
    }

    @Override // k3.j
    /* renamed from: g0 */
    public a V() {
        if (this.f14922e) {
            return this;
        }
        return new a(this.f5526l.V(), this.f5560h, this.f5527m, this.f14920c, this.f14921d, true);
    }

    @Override // k3.j
    /* renamed from: h0 */
    public a W(Object obj) {
        if (obj == this.f14921d) {
            return this;
        }
        return new a(this.f5526l, this.f5560h, this.f5527m, this.f14920c, obj, this.f14922e);
    }

    @Override // k3.j
    /* renamed from: i0 */
    public a X(Object obj) {
        if (obj == this.f14920c) {
            return this;
        }
        return new a(this.f5526l, this.f5560h, this.f5527m, obj, this.f14921d, this.f14922e);
    }

    @Override // k3.j
    public k3.j k() {
        return this.f5526l;
    }

    @Override // k3.j
    public StringBuilder l(StringBuilder sb) {
        sb.append('[');
        return this.f5526l.l(sb);
    }

    @Override // k3.j
    public StringBuilder n(StringBuilder sb) {
        sb.append('[');
        return this.f5526l.n(sb);
    }

    @Override // k3.j
    public String toString() {
        return "[array type, component type: " + this.f5526l + "]";
    }

    @Override // k3.j
    public boolean w() {
        return this.f5526l.w();
    }

    @Override // k3.j
    public boolean x() {
        if (!super.x() && !this.f5526l.x()) {
            return false;
        }
        return true;
    }

    @Override // k3.j
    public boolean z() {
        return false;
    }
}
