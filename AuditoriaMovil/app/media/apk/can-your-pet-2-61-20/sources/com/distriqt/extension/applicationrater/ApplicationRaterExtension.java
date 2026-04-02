package com.distriqt.extension.applicationrater;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class ApplicationRaterExtension implements FREExtension {
    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        ApplicationRater.context = new ApplicationRaterContext();
        return ApplicationRater.context;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        ApplicationRater.context.dispose();
        ApplicationRater.context = null;
    }
}
