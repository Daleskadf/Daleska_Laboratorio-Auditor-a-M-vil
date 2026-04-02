package G;

import U.l;
import a.AbstractC0412a;
import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class d implements RunnableScheduledFuture {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f1330a = new AtomicReference(null);

    /* renamed from: b  reason: collision with root package name */
    public final long f1331b;

    /* renamed from: c  reason: collision with root package name */
    public final Callable f1332c;

    /* renamed from: d  reason: collision with root package name */
    public final l f1333d;

    public d(Handler handler, long j, Callable callable) {
        this.f1331b = j;
        this.f1332c = callable;
        this.f1333d = AbstractC0412a.s(new V2.k(this, handler, callable));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        return this.f1333d.cancel(z7);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f1333d.f5535b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1331b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1333d.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1333d.f5535b.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        U.i iVar = (U.i) this.f1330a.getAndSet(null);
        if (iVar != null) {
            try {
                iVar.a(this.f1332c.call());
            } catch (Exception e7) {
                iVar.b(e7);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f1333d.f5535b.get(j, timeUnit);
    }
}
