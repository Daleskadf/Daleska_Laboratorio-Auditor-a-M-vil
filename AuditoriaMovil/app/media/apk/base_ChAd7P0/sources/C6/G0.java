package c6;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: k  reason: collision with root package name */
    public static final long f8455k = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f8456a;

    /* renamed from: b  reason: collision with root package name */
    public final T1 f8457b;

    /* renamed from: c  reason: collision with root package name */
    public final A.m f8458c;

    /* renamed from: d  reason: collision with root package name */
    public F0 f8459d;

    /* renamed from: e  reason: collision with root package name */
    public ScheduledFuture f8460e;
    public ScheduledFuture f;

    /* renamed from: g  reason: collision with root package name */
    public final H0 f8461g;

    /* renamed from: h  reason: collision with root package name */
    public final H0 f8462h;

    /* renamed from: i  reason: collision with root package name */
    public final long f8463i;
    public final long j;

    static {
        TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public G0(A.m mVar, ScheduledExecutorService scheduledExecutorService, long j, long j8) {
        T1 t1 = new T1();
        this.f8459d = F0.IDLE;
        this.f8461g = new H0(new D0(this, 0));
        this.f8462h = new H0(new D0(this, 1));
        this.f8458c = mVar;
        G.i.j(scheduledExecutorService, "scheduler");
        this.f8456a = scheduledExecutorService;
        this.f8457b = t1;
        this.f8463i = j;
        this.j = j8;
        t1.f8587b = false;
        t1.b();
    }

    public final synchronized void a() {
        try {
            T1 t1 = this.f8457b;
            boolean z7 = false;
            t1.f8587b = false;
            t1.b();
            F0 f02 = this.f8459d;
            F0 f03 = F0.PING_SCHEDULED;
            if (f02 == f03) {
                this.f8459d = F0.PING_DELAYED;
            } else if (f02 == F0.PING_SENT || f02 == F0.IDLE_AND_PING_SENT) {
                ScheduledFuture scheduledFuture = this.f8460e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f8459d == F0.IDLE_AND_PING_SENT) {
                    this.f8459d = F0.IDLE;
                    return;
                }
                this.f8459d = f03;
                if (this.f == null) {
                    z7 = true;
                }
                G.i.o("There should be no outstanding pingFuture", z7);
                this.f = this.f8456a.schedule(this.f8462h, this.f8463i, TimeUnit.NANOSECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            F0 f02 = this.f8459d;
            if (f02 == F0.IDLE) {
                this.f8459d = F0.PING_SCHEDULED;
                if (this.f == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f8456a;
                    H0 h02 = this.f8462h;
                    long j = this.f8463i;
                    T1 t1 = this.f8457b;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    this.f = scheduledExecutorService.schedule(h02, j - t1.a(timeUnit), timeUnit);
                }
            } else if (f02 == F0.IDLE_AND_PING_SENT) {
                this.f8459d = F0.PING_SENT;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
    }
}
