package p;

import a1.C0415A;
import android.content.Context;
import android.view.View;
import com.example.appecoactivate.R;
import o.MenuC1545i;
/* renamed from: p.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1581f extends o.n {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f14789l = 1;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C1587i f14790m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1581f(C1587i c1587i, Context context, MenuC1545i menuC1545i, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC1545i, true);
        this.f14790m = c1587i;
        this.f = 8388613;
        C0415A c0415a = c1587i.q0;
        this.f14493h = c0415a;
        o.k kVar = this.f14494i;
        if (kVar != null) {
            kVar.f(c0415a);
        }
    }

    @Override // o.n
    public final void c() {
        switch (this.f14789l) {
            case 0:
                C1587i c1587i = this.f14790m;
                c1587i.f14834n0 = null;
                c1587i.getClass();
                super.c();
                return;
            default:
                C1587i c1587i2 = this.f14790m;
                MenuC1545i menuC1545i = c1587i2.f14822c;
                if (menuC1545i != null) {
                    menuC1545i.c(true);
                }
                c1587i2.f14833m0 = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1581f(C1587i c1587i, Context context, o.t tVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, tVar, false);
        this.f14790m = c1587i;
        if (!tVar.f14515w.d()) {
            View view2 = c1587i.f14818Y;
            this.f14491e = view2 == null ? c1587i.f14817X : view2;
        }
        C0415A c0415a = c1587i.q0;
        this.f14493h = c0415a;
        o.k kVar = this.f14494i;
        if (kVar != null) {
            kVar.f(c0415a);
        }
    }
}
