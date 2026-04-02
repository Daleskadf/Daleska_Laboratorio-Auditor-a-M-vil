package W;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0570w;
import androidx.lifecycle.EnumC0563o;
import androidx.lifecycle.InterfaceC0568u;
/* renamed from: W.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0362e extends Activity implements InterfaceC0568u {

    /* renamed from: a  reason: collision with root package name */
    public final C0570w f6028a = new C0570w(this);

    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v9, types: [h0.y, java.lang.Object] */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r12) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W.AbstractActivityC0362e.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.j.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        if (f7.a.O(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i7 = androidx.lifecycle.K.f7896b;
        androidx.lifecycle.I.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.j.e(outState, "outState");
        this.f6028a.g(EnumC0563o.CREATED);
        super.onSaveInstanceState(outState);
    }

    public Context zza() {
        return getApplicationContext();
    }
}
