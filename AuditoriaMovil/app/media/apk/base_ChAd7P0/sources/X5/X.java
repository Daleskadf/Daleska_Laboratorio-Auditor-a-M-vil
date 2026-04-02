package X5;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes.dex */
public final class X extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebView f6439a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Y f6440b;

    public X(Y y2, WebView webView) {
        this.f6440b = y2;
        this.f6439a = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean shouldOverrideUrlLoading;
        WebViewClient webViewClient = this.f6440b.f6441a;
        WebView webView2 = this.f6439a;
        shouldOverrideUrlLoading = webViewClient.shouldOverrideUrlLoading(webView2, webResourceRequest);
        if (shouldOverrideUrlLoading) {
            return true;
        }
        webView2.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient webViewClient = this.f6440b.f6441a;
        WebView webView2 = this.f6439a;
        if (webViewClient.shouldOverrideUrlLoading(webView2, str)) {
            return true;
        }
        webView2.loadUrl(str);
        return true;
    }
}
