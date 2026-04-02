package D;

import O0.RunnableC0239a;
import a6.AbstractC0478g;
import a6.EnumC0477f;
import android.content.Context;
import android.media.Image;
import android.media.ImageReader;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import androidx.lifecycle.C0570w;
import androidx.lifecycle.EnumC0563o;
import b3.C0585f;
import c6.C0709u0;
import c6.C0721y0;
import c6.InterfaceC0669g1;
import c6.RunnableC0646G;
import c6.RunnableC0703s0;
import c6.RunnableC0715w0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.C0814p;
import com.google.firebase.firestore.FirebaseFirestore;
import e.C0924e;
import g1.C1006c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import n4.C1533t;
import org.apache.tika.utils.StringUtils;
import r.C1719d;
import y.InterfaceC2022b;
/* renamed from: D.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054d implements androidx.camera.core.impl.T, InterfaceC0669g1 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f688a;

    /* renamed from: b  reason: collision with root package name */
    public Object f689b;

    /* renamed from: c  reason: collision with root package name */
    public Object f690c;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, K5.s] */
    public C0054d(Z1.e eVar) {
        this.f689b = eVar;
        ?? obj = new Object();
        obj.f2738d = new r.f();
        obj.f2737c = true;
        this.f690c = obj;
    }

    public static boolean d(D d7, D d8) {
        g0.c.g("Fully specified range is not actually fully specified.", d8.b());
        int i7 = d7.f612a;
        int i8 = d8.f612a;
        if (i7 == 2 && i8 == 1) {
            return false;
        }
        if (i7 != 2 && i7 != 0 && i7 != i8) {
            return false;
        }
        int i9 = d7.f613b;
        if (i9 == 0 || i9 == d8.f613b) {
            return true;
        }
        return false;
    }

    public static boolean e(D d7, D d8, HashSet hashSet) {
        if (!hashSet.contains(d8)) {
            org.slf4j.helpers.i.l("DynamicRangeResolver", "Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + d7 + "\nCandidate dynamic range:\n  " + d8);
            return false;
        }
        return d(d7, d8);
    }

    public static D i(D d7, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (d7.f612a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            D d8 = (D) it.next();
            g0.c.f(d8, "Fully specified DynamicRange cannot be null.");
            g0.c.g("Fully specified DynamicRange must have fully defined encoding.", d8.b());
            if (d8.f612a != 1 && e(d7, d8, hashSet)) {
                return d8;
            }
        }
        return null;
    }

    public static void u(HashSet hashSet, D d7, C1006c c1006c) {
        g0.c.g("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set b5 = ((InterfaceC2022b) c1006c.f11091a).b(d7);
        if (!b5.isEmpty()) {
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet.retainAll(b5);
            if (hashSet.isEmpty()) {
                String join = TextUtils.join("\n  ", b5);
                String join2 = TextUtils.join("\n  ", hashSet2);
                throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + d7 + "\nConstraints:\n  " + join + "\nExisting constraints:\n  " + join2);
            }
        }
    }

    @Override // androidx.camera.core.impl.T
    public int E() {
        int maxImages;
        synchronized (this.f690c) {
            maxImages = ((ImageReader) this.f689b).getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.T
    public b0 M() {
        Image image;
        synchronized (this.f690c) {
            try {
                image = ((ImageReader) this.f689b).acquireNextImage();
            } catch (RuntimeException e7) {
                if ("ImageReaderContext is not initialized".equals(e7.getMessage())) {
                    image = null;
                } else {
                    throw e7;
                }
            }
            if (image == null) {
                return null;
            }
            return new C0051a(image);
        }
    }

    @Override // androidx.camera.core.impl.T
    public void N(final androidx.camera.core.impl.S s7, final Executor executor) {
        synchronized (this.f690c) {
            this.f688a = false;
            ((ImageReader) this.f689b).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: D.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    C0054d c0054d = C0054d.this;
                    Executor executor2 = executor;
                    androidx.camera.core.impl.S s8 = s7;
                    synchronized (c0054d.f690c) {
                        try {
                            if (!c0054d.f688a) {
                                executor2.execute(new RunnableC0053c(0, c0054d, s8));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, F.f.q());
        }
    }

    public void a(q4.k kVar) {
        ((HashSet) ((R1.j) this.f689b).f4683c).add(kVar);
    }

    @Override // androidx.camera.core.impl.T
    public b0 acquireLatestImage() {
        Image image;
        synchronized (this.f690c) {
            try {
                image = ((ImageReader) this.f689b).acquireLatestImage();
            } catch (RuntimeException e7) {
                if ("ImageReaderContext is not initialized".equals(e7.getMessage())) {
                    image = null;
                } else {
                    throw e7;
                }
            }
            if (image == null) {
                return null;
            }
            return new C0051a(image);
        }
    }

    public void b(q4.k kVar, r4.p pVar) {
        ((ArrayList) ((R1.j) this.f689b).f4684d).add(new r4.g(kVar, pVar));
    }

    @Override // androidx.camera.core.impl.T
    public int c() {
        int imageFormat;
        synchronized (this.f690c) {
            imageFormat = ((ImageReader) this.f689b).getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.T
    public void close() {
        synchronized (this.f690c) {
            ((ImageReader) this.f689b).close();
        }
    }

    public C0054d f(q4.k kVar) {
        q4.k kVar2;
        q4.k kVar3 = (q4.k) this.f690c;
        if (kVar3 == null) {
            kVar2 = null;
        } else {
            kVar2 = (q4.k) kVar3.b(kVar);
        }
        C0054d c0054d = new C0054d((R1.j) this.f689b, kVar2, false);
        if (kVar2 != null) {
            for (int i7 = 0; i7 < kVar2.f15351a.size(); i7++) {
                c0054d.v(kVar2.g(i7));
            }
        }
        return c0054d;
    }

    public Task g() {
        Task f;
        w();
        this.f688a = true;
        if (!((ArrayList) this.f690c).isEmpty()) {
            R1.j jVar = ((FirebaseFirestore) this.f689b).f9754k;
            synchronized (jVar) {
                jVar.n0();
                f = ((C1533t) jVar.f4683c).f((ArrayList) this.f690c);
            }
            return f;
        }
        return Tasks.forResult(null);
    }

    @Override // androidx.camera.core.impl.T
    public int getHeight() {
        int height;
        synchronized (this.f690c) {
            height = ((ImageReader) this.f689b).getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.T
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f690c) {
            surface = ((ImageReader) this.f689b).getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.T
    public int getWidth() {
        int width;
        synchronized (this.f690c) {
            width = ((ImageReader) this.f689b).getWidth();
        }
        return width;
    }

    public IllegalArgumentException h(String str) {
        String str2;
        q4.k kVar = (q4.k) this.f690c;
        if (kVar != null && !kVar.h()) {
            str2 = " (found in field " + kVar.c() + ")";
        } else {
            str2 = StringUtils.EMPTY;
        }
        return new IllegalArgumentException(AbstractC0059i.M("Invalid data. ", str, str2));
    }

    public void j(double d7, double d8) {
        boolean z7 = this.f688a;
        double[] dArr = (double[]) this.f689b;
        double d9 = 1.0d;
        if (!z7) {
            d9 = 1.0d / (((dArr[7] * d8) + (dArr[3] * d7)) + dArr[15]);
        }
        double d10 = ((dArr[4] * d8) + (dArr[0] * d7) + dArr[12]) * d9;
        double d11 = ((dArr[5] * d8) + (dArr[1] * d7) + dArr[13]) * d9;
        double[] dArr2 = (double[]) this.f690c;
        if (d10 < dArr2[0]) {
            dArr2[0] = d10;
        } else if (d10 > dArr2[1]) {
            dArr2[1] = d10;
        }
        if (d11 < dArr2[2]) {
            dArr2[2] = d11;
        } else if (d11 > dArr2[3]) {
            dArr2[3] = d11;
        }
    }

    public boolean k() {
        int[] iArr = n4.N.f14316a;
        R1.j jVar = (R1.j) this.f689b;
        int i7 = iArr[((n4.P) jVar.f4682b).ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            return true;
        }
        if (i7 == 4 || i7 == 5) {
            return false;
        }
        m5.d.g("Unexpected case for UserDataSource: %s", ((n4.P) jVar.f4682b).name());
        throw null;
    }

    public void l() {
        Z1.e eVar = (Z1.e) this.f689b;
        C0570w h8 = eVar.h();
        if (h8.f7946c == EnumC0563o.INITIALIZED) {
            h8.a(new Z1.b(eVar, 0));
            K5.s sVar = (K5.s) this.f690c;
            sVar.getClass();
            if (!sVar.f2735a) {
                h8.a(new C0924e(sVar, 2));
                sVar.f2735a = true;
                this.f688a = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void m(Bundle bundle) {
        Bundle bundle2;
        if (!this.f688a) {
            l();
        }
        C0570w h8 = ((Z1.e) this.f689b).h();
        if (!h8.f7946c.a(EnumC0563o.STARTED)) {
            K5.s sVar = (K5.s) this.f690c;
            if (sVar.f2735a) {
                if (!sVar.f2736b) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    sVar.f2739e = bundle2;
                    sVar.f2736b = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + h8.f7946c).toString());
    }

    public void n(Bundle outBundle) {
        kotlin.jvm.internal.j.e(outBundle, "outBundle");
        K5.s sVar = (K5.s) this.f690c;
        sVar.getClass();
        Bundle bundle = new Bundle();
        Bundle bundle2 = (Bundle) sVar.f2739e;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        r.f fVar = (r.f) sVar.f2738d;
        fVar.getClass();
        C1719d c1719d = new C1719d(fVar);
        fVar.f15408c.put(c1719d, Boolean.FALSE);
        while (c1719d.hasNext()) {
            Map.Entry entry = (Map.Entry) c1719d.next();
            bundle.putBundle((String) entry.getKey(), ((Z1.d) entry.getValue()).a());
        }
        if (!bundle.isEmpty()) {
            outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
    }

    public void o(C0814p c0814p, Map map, com.google.firebase.firestore.l0 l0Var) {
        n4.O P7;
        FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f689b;
        firebaseFirestore.k(c0814p);
        AbstractC0055e.b(map, "Provided data must not be null.");
        AbstractC0055e.b(l0Var, "Provided options must not be null.");
        w();
        boolean z7 = l0Var.f9826a;
        C0585f c0585f = firebaseFirestore.f9752h;
        if (z7) {
            P7 = c0585f.N(map, l0Var.f9827b);
        } else {
            P7 = c0585f.P(map);
        }
        ((ArrayList) this.f690c).add(P7.a(c0814p.f9838a, r4.m.f15508c));
    }

    public void p() {
        if (this.f688a) {
            ((Context) this.f689b).unregisterReceiver((RunnableC0239a) this.f690c);
            this.f688a = false;
        }
    }

    public void q(ScheduledFuture scheduledFuture) {
        synchronized (this.f690c) {
            if (!this.f688a) {
                this.f689b = scheduledFuture;
            }
        }
    }

    public void r(boolean z7) {
        C0721y0 c0721y0 = (C0721y0) this.f690c;
        c0721y0.getClass();
        c0721y0.f9043k.execute(new RunnableC0703s0(c0721y0, (C0709u0) this.f689b, z7));
    }

    public void s(a6.o0 o0Var) {
        C0721y0 c0721y0 = (C0721y0) this.f690c;
        c0721y0.f9042i.m(EnumC0477f.INFO, "{0} SHUTDOWN with {1}", ((C0709u0) this.f689b).c(), C0721y0.j(o0Var));
        this.f688a = true;
        c0721y0.f9043k.execute(new RunnableC0646G(15, this, o0Var));
    }

    public void t() {
        G.i.o("transportShutdown() must be called before transportTerminated().", this.f688a);
        C0721y0 c0721y0 = (C0721y0) this.f690c;
        AbstractC0478g abstractC0478g = c0721y0.f9042i;
        EnumC0477f enumC0477f = EnumC0477f.INFO;
        C0709u0 c0709u0 = (C0709u0) this.f689b;
        abstractC0478g.m(enumC0477f, "{0} Terminated", c0709u0.c());
        a6.G g3 = (a6.G) c0721y0.f9040g.f7077c.remove(Long.valueOf(c0709u0.c().f7082c));
        RunnableC0703s0 runnableC0703s0 = new RunnableC0703s0(c0721y0, c0709u0, false);
        a6.u0 u0Var = c0721y0.f9043k;
        u0Var.execute(runnableC0703s0);
        Iterator it = c0721y0.j.iterator();
        if (!it.hasNext()) {
            u0Var.execute(new RunnableC0715w0(this, 1));
        } else if (it.next() == null) {
            c0709u0.f();
            throw null;
        } else {
            throw new ClassCastException();
        }
    }

    public void v(String str) {
        if (!str.isEmpty()) {
            if (k() && str.startsWith("__") && str.endsWith("__")) {
                throw h("Document fields cannot begin and end with \"__\"");
            }
            return;
        }
        throw h("Document fields must not be empty");
    }

    public void w() {
        if (!this.f688a) {
            return;
        }
        throw new IllegalStateException("A write batch can no longer be used after commit() has been called.");
    }

    @Override // androidx.camera.core.impl.T
    public void y() {
        synchronized (this.f690c) {
            this.f688a = true;
            ((ImageReader) this.f689b).setOnImageAvailableListener(null, null);
        }
    }

    public C0054d(ImageReader imageReader) {
        this.f690c = new Object();
        this.f688a = true;
        this.f689b = imageReader;
    }

    public C0054d(R1.j jVar, q4.k kVar, boolean z7) {
        this.f689b = jVar;
        this.f690c = kVar;
        this.f688a = z7;
    }

    public C0054d(Object obj) {
        this.f690c = obj;
    }
}
