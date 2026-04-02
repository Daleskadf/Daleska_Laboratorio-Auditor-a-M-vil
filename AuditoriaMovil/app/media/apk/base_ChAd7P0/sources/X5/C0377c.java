package X5;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
/* renamed from: X5.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0377c {

    /* renamed from: a  reason: collision with root package name */
    public final A4.c f6457a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap f6458b = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f6459c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f6460d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final ReferenceQueue f6461e = new ReferenceQueue();
    public final HashMap f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Handler f6462g;

    /* renamed from: h  reason: collision with root package name */
    public final C.b f6463h;

    /* renamed from: i  reason: collision with root package name */
    public long f6464i;
    public boolean j;

    /* renamed from: k  reason: collision with root package name */
    public final long f6465k;

    public C0377c(A4.c cVar) {
        this.f6457a = cVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f6462g = handler;
        C.b bVar = new C.b(this, 22);
        this.f6463h = bVar;
        this.f6464i = 65536L;
        this.f6465k = 3000L;
        handler.postDelayed(bVar, 3000L);
    }

    public final void a(Object instance, long j) {
        kotlin.jvm.internal.j.e(instance, "instance");
        f();
        c(instance, j);
    }

    public final long b(Object instance) {
        kotlin.jvm.internal.j.e(instance, "instance");
        f();
        if (!d(instance)) {
            long j = this.f6464i;
            this.f6464i = 1 + j;
            c(instance, j);
            return j;
        }
        Class<?> cls = instance.getClass();
        throw new IllegalArgumentException(("Instance of " + cls + " has already been added.").toString());
    }

    public final void c(Object obj, long j) {
        if (j >= 0) {
            HashMap hashMap = this.f6459c;
            if (!hashMap.containsKey(Long.valueOf(j))) {
                WeakReference weakReference = new WeakReference(obj, this.f6461e);
                this.f6458b.put(obj, Long.valueOf(j));
                hashMap.put(Long.valueOf(j), weakReference);
                this.f.put(weakReference, Long.valueOf(j));
                this.f6460d.put(Long.valueOf(j), obj);
                return;
            }
            throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.g("Identifier has already been added: ", j).toString());
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.g("Identifier must be >= 0: ", j).toString());
    }

    public final boolean d(Object obj) {
        f();
        return this.f6458b.containsKey(obj);
    }

    public final Object e(long j) {
        f();
        WeakReference weakReference = (WeakReference) this.f6459c.get(Long.valueOf(j));
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void f() {
        if (this.j) {
            Log.w("PigeonInstanceManager", "The manager was used after calls to the PigeonFinalizationListener has been stopped.");
        }
    }
}
