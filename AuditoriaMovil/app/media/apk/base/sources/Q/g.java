package Q;

import D.X;
import D.f0;
import D.j0;
import D.x0;
import D.y0;
import M.l;
import M.m;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.InterfaceC0521x;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.m0;
import androidx.camera.core.impl.o0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h3.AbstractC1079a;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import w.C1893C;
/* loaded from: classes.dex */
public final class g implements x0 {

    /* renamed from: X  reason: collision with root package name */
    public final InterfaceC0521x f4119X;

    /* renamed from: Z  reason: collision with root package name */
    public final HashSet f4121Z;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f4122a;

    /* renamed from: e  reason: collision with root package name */
    public final C1893C f4126e;

    /* renamed from: e0  reason: collision with root package name */
    public final HashMap f4127e0;
    public final InterfaceC0521x f;

    /* renamed from: f0  reason: collision with root package name */
    public final b f4128f0;

    /* renamed from: g0  reason: collision with root package name */
    public final b f4129g0;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f4123b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f4124c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f4125d = new HashMap();

    /* renamed from: Y  reason: collision with root package name */
    public final f0 f4120Y = new f0(this, 2);

    public g(InterfaceC0521x interfaceC0521x, InterfaceC0521x interfaceC0521x2, HashSet hashSet, C1893C c1893c, P0.b bVar) {
        this.f = interfaceC0521x;
        this.f4119X = interfaceC0521x2;
        this.f4126e = c1893c;
        this.f4122a = hashSet;
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            hashMap.put(y0Var, y0Var.l(interfaceC0521x.m(), null, y0Var.e(true, c1893c)));
        }
        this.f4127e0 = hashMap;
        HashSet hashSet2 = new HashSet(hashMap.values());
        this.f4121Z = hashSet2;
        this.f4128f0 = new b(interfaceC0521x, hashSet2);
        if (this.f4119X != null) {
            this.f4129g0 = new b(this.f4119X, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            y0 y0Var2 = (y0) it2.next();
            this.f4125d.put(y0Var2, Boolean.FALSE);
            this.f4124c.put(y0Var2, new f(interfaceC0521x, this, bVar));
        }
    }

    public static void q(m mVar, J j, o0 o0Var) {
        mVar.d();
        try {
            AbstractC1079a.e();
            mVar.a();
            l lVar = mVar.f3112l;
            Objects.requireNonNull(lVar);
            lVar.g(j, new M.i(lVar, 0));
        } catch (I unused) {
            l0 l0Var = o0Var.f;
            if (l0Var != null) {
                l0Var.a(o0Var, m0.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    public static J r(y0 y0Var) {
        List unmodifiableList;
        boolean z7;
        if (y0Var instanceof X) {
            unmodifiableList = y0Var.f809m.b();
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(y0Var.f809m.f7656g.f7535a);
        }
        if (unmodifiableList.size() <= 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.g(null, z7);
        if (unmodifiableList.size() != 1) {
            return null;
        }
        return (J) unmodifiableList.get(0);
    }

    @Override // D.x0
    public final void c(y0 y0Var) {
        AbstractC1079a.e();
        if (s(y0Var)) {
            return;
        }
        this.f4125d.put(y0Var, Boolean.TRUE);
        J r7 = r(y0Var);
        if (r7 != null) {
            m mVar = (m) this.f4123b.get(y0Var);
            Objects.requireNonNull(mVar);
            q(mVar, r7, y0Var.f809m);
        }
    }

    @Override // D.x0
    public final void g(y0 y0Var) {
        AbstractC1079a.e();
        if (!s(y0Var)) {
            return;
        }
        m mVar = (m) this.f4123b.get(y0Var);
        Objects.requireNonNull(mVar);
        J r7 = r(y0Var);
        if (r7 != null) {
            q(mVar, r7, y0Var.f809m);
            return;
        }
        AbstractC1079a.e();
        mVar.a();
        mVar.f3112l.a();
    }

    @Override // D.x0
    public final void i(y0 y0Var) {
        J r7;
        AbstractC1079a.e();
        m mVar = (m) this.f4123b.get(y0Var);
        Objects.requireNonNull(mVar);
        if (s(y0Var) && (r7 = r(y0Var)) != null) {
            q(mVar, r7, y0Var.f809m);
        }
    }

    @Override // D.x0
    public final void j(y0 y0Var) {
        AbstractC1079a.e();
        if (!s(y0Var)) {
            return;
        }
        this.f4125d.put(y0Var, Boolean.FALSE);
        m mVar = (m) this.f4123b.get(y0Var);
        Objects.requireNonNull(mVar);
        AbstractC1079a.e();
        mVar.a();
        mVar.f3112l.a();
    }

    public final O.b p(y0 y0Var, b bVar, InterfaceC0521x interfaceC0521x, m mVar, int i7, boolean z7) {
        float f;
        boolean z8;
        float[] fArr;
        Size size;
        Size size2;
        int i8;
        int i9;
        int e7 = interfaceC0521x.a().e(i7);
        Matrix matrix = mVar.f3104b;
        RectF rectF = F.g.f1104a;
        float[] fArr2 = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr2);
        boolean z9 = false;
        float f4 = fArr2[0];
        float f8 = fArr2[1];
        float f9 = fArr2[2];
        float f10 = (f8 * fArr2[3]) + (f4 * f9);
        double sqrt = Math.sqrt((f8 * f8) + (f4 * f4)) * Math.sqrt((f * f) + (f9 * f9));
        if (((float) Math.toDegrees(Math.atan2(((f4 * f) - (f8 * f9)) / sqrt, f10 / sqrt))) > 0.0f) {
            z8 = true;
        } else {
            z8 = false;
        }
        androidx.camera.core.impl.y0 y0Var2 = (androidx.camera.core.impl.y0) this.f4127e0.get(y0Var);
        Objects.requireNonNull(y0Var2);
        mVar.f3104b.getValues(new float[9]);
        int f11 = F.g.f((int) Math.round(Math.atan2(fArr[3], fArr[0]) * 57.29577951308232d));
        bVar.getClass();
        boolean b5 = F.g.b(f11);
        Rect rect = mVar.f3106d;
        if (b5) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
            z9 = true;
        }
        if (z7) {
            size2 = F.g.d(rect);
            Iterator it = bVar.b(y0Var2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Size d7 = F.g.d(b.a((Size) it.next(), size2));
                if (!b.c(d7, size2)) {
                    size2 = d7;
                    break;
                }
            }
        } else {
            Size d8 = F.g.d(rect);
            List b7 = bVar.b(y0Var2);
            Iterator it2 = b7.iterator();
            while (true) {
                if (it2.hasNext()) {
                    size = (Size) it2.next();
                    Rational rational = F.b.f1092a;
                    if (!F.b.a(rational, d8)) {
                        rational = F.b.f1094c;
                        if (!F.b.a(rational, d8)) {
                            rational = b.g(d8);
                        }
                    }
                    if (!bVar.d(rational, size) && !b.c(size, d8)) {
                        break;
                    }
                } else {
                    Iterator it3 = b7.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Size size3 = (Size) it3.next();
                            if (!b.c(size3, d8)) {
                                size = size3;
                                break;
                            }
                        } else {
                            size = d8;
                            break;
                        }
                    }
                }
            }
            rect = b.a(d8, size);
            size2 = size;
        }
        Pair pair = new Pair(rect, size2);
        Rect rect2 = (Rect) pair.first;
        Size size4 = (Size) pair.second;
        if (z9) {
            Size size5 = new Size(size4.getHeight(), size4.getWidth());
            rect2 = new Rect(rect2.top, rect2.left, rect2.bottom, rect2.right);
            size4 = size5;
        }
        Pair pair2 = new Pair(rect2, size4);
        Rect rect3 = (Rect) pair2.first;
        Size size6 = (Size) pair2.second;
        int e8 = this.f.a().e(((Q) y0Var.f).d());
        f fVar = (f) this.f4124c.get(y0Var);
        Objects.requireNonNull(fVar);
        fVar.f4117b.f4134c = e8;
        int f12 = F.g.f((mVar.f3110i + e8) - e7);
        if (y0Var instanceof j0) {
            i8 = 1;
        } else if (y0Var instanceof X) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        if (y0Var instanceof X) {
            i9 = RecognitionOptions.QR_CODE;
        } else {
            i9 = 34;
        }
        return new O.b(UUID.randomUUID(), i8, i9, rect3, F.g.e(size6, f12), f12, y0Var.k(interfaceC0521x) ^ z8);
    }

    public final boolean s(y0 y0Var) {
        Boolean bool = (Boolean) this.f4125d.get(y0Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void t(HashMap hashMap) {
        HashMap hashMap2 = this.f4123b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        for (Map.Entry entry : hashMap2.entrySet()) {
            y0 y0Var = (y0) entry.getKey();
            m mVar = (m) entry.getValue();
            y0Var.y(mVar.f3106d);
            y0Var.x(mVar.f3104b);
            y0Var.f804g = y0Var.v(mVar.f3108g, null);
            y0Var.o();
        }
    }
}
