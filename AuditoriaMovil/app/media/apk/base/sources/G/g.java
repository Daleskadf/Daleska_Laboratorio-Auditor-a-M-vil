package G;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class g implements Executor {

    /* renamed from: c  reason: collision with root package name */
    public static volatile g f1336c;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1337a;

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f1338b;

    public g(ExecutorService executorService) {
        this.f1337a = 1;
        this.f1338b = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1337a) {
            case 0:
                this.f1338b.execute(runnable);
                return;
            default:
                this.f1338b.execute(new D2.g(runnable, 0));
                return;
        }
    }

    public g() {
        this.f1337a = 0;
        this.f1338b = Executors.newSingleThreadExecutor(new f(0));
    }
}
