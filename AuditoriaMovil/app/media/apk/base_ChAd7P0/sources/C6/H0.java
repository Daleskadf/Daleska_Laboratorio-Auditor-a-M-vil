package c6;

import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class H0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f8470b = Logger.getLogger(H0.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f8471a;

    public H0(Runnable runnable) {
        this.f8471a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f8471a;
        try {
            runnable.run();
        } catch (Throwable th) {
            Level level = Level.SEVERE;
            f8470b.log(level, "Exception while executing runnable " + runnable, (Throwable) th);
            Object obj = z3.r.f16897a;
            if (!(th instanceof RuntimeException)) {
                if (!(th instanceof Error)) {
                    throw new AssertionError(th);
                }
                throw th;
            }
            throw ((RuntimeException) th);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.f8471a + ")";
    }
}
