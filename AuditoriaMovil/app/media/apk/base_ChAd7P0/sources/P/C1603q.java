package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageView;
import b4.C0597e;
import r3.AbstractC1740d;
/* renamed from: p.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1603q extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public final h1.t f14869a;

    /* renamed from: b  reason: collision with root package name */
    public final A3.N f14870b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14871c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1603q(Context context, int i7) {
        super(context, null, i7);
        L0.a(context);
        this.f14871c = false;
        K0.a(this, getContext());
        h1.t tVar = new h1.t(this);
        this.f14869a = tVar;
        tVar.o(null, i7);
        A3.N n7 = new A3.N(this);
        this.f14870b = n7;
        n7.j(i7);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h1.t tVar = this.f14869a;
        if (tVar != null) {
            tVar.l();
        }
        A3.N n7 = this.f14870b;
        if (n7 != null) {
            n7.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0597e c0597e;
        h1.t tVar = this.f14869a;
        if (tVar == null || (c0597e = (C0597e) tVar.f11321e) == null) {
            return null;
        }
        return (ColorStateList) c0597e.f8248c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0597e c0597e;
        h1.t tVar = this.f14869a;
        if (tVar == null || (c0597e = (C0597e) tVar.f11321e) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0597e.f8249d;
    }

    public ColorStateList getSupportImageTintList() {
        C0597e c0597e;
        A3.N n7 = this.f14870b;
        if (n7 == null || (c0597e = (C0597e) n7.f106d) == null) {
            return null;
        }
        return (ColorStateList) c0597e.f8248c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0597e c0597e;
        A3.N n7 = this.f14870b;
        if (n7 == null || (c0597e = (C0597e) n7.f106d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0597e.f8249d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f14870b.f105c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h1.t tVar = this.f14869a;
        if (tVar != null) {
            tVar.f11317a = -1;
            tVar.r(null);
            tVar.l();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        h1.t tVar = this.f14869a;
        if (tVar != null) {
            tVar.p(i7);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        A3.N n7 = this.f14870b;
        if (n7 != null) {
            n7.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        A3.N n7 = this.f14870b;
        if (n7 != null && drawable != null && !this.f14871c) {
            n7.f104b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (n7 != null) {
            n7.c();
            if (!this.f14871c) {
                ImageView imageView = (ImageView) n7.f105c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(n7.f104b);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i7) {
        super.setImageLevel(i7);
        this.f14871c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        A3.N n7 = this.f14870b;
        if (n7 != null) {
            ImageView imageView = (ImageView) n7.f105c;
            if (i7 != 0) {
                Drawable o7 = AbstractC1740d.o(imageView.getContext(), i7);
                if (o7 != null) {
                    O.a(o7);
                }
                imageView.setImageDrawable(o7);
            } else {
                imageView.setImageDrawable(null);
            }
            n7.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        A3.N n7 = this.f14870b;
        if (n7 != null) {
            n7.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h1.t tVar = this.f14869a;
        if (tVar != null) {
            tVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h1.t tVar = this.f14869a;
        if (tVar != null) {
            tVar.t(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        A3.N n7 = this.f14870b;
        if (n7 != null) {
            if (((C0597e) n7.f106d) == null) {
                n7.f106d = new Object();
            }
            C0597e c0597e = (C0597e) n7.f106d;
            c0597e.f8248c = colorStateList;
            c0597e.f8247b = true;
            n7.c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        A3.N n7 = this.f14870b;
        if (n7 != null) {
            if (((C0597e) n7.f106d) == null) {
                n7.f106d = new Object();
            }
            C0597e c0597e = (C0597e) n7.f106d;
            c0597e.f8249d = mode;
            c0597e.f8246a = true;
            n7.c();
        }
    }
}
