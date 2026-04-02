package d2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public final class o extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f10278a;

    /* renamed from: b  reason: collision with root package name */
    public n f10279b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f10280c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f10281d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10282e;
    public Bitmap f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f10283g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f10284h;

    /* renamed from: i  reason: collision with root package name */
    public int f10285i;
    public boolean j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10286k;

    /* renamed from: l  reason: collision with root package name */
    public Paint f10287l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f10278a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new q(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new q(this);
    }
}
