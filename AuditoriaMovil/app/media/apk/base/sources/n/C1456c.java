package n;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.datastore.preferences.protobuf.Y;
import java.lang.reflect.Constructor;
import o.j;
/* renamed from: n.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1456c {

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f14094A;

    /* renamed from: D  reason: collision with root package name */
    public final /* synthetic */ C1457d f14097D;

    /* renamed from: a  reason: collision with root package name */
    public final Menu f14098a;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14104h;

    /* renamed from: i  reason: collision with root package name */
    public int f14105i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f14106k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f14107l;

    /* renamed from: m  reason: collision with root package name */
    public int f14108m;

    /* renamed from: n  reason: collision with root package name */
    public char f14109n;

    /* renamed from: o  reason: collision with root package name */
    public int f14110o;

    /* renamed from: p  reason: collision with root package name */
    public char f14111p;

    /* renamed from: q  reason: collision with root package name */
    public int f14112q;

    /* renamed from: r  reason: collision with root package name */
    public int f14113r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f14114s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f14115t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f14116u;

    /* renamed from: v  reason: collision with root package name */
    public int f14117v;

    /* renamed from: w  reason: collision with root package name */
    public int f14118w;

    /* renamed from: x  reason: collision with root package name */
    public String f14119x;

    /* renamed from: y  reason: collision with root package name */
    public String f14120y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f14121z;

    /* renamed from: B  reason: collision with root package name */
    public ColorStateList f14095B = null;

    /* renamed from: C  reason: collision with root package name */
    public PorterDuff.Mode f14096C = null;

    /* renamed from: b  reason: collision with root package name */
    public int f14099b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f14100c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f14101d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f14102e = 0;
    public boolean f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14103g = true;

    public C1456c(C1457d c1457d, Menu menu) {
        this.f14097D = c1457d;
        this.f14098a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f14097D.f14125c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e7) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e7);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.MenuItem$OnMenuItemClickListener, n.b, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        boolean z7;
        MenuItem enabled = menuItem.setChecked(this.f14114s).setVisible(this.f14115t).setEnabled(this.f14116u);
        boolean z8 = false;
        if (this.f14113r >= 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        enabled.setCheckable(z7).setTitleCondensed(this.f14107l).setIcon(this.f14108m);
        int i7 = this.f14117v;
        if (i7 >= 0) {
            menuItem.setShowAsAction(i7);
        }
        String str = this.f14120y;
        C1457d c1457d = this.f14097D;
        if (str != null) {
            if (!c1457d.f14125c.isRestricted()) {
                if (c1457d.f14126d == null) {
                    c1457d.f14126d = C1457d.a(c1457d.f14125c);
                }
                Object obj = c1457d.f14126d;
                String str2 = this.f14120y;
                ?? obj2 = new Object();
                obj2.f14092a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f14093b = cls.getMethod(str2, MenuItem$OnMenuItemClickListenerC1455b.f14091c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e7) {
                    StringBuilder m7 = Y.m("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    m7.append(cls.getName());
                    InflateException inflateException = new InflateException(m7.toString());
                    inflateException.initCause(e7);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f14113r >= 2 && (menuItem instanceof j)) {
            j jVar = (j) menuItem;
            jVar.f14482x = (jVar.f14482x & (-5)) | 4;
        }
        String str3 = this.f14119x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C1457d.f14122e, c1457d.f14123a));
            z8 = true;
        }
        int i8 = this.f14118w;
        if (i8 > 0) {
            if (!z8) {
                menuItem.setActionView(i8);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        CharSequence charSequence = this.f14121z;
        boolean z9 = menuItem instanceof j;
        if (z9) {
            ((j) menuItem).e(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            X.b.m(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f14094A;
        if (z9) {
            ((j) menuItem).g(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            X.b.q(menuItem, charSequence2);
        }
        char c8 = this.f14109n;
        int i9 = this.f14110o;
        if (z9) {
            ((j) menuItem).setAlphabeticShortcut(c8, i9);
        } else if (Build.VERSION.SDK_INT >= 26) {
            X.b.l(menuItem, c8, i9);
        }
        char c9 = this.f14111p;
        int i10 = this.f14112q;
        if (z9) {
            ((j) menuItem).setNumericShortcut(c9, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            X.b.p(menuItem, c9, i10);
        }
        PorterDuff.Mode mode = this.f14096C;
        if (mode != null) {
            if (z9) {
                ((j) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                X.b.o(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f14095B;
        if (colorStateList != null) {
            if (z9) {
                ((j) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                X.b.n(menuItem, colorStateList);
            }
        }
    }
}
