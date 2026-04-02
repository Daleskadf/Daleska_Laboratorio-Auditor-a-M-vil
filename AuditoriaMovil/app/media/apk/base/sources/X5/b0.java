package X5;

import android.net.Uri;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import j$.util.Objects;
import java.util.List;
import m6.AbstractC1448i;
/* loaded from: classes.dex */
public final class b0 extends Y {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f6451h = 0;

    /* renamed from: b  reason: collision with root package name */
    public final C0392s f6452b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6453c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6454d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6455e = false;
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6456g = false;

    public b0(C0392s c0392s) {
        this.f6452b = c0392s;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage messageArg) {
        C0391q c0391q = new C0391q(1);
        C0392s c0392s = this.f6452b;
        c0392s.getClass();
        kotlin.jvm.internal.j.e(messageArg, "messageArg");
        F3.o oVar = c0392s.f6530a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage", oVar.j(), null, 4).f0(AbstractC1448i.L(this, messageArg), new L(c0391q, 1));
        return this.f6454d;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        C0391q c0391q = new C0391q(1);
        C0392s c0392s = this.f6452b;
        c0392s.getClass();
        F3.o oVar = c0392s.f6530a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt", oVar.j(), null, 4).f0(G.i.A(this), new L(c0391q, 3));
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String originArg, GeolocationPermissions.Callback callbackArg) {
        C0391q c0391q = new C0391q(1);
        C0392s c0392s = this.f6452b;
        c0392s.getClass();
        kotlin.jvm.internal.j.e(originArg, "originArg");
        kotlin.jvm.internal.j.e(callbackArg, "callbackArg");
        F3.o oVar = c0392s.f6530a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt", oVar.j(), null, 4).f0(AbstractC1448i.L(this, originArg, callbackArg), new L(c0391q, 2));
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        C0391q c0391q = new C0391q(1);
        C0392s c0392s = this.f6452b;
        c0392s.getClass();
        F3.o oVar = c0392s.f6530a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView", oVar.j(), null, 4).f0(G.i.A(this), new A(c0391q, 27));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webViewArg, String urlArg, String messageArg, JsResult jsResult) {
        if (!this.f6455e) {
            return false;
        }
        E6.l lVar = new E6.l(new Z(this, jsResult, 1), 5);
        C0392s c0392s = this.f6452b;
        c0392s.getClass();
        kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.e(urlArg, "urlArg");
        kotlin.jvm.internal.j.e(messageArg, "messageArg");
        F3.o oVar = c0392s.f6530a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert", oVar.j(), null, 4).f0(AbstractC1448i.L(this, webViewArg, urlArg, messageArg), new K(lVar, 1));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webViewArg, String urlArg, String messageArg, JsResult jsResult) {
        if (!this.f) {
            return false;
        }
        E6.l lVar = new E6.l(new Z(this, jsResult, 0), 5);
        C0392s c0392s = this.f6452b;
        c0392s.getClass();
        kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.e(urlArg, "urlArg");
        kotlin.jvm.internal.j.e(messageArg, "messageArg");
        F3.o oVar = c0392s.f6530a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", oVar.j(), null, 4).f0(AbstractC1448i.L(this, webViewArg, urlArg, messageArg), new K(lVar, 3));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webViewArg, String urlArg, String messageArg, String defaultValueArg, JsPromptResult jsPromptResult) {
        if (!this.f6456g) {
            return false;
        }
        E6.l lVar = new E6.l(new Z(this, jsPromptResult, 2), 5);
        C0392s c0392s = this.f6452b;
        c0392s.getClass();
        kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.e(urlArg, "urlArg");
        kotlin.jvm.internal.j.e(messageArg, "messageArg");
        kotlin.jvm.internal.j.e(defaultValueArg, "defaultValueArg");
        F3.o oVar = c0392s.f6530a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt", oVar.j(), null, 4).f0(AbstractC1448i.L(this, webViewArg, urlArg, messageArg, defaultValueArg), new K(lVar, 0));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest requestArg) {
        C0391q c0391q = new C0391q(1);
        C0392s c0392s = this.f6452b;
        c0392s.getClass();
        kotlin.jvm.internal.j.e(requestArg, "requestArg");
        F3.o oVar = c0392s.f6530a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest", oVar.j(), null, 4).f0(AbstractC1448i.L(this, requestArg), new A(c0391q, 29));
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webViewArg, int i7) {
        long j = i7;
        C0391q c0391q = new C0391q(1);
        C0392s c0392s = this.f6452b;
        c0392s.getClass();
        kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
        F3.o oVar = c0392s.f6530a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged", oVar.j(), null, 4).f0(AbstractC1448i.L(this, webViewArg, Long.valueOf(j)), new A(c0391q, 28));
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View viewArg, WebChromeClient.CustomViewCallback callbackArg) {
        C0391q c0391q = new C0391q(1);
        C0392s c0392s = this.f6452b;
        c0392s.getClass();
        kotlin.jvm.internal.j.e(viewArg, "viewArg");
        kotlin.jvm.internal.j.e(callbackArg, "callbackArg");
        F3.o oVar = c0392s.f6530a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView", oVar.j(), null, 4).f0(AbstractC1448i.L(this, viewArg, callbackArg), new L(c0391q, 0));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webViewArg, final ValueCallback valueCallback, WebChromeClient.FileChooserParams paramsArg) {
        final boolean z7 = this.f6453c;
        E6.l lVar = new E6.l(new w6.l() { // from class: X5.a0
            @Override // w6.l
            public final Object invoke(Object obj) {
                S s7 = (S) obj;
                b0 b0Var = b0.this;
                b0Var.getClass();
                if (s7.f6436d) {
                    F3.o oVar = b0Var.f6452b.f6530a;
                    Throwable th = s7.f6435c;
                    Objects.requireNonNull(th);
                    oVar.getClass();
                    F3.o.q(th);
                    return null;
                }
                List list = (List) s7.f6434b;
                Objects.requireNonNull(list);
                if (z7) {
                    Uri[] uriArr = new Uri[list.size()];
                    for (int i7 = 0; i7 < list.size(); i7++) {
                        uriArr[i7] = Uri.parse((String) list.get(i7));
                    }
                    valueCallback.onReceiveValue(uriArr);
                    return null;
                }
                return null;
            }
        }, 5);
        C0392s c0392s = this.f6452b;
        c0392s.getClass();
        kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
        kotlin.jvm.internal.j.e(paramsArg, "paramsArg");
        F3.o oVar = c0392s.f6530a;
        oVar.getClass();
        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser", oVar.j(), null, 4).f0(AbstractC1448i.L(this, webViewArg, paramsArg), new K(lVar, 2));
        return z7;
    }
}
