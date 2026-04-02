package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import o.C1543g;
import o.MenuC1545i;
/* renamed from: p.l0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1594l0 extends V {

    /* renamed from: k0  reason: collision with root package name */
    public final int f14842k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f14843l0;

    /* renamed from: m0  reason: collision with root package name */
    public InterfaceC1586h0 f14844m0;

    /* renamed from: n0  reason: collision with root package name */
    public o.j f14845n0;

    public C1594l0(Context context, boolean z7) {
        super(context, z7);
        if (1 == AbstractC1592k0.a(context.getResources().getConfiguration())) {
            this.f14842k0 = 21;
            this.f14843l0 = 22;
            return;
        }
        this.f14842k0 = 22;
        this.f14843l0 = 21;
    }

    @Override // p.V, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1543g c1543g;
        int i7;
        o.j jVar;
        int pointToPosition;
        int i8;
        if (this.f14844m0 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i7 = headerViewListAdapter.getHeadersCount();
                c1543g = (C1543g) headerViewListAdapter.getWrappedAdapter();
            } else {
                c1543g = (C1543g) adapter;
                i7 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i8 = pointToPosition - i7) >= 0 && i8 < c1543g.getCount()) {
                jVar = c1543g.getItem(i8);
            } else {
                jVar = null;
            }
            o.j jVar2 = this.f14845n0;
            if (jVar2 != jVar) {
                MenuC1545i menuC1545i = c1543g.f14435a;
                if (jVar2 != null) {
                    this.f14844m0.h(menuC1545i, jVar2);
                }
                this.f14845n0 = jVar;
                if (jVar != null) {
                    this.f14844m0.a(menuC1545i, jVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        C1543g c1543g;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i7 == this.f14842k0) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView != null && i7 == this.f14843l0) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                c1543g = (C1543g) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                c1543g = (C1543g) adapter;
            }
            c1543g.f14435a.c(false);
            return true;
        } else {
            return super.onKeyDown(i7, keyEvent);
        }
    }

    public void setHoverListener(InterfaceC1586h0 interfaceC1586h0) {
        this.f14844m0 = interfaceC1586h0;
    }

    @Override // p.V, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
