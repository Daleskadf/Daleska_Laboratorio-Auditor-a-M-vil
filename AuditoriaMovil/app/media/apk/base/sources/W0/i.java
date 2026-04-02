package w0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import u0.C1852h;
/* loaded from: classes.dex */
public final class i implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    public final TransformationMethod f16330a;

    public i(TransformationMethod transformationMethod) {
        this.f16330a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f16330a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && C1852h.a().b() == 1) {
            C1852h a7 = C1852h.a();
            a7.getClass();
            return a7.e(charSequence, 0, charSequence.length());
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z7, int i7, Rect rect) {
        TransformationMethod transformationMethod = this.f16330a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z7, i7, rect);
        }
    }
}
