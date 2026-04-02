package U5;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes.dex */
public final class h extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f5784a;

    public h(i iVar) {
        this.f5784a = iVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f5784a.f5785a.f12395c.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f5784a.f5785a.f12395c.loadUrl(str);
        return true;
    }
}
