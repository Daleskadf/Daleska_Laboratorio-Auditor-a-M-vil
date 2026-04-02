package X5;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
/* loaded from: classes.dex */
public final class g0 extends WebViewClientCompat {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f6491d = 0;

    /* renamed from: b  reason: collision with root package name */
    public final C0388n f6492b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6493c = false;

    public g0(C0388n c0388n) {
        this.f6492b = c0388n;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z7) {
        this.f6492b.f6519a.s(new e0(this, webView, str, z7, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f6492b.f6519a.s(new M.d(this, webView, message, message2, 6));
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        this.f6492b.f6519a.s(new d0(this, webView, str, 2));
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onPageCommitVisible(WebView webView, String str) {
        this.f6492b.f6519a.s(new d0(this, webView, str, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f6492b.f6519a.s(new d0(this, webView, str, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f6492b.f6519a.s(new d0(this, webView, str, 4));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f6492b.f6519a.s(new A.h(this, webView, clientCertRequest, 7));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        this.f6492b.f6519a.s(new c0(this, webView, i7, str, str2, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f6492b.f6519a.s(new Q0.x(this, webView, httpAuthHandler, str, str2, 2));
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f6492b.f6519a.s(new M.d(this, webView, webResourceRequest, webResourceResponse, 5));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f6492b.f6519a.s(new Q0.x(this, webView, str, str2, str3, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f6492b.f6519a.s(new M.d(this, webView, sslErrorHandler, sslError, 7));
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f4) {
        this.f6492b.f6519a.s(new f0(this, webView, f, f4, 0));
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f6492b.f6519a.s(new A.h(this, webView, webResourceRequest, 8));
        return webResourceRequest.isForMainFrame() && this.f6493c;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f6492b.f6519a.s(new d0(this, webView, str, 0));
        return this.f6493c;
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }
}
