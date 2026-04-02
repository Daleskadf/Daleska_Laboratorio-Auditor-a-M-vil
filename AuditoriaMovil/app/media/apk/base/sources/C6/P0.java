package c6;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class P0 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final A.m f8560a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f8561b;

    public P0(A.m mVar) {
        G.i.j(mVar, "executorPool");
        this.f8560a = mVar;
    }

    public final synchronized void a() {
        Executor executor = this.f8561b;
        if (executor != null) {
            n2.b((m2) this.f8560a.f28b, executor);
            this.f8561b = null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor executor;
        synchronized (this) {
            try {
                if (this.f8561b == null) {
                    Executor executor2 = (Executor) n2.a((m2) this.f8560a.f28b);
                    Executor executor3 = this.f8561b;
                    if (executor2 != null) {
                        this.f8561b = executor2;
                    } else {
                        throw new NullPointerException(H4.W.z("%s.getObject()", executor3));
                    }
                }
                executor = this.f8561b;
            } catch (Throwable th) {
                throw th;
            }
        }
        executor.execute(runnable);
    }
}
