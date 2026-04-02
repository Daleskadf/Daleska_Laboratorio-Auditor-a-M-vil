package A3;
/* loaded from: classes.dex */
public final class r0 extends P {

    /* renamed from: d  reason: collision with root package name */
    public final transient Object f188d;

    public r0(Object obj) {
        obj.getClass();
        this.f188d = obj;
    }

    @Override // A3.F, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f188d.equals(obj);
    }

    @Override // A3.P, A3.F
    public final K e() {
        return K.u(this.f188d);
    }

    @Override // A3.F
    public final int f(int i7, Object[] objArr) {
        objArr[i7] = this.f188d;
        return i7 + 1;
    }

    @Override // A3.P, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f188d.hashCode();
    }

    @Override // A3.F
    public final boolean l() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A3.t0, A3.T, java.lang.Object] */
    @Override // A3.F
    public final t0 m() {
        ?? obj = new Object();
        obj.f115a = this.f188d;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f188d.toString() + ']';
    }
}
