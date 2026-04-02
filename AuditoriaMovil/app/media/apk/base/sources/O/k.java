package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
/* loaded from: classes.dex */
public abstract class k implements r, p, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Rect f14485a;

    public static int m(ListAdapter listAdapter, Context context, int i7) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i8 = 0;
        int i9 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = listAdapter.getItemViewType(i10);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i10, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i7) {
                return i7;
            }
            if (measuredWidth > i8) {
                i8 = measuredWidth;
            }
        }
        return i8;
    }

    public static boolean u(MenuC1545i menuC1545i) {
        int size = menuC1545i.f.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = menuC1545i.getItem(i7);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // o.p
    public final boolean e(j jVar) {
        return false;
    }

    @Override // o.p
    public final boolean k(j jVar) {
        return false;
    }

    public abstract void l(MenuC1545i menuC1545i);

    public abstract void n(View view);

    public abstract void o(boolean z7);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        C1543g c1543g;
        int i8;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            c1543g = (C1543g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            c1543g = (C1543g) listAdapter;
        }
        MenuC1545i menuC1545i = c1543g.f14435a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i7);
        if (!(this instanceof View$OnKeyListenerC1542f)) {
            i8 = 0;
        } else {
            i8 = 4;
        }
        menuC1545i.p(menuItem, this, i8);
    }

    public abstract void p(int i7);

    public abstract void q(int i7);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z7);

    public abstract void t(int i7);

    @Override // o.p
    public final void g(Context context, MenuC1545i menuC1545i) {
    }
}
