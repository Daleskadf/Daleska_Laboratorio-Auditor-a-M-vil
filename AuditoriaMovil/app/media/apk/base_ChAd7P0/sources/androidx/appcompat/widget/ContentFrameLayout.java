package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p.K;
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public TypedValue f7350a;

    /* renamed from: b  reason: collision with root package name */
    public TypedValue f7351b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f7352c;

    /* renamed from: d  reason: collision with root package name */
    public TypedValue f7353d;

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f7354e;

    /* renamed from: e0  reason: collision with root package name */
    public final Rect f7355e0;
    public TypedValue f;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f7355e0 = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f7354e == null) {
            this.f7354e = new TypedValue();
        }
        return this.f7354e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f7352c == null) {
            this.f7352c = new TypedValue();
        }
        return this.f7352c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f7353d == null) {
            this.f7353d = new TypedValue();
        }
        return this.f7353d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f7350a == null) {
            this.f7350a = new TypedValue();
        }
        return this.f7350a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f7351b == null) {
            this.f7351b = new TypedValue();
        }
        return this.f7351b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(K k2) {
    }
}
