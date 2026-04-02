package w0;

import D.AbstractC0055e;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import u0.C1852h;
/* renamed from: w0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1948g extends AbstractC0055e {

    /* renamed from: e  reason: collision with root package name */
    public final C1947f f16326e;

    public C1948g(TextView textView) {
        this.f16326e = new C1947f(textView);
    }

    @Override // D.AbstractC0055e
    public final TransformationMethod F(TransformationMethod transformationMethod) {
        boolean z7;
        if (C1852h.j != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            return transformationMethod;
        }
        return this.f16326e.F(transformationMethod);
    }

    @Override // D.AbstractC0055e
    public final InputFilter[] i(InputFilter[] inputFilterArr) {
        boolean z7;
        if (C1852h.j != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            return inputFilterArr;
        }
        return this.f16326e.i(inputFilterArr);
    }

    @Override // D.AbstractC0055e
    public final boolean m() {
        return this.f16326e.f16325g;
    }

    @Override // D.AbstractC0055e
    public final void w(boolean z7) {
        boolean z8;
        if (C1852h.j != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            return;
        }
        this.f16326e.w(z7);
    }

    @Override // D.AbstractC0055e
    public final void x(boolean z7) {
        boolean z8;
        if (C1852h.j != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        C1947f c1947f = this.f16326e;
        if (!z8) {
            c1947f.f16325g = z7;
        } else {
            c1947f.x(z7);
        }
    }
}
