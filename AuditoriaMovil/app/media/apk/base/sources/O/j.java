package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class j implements MenuItem {

    /* renamed from: A  reason: collision with root package name */
    public MenuItem.OnActionExpandListener f14459A;

    /* renamed from: a  reason: collision with root package name */
    public final int f14461a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14462b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14463c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14464d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f14465e;
    public CharSequence f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f14466g;

    /* renamed from: h  reason: collision with root package name */
    public char f14467h;
    public char j;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f14470l;

    /* renamed from: n  reason: collision with root package name */
    public final MenuC1545i f14472n;

    /* renamed from: o  reason: collision with root package name */
    public t f14473o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f14474p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f14475q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f14476r;

    /* renamed from: z  reason: collision with root package name */
    public View f14484z;

    /* renamed from: i  reason: collision with root package name */
    public int f14468i = RecognitionOptions.AZTEC;

    /* renamed from: k  reason: collision with root package name */
    public int f14469k = RecognitionOptions.AZTEC;

    /* renamed from: m  reason: collision with root package name */
    public int f14471m = 0;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f14477s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f14478t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f14479u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f14480v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f14481w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f14482x = 16;

    /* renamed from: B  reason: collision with root package name */
    public boolean f14460B = false;

    /* renamed from: y  reason: collision with root package name */
    public int f14483y = 0;

    public j(MenuC1545i menuC1545i, int i7, int i8, int i9, int i10, CharSequence charSequence) {
        this.f14472n = menuC1545i;
        this.f14461a = i8;
        this.f14462b = i7;
        this.f14463c = i9;
        this.f14464d = i10;
        this.f14465e = charSequence;
    }

    public static void a(StringBuilder sb, int i7, int i8, String str) {
        if ((i7 & i8) == i8) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f14481w && (this.f14479u || this.f14480v)) {
            drawable = drawable.mutate();
            if (this.f14479u) {
                drawable.setTintList(this.f14477s);
            }
            if (this.f14480v) {
                drawable.setTintMode(this.f14478t);
            }
            this.f14481w = false;
        }
        return drawable;
    }

    public final boolean c() {
        if ((this.f14483y & 8) == 0 || this.f14484z == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f14483y & 8) == 0) {
            return false;
        }
        if (this.f14484z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f14459A;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f14472n.d(this);
    }

    public final boolean d() {
        if ((this.f14482x & 32) == 32) {
            return true;
        }
        return false;
    }

    public final j e(CharSequence charSequence) {
        this.f14475q = charSequence;
        this.f14472n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f14459A;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f14472n.f(this);
    }

    public final void f(boolean z7) {
        if (z7) {
            this.f14482x |= 32;
        } else {
            this.f14482x &= -33;
        }
    }

    public final j g(CharSequence charSequence) {
        this.f14476r = charSequence;
        this.f14472n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f14484z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f14469k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f14475q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f14462b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f14470l;
        if (drawable != null) {
            return b(drawable);
        }
        int i7 = this.f14471m;
        if (i7 != 0) {
            Drawable o7 = AbstractC1740d.o(this.f14472n.f14441a, i7);
            this.f14471m = 0;
            this.f14470l = o7;
            return b(o7);
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f14477s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f14478t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f14466g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f14461a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f14468i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f14467h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f14463c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f14473o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f14465e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence == null) {
            return this.f14465e;
        }
        return charSequence;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f14476r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.f14473o != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f14460B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f14482x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f14482x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f14482x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.f14482x & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i7;
        this.f14484z = view;
        if (view != null && view.getId() == -1 && (i7 = this.f14461a) > 0) {
            view.setId(i7);
        }
        MenuC1545i menuC1545i = this.f14472n;
        menuC1545i.f14449k = true;
        menuC1545i.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c8) {
        if (this.j == c8) {
            return this;
        }
        this.j = Character.toLowerCase(c8);
        this.f14472n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z7) {
        int i7 = this.f14482x;
        int i8 = (z7 ? 1 : 0) | (i7 & (-2));
        this.f14482x = i8;
        if (i7 != i8) {
            this.f14472n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z7) {
        boolean z8;
        int i7;
        int i8 = this.f14482x;
        int i9 = 2;
        if ((i8 & 4) != 0) {
            MenuC1545i menuC1545i = this.f14472n;
            menuC1545i.getClass();
            ArrayList arrayList = menuC1545i.f;
            int size = arrayList.size();
            menuC1545i.s();
            for (int i10 = 0; i10 < size; i10++) {
                j jVar = (j) arrayList.get(i10);
                if (jVar.f14462b == this.f14462b && (jVar.f14482x & 4) != 0 && jVar.isCheckable()) {
                    if (jVar == this) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i11 = jVar.f14482x;
                    int i12 = i11 & (-3);
                    if (z8) {
                        i7 = 2;
                    } else {
                        i7 = 0;
                    }
                    int i13 = i7 | i12;
                    jVar.f14482x = i13;
                    if (i11 != i13) {
                        jVar.f14472n.o(false);
                    }
                }
            }
            menuC1545i.r();
        } else {
            int i14 = i8 & (-3);
            if (!z7) {
                i9 = 0;
            }
            int i15 = i14 | i9;
            this.f14482x = i15;
            if (i8 != i15) {
                this.f14472n.o(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z7) {
        if (z7) {
            this.f14482x |= 16;
        } else {
            this.f14482x &= -17;
        }
        this.f14472n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f14471m = 0;
        this.f14470l = drawable;
        this.f14481w = true;
        this.f14472n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f14477s = colorStateList;
        this.f14479u = true;
        this.f14481w = true;
        this.f14472n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f14478t = mode;
        this.f14480v = true;
        this.f14481w = true;
        this.f14472n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f14466g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c8) {
        if (this.f14467h == c8) {
            return this;
        }
        this.f14467h = c8;
        this.f14472n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f14459A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f14474p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c8, char c9) {
        this.f14467h = c8;
        this.j = Character.toLowerCase(c9);
        this.f14472n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i7) {
        int i8 = i7 & 3;
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f14483y = i7;
        MenuC1545i menuC1545i = this.f14472n;
        menuC1545i.f14449k = true;
        menuC1545i.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f14465e = charSequence;
        this.f14472n.o(false);
        t tVar = this.f14473o;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.f14472n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        g(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z7) {
        int i7;
        int i8 = this.f14482x;
        int i9 = i8 & (-9);
        if (z7) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        int i10 = i7 | i9;
        this.f14482x = i10;
        if (i8 != i10) {
            MenuC1545i menuC1545i = this.f14472n;
            menuC1545i.f14447h = true;
            menuC1545i.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f14465e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c8, int i7) {
        if (this.j == c8 && this.f14469k == i7) {
            return this;
        }
        this.j = Character.toLowerCase(c8);
        this.f14469k = KeyEvent.normalizeMetaState(i7);
        this.f14472n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c8, int i7) {
        if (this.f14467h == c8 && this.f14468i == i7) {
            return this;
        }
        this.f14467h = c8;
        this.f14468i = KeyEvent.normalizeMetaState(i7);
        this.f14472n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c8, char c9, int i7, int i8) {
        this.f14467h = c8;
        this.f14468i = KeyEvent.normalizeMetaState(i7);
        this.j = Character.toLowerCase(c9);
        this.f14469k = KeyEvent.normalizeMetaState(i8);
        this.f14472n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.f14470l = null;
        this.f14471m = i7;
        this.f14481w = true;
        this.f14472n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        setTitle(this.f14472n.f14441a.getString(i7));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        int i8;
        Context context = this.f14472n.f14441a;
        View inflate = LayoutInflater.from(context).inflate(i7, (ViewGroup) new LinearLayout(context), false);
        this.f14484z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i8 = this.f14461a) > 0) {
            inflate.setId(i8);
        }
        MenuC1545i menuC1545i = this.f14472n;
        menuC1545i.f14449k = true;
        menuC1545i.o(true);
        return this;
    }
}
