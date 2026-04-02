package X5;

import D.AbstractC0055e;
import D.AbstractC0059i;
import H4.e1;
import a6.t0;
import android.content.Context;
import android.view.View;
import android.webkit.WebStorage;
import c4.InterfaceC0635d;
import c4.InterfaceC0636e;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.firestore.FirestoreRegistrar;
import f1.C0986h;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import w4.InterfaceC1955a;
import w4.InterfaceC1956b;
/* loaded from: classes.dex */
public final /* synthetic */ class L implements L5.c, L5.b, V6.b, Y5.b, z3.i, InterfaceC0636e, InterfaceC1955a, u4.m, InterfaceC0635d, com.google.firebase.storage.B, com.it_nomads.fluttersecurestorage.ciphers.b, com.it_nomads.fluttersecurestorage.ciphers.g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6422a;

    public /* synthetic */ L(int i7) {
        this.f6422a = i7;
    }

    @Override // com.google.firebase.storage.B
    public void a(Object obj, Object obj2) {
        switch (this.f6422a) {
            case 25:
                ((io.flutter.plugins.firebase.storage.q) obj).a((com.google.firebase.storage.u) obj2);
                return;
            default:
                ((io.flutter.plugins.firebase.storage.r) obj).a((com.google.firebase.storage.u) obj2);
                return;
        }
    }

    @Override // z3.i
    public Object apply(Object obj) {
        boolean z7;
        switch (this.f6422a) {
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return A3.K.u(Integer.valueOf(((C0986h) obj).f11016a));
            default:
                com.google.firebase.firestore.L l8 = (com.google.firebase.firestore.L) obj;
                com.google.firebase.firestore.X x7 = l8.f9773e;
                if (x7 != null) {
                    z7 = x7 instanceof com.google.firebase.firestore.b0;
                } else {
                    z7 = l8.f9771c;
                }
                if (z7) {
                    return new n4.y(l8);
                }
                return new n4.y(l8);
        }
    }

    @Override // c4.InterfaceC0636e
    public List b(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // Y5.b
    public boolean c(View view) {
        return view.hasFocus();
    }

    @Override // c4.InterfaceC0635d
    public Object d(M3.q qVar) {
        return FirestoreRegistrar.a(qVar);
    }

    @Override // V6.b
    public Object e(X6.b bVar) {
        return X6.a.f6536a;
    }

    @Override // w4.InterfaceC1955a
    public void f(InterfaceC1956b interfaceC1956b) {
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.b
    public t0 g(Context context) {
        switch (this.f6422a) {
            case 27:
                return new t0(context, 10);
            default:
                return new t0(context, 10);
        }
    }

    @Override // L5.c
    public void h(Object obj) {
        switch (this.f6422a) {
            case 0:
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj2 = list.get(0);
                        kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj2, (String) obj3, (String) list.get(2)));
                        int i7 = b0.f6451h;
                        return;
                    }
                    int i8 = b0.f6451h;
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView'.", StringUtils.EMPTY);
                int i9 = b0.f6451h;
                return;
            case 1:
                if (obj instanceof List) {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        Object obj4 = list2.get(0);
                        kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i10 = b0.f6451h;
                        return;
                    }
                    int i11 = b0.f6451h;
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage'.", StringUtils.EMPTY);
                int i12 = b0.f6451h;
                return;
            case 2:
                if (obj instanceof List) {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj6 = list3.get(0);
                        kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj6, (String) obj7, (String) list3.get(2)));
                        int i13 = b0.f6451h;
                        return;
                    }
                    int i14 = b0.f6451h;
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt'.", StringUtils.EMPTY);
                int i15 = b0.f6451h;
                return;
            case 3:
                if (obj instanceof List) {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        Object obj8 = list4.get(0);
                        kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj8, (String) obj9, (String) list4.get(2)));
                        int i16 = b0.f6451h;
                        return;
                    }
                    int i17 = b0.f6451h;
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt'.", StringUtils.EMPTY);
                int i18 = b0.f6451h;
                return;
            case 4:
                if (obj instanceof List) {
                    List list5 = (List) obj;
                    if (list5.size() > 1) {
                        Object obj10 = list5.get(0);
                        kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj10, (String) obj11, (String) list5.get(2)));
                        return;
                    }
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 5:
                if (obj instanceof List) {
                    List list6 = (List) obj;
                    if (list6.size() > 1) {
                        Object obj12 = list6.get(0);
                        kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj12, (String) obj13, (String) list6.get(2)));
                        return;
                    }
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 6:
                if (obj instanceof List) {
                    List list7 = (List) obj;
                    if (list7.size() > 1) {
                        Object obj14 = list7.get(0);
                        kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj14, (String) obj15, (String) list7.get(2)));
                        return;
                    }
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 7:
                if (obj instanceof List) {
                    List list8 = (List) obj;
                    if (list8.size() > 1) {
                        Object obj16 = list8.get(0);
                        kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj16, (String) obj17, (String) list8.get(2)));
                        return;
                    }
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 8:
                if (obj instanceof List) {
                    List list9 = (List) obj;
                    if (list9.size() > 1) {
                        Object obj18 = list9.get(0);
                        kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj18, (String) obj19, (String) list9.get(2)));
                        return;
                    }
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 9:
                if (obj instanceof List) {
                    List list10 = (List) obj;
                    if (list10.size() > 1) {
                        Object obj20 = list10.get(0);
                        kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj20, (String) obj21, (String) list10.get(2)));
                        return;
                    }
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 10:
            default:
                if (obj instanceof List) {
                    List list11 = (List) obj;
                    if (list11.size() > 1) {
                        Object obj22 = list11.get(0);
                        kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        Object obj23 = list11.get(1);
                        kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj22, (String) obj23, (String) list11.get(2)));
                        return;
                    }
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 11:
                if (obj instanceof List) {
                    List list12 = (List) obj;
                    if (list12.size() > 1) {
                        Object obj24 = list12.get(0);
                        kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list12.get(1);
                        kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj24, (String) obj25, (String) list12.get(2)));
                        return;
                    }
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (obj instanceof List) {
                    List list13 = (List) obj;
                    if (list13.size() > 1) {
                        Object obj26 = list13.get(0);
                        kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj26, (String) obj27, (String) list13.get(2)));
                        int i19 = m0.f6515d;
                        return;
                    }
                    int i20 = m0.f6515d;
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged'.", StringUtils.EMPTY);
                int i21 = m0.f6515d;
                return;
            case 13:
                if (obj instanceof List) {
                    List list14 = (List) obj;
                    if (list14.size() > 1) {
                        Object obj28 = list14.get(0);
                        kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj28, (String) obj29, (String) list14.get(2)));
                        return;
                    }
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 14:
                if (obj instanceof List) {
                    List list15 = (List) obj;
                    if (list15.size() > 1) {
                        Object obj30 = list15.get(0);
                        kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list15.get(1);
                        kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj30, (String) obj31, (String) list15.get(2)));
                        int i22 = g0.f6491d;
                        return;
                    }
                    int i23 = g0.f6491d;
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat'.", StringUtils.EMPTY);
                int i24 = g0.f6491d;
                return;
            case 15:
                if (obj instanceof List) {
                    List list16 = (List) obj;
                    if (list16.size() > 1) {
                        Object obj32 = list16.get(0);
                        kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                        Object obj33 = list16.get(1);
                        kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj32, (String) obj33, (String) list16.get(2)));
                        int i25 = i0.f6500c;
                        return;
                    }
                    int i26 = i0.f6500c;
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError'.", StringUtils.EMPTY);
                int i27 = i0.f6500c;
                return;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                if (obj instanceof List) {
                    List list17 = (List) obj;
                    if (list17.size() > 1) {
                        Object obj34 = list17.get(0);
                        kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type kotlin.String");
                        Object obj35 = list17.get(1);
                        kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj34, (String) obj35, (String) list17.get(2)));
                        return;
                    }
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
        }
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.g
    public R1.j i(t0 t0Var, Context context) {
        return new R1.j(t0Var, context);
    }

    @Override // L5.b
    public void j(Object obj, A.f fVar) {
        List E4;
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        Object obj2 = ((List) obj).get(0);
        kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.webkit.WebStorage");
        try {
            ((WebStorage) obj2).deleteAllData();
            E4 = G.i.A(null);
        } catch (Throwable th) {
            E4 = AbstractC0055e.E(th);
        }
        fVar.h(E4);
    }
}
