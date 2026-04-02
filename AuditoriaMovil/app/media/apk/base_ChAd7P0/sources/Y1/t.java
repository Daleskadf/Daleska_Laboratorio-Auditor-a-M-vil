package Y1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class t extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f6691a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6692b;

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6691a = new Rect();
        this.f6692b = true;
    }

    public t(int i7, int i8) {
        super(i7, i8);
        this.f6691a = new Rect();
        this.f6692b = true;
    }

    public t(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f6691a = new Rect();
        this.f6692b = true;
    }

    public t(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f6691a = new Rect();
        this.f6692b = true;
    }

    public t(t tVar) {
        super((ViewGroup.LayoutParams) tVar);
        this.f6691a = new Rect();
        this.f6692b = true;
    }
}
