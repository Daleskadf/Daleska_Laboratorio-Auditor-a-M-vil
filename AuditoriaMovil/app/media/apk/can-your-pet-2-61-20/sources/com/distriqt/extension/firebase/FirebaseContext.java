package com.distriqt.extension.firebase;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.firebase.controller.FirebaseController;
import com.distriqt.extension.firebase.functions.GetOptionsFunction;
import com.distriqt.extension.firebase.functions.ImplementationFunction;
import com.distriqt.extension.firebase.functions.InitialiseAppFunction;
import com.distriqt.extension.firebase.functions.IsSupportedFunction;
import com.distriqt.extension.firebase.functions.VersionFunction;
import com.distriqt.extension.firebase.functions.analytics.LogEventFunction;
import com.distriqt.extension.firebase.functions.analytics.SetAnalyticsCollectionEnabledFunction;
import com.distriqt.extension.firebase.functions.analytics.SetCurrentScreenFunction;
import com.distriqt.extension.firebase.functions.analytics.SetSessionTimeoutDurationFunction;
import com.distriqt.extension.firebase.functions.analytics.SetUserIDFunction;
import com.distriqt.extension.firebase.functions.analytics.SetUserPropertyFunction;
import com.distriqt.extension.firebase.functions.options.DeepLinkURLSchemeFunction;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class FirebaseContext extends FREContext implements IExtensionContext {
    public boolean v = true;
    private FirebaseController _controller = null;

    @Override // com.adobe.fre.FREContext
    public void dispose() {
        FirebaseController firebaseController = this._controller;
        if (firebaseController != null) {
            firebaseController.dispose();
            this._controller = null;
        }
    }

    @Override // com.adobe.fre.FREContext
    public Map<String, FREFunction> getFunctions() {
        HashMap hashMap = new HashMap();
        hashMap.put("isSupported", new IsSupportedFunction());
        hashMap.put("version", new VersionFunction());
        hashMap.put("implementation", new ImplementationFunction());
        hashMap.put("initialiseApp", new InitialiseAppFunction());
        hashMap.put("getOptions", new GetOptionsFunction());
        hashMap.put("options_deepLinkURLScheme", new DeepLinkURLSchemeFunction());
        hashMap.put("analytics_logEvent", new LogEventFunction());
        hashMap.put("analytics_setAnalyticsCollectionEnabled", new SetAnalyticsCollectionEnabledFunction());
        hashMap.put("analytics_setUserProperty", new SetUserPropertyFunction());
        hashMap.put("analytics_setUserID", new SetUserIDFunction());
        hashMap.put("analytics_setCurrentScreen", new SetCurrentScreenFunction());
        hashMap.put("analytics_setSessionTimeoutDuration", new SetSessionTimeoutDurationFunction());
        return hashMap;
    }

    public FirebaseController controller() {
        if (this._controller == null) {
            this._controller = new FirebaseController(this);
        }
        return this._controller;
    }

    @Override // com.distriqt.core.utils.IExtensionContext
    public void dispatchEvent(String str, String str2) {
        dispatchStatusEventAsync(str, str2);
    }
}
