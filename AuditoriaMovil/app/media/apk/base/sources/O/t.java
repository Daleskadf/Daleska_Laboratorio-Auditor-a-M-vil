package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes.dex */
public final class t extends MenuC1545i implements SubMenu {

    /* renamed from: v  reason: collision with root package name */
    public final MenuC1545i f14514v;

    /* renamed from: w  reason: collision with root package name */
    public final j f14515w;

    public t(Context context, MenuC1545i menuC1545i, j jVar) {
        super(context);
        this.f14514v = menuC1545i;
        this.f14515w = jVar;
    }

    @Override // o.MenuC1545i
    public final boolean d(j jVar) {
        return this.f14514v.d(jVar);
    }

    @Override // o.MenuC1545i
    public final boolean e(MenuC1545i menuC1545i, MenuItem menuItem) {
        if (!super.e(menuC1545i, menuItem) && !this.f14514v.e(menuC1545i, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // o.MenuC1545i
    public final boolean f(j jVar) {
        return this.f14514v.f(jVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f14515w;
    }

    @Override // o.MenuC1545i
    public final MenuC1545i j() {
        return this.f14514v.j();
    }

    @Override // o.MenuC1545i
    public final boolean l() {
        return this.f14514v.l();
    }

    @Override // o.MenuC1545i
    public final boolean m() {
        return this.f14514v.m();
    }

    @Override // o.MenuC1545i
    public final boolean n() {
        return this.f14514v.n();
    }

    @Override // o.MenuC1545i, android.view.Menu
    public final void setGroupDividerEnabled(boolean z7) {
        this.f14514v.setGroupDividerEnabled(z7);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f14515w.setIcon(drawable);
        return this;
    }

    @Override // o.MenuC1545i, android.view.Menu
    public final void setQwertyMode(boolean z7) {
        this.f14514v.setQwertyMode(z7);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i7) {
        q(0, null, i7, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i7) {
        q(i7, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i7) {
        this.f14515w.setIcon(i7);
        return this;
    }
}
