package w0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import p.AbstractC1595m;
import p.J0;
import u0.C1852h;
/* loaded from: classes.dex */
public final class h implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1595m f16327a;

    /* renamed from: b  reason: collision with root package name */
    public J0 f16328b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16329c = true;

    public h(AbstractC1595m abstractC1595m) {
        this.f16327a = abstractC1595m;
    }

    public static void a(EditText editText, int i7) {
        int length;
        if (i7 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C1852h a7 = C1852h.a();
            if (editableText == null) {
                length = 0;
            } else {
                a7.getClass();
                length = editableText.length();
            }
            a7.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        AbstractC1595m abstractC1595m = this.f16327a;
        if (!abstractC1595m.isInEditMode() && this.f16329c && C1852h.j != null && i8 <= i9 && (charSequence instanceof Spannable)) {
            int b5 = C1852h.a().b();
            if (b5 != 0) {
                if (b5 != 1) {
                    if (b5 != 3) {
                        return;
                    }
                } else {
                    C1852h.a().e((Spannable) charSequence, i7, i9 + i7);
                    return;
                }
            }
            C1852h a7 = C1852h.a();
            if (this.f16328b == null) {
                this.f16328b = new J0(abstractC1595m);
            }
            a7.f(this.f16328b);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }
}
