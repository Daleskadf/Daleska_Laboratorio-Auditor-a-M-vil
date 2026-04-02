package e5;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f10892b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static f f10893c;

    /* renamed from: a  reason: collision with root package name */
    public final zza f10894a;

    public f(Looper looper) {
        this.f10894a = new zza(looper);
    }

    public static f a() {
        f fVar;
        synchronized (f10892b) {
            try {
                if (f10893c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f10893c = new f(handlerThread.getLooper());
                }
                fVar = f10893c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        n.zza.execute(new H.h(18, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
