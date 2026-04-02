package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.example.appecoactivate.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: p.p0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1602p0 {

    /* renamed from: i  reason: collision with root package name */
    public static C1602p0 f14862i;

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f14863a;

    /* renamed from: b  reason: collision with root package name */
    public S.k f14864b;

    /* renamed from: c  reason: collision with root package name */
    public S.l f14865c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap f14866d = new WeakHashMap(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f14867e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public M3.q f14868g;

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f14861h = PorterDuff.Mode.SRC_IN;
    public static final C1598n0 j = new S.j(6);

    public static synchronized C1602p0 d() {
        C1602p0 c1602p0;
        synchronized (C1602p0.class) {
            try {
                if (f14862i == null) {
                    C1602p0 c1602p02 = new C1602p0();
                    f14862i = c1602p02;
                    j(c1602p02);
                }
                c1602p0 = f14862i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1602p0;
    }

    public static synchronized PorterDuffColorFilter h(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C1602p0.class) {
            C1598n0 c1598n0 = j;
            c1598n0.getClass();
            int i8 = (31 + i7) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c1598n0.get(Integer.valueOf(mode.hashCode() + i8));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i7, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) c1598n0.put(Integer.valueOf(mode.hashCode() + i8), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(C1602p0 c1602p0) {
        if (Build.VERSION.SDK_INT < 24) {
            c1602p0.a("vector", new C1600o0(3));
            c1602p0.a("animated-vector", new C1600o0(2));
            c1602p0.a("animated-selector", new C1600o0(1));
            c1602p0.a("drawable", new C1600o0(0));
        }
    }

    public final void a(String str, C1600o0 c1600o0) {
        if (this.f14864b == null) {
            this.f14864b = new S.k(0);
        }
        this.f14864b.put(str, c1600o0);
    }

    public final synchronized void b(Context context, long j8, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                S.h hVar = (S.h) this.f14866d.get(context);
                if (hVar == null) {
                    hVar = new S.h();
                    this.f14866d.put(context, hVar);
                }
                hVar.e(new WeakReference(constantState), j8);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i7) {
        if (this.f14867e == null) {
            this.f14867e = new TypedValue();
        }
        TypedValue typedValue = this.f14867e;
        context.getResources().getValue(i7, typedValue, true);
        long j8 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e7 = e(context, j8);
        if (e7 != null) {
            return e7;
        }
        LayerDrawable layerDrawable = null;
        if (this.f14868g != null) {
            if (i7 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i7 == R.drawable.abc_ratingbar_material) {
                layerDrawable = M3.q.r(this, context, R.dimen.abc_star_big);
            } else if (i7 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = M3.q.r(this, context, R.dimen.abc_star_medium);
            } else if (i7 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = M3.q.r(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j8, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j8) {
        S.h hVar = (S.h) this.f14866d.get(context);
        if (hVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) hVar.c(j8);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b5 = T.a.b(hVar.f4827b, hVar.f4829d, j8);
            if (b5 >= 0) {
                Object[] objArr = hVar.f4828c;
                Object obj = objArr[b5];
                Object obj2 = S.i.f4830a;
                if (obj != obj2) {
                    objArr[b5] = obj2;
                    hVar.f4826a = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i7) {
        return g(context, i7);
    }

    public final synchronized Drawable g(Context context, int i7) {
        Drawable k2;
        try {
            if (!this.f) {
                this.f = true;
                Drawable f = f(context, R.drawable.abc_vector_test);
                if (f == null || (!(f instanceof d2.q) && !"android.graphics.drawable.VectorDrawable".equals(f.getClass().getName()))) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            k2 = k(context, i7);
            if (k2 == null) {
                k2 = c(context, i7);
            }
            if (k2 == null) {
                k2 = X.d.getDrawable(context, i7);
            }
            if (k2 != null) {
                k2 = m(context, i7, k2);
            }
            if (k2 != null) {
                O.a(k2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return k2;
    }

    public final synchronized ColorStateList i(Context context, int i7) {
        ColorStateList colorStateList;
        S.l lVar;
        WeakHashMap weakHashMap = this.f14863a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (lVar = (S.l) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) lVar.c(i7);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            M3.q qVar = this.f14868g;
            if (qVar != null) {
                colorStateList2 = qVar.t(context, i7);
            }
            if (colorStateList2 != null) {
                if (this.f14863a == null) {
                    this.f14863a = new WeakHashMap();
                }
                S.l lVar2 = (S.l) this.f14863a.get(context);
                if (lVar2 == null) {
                    lVar2 = new S.l();
                    this.f14863a.put(context, lVar2);
                }
                lVar2.a(i7, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i7) {
        int next;
        S.k kVar = this.f14864b;
        if (kVar == null || kVar.isEmpty()) {
            return null;
        }
        S.l lVar = this.f14865c;
        if (lVar != null) {
            String str = (String) lVar.c(i7);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f14864b.get(str) == null)) {
                return null;
            }
        } else {
            this.f14865c = new S.l();
        }
        if (this.f14867e == null) {
            this.f14867e = new TypedValue();
        }
        TypedValue typedValue = this.f14867e;
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        long j8 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e7 = e(context, j8);
        if (e7 != null) {
            return e7;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i7);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.f14865c.a(i7, name);
                    C1600o0 c1600o0 = (C1600o0) this.f14864b.get(name);
                    if (c1600o0 != null) {
                        e7 = c1600o0.a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (e7 != null) {
                        e7.setChangingConfigurations(typedValue.changingConfigurations);
                        b(context, j8, e7);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e8) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e8);
            }
        }
        if (e7 == null) {
            this.f14865c.a(i7, "appcompat_skip_skip");
        }
        return e7;
    }

    public final synchronized void l(M3.q qVar) {
        this.f14868g = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable m(android.content.Context r9, int r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1602p0.m(android.content.Context, int, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
