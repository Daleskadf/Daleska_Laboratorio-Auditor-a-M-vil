package c6;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class J1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8482a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ F5.d f8483b;

    public /* synthetic */ J1(F5.d dVar, int i7) {
        this.f8482a = i7;
        this.f8483b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8482a) {
            case 0:
                F5.d dVar = this.f8483b;
                if (!dVar.f1207b) {
                    dVar.f1211g = null;
                    return;
                }
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long a7 = dVar.f1206a - ((T1) dVar.f).a(timeUnit);
                if (a7 > 0) {
                    dVar.f1211g = ((ScheduledExecutorService) dVar.f1208c).schedule(new J1(dVar, 1), a7, timeUnit);
                    return;
                }
                dVar.f1207b = false;
                dVar.f1211g = null;
                ((K0) dVar.f1210e).run();
                return;
            default:
                F5.d dVar2 = this.f8483b;
                ((a6.u0) dVar2.f1209d).execute(new J1(dVar2, 0));
                return;
        }
    }
}
