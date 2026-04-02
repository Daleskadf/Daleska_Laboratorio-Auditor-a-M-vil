package h0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import h3.AbstractC1079a;
/* renamed from: h0.T  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1039T extends AbstractC1079a {

    /* renamed from: d  reason: collision with root package name */
    public final WindowInsetsController f11174d;

    /* renamed from: e  reason: collision with root package name */
    public final Window f11175e;

    public C1039T(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f11174d = insetsController;
        this.f11175e = window;
    }

    @Override // h3.AbstractC1079a
    public final void u(boolean z7) {
        Window window = this.f11175e;
        if (z7) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f11174d.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f11174d.setSystemBarsAppearance(0, 16);
    }

    @Override // h3.AbstractC1079a
    public final void v(boolean z7) {
        Window window = this.f11175e;
        if (z7) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f11174d.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f11174d.setSystemBarsAppearance(0, 8);
    }
}
