package D;

import android.media.ImageReader;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class g0 implements androidx.camera.core.impl.T, F {

    /* renamed from: X  reason: collision with root package name */
    public androidx.camera.core.impl.S f702X;

    /* renamed from: Y  reason: collision with root package name */
    public Executor f703Y;

    /* renamed from: Z  reason: collision with root package name */
    public final LongSparseArray f704Z;

    /* renamed from: a  reason: collision with root package name */
    public final Object f705a;

    /* renamed from: b  reason: collision with root package name */
    public final f0 f706b;

    /* renamed from: c  reason: collision with root package name */
    public int f707c;

    /* renamed from: d  reason: collision with root package name */
    public final A.j f708d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f709e;

    /* renamed from: e0  reason: collision with root package name */
    public final LongSparseArray f710e0;
    public final C0054d f;

    /* renamed from: f0  reason: collision with root package name */
    public int f711f0;

    /* renamed from: g0  reason: collision with root package name */
    public final ArrayList f712g0;

    /* renamed from: h0  reason: collision with root package name */
    public final ArrayList f713h0;

    public g0(int i7, int i8, int i9, int i10) {
        C0054d c0054d = new C0054d(ImageReader.newInstance(i7, i8, i9, i10));
        this.f705a = new Object();
        this.f706b = new f0(this, 0);
        this.f707c = 0;
        this.f708d = new A.j(this, 3);
        this.f709e = false;
        this.f704Z = new LongSparseArray();
        this.f710e0 = new LongSparseArray();
        this.f713h0 = new ArrayList();
        this.f = c0054d;
        this.f711f0 = 0;
        this.f712g0 = new ArrayList(E());
    }

    @Override // androidx.camera.core.impl.T
    public final int E() {
        int E4;
        synchronized (this.f705a) {
            E4 = this.f.E();
        }
        return E4;
    }

    @Override // androidx.camera.core.impl.T
    public final b0 M() {
        synchronized (this.f705a) {
            try {
                if (this.f712g0.isEmpty()) {
                    return null;
                }
                if (this.f711f0 < this.f712g0.size()) {
                    ArrayList arrayList = this.f712g0;
                    int i7 = this.f711f0;
                    this.f711f0 = i7 + 1;
                    b0 b0Var = (b0) arrayList.get(i7);
                    this.f713h0.add(b0Var);
                    return b0Var;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.T
    public final void N(androidx.camera.core.impl.S s7, Executor executor) {
        synchronized (this.f705a) {
            s7.getClass();
            this.f702X = s7;
            executor.getClass();
            this.f703Y = executor;
            this.f.N(this.f708d, executor);
        }
    }

    @Override // D.F
    public final void a(G g3) {
        synchronized (this.f705a) {
            b(g3);
        }
    }

    @Override // androidx.camera.core.impl.T
    public final b0 acquireLatestImage() {
        synchronized (this.f705a) {
            try {
                if (this.f712g0.isEmpty()) {
                    return null;
                }
                if (this.f711f0 < this.f712g0.size()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i7 = 0; i7 < this.f712g0.size() - 1; i7++) {
                        if (!this.f713h0.contains(this.f712g0.get(i7))) {
                            arrayList.add((b0) this.f712g0.get(i7));
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((b0) it.next()).close();
                    }
                    int size = this.f712g0.size();
                    ArrayList arrayList2 = this.f712g0;
                    this.f711f0 = size;
                    b0 b0Var = (b0) arrayList2.get(size - 1);
                    this.f713h0.add(b0Var);
                    return b0Var;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(G g3) {
        synchronized (this.f705a) {
            try {
                int indexOf = this.f712g0.indexOf(g3);
                if (indexOf >= 0) {
                    this.f712g0.remove(indexOf);
                    int i7 = this.f711f0;
                    if (indexOf <= i7) {
                        this.f711f0 = i7 - 1;
                    }
                }
                this.f713h0.remove(g3);
                if (this.f707c > 0) {
                    e(this.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.T
    public final int c() {
        int c8;
        synchronized (this.f705a) {
            c8 = this.f.c();
        }
        return c8;
    }

    @Override // androidx.camera.core.impl.T
    public final void close() {
        synchronized (this.f705a) {
            try {
                if (this.f709e) {
                    return;
                }
                Iterator it = new ArrayList(this.f712g0).iterator();
                while (it.hasNext()) {
                    ((b0) it.next()).close();
                }
                this.f712g0.clear();
                this.f.close();
                this.f709e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(o0 o0Var) {
        androidx.camera.core.impl.S s7;
        Executor executor;
        synchronized (this.f705a) {
            try {
                if (this.f712g0.size() < E()) {
                    o0Var.a(this);
                    this.f712g0.add(o0Var);
                    s7 = this.f702X;
                    executor = this.f703Y;
                } else {
                    org.slf4j.helpers.i.l("TAG", "Maximum image number reached.");
                    o0Var.close();
                    s7 = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (s7 != null) {
            if (executor != null) {
                executor.execute(new RunnableC0053c(2, this, s7));
            } else {
                s7.b(this);
            }
        }
    }

    public final void e(androidx.camera.core.impl.T t7) {
        b0 b0Var;
        synchronized (this.f705a) {
            try {
                if (this.f709e) {
                    return;
                }
                int size = this.f710e0.size() + this.f712g0.size();
                if (size >= t7.E()) {
                    org.slf4j.helpers.i.l("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        b0Var = t7.M();
                        if (b0Var != null) {
                            this.f707c--;
                            size++;
                            this.f710e0.put(b0Var.h().b(), b0Var);
                            f();
                        }
                    } catch (IllegalStateException e7) {
                        String N7 = org.slf4j.helpers.i.N("MetadataImageReader");
                        if (org.slf4j.helpers.i.E(3, N7)) {
                            Log.d(N7, "Failed to acquire next image.", e7);
                        }
                        b0Var = null;
                    }
                    if (b0Var == null || this.f707c <= 0) {
                        break;
                    }
                } while (size < t7.E());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.f705a) {
            try {
                for (int size = this.f704Z.size() - 1; size >= 0; size--) {
                    Y y2 = (Y) this.f704Z.valueAt(size);
                    long b5 = y2.b();
                    b0 b0Var = (b0) this.f710e0.get(b5);
                    if (b0Var != null) {
                        this.f710e0.remove(b5);
                        this.f704Z.removeAt(size);
                        d(new o0(b0Var, null, y2));
                    }
                }
                g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.f705a) {
            try {
                if (this.f710e0.size() != 0 && this.f704Z.size() != 0) {
                    long keyAt = this.f710e0.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.f704Z.keyAt(0);
                    g0.c.b(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.f710e0.size() - 1; size >= 0; size--) {
                            if (this.f710e0.keyAt(size) < keyAt2) {
                                ((b0) this.f710e0.valueAt(size)).close();
                                this.f710e0.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f704Z.size() - 1; size2 >= 0; size2--) {
                            if (this.f704Z.keyAt(size2) < keyAt) {
                                this.f704Z.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.core.impl.T
    public final int getHeight() {
        int height;
        synchronized (this.f705a) {
            height = this.f.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.T
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f705a) {
            surface = this.f.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.T
    public final int getWidth() {
        int width;
        synchronized (this.f705a) {
            width = this.f.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.T
    public final void y() {
        synchronized (this.f705a) {
            this.f.y();
            this.f702X = null;
            this.f703Y = null;
            this.f707c = 0;
        }
    }
}
