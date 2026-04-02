package c6;

import a6.EnumC0477f;
import a6.EnumC0486o;
import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class M0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Z0 f8501a;

    public M0(Z0 z02) {
        this.f8501a = z02;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = Z0.f8665g0;
        Level level = Level.SEVERE;
        StringBuilder sb = new StringBuilder("[");
        Z0 z02 = this.f8501a;
        sb.append(z02.f8701d);
        sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.log(level, sb.toString(), th);
        if (!z02.f8675C) {
            z02.f8675C = true;
            z02.B(true);
            z02.G(false);
            L0 l02 = new L0(th);
            z02.f8674B = l02;
            z02.f8680H.i(l02);
            z02.f8692T.t(null);
            z02.f8690R.l(EnumC0477f.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
            z02.f8719u.b(EnumC0486o.TRANSIENT_FAILURE);
        }
    }
}
