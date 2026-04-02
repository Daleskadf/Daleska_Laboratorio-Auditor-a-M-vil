package U;

import D.AbstractC0059i;
import H4.W;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public abstract class h implements E3.b {

    /* renamed from: X  reason: collision with root package name */
    public static final Object f5523X;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f5524d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f5525e = Logger.getLogger(h.class.getName());
    public static final W f;

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f5526a;

    /* renamed from: b  reason: collision with root package name */
    public volatile d f5527b;

    /* renamed from: c  reason: collision with root package name */
    public volatile g f5528c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [H4.W] */
    /* JADX WARN: Type inference failed for: r4v6 */
    static {
        e eVar;
        try {
            th = null;
            eVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "a"));
        } catch (Throwable th) {
            th = th;
            eVar = new Object();
        }
        f = eVar;
        if (th != null) {
            f5525e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f5523X = new Object();
    }

    public static void d(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.f5528c;
        } while (!f.e(hVar, gVar, g.f5520c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f5521a;
            if (thread != null) {
                gVar.f5521a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f5522b;
        }
        hVar.c();
        do {
            dVar2 = hVar.f5527b;
        } while (!f.c(hVar, dVar2, d.f5512d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f5515c;
            dVar.f5515c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f5515c;
            e(dVar3.f5513a, dVar3.f5514b);
            dVar3 = dVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            Level level = Level.SEVERE;
            f5525e.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object f(Object obj) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof c)) {
                if (obj == f5523X) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c) obj).f5511a);
        }
        CancellationException cancellationException = ((a) obj).f5509b;
        CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
        cancellationException2.initCause(cancellationException);
        throw cancellationException2;
    }

    public static Object g(h hVar) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = hVar.get();
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
        return obj;
    }

    @Override // E3.b
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f5527b;
        d dVar2 = d.f5512d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f5515c = dVar;
                if (f.c(this, dVar, dVar3)) {
                    return;
                }
                dVar = this.f5527b;
            } while (dVar != dVar2);
            e(runnable, executor);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        String valueOf;
        try {
            Object g3 = g(this);
            sb.append("SUCCESS, result=[");
            if (g3 == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(g3);
            }
            sb.append(valueOf);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e7) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e7.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        a aVar;
        Object obj = this.f5526a;
        if (obj != null) {
            return false;
        }
        if (f5524d) {
            aVar = new a(z7, new CancellationException("Future.cancel() was called."));
        } else if (z7) {
            aVar = a.f5506c;
        } else {
            aVar = a.f5507d;
        }
        if (!f.d(this, obj, aVar)) {
            return false;
        }
        d(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f5526a;
            if (obj != null) {
                return f(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                g gVar = this.f5528c;
                g gVar2 = g.f5520c;
                if (gVar != gVar2) {
                    g gVar3 = new g();
                    do {
                        W w2 = f;
                        w2.C(gVar3, gVar);
                        if (w2.e(this, gVar, gVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5526a;
                                    if (obj2 != null) {
                                        return f(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    i(gVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            i(gVar3);
                        } else {
                            gVar = this.f5528c;
                        }
                    } while (gVar != gVar2);
                    return f(this.f5526a);
                }
                return f(this.f5526a);
            }
            while (nanos > 0) {
                Object obj3 = this.f5526a;
                if (obj3 != null) {
                    return f(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String hVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j + StringUtils.SPACE + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String z7 = AbstractC0059i.z(str, " (plus ");
                long j8 = -nanos;
                long convert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
                long nanos2 = j8 - timeUnit.toNanos(convert);
                int i7 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z8 = i7 == 0 || nanos2 > 1000;
                if (i7 > 0) {
                    String str2 = z7 + convert + StringUtils.SPACE + lowerCase;
                    if (z8) {
                        str2 = AbstractC0059i.z(str2, ",");
                    }
                    z7 = AbstractC0059i.z(str2, StringUtils.SPACE);
                }
                if (z8) {
                    z7 = z7 + nanos2 + " nanoseconds ";
                }
                str = AbstractC0059i.z(z7, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(AbstractC0059i.z(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(AbstractC0059i.A(str, " for ", hVar));
        }
        throw new InterruptedException();
    }

    public String h() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void i(g gVar) {
        gVar.f5521a = null;
        while (true) {
            g gVar2 = this.f5528c;
            if (gVar2 == g.f5520c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f5522b;
                if (gVar2.f5521a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f5522b = gVar4;
                    if (gVar3.f5521a == null) {
                        break;
                    }
                } else if (!f.e(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5526a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.f5526a != null) {
            return true;
        }
        return false;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = f5523X;
        }
        if (f.d(this, null, obj)) {
            d(this);
            return true;
        }
        return false;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (f.d(this, null, new c(th))) {
            d(this);
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f5526a instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = h();
            } catch (RuntimeException e7) {
                str = "Exception thrown from implementation: " + e7.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5526a;
            if (obj2 != null) {
                return f(obj2);
            }
            g gVar = this.f5528c;
            g gVar2 = g.f5520c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    W w2 = f;
                    w2.C(gVar3, gVar);
                    if (w2.e(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5526a;
                            } else {
                                i(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    gVar = this.f5528c;
                } while (gVar != gVar2);
                return f(this.f5526a);
            }
            return f(this.f5526a);
        }
        throw new InterruptedException();
    }
}
