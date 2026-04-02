package p;

import D.AbstractC0055e;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.example.appecoactivate.R;
import o.View$OnTouchListenerC1537a;
/* renamed from: p.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1585h extends C1603q implements InterfaceC1589j {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C1587i f14816d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1585h(C1587i c1587i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f14816d = c1587i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0055e.z(this, getContentDescription());
        setOnTouchListener(new View$OnTouchListenerC1537a(this, this));
    }

    @Override // p.InterfaceC1589j
    public final boolean b() {
        return false;
    }

    @Override // p.InterfaceC1589j
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f14816d.i();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i7, int i8, int i9, int i10) {
        boolean frame = super.setFrame(i7, i8, i9, i10);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
