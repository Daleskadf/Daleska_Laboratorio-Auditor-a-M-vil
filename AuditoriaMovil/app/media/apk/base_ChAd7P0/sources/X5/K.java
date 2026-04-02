package X5;

import D.AbstractC0059i;
import java.util.List;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final /* synthetic */ class K implements L5.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6420a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ E6.l f6421b;

    public /* synthetic */ K(E6.l lVar, int i7) {
        this.f6420a = i7;
        this.f6421b = lVar;
    }

    @Override // L5.c
    public final void h(Object obj) {
        switch (this.f6420a) {
            case 0:
                boolean z7 = obj instanceof List;
                w6.l lVar = (w6.l) this.f6421b.f1089b;
                if (z7) {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj2 = list.get(0);
                        kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        lVar.invoke(new S(org.slf4j.helpers.i.j(new C0375a((String) obj2, (String) obj3, (String) list.get(2)))));
                        return;
                    }
                    lVar.invoke(new S((String) list.get(0)));
                    return;
                }
                lVar.invoke(new S(AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt'.", StringUtils.EMPTY)));
                return;
            case 1:
                boolean z8 = obj instanceof List;
                w6.l lVar2 = (w6.l) this.f6421b.f1089b;
                if (z8) {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        Object obj4 = list2.get(0);
                        kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        lVar2.invoke(new S(org.slf4j.helpers.i.j(new C0375a((String) obj4, (String) obj5, (String) list2.get(2)))));
                        return;
                    }
                    lVar2.invoke(new S(l6.j.f13876a));
                    return;
                }
                lVar2.invoke(new S(AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert'.", StringUtils.EMPTY)));
                return;
            case 2:
                boolean z9 = obj instanceof List;
                w6.l lVar3 = (w6.l) this.f6421b.f1089b;
                if (z9) {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj6 = list3.get(0);
                        kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        lVar3.invoke(new S(org.slf4j.helpers.i.j(new C0375a((String) obj6, (String) obj7, (String) list3.get(2)))));
                        return;
                    } else if (list3.get(0) == null) {
                        lVar3.invoke(new S(AbstractC0059i.E("null-error", "Flutter api returned null value for non-null return value.", StringUtils.EMPTY)));
                        return;
                    } else {
                        Object obj8 = list3.get(0);
                        kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        lVar3.invoke(new S((List) obj8));
                        return;
                    }
                }
                lVar3.invoke(new S(AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser'.", StringUtils.EMPTY)));
                return;
            default:
                boolean z10 = obj instanceof List;
                w6.l lVar4 = (w6.l) this.f6421b.f1089b;
                if (z10) {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        Object obj9 = list4.get(0);
                        kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        Object obj10 = list4.get(1);
                        kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        lVar4.invoke(new S(org.slf4j.helpers.i.j(new C0375a((String) obj9, (String) obj10, (String) list4.get(2)))));
                        return;
                    } else if (list4.get(0) == null) {
                        lVar4.invoke(new S(AbstractC0059i.E("null-error", "Flutter api returned null value for non-null return value.", StringUtils.EMPTY)));
                        return;
                    } else {
                        Object obj11 = list4.get(0);
                        kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                        lVar4.invoke(new S((Boolean) obj11));
                        return;
                    }
                }
                lVar4.invoke(new S(AbstractC0059i.E("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm'.", StringUtils.EMPTY)));
                return;
        }
    }
}
