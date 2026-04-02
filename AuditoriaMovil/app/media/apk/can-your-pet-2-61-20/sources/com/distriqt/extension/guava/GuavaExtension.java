package com.distriqt.extension.guava;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class GuavaExtension implements FREExtension {
    public static String ID = "com.google.guava";
    public static GuavaContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        GuavaContext guavaContext = new GuavaContext();
        context = guavaContext;
        return guavaContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context = null;
    }
}
