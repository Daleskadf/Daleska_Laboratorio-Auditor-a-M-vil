package X5;

import android.webkit.DownloadListener;
import m6.AbstractC1448i;
/* loaded from: classes.dex */
public final class r implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    public final C0392s f6529a;

    public r(C0392s c0392s) {
        this.f6529a = c0392s;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(final String str, final String str2, final String str3, final String str4, final long j) {
        C0392s c0392s = this.f6529a;
        c0392s.f6530a.s(new Runnable() { // from class: X5.p
            @Override // java.lang.Runnable
            public final void run() {
                C0391q c0391q = new C0391q(0);
                r rVar = r.this;
                C0392s c0392s2 = rVar.f6529a;
                String urlArg = str;
                kotlin.jvm.internal.j.e(urlArg, "urlArg");
                String userAgentArg = str2;
                kotlin.jvm.internal.j.e(userAgentArg, "userAgentArg");
                String contentDispositionArg = str3;
                kotlin.jvm.internal.j.e(contentDispositionArg, "contentDispositionArg");
                String mimetypeArg = str4;
                kotlin.jvm.internal.j.e(mimetypeArg, "mimetypeArg");
                F3.o oVar = c0392s2.f6530a;
                oVar.getClass();
                new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart", oVar.j(), null, 4).f0(AbstractC1448i.L(rVar, urlArg, userAgentArg, contentDispositionArg, mimetypeArg, Long.valueOf(j)), new A(c0391q, 8));
            }
        });
    }
}
