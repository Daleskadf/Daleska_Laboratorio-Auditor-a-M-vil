package w;

import java.util.Iterator;
import java.util.Map;
import r.C1717b;
import r.C1718c;
/* renamed from: w.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1938w extends androidx.lifecycle.C {

    /* renamed from: l  reason: collision with root package name */
    public r.f f16300l = new r.f();

    /* renamed from: m  reason: collision with root package name */
    public androidx.lifecycle.C f16301m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f16302n;

    public C1938w(Object obj) {
        this.f16302n = obj;
    }

    @Override // androidx.lifecycle.C
    public final Object d() {
        androidx.lifecycle.C c8 = this.f16301m;
        if (c8 == null) {
            return this.f16302n;
        }
        return c8.d();
    }

    @Override // androidx.lifecycle.C
    public final void g() {
        Iterator it = this.f16300l.iterator();
        while (true) {
            C1717b c1717b = (C1717b) it;
            if (c1717b.hasNext()) {
                ((androidx.lifecycle.B) ((Map.Entry) c1717b.next()).getValue()).b();
            } else {
                return;
            }
        }
    }

    @Override // androidx.lifecycle.C
    public final void h() {
        Iterator it = this.f16300l.iterator();
        while (true) {
            C1717b c1717b = (C1717b) it;
            if (c1717b.hasNext()) {
                androidx.lifecycle.B b5 = (androidx.lifecycle.B) ((Map.Entry) c1717b.next()).getValue();
                b5.f7876a.j(b5);
            } else {
                return;
            }
        }
    }

    public final void m(androidx.lifecycle.C c8) {
        Object obj;
        androidx.lifecycle.B b5;
        androidx.lifecycle.C c9 = this.f16301m;
        r.f fVar = this.f16300l;
        if (c9 != null && (b5 = (androidx.lifecycle.B) fVar.f(c9)) != null) {
            b5.f7876a.j(b5);
        }
        this.f16301m = c8;
        C1937v c1937v = new C1937v(this);
        if (c8 != null) {
            androidx.lifecycle.B b7 = new androidx.lifecycle.B(c8, c1937v);
            C1718c e7 = fVar.e(c8);
            if (e7 != null) {
                obj = e7.f15400b;
            } else {
                C1718c c1718c = new C1718c(c8, b7);
                fVar.f15409d++;
                C1718c c1718c2 = fVar.f15407b;
                if (c1718c2 == null) {
                    fVar.f15406a = c1718c;
                    fVar.f15407b = c1718c;
                } else {
                    c1718c2.f15401c = c1718c;
                    c1718c.f15402d = c1718c2;
                    fVar.f15407b = c1718c;
                }
                obj = null;
            }
            androidx.lifecycle.B b8 = (androidx.lifecycle.B) obj;
            if (b8 != null && b8.f7877b != c1937v) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
            if (b8 == null && this.f7882c > 0) {
                b7.b();
                return;
            }
            return;
        }
        throw new NullPointerException("source cannot be null");
    }
}
