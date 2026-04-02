package H;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class k implements E3.b {

    /* renamed from: c  reason: collision with root package name */
    public static final k f1628c = new k(null, 0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1629a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1630b;

    public /* synthetic */ k(Object obj, int i7) {
        this.f1629a = i7;
        this.f1630b = obj;
    }

    @Override // E3.b
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            org.slf4j.helpers.i.u("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e7);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        switch (this.f1629a) {
            case 0:
                return this.f1630b;
            default:
                throw new ExecutionException((Throwable) this.f1630b);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        switch (this.f1629a) {
            case 0:
                return super.toString() + "[status=SUCCESS, result=[" + this.f1630b + "]]";
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) this.f1630b) + "]]";
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
