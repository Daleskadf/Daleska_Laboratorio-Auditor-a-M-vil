package A3;

import java.util.Map;
/* loaded from: classes.dex */
public final class g0 extends P {

    /* renamed from: d  reason: collision with root package name */
    public final transient j0 f148d;

    /* renamed from: e  reason: collision with root package name */
    public final transient Object[] f149e;
    public final transient int f;

    public g0(j0 j0Var, Object[] objArr, int i7) {
        this.f148d = j0Var;
        this.f149e = objArr;
        this.f = i7;
    }

    @Override // A3.F, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.f148d.get(key))) {
            return false;
        }
        return true;
    }

    @Override // A3.F
    public final int f(int i7, Object[] objArr) {
        return e().f(i7, objArr);
    }

    @Override // A3.F
    public final boolean l() {
        return true;
    }

    @Override // A3.F
    public final t0 m() {
        return e().listIterator(0);
    }

    @Override // A3.P
    public final K q() {
        return new f0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
