package p;

import a.AbstractC0412a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import b4.C0597e;
import h0.AbstractC1066z;
import i.AbstractC1091a;
import java.lang.ref.WeakReference;
import k0.InterfaceC1383j;
/* renamed from: p.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1620z {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f14889a;

    /* renamed from: b  reason: collision with root package name */
    public C0597e f14890b;

    /* renamed from: c  reason: collision with root package name */
    public C0597e f14891c;

    /* renamed from: d  reason: collision with root package name */
    public C0597e f14892d;

    /* renamed from: e  reason: collision with root package name */
    public C0597e f14893e;
    public C0597e f;

    /* renamed from: g  reason: collision with root package name */
    public C0597e f14894g;

    /* renamed from: h  reason: collision with root package name */
    public C0597e f14895h;

    /* renamed from: i  reason: collision with root package name */
    public final J f14896i;
    public int j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f14897k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f14898l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f14899m;

    public C1620z(TextView textView) {
        this.f14889a = textView;
        this.f14896i = new J(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [b4.e, java.lang.Object] */
    public static C0597e c(Context context, C1597n c1597n, int i7) {
        ColorStateList i8;
        synchronized (c1597n) {
            i8 = c1597n.f14854a.i(context, i7);
        }
        if (i8 != null) {
            ?? obj = new Object();
            obj.f8247b = true;
            obj.f8248c = i8;
            return obj;
        }
        return null;
    }

    public final void a(Drawable drawable, C0597e c0597e) {
        if (drawable != null && c0597e != null) {
            C1597n.c(drawable, c0597e, this.f14889a.getDrawableState());
        }
    }

    public final void b() {
        C0597e c0597e = this.f14890b;
        TextView textView = this.f14889a;
        if (c0597e != null || this.f14891c != null || this.f14892d != null || this.f14893e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f14890b);
            a(compoundDrawables[1], this.f14891c);
            a(compoundDrawables[2], this.f14892d);
            a(compoundDrawables[3], this.f14893e);
        }
        if (this.f != null || this.f14894g != null) {
            Drawable[] a7 = AbstractC1610u.a(textView);
            a(a7[0], this.f);
            a(a7[2], this.f14894g);
        }
    }

    public final void d(AttributeSet attributeSet, int i7) {
        C1597n c1597n;
        boolean z7;
        boolean z8;
        String str;
        String str2;
        boolean z9;
        float f;
        float f4;
        float f8;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int fontMetricsInt;
        ColorStateList colorStateList;
        int resourceId;
        int i8;
        int resourceId2;
        TextView textView = this.f14889a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C1597n.f14852b;
        synchronized (C1597n.class) {
            try {
                if (C1597n.f14853c == null) {
                    C1597n.b();
                }
                c1597n = C1597n.f14853c;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr = AbstractC1091a.f;
        R1.j J02 = R1.j.J0(context, attributeSet, iArr, i7);
        TextView textView2 = this.f14889a;
        AbstractC1066z.d(textView2, textView2.getContext(), iArr, attributeSet, (TypedArray) J02.f4683c, i7);
        TypedArray typedArray = (TypedArray) J02.f4683c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f14890b = c(context, c1597n, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f14891c = c(context, c1597n, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f14892d = c(context, c1597n, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f14893e = c(context, c1597n, typedArray.getResourceId(2, 0));
        }
        int i9 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f = c(context, c1597n, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f14894g = c(context, c1597n, typedArray.getResourceId(6, 0));
        }
        J02.O0();
        boolean z10 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC1091a.f11367s;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            R1.j jVar = new R1.j(context, obtainStyledAttributes);
            if (!z10 && obtainStyledAttributes.hasValue(14)) {
                z8 = obtainStyledAttributes.getBoolean(14, false);
                z7 = true;
            } else {
                z7 = false;
                z8 = false;
            }
            f(context, jVar);
            if (obtainStyledAttributes.hasValue(15)) {
                str2 = obtainStyledAttributes.getString(15);
            } else {
                str2 = null;
            }
            if (i9 >= 26 && obtainStyledAttributes.hasValue(13)) {
                str = obtainStyledAttributes.getString(13);
            } else {
                str = null;
            }
            jVar.O0();
        } else {
            z7 = false;
            z8 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i7, 0);
        R1.j jVar2 = new R1.j(context, obtainStyledAttributes2);
        if (!z10 && obtainStyledAttributes2.hasValue(14)) {
            z9 = obtainStyledAttributes2.getBoolean(14, false);
            z7 = true;
        } else {
            z9 = z8;
        }
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        String str3 = str2;
        if (i9 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i9 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, jVar2);
        jVar2.O0();
        if (!z10 && z7) {
            this.f14889a.setAllCaps(z9);
        }
        Typeface typeface = this.f14898l;
        if (typeface != null) {
            if (this.f14897k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            AbstractC1616x.d(textView, str);
        }
        if (str3 != null) {
            if (i9 >= 24) {
                AbstractC1614w.b(textView, AbstractC1614w.a(str3));
            } else {
                AbstractC1610u.c(textView, AbstractC1612v.a(str3.split(",")[0]));
            }
        }
        int[] iArr3 = AbstractC1091a.f11356g;
        J j = this.f14896i;
        Context context2 = j.j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i7, 0);
        TextView textView3 = j.f14684i;
        AbstractC1066z.d(textView3, textView3.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i7);
        if (obtainStyledAttributes3.hasValue(5)) {
            j.f14677a = obtainStyledAttributes3.getInt(5, 0);
        }
        if (obtainStyledAttributes3.hasValue(4)) {
            f = obtainStyledAttributes3.getDimension(4, -1.0f);
        } else {
            f = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(2)) {
            f4 = obtainStyledAttributes3.getDimension(2, -1.0f);
        } else {
            f4 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(1)) {
            f8 = obtainStyledAttributes3.getDimension(1, -1.0f);
        } else {
            f8 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i10 = 0; i10 < length; i10++) {
                    iArr4[i10] = obtainTypedArray.getDimensionPixelSize(i10, -1);
                }
                j.f = J.b(iArr4);
                j.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (j.f14677a == 1) {
            if (!j.f14682g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (f4 == -1.0f) {
                    i8 = 2;
                    f4 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i8 = 2;
                }
                if (f8 == -1.0f) {
                    f8 = TypedValue.applyDimension(i8, 112.0f, displayMetrics);
                }
                if (f == -1.0f) {
                    f = 1.0f;
                }
                j.i(f4, f8, f);
            }
            j.g();
        }
        if (b1.f14783a && j.f14677a != 0) {
            int[] iArr5 = j.f;
            if (iArr5.length > 0) {
                if (AbstractC1616x.a(textView) != -1.0f) {
                    AbstractC1616x.b(textView, Math.round(j.f14680d), Math.round(j.f14681e), Math.round(j.f14679c), 0);
                } else {
                    AbstractC1616x.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        if (resourceId4 != -1) {
            drawable = c1597n.a(context, resourceId4);
        } else {
            drawable = null;
        }
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        if (resourceId5 != -1) {
            drawable2 = c1597n.a(context, resourceId5);
        } else {
            drawable2 = null;
        }
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        if (resourceId6 != -1) {
            drawable3 = c1597n.a(context, resourceId6);
        } else {
            drawable3 = null;
        }
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        if (resourceId7 != -1) {
            drawable4 = c1597n.a(context, resourceId7);
        } else {
            drawable4 = null;
        }
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        if (resourceId8 != -1) {
            drawable5 = c1597n.a(context, resourceId8);
        } else {
            drawable5 = null;
        }
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        if (resourceId9 != -1) {
            drawable6 = c1597n.a(context, resourceId9);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] a7 = AbstractC1610u.a(textView);
                Drawable drawable7 = a7[0];
                if (drawable7 == null && a7[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                } else {
                    if (drawable2 == null) {
                        drawable2 = a7[1];
                    }
                    Drawable drawable8 = a7[2];
                    if (drawable4 == null) {
                        drawable4 = a7[3];
                    }
                    AbstractC1610u.b(textView, drawable7, drawable2, drawable8, drawable4);
                }
            }
        } else {
            Drawable[] a8 = AbstractC1610u.a(textView);
            if (drawable5 == null) {
                drawable5 = a8[0];
            }
            if (drawable2 == null) {
                drawable2 = a8[1];
            }
            if (drawable6 == null) {
                drawable6 = a8[2];
            }
            if (drawable4 == null) {
                drawable4 = a8[3];
            }
            AbstractC1610u.b(textView, drawable5, drawable2, drawable6, drawable4);
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = X.d.getColorStateList(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintList(colorStateList);
            } else if (textView instanceof InterfaceC1383j) {
                ((InterfaceC1383j) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode c8 = O.c(obtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintMode(c8);
            } else if (textView instanceof InterfaceC1383j) {
                ((InterfaceC1383j) textView).setSupportCompoundDrawablesTintMode(c8);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            AbstractC0412a.S(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            AbstractC0412a.T(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            if (dimensionPixelSize3 >= 0) {
                if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                    textView.setLineSpacing(dimensionPixelSize3 - fontMetricsInt, 1.0f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public final void e(Context context, int i7) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i7, AbstractC1091a.f11367s);
        R1.j jVar = new R1.j(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f14889a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i8 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, jVar);
        if (i8 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            AbstractC1616x.d(textView, string);
        }
        jVar.O0();
        Typeface typeface = this.f14898l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void f(Context context, R1.j jVar) {
        String string;
        boolean z7;
        boolean z8;
        int i7 = this.j;
        TypedArray typedArray = (TypedArray) jVar.f4683c;
        this.j = typedArray.getInt(2, i7);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            int i9 = typedArray.getInt(11, -1);
            this.f14897k = i9;
            if (i9 != -1) {
                this.j &= 2;
            }
        }
        int i10 = 10;
        boolean z9 = false;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f14899m = false;
                int i11 = typedArray.getInt(1, 1);
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            this.f14898l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f14898l = Typeface.SERIF;
                    return;
                }
                this.f14898l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f14898l = null;
        if (typedArray.hasValue(12)) {
            i10 = 12;
        }
        int i12 = this.f14897k;
        int i13 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface v02 = jVar.v0(i10, this.j, new G1.g(this, i12, i13, new WeakReference(this.f14889a)));
                if (v02 != null) {
                    if (i8 >= 28 && this.f14897k != -1) {
                        Typeface create = Typeface.create(v02, 0);
                        int i14 = this.f14897k;
                        if ((this.j & 2) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        this.f14898l = AbstractC1618y.a(create, i14, z8);
                    } else {
                        this.f14898l = v02;
                    }
                }
                if (this.f14898l == null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                this.f14899m = z7;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f14898l == null && (string = typedArray.getString(i10)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f14897k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i15 = this.f14897k;
                if ((this.j & 2) != 0) {
                    z9 = true;
                }
                this.f14898l = AbstractC1618y.a(create2, i15, z9);
                return;
            }
            this.f14898l = Typeface.create(string, this.j);
        }
    }
}
