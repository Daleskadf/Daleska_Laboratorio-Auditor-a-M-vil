package F6;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: F6.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081c0 extends AbstractC0079b0 implements M {

    /* renamed from: c  reason: collision with root package name */
    public final Executor f1259c;

    public C0081c0(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f1259c = executor;
        Method method2 = K6.c.f2771a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = K6.c.f2771a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // F6.M
    public final S a(long j, H0 h02, n6.i iVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f1259c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(h02, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e7) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e7);
                InterfaceC0091h0 interfaceC0091h0 = (InterfaceC0091h0) iVar.get(C.f1216b);
                if (interfaceC0091h0 != null) {
                    interfaceC0091h0.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            return new Q(scheduledFuture);
        }
        return I.f1229e0.a(j, h02, iVar);
    }

    @Override // F6.M
    public final void b(long j, C0100m c0100m) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f1259c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new H.h(2, this, c0100m), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e7) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e7);
                InterfaceC0091h0 interfaceC0091h0 = (InterfaceC0091h0) c0100m.f1285e.get(C.f1216b);
                if (interfaceC0091h0 != null) {
                    interfaceC0091h0.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            c0100m.u(new C0094j(scheduledFuture, 0));
        } else {
            I.f1229e0.b(j, c0100m);
        }
    }

    @Override // F6.B
    public final void c(n6.i iVar, Runnable runnable) {
        try {
            this.f1259c.execute(runnable);
        } catch (RejectedExecutionException e7) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e7);
            InterfaceC0091h0 interfaceC0091h0 = (InterfaceC0091h0) iVar.get(C.f1216b);
            if (interfaceC0091h0 != null) {
                interfaceC0091h0.cancel(cancellationException);
            }
            P.f1238b.c(iVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f1259c;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0081c0) && ((C0081c0) obj).f1259c == this.f1259c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1259c);
    }

    @Override // F6.B
    public final String toString() {
        return this.f1259c.toString();
    }
}
