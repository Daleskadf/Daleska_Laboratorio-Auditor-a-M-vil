package com.distriqt.extension.playservices.base;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.distriqt.extension.playservices.base.functions.providerinstaller.InstallIfNeededFunction;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class ProviderInstallerContext extends FREContext {
    @Override // com.adobe.fre.FREContext
    public void dispose() {
    }

    @Override // com.adobe.fre.FREContext
    public Map<String, FREFunction> getFunctions() {
        HashMap hashMap = new HashMap();
        hashMap.put("installIfNeeded", new InstallIfNeededFunction());
        return hashMap;
    }
}
