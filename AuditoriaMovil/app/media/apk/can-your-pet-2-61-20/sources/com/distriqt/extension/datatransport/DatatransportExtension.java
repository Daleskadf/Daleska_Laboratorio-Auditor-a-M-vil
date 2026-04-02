package com.distriqt.extension.datatransport;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class DatatransportExtension implements FREExtension {
    public static String ID = "com.google.android.datatransport";
    public static DatatransportContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        DatatransportContext datatransportContext = new DatatransportContext();
        context = datatransportContext;
        return datatransportContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context = null;
    }
}
