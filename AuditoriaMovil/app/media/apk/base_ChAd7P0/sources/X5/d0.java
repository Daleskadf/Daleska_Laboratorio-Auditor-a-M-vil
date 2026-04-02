package X5;

import android.webkit.WebView;
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6473a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g0 f6474b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ WebView f6475c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f6476d;

    public /* synthetic */ d0(g0 g0Var, WebView webView, String str, int i7) {
        this.f6473a = i7;
        this.f6474b = g0Var;
        this.f6475c = webView;
        this.f6476d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6473a) {
            case 0:
                C0391q c0391q = new C0391q(2);
                g0 g0Var = this.f6474b;
                g0Var.f6492b.o(g0Var, this.f6475c, this.f6476d, c0391q);
                return;
            case 1:
                C0391q c0391q2 = new C0391q(2);
                g0 g0Var2 = this.f6474b;
                g0Var2.f6492b.d(g0Var2, this.f6475c, this.f6476d, c0391q2);
                return;
            case 2:
                C0391q c0391q3 = new C0391q(2);
                g0 g0Var3 = this.f6474b;
                g0Var3.f6492b.c(g0Var3, this.f6475c, this.f6476d, c0391q3);
                return;
            case 3:
                C0391q c0391q4 = new C0391q(2);
                g0 g0Var4 = this.f6474b;
                g0Var4.f6492b.e(g0Var4, this.f6475c, this.f6476d, c0391q4);
                return;
            default:
                C0391q c0391q5 = new C0391q(2);
                g0 g0Var5 = this.f6474b;
                g0Var5.f6492b.f(g0Var5, this.f6475c, this.f6476d, c0391q5);
                return;
        }
    }
}
