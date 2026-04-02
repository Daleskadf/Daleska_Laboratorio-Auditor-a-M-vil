package Y6;

import java.util.concurrent.ThreadFactory;
import org.apache.tika.concurrent.SimpleThreadPoolExecutor;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread lambda$new$0;
        lambda$new$0 = SimpleThreadPoolExecutor.lambda$new$0(runnable);
        return lambda$new$0;
    }
}
