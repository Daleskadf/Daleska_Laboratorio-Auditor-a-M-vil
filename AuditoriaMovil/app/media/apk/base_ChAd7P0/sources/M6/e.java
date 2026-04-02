package M6;

import F6.AbstractC0079b0;
import F6.B;
import K6.AbstractC0208a;
import K6.x;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class e extends AbstractC0079b0 implements Executor {

    /* renamed from: c  reason: collision with root package name */
    public static final e f3289c = new B();

    /* renamed from: d  reason: collision with root package name */
    public static final B f3290d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [M6.e, F6.B] */
    /* JADX WARN: Type inference failed for: r2v3, types: [K6.i] */
    static {
        m mVar = m.f3304c;
        int i7 = x.f2808a;
        if (64 >= i7) {
            i7 = 64;
        }
        int k2 = AbstractC0208a.k("kotlinx.coroutines.io.parallelism", i7, 0, 0, 12);
        mVar.getClass();
        if (k2 >= 1) {
            if (k2 < l.f3300d) {
                if (k2 >= 1) {
                    mVar = new K6.i(mVar, k2);
                } else {
                    throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(k2, "Expected positive parallelism level, but got ").toString());
                }
            }
            f3290d = mVar;
            return;
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(k2, "Expected positive parallelism level, but got ").toString());
    }

    @Override // F6.B
    public final void c(n6.i iVar, Runnable runnable) {
        f3290d.c(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(n6.j.f14394a, runnable);
    }

    @Override // F6.B
    public final String toString() {
        return "Dispatchers.IO";
    }
}
