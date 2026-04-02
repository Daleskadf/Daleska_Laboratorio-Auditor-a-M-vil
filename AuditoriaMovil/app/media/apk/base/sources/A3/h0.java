package A3;
/* loaded from: classes.dex */
public final class h0 extends P {

    /* renamed from: d  reason: collision with root package name */
    public final transient j0 f151d;

    /* renamed from: e  reason: collision with root package name */
    public final transient i0 f152e;

    public h0(j0 j0Var, i0 i0Var) {
        this.f151d = j0Var;
        this.f152e = i0Var;
    }

    @Override // A3.F, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f151d.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // A3.P, A3.F
    public final K e() {
        return this.f152e;
    }

    @Override // A3.F
    public final int f(int i7, Object[] objArr) {
        return this.f152e.f(i7, objArr);
    }

    @Override // A3.F
    public final boolean l() {
        return true;
    }

    @Override // A3.F
    public final t0 m() {
        return this.f152e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f151d.f;
    }
}
