package H;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class b extends d implements Runnable {

    /* renamed from: X  reason: collision with root package name */
    public volatile E3.b f1611X;

    /* renamed from: c  reason: collision with root package name */
    public a f1612c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedBlockingQueue f1613d = new LinkedBlockingQueue(1);

    /* renamed from: e  reason: collision with root package name */
    public final CountDownLatch f1614e = new CountDownLatch(1);
    public E3.b f;

    public b(a aVar, E3.b bVar) {
        this.f1612c = aVar;
        bVar.getClass();
        this.f = bVar;
    }

    public static Object c(LinkedBlockingQueue linkedBlockingQueue) {
        Object take;
        boolean z7 = false;
        while (true) {
            try {
                take = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override // H.d, java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        boolean z8 = false;
        if (!this.f1615a.cancel(z7)) {
            return false;
        }
        while (true) {
            try {
                this.f1613d.put(Boolean.valueOf(z7));
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        E3.b bVar = this.f;
        if (bVar != null) {
            bVar.cancel(z7);
        }
        E3.b bVar2 = this.f1611X;
        if (bVar2 != null) {
            bVar2.cancel(z7);
        }
        return true;
    }

    @Override // H.d, java.util.concurrent.Future
    public final Object get() {
        if (!this.f1615a.isDone()) {
            E3.b bVar = this.f;
            if (bVar != null) {
                bVar.get();
            }
            this.f1614e.await();
            E3.b bVar2 = this.f1611X;
            if (bVar2 != null) {
                bVar2.get();
            }
        }
        return this.f1615a.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E3.b, H.a] */
    @Override // java.lang.Runnable
    public final void run() {
        E3.b apply;
        try {
            try {
                try {
                    try {
                        try {
                            apply = this.f1612c.apply(i.b(this.f));
                            this.f1611X = apply;
                        } catch (Exception e7) {
                            U.i iVar = this.f1616b;
                            if (iVar != null) {
                                iVar.b(e7);
                            }
                        }
                    } catch (Error e8) {
                        U.i iVar2 = this.f1616b;
                        if (iVar2 != null) {
                            iVar2.b(e8);
                        }
                    }
                } finally {
                    this.f1612c = null;
                    this.f = null;
                    this.f1614e.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e9) {
                Throwable cause = e9.getCause();
                U.i iVar3 = this.f1616b;
                if (iVar3 != null) {
                    iVar3.b(cause);
                }
            }
        } catch (UndeclaredThrowableException e10) {
            Throwable cause2 = e10.getCause();
            U.i iVar4 = this.f1616b;
            if (iVar4 != null) {
                iVar4.b(cause2);
            }
        }
        if (this.f1615a.isCancelled()) {
            apply.cancel(((Boolean) c(this.f1613d)).booleanValue());
            this.f1611X = null;
            return;
        }
        apply.a(new h(this, apply, 4, false), j3.f.r());
    }

    @Override // H.d, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        if (!this.f1615a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            E3.b bVar = this.f;
            if (bVar != null) {
                long nanoTime = System.nanoTime();
                bVar.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f1614e.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - nanoTime2);
                E3.b bVar2 = this.f1611X;
                if (bVar2 != null) {
                    bVar2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.f1615a.get(j, timeUnit);
    }
}
