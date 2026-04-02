package androidx.recyclerview.widget;

import B0.b;
import D.AbstractC0055e;
import Y1.C;
import Y1.C0410k;
import Y1.C0411l;
import Y1.s;
import Y1.t;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import v4.d;
/* loaded from: classes.dex */
public class LinearLayoutManager extends s {

    /* renamed from: h  reason: collision with root package name */
    public final int f7998h;

    /* renamed from: i  reason: collision with root package name */
    public d f7999i;
    public final b j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f8000k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f8001l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f8002m = false;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f8003n = true;

    /* renamed from: o  reason: collision with root package name */
    public C0411l f8004o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f7998h = 1;
        this.f8000k = false;
        C0410k c0410k = new C0410k(0);
        c0410k.f6673b = -1;
        c0410k.f6674c = Integer.MIN_VALUE;
        c0410k.f6675d = false;
        c0410k.f6676e = false;
        C0410k w2 = s.w(context, attributeSet, i7, i8);
        int i9 = w2.f6673b;
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i9, "invalid orientation:"));
        }
        a(null);
        if (i9 != this.f7998h || this.j == null) {
            this.j = b.c(this, i9);
            this.f7998h = i9;
            H();
        }
        boolean z7 = w2.f6675d;
        a(null);
        if (z7 != this.f8000k) {
            this.f8000k = z7;
            H();
        }
        Q(w2.f6676e);
    }

    @Override // Y1.s
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View P7 = P(0, p(), false);
            if (P7 == null) {
                accessibilityEvent.setFromIndex(-1);
                View P8 = P(p() - 1, -1, false);
                if (P8 == null) {
                    accessibilityEvent.setToIndex(-1);
                    return;
                } else {
                    ((t) P8.getLayoutParams()).getClass();
                    throw null;
                }
            }
            ((t) P7.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // Y1.s
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0411l) {
            this.f8004o = (C0411l) parcelable;
            H();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, Y1.l] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.os.Parcelable, java.lang.Object, Y1.l] */
    @Override // Y1.s
    public final Parcelable C() {
        C0411l c0411l = this.f8004o;
        if (c0411l != null) {
            ?? obj = new Object();
            obj.f6677a = c0411l.f6677a;
            obj.f6678b = c0411l.f6678b;
            obj.f6679c = c0411l.f6679c;
            return obj;
        }
        ?? obj2 = new Object();
        if (p() > 0) {
            M();
            boolean z7 = this.f8001l;
            obj2.f6679c = z7;
            int i7 = 0;
            if (z7) {
                if (!z7) {
                    i7 = p() - 1;
                }
                View o7 = o(i7);
                obj2.f6678b = this.j.f() - this.j.d(o7);
                s.v(o7);
                throw null;
            }
            if (z7) {
                i7 = p() - 1;
            }
            s.v(o(i7));
            throw null;
        }
        obj2.f6677a = -1;
        return obj2;
    }

    public final int J(C c8) {
        if (p() == 0) {
            return 0;
        }
        M();
        b bVar = this.j;
        boolean z7 = !this.f8003n;
        return AbstractC0055e.d(c8, bVar, O(z7), N(z7), this, this.f8003n);
    }

    public final void K(C c8) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z7 = !this.f8003n;
        View O7 = O(z7);
        View N7 = N(z7);
        if (p() != 0 && c8.a() != 0 && O7 != null && N7 != null) {
            ((t) O7.getLayoutParams()).getClass();
            throw null;
        }
    }

    public final int L(C c8) {
        if (p() == 0) {
            return 0;
        }
        M();
        b bVar = this.j;
        boolean z7 = !this.f8003n;
        return AbstractC0055e.e(c8, bVar, O(z7), N(z7), this, this.f8003n);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [v4.d, java.lang.Object] */
    public final void M() {
        if (this.f7999i == null) {
            this.f7999i = new Object();
        }
    }

    public final View N(boolean z7) {
        if (this.f8001l) {
            return P(0, p(), z7);
        }
        return P(p() - 1, -1, z7);
    }

    public final View O(boolean z7) {
        if (this.f8001l) {
            return P(p() - 1, -1, z7);
        }
        return P(0, p(), z7);
    }

    public final View P(int i7, int i8, boolean z7) {
        int i9;
        M();
        if (z7) {
            i9 = 24579;
        } else {
            i9 = 320;
        }
        if (this.f7998h == 0) {
            return this.f6687c.w(i7, i8, i9, 320);
        }
        return this.f6688d.w(i7, i8, i9, 320);
    }

    public void Q(boolean z7) {
        a(null);
        if (this.f8002m == z7) {
            return;
        }
        this.f8002m = z7;
        H();
    }

    @Override // Y1.s
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f8004o == null && (recyclerView = this.f6686b) != null) {
            recyclerView.b(str);
        }
    }

    @Override // Y1.s
    public final boolean b() {
        if (this.f7998h == 0) {
            return true;
        }
        return false;
    }

    @Override // Y1.s
    public final boolean c() {
        if (this.f7998h == 1) {
            return true;
        }
        return false;
    }

    @Override // Y1.s
    public final int f(C c8) {
        return J(c8);
    }

    @Override // Y1.s
    public final void g(C c8) {
        K(c8);
    }

    @Override // Y1.s
    public final int h(C c8) {
        return L(c8);
    }

    @Override // Y1.s
    public final int i(C c8) {
        return J(c8);
    }

    @Override // Y1.s
    public final void j(C c8) {
        K(c8);
    }

    @Override // Y1.s
    public final int k(C c8) {
        return L(c8);
    }

    @Override // Y1.s
    public t l() {
        return new t(-2, -2);
    }

    @Override // Y1.s
    public final boolean y() {
        return true;
    }

    @Override // Y1.s
    public final void z(RecyclerView recyclerView) {
    }
}
