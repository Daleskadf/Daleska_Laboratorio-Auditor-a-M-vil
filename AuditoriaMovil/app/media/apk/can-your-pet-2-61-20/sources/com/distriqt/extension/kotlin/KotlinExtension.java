package com.distriqt.extension.kotlin;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class KotlinExtension implements FREExtension {
    public static String ID = "com.jetbrains.kotlin";
    public static KotlinContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        KotlinContext kotlinContext = new KotlinContext();
        context = kotlinContext;
        return kotlinContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context = null;
    }
}
