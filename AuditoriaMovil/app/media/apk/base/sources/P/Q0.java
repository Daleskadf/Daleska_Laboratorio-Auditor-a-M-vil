package p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import n.InterfaceC1454a;
import o.MenuC1545i;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class Q0 implements o.p {

    /* renamed from: a  reason: collision with root package name */
    public MenuC1545i f14711a;

    /* renamed from: b  reason: collision with root package name */
    public o.j f14712b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Toolbar f14713c;

    public Q0(Toolbar toolbar) {
        this.f14713c = toolbar;
    }

    @Override // o.p
    public final void c() {
        if (this.f14712b != null) {
            MenuC1545i menuC1545i = this.f14711a;
            if (menuC1545i != null) {
                int size = menuC1545i.f.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (this.f14711a.getItem(i7) == this.f14712b) {
                        return;
                    }
                }
            }
            k(this.f14712b);
        }
    }

    @Override // o.p
    public final boolean e(o.j jVar) {
        Toolbar toolbar = this.f14713c;
        toolbar.c();
        ViewParent parent = toolbar.f7462f0.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f7462f0);
            }
            toolbar.addView(toolbar.f7462f0);
        }
        View view = jVar.f14484z;
        if (view == null) {
            view = null;
        }
        toolbar.f7463g0 = view;
        this.f14712b = jVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f7463g0);
            }
            R0 g3 = Toolbar.g();
            g3.f14714a = (toolbar.f7468l0 & 112) | 8388611;
            g3.f14715b = 2;
            toolbar.f7463g0.setLayoutParams(g3);
            toolbar.addView(toolbar.f7463g0);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((R0) childAt.getLayoutParams()).f14715b != 2 && childAt != toolbar.f7456a) {
                toolbar.removeViewAt(childCount);
                toolbar.f7444C0.add(childAt);
            }
        }
        toolbar.requestLayout();
        jVar.f14460B = true;
        jVar.f14472n.o(false);
        View view2 = toolbar.f7463g0;
        if (view2 instanceof InterfaceC1454a) {
            SearchView searchView = (SearchView) ((InterfaceC1454a) view2);
            if (!searchView.f7377U0) {
                searchView.f7377U0 = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f7384n0;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f7378V0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText(StringUtils.EMPTY);
                searchView.setIconified(false);
            }
        }
        toolbar.t();
        return true;
    }

    @Override // o.p
    public final void g(Context context, MenuC1545i menuC1545i) {
        o.j jVar;
        MenuC1545i menuC1545i2 = this.f14711a;
        if (menuC1545i2 != null && (jVar = this.f14712b) != null) {
            menuC1545i2.d(jVar);
        }
        this.f14711a = menuC1545i;
    }

    @Override // o.p
    public final boolean h() {
        return false;
    }

    @Override // o.p
    public final boolean j(o.t tVar) {
        return false;
    }

    @Override // o.p
    public final boolean k(o.j jVar) {
        Toolbar toolbar = this.f14713c;
        View view = toolbar.f7463g0;
        if (view instanceof InterfaceC1454a) {
            SearchView searchView = (SearchView) ((InterfaceC1454a) view);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f7384n0;
            searchAutoComplete.setText(StringUtils.EMPTY);
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f7376T0 = StringUtils.EMPTY;
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f7378V0);
            searchView.f7377U0 = false;
        }
        toolbar.removeView(toolbar.f7463g0);
        toolbar.removeView(toolbar.f7462f0);
        toolbar.f7463g0 = null;
        ArrayList arrayList = toolbar.f7444C0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f14712b = null;
        toolbar.requestLayout();
        jVar.f14460B = false;
        jVar.f14472n.o(false);
        toolbar.t();
        return true;
    }

    @Override // o.p
    public final void a(MenuC1545i menuC1545i, boolean z7) {
    }
}
