package u4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadFactory;
/* renamed from: u4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1872b implements Runnable, ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f15981a = new CountDownLatch(1);

    /* renamed from: b  reason: collision with root package name */
    public Runnable f15982b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f15983c;

    public RunnableC1872b(c cVar) {
        this.f15983c = cVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        boolean z7;
        if (this.f15982b == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Only one thread may be created in an AsyncQueue.", z7, new Object[0]);
        this.f15982b = runnable;
        this.f15981a.countDown();
        return this.f15983c.f15986c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f15981a.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        this.f15982b.run();
    }
}
