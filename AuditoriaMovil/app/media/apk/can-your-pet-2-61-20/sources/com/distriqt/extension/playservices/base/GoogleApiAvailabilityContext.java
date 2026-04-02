package com.distriqt.extension.playservices.base;

import android.content.Intent;
import android.content.res.Configuration;
import com.adobe.air.ActivityResultCallback;
import com.adobe.air.AndroidActivityWrapper;
import com.adobe.air.StateChangeCallback;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.distriqt.extension.playservices.base.events.GoogleApiAvailabilityEvent;
import com.distriqt.extension.playservices.base.functions.availability.AttemptResolutionFunction;
import com.distriqt.extension.playservices.base.functions.availability.GetErrorStringFunction;
import com.distriqt.extension.playservices.base.functions.availability.GetInstalledGooglePlayServicesVersionFunction;
import com.distriqt.extension.playservices.base.functions.availability.IsGooglePlayServicesAvailableFunction;
import com.distriqt.extension.playservices.base.functions.availability.IsUserRecoverableErrorFunction;
import com.distriqt.extension.playservices.base.functions.availability.ShowErrorDialogFunction;
import com.distriqt.extension.playservices.base.functions.availability.ShowErrorNotificationFunction;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class GoogleApiAvailabilityContext extends FREContext implements StateChangeCallback, ActivityResultCallback {
    private AndroidActivityWrapper _aaw;

    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
    public void onActivityStateChanged(AndroidActivityWrapper.ActivityState activityState) {
    }

    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
    public void onConfigurationChanged(Configuration configuration) {
    }

    public GoogleApiAvailabilityContext() {
        AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
        this._aaw = GetAndroidActivityWrapper;
        GetAndroidActivityWrapper.addActivityResultListener(this);
        this._aaw.addActivityStateChangeListner(this);
    }

    @Override // com.adobe.fre.FREContext
    public void dispose() {
        AndroidActivityWrapper androidActivityWrapper = this._aaw;
        if (androidActivityWrapper != null) {
            androidActivityWrapper.removeActivityResultListener(this);
            this._aaw.removeActivityStateChangeListner(this);
            this._aaw = null;
        }
    }

    @Override // com.adobe.fre.FREContext
    public Map<String, FREFunction> getFunctions() {
        HashMap hashMap = new HashMap();
        hashMap.put("getInstalledGooglePlayServicesVersion", new GetInstalledGooglePlayServicesVersionFunction());
        hashMap.put("isGooglePlayServicesAvailable", new IsGooglePlayServicesAvailableFunction());
        hashMap.put("isUserRecoverableError", new IsUserRecoverableErrorFunction());
        hashMap.put("showErrorDialog", new ShowErrorDialogFunction());
        hashMap.put("showErrorNotification", new ShowErrorNotificationFunction());
        hashMap.put("getErrorString", new GetErrorStringFunction());
        hashMap.put("attemptResolution", new AttemptResolutionFunction());
        return hashMap;
    }

    @Override // com.adobe.air.AndroidActivityWrapper.ActivityResultCallback
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 99550) {
            dispatchStatusEventAsync(GoogleApiAvailabilityEvent.ERROR_DIALOG_CLOSED, GoogleApiAvailabilityEvent.formatForEvent(i2));
        }
    }
}
