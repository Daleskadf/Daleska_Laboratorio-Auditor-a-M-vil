package e5;

import com.google.android.gms.internal.mlkit_common.zzav;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class h extends zzav {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f10898b = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f10899a;

    public h() {
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: e5.p
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return defaultThreadFactory.newThread(new o(runnable, 1));
            }
        });
        this.f10899a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Deque deque = (Deque) f10898b.get();
        if (deque != null && deque.size() <= 1) {
            deque.add(runnable);
            if (deque.size() <= 1) {
                do {
                    runnable.run();
                    deque.removeFirst();
                    runnable = (Runnable) deque.peekFirst();
                } while (runnable != null);
                return;
            }
            return;
        }
        this.f10899a.execute(new o(runnable, 0));
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, com.google.android.gms.internal.mlkit_common.zzx
    public final /* synthetic */ Object zza() {
        return this.f10899a;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav
    public final ExecutorService zzb() {
        return this.f10899a;
    }
}
