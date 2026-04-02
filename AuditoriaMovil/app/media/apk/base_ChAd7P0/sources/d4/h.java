package d4;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class h extends U.h implements ScheduledFuture {

    /* renamed from: Y  reason: collision with root package name */
    public final ScheduledFuture f10346Y;

    public h(g gVar) {
        this.f10346Y = gVar.a(new A.c(this, 29));
    }

    @Override // U.h
    public final void c() {
        boolean z7;
        ScheduledFuture scheduledFuture = this.f10346Y;
        Object obj = this.f5526a;
        if ((obj instanceof U.a) && ((U.a) obj).f5508a) {
            z7 = true;
        } else {
            z7 = false;
        }
        scheduledFuture.cancel(z7);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f10346Y.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f10346Y.getDelay(timeUnit);
    }
}
