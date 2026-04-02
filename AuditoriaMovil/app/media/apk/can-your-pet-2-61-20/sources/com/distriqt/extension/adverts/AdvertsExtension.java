package com.distriqt.extension.adverts;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class AdvertsExtension implements FREExtension {
    public static String ID = "com.distriqt.Adverts";
    public static AdvertsContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        AdvertsContext advertsContext = new AdvertsContext();
        context = advertsContext;
        return advertsContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context.dispose();
        context = null;
    }
}
