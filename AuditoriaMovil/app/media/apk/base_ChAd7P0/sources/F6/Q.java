package F6;

import java.util.concurrent.ScheduledFuture;
/* loaded from: classes.dex */
public final class Q implements S {

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledFuture f1239a;

    public Q(ScheduledFuture scheduledFuture) {
        this.f1239a = scheduledFuture;
    }

    @Override // F6.S
    public final void a() {
        this.f1239a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f1239a + ']';
    }
}
