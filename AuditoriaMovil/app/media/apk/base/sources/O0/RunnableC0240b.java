package O0;

import D.AbstractC0059i;
import H0.C0126f;
import android.util.SparseArray;
import androidx.camera.core.impl.AbstractC0508j;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p4.C1683m;
import w.C1914Y;
/* renamed from: O0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0240b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3666a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3667b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3668c;

    public /* synthetic */ RunnableC0240b(Object obj, int i7, int i8) {
        this.f3666a = i8;
        this.f3668c = obj;
        this.f3667b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        boolean z8;
        switch (this.f3666a) {
            case 0:
                C0242d c0242d = ((C0241c) this.f3668c).f3673b;
                c0242d.getClass();
                int i7 = this.f3667b;
                if (i7 != -3 && i7 != -2) {
                    if (i7 != -1) {
                        if (i7 != 1) {
                            AbstractC0059i.J("Unknown focus change type: ", i7, "AudioFocusManager");
                            return;
                        }
                        c0242d.c(2);
                        E e7 = c0242d.f3681c;
                        if (e7 != null) {
                            H h8 = e7.f3482a;
                            h8.W(1, 1, h8.K());
                            return;
                        }
                        return;
                    }
                    E e8 = c0242d.f3681c;
                    if (e8 != null) {
                        H h9 = e8.f3482a;
                        h9.W(-1, 2, h9.K());
                    }
                    c0242d.a();
                    c0242d.c(1);
                    return;
                }
                if (i7 != -2) {
                    C0126f c0126f = c0242d.f3682d;
                    if (c0126f != null && c0126f.f1798a == 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (!z7) {
                        c0242d.c(4);
                        return;
                    }
                }
                E e9 = c0242d.f3681c;
                if (e9 != null) {
                    H h10 = e9.f3482a;
                    h10.W(0, 1, h10.K());
                }
                c0242d.c(3);
                return;
            case 1:
                int i8 = 4 & this.f3667b;
                B.a aVar = ((io.flutter.plugin.platform.e) this.f3668c).f11694b;
                if (i8 == 0) {
                    A.f fVar = (A.f) aVar.f225c;
                    fVar.getClass();
                    ((L5.r) fVar.f10b).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                    return;
                }
                A.f fVar2 = (A.f) aVar.f225c;
                fVar2.getClass();
                ((L5.r) fVar2.f10b).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                return;
            case 2:
                C1683m c1683m = (C1683m) this.f3668c;
                SparseArray sparseArray = c1683m.f15274k;
                int i9 = this.f3667b;
                p4.Y y2 = (p4.Y) sparseArray.get(i9);
                if (y2 != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                m5.d.i("Tried to release nonexistent target: %s", z8, Integer.valueOf(i9));
                Iterator it = c1683m.f15272h.o0(i9).iterator();
                while (true) {
                    e4.d dVar = (e4.d) it;
                    boolean hasNext = ((Iterator) dVar.f10875b).hasNext();
                    H4.W w2 = c1683m.f15266a;
                    if (hasNext) {
                        w2.t().D((q4.h) dVar.next());
                    } else {
                        w2.t().k(y2);
                        sparseArray.remove(i9);
                        c1683m.f15275l.remove(y2.f15235a);
                        return;
                    }
                }
            case 3:
                ((AbstractC0508j) this.f3668c).a(this.f3667b);
                return;
            default:
                int i10 = this.f3667b;
                Iterator it2 = ((LinkedHashSet) this.f3668c).iterator();
                while (it2.hasNext()) {
                    C1914Y c1914y = (C1914Y) it2.next();
                    if (i10 == 5) {
                        synchronized (c1914y.f16160p) {
                            try {
                                if (c1914y.n() && c1914y.f16161q != null) {
                                    c1914y.l("Close DeferrableSurfaces for CameraDevice error.");
                                    Iterator it3 = c1914y.f16161q.iterator();
                                    while (it3.hasNext()) {
                                        ((androidx.camera.core.impl.J) it3.next()).a();
                                    }
                                }
                            } finally {
                            }
                        }
                    } else {
                        c1914y.getClass();
                    }
                }
                return;
        }
    }
}
