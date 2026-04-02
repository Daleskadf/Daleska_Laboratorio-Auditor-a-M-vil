package com.distriqt.extension.playservices.base;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.distriqt.extension.playservices.base.functions.ImplementationFunction;
import com.distriqt.extension.playservices.base.functions.IsSupportedFunction;
import com.distriqt.extension.playservices.base.functions.VersionFunction;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class PlayServicesBaseContext extends FREContext {
    public boolean v = false;

    @Override // com.adobe.fre.FREContext
    public void dispose() {
    }

    @Override // com.adobe.fre.FREContext
    public Map<String, FREFunction> getFunctions() {
        HashMap hashMap = new HashMap();
        hashMap.put("isSupported", new IsSupportedFunction());
        hashMap.put("version", new VersionFunction());
        hashMap.put("implementation", new ImplementationFunction());
        return hashMap;
    }
}
