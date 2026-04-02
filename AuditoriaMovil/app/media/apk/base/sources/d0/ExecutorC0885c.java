package d0;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* renamed from: d0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0885c implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10162a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f10163b;

    public ExecutorC0885c(Looper looper) {
        this.f10163b = new zzi(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f10162a) {
            case 0:
                runnable.getClass();
                Handler handler = this.f10163b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                ((zzi) this.f10163b).post(runnable);
                return;
        }
    }

    public ExecutorC0885c(Handler handler) {
        this.f10163b = handler;
    }
}
