package com.adobe.air;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes.dex */
public class AdobeAIRWebView {
    public static final String ADOBE_GAME_SHOWCASE = "gaming.adobe.com";
    public static final String ADOBE_HOST = "www.adobe.com";
    public static final String CLOUDFRONT_HOST = "dh8vjmvwgc27o.cloudfront.net";
    public static final String DYNAMIC_URL_CLOUDFRONT = "https://www.adobe.com/airgames/4/";
    public static final String GAMESPACE_HOST = "gamespace.adobe.com";
    public static final String GOOGLE_PLAY_HOST = "play.google.com";
    public static final String STATIC_URL = "file:///android_res/raw/startga.html";
    private Context mCurrentContext;
    private WebView mWebView = null;
    private WebView mAuxWebView = null;
    private WebView mHiddenWebView = null;
    private boolean mOffline = false;
    private boolean mFirstLoad = true;

    public AdobeAIRWebView(Context context) {
        this.mCurrentContext = context;
    }

    public void create() {
        WebViewClient webViewClient = new WebViewClient() { // from class: com.adobe.air.AdobeAIRWebView.1
            /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: Exception -> 0x0094, TryCatch #0 {Exception -> 0x0094, blocks: (B:8:0x000f, B:10:0x0015, B:12:0x0021, B:14:0x002d, B:16:0x0036, B:18:0x0042, B:21:0x004f, B:23:0x005b, B:25:0x0067, B:31:0x0078, B:32:0x008b), top: B:35:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[Catch: Exception -> 0x0094, TRY_LEAVE, TryCatch #0 {Exception -> 0x0094, blocks: (B:8:0x000f, B:10:0x0015, B:12:0x0021, B:14:0x002d, B:16:0x0036, B:18:0x0042, B:21:0x004f, B:23:0x005b, B:25:0x0067, B:31:0x0078, B:32:0x008b), top: B:35:0x000f }] */
            @Override // android.webkit.WebViewClient
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean shouldOverrideUrlLoading(android.webkit.WebView r5, java.lang.String r6) {
                /*
                    r4 = this;
                    r5 = 1
                    if (r6 == 0) goto L94
                    android.net.Uri r0 = android.net.Uri.parse(r6)
                    if (r0 == 0) goto L94
                    java.lang.String r1 = r0.getScheme()
                    if (r1 == 0) goto L94
                    java.lang.String r1 = r0.getHost()     // Catch: java.lang.Exception -> L94
                    if (r1 == 0) goto L75
                    java.lang.String r1 = r0.getScheme()     // Catch: java.lang.Exception -> L94
                    java.lang.String r2 = "http"
                    boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> L94
                    if (r1 != 0) goto L2d
                    java.lang.String r1 = r0.getScheme()     // Catch: java.lang.Exception -> L94
                    java.lang.String r2 = "https"
                    boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> L94
                    if (r1 == 0) goto L75
                L2d:
                    java.lang.String r1 = "https://www.adobe.com/airgames/4/"
                    boolean r1 = r6.equals(r1)     // Catch: java.lang.Exception -> L94
                    r2 = 0
                    if (r1 != 0) goto L74
                    java.lang.String r1 = r0.getHost()     // Catch: java.lang.Exception -> L94
                    java.lang.String r3 = "gamespace.adobe.com"
                    boolean r1 = r1.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> L94
                    if (r1 != 0) goto L74
                    java.lang.String r1 = r0.getHost()     // Catch: java.lang.Exception -> L94
                    java.lang.String r3 = "dh8vjmvwgc27o.cloudfront.net"
                    boolean r1 = r1.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> L94
                    if (r1 == 0) goto L4f
                    goto L74
                L4f:
                    java.lang.String r1 = r0.getHost()     // Catch: java.lang.Exception -> L94
                    java.lang.String r3 = "www.adobe.com"
                    boolean r1 = r1.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> L94
                    if (r1 != 0) goto L75
                    java.lang.String r1 = r0.getHost()     // Catch: java.lang.Exception -> L94
                    java.lang.String r3 = "play.google.com"
                    boolean r1 = r1.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> L94
                    if (r1 != 0) goto L75
                    java.lang.String r1 = r0.getHost()     // Catch: java.lang.Exception -> L94
                    java.lang.String r3 = "gaming.adobe.com"
                    boolean r1 = r1.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> L94
                    if (r1 == 0) goto L76
                    goto L75
                L74:
                    return r2
                L75:
                    r2 = 1
                L76:
                    if (r2 == 0) goto L8b
                    android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Exception -> L94
                    java.lang.String r1 = "android.intent.action.VIEW"
                    r6.<init>(r1, r0)     // Catch: java.lang.Exception -> L94
                    com.adobe.air.AdobeAIRWebView r0 = com.adobe.air.AdobeAIRWebView.this     // Catch: java.lang.Exception -> L94
                    android.content.Context r0 = com.adobe.air.AdobeAIRWebView.access$000(r0)     // Catch: java.lang.Exception -> L94
                    android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Exception -> L94
                    r0.startActivity(r6)     // Catch: java.lang.Exception -> L94
                    goto L94
                L8b:
                    com.adobe.air.AdobeAIRWebView r0 = com.adobe.air.AdobeAIRWebView.this     // Catch: java.lang.Exception -> L94
                    android.webkit.WebView r0 = com.adobe.air.AdobeAIRWebView.access$100(r0)     // Catch: java.lang.Exception -> L94
                    r0.loadUrl(r6)     // Catch: java.lang.Exception -> L94
                L94:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.AdobeAIRWebView.AnonymousClass1.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                if (!AdobeAIRWebView.this.mFirstLoad || str.equals(AdobeAIRWebView.DYNAMIC_URL_CLOUDFRONT)) {
                    return;
                }
                AdobeAIRWebView.this.mFirstLoad = false;
                ((Activity) AdobeAIRWebView.this.mCurrentContext).setRequestedOrientation(2);
                ((Activity) AdobeAIRWebView.this.mCurrentContext).setContentView(AdobeAIRWebView.this.mWebView);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                AdobeAIRWebView.this.mOffline = true;
                AdobeAIRWebView.this.mWebView.loadUrl(AdobeAIRWebView.STATIC_URL);
            }
        };
        WebView webView = new WebView(this.mCurrentContext);
        this.mWebView = webView;
        webView.setScrollBarStyle(0);
        this.mWebView.setWebViewClient(webViewClient);
        this.mWebView.getSettings().setJavaScriptEnabled(true);
        this.mWebView.getSettings().setBuiltInZoomControls(true);
        this.mWebView.getSettings().setDomStorageEnabled(true);
        this.mWebView.getSettings().setDatabaseEnabled(true);
        WebSettings settings = this.mWebView.getSettings();
        settings.setDatabasePath(this.mCurrentContext.getApplicationContext().getFilesDir().getPath() + "/databases/");
        WebView webView2 = new WebView(this.mCurrentContext);
        this.mAuxWebView = webView2;
        webView2.getSettings().setJavaScriptEnabled(true);
        this.mAuxWebView.getSettings().setDomStorageEnabled(true);
        this.mAuxWebView.getSettings().setDatabaseEnabled(true);
        WebSettings settings2 = this.mAuxWebView.getSettings();
        settings2.setDatabasePath(this.mCurrentContext.getApplicationContext().getFilesDir().getPath() + "/databases/");
        createAnalyticsWebView();
    }

    public void createAnalyticsWebView() {
        WebView webView = new WebView(this.mCurrentContext);
        this.mHiddenWebView = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.mHiddenWebView.getSettings().setDomStorageEnabled(true);
        this.mHiddenWebView.getSettings().setDatabaseEnabled(true);
        try {
            WebSettings settings = this.mHiddenWebView.getSettings();
            settings.setDatabasePath(this.mCurrentContext.getApplicationContext().getFilesDir().getPath() + "/databases/");
        } catch (Exception unused) {
        }
        this.mHiddenWebView.setWebViewClient(new WebViewClient() { // from class: com.adobe.air.AdobeAIRWebView.2
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                return false;
            }
        });
    }

    public void loadUrl(String str) {
        this.mWebView.loadUrl(str);
    }

    public void loadAnalyticsUrl(String str) {
        this.mHiddenWebView.loadUrl(str);
    }

    public boolean canGoBack() {
        return this.mWebView.canGoBack();
    }

    public void goBack() {
        this.mWebView.goBack();
    }

    public WebBackForwardList copyBackForwardList() {
        return this.mWebView.copyBackForwardList();
    }

    public String getUrl() {
        return this.mWebView.getUrl();
    }

    public boolean isOffline() {
        return this.mOffline;
    }

    public void setOffline(boolean z) {
        this.mOffline = z;
    }
}
