package com.distriqt.extension.androidx.constraintlayout;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class ConstraintlayoutExtension implements FREExtension {
    public static String ID = "androidx.constraintlayout";
    public static ConstraintlayoutContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        ConstraintlayoutContext constraintlayoutContext = new ConstraintlayoutContext();
        context = constraintlayoutContext;
        return constraintlayoutContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context = null;
    }
}
