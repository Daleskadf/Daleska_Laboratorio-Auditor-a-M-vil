package F6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* renamed from: F6.g0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089g0 extends AbstractC0095j0 {
    public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(C0089g0.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e  reason: collision with root package name */
    public final w6.l f1273e;

    public C0089g0(w6.l lVar) {
        this.f1273e = lVar;
    }

    @Override // w6.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return l6.j.f13876a;
    }

    @Override // F6.AbstractC0099l0
    public final void j(Throwable th) {
        if (f.compareAndSet(this, 0, 1)) {
            this.f1273e.invoke(th);
        }
    }
}
