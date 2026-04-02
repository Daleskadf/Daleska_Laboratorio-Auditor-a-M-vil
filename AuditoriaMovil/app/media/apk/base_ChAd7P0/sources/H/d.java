package H;

import a.AbstractC0412a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class d implements E3.b {

    /* renamed from: a  reason: collision with root package name */
    public final E3.b f1615a;

    /* renamed from: b  reason: collision with root package name */
    public U.i f1616b;

    public d(E3.b bVar) {
        bVar.getClass();
        this.f1615a = bVar;
    }

    public static d b(E3.b bVar) {
        if (bVar instanceof d) {
            return (d) bVar;
        }
        return new d(bVar);
    }

    @Override // E3.b
    public final void a(Runnable runnable, Executor executor) {
        this.f1615a.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z7) {
        return this.f1615a.cancel(z7);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f1615a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1615a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1615a.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.f1615a.get(j, timeUnit);
    }

    public d() {
        this.f1615a = AbstractC0412a.s(new A.c(this, 5));
    }
}
