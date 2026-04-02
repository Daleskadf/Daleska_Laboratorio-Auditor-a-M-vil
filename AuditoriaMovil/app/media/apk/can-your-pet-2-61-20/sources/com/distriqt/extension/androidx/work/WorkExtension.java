package com.distriqt.extension.androidx.work;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class WorkExtension implements FREExtension {
    public static String ID = "androidx.work";
    public static WorkContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        WorkContext workContext = new WorkContext();
        context = workContext;
        return workContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context = null;
    }
}
