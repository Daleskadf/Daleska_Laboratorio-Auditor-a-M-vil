package c6;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class D0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8436a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ G0 f8437b;

    public /* synthetic */ D0(G0 g02, int i7) {
        this.f8436a = i7;
        this.f8437b = g02;
    }

    private final void a() {
        G0 g02;
        boolean z7;
        synchronized (this.f8437b) {
            g02 = this.f8437b;
            F0 f02 = g02.f8459d;
            F0 f03 = F0.DISCONNECTED;
            if (f02 != f03) {
                g02.f8459d = f03;
                z7 = true;
            } else {
                z7 = false;
            }
        }
        if (z7) {
            A.m mVar = g02.f8458c;
            mVar.getClass();
            ((d6.p) mVar.f28b).d(a6.o0.f7180n.g("Keepalive failed. The connection is likely gone"));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        switch (this.f8436a) {
            case 0:
                a();
                return;
            default:
                synchronized (this.f8437b) {
                    try {
                        G0 g02 = this.f8437b;
                        g02.f = null;
                        F0 f02 = g02.f8459d;
                        F0 f03 = F0.PING_SCHEDULED;
                        if (f02 == f03) {
                            g02.f8459d = F0.PING_SENT;
                            g02.f8460e = g02.f8456a.schedule(g02.f8461g, g02.j, TimeUnit.NANOSECONDS);
                            z7 = true;
                        } else {
                            if (f02 == F0.PING_DELAYED) {
                                ScheduledExecutorService scheduledExecutorService = g02.f8456a;
                                H0 h02 = g02.f8462h;
                                long j = g02.f8463i;
                                T1 t1 = g02.f8457b;
                                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                                g02.f = scheduledExecutorService.schedule(h02, j - t1.a(timeUnit), timeUnit);
                                this.f8437b.f8459d = f03;
                            }
                            z7 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z7) {
                    A.m mVar = this.f8437b.f8458c;
                    mVar.getClass();
                    ((d6.p) mVar.f28b).r(new E0(mVar), E3.a.INSTANCE);
                    return;
                }
                return;
        }
    }
}
