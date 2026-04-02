package com.distriqt.extension.playservices.base;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class BaseExtension implements FREExtension {
    public static FREContext context;
    public static FREContext googleApiAvailabilityContext;
    public static FREContext providerInstallerContext;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        if ("ProviderInstaller".equals(str)) {
            return new ProviderInstallerContext();
        }
        if ("GoogleApiAvailability".equals(str)) {
            return new GoogleApiAvailabilityContext();
        }
        return new PlayServicesBaseContext();
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        FREContext fREContext = googleApiAvailabilityContext;
        if (fREContext != null) {
            fREContext.dispose();
            googleApiAvailabilityContext = null;
        }
        FREContext fREContext2 = providerInstallerContext;
        if (fREContext2 != null) {
            fREContext2.dispose();
            providerInstallerContext = null;
        }
        FREContext fREContext3 = context;
        if (fREContext3 != null) {
            fREContext3.dispose();
            context = null;
        }
    }
}
