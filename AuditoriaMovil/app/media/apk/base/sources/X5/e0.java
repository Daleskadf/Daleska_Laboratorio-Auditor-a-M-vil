package X5;

import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6478a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WebView f6479b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f6480c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f6481d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ WebViewClient f6482e;

    public /* synthetic */ e0(WebViewClient webViewClient, WebView webView, String str, boolean z7, int i7) {
        this.f6478a = i7;
        this.f6482e = webViewClient;
        this.f6479b = webView;
        this.f6480c = str;
        this.f6481d = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6478a) {
            case 0:
                C0391q c0391q = new C0391q(2);
                g0 g0Var = (g0) this.f6482e;
                g0Var.f6492b.a(g0Var, this.f6479b, this.f6480c, this.f6481d, c0391q);
                return;
            default:
                C0391q c0391q2 = new C0391q(3);
                i0 i0Var = (i0) this.f6482e;
                i0Var.f6501a.a(i0Var, this.f6479b, this.f6480c, this.f6481d, c0391q2);
                return;
        }
    }
}
