package G;

import D.r;
import android.os.Handler;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes.dex */
public final class h implements Executor {

    /* renamed from: c  reason: collision with root package name */
    public static volatile h f1339c;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1340a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1341b;

    public /* synthetic */ h(Handler handler, int i7) {
        this.f1340a = i7;
        this.f1341b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1340a) {
            case 0:
                ((ExecutorService) this.f1341b).execute(runnable);
                return;
            case 1:
                ((zau) this.f1341b).post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = (Handler) this.f1341b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public h() {
        this.f1340a = 0;
        this.f1341b = Executors.newFixedThreadPool(2, new r(1));
    }
}
