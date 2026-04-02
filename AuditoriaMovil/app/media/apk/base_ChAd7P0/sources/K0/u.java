package K0;

import android.os.Handler;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList f2521b = new ArrayList(50);

    /* renamed from: a  reason: collision with root package name */
    public final Handler f2522a;

    public u(Handler handler) {
        this.f2522a = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static t b() {
        t tVar;
        ArrayList arrayList = f2521b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    tVar = new Object();
                } else {
                    tVar = (t) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tVar;
    }

    public final t a(int i7, Object obj) {
        t b5 = b();
        b5.f2520a = this.f2522a.obtainMessage(i7, obj);
        return b5;
    }

    public final boolean c(Runnable runnable) {
        return this.f2522a.post(runnable);
    }

    public final void d(int i7) {
        boolean z7;
        if (i7 != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        a.e(z7);
        this.f2522a.removeMessages(i7);
    }

    public final boolean e(int i7) {
        return this.f2522a.sendEmptyMessage(i7);
    }
}
