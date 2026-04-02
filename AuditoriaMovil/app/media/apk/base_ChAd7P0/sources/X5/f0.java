package X5;

import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6485a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WebView f6486b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ float f6487c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ float f6488d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ WebViewClient f6489e;

    public /* synthetic */ f0(WebViewClient webViewClient, WebView webView, float f, float f4, int i7) {
        this.f6485a = i7;
        this.f6489e = webViewClient;
        this.f6486b = webView;
        this.f6487c = f;
        this.f6488d = f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6485a) {
            case 0:
                double d7 = this.f6487c;
                double d8 = this.f6488d;
                C0391q c0391q = new C0391q(2);
                g0 g0Var = (g0) this.f6489e;
                g0Var.f6492b.m(g0Var, this.f6486b, d7, d8, c0391q);
                return;
            default:
                double d9 = this.f6487c;
                double d10 = this.f6488d;
                C0391q c0391q2 = new C0391q(3);
                i0 i0Var = (i0) this.f6489e;
                i0Var.f6501a.m(i0Var, this.f6486b, d9, d10, c0391q2);
                return;
        }
    }
}
