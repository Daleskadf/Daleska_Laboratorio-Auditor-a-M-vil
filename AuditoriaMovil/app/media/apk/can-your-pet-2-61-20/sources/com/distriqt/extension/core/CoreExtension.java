package com.distriqt.extension.core;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class CoreExtension implements FREExtension {
    public static String ID = "com.distriqt.Core";
    public static FREContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        CoreContext coreContext = new CoreContext();
        context = coreContext;
        return coreContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context = null;
    }
}
