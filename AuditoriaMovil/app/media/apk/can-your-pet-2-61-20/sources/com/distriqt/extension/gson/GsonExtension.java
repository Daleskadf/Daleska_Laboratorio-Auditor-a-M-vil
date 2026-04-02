package com.distriqt.extension.gson;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class GsonExtension implements FREExtension {
    public static String ID = "com.google.code.gson";
    public static GsonContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        GsonContext gsonContext = new GsonContext();
        context = gsonContext;
        return gsonContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context = null;
    }
}
