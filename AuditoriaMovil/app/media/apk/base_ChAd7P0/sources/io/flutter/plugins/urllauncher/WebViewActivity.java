package io.flutter.plugins.urllauncher;

import K0.n;
import U5.g;
import U5.i;
import X.d;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f12392e = 0;

    /* renamed from: c  reason: collision with root package name */
    public WebView f12395c;

    /* renamed from: a  reason: collision with root package name */
    public final n f12393a = new n(this, 2);

    /* renamed from: b  reason: collision with root package name */
    public final g f12394b = new WebViewClient();

    /* renamed from: d  reason: collision with root package name */
    public final IntentFilter f12396d = new IntentFilter("close action");

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Map<String, String> map;
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f12395c = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        Bundle bundleExtra = intent.getBundleExtra("com.android.browser.headers");
        if (bundleExtra == null) {
            map = Collections.emptyMap();
        } else {
            HashMap hashMap = new HashMap();
            for (String str : bundleExtra.keySet()) {
                hashMap.put(str, bundleExtra.getString(str));
            }
            map = hashMap;
        }
        this.f12395c.loadUrl(stringExtra, map);
        this.f12395c.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f12395c.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f12395c.setWebViewClient(this.f12394b);
        this.f12395c.getSettings().setSupportMultipleWindows(true);
        this.f12395c.setWebChromeClient(new i(this));
        d.registerReceiver(this, this.f12393a, this.f12396d, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f12393a);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 == 4 && this.f12395c.canGoBack()) {
            this.f12395c.goBack();
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }
}
