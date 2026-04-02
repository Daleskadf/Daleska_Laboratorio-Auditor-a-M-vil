package X5;

import D.AbstractC0055e;
import a.AbstractC0412a;
import android.content.Context;
import android.os.Build;
import android.webkit.WebViewClient;
import f5.C0993a;
import h3.AbstractC1079a;
import j6.C1372c;
import java.util.List;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public class j0 implements H5.b, I5.a {

    /* renamed from: a  reason: collision with root package name */
    public H5.a f6503a;

    /* renamed from: b  reason: collision with root package name */
    public F3.o f6504b;

    @Override // I5.a
    public final void onAttachedToActivity(I5.b bVar) {
        F3.o oVar = this.f6504b;
        if (oVar != null) {
            oVar.f1181e = ((C5.d) bVar).f571a;
        }
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
        this.f6503a = aVar;
        L5.f fVar = aVar.f2030b;
        Context context = aVar.f2029a;
        F3.o oVar = new F3.o(fVar, context, new C0395v(context.getAssets(), aVar.f2033e));
        this.f6504b = oVar;
        aVar.f2032d.i("plugins.flutter.io/webview", new V5.b((C0377c) oVar.f1179c));
        F3.o oVar2 = this.f6504b;
        oVar2.getClass();
        l6.g gVar = C0380f.f6483b;
        L5.f fVar2 = (L5.f) oVar2.f1178b;
        AbstractC1740d.v(fVar2, (C0377c) oVar2.f1179c);
        H4.W.I(fVar2, new C0388n(oVar2, 0));
        AbstractC1740d.w(fVar2, new C0392s(oVar2, 3));
        org.slf4j.helpers.i.L(fVar2, new C0396w(oVar2, 2));
        new E.e(fVar2, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", oVar2.j(), null, 4).h0(new E(new C0388n(oVar2, 1), 1));
        final C0388n c0388n = new C0388n(oVar2, 3);
        L5.n j = oVar2.j();
        new E.e(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", j, null, 4).h0(new L5.b() { // from class: X5.Q
            @Override // L5.b
            public final void j(Object obj, A.f fVar3) {
                List E4;
                Object g0Var;
                List E7;
                switch (r2) {
                    case 0:
                        C0388n c0388n2 = c0388n;
                        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        boolean z7 = false;
                        Object obj2 = ((List) obj).get(0);
                        kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                        long longValue = ((Long) obj2).longValue();
                        try {
                            C0377c c0377c = (C0377c) c0388n2.f6519a.f1179c;
                            if (Build.VERSION.SDK_INT >= 24) {
                                z7 = true;
                            }
                            if (z7) {
                                g0Var = new i0(c0388n2);
                            } else {
                                g0Var = new g0(c0388n2);
                            }
                            c0377c.a(g0Var, longValue);
                            E4 = G.i.A(null);
                        } catch (Throwable th) {
                            E4 = AbstractC0055e.E(th);
                        }
                        fVar3.h(E4);
                        return;
                    default:
                        C0388n c0388n3 = c0388n;
                        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        boolean z8 = false;
                        Object obj3 = list.get(0);
                        kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebViewClient");
                        WebViewClient webViewClient = (WebViewClient) obj3;
                        Object obj4 = list.get(1);
                        kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((Boolean) obj4).booleanValue();
                        try {
                            if (webViewClient instanceof g0) {
                                ((g0) webViewClient).f6493c = booleanValue;
                            } else {
                                c0388n3.f6519a.getClass();
                                if (Build.VERSION.SDK_INT >= 24) {
                                    z8 = true;
                                }
                                if (z8 && (webViewClient instanceof i0)) {
                                    ((i0) webViewClient).f6502b = booleanValue;
                                } else {
                                    throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
                                }
                            }
                            E7 = G.i.A(null);
                        } catch (Throwable th2) {
                            E7 = AbstractC0055e.E(th2);
                        }
                        fVar3.h(E7);
                        return;
                }
            }
        });
        new E.e(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", j, null, 4).h0(new L5.b() { // from class: X5.Q
            @Override // L5.b
            public final void j(Object obj, A.f fVar3) {
                List E4;
                Object g0Var;
                List E7;
                switch (r2) {
                    case 0:
                        C0388n c0388n2 = c0388n;
                        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        boolean z7 = false;
                        Object obj2 = ((List) obj).get(0);
                        kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                        long longValue = ((Long) obj2).longValue();
                        try {
                            C0377c c0377c = (C0377c) c0388n2.f6519a.f1179c;
                            if (Build.VERSION.SDK_INT >= 24) {
                                z7 = true;
                            }
                            if (z7) {
                                g0Var = new i0(c0388n2);
                            } else {
                                g0Var = new g0(c0388n2);
                            }
                            c0377c.a(g0Var, longValue);
                            E4 = G.i.A(null);
                        } catch (Throwable th) {
                            E4 = AbstractC0055e.E(th);
                        }
                        fVar3.h(E4);
                        return;
                    default:
                        C0388n c0388n3 = c0388n;
                        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        boolean z8 = false;
                        Object obj3 = list.get(0);
                        kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebViewClient");
                        WebViewClient webViewClient = (WebViewClient) obj3;
                        Object obj4 = list.get(1);
                        kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((Boolean) obj4).booleanValue();
                        try {
                            if (webViewClient instanceof g0) {
                                ((g0) webViewClient).f6493c = booleanValue;
                            } else {
                                c0388n3.f6519a.getClass();
                                if (Build.VERSION.SDK_INT >= 24) {
                                    z8 = true;
                                }
                                if (z8 && (webViewClient instanceof i0)) {
                                    ((i0) webViewClient).f6502b = booleanValue;
                                } else {
                                    throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
                                }
                            }
                            E7 = G.i.A(null);
                        } catch (Throwable th2) {
                            E7 = AbstractC0055e.E(th2);
                        }
                        fVar3.h(E7);
                        return;
                }
            }
        });
        new E.e(fVar2, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", oVar2.j(), null, 4).h0(new E(new C0392s(oVar2, 0), 0));
        m5.d.n(fVar2, new C0392s(oVar2, 2));
        AbstractC0412a.V(fVar2, new C0396w(oVar2, 0));
        C0383i c0383i = new C0383i(oVar2, 3);
        L5.n j8 = oVar2.j();
        new E.e(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", j8, null, 4).h0(new E(c0383i, 3));
        new E.e(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", j8, null, 4).h0(new L(c0383i, 10));
        C1372c c1372c = new C1372c(12);
        L5.n j9 = oVar2.j();
        new E.e(fVar2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", j9, null, 4).h0(new A(c1372c, 16));
        new E.e(fVar2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", j9, null, 4).h0(new A(c1372c, 17));
        new E.e(fVar2, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", oVar2.j(), null, 4).h0(new A(new com.google.firebase.firestore.Z(12), 7));
        j3.f.R(fVar2, new C0388n(oVar2, 2));
        new E.e(fVar2, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", oVar2.j(), null, 4).h0(new A(new e5.b(12), 12));
        android.support.v4.media.session.a.x(fVar2, new C0383i(oVar2, 1));
        new E.e(fVar2, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", oVar2.j(), null, 4).h0(new A(new C0993a(12), 0));
        G.i.F(fVar2, new C0383i(oVar2, 0));
        t2.i iVar = new t2.i(12);
        L5.n j10 = oVar2.j();
        new E.e(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", j10, null, 4).h0(new A(iVar, 24));
        new E.e(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", j10, null, 4).h0(new A(iVar, 25));
        C0383i c0383i2 = new C0383i(oVar2, 2);
        L5.n j11 = oVar2.j();
        new E.e(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", j11, null, 4).h0(new A(c0383i2, 22));
        new E.e(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", j11, null, 4).h0(new E(c0383i2, 2));
        AbstractC1079a.x(fVar2, new C0392s(oVar2, 1));
        f7.a.n0(fVar2, new C0396w(oVar2, 1));
        new E.e(fVar2, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", oVar2.j(), null, 4).h0(new A(new Object(), 2));
    }

    @Override // I5.a
    public final void onDetachedFromActivity() {
        this.f6504b.f1181e = this.f6503a.f2029a;
    }

    @Override // I5.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f6504b.f1181e = this.f6503a.f2029a;
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
        F3.o oVar = this.f6504b;
        if (oVar != null) {
            l6.g gVar = C0380f.f6483b;
            L5.f fVar = (L5.f) oVar.f1178b;
            AbstractC1740d.v(fVar, null);
            H4.W.I(fVar, null);
            AbstractC1740d.w(fVar, null);
            org.slf4j.helpers.i.L(fVar, null);
            new E.e(fVar, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", new Object(), null, 4).h0(null);
            Object obj = new Object();
            new E.e(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", obj, null, 4).h0(null);
            new E.e(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", obj, null, 4).h0(null);
            new E.e(fVar, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", new Object(), null, 4).h0(null);
            m5.d.n(fVar, null);
            AbstractC0412a.V(fVar, null);
            Object obj2 = new Object();
            new E.e(fVar, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", obj2, null, 4).h0(null);
            new E.e(fVar, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", obj2, null, 4).h0(null);
            Object obj3 = new Object();
            new E.e(fVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", obj3, null, 4).h0(null);
            new E.e(fVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", obj3, null, 4).h0(null);
            new E.e(fVar, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", new Object(), null, 4).h0(null);
            j3.f.R(fVar, null);
            new E.e(fVar, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", new Object(), null, 4).h0(null);
            android.support.v4.media.session.a.x(fVar, null);
            new E.e(fVar, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", new Object(), null, 4).h0(null);
            G.i.F(fVar, null);
            Object obj4 = new Object();
            new E.e(fVar, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", obj4, null, 4).h0(null);
            new E.e(fVar, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", obj4, null, 4).h0(null);
            Object obj5 = new Object();
            new E.e(fVar, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", obj5, null, 4).h0(null);
            new E.e(fVar, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", obj5, null, 4).h0(null);
            AbstractC1079a.x(fVar, null);
            f7.a.n0(fVar, null);
            new E.e(fVar, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", new Object(), null, 4).h0(null);
            C0377c c0377c = (C0377c) this.f6504b.f1179c;
            c0377c.f6462g.removeCallbacks(c0377c.f6463h);
            c0377c.j = true;
            this.f6504b = null;
        }
    }

    @Override // I5.a
    public final void onReattachedToActivityForConfigChanges(I5.b bVar) {
        this.f6504b.f1181e = ((C5.d) bVar).f571a;
    }
}
