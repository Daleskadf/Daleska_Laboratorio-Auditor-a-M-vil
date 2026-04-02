package I;

import D.A;
import D.AbstractC0059i;
import D.D;
import D.InterfaceC0065o;
import D.J;
import D.V;
import D.X;
import D.e0;
import D.j0;
import D.y0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.B0;
import androidx.camera.core.impl.C0497a;
import androidx.camera.core.impl.C0498a0;
import androidx.camera.core.impl.C0501c;
import androidx.camera.core.impl.C0502d;
import androidx.camera.core.impl.C0505g;
import androidx.camera.core.impl.C0506h;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.InterfaceC0518u;
import androidx.camera.core.impl.InterfaceC0519v;
import androidx.camera.core.impl.InterfaceC0521x;
import androidx.camera.core.impl.N;
import androidx.camera.core.impl.O;
import androidx.camera.core.impl.P;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.W;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.g0;
import androidx.camera.core.impl.h0;
import androidx.camera.core.impl.r;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import m6.p;
import org.apache.tika.utils.StringUtils;
import p.C1608t;
import v.C1878a;
import w.C1893C;
import w.C1910U;
/* loaded from: classes.dex */
public final class g implements InterfaceC0065o {

    /* renamed from: X  reason: collision with root package name */
    public final ArrayList f2089X;

    /* renamed from: Y  reason: collision with root package name */
    public final B.a f2090Y;

    /* renamed from: Z  reason: collision with root package name */
    public List f2091Z;

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0521x f2092a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0521x f2093b;

    /* renamed from: c  reason: collision with root package name */
    public final C1608t f2094c;

    /* renamed from: d  reason: collision with root package name */
    public final C1893C f2095d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2096e;

    /* renamed from: e0  reason: collision with root package name */
    public final C5.i f2097e0;
    public final ArrayList f;

    /* renamed from: f0  reason: collision with root package name */
    public final Object f2098f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f2099g0;

    /* renamed from: h0  reason: collision with root package name */
    public G f2100h0;

    /* renamed from: i0  reason: collision with root package name */
    public y0 f2101i0;

    /* renamed from: j0  reason: collision with root package name */
    public Q.d f2102j0;

    /* renamed from: k0  reason: collision with root package name */
    public final g0 f2103k0;

    /* renamed from: l0  reason: collision with root package name */
    public final h0 f2104l0;

    /* renamed from: m0  reason: collision with root package name */
    public final h0 f2105m0;

    /* renamed from: n0  reason: collision with root package name */
    public final e0 f2106n0;

    /* renamed from: o0  reason: collision with root package name */
    public final e0 f2107o0;

    public g(InterfaceC0521x interfaceC0521x, InterfaceC0521x interfaceC0521x2, h0 h0Var, h0 h0Var2, B.a aVar, C1608t c1608t, C1893C c1893c) {
        e0 e0Var = e0.f695a;
        this.f = new ArrayList();
        this.f2089X = new ArrayList();
        this.f2091Z = Collections.emptyList();
        this.f2098f0 = new Object();
        this.f2099g0 = true;
        this.f2100h0 = null;
        this.f2092a = interfaceC0521x;
        this.f2093b = interfaceC0521x2;
        this.f2106n0 = e0Var;
        this.f2107o0 = e0Var;
        this.f2090Y = aVar;
        this.f2094c = c1608t;
        this.f2095d = c1893c;
        C5.i iVar = h0Var.f7631c;
        this.f2097e0 = iVar;
        iVar.o0();
        this.f2103k0 = new g0(interfaceC0521x.n());
        this.f2104l0 = h0Var;
        this.f2105m0 = h0Var2;
        this.f2096e = v(h0Var, h0Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean B(androidx.camera.core.impl.C0505g r4, androidx.camera.core.impl.o0 r5) {
        /*
            androidx.camera.core.impl.E r0 = r5.f7656g
            androidx.camera.core.impl.Z r0 = r0.f7536b
            v.a r4 = r4.f7624d
            r4.getClass()
            java.util.Set r1 = D.AbstractC0059i.n(r4)
            int r1 = r1.size()
            androidx.camera.core.impl.E r5 = r5.f7656g
            androidx.camera.core.impl.Z r5 = r5.f7536b
            java.util.Set r5 = r5.H()
            int r5 = r5.size()
            r2 = 1
            if (r1 == r5) goto L21
            return r2
        L21:
            java.util.Set r5 = D.AbstractC0059i.n(r4)
            java.util.Iterator r5 = r5.iterator()
        L29:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r5.next()
            androidx.camera.core.impl.c r1 = (androidx.camera.core.impl.C0501c) r1
            java.util.TreeMap r3 = r0.f7596a
            boolean r3 = r3.containsKey(r1)
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r0.G(r1)
            java.lang.Object r1 = D.AbstractC0059i.p(r4, r1)
            boolean r1 = j$.util.Objects.equals(r3, r1)
            if (r1 != 0) goto L29
        L4b:
            return r2
        L4c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: I.g.B(androidx.camera.core.impl.g, androidx.camera.core.impl.o0):boolean");
    }

    public static ArrayList G(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((y0) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        return arrayList2;
    }

    public static Matrix p(Rect rect, Size size) {
        boolean z7;
        if (rect.width() > 0 && rect.height() > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.a("Cannot compute viewport crop rects zero sized sensor rect.", z7);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static X s() {
        Object obj;
        Object obj2;
        Object obj3;
        A a7 = new A();
        C0501c c0501c = l.f2121i;
        W w2 = a7.f595a;
        w2.j(c0501c, "ImageCapture-Extra");
        C0501c c0501c2 = N.f7570d;
        w2.getClass();
        Object obj4 = null;
        try {
            obj = w2.G(c0501c2);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            w2.j(O.f7574w, num);
        } else {
            V v6 = X.f667x;
            try {
                obj2 = w2.G(N.f7571e);
            } catch (IllegalArgumentException unused2) {
                obj2 = null;
            }
            if (Objects.equals(obj2, 1)) {
                w2.j(O.f7574w, 4101);
                w2.j(O.f7575x, D.f606c);
            } else {
                w2.j(O.f7574w, Integer.valueOf((int) RecognitionOptions.QR_CODE));
            }
        }
        N n7 = new N(Z.a(w2));
        P.e(n7);
        X x7 = new X(n7);
        try {
            obj3 = w2.G(Q.f7579C);
        } catch (IllegalArgumentException unused3) {
            obj3 = null;
        }
        Size size = (Size) obj3;
        if (size != null) {
            new Rational(size.getWidth(), size.getHeight());
        }
        C0501c c0501c3 = h.f2108h;
        Object A7 = j3.f.A();
        try {
            A7 = w2.G(c0501c3);
        } catch (IllegalArgumentException unused4) {
        }
        g0.c.f((Executor) A7, "The IO executor can't be null");
        C0501c c0501c4 = N.f7569c;
        if (w2.f7596a.containsKey(c0501c4)) {
            Integer num2 = (Integer) w2.G(c0501c4);
            if (num2 != null && (num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                if (num2.intValue() == 3) {
                    try {
                        obj4 = w2.G(N.f7567Z);
                    } catch (IllegalArgumentException unused5) {
                    }
                    if (obj4 == null) {
                        throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                    }
                }
            } else {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
            }
        }
        return x7;
    }

    public static a v(h0 h0Var, h0 h0Var2) {
        String c8;
        StringBuilder sb = new StringBuilder();
        sb.append(h0Var.f7558a.c());
        if (h0Var2 == null) {
            c8 = StringUtils.EMPTY;
        } else {
            c8 = h0Var2.f7558a.c();
        }
        sb.append(c8);
        return new a(sb.toString(), (C0502d) h0Var.f7631c.f593b);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [I.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [D.y0, D.j0] */
    public static HashMap x(ArrayList arrayList, B0 b0, C1893C c1893c) {
        androidx.camera.core.impl.y0 e7;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            if (y0Var instanceof Q.d) {
                Q.d dVar = (Q.d) y0Var;
                C0498a0 c0498a0 = new C0498a0(Z.a(new J(1).f620b));
                P.e(c0498a0);
                ?? y0Var2 = new y0(c0498a0);
                y0Var2.f725p = j0.f723w;
                androidx.camera.core.impl.y0 e8 = y0Var2.e(false, b0);
                if (e8 == null) {
                    e7 = null;
                } else {
                    W c8 = W.c(e8);
                    c8.f7596a.remove(l.j);
                    e7 = ((A4.c) dVar.j(c8)).a0();
                }
            } else {
                e7 = y0Var.e(false, b0);
            }
            androidx.camera.core.impl.y0 e9 = y0Var.e(true, c1893c);
            ?? obj = new Object();
            obj.f2087a = e7;
            obj.f2088b = e9;
            hashMap.put(y0Var, obj);
        }
        return hashMap;
    }

    public final void A() {
        synchronized (this.f2098f0) {
            this.f2097e0.o0();
        }
    }

    public final boolean C() {
        boolean z7;
        synchronized (this.f2098f0) {
            C5.i iVar = this.f2097e0;
            iVar.getClass();
            z7 = false;
            if (((Integer) ((Z) iVar.u()).f0(r.f7666r, 0)).intValue() == 1) {
                z7 = true;
            }
        }
        return z7;
    }

    public final void D(ArrayList arrayList) {
        boolean z7;
        synchronized (this.f2098f0) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f);
            linkedHashSet.removeAll(arrayList);
            InterfaceC0521x interfaceC0521x = this.f2093b;
            boolean z8 = false;
            if (interfaceC0521x != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (interfaceC0521x != null) {
                z8 = true;
            }
            I(linkedHashSet, z7, z8);
        }
    }

    public final void E() {
        synchronized (this.f2098f0) {
            try {
                if (this.f2100h0 != null) {
                    this.f2092a.n().l(this.f2100h0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void F() {
        p pVar = p.f14074a;
        synchronized (this.f2098f0) {
            this.f2091Z = pVar;
        }
    }

    public final void H() {
        synchronized (this.f2098f0) {
        }
    }

    public final void I(LinkedHashSet linkedHashSet, boolean z7, boolean z8) {
        Q.d dVar;
        HashMap hashMap;
        C0505g c0505g;
        C1878a c1878a;
        synchronized (this.f2098f0) {
            r(linkedHashSet);
            if (!z7) {
                A();
            }
            Q.d t7 = t(linkedHashSet, z7);
            y0 j = j(linkedHashSet, t7);
            ArrayList arrayList = new ArrayList(linkedHashSet);
            if (j != null) {
                arrayList.add(j);
            }
            if (t7 != null) {
                arrayList.add(t7);
                arrayList.removeAll(t7.f4103p.f4122a);
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.removeAll(this.f2089X);
            ArrayList arrayList3 = new ArrayList(arrayList);
            arrayList3.retainAll(this.f2089X);
            ArrayList arrayList4 = new ArrayList(this.f2089X);
            arrayList4.removeAll(arrayList);
            C5.i iVar = this.f2097e0;
            iVar.getClass();
            HashMap x7 = x(arrayList2, (B0) ((Z) iVar.u()).f0(r.f7665q, B0.f7530a), this.f2095d);
            Map emptyMap = Collections.emptyMap();
            try {
                HashMap q2 = q(w(), this.f2092a.m(), arrayList2, arrayList3, x7);
                if (this.f2093b != null) {
                    int w2 = w();
                    InterfaceC0521x interfaceC0521x = this.f2093b;
                    Objects.requireNonNull(interfaceC0521x);
                    dVar = t7;
                    hashMap = q2;
                    emptyMap = q(w2, interfaceC0521x.m(), arrayList2, arrayList3, x7);
                } else {
                    dVar = t7;
                    hashMap = q2;
                }
                Map map = emptyMap;
                J(hashMap, arrayList);
                ArrayList G2 = G(arrayList, this.f2091Z);
                ArrayList arrayList5 = new ArrayList(linkedHashSet);
                arrayList5.removeAll(arrayList);
                ArrayList G7 = G(arrayList5, G2);
                if (G7.size() > 0) {
                    org.slf4j.helpers.i.O("CameraUseCaseAdapter", "Unused effects: " + G7);
                }
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    ((y0) it.next()).z(this.f2092a);
                }
                this.f2092a.e(arrayList4);
                if (this.f2093b != null) {
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        InterfaceC0521x interfaceC0521x2 = this.f2093b;
                        Objects.requireNonNull(interfaceC0521x2);
                        ((y0) it2.next()).z(interfaceC0521x2);
                    }
                    InterfaceC0521x interfaceC0521x3 = this.f2093b;
                    Objects.requireNonNull(interfaceC0521x3);
                    interfaceC0521x3.e(arrayList4);
                }
                if (arrayList4.isEmpty()) {
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        y0 y0Var = (y0) it3.next();
                        if (hashMap.containsKey(y0Var) && (c1878a = (c0505g = (C0505g) hashMap.get(y0Var)).f7624d) != null && B(c0505g, y0Var.f809m)) {
                            y0Var.f804g = y0Var.u(c1878a);
                            if (this.f2099g0) {
                                this.f2092a.g(y0Var);
                                InterfaceC0521x interfaceC0521x4 = this.f2093b;
                                if (interfaceC0521x4 != null) {
                                    interfaceC0521x4.g(y0Var);
                                }
                            }
                        }
                    }
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    y0 y0Var2 = (y0) it4.next();
                    f fVar = (f) x7.get(y0Var2);
                    Objects.requireNonNull(fVar);
                    InterfaceC0521x interfaceC0521x5 = this.f2093b;
                    if (interfaceC0521x5 != null) {
                        y0Var2.a(this.f2092a, interfaceC0521x5, fVar.f2087a, fVar.f2088b);
                        C0505g c0505g2 = (C0505g) hashMap.get(y0Var2);
                        c0505g2.getClass();
                        y0Var2.f804g = y0Var2.v(c0505g2, (C0505g) map.get(y0Var2));
                    } else {
                        y0Var2.a(this.f2092a, null, fVar.f2087a, fVar.f2088b);
                        C0505g c0505g3 = (C0505g) hashMap.get(y0Var2);
                        c0505g3.getClass();
                        y0Var2.f804g = y0Var2.v(c0505g3, null);
                    }
                }
                if (this.f2099g0) {
                    this.f2092a.h(arrayList2);
                    InterfaceC0521x interfaceC0521x6 = this.f2093b;
                    if (interfaceC0521x6 != null) {
                        interfaceC0521x6.h(arrayList2);
                    }
                }
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    ((y0) it5.next()).o();
                }
                this.f.clear();
                this.f.addAll(linkedHashSet);
                this.f2089X.clear();
                this.f2089X.addAll(arrayList);
                this.f2101i0 = j;
                this.f2102j0 = dVar;
            } catch (IllegalArgumentException e7) {
                if (!z7) {
                    A();
                    if (this.f2090Y.f223a != 2) {
                        I(linkedHashSet, true, z8);
                        return;
                    }
                }
                throw e7;
            }
        }
    }

    public final void J(HashMap hashMap, ArrayList arrayList) {
        synchronized (this.f2098f0) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    y0 y0Var = (y0) it.next();
                    Rect q2 = this.f2092a.n().q();
                    C0505g c0505g = (C0505g) hashMap.get(y0Var);
                    c0505g.getClass();
                    y0Var.x(p(q2, c0505g.f7621a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D.InterfaceC0065o
    public final InterfaceC0519v a() {
        return this.f2104l0;
    }

    public final void c(List list) {
        boolean z7;
        synchronized (this.f2098f0) {
            try {
                this.f2092a.f(this.f2097e0);
                InterfaceC0521x interfaceC0521x = this.f2093b;
                if (interfaceC0521x != null) {
                    interfaceC0521x.f(this.f2097e0);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f);
                linkedHashSet.addAll(list);
                try {
                    InterfaceC0521x interfaceC0521x2 = this.f2093b;
                    boolean z8 = false;
                    if (interfaceC0521x2 != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (interfaceC0521x2 != null) {
                        z8 = true;
                    }
                    I(linkedHashSet, z7, z8);
                } catch (IllegalArgumentException e7) {
                    throw new Exception(e7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.f2098f0) {
            try {
                if (!this.f2099g0) {
                    if (!this.f2089X.isEmpty()) {
                        this.f2092a.f(this.f2097e0);
                        InterfaceC0521x interfaceC0521x = this.f2093b;
                        if (interfaceC0521x != null) {
                            interfaceC0521x.f(this.f2097e0);
                        }
                    }
                    this.f2092a.h(this.f2089X);
                    InterfaceC0521x interfaceC0521x2 = this.f2093b;
                    if (interfaceC0521x2 != null) {
                        interfaceC0521x2.h(this.f2089X);
                    }
                    E();
                    Iterator it = this.f2089X.iterator();
                    while (it.hasNext()) {
                        ((y0) it.next()).o();
                    }
                    this.f2099g0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f2098f0) {
            InterfaceC0518u n7 = this.f2092a.n();
            this.f2100h0 = n7.b();
            n7.j();
        }
    }

    /* JADX WARN: Type inference failed for: r8v13, types: [D.y0, D.j0] */
    public final y0 j(LinkedHashSet linkedHashSet, Q.d dVar) {
        X x7;
        synchronized (this.f2098f0) {
            try {
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (dVar != null) {
                    arrayList.add(dVar);
                    arrayList.removeAll(dVar.f4103p.f4122a);
                }
                if (C()) {
                    Iterator it = arrayList.iterator();
                    boolean z7 = false;
                    boolean z8 = false;
                    boolean z9 = false;
                    while (it.hasNext()) {
                        y0 y0Var = (y0) it.next();
                        if (!(y0Var instanceof j0) && !(y0Var instanceof Q.d)) {
                            if (y0Var instanceof X) {
                                z8 = true;
                            }
                        }
                        z9 = true;
                    }
                    if (z8 && !z9) {
                        y0 y0Var2 = this.f2101i0;
                        if (!(y0Var2 instanceof j0)) {
                            J j = new J(1);
                            j.f620b.j(l.f2121i, "Preview-Extra");
                            C0498a0 c0498a0 = new C0498a0(Z.a(j.f620b));
                            P.e(c0498a0);
                            ?? y0Var3 = new y0(c0498a0);
                            y0Var3.f725p = j0.f723w;
                            y0Var3.C(new A.i(11));
                            x7 = y0Var3;
                        }
                    } else {
                        Iterator it2 = arrayList.iterator();
                        boolean z10 = false;
                        while (it2.hasNext()) {
                            y0 y0Var4 = (y0) it2.next();
                            if (!(y0Var4 instanceof j0) && !(y0Var4 instanceof Q.d)) {
                                if (y0Var4 instanceof X) {
                                    z10 = true;
                                }
                            }
                            z7 = true;
                        }
                        if (z7 && !z10) {
                            y0 y0Var5 = this.f2101i0;
                            x7 = y0Var5 instanceof X ? y0Var5 : s();
                        }
                    }
                }
                x7 = null;
            } finally {
            }
        }
        return x7;
    }

    public final HashMap q(int i7, InterfaceC0519v interfaceC0519v, ArrayList arrayList, ArrayList arrayList2, HashMap hashMap) {
        Size size;
        C1608t c1608t;
        Rect rect;
        boolean z7;
        Size size2;
        C0506h c0506h;
        ArrayList arrayList3 = new ArrayList();
        String c8 = interfaceC0519v.c();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            size = null;
            c1608t = this.f2094c;
            if (!hasNext) {
                break;
            }
            y0 y0Var = (y0) it.next();
            int x7 = y0Var.f.x();
            C0505g c0505g = y0Var.f804g;
            if (c0505g != null) {
                size2 = c0505g.f7621a;
            } else {
                size2 = null;
            }
            C1910U c1910u = (C1910U) ((HashMap) c1608t.f14880b).get(c8);
            if (c1910u != null) {
                c0506h = C0506h.c(i7, x7, size2, c1910u.i(x7));
            } else {
                c0506h = null;
            }
            int x8 = y0Var.f.x();
            C0505g c0505g2 = y0Var.f804g;
            if (c0505g2 != null) {
                size = c0505g2.f7621a;
            }
            c0505g2.getClass();
            C0497a c0497a = new C0497a(c0506h, x8, size, c0505g2.f7622b, Q.d.F(y0Var), y0Var.f804g.f7624d, y0Var.f.v());
            arrayList3.add(c0497a);
            hashMap3.put(c0497a, y0Var);
            hashMap2.put(y0Var, y0Var.f804g);
        }
        if (!arrayList.isEmpty()) {
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            try {
                rect = this.f2092a.n().q();
            } catch (NullPointerException unused) {
                rect = null;
            }
            if (rect != null) {
                size = F.g.d(rect);
            }
            j jVar = new j(interfaceC0519v, size);
            Iterator it2 = arrayList.iterator();
            boolean z8 = false;
            while (it2.hasNext()) {
                y0 y0Var2 = (y0) it2.next();
                f fVar = (f) hashMap.get(y0Var2);
                androidx.camera.core.impl.y0 l8 = y0Var2.l(interfaceC0519v, fVar.f2087a, fVar.f2088b);
                hashMap4.put(l8, y0Var2);
                hashMap5.put(l8, jVar.b(l8));
                androidx.camera.core.impl.y0 y0Var3 = y0Var2.f;
                if (y0Var3 instanceof C0498a0) {
                    C0498a0 c0498a0 = (C0498a0) y0Var3;
                    c0498a0.getClass();
                    if (AbstractC0059i.f(c0498a0) == 2) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    y0 y0Var4 = (y0) it3.next();
                    if (y0Var4 != null) {
                        if (y0Var4.f.h(androidx.camera.core.impl.y0.f7691Q)) {
                            if (y0Var4.f.f() == A0.VIDEO_CAPTURE) {
                                z7 = true;
                                break;
                            }
                        } else {
                            Log.e("CameraUseCaseAdapter", y0Var4 + " UseCase does not have capture type.");
                        }
                    }
                } else {
                    z7 = false;
                    break;
                }
            }
            c1608t.getClass();
            g0.c.a("No new use cases to be bound.", !hashMap5.isEmpty());
            C1910U c1910u2 = (C1910U) ((HashMap) c1608t.f14880b).get(c8);
            if (c1910u2 != null) {
                Pair g3 = c1910u2.g(i7, arrayList3, hashMap5, z8, z7);
                for (Map.Entry entry : hashMap4.entrySet()) {
                    hashMap2.put((y0) entry.getValue(), (C0505g) ((Map) g3.first).get(entry.getKey()));
                }
                for (Map.Entry entry2 : ((Map) g3.second).entrySet()) {
                    if (hashMap3.containsKey(entry2.getKey())) {
                        hashMap2.put((y0) hashMap3.get(entry2.getKey()), (C0505g) entry2.getValue());
                    }
                }
            } else {
                throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.h("No such camera id in supported combination list: ", c8));
            }
        }
        return hashMap2;
    }

    public final void r(LinkedHashSet linkedHashSet) {
        boolean z7;
        A();
        synchronized (this.f2098f0) {
            try {
                if (!this.f2091Z.isEmpty()) {
                    Iterator it = linkedHashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            y0 y0Var = (y0) it.next();
                            if (y0Var instanceof X) {
                                androidx.camera.core.impl.y0 y0Var2 = y0Var.f;
                                C0501c c0501c = N.f7571e;
                                if (y0Var2.h(c0501c)) {
                                    Integer num = (Integer) y0Var2.G(c0501c);
                                    num.getClass();
                                    z7 = true;
                                    if (num.intValue() == 1) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            z7 = false;
                            break;
                        }
                    }
                    if (z7) {
                        throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                    }
                }
            } finally {
            }
        }
    }

    public final Q.d t(LinkedHashSet linkedHashSet, boolean z7) {
        boolean z8;
        synchronized (this.f2098f0) {
            try {
                HashSet y2 = y(linkedHashSet, z7);
                if (y2.size() < 2) {
                    A();
                    return null;
                }
                Q.d dVar = this.f2102j0;
                if (dVar != null && dVar.f4103p.f4122a.equals(y2)) {
                    Q.d dVar2 = this.f2102j0;
                    Objects.requireNonNull(dVar2);
                    return dVar2;
                }
                int[] iArr = {1, 2, 4};
                HashSet hashSet = new HashSet();
                Iterator it = y2.iterator();
                while (it.hasNext()) {
                    y0 y0Var = (y0) it.next();
                    for (int i7 = 0; i7 < 3; i7++) {
                        int i8 = iArr[i7];
                        Iterator it2 = y0Var.i().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                int intValue = ((Integer) it2.next()).intValue();
                                if ((i8 & intValue) == intValue) {
                                    z8 = true;
                                    break;
                                }
                            } else {
                                z8 = false;
                                break;
                            }
                        }
                        if (z8) {
                            if (hashSet.contains(Integer.valueOf(i8))) {
                                return null;
                            }
                            hashSet.add(Integer.valueOf(i8));
                        }
                    }
                }
                return new Q.d(this.f2092a, this.f2093b, this.f2106n0, this.f2107o0, y2, this.f2095d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u() {
        synchronized (this.f2098f0) {
            try {
                if (this.f2099g0) {
                    this.f2092a.e(new ArrayList(this.f2089X));
                    InterfaceC0521x interfaceC0521x = this.f2093b;
                    if (interfaceC0521x != null) {
                        interfaceC0521x.e(new ArrayList(this.f2089X));
                    }
                    i();
                    this.f2099g0 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int w() {
        synchronized (this.f2098f0) {
            try {
                if (this.f2090Y.f223a == 2) {
                    return 1;
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet y(LinkedHashSet linkedHashSet, boolean z7) {
        int i7;
        HashSet hashSet = new HashSet();
        synchronized (this.f2098f0) {
            Iterator it = this.f2091Z.iterator();
            if (!it.hasNext()) {
                if (z7) {
                    i7 = 3;
                } else {
                    i7 = 0;
                }
            } else if (it.next() == null) {
                throw null;
            } else {
                throw new ClassCastException();
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            y0 y0Var = (y0) it2.next();
            g0.c.a("Only support one level of sharing for now.", !(y0Var instanceof Q.d));
            Iterator it3 = y0Var.i().iterator();
            while (true) {
                if (it3.hasNext()) {
                    int intValue = ((Integer) it3.next()).intValue();
                    if ((i7 & intValue) == intValue) {
                        hashSet.add(y0Var);
                        break;
                    }
                }
            }
        }
        return hashSet;
    }

    public final List z() {
        ArrayList arrayList;
        synchronized (this.f2098f0) {
            arrayList = new ArrayList(this.f);
        }
        return arrayList;
    }
}
