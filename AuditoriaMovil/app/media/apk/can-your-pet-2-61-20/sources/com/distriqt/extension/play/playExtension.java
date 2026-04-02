package com.distriqt.extension.play;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class playExtension implements FREExtension {
    public static String ID = "com.google.android.play";
    public static playContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        playContext playcontext = new playContext();
        context = playcontext;
        return playcontext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context = null;
    }
}
