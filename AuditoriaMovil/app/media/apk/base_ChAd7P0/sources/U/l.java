package U;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class l implements E3.b {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f5534a;

    /* renamed from: b  reason: collision with root package name */
    public final k f5535b = new k(this);

    public l(i iVar) {
        this.f5534a = new WeakReference(iVar);
    }

    @Override // E3.b
    public final void a(Runnable runnable, Executor executor) {
        this.f5535b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        i iVar = (i) this.f5534a.get();
        boolean cancel = this.f5535b.cancel(z7);
        if (cancel && iVar != null) {
            iVar.f5529a = null;
            iVar.f5530b = null;
            iVar.f5531c.j(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f5535b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5535b.f5526a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5535b.isDone();
    }

    public final String toString() {
        return this.f5535b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f5535b.get(j, timeUnit);
    }
}
