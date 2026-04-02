package com.distriqt.extension.androidx.vectordrawable;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class VectordrawableExtension implements FREExtension {
    public static String ID = "com.distriqt.VectorDrawable";
    public static VectordrawableContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        VectordrawableContext vectordrawableContext = new VectordrawableContext();
        context = vectordrawableContext;
        return vectordrawableContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context = null;
    }
}
