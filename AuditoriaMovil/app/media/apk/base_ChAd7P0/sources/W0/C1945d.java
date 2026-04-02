package w0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import u0.C1852h;
/* renamed from: w0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1945d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f16320a;

    /* renamed from: b  reason: collision with root package name */
    public C1944c f16321b;

    public C1945d(TextView textView) {
        this.f16320a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i8, Spanned spanned, int i9, int i10) {
        TextView textView = this.f16320a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b5 = C1852h.a().b();
        if (b5 != 0) {
            if (b5 != 1) {
                if (b5 != 3) {
                    return charSequence;
                }
            } else if ((i10 != 0 || i9 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                if (i7 != 0 || i8 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i7, i8);
                }
                return C1852h.a().e(charSequence, 0, charSequence.length());
            } else {
                return charSequence;
            }
        }
        C1852h a7 = C1852h.a();
        if (this.f16321b == null) {
            this.f16321b = new C1944c(textView, this);
        }
        a7.f(this.f16321b);
        return charSequence;
    }
}
