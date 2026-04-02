package c4;
/* loaded from: classes.dex */
public final class h extends g {
    public h(Class cls, n nVar, k3.j jVar, k3.j[] jVarArr, k3.j jVar2, k3.j jVar3, Object obj, Object obj2, boolean z10) {
        super(cls, nVar, jVar, jVarArr, jVar2, jVar3, obj, obj2, z10);
    }

    public static h d0(Class cls, n nVar, k3.j jVar, k3.j[] jVarArr, k3.j jVar2, k3.j jVar3) {
        return new h(cls, nVar, jVar, jVarArr, jVar2, jVar3, null, null, false);
    }

    @Override // k3.j
    public k3.j P(Class cls, n nVar, k3.j jVar, k3.j[] jVarArr) {
        return new h(cls, nVar, jVar, jVarArr, this.f5549l, this.f5550m, this.f14920c, this.f14921d, this.f14922e);
    }

    @Override // k3.j
    public k3.j R(k3.j jVar) {
        if (this.f5550m == jVar) {
            return this;
        }
        return new h(this.f14918a, this.f5560h, this.f5558f, this.f5559g, this.f5549l, jVar, this.f14920c, this.f14921d, this.f14922e);
    }

    @Override // k3.j
    /* renamed from: e0 */
    public h S(Object obj) {
        return new h(this.f14918a, this.f5560h, this.f5558f, this.f5559g, this.f5549l, this.f5550m.W(obj), this.f14920c, this.f14921d, this.f14922e);
    }

    @Override // k3.j
    /* renamed from: f0 */
    public h T(Object obj) {
        return new h(this.f14918a, this.f5560h, this.f5558f, this.f5559g, this.f5549l, this.f5550m.X(obj), this.f14920c, this.f14921d, this.f14922e);
    }

    @Override // c4.g
    /* renamed from: g0 */
    public h b0(k3.j jVar) {
        if (jVar == this.f5549l) {
            return this;
        }
        return new h(this.f14918a, this.f5560h, this.f5558f, this.f5559g, jVar, this.f5550m, this.f14920c, this.f14921d, this.f14922e);
    }

    @Override // c4.g
    /* renamed from: h0 */
    public h c0(Object obj) {
        return new h(this.f14918a, this.f5560h, this.f5558f, this.f5559g, this.f5549l.X(obj), this.f5550m, this.f14920c, this.f14921d, this.f14922e);
    }

    @Override // k3.j
    /* renamed from: i0 */
    public h V() {
        if (this.f14922e) {
            return this;
        }
        return new h(this.f14918a, this.f5560h, this.f5558f, this.f5559g, this.f5549l.V(), this.f5550m.V(), this.f14920c, this.f14921d, true);
    }

    @Override // k3.j
    /* renamed from: j0 */
    public h W(Object obj) {
        return new h(this.f14918a, this.f5560h, this.f5558f, this.f5559g, this.f5549l, this.f5550m, this.f14920c, obj, this.f14922e);
    }

    @Override // k3.j
    /* renamed from: k0 */
    public h X(Object obj) {
        return new h(this.f14918a, this.f5560h, this.f5558f, this.f5559g, this.f5549l, this.f5550m, obj, this.f14921d, this.f14922e);
    }

    @Override // k3.j
    public String toString() {
        return "[map type; class " + this.f14918a.getName() + ", " + this.f5549l + " -> " + this.f5550m + "]";
    }
}
