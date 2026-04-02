package n4;

import O0.d0;
import a6.U;
import androidx.camera.core.impl.X;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p.Y0;
import p4.C1683m;
import p4.RunnableC1680j;
import p4.W;
/* renamed from: n4.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1531q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14352a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1533t f14353b;

    public /* synthetic */ RunnableC1531q(C1533t c1533t, int i7) {
        this.f14352a = i7;
        this.f14353b = c1533t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1533t c1533t = this.f14353b;
        switch (this.f14352a) {
            case 0:
                d0 d0Var = c1533t.f14366h;
                d0Var.getClass();
                u4.q.a("RemoteStore", "Shutting down", new Object[0]);
                E.e eVar = (E.e) d0Var.f3691g;
                Runnable runnable = (Runnable) eVar.f922d;
                if (runnable != null) {
                    runnable.run();
                    eVar.f922d = null;
                }
                d0Var.f3687b = false;
                d0Var.c();
                Y0 y02 = ((t4.i) d0Var.f).f15806c.f15831d;
                y02.getClass();
                try {
                    U u7 = (U) Tasks.await((Task) y02.f14760b);
                    u7.w();
                    try {
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        if (!u7.s(1L, timeUnit)) {
                            u4.q.a(t4.p.class.getSimpleName(), "Unable to gracefully shutdown the gRPC ManagedChannel. Will attempt an immediate shutdown.", new Object[0]);
                            u7.x();
                            if (!u7.s(60L, timeUnit)) {
                                u4.q.d(t4.p.class.getSimpleName(), "Unable to forcefully shutdown the gRPC ManagedChannel.", new Object[0]);
                            }
                        }
                    } catch (InterruptedException unused) {
                        u7.x();
                        u4.q.d(t4.p.class.getSimpleName(), "Interrupted while shutting down the gRPC Managed Channel", new Object[0]);
                        Thread.currentThread().interrupt();
                    }
                } catch (InterruptedException unused2) {
                    u4.q.d(t4.p.class.getSimpleName(), "Interrupted while retrieving the gRPC Managed Channel", new Object[0]);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e7) {
                    u4.q.d(t4.p.class.getSimpleName(), "Channel is not initialized, shutdown will just do nothing. Channel initializing run into exception: %s", e7);
                }
                ((X) d0Var.f3692h).d(z.UNKNOWN);
                c1533t.f.J();
                W w2 = c1533t.f14369l;
                if (w2 != null) {
                    w2.stop();
                }
                R1.j jVar = c1533t.f14368k;
                if (jVar != null) {
                    jVar.stop();
                    return;
                }
                return;
            case 1:
                c1533t.f14366h.e();
                return;
            case 2:
                d0 d0Var2 = c1533t.f14366h;
                d0Var2.f3687b = false;
                d0Var2.c();
                ((X) d0Var2.f3692h).d(z.OFFLINE);
                return;
            default:
                C1683m c1683m = c1533t.f14365g;
                c1683m.getClass();
                c1683m.f15266a.G("Delete All Indexes", new RunnableC1680j(c1683m, 2));
                return;
        }
    }
}
