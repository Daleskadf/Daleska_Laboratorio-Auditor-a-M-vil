package O0;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0243e f3758a;

    /* renamed from: b  reason: collision with root package name */
    public final f0 f3759b;

    /* renamed from: c  reason: collision with root package name */
    public final K0.s f3760c;

    /* renamed from: d  reason: collision with root package name */
    public int f3761d;

    /* renamed from: e  reason: collision with root package name */
    public Object f3762e;
    public final Looper f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3763g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3764h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3765i;

    public h0(f0 f0Var, AbstractC0243e abstractC0243e, H0.V v6, int i7, K0.s sVar, Looper looper) {
        this.f3759b = f0Var;
        this.f3758a = abstractC0243e;
        this.f = looper;
        this.f3760c = sVar;
    }

    public final synchronized void a(long j) {
        boolean z7;
        boolean z8;
        K0.a.j(this.f3763g);
        if (this.f.getThread() != Thread.currentThread()) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        this.f3760c.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z8 = this.f3765i;
            if (z8 || j <= 0) {
                break;
            }
            this.f3760c.getClass();
            wait(j);
            this.f3760c.getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z8) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z7) {
        this.f3764h = z7 | this.f3764h;
        this.f3765i = true;
        notifyAll();
    }

    public final void c() {
        K0.a.j(!this.f3763g);
        this.f3763g = true;
        N n7 = (N) this.f3759b;
        synchronized (n7) {
            if (!n7.f3598u0 && n7.f3583e0.getThread().isAlive()) {
                n7.f3576Y.a(14, this).b();
                return;
            }
            K0.a.A("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
