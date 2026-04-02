package com.distriqt.extension.core;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.distriqt.extension.core.functions.ImplementationFunction;
import com.distriqt.extension.core.functions.IsSupportedFunction;
import com.distriqt.extension.core.functions.VersionFunction;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class CoreContext extends FREContext {
    public static String IMPLEMENTATION = "Android";
    public static String VERSION = "2.0";

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
