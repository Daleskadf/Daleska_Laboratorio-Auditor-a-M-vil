package androidx.camera.core.impl;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class k0 implements l0 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f7645a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final l0 f7646b;

    public k0(l0 l0Var) {
        this.f7646b = l0Var;
    }

    @Override // androidx.camera.core.impl.l0
    public final void a(o0 o0Var, m0 m0Var) {
        if (!this.f7645a.get()) {
            this.f7646b.a(o0Var, m0Var);
        }
    }

    public final void b() {
        this.f7645a.set(true);
    }
}
