package X5;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes.dex */
public class Y extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    public WebViewClient f6441a;

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z7, boolean z8, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        if (this.f6441a == null) {
            return false;
        }
        webView2.setWebViewClient(new X(this, webView));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
