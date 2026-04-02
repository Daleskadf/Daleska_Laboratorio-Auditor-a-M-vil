package e0;

import android.os.Process;
/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final int f10614a;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f10614a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f10614a);
        super.run();
    }
}
