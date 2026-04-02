package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import java.lang.ref.WeakReference;
import q.h;
/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1571a;

    /* renamed from: b  reason: collision with root package name */
    public p2 f1572b;

    /* renamed from: c  reason: collision with root package name */
    public p2 f1573c;

    /* renamed from: d  reason: collision with root package name */
    public p2 f1574d;

    /* renamed from: e  reason: collision with root package name */
    public p2 f1575e;

    /* renamed from: f  reason: collision with root package name */
    public p2 f1576f;

    /* renamed from: g  reason: collision with root package name */
    public p2 f1577g;

    /* renamed from: h  reason: collision with root package name */
    public p2 f1578h;

    /* renamed from: i  reason: collision with root package name */
    public final e1 f1579i;

    /* renamed from: j  reason: collision with root package name */
    public int f1580j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f1581k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f1582l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1583m;

    /* loaded from: classes.dex */
    public static class a extends h.c {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f1584a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1585b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1586c;

        /* renamed from: androidx.appcompat.widget.p0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0020a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final WeakReference f1587a;

            /* renamed from: b  reason: collision with root package name */
            public final Typeface f1588b;

            public RunnableC0020a(WeakReference weakReference, Typeface typeface) {
                this.f1587a = weakReference;
                this.f1588b = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                p0 p0Var = (p0) this.f1587a.get();
                if (p0Var == null) {
                    return;
                }
                p0Var.B(this.f1588b);
            }
        }

        public a(p0 p0Var, int i10, int i11) {
            this.f1584a = new WeakReference(p0Var);
            this.f1585b = i10;
            this.f1586c = i11;
        }

        @Override // q.h.c
        public void onFontRetrievalFailed(int i10) {
        }

        @Override // q.h.c
        public void onFontRetrieved(Typeface typeface) {
            int i10;
            boolean z10;
            p0 p0Var = (p0) this.f1584a.get();
            if (p0Var == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1585b) != -1) {
                if ((this.f1586c & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                typeface = Typeface.create(typeface, i10, z10);
            }
            p0Var.q(new RunnableC0020a(this.f1584a, typeface));
        }
    }

    public p0(TextView textView) {
        this.f1571a = textView;
        this.f1579i = new e1(textView);
    }

    public static p2 d(Context context, k kVar, int i10) {
        ColorStateList f10 = kVar.f(context, i10);
        if (f10 != null) {
            p2 p2Var = new p2();
            p2Var.f1593d = true;
            p2Var.f1590a = f10;
            return p2Var;
        }
        return null;
    }

    public final void A(int i10, float f10) {
        this.f1579i.v(i10, f10);
    }

    public void B(Typeface typeface) {
        if (this.f1583m) {
            this.f1571a.setTypeface(typeface);
            this.f1582l = typeface;
        }
    }

    public final void C(Context context, r2 r2Var) {
        String o10;
        Typeface create;
        boolean z10;
        boolean z11;
        Typeface create2;
        this.f1580j = r2Var.k(R$styleable.TextAppearance_android_textStyle, this.f1580j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z12 = false;
        if (i10 >= 28) {
            int k10 = r2Var.k(R$styleable.TextAppearance_android_textFontWeight, -1);
            this.f1581k = k10;
            if (k10 != -1) {
                this.f1580j = (this.f1580j & 2) | 0;
            }
        }
        int i11 = R$styleable.TextAppearance_android_fontFamily;
        if (!r2Var.r(i11) && !r2Var.r(R$styleable.TextAppearance_fontFamily)) {
            int i12 = R$styleable.TextAppearance_android_typeface;
            if (r2Var.r(i12)) {
                this.f1583m = false;
                int k11 = r2Var.k(i12, 1);
                if (k11 != 1) {
                    if (k11 != 2) {
                        if (k11 == 3) {
                            this.f1582l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f1582l = Typeface.SERIF;
                    return;
                }
                this.f1582l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f1582l = null;
        int i13 = R$styleable.TextAppearance_fontFamily;
        if (r2Var.r(i13)) {
            i11 = i13;
        }
        int i14 = this.f1581k;
        int i15 = this.f1580j;
        if (!context.isRestricted()) {
            try {
                Typeface j10 = r2Var.j(i11, this.f1580j, new a(this, i14, i15));
                if (j10 != null) {
                    if (i10 >= 28 && this.f1581k != -1) {
                        Typeface create3 = Typeface.create(j10, 0);
                        int i16 = this.f1581k;
                        if ((this.f1580j & 2) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        create2 = Typeface.create(create3, i16, z11);
                        this.f1582l = create2;
                    } else {
                        this.f1582l = j10;
                    }
                }
                if (this.f1582l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f1583m = z10;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1582l == null && (o10 = r2Var.o(i11)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f1581k != -1) {
                Typeface create4 = Typeface.create(o10, 0);
                int i17 = this.f1581k;
                if ((this.f1580j & 2) != 0) {
                    z12 = true;
                }
                create = Typeface.create(create4, i17, z12);
                this.f1582l = create;
                return;
            }
            this.f1582l = Typeface.create(o10, this.f1580j);
        }
    }

    public final void a(Drawable drawable, p2 p2Var) {
        if (drawable != null && p2Var != null) {
            k.i(drawable, p2Var, this.f1571a.getDrawableState());
        }
    }

    public void b() {
        if (this.f1572b != null || this.f1573c != null || this.f1574d != null || this.f1575e != null) {
            Drawable[] compoundDrawables = this.f1571a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1572b);
            a(compoundDrawables[1], this.f1573c);
            a(compoundDrawables[2], this.f1574d);
            a(compoundDrawables[3], this.f1575e);
        }
        if (this.f1576f != null || this.f1577g != null) {
            Drawable[] compoundDrawablesRelative = this.f1571a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f1576f);
            a(compoundDrawablesRelative[2], this.f1577g);
        }
    }

    public void c() {
        this.f1579i.a();
    }

    public int e() {
        return this.f1579i.h();
    }

    public int f() {
        return this.f1579i.i();
    }

    public int g() {
        return this.f1579i.j();
    }

    public int[] h() {
        return this.f1579i.k();
    }

    public int i() {
        return this.f1579i.l();
    }

    public ColorStateList j() {
        p2 p2Var = this.f1578h;
        if (p2Var != null) {
            return p2Var.f1590a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        p2 p2Var = this.f1578h;
        if (p2Var != null) {
            return p2Var.f1591b;
        }
        return null;
    }

    public boolean l() {
        return this.f1579i.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.p0.m(android.util.AttributeSet, int):void");
    }

    public void n(boolean z10, int i10, int i11, int i12, int i13) {
        if (!androidx.core.widget.b.P) {
            c();
        }
    }

    public void o() {
        b();
    }

    public void p(Context context, int i10) {
        String o10;
        ColorStateList c10;
        r2 s10 = r2.s(context, i10, R$styleable.L);
        int i11 = R$styleable.TextAppearance_textAllCaps;
        if (s10.r(i11)) {
            r(s10.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23) {
            int i13 = R$styleable.TextAppearance_android_textColor;
            if (s10.r(i13) && (c10 = s10.c(i13)) != null) {
                this.f1571a.setTextColor(c10);
            }
        }
        int i14 = R$styleable.TextAppearance_android_textSize;
        if (s10.r(i14) && s10.f(i14, -1) == 0) {
            this.f1571a.setTextSize(0, 0.0f);
        }
        C(context, s10);
        if (i12 >= 26) {
            int i15 = R$styleable.TextAppearance_fontVariationSettings;
            if (s10.r(i15) && (o10 = s10.o(i15)) != null) {
                this.f1571a.setFontVariationSettings(o10);
            }
        }
        s10.v();
        Typeface typeface = this.f1582l;
        if (typeface != null) {
            this.f1571a.setTypeface(typeface, this.f1580j);
        }
    }

    public void q(Runnable runnable) {
        this.f1571a.post(runnable);
    }

    public void r(boolean z10) {
        this.f1571a.setAllCaps(z10);
    }

    public void s(int i10, int i11, int i12, int i13) {
        this.f1579i.r(i10, i11, i12, i13);
    }

    public void t(int[] iArr, int i10) {
        this.f1579i.s(iArr, i10);
    }

    public void u(int i10) {
        this.f1579i.t(i10);
    }

    public void v(ColorStateList colorStateList) {
        boolean z10;
        if (this.f1578h == null) {
            this.f1578h = new p2();
        }
        p2 p2Var = this.f1578h;
        p2Var.f1590a = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        p2Var.f1593d = z10;
        y();
    }

    public void w(PorterDuff.Mode mode) {
        boolean z10;
        if (this.f1578h == null) {
            this.f1578h = new p2();
        }
        p2 p2Var = this.f1578h;
        p2Var.f1591b = mode;
        if (mode != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        p2Var.f1592c = z10;
        y();
    }

    public final void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] compoundDrawablesRelative = this.f1571a.getCompoundDrawablesRelative();
                Drawable drawable7 = compoundDrawablesRelative[0];
                if (drawable7 == null && compoundDrawablesRelative[2] == null) {
                    Drawable[] compoundDrawables = this.f1571a.getCompoundDrawables();
                    TextView textView = this.f1571a;
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
                    return;
                }
                TextView textView2 = this.f1571a;
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative[1];
                }
                Drawable drawable8 = compoundDrawablesRelative[2];
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative[3];
                }
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                return;
            }
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f1571a.getCompoundDrawablesRelative();
        TextView textView3 = this.f1571a;
        if (drawable5 == null) {
            drawable5 = compoundDrawablesRelative2[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawablesRelative2[1];
        }
        if (drawable6 == null) {
            drawable6 = compoundDrawablesRelative2[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawablesRelative2[3];
        }
        textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
    }

    public final void y() {
        p2 p2Var = this.f1578h;
        this.f1572b = p2Var;
        this.f1573c = p2Var;
        this.f1574d = p2Var;
        this.f1575e = p2Var;
        this.f1576f = p2Var;
        this.f1577g = p2Var;
    }

    public void z(int i10, float f10) {
        if (!androidx.core.widget.b.P && !l()) {
            A(i10, f10);
        }
    }
}
