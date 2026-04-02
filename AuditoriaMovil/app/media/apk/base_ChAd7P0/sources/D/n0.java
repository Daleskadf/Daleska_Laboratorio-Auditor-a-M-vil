package D;

import android.util.ArrayMap;
import android.view.Surface;
import androidx.camera.core.impl.AbstractC0508j;
import androidx.camera.core.impl.C0501c;
import androidx.camera.core.impl.InterfaceC0515q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class n0 implements androidx.camera.core.impl.T {

    /* renamed from: X  reason: collision with root package name */
    public Object f751X;

    /* renamed from: a  reason: collision with root package name */
    public int f752a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f753b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f754c;

    /* renamed from: d  reason: collision with root package name */
    public Object f755d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f756e;
    public Object f;

    public n0(androidx.camera.core.impl.T t7) {
        this.f754c = new Object();
        this.f752a = 0;
        this.f753b = false;
        this.f751X = new S(this, 1);
        this.f755d = t7;
        this.f756e = t7.getSurface();
    }

    @Override // androidx.camera.core.impl.T
    public int E() {
        int E4;
        synchronized (this.f754c) {
            E4 = ((androidx.camera.core.impl.T) this.f755d).E();
        }
        return E4;
    }

    @Override // androidx.camera.core.impl.T
    public b0 M() {
        T t7;
        synchronized (this.f754c) {
            b0 M7 = ((androidx.camera.core.impl.T) this.f755d).M();
            if (M7 != null) {
                this.f752a++;
                t7 = new T(M7);
                t7.a((S) this.f751X);
            } else {
                t7 = null;
            }
        }
        return t7;
    }

    @Override // androidx.camera.core.impl.T
    public void N(androidx.camera.core.impl.S s7, Executor executor) {
        synchronized (this.f754c) {
            ((androidx.camera.core.impl.T) this.f755d).N(new A4.d(3, this, s7), executor);
        }
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b((AbstractC0508j) it.next());
        }
    }

    @Override // androidx.camera.core.impl.T
    public b0 acquireLatestImage() {
        T t7;
        synchronized (this.f754c) {
            b0 acquireLatestImage = ((androidx.camera.core.impl.T) this.f755d).acquireLatestImage();
            if (acquireLatestImage != null) {
                this.f752a++;
                t7 = new T(acquireLatestImage);
                t7.a((S) this.f751X);
            } else {
                t7 = null;
            }
        }
        return t7;
    }

    public void b(AbstractC0508j abstractC0508j) {
        ArrayList arrayList = (ArrayList) this.f756e;
        if (arrayList.contains(abstractC0508j)) {
            return;
        }
        arrayList.add(abstractC0508j);
    }

    @Override // androidx.camera.core.impl.T
    public int c() {
        int c8;
        synchronized (this.f754c) {
            c8 = ((androidx.camera.core.impl.T) this.f755d).c();
        }
        return c8;
    }

    @Override // androidx.camera.core.impl.T
    public void close() {
        synchronized (this.f754c) {
            try {
                Surface surface = (Surface) this.f756e;
                if (surface != null) {
                    surface.release();
                }
                ((androidx.camera.core.impl.T) this.f755d).close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(androidx.camera.core.impl.G g3) {
        for (C0501c c0501c : g3.H()) {
            androidx.camera.core.impl.W w2 = (androidx.camera.core.impl.W) this.f755d;
            w2.getClass();
            try {
                w2.G(c0501c);
            } catch (IllegalArgumentException unused) {
            }
            ((androidx.camera.core.impl.W) this.f755d).i(c0501c, g3.e0(c0501c), g3.G(c0501c));
        }
    }

    public androidx.camera.core.impl.E e() {
        ArrayList arrayList = new ArrayList((HashSet) this.f754c);
        androidx.camera.core.impl.Z a7 = androidx.camera.core.impl.Z.a((androidx.camera.core.impl.W) this.f755d);
        int i7 = this.f752a;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f756e);
        boolean z7 = this.f753b;
        androidx.camera.core.impl.u0 u0Var = androidx.camera.core.impl.u0.f7673b;
        ArrayMap arrayMap = new ArrayMap();
        androidx.camera.core.impl.Y y2 = (androidx.camera.core.impl.Y) this.f;
        for (String str : y2.f7674a.keySet()) {
            arrayMap.put(str, y2.f7674a.get(str));
        }
        return new androidx.camera.core.impl.E(arrayList, a7, i7, arrayList2, z7, new androidx.camera.core.impl.u0(arrayMap), (InterfaceC0515q) this.f751X);
    }

    public void f() {
        synchronized (this.f754c) {
            try {
                this.f753b = true;
                ((androidx.camera.core.impl.T) this.f755d).y();
                if (this.f752a == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.T
    public int getHeight() {
        int height;
        synchronized (this.f754c) {
            height = ((androidx.camera.core.impl.T) this.f755d).getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.T
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f754c) {
            surface = ((androidx.camera.core.impl.T) this.f755d).getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.T
    public int getWidth() {
        int width;
        synchronized (this.f754c) {
            width = ((androidx.camera.core.impl.T) this.f755d).getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.T
    public void y() {
        synchronized (this.f754c) {
            ((androidx.camera.core.impl.T) this.f755d).y();
        }
    }

    public n0() {
        this.f754c = new HashSet();
        this.f755d = androidx.camera.core.impl.W.b();
        this.f752a = -1;
        this.f756e = new ArrayList();
        this.f753b = false;
        this.f = androidx.camera.core.impl.Y.a();
    }

    public n0(androidx.camera.core.impl.E e7) {
        HashSet hashSet = new HashSet();
        this.f754c = hashSet;
        this.f755d = androidx.camera.core.impl.W.b();
        this.f752a = -1;
        ArrayList arrayList = new ArrayList();
        this.f756e = arrayList;
        this.f753b = false;
        this.f = androidx.camera.core.impl.Y.a();
        hashSet.addAll(e7.f7535a);
        this.f755d = androidx.camera.core.impl.W.c(e7.f7536b);
        this.f752a = e7.f7537c;
        arrayList.addAll(e7.f7538d);
        this.f753b = e7.f7539e;
        ArrayMap arrayMap = new ArrayMap();
        androidx.camera.core.impl.u0 u0Var = e7.f;
        for (String str : u0Var.f7674a.keySet()) {
            arrayMap.put(str, u0Var.f7674a.get(str));
        }
        this.f = new androidx.camera.core.impl.u0(arrayMap);
    }
}
