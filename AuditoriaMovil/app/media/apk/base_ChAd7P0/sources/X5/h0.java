package X5;

import android.webkit.WebView;
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6495a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i0 f6496b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ WebView f6497c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f6498d;

    public /* synthetic */ h0(i0 i0Var, WebView webView, String str, int i7) {
        this.f6495a = i7;
        this.f6496b = i0Var;
        this.f6497c = webView;
        this.f6498d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6495a) {
            case 0:
                C0391q c0391q = new C0391q(3);
                i0 i0Var = this.f6496b;
                i0Var.f6501a.f(i0Var, this.f6497c, this.f6498d, c0391q);
                return;
            case 1:
                C0391q c0391q2 = new C0391q(3);
                i0 i0Var2 = this.f6496b;
                i0Var2.f6501a.o(i0Var2, this.f6497c, this.f6498d, c0391q2);
                return;
            case 2:
                C0391q c0391q3 = new C0391q(3);
                i0 i0Var3 = this.f6496b;
                i0Var3.f6501a.c(i0Var3, this.f6497c, this.f6498d, c0391q3);
                return;
            case 3:
                C0391q c0391q4 = new C0391q(3);
                i0 i0Var4 = this.f6496b;
                i0Var4.f6501a.e(i0Var4, this.f6497c, this.f6498d, c0391q4);
                return;
            default:
                C0391q c0391q5 = new C0391q(3);
                i0 i0Var5 = this.f6496b;
                i0Var5.f6501a.d(i0Var5, this.f6497c, this.f6498d, c0391q5);
                return;
        }
    }
}
