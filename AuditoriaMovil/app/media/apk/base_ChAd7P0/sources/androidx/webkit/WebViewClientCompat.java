package androidx.webkit;

import G.i;
import X5.g0;
import a1.C0415A;
import a6.t0;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import f7.a;
import g2.b;
import g2.d;
import g2.k;
import g2.l;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
/* loaded from: classes.dex */
public abstract class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f8075a = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    public static void a(t0 t0Var) {
        if (i.z("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            b bVar = k.f11124c;
            if (bVar.a()) {
                if (((SafeBrowsingResponse) t0Var.f7209b) == null) {
                    C0415A c0415a = l.f11126a;
                    t0Var.f7209b = d.a(((WebkitToCompatConverterBoundaryInterface) c0415a.f6744a).convertSafeBrowsingResponse(Proxy.getInvocationHandler((SafeBrowsingResponseBoundaryInterface) t0Var.f7210c)));
                }
                ((SafeBrowsingResponse) t0Var.f7209b).showInterstitial(true);
                return;
            } else if (bVar.b()) {
                if (((SafeBrowsingResponseBoundaryInterface) t0Var.f7210c) == null) {
                    t0Var.f7210c = (SafeBrowsingResponseBoundaryInterface) a.a(SafeBrowsingResponseBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) l.f11126a.f6744a).convertSafeBrowsingResponse((SafeBrowsingResponse) t0Var.f7209b));
                }
                ((SafeBrowsingResponseBoundaryInterface) t0Var.f7210c).showInterstitial(true);
                return;
            } else {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
        }
        b bVar2 = k.f11122a;
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return f8075a;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, g2.h] */
    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        ?? obj = new Object();
        obj.f11120b = (WebResourceErrorBoundaryInterface) a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
        g0 g0Var = (g0) this;
        g0Var.f6492b.f6519a.s(new M.d(g0Var, webView, webResourceRequest, obj, 4));
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i7, InvocationHandler invocationHandler) {
        t0 t0Var = new t0(16, false);
        t0Var.f7210c = (SafeBrowsingResponseBoundaryInterface) a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
        a(t0Var);
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i7, SafeBrowsingResponse safeBrowsingResponse) {
        t0 t0Var = new t0(16, false);
        t0Var.f7209b = safeBrowsingResponse;
        a(t0Var);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, g2.h] */
    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        ?? obj = new Object();
        obj.f11119a = webResourceError;
        g0 g0Var = (g0) this;
        g0Var.f6492b.f6519a.s(new M.d(g0Var, webView, webResourceRequest, obj, 4));
    }
}
