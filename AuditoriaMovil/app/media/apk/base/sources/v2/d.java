package V2;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.o;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public D0.a f5948a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5949b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5950c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5951d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5952e = false;
    public Executor f;

    /* renamed from: g  reason: collision with root package name */
    public volatile E0.a f5953g;

    /* renamed from: h  reason: collision with root package name */
    public volatile E0.a f5954h;

    /* renamed from: i  reason: collision with root package name */
    public final Semaphore f5955i;
    public final Set j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f5955i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.f5953g != null) {
            boolean z7 = this.f5949b;
            if (!z7) {
                if (z7) {
                    c();
                } else {
                    this.f5952e = true;
                }
            }
            if (this.f5954h != null) {
                this.f5953g.getClass();
                this.f5953g = null;
                return;
            }
            this.f5953g.getClass();
            E0.a aVar = this.f5953g;
            aVar.f930c.set(true);
            if (aVar.f928a.cancel(false)) {
                this.f5954h = this.f5953g;
            }
            this.f5953g = null;
        }
    }

    public final void b() {
        if (this.f5954h == null && this.f5953g != null) {
            this.f5953g.getClass();
            if (this.f == null) {
                this.f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            E0.a aVar = this.f5953g;
            Executor executor = this.f;
            if (aVar.f929b != E0.e.PENDING) {
                int i7 = E0.d.f936a[aVar.f929b.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f929b = E0.e.RUNNING;
            executor.execute(aVar.f928a);
        }
    }

    public final void c() {
        a();
        this.f5953g = new E0.a(this);
        b();
    }

    public final void d() {
        Iterator it = this.j.iterator();
        if (!it.hasNext()) {
            try {
                this.f5955i.tryAcquire(0, 5L, TimeUnit.SECONDS);
                return;
            } catch (InterruptedException e7) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e7);
                Thread.currentThread().interrupt();
                return;
            }
        }
        ((o) it.next()).getClass();
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
