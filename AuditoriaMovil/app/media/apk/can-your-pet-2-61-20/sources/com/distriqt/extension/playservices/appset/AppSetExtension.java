package com.distriqt.extension.playservices.appset;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class AppSetExtension implements FREExtension {
    private static AppSetContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        AppSetContext appSetContext = new AppSetContext();
        context = appSetContext;
        return appSetContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context = null;
    }
}
