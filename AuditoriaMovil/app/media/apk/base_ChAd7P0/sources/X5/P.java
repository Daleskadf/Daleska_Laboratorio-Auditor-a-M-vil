package X5;

import D.AbstractC0059i;
import H4.e1;
import java.util.List;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final /* synthetic */ class P implements L5.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6429a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w6.l f6430b;

    public /* synthetic */ P(int i7, w6.l lVar) {
        this.f6429a = i7;
        this.f6430b = lVar;
    }

    @Override // L5.c
    public final void h(Object obj) {
        l6.e E4;
        l6.e E7;
        l6.e E8;
        l6.e E9;
        l6.e E10;
        l6.e E11;
        l6.e E12;
        l6.e E13;
        l6.e E14;
        l6.e E15;
        l6.e E16;
        l6.e E17;
        l6.e E18;
        l6.e E19;
        l6.e E20;
        switch (this.f6429a) {
            case 0:
                w6.l lVar = this.f6430b;
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj2 = list.get(0);
                        kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        E4 = org.slf4j.helpers.i.j(new C0375a((String) obj2, (String) obj3, (String) list.get(2)));
                    } else {
                        lVar.invoke(new l6.f(l6.j.f13876a));
                        return;
                    }
                } else {
                    E4 = AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged'.", StringUtils.EMPTY);
                }
                AbstractC0059i.L(E4, lVar);
                return;
            case 1:
                w6.l lVar2 = this.f6430b;
                if (obj instanceof List) {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        Object obj4 = list2.get(0);
                        kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        E7 = org.slf4j.helpers.i.j(new C0375a((String) obj4, (String) obj5, (String) list2.get(2)));
                    } else {
                        lVar2.invoke(new l6.f(l6.j.f13876a));
                        return;
                    }
                } else {
                    E7 = AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading'.", StringUtils.EMPTY);
                }
                AbstractC0059i.L(E7, lVar2);
                return;
            case 2:
                w6.l lVar3 = this.f6430b;
                if (obj instanceof List) {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj6 = list3.get(0);
                        kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        E8 = org.slf4j.helpers.i.j(new C0375a((String) obj6, (String) obj7, (String) list3.get(2)));
                    } else {
                        lVar3.invoke(new l6.f(l6.j.f13876a));
                        return;
                    }
                } else {
                    E8 = AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory'.", StringUtils.EMPTY);
                }
                AbstractC0059i.L(E8, lVar3);
                return;
            case 3:
                w6.l lVar4 = this.f6430b;
                if (obj instanceof List) {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        Object obj8 = list4.get(0);
                        kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        E9 = org.slf4j.helpers.i.j(new C0375a((String) obj8, (String) obj9, (String) list4.get(2)));
                    } else {
                        lVar4.invoke(new l6.f(l6.j.f13876a));
                        return;
                    }
                } else {
                    E9 = AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError'.", StringUtils.EMPTY);
                }
                AbstractC0059i.L(E9, lVar4);
                return;
            case 4:
                w6.l lVar5 = this.f6430b;
                if (obj instanceof List) {
                    List list5 = (List) obj;
                    if (list5.size() > 1) {
                        Object obj10 = list5.get(0);
                        kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        E10 = org.slf4j.helpers.i.j(new C0375a((String) obj10, (String) obj11, (String) list5.get(2)));
                    } else {
                        lVar5.invoke(new l6.f(l6.j.f13876a));
                        return;
                    }
                } else {
                    E10 = AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource'.", StringUtils.EMPTY);
                }
                AbstractC0059i.L(E10, lVar5);
                return;
            case 5:
                w6.l lVar6 = this.f6430b;
                if (obj instanceof List) {
                    List list6 = (List) obj;
                    if (list6.size() > 1) {
                        Object obj12 = list6.get(0);
                        kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        E11 = org.slf4j.helpers.i.j(new C0375a((String) obj12, (String) obj13, (String) list6.get(2)));
                    } else {
                        lVar6.invoke(new l6.f(l6.j.f13876a));
                        return;
                    }
                } else {
                    E11 = AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest'.", StringUtils.EMPTY);
                }
                AbstractC0059i.L(E11, lVar6);
                return;
            case 6:
                w6.l lVar7 = this.f6430b;
                if (obj instanceof List) {
                    List list7 = (List) obj;
                    if (list7.size() > 1) {
                        Object obj14 = list7.get(0);
                        kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        E12 = org.slf4j.helpers.i.j(new C0375a((String) obj14, (String) obj15, (String) list7.get(2)));
                    } else {
                        lVar7.invoke(new l6.f(l6.j.f13876a));
                        return;
                    }
                } else {
                    E12 = AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted'.", StringUtils.EMPTY);
                }
                AbstractC0059i.L(E12, lVar7);
                return;
            case 7:
                w6.l lVar8 = this.f6430b;
                if (obj instanceof List) {
                    List list8 = (List) obj;
                    if (list8.size() > 1) {
                        Object obj16 = list8.get(0);
                        kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        E13 = org.slf4j.helpers.i.j(new C0375a((String) obj16, (String) obj17, (String) list8.get(2)));
                    } else {
                        lVar8.invoke(new l6.f(l6.j.f13876a));
                        return;
                    }
                } else {
                    E13 = AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest'.", StringUtils.EMPTY);
                }
                AbstractC0059i.L(E13, lVar8);
                return;
            case 8:
                w6.l lVar9 = this.f6430b;
                if (obj instanceof List) {
                    List list9 = (List) obj;
                    if (list9.size() > 1) {
                        Object obj18 = list9.get(0);
                        kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        E14 = org.slf4j.helpers.i.j(new C0375a((String) obj18, (String) obj19, (String) list9.get(2)));
                    } else {
                        lVar9.invoke(new l6.f(l6.j.f13876a));
                        return;
                    }
                } else {
                    E14 = AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading'.", StringUtils.EMPTY);
                }
                AbstractC0059i.L(E14, lVar9);
                return;
            case 9:
                w6.l lVar10 = this.f6430b;
                if (obj instanceof List) {
                    List list10 = (List) obj;
                    if (list10.size() > 1) {
                        Object obj20 = list10.get(0);
                        kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        E15 = org.slf4j.helpers.i.j(new C0375a((String) obj20, (String) obj21, (String) list10.get(2)));
                    } else {
                        lVar10.invoke(new l6.f(l6.j.f13876a));
                        return;
                    }
                } else {
                    E15 = AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible'.", StringUtils.EMPTY);
                }
                AbstractC0059i.L(E15, lVar10);
                return;
            case 10:
                w6.l lVar11 = this.f6430b;
                if (obj instanceof List) {
                    List list11 = (List) obj;
                    if (list11.size() > 1) {
                        Object obj22 = list11.get(0);
                        kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        Object obj23 = list11.get(1);
                        kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        E16 = org.slf4j.helpers.i.j(new C0375a((String) obj22, (String) obj23, (String) list11.get(2)));
                    } else {
                        lVar11.invoke(new l6.f(l6.j.f13876a));
                        return;
                    }
                } else {
                    E16 = AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished'.", StringUtils.EMPTY);
                }
                AbstractC0059i.L(E16, lVar11);
                return;
            case 11:
                w6.l lVar12 = this.f6430b;
                if (obj instanceof List) {
                    List list12 = (List) obj;
                    if (list12.size() > 1) {
                        Object obj24 = list12.get(0);
                        kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list12.get(1);
                        kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        E17 = org.slf4j.helpers.i.j(new C0375a((String) obj24, (String) obj25, (String) list12.get(2)));
                    } else {
                        lVar12.invoke(new l6.f(l6.j.f13876a));
                        return;
                    }
                } else {
                    E17 = AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedError'.", StringUtils.EMPTY);
                }
                AbstractC0059i.L(E17, lVar12);
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                w6.l lVar13 = this.f6430b;
                if (obj instanceof List) {
                    List list13 = (List) obj;
                    if (list13.size() > 1) {
                        Object obj26 = list13.get(0);
                        kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        E18 = org.slf4j.helpers.i.j(new C0375a((String) obj26, (String) obj27, (String) list13.get(2)));
                    } else {
                        lVar13.invoke(new l6.f(l6.j.f13876a));
                        return;
                    }
                } else {
                    E18 = AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest'.", StringUtils.EMPTY);
                }
                AbstractC0059i.L(E18, lVar13);
                return;
            case 13:
                w6.l lVar14 = this.f6430b;
                if (obj instanceof List) {
                    List list14 = (List) obj;
                    if (list14.size() > 1) {
                        Object obj28 = list14.get(0);
                        kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        E19 = org.slf4j.helpers.i.j(new C0375a((String) obj28, (String) obj29, (String) list14.get(2)));
                    } else {
                        lVar14.invoke(new l6.f(l6.j.f13876a));
                        return;
                    }
                } else {
                    E19 = AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission'.", StringUtils.EMPTY);
                }
                AbstractC0059i.L(E19, lVar14);
                return;
            default:
                w6.l lVar15 = this.f6430b;
                if (obj instanceof List) {
                    List list15 = (List) obj;
                    if (list15.size() > 1) {
                        Object obj30 = list15.get(0);
                        kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list15.get(1);
                        kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        E20 = org.slf4j.helpers.i.j(new C0375a((String) obj30, (String) obj31, (String) list15.get(2)));
                    } else {
                        lVar15.invoke(new l6.f(l6.j.f13876a));
                        return;
                    }
                } else {
                    E20 = AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError'.", StringUtils.EMPTY);
                }
                AbstractC0059i.L(E20, lVar15);
                return;
        }
    }
}
