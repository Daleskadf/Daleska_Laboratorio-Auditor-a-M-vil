package Q;

import B5.C0050x;
import B5.P;
import D.AbstractC0059i;
import D.RunnableC0053c;
import D.e0;
import D.n0;
import D.r0;
import D.v0;
import D.y0;
import F3.o;
import M.m;
import V2.k;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.impl.AbstractC0508j;
import androidx.camera.core.impl.B0;
import androidx.camera.core.impl.C0505g;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.InterfaceC0521x;
import androidx.camera.core.impl.O;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.W;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.k0;
import androidx.camera.core.impl.o0;
import androidx.camera.core.impl.x0;
import h3.AbstractC1079a;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import v.C1878a;
import w.C1893C;
/* loaded from: classes.dex */
public final class d extends y0 {

    /* renamed from: A  reason: collision with root package name */
    public k0 f4101A;

    /* renamed from: o  reason: collision with root package name */
    public final e f4102o;

    /* renamed from: p  reason: collision with root package name */
    public final g f4103p;

    /* renamed from: q  reason: collision with root package name */
    public final e0 f4104q;

    /* renamed from: r  reason: collision with root package name */
    public final e0 f4105r;

    /* renamed from: s  reason: collision with root package name */
    public k f4106s;

    /* renamed from: t  reason: collision with root package name */
    public o f4107t;

    /* renamed from: u  reason: collision with root package name */
    public m f4108u;

    /* renamed from: v  reason: collision with root package name */
    public m f4109v;

    /* renamed from: w  reason: collision with root package name */
    public m f4110w;

    /* renamed from: x  reason: collision with root package name */
    public m f4111x;

    /* renamed from: y  reason: collision with root package name */
    public j0 f4112y;

    /* renamed from: z  reason: collision with root package name */
    public j0 f4113z;

    public d(InterfaceC0521x interfaceC0521x, InterfaceC0521x interfaceC0521x2, e0 e0Var, e0 e0Var2, HashSet hashSet, C1893C c1893c) {
        super(G(hashSet));
        this.f4102o = G(hashSet);
        this.f4104q = e0Var;
        this.f4105r = e0Var2;
        this.f4103p = new g(interfaceC0521x, interfaceC0521x2, hashSet, c1893c, new P0.b(17));
    }

    public static ArrayList F(y0 y0Var) {
        ArrayList arrayList = new ArrayList();
        if (y0Var instanceof d) {
            Iterator it = ((d) y0Var).f4103p.f4122a.iterator();
            while (it.hasNext()) {
                arrayList.add(((y0) it.next()).f.f());
            }
        } else {
            arrayList.add(y0Var.f.f());
        }
        return arrayList;
    }

    public static e G(HashSet hashSet) {
        W b5 = W.b();
        new A4.c(b5);
        b5.j(O.f7574w, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            if (y0Var.f.h(androidx.camera.core.impl.y0.f7691Q)) {
                arrayList.add(y0Var.f.f());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        b5.j(e.f4114b, arrayList);
        b5.j(Q.f7578B, 2);
        return new e(Z.a(b5));
    }

    public final void B() {
        k0 k0Var = this.f4101A;
        if (k0Var != null) {
            k0Var.b();
            this.f4101A = null;
        }
        m mVar = this.f4108u;
        if (mVar != null) {
            mVar.b();
            this.f4108u = null;
        }
        m mVar2 = this.f4109v;
        if (mVar2 != null) {
            mVar2.b();
            this.f4109v = null;
        }
        m mVar3 = this.f4110w;
        if (mVar3 != null) {
            mVar3.b();
            this.f4110w = null;
        }
        m mVar4 = this.f4111x;
        if (mVar4 != null) {
            mVar4.b();
            this.f4111x = null;
        }
        k kVar = this.f4106s;
        if (kVar != null) {
            ((M.e) kVar.f5965b).e();
            AbstractC1079a.s(new C.b(kVar, 12));
            this.f4106s = null;
        }
        o oVar = this.f4107t;
        if (oVar != null) {
            ((N.e) oVar.f1178b).d();
            AbstractC1079a.s(new C.b(oVar, 14));
            this.f4107t = null;
        }
    }

    public final List C(String str, String str2, androidx.camera.core.impl.y0 y0Var, C0505g c0505g, C0505g c0505g2) {
        boolean z7;
        Rect rect;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        AbstractC1079a.e();
        g gVar = this.f4103p;
        int i7 = 0;
        if (c0505g2 == null) {
            D(str, str2, y0Var, c0505g, null);
            InterfaceC0521x b5 = b();
            Objects.requireNonNull(b5);
            this.f4106s = new k(b5, new M.e(c0505g.f7622b));
            if (this.f806i != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            m mVar = this.f4110w;
            int d7 = ((Q) this.f).d();
            gVar.getClass();
            HashMap hashMap = new HashMap();
            Iterator it = gVar.f4122a.iterator();
            while (it.hasNext()) {
                y0 y0Var2 = (y0) it.next();
                hashMap.put(y0Var2, gVar.p(y0Var2, gVar.f4128f0, gVar.f, mVar, d7, z10));
            }
            k kVar = this.f4106s;
            m mVar2 = this.f4110w;
            ArrayList arrayList = new ArrayList(hashMap.values());
            if (mVar2 != null) {
                kVar.getClass();
                AbstractC1079a.e();
                kVar.f5967d = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    O.b bVar = (O.b) it2.next();
                    P p7 = (P) kVar.f5967d;
                    Rect rect2 = bVar.f3456d;
                    Matrix matrix = new Matrix(mVar2.f3104b);
                    RectF rectF = new RectF(rect2);
                    RectF rectF2 = F.g.f1104a;
                    float f = i7;
                    Size size = bVar.f3457e;
                    RectF rectF3 = new RectF(f, f, size.getWidth(), size.getHeight());
                    int i8 = bVar.f;
                    boolean z12 = bVar.f3458g;
                    matrix.postConcat(F.g.a(rectF, rectF3, i8, z12));
                    g0.c.b(F.g.c(F.g.e(F.g.d(rect2), i8), size));
                    Rect rect3 = new Rect(0, 0, size.getWidth(), size.getHeight());
                    o a7 = mVar2.f3108g.a();
                    a7.f1178b = size;
                    C0505g f4 = a7.f();
                    int i9 = mVar2.f3110i - i8;
                    if (mVar2.f3107e != z12) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    p7.put(bVar, new m(bVar.f3454b, bVar.f3455c, f4, matrix, false, rect3, i9, -1, z11));
                    i7 = 0;
                }
                v0 c8 = mVar2.c(true);
                M.e eVar = (M.e) kVar.f5965b;
                if (eVar.f3071e.get()) {
                    c8.b();
                } else {
                    eVar.b(new RunnableC0053c(6, eVar, c8), new r0(c8, 1));
                }
                for (Map.Entry entry : ((P) kVar.f5967d).entrySet()) {
                    kVar.k(mVar2, entry);
                    m mVar3 = (m) entry.getValue();
                    A.h hVar = new A.h(kVar, mVar2, entry, 3);
                    mVar3.getClass();
                    AbstractC1079a.e();
                    mVar3.a();
                    mVar3.f3113m.add(hVar);
                }
                mVar2.f3115o.add(new C0050x((P) kVar.f5967d, 2));
                P p8 = (P) kVar.f5967d;
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    hashMap2.put((y0) entry2.getKey(), (m) p8.get(entry2.getValue()));
                }
                gVar.t(hashMap2);
                Object[] objArr = {this.f4112y.c()};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList2.add(obj);
                return DesugarCollections.unmodifiableList(arrayList2);
            }
            throw new NullPointerException("Null surfaceEdge");
        }
        D(str, str2, y0Var, c0505g, c0505g2);
        Matrix matrix2 = this.j;
        InterfaceC0521x h8 = h();
        Objects.requireNonNull(h8);
        boolean k2 = h8.k();
        Rect rect4 = this.f806i;
        if (rect4 != null) {
            rect = rect4;
            z7 = false;
        } else {
            Size size2 = c0505g2.f7621a;
            z7 = false;
            rect = new Rect(0, 0, size2.getWidth(), size2.getHeight());
        }
        InterfaceC0521x h9 = h();
        Objects.requireNonNull(h9);
        int g3 = g(h9, z7);
        InterfaceC0521x h10 = h();
        Objects.requireNonNull(h10);
        boolean z13 = z7;
        m mVar4 = new m(3, 34, c0505g2, matrix2, k2, rect, g3, -1, k(h10));
        this.f4109v = mVar4;
        Objects.requireNonNull(h());
        this.f4111x = mVar4;
        j0 E4 = E(this.f4109v, y0Var, c0505g2);
        this.f4113z = E4;
        k0 k0Var = this.f4101A;
        if (k0Var != null) {
            k0Var.b();
        }
        k0 k0Var2 = new k0(new c(this, str, str2, y0Var, c0505g, c0505g2));
        this.f4101A = k0Var2;
        E4.f = k0Var2;
        this.f4107t = new o(b(), h(), new N.e(c0505g.f7622b, this.f4104q, this.f4105r));
        if (this.f806i != null) {
            z8 = true;
        } else {
            z8 = z13 ? 1 : 0;
        }
        m mVar5 = this.f4110w;
        m mVar6 = this.f4111x;
        int d8 = ((Q) this.f).d();
        gVar.getClass();
        HashMap hashMap3 = new HashMap();
        Iterator it3 = gVar.f4122a.iterator();
        while (it3.hasNext()) {
            y0 y0Var3 = (y0) it3.next();
            HashMap hashMap4 = hashMap3;
            O.b p9 = gVar.p(y0Var3, gVar.f4128f0, gVar.f, mVar5, d8, z8);
            InterfaceC0521x interfaceC0521x = gVar.f4119X;
            Objects.requireNonNull(interfaceC0521x);
            hashMap4.put(y0Var3, new N.a(p9, gVar.p(y0Var3, gVar.f4129g0, interfaceC0521x, mVar6, d8, z8)));
            hashMap3 = hashMap4;
        }
        HashMap hashMap5 = hashMap3;
        o oVar = this.f4107t;
        N.b bVar2 = new N.b(this.f4110w, this.f4111x, new ArrayList(hashMap5.values()));
        oVar.getClass();
        AbstractC1079a.e();
        oVar.f = bVar2;
        oVar.f1181e = new HashMap();
        N.b bVar3 = (N.b) oVar.f;
        m mVar7 = bVar3.f3312a;
        Iterator it4 = bVar3.f3314c.iterator();
        while (it4.hasNext()) {
            N.a aVar = (N.a) it4.next();
            P p10 = (P) oVar.f1181e;
            O.b bVar4 = aVar.f3310a;
            Matrix matrix3 = new Matrix();
            Size d9 = F.g.d(bVar4.f3456d);
            int i10 = bVar4.f;
            Size e7 = F.g.e(d9, i10);
            Size size3 = bVar4.f3457e;
            g0.c.b(F.g.c(e7, size3));
            Rect rect5 = new Rect(z13 ? 1 : 0, z13 ? 1 : 0, size3.getWidth(), size3.getHeight());
            o a8 = mVar7.f3108g.a();
            a8.f1178b = size3;
            C0505g f8 = a8.f();
            int i11 = mVar7.f3110i - i10;
            if (mVar7.f3107e != bVar4.f3458g) {
                z9 = true;
            } else {
                z9 = z13 ? 1 : 0;
            }
            p10.put(aVar, new m(bVar4.f3454b, bVar4.f3455c, f8, matrix3, false, rect5, i11, -1, z9));
        }
        v0 c9 = mVar7.c(true);
        N.e eVar2 = (N.e) oVar.f1178b;
        eVar2.c(c9);
        m mVar8 = bVar3.f3313b;
        eVar2.c(mVar8.c(z13));
        for (Map.Entry entry3 : ((P) oVar.f1181e).entrySet()) {
            InterfaceC0521x interfaceC0521x2 = (InterfaceC0521x) oVar.f1179c;
            InterfaceC0521x interfaceC0521x3 = (InterfaceC0521x) oVar.f1180d;
            oVar.h(interfaceC0521x2, interfaceC0521x3, mVar7, mVar8, entry3);
            m mVar9 = (m) entry3.getValue();
            N.f fVar = new N.f(oVar, interfaceC0521x2, interfaceC0521x3, mVar7, mVar8, entry3, 0);
            mVar9.getClass();
            AbstractC1079a.e();
            mVar9.a();
            mVar9.f3113m.add(fVar);
        }
        P p11 = (P) oVar.f1181e;
        HashMap hashMap6 = new HashMap();
        for (Map.Entry entry4 : hashMap5.entrySet()) {
            hashMap6.put((y0) entry4.getKey(), (m) p11.get(entry4.getValue()));
        }
        gVar.t(hashMap6);
        o0 c10 = this.f4112y.c();
        o0 c11 = this.f4113z.c();
        Object[] objArr2 = new Object[2];
        objArr2[z13 ? 1 : 0] = c10;
        objArr2[1] = c11;
        ArrayList arrayList3 = new ArrayList(2);
        for (int i12 = z13 ? 1 : 0; i12 < 2; i12++) {
            Object obj2 = objArr2[i12];
            Objects.requireNonNull(obj2);
            arrayList3.add(obj2);
        }
        return DesugarCollections.unmodifiableList(arrayList3);
    }

    public final void D(String str, String str2, androidx.camera.core.impl.y0 y0Var, C0505g c0505g, C0505g c0505g2) {
        Matrix matrix = this.j;
        InterfaceC0521x b5 = b();
        Objects.requireNonNull(b5);
        boolean k2 = b5.k();
        Size size = c0505g.f7621a;
        Rect rect = this.f806i;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        InterfaceC0521x b7 = b();
        Objects.requireNonNull(b7);
        int g3 = g(b7, false);
        InterfaceC0521x b8 = b();
        Objects.requireNonNull(b8);
        m mVar = new m(3, 34, c0505g, matrix, k2, rect2, g3, -1, k(b8));
        this.f4108u = mVar;
        Objects.requireNonNull(b());
        this.f4110w = mVar;
        j0 E4 = E(this.f4108u, y0Var, c0505g);
        this.f4112y = E4;
        k0 k0Var = this.f4101A;
        if (k0Var != null) {
            k0Var.b();
        }
        k0 k0Var2 = new k0(new c(this, str, str2, y0Var, c0505g, c0505g2));
        this.f4101A = k0Var2;
        E4.f = k0Var2;
    }

    public final j0 E(m mVar, androidx.camera.core.impl.y0 y0Var, C0505g c0505g) {
        j0 d7 = j0.d(y0Var, c0505g.f7621a);
        g gVar = this.f4103p;
        Iterator it = gVar.f4122a.iterator();
        int i7 = -1;
        while (it.hasNext()) {
            int i8 = ((y0) it.next()).f.J().f7656g.f7537c;
            Integer valueOf = Integer.valueOf(i7);
            List list = o0.f7650i;
            if (list.indexOf(valueOf) < list.indexOf(Integer.valueOf(i8))) {
                i7 = i8;
            }
        }
        n0 n0Var = d7.f7639b;
        if (i7 != -1) {
            n0Var.f752a = i7;
        }
        Iterator it2 = gVar.f4122a.iterator();
        while (it2.hasNext()) {
            o0 c8 = j0.d(((y0) it2.next()).f, c0505g.f7621a).c();
            E e7 = c8.f7656g;
            n0Var.a(e7.f7538d);
            for (AbstractC0508j abstractC0508j : c8.f7655e) {
                n0Var.b(abstractC0508j);
                ArrayList arrayList = d7.f7642e;
                if (!arrayList.contains(abstractC0508j)) {
                    arrayList.add(abstractC0508j);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : c8.f7654d) {
                ArrayList arrayList2 = d7.f7641d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : c8.f7653c) {
                ArrayList arrayList3 = d7.f7640c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            n0Var.d(e7.f7536b);
        }
        mVar.getClass();
        AbstractC1079a.e();
        mVar.a();
        g0.c.g("Consumer can only be linked once.", !mVar.j);
        mVar.j = true;
        d7.b(mVar.f3112l, c0505g.f7622b, -1);
        n0Var.b(gVar.f4120Y);
        C1878a c1878a = c0505g.f7624d;
        if (c1878a != null) {
            n0Var.d(c1878a);
        }
        return d7;
    }

    @Override // D.y0
    public final androidx.camera.core.impl.y0 e(boolean z7, B0 b0) {
        e eVar = this.f4102o;
        eVar.getClass();
        G a7 = b0.a(AbstractC0059i.c(eVar), 1);
        if (z7) {
            a7 = AbstractC0059i.O(a7, eVar.f4115a);
        }
        if (a7 == null) {
            return null;
        }
        return ((A4.c) j(a7)).a0();
    }

    @Override // D.y0
    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // D.y0
    public final x0 j(G g3) {
        return new A4.c(W.c(g3));
    }

    @Override // D.y0
    public final void p() {
        g gVar = this.f4103p;
        Iterator it = gVar.f4122a.iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            f fVar = (f) gVar.f4124c.get(y0Var);
            Objects.requireNonNull(fVar);
            y0Var.a(fVar, null, null, y0Var.e(true, gVar.f4126e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
    @Override // D.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.camera.core.impl.y0 r(androidx.camera.core.impl.InterfaceC0519v r13, androidx.camera.core.impl.x0 r14) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.d.r(androidx.camera.core.impl.v, androidx.camera.core.impl.x0):androidx.camera.core.impl.y0");
    }

    @Override // D.y0
    public final void s() {
        Iterator it = this.f4103p.f4122a.iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            y0Var.s();
            y0Var.q();
        }
    }

    @Override // D.y0
    public final void t() {
        Iterator it = this.f4103p.f4122a.iterator();
        while (it.hasNext()) {
            ((y0) it.next()).t();
        }
    }

    @Override // D.y0
    public final C0505g u(C1878a c1878a) {
        this.f4112y.a(c1878a);
        Object[] objArr = {this.f4112y.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        A(DesugarCollections.unmodifiableList(arrayList));
        o a7 = this.f804g.a();
        a7.f1181e = c1878a;
        return a7.f();
    }

    @Override // D.y0
    public final C0505g v(C0505g c0505g, C0505g c0505g2) {
        String c8;
        String d7 = d();
        if (h() == null) {
            c8 = null;
        } else {
            c8 = h().m().c();
        }
        A(C(d7, c8, this.f, c0505g, c0505g2));
        m();
        return c0505g;
    }

    @Override // D.y0
    public final void w() {
        B();
        g gVar = this.f4103p;
        Iterator it = gVar.f4122a.iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            f fVar = (f) gVar.f4124c.get(y0Var);
            Objects.requireNonNull(fVar);
            y0Var.z(fVar);
        }
    }
}
