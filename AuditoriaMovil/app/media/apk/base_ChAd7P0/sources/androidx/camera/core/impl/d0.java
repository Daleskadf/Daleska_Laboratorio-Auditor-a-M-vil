package androidx.camera.core.impl;

import g0.InterfaceC1003a;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: b  reason: collision with root package name */
    public static final c0 f7613b = new c0(true, null, null);

    /* renamed from: c  reason: collision with root package name */
    public static final d0 f7614c = new d0();

    /* renamed from: a  reason: collision with root package name */
    public final X f7615a = new X(f7613b);

    public final void a(G.a aVar, InterfaceC1003a interfaceC1003a) {
        q0 q0Var;
        X x7 = this.f7615a;
        C5.i iVar = new C5.i(interfaceC1003a, 29);
        synchronized (x7.f7591c) {
            q0 q0Var2 = (q0) ((HashMap) x7.f7593e).remove(iVar);
            if (q0Var2 != null) {
                q0Var2.f7662c.set(false);
                ((CopyOnWriteArraySet) x7.f).remove(q0Var2);
            }
            q0Var = new q0((AtomicReference) x7.f7592d, aVar, iVar);
            ((HashMap) x7.f7593e).put(iVar, q0Var);
            ((CopyOnWriteArraySet) x7.f).add(q0Var);
        }
        q0Var.a(0);
    }
}
