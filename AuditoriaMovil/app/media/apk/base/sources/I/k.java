package I;

import a.AbstractC0412a;
import a1.C0432i;
import a1.C0433j;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0519v;
import androidx.camera.core.impl.Q;
import c6.s2;
import java.util.TreeSet;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public int f2117a;

    /* renamed from: b  reason: collision with root package name */
    public int f2118b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2119c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2120d;

    public k() {
        this.f2120d = new TreeSet(new K1.d(4));
        f();
    }

    public static int b(int i7, int i8) {
        int min;
        int i9 = i7 - i8;
        if (Math.abs(i9) > 1000 && (min = (Math.min(i7, i8) - Math.max(i7, i8)) + 65535) < 1000) {
            if (i7 >= i8) {
                return -min;
            }
            return min;
        }
        return i9;
    }

    public synchronized void a(C0433j c0433j) {
        this.f2117a = c0433j.f6838a.f6835c;
        ((TreeSet) this.f2120d).add(c0433j);
    }

    public Size c(Q q2) {
        int d7 = q2.d();
        Size e7 = q2.e();
        if (e7 != null) {
            int W7 = AbstractC0412a.W(d7);
            boolean z7 = true;
            if (1 != this.f2118b) {
                z7 = false;
            }
            int t7 = AbstractC0412a.t(W7, this.f2117a, z7);
            if (t7 == 90 || t7 == 270) {
                return new Size(e7.getHeight(), e7.getWidth());
            }
            return e7;
        }
        return e7;
    }

    public synchronized void d(C0432i c0432i, long j) {
        if (((TreeSet) this.f2120d).size() < 5000) {
            int i7 = c0432i.f6835c;
            if (!this.f2119c) {
                f();
                this.f2118b = f7.a.e0(i7 - 1);
                this.f2119c = true;
                a(new C0433j(c0432i, j));
                return;
            } else if (Math.abs(b(i7, C0432i.a(this.f2117a))) < 1000) {
                if (b(i7, this.f2118b) > 0) {
                    a(new C0433j(c0432i, j));
                    return;
                }
                return;
            } else {
                this.f2118b = f7.a.e0(i7 - 1);
                ((TreeSet) this.f2120d).clear();
                a(new C0433j(c0432i, j));
                return;
            }
        }
        throw new IllegalStateException("Queue size limit of 5000 reached.");
    }

    public synchronized C0432i e(long j) {
        if (((TreeSet) this.f2120d).isEmpty()) {
            return null;
        }
        C0433j c0433j = (C0433j) ((TreeSet) this.f2120d).first();
        int i7 = c0433j.f6838a.f6835c;
        if (i7 != C0432i.a(this.f2118b) && j < c0433j.f6839b) {
            return null;
        }
        ((TreeSet) this.f2120d).pollFirst();
        this.f2118b = i7;
        return c0433j.f6838a;
    }

    public synchronized void f() {
        ((TreeSet) this.f2120d).clear();
        this.f2119c = false;
        this.f2118b = -1;
        this.f2117a = -1;
    }

    public k(InterfaceC0519v interfaceC0519v, Rational rational) {
        this.f2117a = interfaceC0519v.a();
        this.f2118b = interfaceC0519v.b();
        this.f2120d = rational;
        boolean z7 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z7 = false;
        }
        this.f2119c = z7;
    }

    public k(boolean z7, int i7, int i8, s2 s2Var) {
        this.f2119c = z7;
        this.f2117a = i7;
        this.f2118b = i8;
        this.f2120d = s2Var;
    }
}
