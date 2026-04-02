package m5;

import H.h;
import androidx.lifecycle.E;
import androidx.lifecycle.EnumC0562n;
import androidx.lifecycle.InterfaceC0567t;
import com.google.android.gms.common.internal.C0765n;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k5.C1405h;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public abstract class c implements Closeable, InterfaceC0567t {

    /* renamed from: e  reason: collision with root package name */
    public static final C0765n f14054e = new C0765n("MobileVisionBase", StringUtils.EMPTY);

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f14055a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final C1405h f14056b;

    /* renamed from: c  reason: collision with root package name */
    public final CancellationTokenSource f14057c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f14058d;

    public c(C1405h c1405h, Executor executor) {
        this.f14056b = c1405h;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.f14057c = cancellationTokenSource;
        this.f14058d = executor;
        ((AtomicInteger) c1405h.f3230b).incrementAndGet();
        c1405h.a(executor, f.f14060a, cancellationTokenSource.getToken()).addOnFailureListener(g.f14061a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, g5.InterfaceC1009a
    @E(EnumC0562n.ON_DESTROY)
    public synchronized void close() {
        boolean z7 = true;
        if (!this.f14055a.getAndSet(true)) {
            this.f14057c.cancel();
            C1405h c1405h = this.f14056b;
            Executor executor = this.f14058d;
            if (((AtomicInteger) c1405h.f3230b).get() <= 0) {
                z7 = false;
            }
            I.l(z7);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            ((K5.d) c1405h.f3229a).h(new h(19, c1405h, taskCompletionSource), executor);
            taskCompletionSource.getTask();
        }
    }
}
