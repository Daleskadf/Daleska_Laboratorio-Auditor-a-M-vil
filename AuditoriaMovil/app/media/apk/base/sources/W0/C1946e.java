package w0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import p.C1608t;
/* renamed from: w0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1946e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final KeyListener f16322a;

    /* renamed from: b  reason: collision with root package name */
    public final v4.d f16323b;

    /* JADX WARN: Type inference failed for: r0v0, types: [v4.d, java.lang.Object] */
    public C1946e(KeyListener keyListener) {
        ?? obj = new Object();
        this.f16322a = keyListener;
        this.f16323b = obj;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i7) {
        this.f16322a.clearMetaKeyState(view, editable, i7);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f16322a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i7, KeyEvent keyEvent) {
        boolean E4;
        boolean z7;
        this.f16323b.getClass();
        if (i7 != 67) {
            if (i7 != 112) {
                E4 = false;
            } else {
                E4 = C1608t.E(editable, keyEvent, true);
            }
        } else {
            E4 = C1608t.E(editable, keyEvent, false);
        }
        if (E4) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7 && !this.f16322a.onKeyDown(view, editable, i7, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f16322a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f16322a.onKeyUp(view, editable, i7, keyEvent);
    }
}
