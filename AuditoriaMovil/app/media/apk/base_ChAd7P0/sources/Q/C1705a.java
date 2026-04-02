package q;

import a.AbstractC0412a;
import android.os.Looper;
/* renamed from: q.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1705a extends AbstractC0412a {

    /* renamed from: b  reason: collision with root package name */
    public static volatile C1705a f15317b;

    /* renamed from: a  reason: collision with root package name */
    public final C1706b f15318a = new C1706b();

    public static C1705a j0() {
        if (f15317b != null) {
            return f15317b;
        }
        synchronized (C1705a.class) {
            try {
                if (f15317b == null) {
                    f15317b = new C1705a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f15317b;
    }

    public final void k0(Runnable runnable) {
        C1706b c1706b = this.f15318a;
        if (c1706b.f15321c == null) {
            synchronized (c1706b.f15319a) {
                try {
                    if (c1706b.f15321c == null) {
                        c1706b.f15321c = C1706b.j0(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c1706b.f15321c.post(runnable);
    }
}
