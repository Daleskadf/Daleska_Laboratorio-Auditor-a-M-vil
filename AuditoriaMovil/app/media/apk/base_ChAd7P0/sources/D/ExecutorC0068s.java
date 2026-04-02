package D;

import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import w.C1926k;
/* renamed from: D.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0068s implements Executor {

    /* renamed from: c  reason: collision with root package name */
    public static final r f770c = new r(0);

    /* renamed from: a  reason: collision with root package name */
    public final Object f771a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public ThreadPoolExecutor f772b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    public ExecutorC0068s() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f770c);
        threadPoolExecutor.setRejectedExecutionHandler(new Object());
        this.f772b = threadPoolExecutor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    public final void a(C1926k c1926k) {
        ThreadPoolExecutor threadPoolExecutor;
        c1926k.getClass();
        synchronized (this.f771a) {
            try {
                if (this.f772b.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f770c);
                    threadPoolExecutor2.setRejectedExecutionHandler(new Object());
                    this.f772b = threadPoolExecutor2;
                }
                threadPoolExecutor = this.f772b;
            } catch (Throwable th) {
                throw th;
            }
        }
        int max = Math.max(1, new LinkedHashSet(c1926k.f).size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f771a) {
            this.f772b.execute(runnable);
        }
    }
}
