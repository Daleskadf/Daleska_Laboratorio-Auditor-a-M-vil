package androidx.recyclerview.widget;

import A4.c;
import B0.b;
import D.AbstractC0055e;
import H0.C0132l;
import S1.H;
import Y1.C;
import Y1.C0410k;
import Y1.J;
import Y1.s;
import Y1.t;
import Y1.y;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import f5.C0993a;
import h0.AbstractC1066z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.BitSet;
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends s {

    /* renamed from: h  reason: collision with root package name */
    public final int f8063h;

    /* renamed from: i  reason: collision with root package name */
    public final H[] f8064i;
    public final b j;

    /* renamed from: k  reason: collision with root package name */
    public final b f8065k;

    /* renamed from: l  reason: collision with root package name */
    public final int f8066l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f8067m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f8068n = false;

    /* renamed from: o  reason: collision with root package name */
    public final c f8069o;

    /* renamed from: p  reason: collision with root package name */
    public final int f8070p;

    /* renamed from: q  reason: collision with root package name */
    public J f8071q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f8072r;

    /* renamed from: s  reason: collision with root package name */
    public final G.c f8073s;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f8063h = -1;
        this.f8067m = false;
        c cVar = new c(28, false);
        this.f8069o = cVar;
        this.f8070p = 2;
        new Rect();
        new C0993a(this);
        this.f8072r = true;
        this.f8073s = new G.c(this, 8);
        C0410k w2 = s.w(context, attributeSet, i7, i8);
        int i9 = w2.f6673b;
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i9 != this.f8066l) {
            this.f8066l = i9;
            b bVar = this.j;
            this.j = this.f8065k;
            this.f8065k = bVar;
            H();
        }
        int i10 = w2.f6674c;
        a(null);
        if (i10 != this.f8063h) {
            cVar.f218b = null;
            H();
            this.f8063h = i10;
            new BitSet(this.f8063h);
            this.f8064i = new H[this.f8063h];
            for (int i11 = 0; i11 < this.f8063h; i11++) {
                this.f8064i[i11] = new H(this, i11);
            }
            H();
        }
        boolean z7 = w2.f6675d;
        a(null);
        J j = this.f8071q;
        if (j != null && j.f6615Y != z7) {
            j.f6615Y = z7;
        }
        this.f8067m = z7;
        H();
        C0132l c0132l = new C0132l(4);
        c0132l.f1818b = 0;
        c0132l.f1819c = 0;
        this.j = b.c(this, this.f8066l);
        this.f8065k = b.c(this, 1 - this.f8066l);
    }

    @Override // Y1.s
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View O7 = O(false);
            View N7 = N(false);
            if (O7 != null && N7 != null) {
                ((t) O7.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // Y1.s
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof J) {
            this.f8071q = (J) parcelable;
            H();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, Y1.J] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.Parcelable, java.lang.Object, Y1.J] */
    @Override // Y1.s
    public final Parcelable C() {
        View O7;
        J j = this.f8071q;
        if (j != null) {
            ?? obj = new Object();
            obj.f6619c = j.f6619c;
            obj.f6617a = j.f6617a;
            obj.f6618b = j.f6618b;
            obj.f6620d = j.f6620d;
            obj.f6621e = j.f6621e;
            obj.f = j.f;
            obj.f6615Y = j.f6615Y;
            obj.f6616Z = j.f6616Z;
            obj.f6622e0 = j.f6622e0;
            obj.f6614X = j.f6614X;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.f6615Y = this.f8067m;
        obj2.f6616Z = false;
        obj2.f6622e0 = false;
        obj2.f6621e = 0;
        if (p() > 0) {
            P();
            obj2.f6617a = 0;
            if (this.f8068n) {
                O7 = N(true);
            } else {
                O7 = O(true);
            }
            if (O7 == null) {
                obj2.f6618b = -1;
                int i7 = this.f8063h;
                obj2.f6619c = i7;
                obj2.f6620d = new int[i7];
                for (int i8 = 0; i8 < this.f8063h; i8++) {
                    H h8 = this.f8064i[i8];
                    int i9 = h8.f4957a;
                    if (i9 == Integer.MIN_VALUE) {
                        if (((ArrayList) h8.f4960d).size() == 0) {
                            i9 = Integer.MIN_VALUE;
                        } else {
                            View view = (View) ((ArrayList) h8.f4960d).get(0);
                            h8.f4957a = ((StaggeredGridLayoutManager) h8.f4961e).j.e(view);
                            ((Y1.H) view.getLayoutParams()).getClass();
                            i9 = h8.f4957a;
                        }
                    }
                    if (i9 != Integer.MIN_VALUE) {
                        i9 -= this.j.g();
                    }
                    obj2.f6620d[i8] = i9;
                }
            } else {
                ((t) O7.getLayoutParams()).getClass();
                throw null;
            }
        } else {
            obj2.f6617a = -1;
            obj2.f6618b = -1;
            obj2.f6619c = 0;
        }
        return obj2;
    }

    @Override // Y1.s
    public final void D(int i7) {
        if (i7 == 0) {
            J();
        }
    }

    public final boolean J() {
        int i7 = this.f8063h;
        boolean z7 = this.f8068n;
        if (p() == 0 || this.f8070p == 0 || !this.f6689e) {
            return false;
        }
        if (z7) {
            Q();
            P();
        } else {
            P();
            Q();
        }
        int p7 = p();
        int i8 = p7 - 1;
        new BitSet(i7).set(0, i7, true);
        if (this.f8066l == 1) {
            RecyclerView recyclerView = this.f6686b;
            Field field = AbstractC1066z.f11214a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z7) {
            p7 = -1;
        } else {
            i8 = 0;
        }
        if (i8 == p7) {
            return false;
        }
        ((Y1.H) o(i8).getLayoutParams()).getClass();
        throw null;
    }

    public final int K(C c8) {
        if (p() == 0) {
            return 0;
        }
        b bVar = this.j;
        boolean z7 = !this.f8072r;
        return AbstractC0055e.d(c8, bVar, O(z7), N(z7), this, this.f8072r);
    }

    public final void L(C c8) {
        if (p() == 0) {
            return;
        }
        boolean z7 = !this.f8072r;
        View O7 = O(z7);
        View N7 = N(z7);
        if (p() != 0 && c8.a() != 0 && O7 != null && N7 != null) {
            ((t) O7.getLayoutParams()).getClass();
            throw null;
        }
    }

    public final int M(C c8) {
        if (p() == 0) {
            return 0;
        }
        b bVar = this.j;
        boolean z7 = !this.f8072r;
        return AbstractC0055e.e(c8, bVar, O(z7), N(z7), this, this.f8072r);
    }

    public final View N(boolean z7) {
        int g3 = this.j.g();
        int f = this.j.f();
        View view = null;
        for (int p7 = p() - 1; p7 >= 0; p7--) {
            View o7 = o(p7);
            int e7 = this.j.e(o7);
            int d7 = this.j.d(o7);
            if (d7 > g3 && e7 < f) {
                if (d7 > f && z7) {
                    if (view == null) {
                        view = o7;
                    }
                } else {
                    return o7;
                }
            }
        }
        return view;
    }

    public final View O(boolean z7) {
        int g3 = this.j.g();
        int f = this.j.f();
        int p7 = p();
        View view = null;
        for (int i7 = 0; i7 < p7; i7++) {
            View o7 = o(i7);
            int e7 = this.j.e(o7);
            if (this.j.d(o7) > g3 && e7 < f) {
                if (e7 < g3 && z7) {
                    if (view == null) {
                        view = o7;
                    }
                } else {
                    return o7;
                }
            }
        }
        return view;
    }

    public final void P() {
        if (p() == 0) {
            return;
        }
        s.v(o(0));
        throw null;
    }

    public final void Q() {
        int p7 = p();
        if (p7 == 0) {
            return;
        }
        s.v(o(p7 - 1));
        throw null;
    }

    @Override // Y1.s
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f8071q == null && (recyclerView = this.f6686b) != null) {
            recyclerView.b(str);
        }
    }

    @Override // Y1.s
    public final boolean b() {
        if (this.f8066l == 0) {
            return true;
        }
        return false;
    }

    @Override // Y1.s
    public final boolean c() {
        if (this.f8066l == 1) {
            return true;
        }
        return false;
    }

    @Override // Y1.s
    public final boolean d(t tVar) {
        return tVar instanceof Y1.H;
    }

    @Override // Y1.s
    public final int f(C c8) {
        return K(c8);
    }

    @Override // Y1.s
    public final void g(C c8) {
        L(c8);
    }

    @Override // Y1.s
    public final int h(C c8) {
        return M(c8);
    }

    @Override // Y1.s
    public final int i(C c8) {
        return K(c8);
    }

    @Override // Y1.s
    public final void j(C c8) {
        L(c8);
    }

    @Override // Y1.s
    public final int k(C c8) {
        return M(c8);
    }

    @Override // Y1.s
    public final t l() {
        if (this.f8066l == 0) {
            return new t(-2, -1);
        }
        return new t(-1, -2);
    }

    @Override // Y1.s
    public final t m(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    @Override // Y1.s
    public final t n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new t((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new t(layoutParams);
    }

    @Override // Y1.s
    public final int q(y yVar, C c8) {
        if (this.f8066l == 1) {
            return this.f8063h;
        }
        super.q(yVar, c8);
        return 1;
    }

    @Override // Y1.s
    public final int x(y yVar, C c8) {
        if (this.f8066l == 0) {
            return this.f8063h;
        }
        super.x(yVar, c8);
        return 1;
    }

    @Override // Y1.s
    public final boolean y() {
        if (this.f8070p != 0) {
            return true;
        }
        return false;
    }

    @Override // Y1.s
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f6686b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f8073s);
        }
        for (int i7 = 0; i7 < this.f8063h; i7++) {
            H h8 = this.f8064i[i7];
            ((ArrayList) h8.f4960d).clear();
            h8.f4957a = Integer.MIN_VALUE;
            h8.f4958b = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
