package k;

import S.h;
import S.i;
import S.l;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
/* loaded from: classes.dex */
public final class b extends Drawable.ConstantState {

    /* renamed from: A  reason: collision with root package name */
    public boolean f13479A;

    /* renamed from: B  reason: collision with root package name */
    public ColorFilter f13480B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f13481C;

    /* renamed from: D  reason: collision with root package name */
    public ColorStateList f13482D;

    /* renamed from: E  reason: collision with root package name */
    public PorterDuff.Mode f13483E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f13484F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f13485G;

    /* renamed from: H  reason: collision with root package name */
    public int[][] f13486H;

    /* renamed from: I  reason: collision with root package name */
    public h f13487I;

    /* renamed from: J  reason: collision with root package name */
    public l f13488J;

    /* renamed from: a  reason: collision with root package name */
    public final e f13489a;

    /* renamed from: b  reason: collision with root package name */
    public Resources f13490b;

    /* renamed from: c  reason: collision with root package name */
    public int f13491c;

    /* renamed from: d  reason: collision with root package name */
    public int f13492d;

    /* renamed from: e  reason: collision with root package name */
    public int f13493e;
    public SparseArray f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable[] f13494g;

    /* renamed from: h  reason: collision with root package name */
    public int f13495h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f13496i;
    public boolean j;

    /* renamed from: k  reason: collision with root package name */
    public Rect f13497k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f13498l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f13499m;

    /* renamed from: n  reason: collision with root package name */
    public int f13500n;

    /* renamed from: o  reason: collision with root package name */
    public int f13501o;

    /* renamed from: p  reason: collision with root package name */
    public int f13502p;

    /* renamed from: q  reason: collision with root package name */
    public int f13503q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f13504r;

    /* renamed from: s  reason: collision with root package name */
    public int f13505s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f13506t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f13507u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f13508v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f13509w;

    /* renamed from: x  reason: collision with root package name */
    public int f13510x;

    /* renamed from: y  reason: collision with root package name */
    public int f13511y;

    /* renamed from: z  reason: collision with root package name */
    public int f13512z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i7;
        this.f13496i = false;
        this.f13498l = false;
        this.f13509w = true;
        this.f13511y = 0;
        this.f13512z = 0;
        this.f13489a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f13490b;
        } else {
            resources2 = null;
        }
        this.f13490b = resources2;
        if (bVar != null) {
            i7 = bVar.f13491c;
        } else {
            i7 = 0;
        }
        int i8 = e.f13518o0;
        i7 = resources != null ? resources.getDisplayMetrics().densityDpi : i7;
        i7 = i7 == 0 ? 160 : i7;
        this.f13491c = i7;
        if (bVar != null) {
            this.f13492d = bVar.f13492d;
            this.f13493e = bVar.f13493e;
            this.f13507u = true;
            this.f13508v = true;
            this.f13496i = bVar.f13496i;
            this.f13498l = bVar.f13498l;
            this.f13509w = bVar.f13509w;
            this.f13510x = bVar.f13510x;
            this.f13511y = bVar.f13511y;
            this.f13512z = bVar.f13512z;
            this.f13479A = bVar.f13479A;
            this.f13480B = bVar.f13480B;
            this.f13481C = bVar.f13481C;
            this.f13482D = bVar.f13482D;
            this.f13483E = bVar.f13483E;
            this.f13484F = bVar.f13484F;
            this.f13485G = bVar.f13485G;
            if (bVar.f13491c == i7) {
                if (bVar.j) {
                    this.f13497k = bVar.f13497k != null ? new Rect(bVar.f13497k) : null;
                    this.j = true;
                }
                if (bVar.f13499m) {
                    this.f13500n = bVar.f13500n;
                    this.f13501o = bVar.f13501o;
                    this.f13502p = bVar.f13502p;
                    this.f13503q = bVar.f13503q;
                    this.f13499m = true;
                }
            }
            if (bVar.f13504r) {
                this.f13505s = bVar.f13505s;
                this.f13504r = true;
            }
            if (bVar.f13506t) {
                this.f13506t = true;
            }
            Drawable[] drawableArr = bVar.f13494g;
            this.f13494g = new Drawable[drawableArr.length];
            this.f13495h = bVar.f13495h;
            SparseArray sparseArray = bVar.f;
            if (sparseArray != null) {
                this.f = sparseArray.clone();
            } else {
                this.f = new SparseArray(this.f13495h);
            }
            int i9 = this.f13495h;
            for (int i10 = 0; i10 < i9; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f.put(i10, constantState);
                    } else {
                        this.f13494g[i10] = drawableArr[i10];
                    }
                }
            }
        } else {
            this.f13494g = new Drawable[10];
            this.f13495h = 0;
        }
        if (bVar != null) {
            this.f13486H = bVar.f13486H;
        } else {
            this.f13486H = new int[this.f13494g.length];
        }
        if (bVar != null) {
            this.f13487I = bVar.f13487I;
            this.f13488J = bVar.f13488J;
            return;
        }
        this.f13487I = new h();
        this.f13488J = new l();
    }

    public final int a(Drawable drawable) {
        int i7 = this.f13495h;
        if (i7 >= this.f13494g.length) {
            int i8 = i7 + 10;
            Drawable[] drawableArr = new Drawable[i8];
            Drawable[] drawableArr2 = this.f13494g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i7);
            }
            this.f13494g = drawableArr;
            int[][] iArr = new int[i8];
            System.arraycopy(this.f13486H, 0, iArr, 0, i7);
            this.f13486H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f13489a);
        this.f13494g[i7] = drawable;
        this.f13495h++;
        this.f13493e = drawable.getChangingConfigurations() | this.f13493e;
        this.f13504r = false;
        this.f13506t = false;
        this.f13497k = null;
        this.j = false;
        this.f13499m = false;
        this.f13507u = false;
        return i7;
    }

    public final void b() {
        this.f13499m = true;
        c();
        int i7 = this.f13495h;
        Drawable[] drawableArr = this.f13494g;
        this.f13501o = -1;
        this.f13500n = -1;
        this.f13503q = 0;
        this.f13502p = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            Drawable drawable = drawableArr[i8];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f13500n) {
                this.f13500n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f13501o) {
                this.f13501o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f13502p) {
                this.f13502p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f13503q) {
                this.f13503q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                int keyAt = this.f.keyAt(i7);
                Drawable[] drawableArr = this.f13494g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f.valueAt(i7)).newDrawable(this.f13490b);
                newDrawable.setLayoutDirection(this.f13510x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f13489a);
                drawableArr[keyAt] = mutate;
            }
            this.f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i7 = this.f13495h;
        Drawable[] drawableArr = this.f13494g;
        for (int i8 = 0; i8 < i7; i8++) {
            Drawable drawable = drawableArr[i8];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.get(i8);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i7) {
        int indexOfKey;
        Drawable drawable = this.f13494g[i7];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i7)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f.valueAt(indexOfKey)).newDrawable(this.f13490b);
        newDrawable.setLayoutDirection(this.f13510x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f13489a);
        this.f13494g[i7] = mutate;
        this.f.removeAt(indexOfKey);
        if (this.f.size() == 0) {
            this.f = null;
        }
        return mutate;
    }

    public final int e(int i7) {
        Object obj;
        if (i7 < 0) {
            return 0;
        }
        l lVar = this.f13488J;
        Integer num = 0;
        int a7 = T.a.a(lVar.f4837c, i7, lVar.f4835a);
        if (a7 >= 0 && (obj = lVar.f4836b[a7]) != i.f4831b) {
            num = obj;
        }
        return num.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.f13486H;
        int i7 = this.f13495h;
        for (int i8 = 0; i8 < i7; i8++) {
            if (StateSet.stateSetMatches(iArr2[i8], iArr)) {
                return i8;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f13492d | this.f13493e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
