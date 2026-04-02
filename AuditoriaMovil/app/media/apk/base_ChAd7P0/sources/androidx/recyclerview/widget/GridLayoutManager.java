package androidx.recyclerview.widget;

import A4.c;
import Y1.C;
import Y1.C0409j;
import Y1.s;
import Y1.t;
import Y1.y;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import io.flutter.plugins.pathprovider.b;
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: p  reason: collision with root package name */
    public final int f7996p;

    /* renamed from: q  reason: collision with root package name */
    public final c f7997q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f7996p = -1;
        new SparseIntArray();
        new SparseIntArray();
        c cVar = new c(27);
        this.f7997q = cVar;
        new Rect();
        int i9 = s.w(context, attributeSet, i7, i8).f6674c;
        if (i9 != this.f7996p) {
            if (i9 >= 1) {
                this.f7996p = i9;
                ((SparseIntArray) cVar.f218b).clear();
                H();
                return;
            }
            throw new IllegalArgumentException(b.e(i9, "Span count should be at least 1. Provided "));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z7) {
        if (!z7) {
            super.Q(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final int R(y yVar, C c8, int i7) {
        int p02;
        boolean z7 = c8.f6599c;
        c cVar = this.f7997q;
        if (!z7) {
            int i8 = this.f7996p;
            cVar.getClass();
            return c.r(i7, i8);
        }
        RecyclerView recyclerView = (RecyclerView) yVar.f6695X;
        if (i7 >= 0 && i7 < recyclerView.f8027S0.a()) {
            if (!recyclerView.f8027S0.f6599c) {
                p02 = i7;
            } else {
                p02 = recyclerView.f8039c.p0(i7, 0);
            }
            if (p02 == -1) {
                Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i7);
                return 0;
            }
            int i9 = this.f7996p;
            cVar.getClass();
            return c.r(p02, i9);
        }
        StringBuilder k2 = b.k("invalid position ", i7, ". State item count is ");
        k2.append(recyclerView.f8027S0.a());
        k2.append(recyclerView.h());
        throw new IndexOutOfBoundsException(k2.toString());
    }

    @Override // Y1.s
    public final boolean d(t tVar) {
        return tVar instanceof C0409j;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, Y1.s
    public final t l() {
        if (this.f7998h == 0) {
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
        if (this.f7998h == 1) {
            return this.f7996p;
        }
        if (c8.a() < 1) {
            return 0;
        }
        return R(yVar, c8, c8.a() - 1) + 1;
    }

    @Override // Y1.s
    public final int x(y yVar, C c8) {
        if (this.f7998h == 0) {
            return this.f7996p;
        }
        if (c8.a() < 1) {
            return 0;
        }
        return R(yVar, c8, c8.a() - 1) + 1;
    }
}
