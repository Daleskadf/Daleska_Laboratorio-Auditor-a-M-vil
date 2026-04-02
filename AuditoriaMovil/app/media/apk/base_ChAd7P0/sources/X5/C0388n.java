package X5;

import android.net.http.SslError;
import android.os.Message;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import m6.AbstractC1448i;
/* renamed from: X5.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0388n {

    /* renamed from: a  reason: collision with root package name */
    public final F3.o f6519a;

    public C0388n(F3.o pigeonRegistrar, int i7) {
        switch (i7) {
            case 1:
                kotlin.jvm.internal.j.e(pigeonRegistrar, "pigeonRegistrar");
                this.f6519a = pigeonRegistrar;
                return;
            case 2:
                kotlin.jvm.internal.j.e(pigeonRegistrar, "pigeonRegistrar");
                this.f6519a = pigeonRegistrar;
                return;
            case 3:
                kotlin.jvm.internal.j.e(pigeonRegistrar, "pigeonRegistrar");
                this.f6519a = pigeonRegistrar;
                return;
            default:
                kotlin.jvm.internal.j.e(pigeonRegistrar, "pigeonRegistrar");
                this.f6519a = pigeonRegistrar;
                return;
        }
    }

    public void a(WebViewClient pigeon_instanceArg, WebView webViewArg, String urlArg, boolean z7, w6.l lVar) {
        kotlin.jvm.internal.j.e(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.e(urlArg, "urlArg");
        F3.o oVar = this.f6519a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory", oVar.j(), null, 4).f0(AbstractC1448i.L(pigeon_instanceArg, webViewArg, urlArg, Boolean.valueOf(z7)), new P(2, lVar));
    }

    public void b(WebViewClient pigeon_instanceArg, WebView viewArg, Message dontResendArg, Message resendArg, w6.l lVar) {
        kotlin.jvm.internal.j.e(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.e(viewArg, "viewArg");
        kotlin.jvm.internal.j.e(dontResendArg, "dontResendArg");
        kotlin.jvm.internal.j.e(resendArg, "resendArg");
        F3.o oVar = this.f6519a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission", oVar.j(), null, 4).f0(AbstractC1448i.L(pigeon_instanceArg, viewArg, dontResendArg, resendArg), new P(13, lVar));
    }

    public void c(WebViewClient pigeon_instanceArg, WebView viewArg, String urlArg, w6.l lVar) {
        kotlin.jvm.internal.j.e(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.e(viewArg, "viewArg");
        kotlin.jvm.internal.j.e(urlArg, "urlArg");
        F3.o oVar = this.f6519a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource", oVar.j(), null, 4).f0(AbstractC1448i.L(pigeon_instanceArg, viewArg, urlArg), new P(4, lVar));
    }

    public void d(WebViewClient pigeon_instanceArg, WebView viewArg, String urlArg, w6.l lVar) {
        kotlin.jvm.internal.j.e(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.e(viewArg, "viewArg");
        kotlin.jvm.internal.j.e(urlArg, "urlArg");
        F3.o oVar = this.f6519a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible", oVar.j(), null, 4).f0(AbstractC1448i.L(pigeon_instanceArg, viewArg, urlArg), new P(9, lVar));
    }

    public void e(WebViewClient pigeon_instanceArg, WebView webViewArg, String urlArg, w6.l lVar) {
        kotlin.jvm.internal.j.e(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.e(urlArg, "urlArg");
        F3.o oVar = this.f6519a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished", oVar.j(), null, 4).f0(AbstractC1448i.L(pigeon_instanceArg, webViewArg, urlArg), new P(10, lVar));
    }

    public void f(WebViewClient pigeon_instanceArg, WebView webViewArg, String urlArg, w6.l lVar) {
        kotlin.jvm.internal.j.e(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.e(urlArg, "urlArg");
        F3.o oVar = this.f6519a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted", oVar.j(), null, 4).f0(AbstractC1448i.L(pigeon_instanceArg, webViewArg, urlArg), new P(6, lVar));
    }

    public void g(WebViewClient pigeon_instanceArg, WebView viewArg, ClientCertRequest requestArg, w6.l lVar) {
        kotlin.jvm.internal.j.e(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.e(viewArg, "viewArg");
        kotlin.jvm.internal.j.e(requestArg, "requestArg");
        F3.o oVar = this.f6519a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest", oVar.j(), null, 4).f0(AbstractC1448i.L(pigeon_instanceArg, viewArg, requestArg), new P(7, lVar));
    }

    public void h(WebViewClient pigeon_instanceArg, WebView webViewArg, long j, String descriptionArg, String failingUrlArg, w6.l lVar) {
        kotlin.jvm.internal.j.e(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.e(descriptionArg, "descriptionArg");
        kotlin.jvm.internal.j.e(failingUrlArg, "failingUrlArg");
        F3.o oVar = this.f6519a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedError", oVar.j(), null, 4).f0(AbstractC1448i.L(pigeon_instanceArg, webViewArg, Long.valueOf(j), descriptionArg, failingUrlArg), new P(11, lVar));
    }

    public void i(WebViewClient pigeon_instanceArg, WebView webViewArg, HttpAuthHandler handlerArg, String hostArg, String realmArg, w6.l lVar) {
        kotlin.jvm.internal.j.e(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.e(handlerArg, "handlerArg");
        kotlin.jvm.internal.j.e(hostArg, "hostArg");
        kotlin.jvm.internal.j.e(realmArg, "realmArg");
        F3.o oVar = this.f6519a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest", oVar.j(), null, 4).f0(AbstractC1448i.L(pigeon_instanceArg, webViewArg, handlerArg, hostArg, realmArg), new P(12, lVar));
    }

    public void j(WebViewClient pigeon_instanceArg, WebView webViewArg, WebResourceRequest requestArg, WebResourceResponse responseArg, w6.l lVar) {
        kotlin.jvm.internal.j.e(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.e(requestArg, "requestArg");
        kotlin.jvm.internal.j.e(responseArg, "responseArg");
        F3.o oVar = this.f6519a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError", oVar.j(), null, 4).f0(AbstractC1448i.L(pigeon_instanceArg, webViewArg, requestArg, responseArg), new P(3, lVar));
    }

    public void k(WebViewClient pigeon_instanceArg, WebView viewArg, String realmArg, String str, String argsArg, w6.l lVar) {
        kotlin.jvm.internal.j.e(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.e(viewArg, "viewArg");
        kotlin.jvm.internal.j.e(realmArg, "realmArg");
        kotlin.jvm.internal.j.e(argsArg, "argsArg");
        F3.o oVar = this.f6519a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest", oVar.j(), null, 4).f0(AbstractC1448i.L(pigeon_instanceArg, viewArg, realmArg, str, argsArg), new P(5, lVar));
    }

    public void l(WebViewClient pigeon_instanceArg, WebView viewArg, SslErrorHandler handlerArg, SslError errorArg, w6.l lVar) {
        kotlin.jvm.internal.j.e(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.e(viewArg, "viewArg");
        kotlin.jvm.internal.j.e(handlerArg, "handlerArg");
        kotlin.jvm.internal.j.e(errorArg, "errorArg");
        F3.o oVar = this.f6519a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError", oVar.j(), null, 4).f0(AbstractC1448i.L(pigeon_instanceArg, viewArg, handlerArg, errorArg), new P(14, lVar));
    }

    public void m(WebViewClient pigeon_instanceArg, WebView viewArg, double d7, double d8, w6.l lVar) {
        kotlin.jvm.internal.j.e(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.e(viewArg, "viewArg");
        F3.o oVar = this.f6519a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged", oVar.j(), null, 4).f0(AbstractC1448i.L(pigeon_instanceArg, viewArg, Double.valueOf(d7), Double.valueOf(d8)), new P(0, lVar));
    }

    public void n(WebViewClient pigeon_instanceArg, WebView webViewArg, WebResourceRequest requestArg, w6.l lVar) {
        kotlin.jvm.internal.j.e(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.e(requestArg, "requestArg");
        F3.o oVar = this.f6519a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading", oVar.j(), null, 4).f0(AbstractC1448i.L(pigeon_instanceArg, webViewArg, requestArg), new P(8, lVar));
    }

    public void o(WebViewClient pigeon_instanceArg, WebView webViewArg, String urlArg, w6.l lVar) {
        kotlin.jvm.internal.j.e(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.e(urlArg, "urlArg");
        F3.o oVar = this.f6519a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading", oVar.j(), null, 4).f0(AbstractC1448i.L(pigeon_instanceArg, webViewArg, urlArg), new P(1, lVar));
    }
}
