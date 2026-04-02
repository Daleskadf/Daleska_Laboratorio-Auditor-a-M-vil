package E0;

import H.h;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class a implements Runnable {
    public static Handler f;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ V2.d f932e;

    /* renamed from: b  reason: collision with root package name */
    public volatile e f929b = e.PENDING;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f930c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f931d = new AtomicBoolean();

    /* renamed from: a  reason: collision with root package name */
    public final c f928a = new c(this, new b(this, 0));

    public a(V2.d dVar) {
        this.f932e = dVar;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f == null) {
                    f = new Handler(Looper.getMainLooper());
                }
                handler = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new h(this, obj, 1, false));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f932e.b();
    }
}
