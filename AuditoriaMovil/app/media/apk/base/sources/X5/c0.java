package X5;

import android.util.SparseArray;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.protobuf.AbstractC0852m;
import p4.C1683m;
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6466a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6467b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f6468c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f6469d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f6470e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c0(WebViewClient webViewClient, WebView webView, int i7, String str, String str2, int i8) {
        this.f6466a = i8;
        this.f = webViewClient;
        this.f6467b = webView;
        this.f6468c = i7;
        this.f6469d = str;
        this.f6470e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6466a) {
            case 0:
                long j = this.f6468c;
                C0391q c0391q = new C0391q(2);
                g0 g0Var = (g0) this.f;
                g0Var.f6492b.h(g0Var, (WebView) this.f6467b, j, (String) this.f6469d, (String) this.f6470e, c0391q);
                return;
            case 1:
                long j8 = this.f6468c;
                C0391q c0391q2 = new C0391q(3);
                i0 i0Var = (i0) this.f;
                i0Var.f6501a.h(i0Var, (WebView) this.f6467b, j8, (String) this.f6469d, (String) this.f6470e, c0391q2);
                return;
            default:
                C1683m c1683m = (C1683m) this.f;
                m4.i iVar = (m4.i) this.f6467b;
                q4.q qVar = iVar.f14048c;
                p4.Y y2 = (p4.Y) this.f6469d;
                if (qVar.compareTo(y2.f15239e) > 0) {
                    p4.Y a7 = y2.a(AbstractC0852m.f10085b, qVar);
                    SparseArray sparseArray = c1683m.f15274k;
                    int i7 = this.f6468c;
                    sparseArray.append(i7, a7);
                    p4.X x7 = c1683m.f15273i;
                    x7.j(a7);
                    x7.e(i7);
                    x7.a((e4.e) this.f6470e, i7);
                }
                c1683m.j.d(iVar);
                return;
        }
    }

    public /* synthetic */ c0(C1683m c1683m, m4.i iVar, p4.Y y2, int i7, e4.e eVar) {
        this.f6466a = 2;
        this.f = c1683m;
        this.f6467b = iVar;
        this.f6469d = y2;
        this.f6468c = i7;
        this.f6470e = eVar;
    }
}
