package D;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class r implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f766a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f767b;

    public r(int i7) {
        this.f766a = i7;
        switch (i7) {
            case 1:
                this.f767b = new AtomicInteger(0);
                return;
            case 2:
                this.f767b = new AtomicInteger(0);
                return;
            default:
                this.f767b = new AtomicInteger(0);
                return;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f766a) {
            case 0:
                Thread thread = new Thread(runnable);
                Locale locale = Locale.US;
                int andIncrement = this.f767b.getAndIncrement();
                thread.setName("CameraX-core_camera_" + andIncrement);
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                Locale locale2 = Locale.US;
                int andIncrement2 = this.f767b.getAndIncrement();
                thread2.setName("CameraX-camerax_io_" + andIncrement2);
                return thread2;
            default:
                Thread thread3 = new Thread(runnable);
                thread3.setName("arch_disk_io_" + this.f767b.getAndIncrement());
                return thread3;
        }
    }
}
