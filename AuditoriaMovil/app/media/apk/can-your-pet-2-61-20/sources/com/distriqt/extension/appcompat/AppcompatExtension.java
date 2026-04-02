package com.distriqt.extension.appcompat;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class AppcompatExtension implements FREExtension {
    public static String ID = "androidx.appcompat";
    public static AppcompatContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        AppcompatContext appcompatContext = new AppcompatContext();
        context = appcompatContext;
        return appcompatContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context = null;
    }
}
