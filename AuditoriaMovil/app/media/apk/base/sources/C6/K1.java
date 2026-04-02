package c6;

import java.lang.Thread;
/* loaded from: classes.dex */
public final class K1 implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw new a6.q0(a6.o0.d(th).g("Uncaught exception in the SynchronizationContext. Re-thrown."));
    }
}
