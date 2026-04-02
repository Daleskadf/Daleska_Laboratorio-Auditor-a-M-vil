package D2;

import android.util.Log;
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f846a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f847b;

    public /* synthetic */ g(Runnable runnable, int i7) {
        this.f846a = i7;
        this.f847b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f846a) {
            case 0:
                try {
                    this.f847b.run();
                    return;
                } catch (Exception e7) {
                    Log.e("TransportRuntime.".concat("Executor"), "Background execution failure.", e7);
                    return;
                }
            case 1:
                this.f847b.run();
                return;
            default:
                this.f847b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f846a) {
            case 2:
                return this.f847b.toString();
            default:
                return super.toString();
        }
    }
}
