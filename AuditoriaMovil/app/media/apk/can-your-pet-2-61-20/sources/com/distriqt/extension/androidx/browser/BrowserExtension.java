package com.distriqt.extension.androidx.browser;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class BrowserExtension implements FREExtension {
    public static String ID = "androidx.browser";
    public static BrowserContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        BrowserContext browserContext = new BrowserContext();
        context = browserContext;
        return browserContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context = null;
    }
}
