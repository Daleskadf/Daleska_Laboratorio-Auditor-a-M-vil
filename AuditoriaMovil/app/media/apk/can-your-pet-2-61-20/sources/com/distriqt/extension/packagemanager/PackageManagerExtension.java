package com.distriqt.extension.packagemanager;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class PackageManagerExtension implements FREExtension {
    public static PackageManagerContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        PackageManagerContext packageManagerContext = new PackageManagerContext();
        context = packageManagerContext;
        return packageManagerContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context.dispose();
        context = null;
    }
}
