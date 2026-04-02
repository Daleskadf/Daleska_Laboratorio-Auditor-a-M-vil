package p;

import D.AbstractC0055e;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import e0.C0927b;
import i.AbstractC1091a;
import w0.C1948g;
/* renamed from: p.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1599o {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f14855a;

    /* renamed from: b  reason: collision with root package name */
    public final C0927b f14856b;

    /* JADX WARN: Type inference failed for: r0v0, types: [e0.b, java.lang.Object] */
    public C1599o(TextView textView) {
        this.f14855a = textView;
        ?? obj = new Object();
        obj.f10587a = new C1948g(textView);
        this.f14856b = obj;
    }

    public final void a(AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = this.f14855a.getContext().obtainStyledAttributes(attributeSet, AbstractC1091a.f11356g, i7, 0);
        try {
            boolean z7 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z7 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            ((AbstractC0055e) this.f14856b.f10587a).x(z7);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
