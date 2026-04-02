package u4;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import t4.RunnableC1822b;
/* loaded from: classes.dex */
public final class f implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Semaphore f15991a = new Semaphore(0);

    /* renamed from: b  reason: collision with root package name */
    public int f15992b = 0;

    public final void a() {
        try {
            this.f15991a.acquire(this.f15992b);
            this.f15992b = 0;
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            m5.d.g("Interrupted while waiting for background task", e7);
            throw null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f15992b++;
        k.f16006c.execute(new RunnableC1822b(8, this, runnable));
    }
}
