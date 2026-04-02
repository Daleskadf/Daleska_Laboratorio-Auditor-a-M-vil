package P6;

import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.apache.tika.pipes.PipesConfigBase;
/* loaded from: classes.dex */
public final class e extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PrintAttributes.MediaSize f4074a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PrintAttributes.Margins f4075b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ WebView f4076c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f4077d;

    public e(f fVar, PrintAttributes.MediaSize mediaSize, PrintAttributes.Margins margins, WebView webView) {
        this.f4077d = fVar;
        this.f4074a = mediaSize;
        this.f4075b = margins;
        this.f4076c = webView;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        PrintAttributes build = new PrintAttributes.Builder().setMediaSize(this.f4074a).setResolution(new PrintAttributes.Resolution("pdf", "pdf", PipesConfigBase.DEFAULT_STALE_FETCHER_TIMEOUT_SECONDS, PipesConfigBase.DEFAULT_STALE_FETCHER_TIMEOUT_SECONDS)).setMinMargins(this.f4075b).build();
        PrintDocumentAdapter createPrintDocumentAdapter = this.f4076c.createPrintDocumentAdapter("printing");
        f fVar = this.f4077d;
        createPrintDocumentAdapter.onLayout(null, build, null, new b.b(fVar.f4079a, new A.c(this, 13), createPrintDocumentAdapter), null);
    }
}
