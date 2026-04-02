package W1;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6143a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f6144b;

    public /* synthetic */ f(Context context, int i7) {
        this.f6143a = i7;
        this.f6144b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6143a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new f(this.f6144b, 1));
                return;
            default:
                e.s(this.f6144b, new c(0), e.f6135a, false);
                return;
        }
    }
}
