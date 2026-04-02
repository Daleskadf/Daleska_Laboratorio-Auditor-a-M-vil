package D;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.B0;
import androidx.camera.core.impl.C0501c;
import androidx.camera.core.impl.C0505g;
import androidx.camera.core.impl.InterfaceC0518u;
import androidx.camera.core.impl.InterfaceC0519v;
import androidx.camera.core.impl.InterfaceC0521x;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import v.C1878a;
/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: d  reason: collision with root package name */
    public androidx.camera.core.impl.y0 f802d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f803e;
    public androidx.camera.core.impl.y0 f;

    /* renamed from: g  reason: collision with root package name */
    public C0505g f804g;

    /* renamed from: h  reason: collision with root package name */
    public androidx.camera.core.impl.y0 f805h;

    /* renamed from: i  reason: collision with root package name */
    public Rect f806i;

    /* renamed from: k  reason: collision with root package name */
    public InterfaceC0521x f807k;

    /* renamed from: l  reason: collision with root package name */
    public InterfaceC0521x f808l;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f799a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Object f800b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public w0 f801c = w0.INACTIVE;
    public Matrix j = new Matrix();

    /* renamed from: m  reason: collision with root package name */
    public androidx.camera.core.impl.o0 f809m = androidx.camera.core.impl.o0.a();

    /* renamed from: n  reason: collision with root package name */
    public androidx.camera.core.impl.o0 f810n = androidx.camera.core.impl.o0.a();

    public y0(androidx.camera.core.impl.y0 y0Var) {
        this.f803e = y0Var;
        this.f = y0Var;
    }

    public final void A(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f809m = (androidx.camera.core.impl.o0) list.get(0);
        if (list.size() > 1) {
            this.f810n = (androidx.camera.core.impl.o0) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (androidx.camera.core.impl.J j : ((androidx.camera.core.impl.o0) it.next()).b()) {
                if (j.j == null) {
                    j.j = getClass();
                }
            }
        }
    }

    public final void a(InterfaceC0521x interfaceC0521x, InterfaceC0521x interfaceC0521x2, androidx.camera.core.impl.y0 y0Var, androidx.camera.core.impl.y0 y0Var2) {
        synchronized (this.f800b) {
            this.f807k = interfaceC0521x;
            this.f808l = interfaceC0521x2;
            this.f799a.add(interfaceC0521x);
            if (interfaceC0521x2 != null) {
                this.f799a.add(interfaceC0521x2);
            }
        }
        this.f802d = y0Var;
        this.f805h = y0Var2;
        this.f = l(interfaceC0521x.m(), this.f802d, this.f805h);
        p();
    }

    public final InterfaceC0521x b() {
        InterfaceC0521x interfaceC0521x;
        synchronized (this.f800b) {
            interfaceC0521x = this.f807k;
        }
        return interfaceC0521x;
    }

    public final InterfaceC0518u c() {
        synchronized (this.f800b) {
            try {
                InterfaceC0521x interfaceC0521x = this.f807k;
                if (interfaceC0521x == null) {
                    return InterfaceC0518u.f7672v;
                }
                return interfaceC0521x.n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String d() {
        InterfaceC0521x b5 = b();
        g0.c.f(b5, "No camera attached to use case: " + this);
        return b5.m().c();
    }

    public abstract androidx.camera.core.impl.y0 e(boolean z7, B0 b0);

    public final String f() {
        androidx.camera.core.impl.y0 y0Var = this.f;
        String X7 = y0Var.X("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(X7);
        return X7;
    }

    public final int g(InterfaceC0521x interfaceC0521x, boolean z7) {
        int e7 = interfaceC0521x.m().e(((androidx.camera.core.impl.Q) this.f).d());
        if (!interfaceC0521x.k() && z7) {
            return F.g.f(-e7);
        }
        return e7;
    }

    public final InterfaceC0521x h() {
        InterfaceC0521x interfaceC0521x;
        synchronized (this.f800b) {
            interfaceC0521x = this.f808l;
        }
        return interfaceC0521x;
    }

    public Set i() {
        return Collections.emptySet();
    }

    public abstract androidx.camera.core.impl.x0 j(androidx.camera.core.impl.G g3);

    public final boolean k(InterfaceC0521x interfaceC0521x) {
        int F7 = ((androidx.camera.core.impl.Q) this.f).F();
        if (F7 != -1 && F7 != 0) {
            if (F7 == 1) {
                return true;
            }
            if (F7 == 2) {
                return interfaceC0521x.d();
            }
            throw new AssertionError(io.flutter.plugins.pathprovider.b.e(F7, "Unknown mirrorMode: "));
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, androidx.camera.core.impl.G] */
    public final androidx.camera.core.impl.y0 l(InterfaceC0519v interfaceC0519v, androidx.camera.core.impl.y0 y0Var, androidx.camera.core.impl.y0 y0Var2) {
        androidx.camera.core.impl.W b5;
        if (y0Var2 != null) {
            b5 = androidx.camera.core.impl.W.c(y0Var2);
            b5.f7596a.remove(I.l.f2121i);
        } else {
            b5 = androidx.camera.core.impl.W.b();
        }
        C0501c c0501c = androidx.camera.core.impl.Q.f7585y;
        ?? r12 = this.f803e;
        boolean h8 = r12.h(c0501c);
        TreeMap treeMap = b5.f7596a;
        if (h8 || r12.h(androidx.camera.core.impl.Q.f7579C)) {
            C0501c c0501c2 = androidx.camera.core.impl.Q.f7583G;
            if (treeMap.containsKey(c0501c2)) {
                treeMap.remove(c0501c2);
            }
        }
        C0501c c0501c3 = androidx.camera.core.impl.Q.f7583G;
        if (r12.h(c0501c3)) {
            C0501c c0501c4 = androidx.camera.core.impl.Q.f7581E;
            if (treeMap.containsKey(c0501c4) && ((P.b) r12.G(c0501c3)).f3889b != null) {
                treeMap.remove(c0501c4);
            }
        }
        for (C0501c c0501c5 : r12.H()) {
            AbstractC0059i.P(b5, b5, r12, c0501c5);
        }
        if (y0Var != null) {
            for (C0501c c0501c6 : y0Var.H()) {
                if (!c0501c6.f7606a.equals(I.l.f2121i.f7606a)) {
                    AbstractC0059i.P(b5, b5, y0Var, c0501c6);
                }
            }
        }
        if (treeMap.containsKey(androidx.camera.core.impl.Q.f7579C)) {
            C0501c c0501c7 = androidx.camera.core.impl.Q.f7585y;
            if (treeMap.containsKey(c0501c7)) {
                treeMap.remove(c0501c7);
            }
        }
        C0501c c0501c8 = androidx.camera.core.impl.Q.f7583G;
        if (treeMap.containsKey(c0501c8)) {
            ((P.b) b5.G(c0501c8)).getClass();
        }
        return r(interfaceC0519v, j(b5));
    }

    public final void m() {
        this.f801c = w0.ACTIVE;
        o();
    }

    public final void n() {
        Iterator it = this.f799a.iterator();
        while (it.hasNext()) {
            ((x0) it.next()).i(this);
        }
    }

    public final void o() {
        int ordinal = this.f801c.ordinal();
        HashSet hashSet = this.f799a;
        if (ordinal != 0) {
            if (ordinal == 1) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((x0) it.next()).j(this);
                }
                return;
            }
            return;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ((x0) it2.next()).c(this);
        }
    }

    public abstract androidx.camera.core.impl.y0 r(InterfaceC0519v interfaceC0519v, androidx.camera.core.impl.x0 x0Var);

    public abstract C0505g u(C1878a c1878a);

    public abstract C0505g v(C0505g c0505g, C0505g c0505g2);

    public abstract void w();

    public void x(Matrix matrix) {
        this.j = new Matrix(matrix);
    }

    public void y(Rect rect) {
        this.f806i = rect;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.camera.core.impl.y0, java.lang.Object] */
    public final void z(InterfaceC0521x interfaceC0521x) {
        w();
        synchronized (this.f800b) {
            try {
                InterfaceC0521x interfaceC0521x2 = this.f807k;
                if (interfaceC0521x == interfaceC0521x2) {
                    this.f799a.remove(interfaceC0521x2);
                    this.f807k = null;
                }
                InterfaceC0521x interfaceC0521x3 = this.f808l;
                if (interfaceC0521x == interfaceC0521x3) {
                    this.f799a.remove(interfaceC0521x3);
                    this.f808l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f804g = null;
        this.f806i = null;
        this.f = this.f803e;
        this.f802d = null;
        this.f805h = null;
    }

    public void p() {
    }

    public void q() {
    }

    public void s() {
    }

    public void t() {
    }
}
