package w0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;
import u0.C1849e;
import u0.C1852h;
import v0.C1880b;
/* renamed from: w0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1943b extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final EditText f16316a;

    /* renamed from: b  reason: collision with root package name */
    public final t2.i f16317b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1943b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i7;
        t2.i iVar = new t2.i(23);
        this.f16316a = editText;
        this.f16317b = iVar;
        if (C1852h.j != null) {
            C1852h a7 = C1852h.a();
            if (a7.b() == 1 && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                C1849e c1849e = a7.f15924e;
                c1849e.getClass();
                Bundle bundle = editorInfo.extras;
                C1880b c1880b = (C1880b) c1849e.f15918c.f920b;
                int a8 = c1880b.a(4);
                if (a8 != 0) {
                    i7 = ((ByteBuffer) c1880b.f11209d).getInt(a8 + c1880b.f11206a);
                } else {
                    i7 = 0;
                }
                bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i7);
                Bundle bundle2 = editorInfo.extras;
                c1849e.f15916a.getClass();
                bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        Editable editableText = this.f16316a.getEditableText();
        this.f16317b.getClass();
        if (!t2.i.D(this, editableText, i7, i8, false) && !super.deleteSurroundingText(i7, i8)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        Editable editableText = this.f16316a.getEditableText();
        this.f16317b.getClass();
        if (t2.i.D(this, editableText, i7, i8, true) || super.deleteSurroundingTextInCodePoints(i7, i8)) {
            return true;
        }
        return false;
    }
}
