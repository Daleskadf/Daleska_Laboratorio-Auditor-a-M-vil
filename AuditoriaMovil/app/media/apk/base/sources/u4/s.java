package u4;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import t4.RunnableC1822b;
/* loaded from: classes.dex */
public final class s implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f16016a;

    /* renamed from: b  reason: collision with root package name */
    public final Semaphore f16017b = new Semaphore(4);

    public s(Executor executor) {
        this.f16016a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.f16017b.tryAcquire()) {
            try {
                this.f16016a.execute(new RunnableC1822b(10, this, runnable));
                return;
            } catch (RejectedExecutionException unused) {
                runnable.run();
                return;
            }
        }
        runnable.run();
    }
}
