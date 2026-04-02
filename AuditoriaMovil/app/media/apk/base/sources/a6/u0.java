package a6;

import java.io.Serializable;
import java.lang.Thread;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class u0 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7213a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7214b;

    /* renamed from: c  reason: collision with root package name */
    public final Serializable f7215c;

    /* renamed from: d  reason: collision with root package name */
    public final Serializable f7216d;

    public u0(Executor executor, int i7) {
        this.f7213a = 1;
        this.f7216d = new LinkedBlockingQueue();
        if (i7 > 0) {
            this.f7214b = executor;
            this.f7215c = new Semaphore(i7, true);
            return;
        }
        throw new IllegalArgumentException("concurrency must be positive.");
    }

    public void a() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        do {
            AtomicReference atomicReference = (AtomicReference) this.f7216d;
            Thread currentThread = Thread.currentThread();
            while (!atomicReference.compareAndSet(null, currentThread)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            while (true) {
                concurrentLinkedQueue = (ConcurrentLinkedQueue) this.f7215c;
                try {
                    Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                    if (runnable != null) {
                        runnable.run();
                    } else {
                        atomicReference.set(null);
                    }
                } catch (Throwable th) {
                    atomicReference.set(null);
                    throw th;
                }
            }
        } while (!concurrentLinkedQueue.isEmpty());
    }

    public void b(Runnable runnable) {
        G.i.j(runnable, "runnable is null");
        ((ConcurrentLinkedQueue) this.f7215c).add(runnable);
    }

    public void c() {
        while (true) {
            Semaphore semaphore = (Semaphore) this.f7215c;
            if (semaphore.tryAcquire()) {
                Runnable runnable = (Runnable) ((LinkedBlockingQueue) this.f7216d).poll();
                if (runnable != null) {
                    ((Executor) this.f7214b).execute(new com.google.firebase.firestore.S(4, this, runnable));
                } else {
                    semaphore.release();
                    return;
                }
            } else {
                return;
            }
        }
    }

    public t0 d(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        s0 s0Var = new s0(runnable);
        return new t0(s0Var, scheduledExecutorService.schedule(new H2.a(this, s0Var, runnable, 1), j, timeUnit));
    }

    public void e() {
        boolean z7;
        if (Thread.currentThread() == ((AtomicReference) this.f7216d).get()) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("Not called from the SynchronizationContext", z7);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f7213a) {
            case 0:
                b(runnable);
                a();
                return;
            default:
                ((LinkedBlockingQueue) this.f7216d).offer(runnable);
                c();
                return;
        }
    }

    public u0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f7213a = 0;
        this.f7215c = new ConcurrentLinkedQueue();
        this.f7216d = new AtomicReference();
        this.f7214b = uncaughtExceptionHandler;
    }
}
