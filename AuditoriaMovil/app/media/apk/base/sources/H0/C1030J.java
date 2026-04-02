package h0;

import android.view.WindowInsets;
/* renamed from: h0.J  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1030J extends AbstractC1029I {

    /* renamed from: l  reason: collision with root package name */
    public Z.c f11166l;

    public C1030J(C1036P c1036p, WindowInsets windowInsets) {
        super(c1036p, windowInsets);
        this.f11166l = null;
    }

    @Override // h0.C1035O
    public C1036P b() {
        return C1036P.c(null, this.f11163c.consumeStableInsets());
    }

    @Override // h0.C1035O
    public C1036P c() {
        return C1036P.c(null, this.f11163c.consumeSystemWindowInsets());
    }

    @Override // h0.C1035O
    public final Z.c f() {
        if (this.f11166l == null) {
            WindowInsets windowInsets = this.f11163c;
            this.f11166l = Z.c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f11166l;
    }

    @Override // h0.C1035O
    public boolean i() {
        return this.f11163c.isConsumed();
    }

    @Override // h0.C1035O
    public void m(Z.c cVar) {
        this.f11166l = cVar;
    }
}
