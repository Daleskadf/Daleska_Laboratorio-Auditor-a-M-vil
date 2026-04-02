package M6;

import F6.AbstractC0079b0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
/* loaded from: classes.dex */
public abstract class i extends AbstractC0079b0 {

    /* renamed from: c  reason: collision with root package name */
    public d f3293c;

    @Override // F6.B
    public final void c(n6.i iVar, Runnable runnable) {
        d dVar = this.f3293c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d.f3279Y;
        dVar.b(runnable, l.f3302g, false);
    }
}
