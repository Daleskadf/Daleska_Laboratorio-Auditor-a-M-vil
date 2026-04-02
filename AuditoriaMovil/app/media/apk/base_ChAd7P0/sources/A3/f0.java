package A3;

import j$.util.Objects;
import java.util.AbstractMap;
/* loaded from: classes.dex */
public final class f0 extends K {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g0 f145c;

    public f0(g0 g0Var) {
        this.f145c = g0Var;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        g0 g0Var = this.f145c;
        G.i.i(i7, g0Var.f);
        int i8 = i7 * 2;
        Object[] objArr = g0Var.f149e;
        Object obj = objArr[i8];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i8 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // A3.F
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f145c.f;
    }
}
