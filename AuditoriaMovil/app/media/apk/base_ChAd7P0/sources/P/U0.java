package p;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
/* loaded from: classes.dex */
public final class U0 implements L {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f14721a;

    /* renamed from: b  reason: collision with root package name */
    public int f14722b;

    /* renamed from: c  reason: collision with root package name */
    public View f14723c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f14724d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f14725e;
    public Drawable f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14726g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f14727h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f14728i;
    public CharSequence j;

    /* renamed from: k  reason: collision with root package name */
    public Window.Callback f14729k;

    /* renamed from: l  reason: collision with root package name */
    public int f14730l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f14731m;

    public final void a(int i7) {
        View view;
        int i8 = this.f14722b ^ i7;
        this.f14722b = i7;
        if (i8 != 0) {
            if ((i8 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                int i9 = this.f14722b & 4;
                Toolbar toolbar = this.f14721a;
                if (i9 != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.f14731m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i8 & 3) != 0) {
                c();
            }
            int i10 = i8 & 8;
            Toolbar toolbar2 = this.f14721a;
            if (i10 != 0) {
                if ((i7 & 8) != 0) {
                    toolbar2.setTitle(this.f14727h);
                    toolbar2.setSubtitle(this.f14728i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i8 & 16) != 0 && (view = this.f14723c) != null) {
                if ((i7 & 16) != 0) {
                    toolbar2.addView(view);
                } else {
                    toolbar2.removeView(view);
                }
            }
        }
    }

    public final void b() {
        if ((this.f14722b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.f14721a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f14730l);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i7 = this.f14722b;
        if ((i7 & 2) != 0) {
            if ((i7 & 1) != 0) {
                drawable = this.f14725e;
                if (drawable == null) {
                    drawable = this.f14724d;
                }
            } else {
                drawable = this.f14724d;
            }
        } else {
            drawable = null;
        }
        this.f14721a.setLogo(drawable);
    }
}
