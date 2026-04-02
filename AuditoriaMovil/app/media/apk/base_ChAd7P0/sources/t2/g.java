package t2;

import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class g implements L5.t {

    /* renamed from: b  reason: collision with root package name */
    public static g f15732b;

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList f15733a = new CopyOnWriteArrayList();

    public static k a(Context context, boolean z7, o oVar) {
        if (z7) {
            return new m(context, oVar);
        }
        try {
            if (W2.e.f6170d.d(context, W2.f.f6171a) == 0) {
                return new f(context, oVar);
            }
        } catch (NoClassDefFoundError unused) {
        }
        return new m(context, oVar);
    }

    public static synchronized g b() {
        g gVar;
        synchronized (g.class) {
            try {
                if (f15732b == null) {
                    f15732b = new g();
                }
                gVar = f15732b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // L5.t
    public final boolean onActivityResult(int i7, int i8, Intent intent) {
        Iterator it = this.f15733a.iterator();
        while (it.hasNext()) {
            if (((k) it.next()).a(i7, i8)) {
                return true;
            }
        }
        return false;
    }
}
