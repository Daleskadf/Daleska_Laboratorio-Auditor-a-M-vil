package com.distriqt.extension.playservices.ads;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class AdsExtension implements FREExtension {
    public static String ID = "com.distriqt.playservices.Ads";
    public static FREContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        AdsContext adsContext = new AdsContext();
        context = adsContext;
        return adsContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context = null;
    }
}
