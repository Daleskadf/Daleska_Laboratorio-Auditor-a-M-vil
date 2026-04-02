package F6;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public final class I extends Z implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: e0  reason: collision with root package name */
    public static final I f1229e0;

    /* renamed from: f0  reason: collision with root package name */
    public static final long f1230f0;

    /* JADX WARN: Type inference failed for: r0v0, types: [F6.I, F6.Z, F6.a0] */
    static {
        Long l8;
        ?? z7 = new Z();
        f1229e0 = z7;
        z7.m(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l8 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l8 = 1000L;
        }
        f1230f0 = timeUnit.toNanos(l8.longValue());
    }

    @Override // F6.Z, F6.M
    public final S a(long j, H0 h02, n6.i iVar) {
        long j8 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j8 = Long.MAX_VALUE;
            } else {
                j8 = 1000000 * j;
            }
        }
        if (j8 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            W w2 = new W(j8 + nanoTime, h02);
            t(nanoTime, w2);
            return w2;
        }
        return z0.f1325a;
    }

    @Override // F6.AbstractC0077a0
    public final Thread j() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // F6.AbstractC0077a0
    public final void p(long j, X x7) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // F6.Z
    public final void q(Runnable runnable) {
        if (debugStatus != 4) {
            super.q(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        boolean z8;
        boolean s7;
        F0.f1218a.set(this);
        try {
            synchronized (this) {
                int i7 = debugStatus;
                if (i7 != 2 && i7 != 3) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (z7) {
                    if (!s7) {
                        return;
                    }
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long n7 = n();
                    if (n7 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f1230f0 + nanoTime;
                        }
                        long j8 = j - nanoTime;
                        if (j8 <= 0) {
                            _thread = null;
                            u();
                            if (!s()) {
                                j();
                                return;
                            }
                            return;
                        } else if (n7 > j8) {
                            n7 = j8;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (n7 > 0) {
                        int i8 = debugStatus;
                        if (i8 != 2 && i8 != 3) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (z8) {
                            _thread = null;
                            u();
                            if (!s()) {
                                j();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, n7);
                    }
                }
            }
        } finally {
            _thread = null;
            u();
            if (!s()) {
                j();
            }
        }
    }

    @Override // F6.Z, F6.AbstractC0077a0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void u() {
        boolean z7;
        int i7 = debugStatus;
        if (i7 != 2 && i7 != 3) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (!z7) {
            return;
        }
        debugStatus = 3;
        Z.f1248X.set(this, null);
        Z.f1249Y.set(this, null);
        notifyAll();
    }
}
