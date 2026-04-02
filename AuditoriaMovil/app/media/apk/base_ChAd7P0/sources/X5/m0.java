package X5;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import m6.AbstractC1448i;
/* loaded from: classes.dex */
public final class m0 extends WebView implements io.flutter.plugin.platform.g {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f6515d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final C0392s f6516a;

    /* renamed from: b  reason: collision with root package name */
    public WebViewClient f6517b;

    /* renamed from: c  reason: collision with root package name */
    public Y f6518c;

    /* JADX WARN: Type inference failed for: r2v2, types: [X5.Y, android.webkit.WebChromeClient] */
    public m0(C0392s c0392s) {
        super((Context) c0392s.f6530a.f1181e);
        this.f6516a = c0392s;
        this.f6517b = new WebViewClient();
        this.f6518c = new WebChromeClient();
        setWebViewClient(this.f6517b);
        setWebChromeClient(this.f6518c);
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.f6518c;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        B5.B b5;
        super.onAttachedToWindow();
        this.f6516a.f6530a.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            ViewParent viewParent = this;
            while (true) {
                if (viewParent.getParent() != null) {
                    viewParent = viewParent.getParent();
                    if (viewParent instanceof B5.B) {
                        b5 = (B5.B) viewParent;
                        break;
                    }
                } else {
                    b5 = null;
                    break;
                }
            }
            if (b5 != null) {
                b5.setImportantForAutofill(1);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(final int i7, final int i8, final int i9, final int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
        this.f6516a.f6530a.s(new Runnable() { // from class: X5.l0
            @Override // java.lang.Runnable
            public final void run() {
                C0391q c0391q = new C0391q(4);
                m0 m0Var = m0.this;
                C0392s c0392s = m0Var.f6516a;
                c0392s.getClass();
                F3.o oVar = c0392s.f6530a;
                oVar.getClass();
                new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged", oVar.j(), null, 4).f0(AbstractC1448i.L(m0Var, Long.valueOf(i7), Long.valueOf(i8), Long.valueOf(i9), Long.valueOf(i10)), new L(c0391q, 12));
            }
        });
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
        if (webChromeClient instanceof Y) {
            Y y2 = (Y) webChromeClient;
            this.f6518c = y2;
            y2.f6441a = this.f6517b;
            return;
        }
        throw new AssertionError("Client must be a SecureWebChromeClient.");
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.f6517b = webViewClient;
        this.f6518c.f6441a = webViewClient;
    }

    @Override // io.flutter.plugin.platform.g
    public final void a() {
    }

    @Override // io.flutter.plugin.platform.g
    public View getView() {
        return this;
    }
}
