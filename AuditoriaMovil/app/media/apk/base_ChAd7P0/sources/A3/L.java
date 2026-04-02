package A3;

import java.io.Serializable;
/* loaded from: classes.dex */
public class L extends r implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public final transient j0 f99d;

    public L(j0 j0Var, int i7) {
        this.f99d = j0Var;
    }

    @Override // A3.AbstractC0019q
    public final boolean b(Object obj) {
        if (obj != null && super.b(obj)) {
            return true;
        }
        return false;
    }

    @Override // A3.AbstractC0019q
    /* renamed from: c */
    public j0 a() {
        return this.f99d;
    }

    public final K d(String str) {
        K k2 = (K) this.f99d.get(str);
        if (k2 == null) {
            I i7 = K.f98b;
            return e0.f138e;
        }
        return k2;
    }

    public final P e() {
        return this.f99d.keySet();
    }
}
