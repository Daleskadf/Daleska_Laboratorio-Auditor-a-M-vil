package u4;

import android.os.Handler;
import android.os.Looper;
import c1.RunnableC0626c;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p4.P;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f15990c = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f15989b = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public final c f15988a = new c(this);

    public final Task a(Runnable runnable) {
        return this.f15988a.a(new org.apache.tika.pipes.async.b(runnable, 2));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [p4.P, java.lang.Object] */
    public final P b(d dVar, long j, Runnable runnable) {
        ScheduledFuture<?> scheduledFuture;
        if (this.f15990c.contains(dVar)) {
            j = 0;
        }
        System.currentTimeMillis();
        ?? obj = new Object();
        obj.f15212c = this;
        obj.f15210a = runnable;
        c cVar = this.f15988a;
        RunnableC0626c runnableC0626c = new RunnableC0626c((Object) obj, 22);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (cVar) {
            if (!cVar.f15985b) {
                scheduledFuture = cVar.f15984a.schedule(runnableC0626c, j, timeUnit);
            } else {
                scheduledFuture = null;
            }
        }
        obj.f15211b = scheduledFuture;
        this.f15989b.add(obj);
        return obj;
    }

    public final void c(Throwable th) {
        this.f15988a.f15984a.shutdownNow();
        new Handler(Looper.getMainLooper()).post(new RunnableC0626c(th, 21));
    }

    public final void d() {
        Thread currentThread = Thread.currentThread();
        c cVar = this.f15988a;
        Thread thread = cVar.f15986c;
        if (thread == currentThread) {
            return;
        }
        m5.d.g("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", thread.getName(), Long.valueOf(cVar.f15986c.getId()), currentThread.getName(), Long.valueOf(currentThread.getId()));
        throw null;
    }
}
