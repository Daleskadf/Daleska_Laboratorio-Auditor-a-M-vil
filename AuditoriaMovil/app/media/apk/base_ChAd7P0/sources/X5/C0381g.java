package X5;

import D.AbstractC0059i;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import m6.AbstractC1448i;
import org.apache.tika.utils.StringUtils;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
/* renamed from: X5.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381g extends C0376b {

    /* renamed from: d  reason: collision with root package name */
    public final F3.o f6490d;

    public C0381g(F3.o registrar) {
        kotlin.jvm.internal.j.e(registrar, "registrar");
        this.f6490d = registrar;
    }

    @Override // X5.C0376b, L5.x
    public final Object f(byte b5, ByteBuffer buffer) {
        kotlin.jvm.internal.j.e(buffer, "buffer");
        if (b5 == Byte.MIN_VALUE) {
            Object e7 = e(buffer);
            kotlin.jvm.internal.j.c(e7, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) e7).longValue();
            Object e8 = ((C0377c) this.f6490d.f1179c).e(longValue);
            if (e8 == null) {
                Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + longValue);
            }
            return e8;
        }
        return super.f(b5, buffer);
    }

    @Override // X5.C0376b, L5.x
    public final void k(ByteArrayOutputStream stream, Object obj) {
        F3.o oVar;
        EnumC0394u enumC0394u;
        EnumC0385k enumC0385k;
        Boolean bool;
        Map<String, String> requestHeaders;
        boolean isRedirect;
        kotlin.jvm.internal.j.e(stream, "stream");
        if (!(obj instanceof Boolean) && !(obj instanceof byte[]) && !(obj instanceof Double) && !(obj instanceof double[]) && !(obj instanceof float[]) && !(obj instanceof Integer) && !(obj instanceof int[]) && !(obj instanceof List) && !(obj instanceof Long) && !(obj instanceof long[]) && !(obj instanceof Map) && !(obj instanceof String) && !(obj instanceof EnumC0394u) && !(obj instanceof EnumC0385k) && !(obj instanceof EnumC0399z) && !(obj instanceof V) && obj != null) {
            boolean z7 = obj instanceof WebResourceRequest;
            F3.o oVar2 = this.f6490d;
            if (z7) {
                oVar2.getClass();
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
                C0377c c0377c = (C0377c) oVar2.f1179c;
                if (c0377c.d(webResourceRequest)) {
                    oVar = oVar2;
                } else {
                    long b5 = c0377c.b(webResourceRequest);
                    String uri = webResourceRequest.getUrl().toString();
                    boolean isForMainFrame = webResourceRequest.isForMainFrame();
                    if (Build.VERSION.SDK_INT >= 24) {
                        isRedirect = webResourceRequest.isRedirect();
                        bool = Boolean.valueOf(isRedirect);
                    } else {
                        bool = null;
                    }
                    boolean hasGesture = webResourceRequest.hasGesture();
                    String method = webResourceRequest.getMethod();
                    if (webResourceRequest.getRequestHeaders() == null) {
                        requestHeaders = Collections.emptyMap();
                    } else {
                        requestHeaders = webResourceRequest.getRequestHeaders();
                    }
                    oVar = oVar2;
                    new E.e((L5.f) oVar2.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance", oVar2.j(), null, 4).f0(AbstractC1448i.L(Long.valueOf(b5), uri, Boolean.valueOf(isForMainFrame), bool, Boolean.valueOf(hasGesture), method, requestHeaders), new L(6));
                }
            } else {
                oVar = oVar2;
                if (obj instanceof WebResourceResponse) {
                    oVar.getClass();
                    WebResourceResponse webResourceResponse = (WebResourceResponse) obj;
                    C0377c c0377c2 = (C0377c) oVar.f1179c;
                    if (!c0377c2.d(webResourceResponse)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance", oVar.j(), null, 4).f0(AbstractC1448i.L(Long.valueOf(c0377c2.b(webResourceResponse)), Long.valueOf(webResourceResponse.getStatusCode())), new L(7));
                    }
                } else if (obj instanceof WebResourceError) {
                    oVar.getClass();
                    WebResourceError webResourceError = (WebResourceError) obj;
                    C0377c c0377c3 = (C0377c) oVar.f1179c;
                    if (!c0377c3.d(webResourceError)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance", oVar.j(), null, 4).f0(AbstractC1448i.L(Long.valueOf(c0377c3.b(webResourceError)), Long.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription().toString()), new L(4));
                    }
                } else if (obj instanceof g2.h) {
                    oVar.getClass();
                    g2.h hVar = (g2.h) obj;
                    C0377c c0377c4 = (C0377c) oVar.f1179c;
                    if (!c0377c4.d(hVar)) {
                        long b7 = c0377c4.b(hVar);
                        g2.k.f11123b.getClass();
                        if (hVar.f11119a == null) {
                            hVar.f11119a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) g2.l.f11126a.f6744a).convertWebResourceError(Proxy.getInvocationHandler(hVar.f11120b));
                        }
                        long errorCode = hVar.f11119a.getErrorCode();
                        g2.k.f11122a.getClass();
                        if (hVar.f11119a == null) {
                            hVar.f11119a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) g2.l.f11126a.f6744a).convertWebResourceError(Proxy.getInvocationHandler(hVar.f11120b));
                        }
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance", oVar.j(), null, 4).f0(AbstractC1448i.L(Long.valueOf(b7), Long.valueOf(errorCode), hVar.f11119a.getDescription().toString()), new L(5));
                    }
                } else if (obj instanceof k0) {
                    oVar.getClass();
                    k0 k0Var = (k0) obj;
                    C0377c c0377c5 = (C0377c) oVar.f1179c;
                    if (!c0377c5.d(k0Var)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance", oVar.j(), null, 4).f0(AbstractC1448i.L(Long.valueOf(c0377c5.b(k0Var)), Long.valueOf(k0Var.f6505a), Long.valueOf(k0Var.f6506b)), new L(16));
                    }
                } else if (obj instanceof ConsoleMessage) {
                    oVar.getClass();
                    ConsoleMessage consoleMessage = (ConsoleMessage) obj;
                    C0377c c0377c6 = (C0377c) oVar.f1179c;
                    if (!c0377c6.d(consoleMessage)) {
                        long b8 = c0377c6.b(consoleMessage);
                        long lineNumber = consoleMessage.lineNumber();
                        String message = consoleMessage.message();
                        int i7 = AbstractC0386l.f6507a[consoleMessage.messageLevel().ordinal()];
                        if (i7 != 1) {
                            if (i7 != 2) {
                                if (i7 != 3) {
                                    if (i7 != 4) {
                                        if (i7 != 5) {
                                            enumC0385k = EnumC0385k.UNKNOWN;
                                        } else {
                                            enumC0385k = EnumC0385k.DEBUG;
                                        }
                                    } else {
                                        enumC0385k = EnumC0385k.ERROR;
                                    }
                                } else {
                                    enumC0385k = EnumC0385k.WARNING;
                                }
                            } else {
                                enumC0385k = EnumC0385k.LOG;
                            }
                        } else {
                            enumC0385k = EnumC0385k.TIP;
                        }
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance", oVar.j(), null, 4).f0(AbstractC1448i.L(Long.valueOf(b8), Long.valueOf(lineNumber), message, enumC0385k, consoleMessage.sourceId()), new A(4));
                    }
                } else if (obj instanceof CookieManager) {
                    oVar.getClass();
                    CookieManager cookieManager = (CookieManager) obj;
                    C0377c c0377c7 = (C0377c) oVar.f1179c;
                    if (!c0377c7.d(cookieManager)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance", oVar.j(), null, 4).f0(G.i.A(Long.valueOf(c0377c7.b(cookieManager))), new A(5));
                    }
                } else if (obj instanceof WebView) {
                    oVar.getClass();
                    WebView webView = (WebView) obj;
                    C0377c c0377c8 = (C0377c) oVar.f1179c;
                    if (!c0377c8.d(webView)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance", oVar.j(), null, 4).f0(G.i.A(Long.valueOf(c0377c8.b(webView))), new L(11));
                    }
                } else if (obj instanceof WebSettings) {
                    oVar.getClass();
                    WebSettings webSettings = (WebSettings) obj;
                    C0377c c0377c9 = (C0377c) oVar.f1179c;
                    if (!c0377c9.d(webSettings)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance", oVar.j(), null, 4).f0(G.i.A(Long.valueOf(c0377c9.b(webSettings))), new L(8));
                    }
                } else if (obj instanceof C0397x) {
                    oVar.getClass();
                    if (!((C0377c) oVar.f1179c).d((C0397x) obj)) {
                        AbstractC0059i.N("new-instance-error", "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method.", StringUtils.EMPTY);
                    }
                } else if (obj instanceof WebViewClient) {
                    oVar.getClass();
                    WebViewClient webViewClient = (WebViewClient) obj;
                    C0377c c0377c10 = (C0377c) oVar.f1179c;
                    if (!c0377c10.d(webViewClient)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance", oVar.j(), null, 4).f0(G.i.A(Long.valueOf(c0377c10.b(webViewClient))), new L(13));
                    }
                } else if (obj instanceof DownloadListener) {
                    oVar.getClass();
                    if (!((C0377c) oVar.f1179c).d((DownloadListener) obj)) {
                        AbstractC0059i.N("new-instance-error", "Attempting to create a new Dart instance of DownloadListener, but the class has a nonnull callback method.", StringUtils.EMPTY);
                    }
                } else if (obj instanceof b0) {
                    oVar.getClass();
                    if (!((C0377c) oVar.f1179c).d((b0) obj)) {
                        AbstractC0059i.N("new-instance-error", "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method.", StringUtils.EMPTY);
                    }
                } else if (obj instanceof C0395v) {
                    oVar.getClass();
                    C0395v c0395v = (C0395v) obj;
                    C0377c c0377c11 = (C0377c) oVar.f1179c;
                    if (!c0377c11.d(c0395v)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance", oVar.j(), null, 4).f0(G.i.A(Long.valueOf(c0377c11.b(c0395v))), new A(10));
                    }
                } else if (obj instanceof WebStorage) {
                    oVar.getClass();
                    WebStorage webStorage = (WebStorage) obj;
                    C0377c c0377c12 = (C0377c) oVar.f1179c;
                    if (!c0377c12.d(webStorage)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance", oVar.j(), null, 4).f0(G.i.A(Long.valueOf(c0377c12.b(webStorage))), new L(9));
                    }
                } else if (obj instanceof WebChromeClient.FileChooserParams) {
                    oVar.getClass();
                    WebChromeClient.FileChooserParams fileChooserParams = (WebChromeClient.FileChooserParams) obj;
                    C0377c c0377c13 = (C0377c) oVar.f1179c;
                    if (!c0377c13.d(fileChooserParams)) {
                        long b9 = c0377c13.b(fileChooserParams);
                        boolean isCaptureEnabled = fileChooserParams.isCaptureEnabled();
                        List asList = Arrays.asList(fileChooserParams.getAcceptTypes());
                        int mode = fileChooserParams.getMode();
                        if (mode != 0) {
                            if (mode != 1) {
                                if (mode != 3) {
                                    enumC0394u = EnumC0394u.UNKNOWN;
                                } else {
                                    enumC0394u = EnumC0394u.SAVE;
                                }
                            } else {
                                enumC0394u = EnumC0394u.OPEN_MULTIPLE;
                            }
                        } else {
                            enumC0394u = EnumC0394u.OPEN;
                        }
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance", oVar.j(), null, 4).f0(AbstractC1448i.L(Long.valueOf(b9), Boolean.valueOf(isCaptureEnabled), asList, enumC0394u, fileChooserParams.getFilenameHint()), new A(9));
                    }
                } else if (obj instanceof PermissionRequest) {
                    oVar.getClass();
                    PermissionRequest permissionRequest = (PermissionRequest) obj;
                    C0377c c0377c14 = (C0377c) oVar.f1179c;
                    if (!c0377c14.d(permissionRequest)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance", oVar.j(), null, 4).f0(AbstractC1448i.L(Long.valueOf(c0377c14.b(permissionRequest)), Arrays.asList(permissionRequest.getResources())), new A(15));
                    }
                } else if (obj instanceof WebChromeClient.CustomViewCallback) {
                    oVar.getClass();
                    WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) obj;
                    C0377c c0377c15 = (C0377c) oVar.f1179c;
                    if (!c0377c15.d(customViewCallback)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance", oVar.j(), null, 4).f0(G.i.A(Long.valueOf(c0377c15.b(customViewCallback))), new A(6));
                    }
                } else if (obj instanceof View) {
                    oVar.getClass();
                    View view = (View) obj;
                    C0377c c0377c16 = (C0377c) oVar.f1179c;
                    if (!c0377c16.d(view)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance", oVar.j(), null, 4).f0(G.i.A(Long.valueOf(c0377c16.b(view))), new A(26));
                    }
                } else if (obj instanceof GeolocationPermissions.Callback) {
                    oVar.getClass();
                    GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj;
                    C0377c c0377c17 = (C0377c) oVar.f1179c;
                    if (!c0377c17.d(callback)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance", oVar.j(), null, 4).f0(G.i.A(Long.valueOf(c0377c17.b(callback))), new A(11));
                    }
                } else if (obj instanceof HttpAuthHandler) {
                    oVar.getClass();
                    HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj;
                    C0377c c0377c18 = (C0377c) oVar.f1179c;
                    if (!c0377c18.d(httpAuthHandler)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance", oVar.j(), null, 4).f0(G.i.A(Long.valueOf(c0377c18.b(httpAuthHandler))), new A(13));
                    }
                } else if (obj instanceof Message) {
                    oVar.getClass();
                    Message message2 = (Message) obj;
                    C0377c c0377c19 = (C0377c) oVar.f1179c;
                    if (!c0377c19.d(message2)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance", oVar.j(), null, 4).f0(G.i.A(Long.valueOf(c0377c19.b(message2))), new P0.b(29));
                    }
                } else if (obj instanceof ClientCertRequest) {
                    oVar.getClass();
                    ClientCertRequest clientCertRequest = (ClientCertRequest) obj;
                    C0377c c0377c20 = (C0377c) oVar.f1179c;
                    if (!c0377c20.d(clientCertRequest)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance", oVar.j(), null, 4).f0(G.i.A(Long.valueOf(c0377c20.b(clientCertRequest))), new A(3));
                    }
                } else if (obj instanceof PrivateKey) {
                    oVar.getClass();
                    PrivateKey privateKey = (PrivateKey) obj;
                    C0377c c0377c21 = (C0377c) oVar.f1179c;
                    if (!c0377c21.d(privateKey)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance", oVar.j(), null, 4).f0(G.i.A(Long.valueOf(c0377c21.b(privateKey))), new A(18));
                    }
                } else if (obj instanceof X509Certificate) {
                    oVar.getClass();
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    C0377c c0377c22 = (C0377c) oVar.f1179c;
                    if (!c0377c22.d(x509Certificate)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance", oVar.j(), null, 4).f0(G.i.A(Long.valueOf(c0377c22.b(x509Certificate))), new L(17));
                    }
                } else if (obj instanceof SslErrorHandler) {
                    oVar.getClass();
                    SslErrorHandler sslErrorHandler = (SslErrorHandler) obj;
                    C0377c c0377c23 = (C0377c) oVar.f1179c;
                    if (!c0377c23.d(sslErrorHandler)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance", oVar.j(), null, 4).f0(G.i.A(Long.valueOf(c0377c23.b(sslErrorHandler))), new A(23));
                    }
                } else if (obj instanceof SslError) {
                    oVar.getClass();
                    SslError sslError = (SslError) obj;
                    C0377c c0377c24 = (C0377c) oVar.f1179c;
                    if (!c0377c24.d(sslError)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance", oVar.j(), null, 4).f0(AbstractC1448i.L(Long.valueOf(c0377c24.b(sslError)), sslError.getCertificate(), sslError.getUrl()), new A(21));
                    }
                } else if (obj instanceof SslCertificate.DName) {
                    oVar.getClass();
                    SslCertificate.DName dName = (SslCertificate.DName) obj;
                    C0377c c0377c25 = (C0377c) oVar.f1179c;
                    if (!c0377c25.d(dName)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance", oVar.j(), null, 4).f0(G.i.A(Long.valueOf(c0377c25.b(dName))), new A(20));
                    }
                } else if (obj instanceof SslCertificate) {
                    oVar.getClass();
                    SslCertificate sslCertificate = (SslCertificate) obj;
                    C0377c c0377c26 = (C0377c) oVar.f1179c;
                    if (!c0377c26.d(sslCertificate)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance", oVar.j(), null, 4).f0(G.i.A(Long.valueOf(c0377c26.b(sslCertificate))), new A(19));
                    }
                } else if (obj instanceof Certificate) {
                    oVar.getClass();
                    Certificate certificate = (Certificate) obj;
                    C0377c c0377c27 = (C0377c) oVar.f1179c;
                    if (!c0377c27.d(certificate)) {
                        new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance", oVar.j(), null, 4).f0(G.i.A(Long.valueOf(c0377c27.b(certificate))), new A(1));
                    }
                }
            }
            if (((C0377c) oVar.f1179c).d(obj)) {
                stream.write(RecognitionOptions.ITF);
                C0377c c0377c28 = (C0377c) oVar.f1179c;
                c0377c28.f();
                Long l8 = (Long) c0377c28.f6458b.get(obj);
                if (l8 != null) {
                    c0377c28.f6460d.put(l8, obj);
                }
                k(stream, l8);
                return;
            }
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass().getName() + "'");
        }
        super.k(stream, obj);
    }
}
