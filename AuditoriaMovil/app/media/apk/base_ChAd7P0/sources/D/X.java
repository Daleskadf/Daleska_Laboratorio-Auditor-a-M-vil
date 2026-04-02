package D;

import android.util.Log;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.B0;
import androidx.camera.core.impl.C0501c;
import androidx.camera.core.impl.C0503e;
import androidx.camera.core.impl.C0505g;
import androidx.camera.core.impl.InterfaceC0519v;
import androidx.camera.core.impl.InterfaceC0521x;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h3.AbstractC1079a;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import v.C1878a;
/* loaded from: classes.dex */
public final class X extends y0 {

    /* renamed from: x  reason: collision with root package name */
    public static final V f667x = new Object();

    /* renamed from: o  reason: collision with root package name */
    public final int f668o;

    /* renamed from: p  reason: collision with root package name */
    public final AtomicReference f669p;

    /* renamed from: q  reason: collision with root package name */
    public final int f670q;

    /* renamed from: r  reason: collision with root package name */
    public final I.i f671r;

    /* renamed from: s  reason: collision with root package name */
    public androidx.camera.core.impl.j0 f672s;

    /* renamed from: t  reason: collision with root package name */
    public E.e f673t;

    /* renamed from: u  reason: collision with root package name */
    public E.f f674u;

    /* renamed from: v  reason: collision with root package name */
    public androidx.camera.core.impl.k0 f675v;

    /* renamed from: w  reason: collision with root package name */
    public final e0 f676w;

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, D.e0] */
    public X(androidx.camera.core.impl.N n7) {
        super(n7);
        this.f669p = new AtomicReference(null);
        this.f670q = -1;
        this.f676w = new Object();
        androidx.camera.core.impl.N n8 = (androidx.camera.core.impl.N) this.f;
        C0501c c0501c = androidx.camera.core.impl.N.f7568b;
        n8.getClass();
        if (((androidx.camera.core.impl.Z) n8.u()).h(c0501c)) {
            this.f668o = ((Integer) AbstractC0059i.p(n8, c0501c)).intValue();
        } else {
            this.f668o = 1;
        }
        ((Integer) ((androidx.camera.core.impl.Z) n8.u()).f0(androidx.camera.core.impl.N.f7566Y, 0)).getClass();
        this.f671r = new I.i((I.i) ((androidx.camera.core.impl.Z) n8.u()).f0(androidx.camera.core.impl.N.f7567Z, null));
    }

    public static boolean E(int i7, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i7))) {
                return true;
            }
        }
        return false;
    }

    public final void B(boolean z7) {
        E.f fVar;
        Log.d("ImageCapture", "clearPipeline");
        AbstractC1079a.e();
        androidx.camera.core.impl.k0 k0Var = this.f675v;
        if (k0Var != null) {
            k0Var.b();
            this.f675v = null;
        }
        E.e eVar = this.f673t;
        if (eVar != null) {
            eVar.x();
            this.f673t = null;
        }
        if (!z7 && (fVar = this.f674u) != null) {
            fVar.b();
            this.f674u = null;
        }
    }

    public final androidx.camera.core.impl.j0 C(String str, androidx.camera.core.impl.N n7, C0505g c0505g) {
        AbstractC1079a.e();
        Log.d("ImageCapture", "createPipeline(cameraId: " + str + ", streamSpec: " + c0505g + ")");
        Size size = c0505g.f7621a;
        InterfaceC0521x b5 = b();
        Objects.requireNonNull(b5);
        boolean z7 = true;
        boolean k2 = b5.k() ^ true;
        if (this.f673t != null) {
            g0.c.g(null, k2);
            this.f673t.x();
        }
        if (((Boolean) this.f.f0(androidx.camera.core.impl.N.f7572e0, Boolean.FALSE)).booleanValue()) {
            ((C5.i) b().o()).o0();
        }
        this.f673t = new E.e(n7, size, k2);
        if (this.f674u == null) {
            this.f674u = new E.f(this.f676w);
        }
        E.f fVar = this.f674u;
        E.e eVar = this.f673t;
        fVar.getClass();
        AbstractC1079a.e();
        fVar.f925b = eVar;
        eVar.getClass();
        AbstractC1079a.e();
        A.f fVar2 = (A.f) eVar.f921c;
        fVar2.getClass();
        AbstractC1079a.e();
        if (((n0) fVar2.f10b) == null) {
            z7 = false;
        }
        g0.c.g("The ImageReader is not initialized.", z7);
        n0 n0Var = (n0) fVar2.f10b;
        synchronized (n0Var.f754c) {
            n0Var.f = fVar;
        }
        E.e eVar2 = this.f673t;
        androidx.camera.core.impl.j0 d7 = androidx.camera.core.impl.j0.d((androidx.camera.core.impl.N) eVar2.f920b, c0505g.f7621a);
        E.a aVar = (E.a) eVar2.f923e;
        t0 t0Var = aVar.f909a;
        Objects.requireNonNull(t0Var);
        D d8 = D.f607d;
        F3.o a7 = C0503e.a(t0Var);
        a7.f = d8;
        d7.f7638a.add(a7.e());
        t0 t0Var2 = aVar.f910b;
        if (t0Var2 != null) {
            d7.f7644h = C0503e.a(t0Var2).e();
        }
        if (this.f668o == 2 && !c0505g.f7625e) {
            c().z(d7);
        }
        C1878a c1878a = c0505g.f7624d;
        if (c1878a != null) {
            d7.f7639b.d(c1878a);
        }
        androidx.camera.core.impl.k0 k0Var = this.f675v;
        if (k0Var != null) {
            k0Var.b();
        }
        androidx.camera.core.impl.k0 k0Var2 = new androidx.camera.core.impl.k0(new H(this, 1));
        this.f675v = k0Var2;
        d7.f = k0Var2;
        return d7;
    }

    public final int D() {
        int i7;
        synchronized (this.f669p) {
            i7 = this.f670q;
            if (i7 == -1) {
                androidx.camera.core.impl.N n7 = (androidx.camera.core.impl.N) this.f;
                n7.getClass();
                i7 = ((Integer) AbstractC0059i.q(n7, androidx.camera.core.impl.N.f7569c, 2)).intValue();
            }
        }
        return i7;
    }

    @Override // D.y0
    public final androidx.camera.core.impl.y0 e(boolean z7, B0 b0) {
        f667x.getClass();
        androidx.camera.core.impl.N n7 = V.f666a;
        n7.getClass();
        androidx.camera.core.impl.G a7 = b0.a(AbstractC0059i.c(n7), this.f668o);
        if (z7) {
            a7 = AbstractC0059i.O(a7, n7);
        }
        if (a7 == null) {
            return null;
        }
        return new androidx.camera.core.impl.N(androidx.camera.core.impl.Z.a(((A) j(a7)).f595a));
    }

    @Override // D.y0
    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // D.y0
    public final androidx.camera.core.impl.x0 j(androidx.camera.core.impl.G g3) {
        return new A(androidx.camera.core.impl.W.c(g3), 1);
    }

    @Override // D.y0
    public final void p() {
        int i7;
        g0.c.f(b(), "Attached camera cannot be null");
        if (D() == 3) {
            InterfaceC0521x b5 = b();
            if (b5 != null) {
                i7 = b5.a().b();
            } else {
                i7 = -1;
            }
            if (i7 != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    @Override // D.y0
    public final void q() {
        org.slf4j.helpers.i.l("ImageCapture", "onCameraControlReady");
        synchronized (this.f669p) {
            try {
                if (this.f669p.get() == null) {
                    c().t(D());
                }
            } finally {
            }
        }
        c().w(this.f671r);
    }

    @Override // D.y0
    public final androidx.camera.core.impl.y0 r(InterfaceC0519v interfaceC0519v, androidx.camera.core.impl.x0 x0Var) {
        Object obj;
        Object obj2;
        Object obj3;
        if (interfaceC0519v.h().T(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            androidx.camera.core.impl.V M7 = x0Var.M();
            C0501c c0501c = androidx.camera.core.impl.N.f7565X;
            Object obj4 = Boolean.TRUE;
            androidx.camera.core.impl.Z z7 = (androidx.camera.core.impl.Z) M7;
            z7.getClass();
            try {
                obj4 = z7.G(c0501c);
            } catch (IllegalArgumentException unused) {
            }
            if (bool.equals(obj4)) {
                org.slf4j.helpers.i.O("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                String N7 = org.slf4j.helpers.i.N("ImageCapture");
                if (org.slf4j.helpers.i.E(4, N7)) {
                    Log.i(N7, "Requesting software JPEG due to device quirk.");
                }
                ((androidx.camera.core.impl.W) x0Var.M()).j(androidx.camera.core.impl.N.f7565X, Boolean.TRUE);
            }
        }
        androidx.camera.core.impl.V M8 = x0Var.M();
        Boolean bool2 = Boolean.TRUE;
        C0501c c0501c2 = androidx.camera.core.impl.N.f7565X;
        Object obj5 = Boolean.FALSE;
        androidx.camera.core.impl.Z z8 = (androidx.camera.core.impl.Z) M8;
        z8.getClass();
        try {
            obj5 = z8.G(c0501c2);
        } catch (IllegalArgumentException unused2) {
        }
        boolean equals = bool2.equals(obj5);
        Object obj6 = null;
        boolean z9 = false;
        if (equals) {
            if (b() != null) {
                ((C5.i) b().o()).o0();
            }
            try {
                obj3 = z8.G(androidx.camera.core.impl.N.f7570d);
            } catch (IllegalArgumentException unused3) {
                obj3 = null;
            }
            Integer num = (Integer) obj3;
            if (num != null && num.intValue() != 256) {
                org.slf4j.helpers.i.O("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            } else {
                z9 = true;
            }
            if (!z9) {
                org.slf4j.helpers.i.O("ImageCapture", "Unable to support software JPEG. Disabling.");
                ((androidx.camera.core.impl.W) M8).j(androidx.camera.core.impl.N.f7565X, Boolean.FALSE);
            }
        }
        androidx.camera.core.impl.V M9 = x0Var.M();
        C0501c c0501c3 = androidx.camera.core.impl.N.f7570d;
        androidx.camera.core.impl.Z z10 = (androidx.camera.core.impl.Z) M9;
        z10.getClass();
        try {
            obj = z10.G(c0501c3);
        } catch (IllegalArgumentException unused4) {
            obj = null;
        }
        Integer num2 = (Integer) obj;
        int i7 = 35;
        if (num2 != null) {
            if (b() != null) {
                ((C5.i) b().o()).o0();
            }
            androidx.camera.core.impl.V M10 = x0Var.M();
            C0501c c0501c4 = androidx.camera.core.impl.O.f7574w;
            if (!z9) {
                i7 = num2.intValue();
            }
            ((androidx.camera.core.impl.W) M10).j(c0501c4, Integer.valueOf(i7));
        } else {
            androidx.camera.core.impl.V M11 = x0Var.M();
            C0501c c0501c5 = androidx.camera.core.impl.N.f7571e;
            androidx.camera.core.impl.Z z11 = (androidx.camera.core.impl.Z) M11;
            z11.getClass();
            try {
                obj2 = z11.G(c0501c5);
            } catch (IllegalArgumentException unused5) {
                obj2 = null;
            }
            if (Objects.equals(obj2, 1)) {
                ((androidx.camera.core.impl.W) x0Var.M()).j(androidx.camera.core.impl.O.f7574w, 4101);
                ((androidx.camera.core.impl.W) x0Var.M()).j(androidx.camera.core.impl.O.f7575x, D.f606c);
            } else if (z9) {
                ((androidx.camera.core.impl.W) x0Var.M()).j(androidx.camera.core.impl.O.f7574w, 35);
            } else {
                androidx.camera.core.impl.V M12 = x0Var.M();
                C0501c c0501c6 = androidx.camera.core.impl.Q.f7582F;
                androidx.camera.core.impl.Z z12 = (androidx.camera.core.impl.Z) M12;
                z12.getClass();
                try {
                    obj6 = z12.G(c0501c6);
                } catch (IllegalArgumentException unused6) {
                }
                List list = (List) obj6;
                if (list == null) {
                    ((androidx.camera.core.impl.W) x0Var.M()).j(androidx.camera.core.impl.O.f7574w, Integer.valueOf((int) RecognitionOptions.QR_CODE));
                } else if (E(RecognitionOptions.QR_CODE, list)) {
                    ((androidx.camera.core.impl.W) x0Var.M()).j(androidx.camera.core.impl.O.f7574w, Integer.valueOf((int) RecognitionOptions.QR_CODE));
                } else if (E(35, list)) {
                    ((androidx.camera.core.impl.W) x0Var.M()).j(androidx.camera.core.impl.O.f7574w, 35);
                }
            }
        }
        return x0Var.a0();
    }

    @Override // D.y0
    public final void t() {
        I.i iVar = this.f671r;
        iVar.b();
        iVar.a();
        E.f fVar = this.f674u;
        if (fVar != null) {
            fVar.b();
        }
    }

    public final String toString() {
        return "ImageCapture:".concat(f());
    }

    @Override // D.y0
    public final C0505g u(C1878a c1878a) {
        this.f672s.a(c1878a);
        Object[] objArr = {this.f672s.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        A(DesugarCollections.unmodifiableList(arrayList));
        F3.o a7 = this.f804g.a();
        a7.f1181e = c1878a;
        return a7.f();
    }

    @Override // D.y0
    public final C0505g v(C0505g c0505g, C0505g c0505g2) {
        androidx.camera.core.impl.j0 C7 = C(d(), (androidx.camera.core.impl.N) this.f, c0505g);
        this.f672s = C7;
        Object[] objArr = {C7.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        A(DesugarCollections.unmodifiableList(arrayList));
        m();
        return c0505g;
    }

    @Override // D.y0
    public final void w() {
        I.i iVar = this.f671r;
        iVar.b();
        iVar.a();
        E.f fVar = this.f674u;
        if (fVar != null) {
            fVar.b();
        }
        B(false);
        c().w(null);
    }
}
