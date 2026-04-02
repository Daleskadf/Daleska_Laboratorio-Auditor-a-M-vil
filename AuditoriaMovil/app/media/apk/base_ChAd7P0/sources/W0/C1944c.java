package w0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import u0.AbstractC1850f;
import u0.C1852h;
/* renamed from: w0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1944c extends AbstractC1850f {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f16318a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f16319b;

    public C1944c(TextView textView, C1945d c1945d) {
        this.f16318a = new WeakReference(textView);
        this.f16319b = new WeakReference(c1945d);
    }

    @Override // u0.AbstractC1850f
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f16318a.get();
        InputFilter inputFilter = (InputFilter) this.f16319b.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        C1852h a7 = C1852h.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            a7.getClass();
                            length = text.length();
                        }
                        CharSequence e7 = a7.e(text, 0, length);
                        if (text == e7) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(e7);
                        int selectionEnd = Selection.getSelectionEnd(e7);
                        textView.setText(e7);
                        if (e7 instanceof Spannable) {
                            Spannable spannable = (Spannable) e7;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
