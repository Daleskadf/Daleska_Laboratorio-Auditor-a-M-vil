package o;

import a1.C0415A;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import b3.C0585f;
import h0.AbstractC1021A;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p.InterfaceC1593l;
import z0.E;
/* renamed from: o.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC1545i implements Menu {

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f14440u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f14441a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f14442b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14443c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14444d;

    /* renamed from: e  reason: collision with root package name */
    public C0585f f14445e;
    public final ArrayList f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f14446g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14447h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f14448i;
    public final ArrayList j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f14449k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f14450l;

    /* renamed from: s  reason: collision with root package name */
    public j f14457s;

    /* renamed from: m  reason: collision with root package name */
    public boolean f14451m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f14452n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f14453o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14454p = false;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f14455q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    public final CopyOnWriteArrayList f14456r = new CopyOnWriteArrayList();

    /* renamed from: t  reason: collision with root package name */
    public boolean f14458t = false;

    public MenuC1545i(Context context) {
        boolean z7;
        boolean z8 = false;
        this.f14441a = context;
        Resources resources = context.getResources();
        this.f14442b = resources;
        this.f = new ArrayList();
        this.f14446g = new ArrayList();
        this.f14447h = true;
        this.f14448i = new ArrayList();
        this.j = new ArrayList();
        this.f14449k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC1021A.f11151a;
            if (Build.VERSION.SDK_INT >= 28) {
                z7 = X.c.m(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            }
            if (z7) {
                z8 = true;
            }
        }
        this.f14444d = z8;
    }

    public final j a(int i7, int i8, int i9, CharSequence charSequence) {
        int i10;
        int i11 = ((-65536) & i9) >> 16;
        if (i11 >= 0 && i11 < 6) {
            int i12 = (f14440u[i11] << 16) | (65535 & i9);
            j jVar = new j(this, i7, i8, i9, i12, charSequence);
            ArrayList arrayList = this.f;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((j) arrayList.get(size)).f14464d <= i12) {
                        i10 = size + 1;
                        break;
                    }
                    size--;
                } else {
                    i10 = 0;
                    break;
                }
            }
            arrayList.add(i10, jVar);
            o(true);
            return jVar;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        Intent intent2;
        int i12;
        PackageManager packageManager = this.f14441a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i11 = queryIntentActivityOptions.size();
        } else {
            i11 = 0;
        }
        if ((i10 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i13);
            int i14 = resolveInfo.specificIndex;
            if (i14 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i14];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            j a7 = a(i7, i8, i9, resolveInfo.loadLabel(packageManager));
            a7.setIcon(resolveInfo.loadIcon(packageManager));
            a7.f14466g = intent3;
            if (menuItemArr != null && (i12 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i12] = a7;
            }
        }
        return i11;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(p pVar, Context context) {
        this.f14456r.add(new WeakReference(pVar));
        pVar.g(context, this);
        this.f14449k = true;
    }

    public final void c(boolean z7) {
        if (this.f14454p) {
            return;
        }
        this.f14454p = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f14456r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.a(this, z7);
            }
        }
        this.f14454p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        j jVar = this.f14457s;
        if (jVar != null) {
            d(jVar);
        }
        this.f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f14450l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(j jVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f14456r;
        boolean z7 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f14457s == jVar) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z7 = pVar.k(jVar);
                    if (z7) {
                        break;
                    }
                }
            }
            r();
            if (z7) {
                this.f14457s = null;
            }
        }
        return z7;
    }

    public boolean e(MenuC1545i menuC1545i, MenuItem menuItem) {
        InterfaceC1593l interfaceC1593l;
        C0585f c0585f = this.f14445e;
        if (c0585f != null && (interfaceC1593l = ((ActionMenuView) c0585f.f8171b).f7345w0) != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((C0415A) interfaceC1593l).f6744a).f7446E0.f4683c).iterator();
            while (it.hasNext()) {
                if (((E) it.next()).f16634a.p()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean f(j jVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f14456r;
        boolean z7 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z7 = pVar.e(jVar);
                if (z7) {
                    break;
                }
            }
        }
        r();
        if (z7) {
            this.f14457s = jVar;
        }
        return z7;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        MenuItem findItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            j jVar = (j) arrayList.get(i8);
            if (jVar.f14461a == i7) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.f14473o.findItem(i7)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final j g(int i7, KeyEvent keyEvent) {
        char c8;
        ArrayList arrayList = this.f14455q;
        arrayList.clear();
        h(arrayList, i7, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (j) arrayList.get(0);
        }
        boolean m7 = m();
        for (int i8 = 0; i8 < size; i8++) {
            j jVar = (j) arrayList.get(i8);
            if (m7) {
                c8 = jVar.j;
            } else {
                c8 = jVar.f14467h;
            }
            char[] cArr = keyData.meta;
            if ((c8 == cArr[0] && (metaState & 2) == 0) || ((c8 == cArr[2] && (metaState & 2) != 0) || (m7 && c8 == '\b' && i7 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return (MenuItem) this.f.get(i7);
    }

    public final void h(ArrayList arrayList, int i7, KeyEvent keyEvent) {
        char c8;
        int i8;
        boolean m7 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i7 != 67) {
            return;
        }
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i9 = 0; i9 < size; i9++) {
            j jVar = (j) arrayList2.get(i9);
            if (jVar.hasSubMenu()) {
                jVar.f14473o.h(arrayList, i7, keyEvent);
            }
            if (m7) {
                c8 = jVar.j;
            } else {
                c8 = jVar.f14467h;
            }
            if (m7) {
                i8 = jVar.f14469k;
            } else {
                i8 = jVar.f14468i;
            }
            if ((modifiers & 69647) == (i8 & 69647) && c8 != 0) {
                char[] cArr = keyData.meta;
                if (c8 != cArr[0] && c8 != cArr[2]) {
                    if (m7 && c8 == '\b') {
                        if (i7 != 67) {
                        }
                    }
                }
                if (jVar.isEnabled()) {
                    arrayList.add(jVar);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((j) arrayList.get(i7)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k2 = k();
        if (!this.f14449k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f14456r;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z7 |= pVar.h();
            }
        }
        ArrayList arrayList = this.f14448i;
        ArrayList arrayList2 = this.j;
        if (z7) {
            arrayList.clear();
            arrayList2.clear();
            int size = k2.size();
            for (int i7 = 0; i7 < size; i7++) {
                j jVar = (j) k2.get(i7);
                if (jVar.d()) {
                    arrayList.add(jVar);
                } else {
                    arrayList2.add(jVar);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(k());
        }
        this.f14449k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        if (g(i7, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public final ArrayList k() {
        boolean z7 = this.f14447h;
        ArrayList arrayList = this.f14446g;
        if (!z7) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            j jVar = (j) arrayList2.get(i7);
            if (jVar.isVisible()) {
                arrayList.add(jVar);
            }
        }
        this.f14447h = false;
        this.f14449k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f14458t;
    }

    public boolean m() {
        return this.f14443c;
    }

    public boolean n() {
        return this.f14444d;
    }

    public final void o(boolean z7) {
        if (!this.f14451m) {
            if (z7) {
                this.f14447h = true;
                this.f14449k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f14456r;
            if (!copyOnWriteArrayList.isEmpty()) {
                s();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    p pVar = (p) weakReference.get();
                    if (pVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        pVar.c();
                    }
                }
                r();
                return;
            }
            return;
        }
        this.f14452n = true;
        if (z7) {
            this.f14453o = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MenuItem r6, o.k r7, int r8) {
        /*
            r5 = this;
            o.j r6 = (o.j) r6
            r0 = 0
            if (r6 == 0) goto Lab
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto Ld
            goto Lab
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r6.f14474p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r6)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L36
        L1a:
            o.i r1 = r6.f14472n
            boolean r3 = r1.e(r1, r6)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r6.f14466g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f14441a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            r1 = r0
        L36:
            boolean r3 = r6.c()
            if (r3 == 0) goto L47
            boolean r6 = r6.expandActionView()
            r1 = r1 | r6
            if (r1 == 0) goto Laa
            r5.c(r2)
            goto Laa
        L47:
            boolean r3 = r6.hasSubMenu()
            if (r3 != 0) goto L55
            r6 = r8 & 1
            if (r6 != 0) goto Laa
            r5.c(r2)
            goto Laa
        L55:
            r8 = r8 & 4
            if (r8 != 0) goto L5c
            r5.c(r0)
        L5c:
            boolean r8 = r6.hasSubMenu()
            if (r8 != 0) goto L70
            o.t r8 = new o.t
            android.content.Context r3 = r5.f14441a
            r8.<init>(r3, r5, r6)
            r6.f14473o = r8
            java.lang.CharSequence r3 = r6.f14465e
            r8.setHeaderTitle(r3)
        L70:
            o.t r6 = r6.f14473o
            java.util.concurrent.CopyOnWriteArrayList r8 = r5.f14456r
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L7b
            goto La4
        L7b:
            if (r7 == 0) goto L81
            boolean r0 = r7.j(r6)
        L81:
            java.util.Iterator r7 = r8.iterator()
        L85:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto La4
            java.lang.Object r3 = r7.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            o.p r4 = (o.p) r4
            if (r4 != 0) goto L9d
            r8.remove(r3)
            goto L85
        L9d:
            if (r0 != 0) goto L85
            boolean r0 = r4.j(r6)
            goto L85
        La4:
            r1 = r1 | r0
            if (r1 != 0) goto Laa
            r5.c(r2)
        Laa:
            return r1
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.MenuC1545i.p(android.view.MenuItem, o.k, int):boolean");
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i8) {
        return p(findItem(i7), null, i8);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        boolean z7;
        j g3 = g(i7, keyEvent);
        if (g3 != null) {
            z7 = p(g3, null, i8);
        } else {
            z7 = false;
        }
        if ((i8 & 2) != 0) {
            c(true);
        }
        return z7;
    }

    public final void q(int i7, CharSequence charSequence, int i8, View view) {
        if (view != null) {
            this.f14450l = null;
        } else {
            if (i7 > 0) {
                this.f14450l = this.f14442b.getText(i7);
            } else if (charSequence != null) {
                this.f14450l = charSequence;
            }
            if (i8 > 0) {
                X.d.getDrawable(this.f14441a, i8);
            }
        }
        o(false);
    }

    public final void r() {
        this.f14451m = false;
        if (this.f14452n) {
            this.f14452n = false;
            o(this.f14453o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                if (((j) arrayList.get(i9)).f14462b == i7) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 >= 0) {
            int size2 = arrayList.size() - i9;
            while (true) {
                int i10 = i8 + 1;
                if (i8 >= size2 || ((j) arrayList.get(i9)).f14462b != i7) {
                    break;
                }
                if (i9 >= 0) {
                    ArrayList arrayList2 = this.f;
                    if (i9 < arrayList2.size()) {
                        arrayList2.remove(i9);
                    }
                }
                i8 = i10;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                if (((j) arrayList.get(i8)).f14461a == i7) {
                    break;
                }
                i8++;
            } else {
                i8 = -1;
                break;
            }
        }
        if (i8 >= 0) {
            ArrayList arrayList2 = this.f;
            if (i8 < arrayList2.size()) {
                arrayList2.remove(i8);
                o(true);
            }
        }
    }

    public final void s() {
        if (!this.f14451m) {
            this.f14451m = true;
            this.f14452n = false;
            this.f14453o = false;
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z7, boolean z8) {
        int i8;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            j jVar = (j) arrayList.get(i9);
            if (jVar.f14462b == i7) {
                int i10 = jVar.f14482x & (-5);
                if (z8) {
                    i8 = 4;
                } else {
                    i8 = 0;
                }
                jVar.f14482x = i10 | i8;
                jVar.setCheckable(z7);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z7) {
        this.f14458t = z7;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z7) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            j jVar = (j) arrayList.get(i8);
            if (jVar.f14462b == i7) {
                jVar.setEnabled(z7);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z7) {
        int i8;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z8 = false;
        for (int i9 = 0; i9 < size; i9++) {
            j jVar = (j) arrayList.get(i9);
            if (jVar.f14462b == i7) {
                int i10 = jVar.f14482x;
                int i11 = i10 & (-9);
                if (z7) {
                    i8 = 0;
                } else {
                    i8 = 8;
                }
                int i12 = i11 | i8;
                jVar.f14482x = i12;
                if (i10 != i12) {
                    z8 = true;
                }
            }
        }
        if (z8) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z7) {
        this.f14443c = z7;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return a(0, 0, 0, this.f14442b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.f14442b.getString(i7));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return a(i7, i8, i9, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        j a7 = a(i7, i8, i9, charSequence);
        t tVar = new t(this.f14441a, this, a7);
        a7.f14473o = tVar;
        tVar.setHeaderTitle(a7.f14465e);
        return tVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, int i10) {
        return a(i7, i8, i9, this.f14442b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return addSubMenu(i7, i8, i9, this.f14442b.getString(i10));
    }

    public MenuC1545i j() {
        return this;
    }
}
