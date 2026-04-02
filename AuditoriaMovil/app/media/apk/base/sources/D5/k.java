package D5;

import D.RunnableC0073x;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public final class k implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f894a;

    public k() {
        Handler handler;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handler = Handler.createAsync(mainLooper);
        } else {
            handler = new Handler(mainLooper);
        }
        this.f894a = handler;
    }

    @Override // D5.d
    public final void a(RunnableC0073x runnableC0073x) {
        this.f894a.post(runnableC0073x);
    }
}
