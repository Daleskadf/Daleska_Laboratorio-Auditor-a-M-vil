package U5;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugins.urllauncher.WebViewActivity;
/* loaded from: classes.dex */
public final class i extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f5785a;

    public i(WebViewActivity webViewActivity) {
        this.f5785a = webViewActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z7, boolean z8, Message message) {
        h hVar = new h(this);
        WebView webView2 = new WebView(this.f5785a.f12395c.getContext());
        webView2.setWebViewClient(hVar);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
