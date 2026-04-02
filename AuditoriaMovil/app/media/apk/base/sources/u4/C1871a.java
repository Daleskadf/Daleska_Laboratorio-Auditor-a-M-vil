package u4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
/* renamed from: u4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1871a extends ScheduledThreadPoolExecutor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f15980a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1871a(c cVar, RunnableC1872b runnableC1872b) {
        super(1, runnableC1872b);
        this.f15980a = cVar;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            try {
                if (future.isDone()) {
                    future.get();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (CancellationException unused2) {
            } catch (ExecutionException e7) {
                th = e7.getCause();
            }
        }
        if (th != null) {
            this.f15980a.f15987d.c(th);
        }
    }
}
