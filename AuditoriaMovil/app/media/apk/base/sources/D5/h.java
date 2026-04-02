package D5;

import D.RunnableC0073x;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class h implements d {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f882a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentLinkedQueue f883b = new ConcurrentLinkedQueue();

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f884c = new AtomicBoolean(false);

    public h(ExecutorService executorService) {
        this.f882a = executorService;
    }

    @Override // D5.d
    public final void a(RunnableC0073x runnableC0073x) {
        this.f883b.add(runnableC0073x);
        this.f882a.execute(new g(this, 0));
    }

    public final void b() {
        ExecutorService executorService = this.f882a;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f883b;
        AtomicBoolean atomicBoolean = this.f884c;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable != null) {
                    runnable.run();
                }
            } finally {
                atomicBoolean.set(false);
                if (!concurrentLinkedQueue.isEmpty()) {
                    executorService.execute(new g(this, 1));
                }
            }
        }
    }
}
