package androidx.appcompat.view.menu;

import D.AbstractC0055e;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import i.AbstractC1091a;
import o.AbstractC1538b;
import o.InterfaceC1544h;
import o.MenuC1545i;
import o.View$OnTouchListenerC1537a;
import o.j;
import o.q;
import p.C1570C;
import p.InterfaceC1589j;
/* loaded from: classes.dex */
public class ActionMenuItemView extends C1570C implements q, View.OnClickListener, InterfaceC1589j {

    /* renamed from: f0  reason: collision with root package name */
    public j f7267f0;

    /* renamed from: g0  reason: collision with root package name */
    public CharSequence f7268g0;

    /* renamed from: h0  reason: collision with root package name */
    public Drawable f7269h0;

    /* renamed from: i0  reason: collision with root package name */
    public InterfaceC1544h f7270i0;

    /* renamed from: j0  reason: collision with root package name */
    public View$OnTouchListenerC1537a f7271j0;

    /* renamed from: k0  reason: collision with root package name */
    public AbstractC1538b f7272k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f7273l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f7274m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f7275n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f7276o0;

    /* renamed from: p0  reason: collision with root package name */
    public final int f7277p0;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f7273l0 = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1091a.f11353c, 0, 0);
        this.f7275n0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f7277p0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f7276o0 = -1;
        setSaveEnabled(false);
    }

    @Override // o.q
    public final void a(j jVar) {
        int i7;
        this.f7267f0 = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitleCondensed());
        setId(jVar.f14461a);
        if (jVar.isVisible()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        setVisibility(i7);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f7271j0 == null) {
            this.f7271j0 = new View$OnTouchListenerC1537a(this);
        }
    }

    @Override // p.InterfaceC1589j
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p.InterfaceC1589j
    public final boolean c() {
        if (!TextUtils.isEmpty(getText()) && this.f7267f0.getIcon() == null) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (i7 < 480 && ((i7 < 640 || i8 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // o.q
    public j getItemData() {
        return this.f7267f0;
    }

    public final void h() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z7 = true;
        boolean z8 = !TextUtils.isEmpty(this.f7268g0);
        if (this.f7269h0 != null && ((this.f7267f0.f14483y & 4) != 4 || (!this.f7273l0 && !this.f7274m0))) {
            z7 = false;
        }
        boolean z9 = z8 & z7;
        CharSequence charSequence3 = null;
        if (z9) {
            charSequence = this.f7268g0;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f7267f0.f14475q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z9) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f7267f0.f14465e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f7267f0.f14476r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z9) {
                charSequence3 = this.f7267f0.f14465e;
            }
            AbstractC0055e.z(this, charSequence3);
            return;
        }
        AbstractC0055e.z(this, charSequence5);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1544h interfaceC1544h = this.f7270i0;
        if (interfaceC1544h != null) {
            interfaceC1544h.a(this.f7267f0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f7273l0 = g();
        h();
    }

    @Override // p.C1570C, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i10 = this.f7276o0) >= 0) {
            super.setPadding(i10, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int measuredWidth = getMeasuredWidth();
        int i11 = this.f7275n0;
        if (mode == Integer.MIN_VALUE) {
            i9 = Math.min(size, i11);
        } else {
            i9 = i11;
        }
        if (mode != 1073741824 && i11 > 0 && measuredWidth < i9) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), i8);
        }
        if (isEmpty && this.f7269h0 != null) {
            super.setPadding((getMeasuredWidth() - this.f7269h0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View$OnTouchListenerC1537a view$OnTouchListenerC1537a;
        if (this.f7267f0.hasSubMenu() && (view$OnTouchListenerC1537a = this.f7271j0) != null && view$OnTouchListenerC1537a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z7) {
    }

    public void setChecked(boolean z7) {
    }

    public void setExpandedFormat(boolean z7) {
        if (this.f7274m0 != z7) {
            this.f7274m0 = z7;
            j jVar = this.f7267f0;
            if (jVar != null) {
                MenuC1545i menuC1545i = jVar.f14472n;
                menuC1545i.f14449k = true;
                menuC1545i.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f7269h0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i7 = this.f7277p0;
            if (intrinsicWidth > i7) {
                intrinsicHeight = (int) (intrinsicHeight * (i7 / intrinsicWidth));
                intrinsicWidth = i7;
            }
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
            } else {
                i7 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i7);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(InterfaceC1544h interfaceC1544h) {
        this.f7270i0 = interfaceC1544h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i7, int i8, int i9, int i10) {
        this.f7276o0 = i7;
        super.setPadding(i7, i8, i9, i10);
    }

    public void setPopupCallback(AbstractC1538b abstractC1538b) {
        this.f7272k0 = abstractC1538b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f7268g0 = charSequence;
        h();
    }
}
