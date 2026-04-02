package p;

import a.AbstractC0412a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import b4.C0597e;
import com.example.appecoactivate.R;
import g1.C1006c;
import i.AbstractC1091a;
import k0.InterfaceC1383j;
import r3.AbstractC1740d;
import w0.C1943b;
/* renamed from: p.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1595m extends AutoCompleteTextView implements InterfaceC1383j {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f14846d = {16843126};

    /* renamed from: a  reason: collision with root package name */
    public final h1.t f14847a;

    /* renamed from: b  reason: collision with root package name */
    public final C1620z f14848b;

    /* renamed from: c  reason: collision with root package name */
    public final C1006c f14849c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1595m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        L0.a(context);
        K0.a(this, getContext());
        R1.j J02 = R1.j.J0(getContext(), attributeSet, f14846d, R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) J02.f4683c).hasValue(0)) {
            setDropDownBackgroundDrawable(J02.u0(0));
        }
        J02.O0();
        h1.t tVar = new h1.t(this);
        this.f14847a = tVar;
        tVar.o(attributeSet, R.attr.autoCompleteTextViewStyle);
        C1620z c1620z = new C1620z(this);
        this.f14848b = c1620z;
        c1620z.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        c1620z.b();
        C1006c c1006c = new C1006c(this, 7);
        this.f14849c = c1006c;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1091a.f11356g, R.attr.autoCompleteTextViewStyle, 0);
        try {
            boolean z7 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c1006c.H(z7);
            KeyListener keyListener = getKeyListener();
            if (!(keyListener instanceof NumberKeyListener)) {
                boolean isFocusable = super.isFocusable();
                boolean isClickable = super.isClickable();
                boolean isLongClickable = super.isLongClickable();
                int inputType = super.getInputType();
                KeyListener C7 = c1006c.C(keyListener);
                if (C7 != keyListener) {
                    super.setKeyListener(C7);
                    super.setRawInputType(inputType);
                    super.setFocusable(isFocusable);
                    super.setClickable(isClickable);
                    super.setLongClickable(isLongClickable);
                }
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h1.t tVar = this.f14847a;
        if (tVar != null) {
            tVar.l();
        }
        C1620z c1620z = this.f14848b;
        if (c1620z != null) {
            c1620z.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0412a.f0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0597e c0597e;
        h1.t tVar = this.f14847a;
        if (tVar == null || (c0597e = (C0597e) tVar.f11321e) == null) {
            return null;
        }
        return (ColorStateList) c0597e.f8248c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0597e c0597e;
        h1.t tVar = this.f14847a;
        if (tVar == null || (c0597e = (C0597e) tVar.f11321e) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0597e.f8249d;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0597e c0597e = this.f14848b.f14895h;
        if (c0597e != null) {
            return (ColorStateList) c0597e.f8248c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0597e c0597e = this.f14848b.f14895h;
        if (c0597e != null) {
            return (PorterDuff.Mode) c0597e.f8249d;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        C1006c c1006c = (C1006c) this.f14849c.f11091a;
        if (onCreateInputConnection == null) {
            c1006c.getClass();
            return null;
        }
        C1608t c1608t = (C1608t) c1006c.f11091a;
        c1608t.getClass();
        if (!(onCreateInputConnection instanceof C1943b)) {
            onCreateInputConnection = new C1943b((AbstractC1595m) c1608t.f14880b, onCreateInputConnection, editorInfo);
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h1.t tVar = this.f14847a;
        if (tVar != null) {
            tVar.f11317a = -1;
            tVar.r(null);
            tVar.l();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        h1.t tVar = this.f14847a;
        if (tVar != null) {
            tVar.p(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1620z c1620z = this.f14848b;
        if (c1620z != null) {
            c1620z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1620z c1620z = this.f14848b;
        if (c1620z != null) {
            c1620z.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0412a.i0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i7) {
        setDropDownBackgroundDrawable(AbstractC1740d.o(getContext(), i7));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        this.f14849c.H(z7);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f14849c.C(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h1.t tVar = this.f14847a;
        if (tVar != null) {
            tVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h1.t tVar = this.f14847a;
        if (tVar != null) {
            tVar.t(mode);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [b4.e, java.lang.Object] */
    @Override // k0.InterfaceC1383j
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        boolean z7;
        C1620z c1620z = this.f14848b;
        if (c1620z.f14895h == null) {
            c1620z.f14895h = new Object();
        }
        C0597e c0597e = c1620z.f14895h;
        c0597e.f8248c = colorStateList;
        if (colorStateList != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        c0597e.f8247b = z7;
        c1620z.f14890b = c0597e;
        c1620z.f14891c = c0597e;
        c1620z.f14892d = c0597e;
        c1620z.f14893e = c0597e;
        c1620z.f = c0597e;
        c1620z.f14894g = c0597e;
        c1620z.b();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [b4.e, java.lang.Object] */
    @Override // k0.InterfaceC1383j
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        boolean z7;
        C1620z c1620z = this.f14848b;
        if (c1620z.f14895h == null) {
            c1620z.f14895h = new Object();
        }
        C0597e c0597e = c1620z.f14895h;
        c0597e.f8249d = mode;
        if (mode != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        c0597e.f8246a = z7;
        c1620z.f14890b = c0597e;
        c1620z.f14891c = c0597e;
        c1620z.f14892d = c0597e;
        c1620z.f14893e = c0597e;
        c1620z.f = c0597e;
        c1620z.f14894g = c0597e;
        c1620z.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C1620z c1620z = this.f14848b;
        if (c1620z != null) {
            c1620z.e(context, i7);
        }
    }
}
