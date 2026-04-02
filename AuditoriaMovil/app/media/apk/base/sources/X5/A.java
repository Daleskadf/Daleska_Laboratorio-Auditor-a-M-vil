package X5;

import D.AbstractC0055e;
import D.AbstractC0059i;
import H4.e1;
import H4.p1;
import android.net.http.SslError;
import android.os.Message;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
/* loaded from: classes.dex */
public final /* synthetic */ class A implements L5.b, L5.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6401a;

    public /* synthetic */ A(int i7) {
        this.f6401a = i7;
    }

    @Override // L5.c
    public void h(Object obj) {
        switch (this.f6401a) {
            case 1:
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj2 = list.get(0);
                        kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj2, (String) obj3, (String) list.get(2)));
                        return;
                    }
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 2:
            case 7:
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case RecognitionOptions.DATA_MATRIX /* 16 */:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                if (obj instanceof List) {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        Object obj4 = list2.get(0);
                        kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i7 = b0.f6451h;
                        return;
                    }
                    int i8 = b0.f6451h;
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest'.", StringUtils.EMPTY);
                int i9 = b0.f6451h;
                return;
            case 3:
                if (obj instanceof List) {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj6 = list3.get(0);
                        kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj6, (String) obj7, (String) list3.get(2)));
                        return;
                    }
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 4:
                if (obj instanceof List) {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        Object obj8 = list4.get(0);
                        kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj8, (String) obj9, (String) list4.get(2)));
                        return;
                    }
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 5:
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
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 6:
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
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 8:
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
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart'.", StringUtils.EMPTY);
                return;
            case 9:
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
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 10:
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
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 11:
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
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 13:
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
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 14:
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
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage'.", StringUtils.EMPTY);
                return;
            case 15:
                if (obj instanceof List) {
                    List list13 = (List) obj;
                    if (list13.size() > 1) {
                        Object obj26 = list13.get(0);
                        kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj26, (String) obj27, (String) list13.get(2)));
                        return;
                    }
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
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
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 19:
                if (obj instanceof List) {
                    List list15 = (List) obj;
                    if (list15.size() > 1) {
                        Object obj30 = list15.get(0);
                        kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list15.get(1);
                        kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj30, (String) obj31, (String) list15.get(2)));
                        return;
                    }
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                if (obj instanceof List) {
                    List list16 = (List) obj;
                    if (list16.size() > 1) {
                        Object obj32 = list16.get(0);
                        kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                        Object obj33 = list16.get(1);
                        kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj32, (String) obj33, (String) list16.get(2)));
                        return;
                    }
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 21:
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
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 23:
                if (obj instanceof List) {
                    List list18 = (List) obj;
                    if (list18.size() > 1) {
                        Object obj36 = list18.get(0);
                        kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                        Object obj37 = list18.get(1);
                        kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj36, (String) obj37, (String) list18.get(2)));
                        return;
                    }
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 26:
                if (obj instanceof List) {
                    List list19 = (List) obj;
                    if (list19.size() > 1) {
                        Object obj38 = list19.get(0);
                        kotlin.jvm.internal.j.c(obj38, "null cannot be cast to non-null type kotlin.String");
                        Object obj39 = list19.get(1);
                        kotlin.jvm.internal.j.c(obj39, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj38, (String) obj39, (String) list19.get(2)));
                        return;
                    }
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance'.", StringUtils.EMPTY);
                return;
            case 27:
                if (obj instanceof List) {
                    List list20 = (List) obj;
                    if (list20.size() > 1) {
                        Object obj40 = list20.get(0);
                        kotlin.jvm.internal.j.c(obj40, "null cannot be cast to non-null type kotlin.String");
                        Object obj41 = list20.get(1);
                        kotlin.jvm.internal.j.c(obj41, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj40, (String) obj41, (String) list20.get(2)));
                        int i10 = b0.f6451h;
                        return;
                    }
                    int i11 = b0.f6451h;
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView'.", StringUtils.EMPTY);
                int i12 = b0.f6451h;
                return;
            case 28:
                if (obj instanceof List) {
                    List list21 = (List) obj;
                    if (list21.size() > 1) {
                        Object obj42 = list21.get(0);
                        kotlin.jvm.internal.j.c(obj42, "null cannot be cast to non-null type kotlin.String");
                        Object obj43 = list21.get(1);
                        kotlin.jvm.internal.j.c(obj43, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj42, (String) obj43, (String) list21.get(2)));
                        int i13 = b0.f6451h;
                        return;
                    }
                    int i14 = b0.f6451h;
                    return;
                }
                AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged'.", StringUtils.EMPTY);
                int i15 = b0.f6451h;
                return;
        }
    }

    @Override // L5.b
    public void j(Object obj, A.f fVar) {
        List E4;
        List E7;
        List E8;
        List E9;
        List E10;
        List E11;
        List E12;
        V v6;
        List E13;
        List E14;
        switch (this.f6401a) {
            case 0:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.os.Message");
                try {
                    ((Message) obj2).sendToTarget();
                    E4 = G.i.A(null);
                } catch (Throwable th) {
                    E4 = AbstractC0055e.E(th);
                }
                fVar.h(E4);
                return;
            case 2:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type java.security.cert.Certificate");
                try {
                    try {
                        E7 = G.i.A(((Certificate) obj3).getEncoded());
                    } catch (CertificateEncodingException e7) {
                        throw new RuntimeException(e7);
                    }
                } catch (Throwable th2) {
                    E7 = AbstractC0055e.E(th2);
                }
                fVar.h(E7);
                return;
            case 7:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebChromeClient.CustomViewCallback");
                try {
                    ((WebChromeClient.CustomViewCallback) obj4).onCustomViewHidden();
                    E8 = G.i.A(null);
                } catch (Throwable th3) {
                    E8 = AbstractC0055e.E(th3);
                }
                fVar.h(E8);
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj5 = list.get(0);
                kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.GeolocationPermissions.Callback");
                GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj5;
                Object obj6 = list.get(1);
                kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj6;
                Object obj7 = list.get(2);
                kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((Boolean) obj7).booleanValue();
                Object obj8 = list.get(3);
                kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    callback.invoke(str, booleanValue, ((Boolean) obj8).booleanValue());
                    E9 = G.i.A(null);
                } catch (Throwable th4) {
                    E9 = AbstractC0055e.E(th4);
                }
                fVar.h(E9);
                return;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj9 = list2.get(0);
                kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                PermissionRequest permissionRequest = (PermissionRequest) obj9;
                Object obj10 = list2.get(1);
                kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                try {
                    permissionRequest.grant((String[]) ((List) obj10).toArray(new String[0]));
                    E10 = G.i.A(null);
                } catch (Throwable th5) {
                    E10 = AbstractC0055e.E(th5);
                }
                fVar.h(E10);
                return;
            case 17:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj11 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                try {
                    ((PermissionRequest) obj11).deny();
                    E11 = G.i.A(null);
                } catch (Throwable th6) {
                    E11 = AbstractC0055e.E(th6);
                }
                fVar.h(E11);
                return;
            case 22:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj12 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.net.http.SslError");
                try {
                    int primaryError = ((SslError) obj12).getPrimaryError();
                    if (primaryError != 0) {
                        if (primaryError != 1) {
                            if (primaryError != 2) {
                                if (primaryError != 3) {
                                    if (primaryError != 4) {
                                        if (primaryError != 5) {
                                            v6 = V.UNKNOWN;
                                        } else {
                                            v6 = V.INVALID;
                                        }
                                    } else {
                                        v6 = V.DATE_INVALID;
                                    }
                                } else {
                                    v6 = V.UNTRUSTED;
                                }
                            } else {
                                v6 = V.ID_MISMATCH;
                            }
                        } else {
                            v6 = V.EXPIRED;
                        }
                    } else {
                        v6 = V.NOT_YET_VALID;
                    }
                    E12 = G.i.A(v6);
                } catch (Throwable th7) {
                    E12 = AbstractC0055e.E(th7);
                }
                fVar.h(E12);
                return;
            case 24:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj13 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj13).cancel();
                    E13 = G.i.A(null);
                } catch (Throwable th8) {
                    E13 = AbstractC0055e.E(th8);
                }
                fVar.h(E13);
                return;
            default:
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj14 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj14).proceed();
                    E14 = G.i.A(null);
                } catch (Throwable th9) {
                    E14 = AbstractC0055e.E(th9);
                }
                fVar.h(E14);
                return;
        }
    }

    public /* synthetic */ A(Object obj, int i7) {
        this.f6401a = i7;
    }
}
