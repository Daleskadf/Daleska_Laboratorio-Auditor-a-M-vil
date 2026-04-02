package F6;

import n6.AbstractC1535a;
/* loaded from: classes.dex */
public abstract class B extends AbstractC1535a implements n6.f {

    /* renamed from: b  reason: collision with root package name */
    public static final A f1214b = new A(n6.e.f14393a, C0112z.f1324a);

    public B() {
        super(n6.e.f14393a);
    }

    public abstract void c(n6.i iVar, Runnable runnable);

    public boolean d() {
        return !(this instanceof I0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.k, w6.l] */
    @Override // n6.AbstractC1535a, n6.i
    public final n6.g get(n6.h key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (key instanceof A) {
            A a7 = (A) key;
            n6.h hVar = this.f14387a;
            if (hVar != a7 && a7.f1213b != hVar) {
                return null;
            }
            n6.g gVar = (n6.g) a7.f1212a.invoke(this);
            if (!(gVar instanceof n6.g)) {
                return null;
            }
            return gVar;
        } else if (n6.e.f14393a != key) {
            return null;
        } else {
            return this;
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.k, w6.l] */
    @Override // n6.AbstractC1535a, n6.i
    public final n6.i minusKey(n6.h key) {
        kotlin.jvm.internal.j.e(key, "key");
        boolean z7 = key instanceof A;
        n6.j jVar = n6.j.f14394a;
        if (z7) {
            A a7 = (A) key;
            n6.h hVar = this.f14387a;
            if ((hVar == a7 || a7.f1213b == hVar) && ((n6.g) a7.f1212a.invoke(this)) != null) {
                return jVar;
            }
        } else if (n6.e.f14393a == key) {
            return jVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + H.j(this);
    }
}
