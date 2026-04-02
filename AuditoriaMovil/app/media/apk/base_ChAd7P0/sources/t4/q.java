package t4;

import b6.C0617c;
import com.google.android.gms.tasks.Tasks;
import p.Y0;
import p4.P;
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15833a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Y0 f15834b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0617c f15835c;

    public /* synthetic */ q(Y0 y02, C0617c c0617c, int i7) {
        this.f15833a = i7;
        this.f15834b = y02;
        this.f15835c = c0617c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15833a) {
            case 0:
                this.f15834b.c(this.f15835c);
                return;
            case 1:
                Y0 y02 = this.f15834b;
                y02.getClass();
                u4.q.a("GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
                if (((P) y02.f14763e) != null) {
                    u4.q.a("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
                    ((P) y02.f14763e).b();
                    y02.f14763e = null;
                }
                ((u4.e) y02.f14761c).a(new q(y02, this.f15835c, 4));
                return;
            case 2:
                Y0 y03 = this.f15834b;
                y03.getClass();
                ((u4.e) y03.f14761c).a(new q(y03, this.f15835c, 3));
                return;
            case 3:
                this.f15834b.c(this.f15835c);
                return;
            default:
                Y0 y04 = this.f15834b;
                y04.getClass();
                this.f15835c.x();
                y04.f14760b = Tasks.call(u4.k.f16006c, new org.apache.tika.pipes.async.b(y04, 1));
                return;
        }
    }
}
