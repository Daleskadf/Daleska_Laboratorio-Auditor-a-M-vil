package u4;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import t4.RunnableC1822b;
/* loaded from: classes.dex */
public final class c implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final C1871a f15984a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15985b;

    /* renamed from: c  reason: collision with root package name */
    public final Thread f15986c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f15987d;

    public c(e eVar) {
        this.f15987d = eVar;
        RunnableC1872b runnableC1872b = new RunnableC1872b(this);
        Thread newThread = Executors.defaultThreadFactory().newThread(runnableC1872b);
        this.f15986c = newThread;
        newThread.setName("FirestoreWorker");
        newThread.setDaemon(true);
        newThread.setUncaughtExceptionHandler(new P6.b(this, 1));
        C1871a c1871a = new C1871a(this, runnableC1872b);
        this.f15984a = c1871a;
        c1871a.setKeepAliveTime(3L, TimeUnit.SECONDS);
        this.f15985b = false;
    }

    public final Task a(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            execute(new RunnableC1822b(7, taskCompletionSource, callable));
        } catch (RejectedExecutionException unused) {
            q.d(e.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
        }
        return taskCompletionSource.getTask();
    }

    public final synchronized boolean b() {
        return this.f15985b;
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (!this.f15985b) {
            this.f15984a.execute(runnable);
        }
    }
}
