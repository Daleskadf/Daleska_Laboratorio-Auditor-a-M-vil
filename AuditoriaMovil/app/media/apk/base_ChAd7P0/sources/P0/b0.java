package p0;

import h3.AbstractC1079a;
/* loaded from: classes.dex */
public final class b0 implements n6.g {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f14995a;

    /* renamed from: b  reason: collision with root package name */
    public final N f14996b;

    public b0(b0 b0Var, N instance) {
        kotlin.jvm.internal.j.e(instance, "instance");
        this.f14995a = b0Var;
        this.f14996b = instance;
    }

    public final void a(N n7) {
        if (this.f14996b != n7) {
            b0 b0Var = this.f14995a;
            if (b0Var != null) {
                b0Var.a(n7);
                return;
            }
            return;
        }
        throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
    }

    @Override // n6.i
    public final Object fold(Object obj, w6.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // n6.i
    public final n6.g get(n6.h hVar) {
        return AbstractC1079a.j(this, hVar);
    }

    @Override // n6.g
    public final n6.h getKey() {
        return a0.f14994a;
    }

    @Override // n6.i
    public final n6.i minusKey(n6.h hVar) {
        return AbstractC1079a.p(this, hVar);
    }

    @Override // n6.i
    public final n6.i plus(n6.i iVar) {
        return AbstractC1079a.q(this, iVar);
    }
}
