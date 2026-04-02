package c6;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class h2 implements Executor, Runnable {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f8845d = Logger.getLogger(h2.class.getName());

    /* renamed from: e  reason: collision with root package name */
    public static final k2 f8846e;

    /* renamed from: a  reason: collision with root package name */
    public final Executor f8847a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentLinkedQueue f8848b = new ConcurrentLinkedQueue();

    /* renamed from: c  reason: collision with root package name */
    public volatile int f8849c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [c6.k2] */
    /* JADX WARN: Type inference failed for: r1v6 */
    static {
        f2 f2Var;
        try {
            f2Var = new f2(AtomicIntegerFieldUpdater.newUpdater(h2.class, "c"));
        } catch (Throwable th) {
            f8845d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            f2Var = new Object();
        }
        f8846e = f2Var;
    }

    public h2(Executor executor) {
        G.i.j(executor, "'executor' must not be null.");
        this.f8847a = executor;
    }

    public final void a(Runnable runnable) {
        k2 k2Var = f8846e;
        if (k2Var.r(this)) {
            try {
                this.f8847a.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f8848b.remove(runnable);
                }
                k2Var.s(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f8848b;
        G.i.j(runnable, "'r' must not be null.");
        concurrentLinkedQueue.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        k2 k2Var = f8846e;
        while (true) {
            concurrentLinkedQueue = this.f8848b;
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e7) {
                    Logger logger = f8845d;
                    Level level = Level.SEVERE;
                    logger.log(level, "Exception while executing runnable " + runnable, (Throwable) e7);
                }
            } catch (Throwable th) {
                k2Var.s(this);
                throw th;
            }
        }
        k2Var.s(this);
        if (!concurrentLinkedQueue.isEmpty()) {
            a(null);
        }
    }
}
