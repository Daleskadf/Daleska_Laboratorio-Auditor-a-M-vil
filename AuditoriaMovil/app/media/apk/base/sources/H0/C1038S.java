package h0;

import android.view.View;
import android.view.Window;
/* renamed from: h0.S  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1038S extends C1037Q {
    @Override // h3.AbstractC1079a
    public final void u(boolean z7) {
        Window window = this.f11173d;
        if (z7) {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
    }
}
