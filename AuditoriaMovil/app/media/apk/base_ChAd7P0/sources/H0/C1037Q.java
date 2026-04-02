package h0;

import android.view.View;
import android.view.Window;
import h3.AbstractC1079a;
/* renamed from: h0.Q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1037Q extends AbstractC1079a {

    /* renamed from: d  reason: collision with root package name */
    public final Window f11173d;

    public C1037Q(Window window) {
        this.f11173d = window;
    }

    @Override // h3.AbstractC1079a
    public final void v(boolean z7) {
        Window window = this.f11173d;
        if (z7) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
    }
}
