package P6;

import android.os.Handler;
import android.os.Looper;
import java.lang.Thread;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4065a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4066b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f4065a = i7;
        this.f4066b = obj;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        switch (this.f4065a) {
            case 0:
                new Handler(Looper.getMainLooper()).post(new d((f) this.f4066b, th.getMessage(), 1));
                return;
            default:
                ((u4.c) this.f4066b).f15987d.c(th);
                return;
        }
    }
}
