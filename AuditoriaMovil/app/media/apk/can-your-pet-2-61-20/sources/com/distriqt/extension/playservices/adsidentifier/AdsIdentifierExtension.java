package com.distriqt.extension.playservices.adsidentifier;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class AdsIdentifierExtension implements FREExtension {
    public static String ID = "com.distriqt.playservices.AdsIdentifier";
    public static AdsIdentifierContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        AdsIdentifierContext adsIdentifierContext = new AdsIdentifierContext();
        context = adsIdentifierContext;
        return adsIdentifierContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context = null;
    }
}
