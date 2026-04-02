package m;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;
/* renamed from: m.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1424a implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    public Locale f13881a;

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f13881a);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z7, int i7, Rect rect) {
    }
}
